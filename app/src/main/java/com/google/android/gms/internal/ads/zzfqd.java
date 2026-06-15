package com.google.android.gms.internal.ads;

import android.os.IBinder;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfqd extends zzfrg {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfqd(IBinder iBinder, String str, int i10, float f10, int i11, int i12, String str2, int i13, String str3, String str4, String str5, zzfqc zzfqcVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i13;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrg) {
            zzfrg zzfrgVar = (zzfrg) obj;
            if (this.zza.equals(zzfrgVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfrgVar.zzh()) : zzfrgVar.zzh() == null) && this.zzc == zzfrgVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfrgVar.zza())) {
                zzfrgVar.zzb();
                zzfrgVar.zzd();
                zzfrgVar.zzj();
                if (this.zze == zzfrgVar.zze()) {
                    zzfrgVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfrgVar.zzg()) : zzfrgVar.zzg() == null) {
                        zzfrgVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i10 = this.zze;
        String str2 = this.zzf;
        return ((((hashCode2 * 1525764945) ^ i10) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", appId=" + this.zzb + ", layoutGravity=" + this.zzc + ", layoutVerticalMargin=" + this.zzd + ", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=" + this.zze + ", deeplinkUrl=null, adFieldEnifd=" + this.zzf + ", thirdPartyAuthCallerId=null}";
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final String zzk() {
        return null;
    }
}
