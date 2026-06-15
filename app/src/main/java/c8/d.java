package c8;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
/* compiled from: ScarBannerAdListener.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class d extends b {

    /* renamed from: b  reason: collision with root package name */
    private final com.unity3d.scar.adapter.common.g f5582b;

    /* renamed from: c  reason: collision with root package name */
    private final c f5583c;

    /* renamed from: d  reason: collision with root package name */
    private final AdListener f5584d = new a();

    /* compiled from: ScarBannerAdListener.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    class a extends AdListener {
        a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f5582b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f5582b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f5583c.e();
            d.this.f5582b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f5582b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f5582b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f5582b.onAdOpened();
        }
    }

    public d(com.unity3d.scar.adapter.common.g gVar, c cVar) {
        this.f5582b = gVar;
        this.f5583c = cVar;
    }

    public AdListener d() {
        return this.f5584d;
    }
}
