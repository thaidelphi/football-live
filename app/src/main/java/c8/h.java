package c8;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.i;
/* compiled from: ScarRewardedAdListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class h extends c8.b {

    /* renamed from: b  reason: collision with root package name */
    private final g f5592b;

    /* renamed from: c  reason: collision with root package name */
    private final i f5593c;

    /* renamed from: d  reason: collision with root package name */
    private final RewardedAdLoadCallback f5594d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final OnUserEarnedRewardListener f5595e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final FullScreenContentCallback f5596f = new c();

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a extends RewardedAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f5593c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            super.onAdLoaded((a) rewardedAd);
            h.this.f5593c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f5596f);
            h.this.f5592b.d(rewardedAd);
            u7.b bVar = h.this.f5577a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class b implements OnUserEarnedRewardListener {
        b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            h.this.f5593c.onUserEarnedReward();
        }
    }

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class c extends FullScreenContentCallback {
        c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f5593c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f5593c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f5593c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f5593c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f5593c.onAdOpened();
        }
    }

    public h(i iVar, g gVar) {
        this.f5593c = iVar;
        this.f5592b = gVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f5594d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f5595e;
    }
}
