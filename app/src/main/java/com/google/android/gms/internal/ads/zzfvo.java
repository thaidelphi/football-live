package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class zzfvo extends zzfvp {
    Object[] zza;
    int zzb;
    boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvo(int i10) {
        zzfus.zza(i10, "initialCapacity");
        this.zza = new Object[i10];
        this.zzb = 0;
    }

    private final void zzf(int i10) {
        int length = this.zza.length;
        int zze = zzfvp.zze(length, this.zzb + i10);
        if (zze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zze);
            this.zzc = false;
        }
    }

    public final zzfvo zza(Object obj) {
        Objects.requireNonNull(obj);
        zzf(1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public /* bridge */ /* synthetic */ zzfvp zzb(Object obj) {
        throw null;
    }

    public final zzfvp zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzfvq) {
                this.zzb = ((zzfvq) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(Object[] objArr, int i10) {
        zzfxf.zzb(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
