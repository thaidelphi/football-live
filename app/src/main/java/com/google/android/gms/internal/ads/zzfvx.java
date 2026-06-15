package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfvx {
    Object[] zza;
    int zzb;
    zzfvw zzc;

    public zzfvx() {
        this(4);
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzfvp.zze(length, i11));
        }
    }

    public final zzfvx zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfus.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzfvx zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfvy zzc() {
        zzfvw zzfvwVar = this.zzc;
        if (zzfvwVar == null) {
            zzfxm zzj = zzfxm.zzj(this.zzb, this.zza, this);
            zzfvw zzfvwVar2 = this.zzc;
            if (zzfvwVar2 == null) {
                return zzj;
            }
            throw zzfvwVar2.zza();
        }
        throw zzfvwVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvx(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }
}
