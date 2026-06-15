package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgyl implements Iterator {
    private final ArrayDeque zza;
    private zzguy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgyl(zzgvc zzgvcVar, zzgym zzgymVar) {
        zzgvc zzgvcVar2;
        if (zzgvcVar instanceof zzgyn) {
            zzgyn zzgynVar = (zzgyn) zzgvcVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgynVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgynVar);
            zzgvcVar2 = zzgynVar.zzd;
            this.zzb = zzb(zzgvcVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzguy) zzgvcVar;
    }

    private final zzguy zzb(zzgvc zzgvcVar) {
        while (zzgvcVar instanceof zzgyn) {
            zzgyn zzgynVar = (zzgyn) zzgvcVar;
            this.zza.push(zzgynVar);
            zzgvcVar = zzgynVar.zzd;
        }
        return (zzguy) zzgvcVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzguy next() {
        zzguy zzguyVar;
        zzgvc zzgvcVar;
        zzguy zzguyVar2 = this.zzb;
        if (zzguyVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzguyVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgvcVar = ((zzgyn) this.zza.pop()).zze;
                zzguyVar = zzb(zzgvcVar);
            } while (zzguyVar.zzd() == 0);
            this.zzb = zzguyVar;
            return zzguyVar2;
        }
        throw new NoSuchElementException();
    }
}
