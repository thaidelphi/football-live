package com.appnext.banners;

import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerSize {
    public static final BannerSize BANNER = new BannerSize(320, 50, "BANNER");
    public static final BannerSize LARGE_BANNER = new BannerSize(320, 100, "LARGE_BANNER");
    public static final BannerSize MEDIUM_RECTANGLE = new BannerSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, l.f18876g);
    private int bG;
    private int bH;
    private String bI;

    private BannerSize(int i10, int i11, String str) {
        this.bG = i10;
        this.bH = i11;
        this.bI = str;
    }

    public final int L() {
        return this.bG;
    }

    public final int M() {
        return this.bH;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerSize) {
            BannerSize bannerSize = (BannerSize) obj;
            return this.bG == bannerSize.bG && this.bH == bannerSize.bH && this.bI.equals(bannerSize.bI);
        }
        return false;
    }

    public String toString() {
        return this.bI;
    }
}
