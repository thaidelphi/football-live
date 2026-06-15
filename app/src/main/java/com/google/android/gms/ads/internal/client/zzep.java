package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzep extends zzcd {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PreloadCallback f11262a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzeu f11263b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzeu zzeuVar, PreloadCallback preloadCallback) {
        this.f11262a = preloadCallback;
        this.f11263b = zzeuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzfq zzfqVar) {
        PreloadConfiguration g10 = zzeu.g(this.f11263b, zzfqVar);
        if (g10 != null) {
            this.f11262a.onAdsAvailable(g10);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzfq zzfqVar) {
        PreloadConfiguration g10 = zzeu.g(this.f11263b, zzfqVar);
        if (g10 != null) {
            this.f11262a.onAdsExhausted(g10);
        }
    }
}
