package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdzi extends zzdzm {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzi(String str, String str2, Drawable drawable) {
        this.zza = str;
        Objects.requireNonNull(str2, "Null imageUrl");
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdzm) {
            zzdzm zzdzmVar = (zzdzm) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzdzmVar.zzb()) : zzdzmVar.zzb() == null) {
                if (this.zzb.equals(zzdzmVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzdzmVar.zza()) : zzdzmVar.zza() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (hashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + valueOf + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdzm
    public final Drawable zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdzm
    public final String zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdzm
    public final String zzc() {
        return this.zzb;
    }
}
