package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgyt implements Iterator {
    final /* synthetic */ zzgyw zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgyt(zzgyw zzgywVar, zzgyv zzgyvVar) {
        this.zza = zzgywVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        Map map;
        int i11 = this.zzb + 1;
        zzgyw zzgywVar = this.zza;
        i10 = zzgywVar.zzb;
        if (i11 >= i10) {
            map = zzgywVar.zzc;
            return !map.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10;
        Object[] objArr;
        this.zzc = true;
        int i11 = this.zzb + 1;
        this.zzb = i11;
        zzgyw zzgywVar = this.zza;
        i10 = zzgywVar.zzb;
        if (i11 < i10) {
            objArr = zzgywVar.zza;
            return (zzgys) objArr[i11];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzo();
            int i11 = this.zzb;
            zzgyw zzgywVar = this.zza;
            i10 = zzgywVar.zzb;
            if (i11 < i10) {
                this.zzb = i11 - 1;
                zzgywVar.zzm(i11);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
