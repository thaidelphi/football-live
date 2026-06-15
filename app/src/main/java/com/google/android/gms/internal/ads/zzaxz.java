package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzaxz extends com.google.android.gms.ads.internal.client.zzck {
    private final AppEventListener zza;

    public zzaxz(AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    public final AppEventListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
