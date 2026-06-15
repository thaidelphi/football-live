package com.appnext.nativeads.designed_native_ads.views.a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.appnext.core.l;
import com.appnext.nativeads.R;
import com.appnext.nativeads.designed_native_ads.AppnextDesignedNativeAdData;
import com.appnext.nativeads.designed_native_ads.DesignNativeAd;
import com.appnext.nativeads.designed_native_ads.views.DesignedNativeAdViewContainer;
import com.appnext.nativeads.designed_native_ads.views.b;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b extends a {
    private static int gx = 5;

    public b(Context context) {
        this(context, null, 0);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a.a
    protected final void a(boolean z10) {
        int i10 = z10 ? 0 : 4;
        try {
            findViewById(R.id.title1).setVisibility(i10);
            findViewById(R.id.title2).setVisibility(i10);
            findViewById(R.id.title3).setVisibility(i10);
            findViewById(R.id.title4).setVisibility(i10);
            findViewById(R.id.title5).setVisibility(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("SuggestedAppsView$presentTitles", th);
        }
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a.a
    protected final void f(List<DesignNativeAd> list) {
        int i10;
        int i11;
        int i12;
        int i13;
        try {
            int min = Math.min(gx, list.size());
            for (int i14 = 1; i14 <= min; i14++) {
                if (i14 == 1) {
                    i11 = R.id.image1;
                    i12 = R.id.title1;
                    i13 = R.id.native_ad_view1;
                } else if (i14 == 2) {
                    i11 = R.id.image2;
                    i12 = R.id.title2;
                    i13 = R.id.native_ad_view2;
                } else if (i14 == 3) {
                    i11 = R.id.image3;
                    i12 = R.id.title3;
                    i13 = R.id.native_ad_view3;
                } else if (i14 == 4) {
                    i11 = R.id.image4;
                    i12 = R.id.title4;
                    i13 = R.id.native_ad_view4;
                } else if (i14 == 5) {
                    i11 = R.id.image5;
                    i12 = R.id.title5;
                    i13 = R.id.native_ad_view5;
                }
                final DesignNativeAd designNativeAd = list.get(i14 - 1);
                l.aa().a(getContext(), (ImageView) findViewById(i11), designNativeAd.getIconUrl(), 16, null);
                ((TextView) findViewById(i12)).setText(designNativeAd.getAdTitle());
                DesignedNativeAdViewContainer designedNativeAdViewContainer = (DesignedNativeAdViewContainer) findViewById(i13);
                designedNativeAdViewContainer.register(new b.a() { // from class: com.appnext.nativeads.designed_native_ads.views.a.a.2
                    @Override // com.appnext.nativeads.designed_native_ads.views.b.a
                    public final void f(int i15) {
                        try {
                            this.gn.b(designNativeAd, i15);
                            this.gn.a(designNativeAd, i15);
                        } catch (Throwable th) {
                            com.appnext.base.a.a("DesignedNativeAdView$register", th);
                        }
                    }
                });
                designedNativeAdViewContainer.setOnClickListener(new View.OnClickListener() { // from class: com.appnext.nativeads.designed_native_ads.views.a.a.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        try {
                            if (this.gs != null) {
                                this.gs.onAdClicked(new AppnextDesignedNativeAdData(designNativeAd.getAdPackage(), designNativeAd.getAdTitle(), System.currentTimeMillis()));
                            }
                            this.gn.a(designNativeAd);
                        } catch (Throwable th) {
                            com.appnext.base.a.a("DesignedNativeAdView$register", th);
                        }
                    }
                });
            }
            for (int i15 = min + 1; i15 <= gx; i15++) {
                if (i15 == 1) {
                    i10 = R.id.fl1container;
                } else if (i15 == 2) {
                    i10 = R.id.fl2container;
                } else if (i15 == 3) {
                    i10 = R.id.fl3container;
                } else if (i15 == 4) {
                    i10 = R.id.fl4container;
                } else if (i15 == 5) {
                    i10 = R.id.fl5container;
                }
                findViewById(i10).setVisibility(8);
            }
            ((LinearLayout) findViewById(R.id.apps_container)).setWeightSum(min);
        } catch (Throwable th) {
            com.appnext.base.a.a("SuggestedAppsView$onAdsLoaded", th);
        }
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a.a
    protected final int getContentResource() {
        return R.layout.suggested_apps_view_layout;
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a.a
    protected final void setIconTitleTextColor(int i10) {
        try {
            ((TextView) findViewById(R.id.title1)).setTextColor(i10);
            ((TextView) findViewById(R.id.title2)).setTextColor(i10);
            ((TextView) findViewById(R.id.title3)).setTextColor(i10);
            ((TextView) findViewById(R.id.title4)).setTextColor(i10);
            ((TextView) findViewById(R.id.title5)).setTextColor(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("SuggestedAppsView$setIconTitleTextColor", th);
        }
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a.a
    protected final void setTitleText(String str) {
        ((TextView) findViewById(R.id.suggested_apps_title)).setText(str);
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a.a
    protected final void setTitleTextColorForAdUnit(int i10) {
        try {
            ((TextView) findViewById(R.id.suggested_apps_title)).setTextColor(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("SuggestedAppsView$setTitleTextColorForAdUnit", th);
        }
    }

    @Override // com.appnext.nativeads.designed_native_ads.views.a.a
    protected final void setTitleTextSize(float f10) {
        try {
            ((TextView) findViewById(R.id.suggested_apps_title)).setTextSize(0, f10);
        } catch (Throwable th) {
            com.appnext.base.a.a("SuggestedAppsView$setTitleTextSize", th);
        }
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
    }
}
