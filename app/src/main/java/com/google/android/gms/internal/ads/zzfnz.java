package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfnz extends zzfog {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfnz(String str, boolean z10, int i10, zzfnv zzfnvVar, zzfnw zzfnwVar, int i11, zzfny zzfnyVar) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfog) {
            zzfog zzfogVar = (zzfog) obj;
            if (this.zzb.equals(zzfogVar.zzc())) {
                zzfogVar.zzd();
                int i10 = this.zzc;
                int zze = zzfogVar.zze();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == zze) {
                    zzfogVar.zza();
                    zzfogVar.zzb();
                    int i11 = this.zzd;
                    int zzf = zzfogVar.zzf();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i10 = this.zzc;
        if (i10 != 0) {
            int i11 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i10;
            if (this.zzd != 0) {
                return (i11 * 583896283) ^ 1;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.zzc;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        return "FileComplianceOptions{fileOwner=" + str3 + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfog
    public final zzfnv zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfog
    public final zzfnw zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfog
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfog
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfog
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfog
    public final int zzf() {
        return this.zzd;
    }
}
