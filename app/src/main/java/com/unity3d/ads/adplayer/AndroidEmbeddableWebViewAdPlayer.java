package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import androidx.core.view.a0;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import d9.k;
import d9.o0;
import d9.p0;
import g9.e;
import g9.g;
import g9.g0;
import i8.w;
import java.util.Map;
import kotlin.jvm.internal.n;
import m8.d;
/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager) {
        n.f(webViewAdPlayer, "webViewAdPlayer");
        n.f(opportunityId, "opportunityId");
        n.f(webViewContainer, "webViewContainer");
        n.f(openMeasurementRepository, "openMeasurementRepository");
        n.f(scarManager, "scarManager");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[RETURN] */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(m8.d<? super i8.w> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = n8.b.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            i8.p.b(r9)
            goto L86
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            i8.p.b(r9)
            goto L7a
        L3f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            i8.p.b(r9)
            goto L6b
        L47:
            i8.p.b(r9)
            com.unity3d.ads.adplayer.WebViewAdPlayer r9 = r8.webViewAdPlayer
            r9.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r8.openMeasurementRepository
            java.lang.String r2 = r8.opportunityId
            com.google.protobuf.ByteString r2 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r2)
            boolean r9 = r9.hasSessionFinished(r2)
            if (r9 == 0) goto L6a
            r6 = 1000(0x3e8, double:4.94E-321)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = d9.z0.a(r6, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            r2 = r8
        L6b:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L7a
            return r1
        L7a:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            i8.w r9 = i8.w.f26638a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(m8.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<ScarEvent> getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public o0 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public e<i8.n<byte[], Integer>> getUpdateCampaignState() {
        return this.webViewAdPlayer.getUpdateCampaignState();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, d<? super w> dVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, d<? super w> dVar) {
        return this.webViewAdPlayer.requestShow(map, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(d<? super w> dVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendFocusChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(c cVar, d<? super w> dVar) {
        return this.webViewAdPlayer.sendGmaEvent(cVar, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendMuteChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, d<? super w> dVar) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, d<? super w> dVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, d<? super w> dVar) {
        return this.webViewAdPlayer.sendVolumeChange(d10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final ShowOptions showOptions) {
        n.f(showOptions, "showOptions");
        if (showOptions instanceof AndroidShowOptions) {
            AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
            Activity activity = androidShowOptions.getActivity().get();
            if (activity != null) {
                final BannerView bannerView = BannerViewCache.getInstance().getBannerView(this.opportunityId);
                if (bannerView != null) {
                    if (!androidShowOptions.isScarAd()) {
                        k.d(p0.b(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2(this, activity, bannerView, null), 3, null);
                        final WebView webView = getWebViewContainer().getWebView();
                        if (a0.T(webView)) {
                            k.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                            if (!a0.T(webView)) {
                                k.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                            } else {
                                webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(webView, this));
                            }
                        } else {
                            webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2
                                @Override // android.view.View.OnAttachStateChangeListener
                                public void onViewAttachedToWindow(View view) {
                                    n.f(view, "view");
                                    webView.removeOnAttachStateChangeListener(this);
                                    k.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                                    if (!a0.T(view)) {
                                        k.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                                    } else {
                                        view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(view, this));
                                    }
                                }

                                @Override // android.view.View.OnAttachStateChangeListener
                                public void onViewDetachedFromWindow(View view) {
                                    n.f(view, "view");
                                }
                            });
                        }
                        k.d(p0.b(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$4(bannerView, this, null), 3, null);
                        return;
                    }
                    String placementId = androidShowOptions.getPlacementId();
                    String str = placementId == null ? "" : placementId;
                    String scarQueryId = androidShowOptions.getScarQueryId();
                    String str2 = scarQueryId == null ? "" : scarQueryId;
                    String scarAdUnitId = androidShowOptions.getScarAdUnitId();
                    String str3 = scarAdUnitId == null ? "" : scarAdUnitId;
                    String scarAdString = androidShowOptions.getScarAdString();
                    u7.c cVar = new u7.c(str, str2, str3, scarAdString == null ? "" : scarAdString, 0);
                    ScarManager scarManager = this.scarManager;
                    UnityBannerSize size = bannerView.getSize();
                    n.e(size, "bannerView.size");
                    final g9.a0 C = g.C(scarManager.loadBannerAd(activity, bannerView, cVar, size, this.opportunityId), getScope(), g0.f25891a.a(), 10);
                    if (a0.T(bannerView)) {
                        k.d(getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, C, showOptions, null), 3, null);
                        if (!a0.T(bannerView)) {
                            k.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
                            return;
                        } else {
                            bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView, this));
                            return;
                        }
                    }
                    bannerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            n.f(view, "view");
                            bannerView.removeOnAttachStateChangeListener(this);
                            k.d(this.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, C, showOptions, null), 3, null);
                            BannerView bannerView2 = bannerView;
                            if (!a0.T(bannerView2)) {
                                k.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
                            } else {
                                bannerView2.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView2, this));
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            n.f(view, "view");
                        }
                    });
                    return;
                }
                throw new IllegalStateException(("BannerView not found for opportunityId: " + this.opportunityId).toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
