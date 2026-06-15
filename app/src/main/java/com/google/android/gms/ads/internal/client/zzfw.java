package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzfw extends zzec {

    /* renamed from: a  reason: collision with root package name */
    private final VideoController.VideoLifecycleCallbacks f11294a;

    public zzfw(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f11294a = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        this.f11294a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf(boolean z10) {
        this.f11294a.onVideoMute(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg() {
        this.f11294a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() {
        this.f11294a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzi() {
        this.f11294a.onVideoStart();
    }
}
