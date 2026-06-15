package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfqg extends zzfri {
    private final int zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfqg(int i10, String str, zzfqf zzfqfVar) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfri) {
            zzfri zzfriVar = (zzfri) obj;
            if (this.zza == zzfriVar.zza() && ((str = this.zzb) != null ? str.equals(zzfriVar.zzb()) : zzfriVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfri
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfri
    public final String zzb() {
        return this.zzb;
    }
}
