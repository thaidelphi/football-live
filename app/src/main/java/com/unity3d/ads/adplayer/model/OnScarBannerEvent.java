package com.unity3d.ads.adplayer.model;

import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.n;
/* compiled from: WebViewEvent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class OnScarBannerEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnScarBannerEvent(BannerBridge.BannerEvent bannerEvent) {
        n.f(bannerEvent, "bannerEvent");
        this.category = "BANNER";
        this.name = bannerEvent.name();
        this.parameters = new Object[0];
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
