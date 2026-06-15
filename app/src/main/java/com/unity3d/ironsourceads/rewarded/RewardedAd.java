package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mq;
import com.ironsource.nq;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class RewardedAd implements nq {

    /* renamed from: a  reason: collision with root package name */
    private final mq f23741a;

    /* renamed from: b  reason: collision with root package name */
    private RewardedAdListener f23742b;

    public RewardedAd(mq rewardedAdInternal) {
        n.f(rewardedAdInternal, "rewardedAdInternal");
        this.f23741a = rewardedAdInternal;
        rewardedAdInternal.a(this);
    }

    public final RewardedAdInfo getAdInfo() {
        return this.f23741a.b();
    }

    public final RewardedAdListener getListener() {
        return this.f23742b;
    }

    public final boolean isReadyToShow() {
        return this.f23741a.d();
    }

    @Override // com.ironsource.nq
    public void onAdInstanceDidBecomeVisible() {
        RewardedAdListener rewardedAdListener = this.f23742b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.nq
    public void onRewardedAdClicked() {
        RewardedAdListener rewardedAdListener = this.f23742b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.nq
    public void onRewardedAdDismissed() {
        RewardedAdListener rewardedAdListener = this.f23742b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.nq
    public void onRewardedAdFailedToShow(IronSourceError error) {
        n.f(error, "error");
        RewardedAdListener rewardedAdListener = this.f23742b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.nq
    public void onRewardedAdShown() {
        RewardedAdListener rewardedAdListener = this.f23742b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.nq
    public void onUserEarnedReward() {
        RewardedAdListener rewardedAdListener = this.f23742b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(RewardedAdListener rewardedAdListener) {
        this.f23742b = rewardedAdListener;
    }

    public final void show(Activity activity) {
        n.f(activity, "activity");
        this.f23741a.a(activity);
    }
}
