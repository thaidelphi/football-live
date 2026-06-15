package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzafh implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafh(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    public static zzafh zzb(zzdx zzdxVar) {
        int zzg = zzdxVar.zzg();
        String zze = zzay.zze(zzdxVar.zzB(zzdxVar.zzg(), StandardCharsets.US_ASCII));
        String zzB = zzdxVar.zzB(zzdxVar.zzg(), StandardCharsets.UTF_8);
        int zzg2 = zzdxVar.zzg();
        int zzg3 = zzdxVar.zzg();
        int zzg4 = zzdxVar.zzg();
        int zzg5 = zzdxVar.zzg();
        int zzg6 = zzdxVar.zzg();
        byte[] bArr = new byte[zzg6];
        zzdxVar.zzH(bArr, 0, zzg6);
        return new zzafh(zzg, zze, zzB, zzg2, zzg3, zzg4, zzg5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafh.class == obj.getClass()) {
            zzafh zzafhVar = (zzafh) obj;
            if (this.zza == zzafhVar.zza && this.zzb.equals(zzafhVar.zzb) && this.zzc.equals(zzafhVar.zzc) && this.zzd == zzafhVar.zzd && this.zze == zzafhVar.zze && this.zzf == zzafhVar.zzf && this.zzg == zzafhVar.zzg && Arrays.equals(this.zzh, zzafhVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        zzarVar.zza(this.zzh, this.zza);
    }
}
