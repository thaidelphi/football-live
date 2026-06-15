package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class qq implements t0<RewardedAd> {

    /* renamed from: a  reason: collision with root package name */
    private final uu f19898a;

    /* renamed from: b  reason: collision with root package name */
    private final RewardedAdLoaderListener f19899b;

    public qq(uu threadManager, RewardedAdLoaderListener publisherListener) {
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(publisherListener, "publisherListener");
        this.f19898a = threadManager;
        this.f19899b = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qq this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        this$0.f19899b.onRewardedAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qq this$0, RewardedAd adObject) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adObject, "$adObject");
        this$0.f19899b.onRewardedAdLoaded(adObject);
    }

    @Override // com.ironsource.t0
    public void a(final RewardedAd adObject) {
        kotlin.jvm.internal.n.f(adObject, "adObject");
        this.f19898a.a(new Runnable() { // from class: com.ironsource.u00
            @Override // java.lang.Runnable
            public final void run() {
                qq.a(qq.this, adObject);
            }
        });
    }

    @Override // com.ironsource.t0
    public void onAdLoadFailed(final IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        this.f19898a.a(new Runnable() { // from class: com.ironsource.t00
            @Override // java.lang.Runnable
            public final void run() {
                qq.a(qq.this, error);
            }
        });
    }
}
