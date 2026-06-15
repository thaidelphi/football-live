package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge;
import d9.o0;
import d9.p0;
import g9.c0;
import g9.e;
import g9.v;
import i8.m;
import i8.w;
import java.util.Map;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    /* compiled from: AdPlayer.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Companion {
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final v<String> broadcastEventChannel = c0.b(0, 0, null, 7, null);

        private Companion() {
        }

        public final v<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: AdPlayer.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, d<? super w> dVar) {
            p0.d(adPlayer.getScope(), null, 1, null);
            return w.f26638a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            n.f(showOptions, "showOptions");
            throw new m(null, 1, null);
        }
    }

    Object destroy(d<? super w> dVar);

    void dispatchShowCompleted();

    e<LoadEvent> getOnLoadEvent();

    e<ScarEvent> getOnScarEvent();

    e<ShowEvent> getOnShowEvent();

    o0 getScope();

    e<i8.n<byte[], Integer>> getUpdateCampaignState();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, d<? super w> dVar);

    Object onBroadcastEvent(String str, d<? super w> dVar);

    Object requestShow(Map<String, ? extends Object> map, d<? super w> dVar);

    Object sendActivityDestroyed(d<? super w> dVar);

    Object sendFocusChange(boolean z10, d<? super w> dVar);

    Object sendGmaEvent(c cVar, d<? super w> dVar);

    Object sendMuteChange(boolean z10, d<? super w> dVar);

    Object sendPrivacyFsmChange(byte[] bArr, d<? super w> dVar);

    Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, d<? super w> dVar);

    Object sendUserConsentChange(byte[] bArr, d<? super w> dVar);

    Object sendVisibilityChange(boolean z10, d<? super w> dVar);

    Object sendVolumeChange(double d10, d<? super w> dVar);

    void show(ShowOptions showOptions);
}
