package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.d7;
import com.applovin.impl.g3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.s;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.nu;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends g3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, s.a {

    /* renamed from: a  reason: collision with root package name */
    private y2 f7772a;

    /* renamed from: b  reason: collision with root package name */
    private j f7773b;

    /* renamed from: c  reason: collision with root package name */
    private MaxAdView f7774c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdView f7775d;

    /* renamed from: e  reason: collision with root package name */
    private MaxInterstitialAd f7776e;

    /* renamed from: f  reason: collision with root package name */
    private MaxAppOpenAd f7777f;

    /* renamed from: g  reason: collision with root package name */
    private MaxRewardedAd f7778g;

    /* renamed from: h  reason: collision with root package name */
    private MaxAd f7779h;

    /* renamed from: i  reason: collision with root package name */
    private MaxNativeAdLoader f7780i;

    /* renamed from: j  reason: collision with root package name */
    private List f7781j;

    /* renamed from: k  reason: collision with root package name */
    private String f7782k;

    /* renamed from: l  reason: collision with root package name */
    private AdControlButton f7783l;

    /* renamed from: m  reason: collision with root package name */
    private AdControlButton f7784m;

    /* renamed from: n  reason: collision with root package name */
    private AdControlButton f7785n;

    /* renamed from: o  reason: collision with root package name */
    private AdControlButton f7786o;

    /* renamed from: p  reason: collision with root package name */
    private AdControlButton f7787p;

    /* renamed from: q  reason: collision with root package name */
    private AdControlButton f7788q;

    /* renamed from: r  reason: collision with root package name */
    private Button f7789r;

    /* renamed from: s  reason: collision with root package name */
    private Button f7790s;

    /* renamed from: t  reason: collision with root package name */
    private FrameLayout f7791t;

    /* renamed from: u  reason: collision with root package name */
    private FrameLayout f7792u;

    /* renamed from: v  reason: collision with root package name */
    private Switch f7793v;

    /* renamed from: w  reason: collision with root package name */
    private Switch f7794w;

    /* renamed from: x  reason: collision with root package name */
    private Map f7795x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0128a extends MaxNativeAdListener {
        C0128a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f7779h != null) {
                a.this.f7780i.destroy(a.this.f7779h);
            }
            a.this.f7779h = maxAd;
            a.this.f7792u.removeAllViews();
            a.this.f7792u.addView(maxNativeAdView);
            a.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f7775d.removeAllViews();
        this.f7784m.setControlState(AdControlButton.b.LOAD);
    }

    private void e() {
        List r10 = this.f7772a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (r10.contains(maxAdFormat)) {
            String str = "test_mode_rewarded_" + this.f7772a.m();
            this.f7782k = str;
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f7773b.q0(), this);
            this.f7778g = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7778g.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.f7787p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7787p.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    @Override // com.applovin.impl.g3
    protected j getSdk() {
        return this.f7773b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        if (this.f7772a.x() != null && this.f7772a.x().containsKey(maxAdFormat)) {
            return (String) this.f7772a.x().get(maxAdFormat);
        }
        return this.f7772a.m();
    }

    public void initialize(y2 y2Var) {
        this.f7772a = y2Var;
        this.f7773b = y2Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        d7.a(nu.f19443f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        d7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        d7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        d7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        d7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        d7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a10 = a(str);
        a10.setControlState(AdControlButton.b.LOAD);
        d7.a(maxError, a10.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton a10 = a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            a10.setControlState(AdControlButton.b.SHOW);
        } else {
            a10.setControlState(AdControlButton.b.LOAD);
        }
    }

    @Override // com.applovin.impl.s.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f7775d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7776e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f7777f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7778g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7780i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
        } else {
            this.f7774c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        d7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map map = this.f7795x;
            if (map != null && map.get(format) != null) {
                ((s) this.f7795x.get(format)).a();
            } else {
                a(format);
            }
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f7772a == null) {
            n.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f7772a.g() + " Test Ads");
        this.f7781j = this.f7773b.k0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f7789r = (Button) findViewById(R.id.show_mrec_button);
        this.f7790s = (Button) findViewById(R.id.show_native_button);
        if (this.f7772a.I() && this.f7772a.r().contains(MaxAdFormat.MREC)) {
            this.f7792u.setVisibility(8);
            this.f7789r.setBackgroundColor(-1);
            this.f7790s.setBackgroundColor(-3355444);
            this.f7789r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.a(view);
                }
            });
            this.f7790s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.b(view);
                }
            });
        } else {
            this.f7789r.setVisibility(8);
            this.f7790s.setVisibility(8);
        }
        this.f7793v = (Switch) findViewById(R.id.native_banner_switch);
        this.f7794w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f7772a.J()) {
            this.f7793v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.c(view);
                }
            });
            this.f7794w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.d(view);
                }
            });
        } else {
            this.f7793v.setVisibility(8);
            this.f7794w.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f7772a.e()) && this.f7772a.d() != null && this.f7772a.d().size() > 0) {
            AdRegistration.getInstance(this.f7772a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f7772a.d().size());
            for (MaxAdFormat maxAdFormat : this.f7772a.d().keySet()) {
                hashMap.put(maxAdFormat, new s((t) this.f7772a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
            }
            this.f7795x = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            n.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f7773b.k0().a(this.f7781j);
        MaxAdView maxAdView = this.f7774c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f7775d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f7776e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f7778g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f7780i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f7779h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f7780i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        d7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f7792u.setVisibility(0);
        this.f7791t.setVisibility(8);
        this.f7790s.setBackgroundColor(-1);
        this.f7789r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f7774c.removeAllViews();
        this.f7783l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f7791t.setVisibility(0);
        this.f7792u.setVisibility(8);
        this.f7789r.setBackgroundColor(-1);
        this.f7790s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f7792u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f7772a.I()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f7773b.q0(), this);
            this.f7780i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7780i.setNativeAdListener(new C0128a());
            this.f7780i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f7788q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7788q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f7792u.setVisibility(8);
    }

    private void c() {
        this.f7791t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List r10 = this.f7772a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (r10.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f7773b.q0(), this);
            this.f7775d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7775d.setExtraParameter("disable_precache", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7775d.setExtraParameter("allow_pause_auto_refresh_immediately", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7775d.stopAutoRefresh();
            this.f7775d.setListener(this);
            this.f7791t.addView(this.f7775d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f7784m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7784m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f7791t.setVisibility(8);
    }

    @Override // com.applovin.impl.s.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f7775d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7776e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f7777f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7778g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7780i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f7774c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b() {
        List r10 = this.f7772a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (r10.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f7773b.q0(), this);
            this.f7776e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7776e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f7785n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7785n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f7772a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f7773b.q0(), this);
            this.f7774c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f7774c.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7774c.setExtraParameter("disable_precache", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7774c.setExtraParameter("allow_pause_auto_refresh_immediately", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7774c.stopAutoRefresh();
            this.f7774c.setListener(this);
            frameLayout.addView(this.f7774c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f7783l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f7783l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        n.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f7772a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7776e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7777f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7778g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        n.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f7772a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = true;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f7793v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 != maxAdFormat || !this.f7794w.isChecked()) {
            z10 = false;
        }
        if (!z11 && !z10) {
            this.f7773b.k0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f7773b.k0().a(this.f7772a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f7774c.loadAd();
        } else if (maxAdFormat3 == maxAdFormat) {
            this.f7775d.loadAd();
            this.f7789r.callOnClick();
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7776e.loadAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7777f.loadAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7778g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7780i.loadAd();
            this.f7790s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f7784m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f7785n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f7786o;
            }
            if (str.equals(this.f7782k)) {
                return this.f7787p;
            }
            if (str.equals("test_mode_native")) {
                return this.f7788q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f7783l;
    }
}
