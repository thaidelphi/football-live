package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e7 implements t0<BannerAdView> {

    /* renamed from: a  reason: collision with root package name */
    private final uu f17197a;

    /* renamed from: b  reason: collision with root package name */
    private final BannerAdLoaderListener f17198b;

    public e7(uu threadManager, BannerAdLoaderListener publisherListener) {
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        this.f17197a = threadManager;
        this.f17198b = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e7 this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f17198b.onBannerAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(e7 this$0, BannerAdView adObject) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adObject, "$adObject");
        this$0.f17198b.onBannerAdLoaded(adObject);
    }

    @Override // com.ironsource.t0
    public void a(final BannerAdView adObject) {
        kotlin.jvm.internal.n.f(adObject, "adObject");
        this.f17197a.a(new Runnable() { // from class: com.ironsource.vx
            @Override // java.lang.Runnable
            public final void run() {
                e7.a(e7.this, adObject);
            }
        });
    }

    @Override // com.ironsource.t0
    public void onAdLoadFailed(final IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f17197a.a(new Runnable() { // from class: com.ironsource.ux
            @Override // java.lang.Runnable
            public final void run() {
                e7.a(e7.this, error);
            }
        });
    }
}
