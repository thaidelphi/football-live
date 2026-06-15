package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfvz extends zzfvo {
    Object[] zzd;
    private int zze;

    public zzfvz() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo, com.google.android.gms.internal.ads.zzfvp
    public final /* bridge */ /* synthetic */ zzfvp zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfvz zzf(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int zzh = zzfwa.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfvn.zza(hashCode);
                while (true) {
                    int i10 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza = i10 + 1;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfvz zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                zzf(objArr[i10]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    public final zzfvz zzh(Iterable iterable) {
        Objects.requireNonNull(iterable);
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zzf(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfwa zzi() {
        zzfwa zzv;
        boolean zzw;
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.zzd != null && zzfwa.zzh(i10) == this.zzd.length) {
                    int i11 = this.zzb;
                    Object[] objArr = this.zza;
                    zzw = zzfwa.zzw(i11, objArr.length);
                    if (zzw) {
                        objArr = Arrays.copyOf(objArr, i11);
                    }
                    int i12 = this.zze;
                    Object[] objArr2 = this.zzd;
                    zzv = new zzfxn(objArr, i12, objArr2, objArr2.length - 1, this.zzb);
                } else {
                    zzv = zzfwa.zzv(this.zzb, this.zza);
                    this.zzb = zzv.size();
                }
                this.zzc = true;
                this.zzd = null;
                return zzv;
            }
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzfxy(obj);
        }
        return zzfxn.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvz(int i10, boolean z10) {
        super(i10);
        this.zzd = new Object[zzfwa.zzh(i10)];
    }
}
