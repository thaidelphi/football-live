package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class WebViewAdPlayer$sendScarBannerEvent$2 extends o implements t8.a<WebViewEvent> {
    final /* synthetic */ BannerBridge.BannerEvent $event;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$sendScarBannerEvent$2(BannerBridge.BannerEvent bannerEvent) {
        super(0);
        this.$event = bannerEvent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // t8.a
    public final WebViewEvent invoke() {
        return new OnScarBannerEvent(this.$event);
    }
}
