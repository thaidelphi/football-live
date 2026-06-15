package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class zzfuz implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzfve zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfuz(zzfve zzfveVar, zzfvd zzfvdVar) {
        int i10;
        this.zze = zzfveVar;
        i10 = zzfveVar.zzf;
        this.zzb = i10;
        this.zzc = zzfveVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i10;
        i10 = this.zze.zzf;
        if (i10 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i10 = this.zzc;
            this.zzd = i10;
            Object zza = zza(i10);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfsv.zzm(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzfve zzfveVar = this.zze;
        zzfveVar.remove(zzfve.zzg(zzfveVar, i10));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i10);
}
