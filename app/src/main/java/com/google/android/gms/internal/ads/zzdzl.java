package com.google.android.gms.internal.ads;

import android.app.Activity;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdzl extends zzeah {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final String zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzdzk zzdzkVar) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeah) {
            zzeah zzeahVar = (zzeah) obj;
            if (this.zza.equals(zzeahVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzeahVar.zzb()) : zzeahVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeahVar.zzc()) : zzeahVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeahVar.zzd()) : zzeahVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        String obj = this.zza.toString();
        String valueOf = String.valueOf(zzmVar);
        return "OfflineUtilsParams{activity=" + obj + ", adOverlay=" + valueOf + ", gwsQueryId=" + this.zzc + ", uri=" + this.zzd + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzeah
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeah
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeah
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeah
    public final String zzd() {
        return this.zzd;
    }
}
