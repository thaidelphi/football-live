package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.kT  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1928kT extends C4S {
    public static String[] A02 = {"mOKLXDYLG6rjJ8Uhc3dA94WggTy9aTCY", "BGa58WlKg30brm3iaXDpmKRreNqQx6sP", "OEIW0kNKyti99uOllTeGQwyl2xTRs9Rh", "66ZfANP52P8mfwFN1T5txUDlKbhE7PV5", "bDC5rvyouDOgyvzMPOhXiUUV9GXsFm8X", "OYxAj3HMhtWdnmP8KTtjhXT1I6nqQa9s", "h9E4hr1XPZf2wtmTKQKy9uKgM46lwlc6", "41TCzlsMJFbrsVbgrjJGy8KkwVmNtDJ0"};
    public List<NativeAd> A00 = new ArrayList();
    public final /* synthetic */ C05786z A01;

    public C1928kT(C05786z c05786z) {
        this.A01 = c05786z;
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final int A01() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final int A02(Object obj) {
        int index = this.A00.indexOf(obj);
        if (index >= 0) {
            return index;
        }
        return -2;
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final Object A04(ViewGroup viewGroup, int i10) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdView.Type type;
        C1900k1 c1900k1;
        NativeAdViewAttributes nativeAdViewAttributes;
        View adView;
        C1900k1 c1900k12;
        NativeAdView.Type type2;
        NativeAdViewAttributes nativeAdViewAttributes2;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        adViewProvider = this.A01.A01;
        if (adViewProvider != null) {
            adViewProvider2 = this.A01.A01;
            adView = adViewProvider2.createView(this.A00.get(i10), i10);
        } else {
            type = this.A01.A02;
            if (type != null) {
                c1900k12 = this.A01.A06;
                type2 = this.A01.A02;
                nativeAdViewAttributes2 = this.A01.A03;
                adView = NativeAdView.render(c1900k12, this.A00.get(i10), type2, nativeAdViewAttributes2);
            } else {
                c1900k1 = this.A01.A06;
                nativeAdViewAttributes = this.A01.A03;
                adView = NativeAdView.render(c1900k1, this.A00.get(i10), nativeAdViewAttributes);
            }
        }
        viewGroup.addView(adView);
        return adView;
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final void A07(ViewGroup viewGroup, int i10, Object obj) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        if (i10 < this.A00.size()) {
            C05786z c05786z = this.A01;
            if (A02[4].charAt(30) == 'x') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "v77RhDbNLQhSOdbZwI5GIdcCxuAqz5PX";
            strArr[7] = "TxIZGVGrDJLkO7AUrnSGEi4CFfNom122";
            adViewProvider = c05786z.A01;
            if (adViewProvider != null) {
                adViewProvider2 = this.A01.A01;
                adViewProvider2.destroyView(this.A00.get(i10), (View) obj);
            } else {
                this.A00.get(i10).unregisterView();
            }
        }
        viewGroup.removeView((View) obj);
    }

    @Override // com.facebook.ads.redexgen.X.C4S
    public final boolean A08(View view, Object obj) {
        return view == obj;
    }

    public final void A09() {
        int i10;
        NativeAdsManager nativeAdsManager;
        NativeAdsManager nativeAdsManager2;
        this.A00.clear();
        i10 = this.A01.A00;
        nativeAdsManager = this.A01.A04;
        int min = Math.min(i10, nativeAdsManager.getUniqueNativeAdCount());
        for (int i11 = 0; i11 < min; i11++) {
            nativeAdsManager2 = this.A01.A04;
            NativeAd ad = nativeAdsManager2.nextNativeAd();
            C1816ie.A0L(ad.getInternalNativeAd()).A1d(true);
            this.A00.add(ad);
        }
        A05();
    }
}
