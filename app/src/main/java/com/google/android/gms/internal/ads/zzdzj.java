package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdzj extends zzeag {
    private Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzeag
    public final zzeag zza(Activity activity) {
        Objects.requireNonNull(activity, "Null activity");
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeag
    public final zzeag zzb(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzb = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeag
    public final zzeag zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeag
    public final zzeag zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeag
    public final zzeah zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzdzl(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
