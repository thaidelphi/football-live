package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbo {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzz[] zzd;
    private int zze;

    static {
        int i10 = zzeh.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbo(String str, zzz... zzzVarArr) {
        int length = zzzVarArr.length;
        int i10 = 1;
        zzcv.zzd(length > 0);
        this.zzb = str;
        this.zzd = zzzVarArr;
        this.zza = length;
        int zzb = zzay.zzb(zzzVarArr[0].zzo);
        this.zzc = zzb == -1 ? zzay.zzb(zzzVarArr[0].zzn) : zzb;
        String zzc = zzc(zzzVarArr[0].zzd);
        int i11 = zzzVarArr[0].zzf | 16384;
        while (true) {
            zzz[] zzzVarArr2 = this.zzd;
            if (i10 >= zzzVarArr2.length) {
                return;
            }
            if (!zzc.equals(zzc(zzzVarArr2[i10].zzd))) {
                zzz[] zzzVarArr3 = this.zzd;
                zzd("languages", zzzVarArr3[0].zzd, zzzVarArr3[i10].zzd, i10);
                return;
            }
            zzz[] zzzVarArr4 = this.zzd;
            if (i11 != (zzzVarArr4[i10].zzf | 16384)) {
                zzd("role flags", Integer.toBinaryString(zzzVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i10].zzf), i10);
                return;
            }
            i10++;
        }
    }

    private static String zzc(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zzd(String str, String str2, String str3, int i10) {
        zzdn.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbo.class == obj.getClass()) {
            zzbo zzboVar = (zzbo) obj;
            if (this.zzb.equals(zzboVar.zzb) && Arrays.equals(this.zzd, zzboVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode = ((this.zzb.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzd);
            this.zze = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzz zzzVar) {
        int i10 = 0;
        while (true) {
            zzz[] zzzVarArr = this.zzd;
            if (i10 >= zzzVarArr.length) {
                return -1;
            }
            if (zzzVar == zzzVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final zzz zzb(int i10) {
        return this.zzd[i10];
    }
}
