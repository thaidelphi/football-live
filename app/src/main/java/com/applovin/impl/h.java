package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.d;
import com.applovin.impl.i;
import com.applovin.impl.k2;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.s;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class h extends g3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, s.a {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f7064a;

    /* renamed from: b  reason: collision with root package name */
    private j f7065b;

    /* renamed from: c  reason: collision with root package name */
    private y7 f7066c;

    /* renamed from: d  reason: collision with root package name */
    private i f7067d;

    /* renamed from: e  reason: collision with root package name */
    private MaxAdView f7068e;

    /* renamed from: f  reason: collision with root package name */
    private MaxInterstitialAd f7069f;

    /* renamed from: g  reason: collision with root package name */
    private MaxAppOpenAd f7070g;

    /* renamed from: h  reason: collision with root package name */
    private MaxRewardedAd f7071h;

    /* renamed from: i  reason: collision with root package name */
    private MaxNativeAdView f7072i;

    /* renamed from: j  reason: collision with root package name */
    private MaxNativeAdLoader f7073j;

    /* renamed from: k  reason: collision with root package name */
    private MaxAd f7074k;

    /* renamed from: l  reason: collision with root package name */
    private n f7075l;

    /* renamed from: m  reason: collision with root package name */
    private List f7076m;

    /* renamed from: n  reason: collision with root package name */
    private ListView f7077n;

    /* renamed from: o  reason: collision with root package name */
    private View f7078o;

    /* renamed from: p  reason: collision with root package name */
    private AdControlButton f7079p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f7080q;

    /* renamed from: r  reason: collision with root package name */
    private s f7081r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends MaxNativeAdListener {
        a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            h.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            h.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (h.this.f7074k != null) {
                h.this.f7073j.destroy(h.this.f7074k);
            }
            h.this.f7074k = maxAd;
            if (maxNativeAdView != null) {
                h.this.f7072i = maxNativeAdView;
            } else {
                h hVar = h.this;
                com.applovin.impl.sdk.j unused = h.this.f7064a;
                hVar.f7072i = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, com.applovin.impl.sdk.j.m());
                h.this.f7073j.render(h.this.f7072i, maxAd);
            }
            h.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f7064a;
    }

    public void initialize(final j jVar, final k kVar, y7 y7Var, final com.applovin.impl.sdk.j jVar2) {
        List a10;
        this.f7064a = jVar2;
        this.f7065b = jVar;
        this.f7066c = y7Var;
        this.f7076m = jVar2.k0().b();
        i iVar = new i(jVar, kVar, y7Var, this);
        this.f7067d = iVar;
        iVar.a(new k2.a() { // from class: com.applovin.impl.oa
            @Override // com.applovin.impl.k2.a
            public final void a(d2 d2Var, j2 j2Var) {
                h.this.a(jVar2, jVar, kVar, d2Var, j2Var);
            }
        });
        b();
        if (jVar.f().f()) {
            if ((y7Var != null && !y7Var.b().d().D()) || (a10 = jVar2.M().a(jVar.c())) == null || a10.isEmpty()) {
                return;
            }
            this.f7081r = new s(a10, jVar.a(), getApplicationContext(), this);
        }
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
        this.f7079p.setControlState(AdControlButton.b.LOAD);
        this.f7080q.setText("");
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
        this.f7079p.setControlState(AdControlButton.b.LOAD);
        this.f7080q.setText("");
        if (204 == maxError.getCode()) {
            d7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        d7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.f7080q;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f7079p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f7068e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f7065b.a()) {
            a(this.f7072i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.s.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f7068e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7069f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7070g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7071h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7073j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        d7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f7064a.k0().c()) {
            d7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
        } else if (this.f7067d.j() != this.f7065b.f()) {
            d7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
        } else {
            MaxAdFormat a10 = this.f7065b.a();
            AdControlButton.b bVar = AdControlButton.b.LOAD;
            if (bVar == adControlButton.getControlState()) {
                adControlButton.setControlState(AdControlButton.b.LOADING);
                s sVar = this.f7081r;
                if (sVar != null) {
                    sVar.a();
                } else {
                    a(a10);
                }
            } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                if (!a10.isAdViewAd() && a10 != MaxAdFormat.NATIVE) {
                    adControlButton.setControlState(bVar);
                }
                b(a10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f7067d.k());
        this.f7077n = (ListView) findViewById(R.id.listView);
        this.f7078o = findViewById(R.id.ad_presenter_view);
        this.f7079p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f7080q = (TextView) findViewById(R.id.status_textview);
        this.f7077n.setAdapter((ListAdapter) this.f7067d);
        this.f7080q.setText(a());
        this.f7080q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7079p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f7078o.setBackground(layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f7066c != null) {
            this.f7064a.k0().a(this.f7076m);
        }
        MaxAdView maxAdView = this.f7068e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f7069f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f7070g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f7071h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f7073j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f7074k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f7073j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        d7.a("onUserRewarded", maxAd, this);
    }

    private void b() {
        String c10 = this.f7065b.c();
        if (this.f7065b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(c10, this.f7065b.a(), this.f7064a.q0(), this);
            this.f7068e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f7068e.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7068e.setExtraParameter("disable_precache", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7068e.setExtraParameter("allow_pause_auto_refresh_immediately", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7068e.stopAutoRefresh();
            this.f7068e.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f7065b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(c10, this.f7064a.q0(), this);
            this.f7069f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7069f.setListener(this);
        } else if (MaxAdFormat.APP_OPEN == this.f7065b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(c10, this.f7064a.q0());
            this.f7070g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7070g.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f7065b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(c10, this.f7064a.q0(), this);
            this.f7071h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7071h.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f7065b.a()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(c10, this.f7064a.q0(), this);
            this.f7073j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", com.ironsource.mediationsdk.metadata.a.f18924g);
            this.f7073j.setNativeAdListener(new a());
            this.f7073j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.j jVar, final j jVar2, final k kVar, d2 d2Var, final j2 j2Var) {
        if (j2Var instanceof i.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new d.b() { // from class: com.applovin.impl.na
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    h.a(j2.this, jVar2, kVar, jVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(j2 j2Var, j jVar, k kVar, com.applovin.impl.sdk.j jVar2, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(jVar, kVar, ((i.b) j2Var).v(), jVar2);
    }

    @Override // com.applovin.impl.s.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f7068e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7069f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7070g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7071h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7073j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        y7 y7Var = this.f7066c;
        sb.append(y7Var != null ? y7Var.b().a() : this.f7067d.j().c());
        com.applovin.impl.sdk.n.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.f7066c != null) {
            this.f7064a.k0().a(this.f7066c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f7068e.setPlacement("[Mediation Debugger Live Ad]");
            this.f7068e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f7065b.a()) {
            this.f7069f.loadAd();
        } else if (MaxAdFormat.APP_OPEN == this.f7065b.a()) {
            this.f7070g.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f7065b.a()) {
            this.f7071h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f7065b.a()) {
            this.f7073j.setPlacement("[Mediation Debugger Live Ad]");
            this.f7073j.loadAd();
        } else {
            d7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f7075l != null) {
            return;
        }
        n nVar = new n(viewGroup, size, this);
        this.f7075l = nVar;
        nVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.ma
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                h.this.a(dialogInterface);
            }
        });
        this.f7075l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f7075l = null;
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder();
        sb.append("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        y7 y7Var = this.f7066c;
        sb.append(y7Var != null ? y7Var.b().a() : this.f7067d.j().c());
        com.applovin.impl.sdk.n.g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f7068e, maxAdFormat.getSize());
        } else if (MaxAdFormat.INTERSTITIAL == this.f7065b.a()) {
            this.f7069f.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.APP_OPEN == this.f7065b.a()) {
            this.f7070g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f7065b.a()) {
            this.f7071h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f7065b.a()) {
            a(this.f7072i, MaxAdFormat.MREC.getSize());
        }
    }

    private String a() {
        return this.f7064a.k0().c() ? "Not supported while Test Mode is enabled" : this.f7067d.j() != this.f7065b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }
}
