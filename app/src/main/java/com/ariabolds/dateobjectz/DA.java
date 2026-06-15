package com.ariabolds.dateobjectz;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appnext.actionssdk.R;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.ug;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.b;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DA extends AppCompatActivity {

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f10076b;

    /* renamed from: c  reason: collision with root package name */
    q1.b f10077c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayoutManager f10078d;

    /* renamed from: g  reason: collision with root package name */
    private SwipeRefreshLayout f10081g;

    /* renamed from: h  reason: collision with root package name */
    SharedPreferences f10082h;

    /* renamed from: j  reason: collision with root package name */
    p1.b f10084j;

    /* renamed from: n  reason: collision with root package name */
    Intent f10088n;

    /* renamed from: o  reason: collision with root package name */
    FrameLayout f10089o;

    /* renamed from: q  reason: collision with root package name */
    StartAppAd f10091q;

    /* renamed from: s  reason: collision with root package name */
    CountDownTimer f10093s;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<p1.b> f10075a = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    String f10079e = "1";

    /* renamed from: f  reason: collision with root package name */
    String f10080f = "";

    /* renamed from: i  reason: collision with root package name */
    String f10083i = "TAG";

    /* renamed from: k  reason: collision with root package name */
    boolean f10085k = false;

    /* renamed from: l  reason: collision with root package name */
    int f10086l = 0;

    /* renamed from: m  reason: collision with root package name */
    int f10087m = 0;

    /* renamed from: p  reason: collision with root package name */
    String f10090p = "";

    /* renamed from: r  reason: collision with root package name */
    int f10092r = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Dialog f10094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f10095b;

        a(Dialog dialog, String str) {
            this.f10094a = dialog;
            this.f10095b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f10094a.dismiss();
            try {
                DA da = DA.this;
                da.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f10095b)));
            } catch (ActivityNotFoundException unused) {
                DA da2 = DA.this;
                da2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.f10095b)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Dialog f10097a;

        b(Dialog dialog) {
            this.f10097a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f10097a.dismiss();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DA.this.findViewById(2131362109).setVisibility(8);
            DA.this.g();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements LevelPlayInterstitialListener {
        d() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(AdInfo adInfo) {
            IronSource.loadInterstitial();
            try {
                DA da = DA.this;
                if (da.f10085k) {
                    da.f10085k = false;
                    if (da.f10084j.f().equals("embed")) {
                        Intent intent = new Intent(DA.this, WP.class);
                        intent.putExtra("url", DA.this.f10084j.g());
                        intent.putExtra(ug.f21009x, DA.this.f10084j.c());
                        intent.putExtra(b9.h.Z, DA.this.f10084j.m());
                        intent.putExtra(cc.f16874p, DA.this.f10084j.n());
                        intent.putExtra("agent", DA.this.f10084j.a());
                        intent.putExtra("channel_type", DA.this.f10084j.f());
                        intent.putExtra("eh1", DA.this.f10084j.i());
                        intent.putExtra("eh2", DA.this.f10084j.j());
                        intent.putExtra("cUrl", DA.this.f10084j.p());
                        DA.this.startActivity(intent);
                    } else {
                        Intent intent2 = new Intent(DA.this.getApplicationContext(), EP.class);
                        intent2.putExtra("url", DA.this.f10084j.g());
                        intent2.putExtra("curl", DA.this.f10084j.p());
                        intent2.putExtra(ug.f21009x, DA.this.f10084j.c());
                        intent2.putExtra(b9.h.Z, DA.this.f10084j.m());
                        intent2.putExtra(cc.f16874p, DA.this.f10084j.n());
                        intent2.putExtra("agent", DA.this.f10084j.a());
                        intent2.putExtra("channel_type", DA.this.f10084j.f());
                        intent2.putExtra("eh1", DA.this.f10084j.i());
                        intent2.putExtra("eh2", DA.this.f10084j.j());
                        intent2.putExtra("cUrl", DA.this.f10084j.p());
                        intent2.putExtra("bandwith", DA.this.f10084j.b());
                        intent2.putExtra("name", DA.this.f10084j.e());
                        intent2.putExtra("drm", DA.this.f10084j.h());
                        DA.this.startActivity(intent2);
                    }
                }
                Log.e(DA.this.f10083i, "Interstitial ad dismissed.");
            } catch (Exception unused) {
            }
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
            String str = DA.this.f10083i;
            Log.e(str, "IS Interstitial ad " + ironSourceError.getErrorMessage());
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(AdInfo adInfo) {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class e implements MaxAdListener {
        e() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            Home.f10167z.loadAd();
            try {
                DA da = DA.this;
                if (da.f10085k) {
                    da.f10085k = false;
                    if (da.f10084j.f().equals("embed")) {
                        Intent intent = new Intent(DA.this, WP.class);
                        intent.putExtra("url", DA.this.f10084j.g());
                        intent.putExtra(ug.f21009x, DA.this.f10084j.c());
                        intent.putExtra(b9.h.Z, DA.this.f10084j.m());
                        intent.putExtra(cc.f16874p, DA.this.f10084j.n());
                        intent.putExtra("agent", DA.this.f10084j.a());
                        intent.putExtra("channel_type", DA.this.f10084j.f());
                        intent.putExtra("eh1", DA.this.f10084j.i());
                        intent.putExtra("eh2", DA.this.f10084j.j());
                        intent.putExtra("cUrl", DA.this.f10084j.p());
                        DA.this.startActivity(intent);
                    } else {
                        Intent intent2 = new Intent(DA.this.getApplicationContext(), EP.class);
                        intent2.putExtra("url", DA.this.f10084j.g());
                        intent2.putExtra("curl", DA.this.f10084j.p());
                        intent2.putExtra(ug.f21009x, DA.this.f10084j.c());
                        intent2.putExtra(b9.h.Z, DA.this.f10084j.m());
                        intent2.putExtra(cc.f16874p, DA.this.f10084j.n());
                        intent2.putExtra("agent", DA.this.f10084j.a());
                        intent2.putExtra("channel_type", DA.this.f10084j.f());
                        intent2.putExtra("eh1", DA.this.f10084j.i());
                        intent2.putExtra("eh2", DA.this.f10084j.j());
                        intent2.putExtra("cUrl", DA.this.f10084j.p());
                        intent2.putExtra("bandwith", DA.this.f10084j.b());
                        intent2.putExtra("name", DA.this.f10084j.e());
                        intent2.putExtra("drm", DA.this.f10084j.h());
                        DA.this.startActivity(intent2);
                    }
                }
                Log.e(DA.this.f10083i, "Interstitial ad dismissed.");
            } catch (Exception unused) {
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            Home.A = 0;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class f implements MaxAdViewAdListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxAdView f10102a;

        f(MaxAdView maxAdView) {
            this.f10102a = maxAdView;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f10102a.stopAutoRefresh();
            DA.this.f10089o.setVisibility(8);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            this.f10102a.startAutoRefresh();
            DA.this.f10089o.setVisibility(0);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class g extends CountDownTimer {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements r1.c {
            a() {
            }

            @Override // r1.c
            public void a(String str, String str2, String str3) {
                Log.e("CAT", String.valueOf(str));
            }

            @Override // r1.c
            public void onError(String str, String str2) {
            }
        }

        g(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            try {
                new r1.e(DA.this.getApplicationContext(), DA.this.f10082h.getString("u1", ""), DA.this.f10082h.getString("a1", ""), new a()).execute(new Void[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements r1.d {
        h() {
        }

        @Override // r1.d
        public void onError(String str) {
            DA.this.l(str);
        }

        @Override // r1.d
        public void onSuccess(String str) {
            try {
                JSONArray jSONArray = new JSONArray(str.toString());
                p1.b[] bVarArr = new p1.b[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    bVarArr[i10] = new p1.b(jSONObject.getString("channel_id"), jSONObject.getString("channel_name"), jSONObject.getString("channel_image"), jSONObject.getString("channel_type"), jSONObject.getString("channel_url"), jSONObject.getString("livetime"), jSONObject.getString(b9.h.Z), jSONObject.getString(cc.f16874p), jSONObject.getString("agent"), jSONObject.getString("eh1"), jSONObject.getString("eh2"), jSONObject.getString("cUrl"), jSONObject.getString("ex_player"), jSONObject.getString("bandwith"), jSONObject.getString("drm"), jSONObject.getString("status"));
                }
                DA.this.f10075a = new ArrayList<>(Arrays.asList(bVarArr));
                DA da = DA.this;
                da.k(da.getApplicationContext());
                DA.this.f10090p = str;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements r1.d {
        i() {
        }

        @Override // r1.d
        public void onError(String str) {
            DA.this.l(str);
        }

        @Override // r1.d
        public void onSuccess(String str) {
            if (DA.this.f10090p.equals(str)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(str.toString());
                p1.b[] bVarArr = new p1.b[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    bVarArr[i10] = new p1.b(jSONObject.getString("channel_id"), jSONObject.getString("channel_name"), jSONObject.getString("channel_image"), jSONObject.getString("channel_type"), jSONObject.getString("channel_url"), jSONObject.getString("livetime"), jSONObject.getString(b9.h.Z), jSONObject.getString(cc.f16874p), jSONObject.getString("agent"), jSONObject.getString("eh1"), jSONObject.getString("eh2"), jSONObject.getString("cUrl"), jSONObject.getString("ex_player"), jSONObject.getString("bandwith"), jSONObject.getString("drm"), jSONObject.getString("status"));
                }
                DA.this.f10075a = new ArrayList<>(Arrays.asList(bVarArr));
                DA da = DA.this;
                da.k(da.getApplicationContext());
                DA.this.f10090p = str;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements b.InterfaceC0344b {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements t1.a {
            a() {
            }

            @Override // t1.a
            public void a() {
            }
        }

        j() {
        }

        @Override // q1.b.InterfaceC0344b
        public void a(View view, p1.b bVar, int i10) {
            DA da = DA.this;
            da.f10092r = 1;
            if (da.f10082h.getInt("vp", 0) == 1 && com.ariabolds.dateobjectz.d.a() && !bVar.g().contains("myfootlive") && !bVar.g().contains("sportslive123") && !bVar.f().equals("URLGETPHP") && !bVar.f().equals("VPNS") && !bVar.f().equals("URLC")) {
                new s1.c(DA.this).l("VPN Detection!").k("This Channel Don,t Work Vpn Connection\nPlease Try Another Server Or Disconnect VPN And Play Again.").h(2131099781).j(2131231114, 2131100315).g(true).o("I Understand").n(2131099781).p(2131100315).q(new a()).m();
                return;
            }
            DA da2 = DA.this;
            da2.f10084j = bVar;
            da2.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k implements SwipeRefreshLayout.j {
        k() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            DA.this.f10077c.d();
            DA.this.findViewById(2131362217).setVisibility(8);
            DA.this.g();
        }
    }

    private void d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                new Intent("android.intent.action.VIEW");
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                new Intent("android.intent.action.VIEW");
            } catch (Exception unused2) {
            }
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(this.f10082h.getString(b9.h.V, ""));
            intent.putExtra("url", str);
            intent.putExtra(ug.f21009x, str2);
            intent.putExtra(b9.h.Z, str3);
            intent.putExtra(cc.f16874p, str4);
            intent.putExtra("agent", str5);
            intent.putExtra("channel_type", str6);
            intent.putExtra("eh1", str7);
            intent.putExtra("eh2", str8);
            intent.putExtra("eh3", str9);
            intent.putExtra("eh4", str10);
            intent.putExtra("eh5", str11);
            intent.putExtra("cUrl", str12);
            intent.putExtra("rUrl", str13);
            intent.putExtra("bandwidth", str14);
            intent.putExtra("pack", getApplication().getPackageName());
            String string = this.f10082h.getString(b9.h.V, "");
            intent.setComponent(new ComponentName(string, this.f10082h.getString(b9.h.V, "") + ".HlsPlay"));
            startActivity(intent);
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10081g.setRefreshing(true);
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10081g.setRefreshing(true);
            } catch (Exception unused2) {
            }
        }
        this.f10081g.setRefreshing(true);
        Context applicationContext = getApplicationContext();
        new r1.b(applicationContext, com.ariabolds.dateobjectz.c.f10244b + com.ariabolds.dateobjectz.c.f10243a + "get_ads_posts.js?id=" + this.f10079e + "&page=1&count=1000", new h()).execute(new Void[0]);
    }

    private void h() {
        Context applicationContext = getApplicationContext();
        new r1.b(applicationContext, com.ariabolds.dateobjectz.c.f10244b + com.ariabolds.dateobjectz.c.f10243a + "get_ads_posts.js?id=" + this.f10079e + "&page=1&count=1000", new i()).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10088n = new Intent(getApplicationContext(), EP.class);
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10088n = new Intent(getApplicationContext(), EP.class);
            } catch (Exception unused2) {
            }
        }
        if (this.f10084j.f().equals("URLGETPHP") && !this.f10084j.g().contains(".js") && !this.f10084j.g().contains(".m3u8") && !this.f10084j.g().contains(".mpd")) {
            this.f10084j.g().contains(".mp4");
        }
        this.f10085k = true;
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(this.f10082h.getString(b9.h.V, ""));
        if ((this.f10084j.k().equals("1") && !this.f10084j.f().equals("embed")) || (launchIntentForPackage != null && this.f10082h.getString("p_check", "0").equals("1") && !this.f10084j.f().equals("embed"))) {
            this.f10085k = false;
            if (launchIntentForPackage != null) {
                String g10 = this.f10084j.g();
                String c10 = this.f10084j.c();
                String m7 = this.f10084j.m();
                String n10 = this.f10084j.n();
                String a10 = this.f10084j.a();
                String f10 = this.f10084j.f();
                String i10 = this.f10084j.i();
                String j10 = this.f10084j.j();
                String p10 = this.f10084j.p();
                d(g10, c10, m7, n10, a10, f10, i10, j10, "", "", "", p10, com.ariabolds.dateobjectz.c.f10244b + com.ariabolds.dateobjectz.c.f10243a + "get_post_retry2.js?id=" + this.f10084j.c(), this.f10084j.b());
                return;
            }
            j(this.f10082h.getString("app_name", ""), this.f10082h.getString(b9.h.V, ""), false);
            return;
        }
        try {
            if (this.f10082h.getString("adsNetwork", "").equals(AdColonyAppOptions.IRONSOURCE)) {
                if (IronSource.isInterstitialReady()) {
                    if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                        IronSource.showInterstitial();
                        com.ariabolds.dateobjectz.b.a().c(this.f10082h.getInt("interstital_ad_click", 1));
                        return;
                    }
                    com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                } else {
                    IronSource.loadInterstitial();
                }
            }
            if (this.f10082h.getString("adsNetwork", "").equals("AppLovin")) {
                if (Home.f10167z.isReady()) {
                    if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                        Home.f10167z.showAd();
                        com.ariabolds.dateobjectz.b.a().c(this.f10082h.getInt("interstital_ad_click", 1));
                        return;
                    }
                    com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                } else {
                    Home.f10167z.loadAd();
                }
            }
            if (this.f10084j.f().equals("embed")) {
                if (Home.f10166y.isAdLoaded()) {
                    if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                        Intent intent = new Intent(getApplicationContext(), WP.class);
                        intent.putExtra("url", this.f10084j.g());
                        intent.putExtra(ug.f21009x, this.f10084j.c());
                        intent.putExtra(b9.h.Z, this.f10084j.m());
                        intent.putExtra(cc.f16874p, this.f10084j.n());
                        intent.putExtra("agent", this.f10084j.a());
                        intent.putExtra("channel_type", this.f10084j.f());
                        intent.putExtra("eh1", this.f10084j.i());
                        intent.putExtra("eh2", this.f10084j.j());
                        intent.putExtra("cUrl", this.f10084j.p());
                        startActivity(intent);
                        Home.f10166y.showAd();
                        com.ariabolds.dateobjectz.b.a().c(this.f10082h.getInt("interstital_ad_click", 1));
                        return;
                    }
                    com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                    Intent intent2 = new Intent(getApplicationContext(), WP.class);
                    intent2.putExtra("url", this.f10084j.g());
                    intent2.putExtra(ug.f21009x, this.f10084j.c());
                    intent2.putExtra(b9.h.Z, this.f10084j.m());
                    intent2.putExtra(cc.f16874p, this.f10084j.n());
                    intent2.putExtra("agent", this.f10084j.a());
                    intent2.putExtra("channel_type", this.f10084j.f());
                    intent2.putExtra("eh1", this.f10084j.i());
                    intent2.putExtra("eh2", this.f10084j.j());
                    intent2.putExtra("cUrl", this.f10084j.p());
                    intent2.putExtra("bandwith", this.f10084j.b());
                    startActivity(intent2);
                    return;
                }
                Home.f10166y.loadAd();
                if (this.f10091q.isReady()) {
                    if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                        this.f10091q.showAd();
                        com.ariabolds.dateobjectz.b.a().c(this.f10082h.getInt("interstital_ad_click", 1));
                    } else {
                        com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                    }
                    Intent intent3 = new Intent(getApplicationContext(), WP.class);
                    intent3.putExtra("url", this.f10084j.g());
                    intent3.putExtra(ug.f21009x, this.f10084j.c());
                    intent3.putExtra(b9.h.Z, this.f10084j.m());
                    intent3.putExtra(cc.f16874p, this.f10084j.n());
                    intent3.putExtra("agent", this.f10084j.a());
                    intent3.putExtra("channel_type", this.f10084j.f());
                    intent3.putExtra("eh1", this.f10084j.i());
                    intent3.putExtra("eh2", this.f10084j.j());
                    intent3.putExtra("cUrl", this.f10084j.p());
                    intent3.putExtra("bandwith", this.f10084j.b());
                    startActivity(intent3);
                    return;
                }
                com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                Intent intent4 = new Intent(getApplicationContext(), WP.class);
                intent4.putExtra("url", this.f10084j.g());
                intent4.putExtra(ug.f21009x, this.f10084j.c());
                intent4.putExtra(b9.h.Z, this.f10084j.m());
                intent4.putExtra(cc.f16874p, this.f10084j.n());
                intent4.putExtra("agent", this.f10084j.a());
                intent4.putExtra("channel_type", this.f10084j.f());
                intent4.putExtra("eh1", this.f10084j.i());
                intent4.putExtra("eh2", this.f10084j.j());
                intent4.putExtra("cUrl", this.f10084j.p());
                startActivity(intent4);
            } else if (Home.f10166y.isAdLoaded()) {
                if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                    Intent intent5 = new Intent(getApplicationContext(), EP.class);
                    intent5.putExtra("url", this.f10084j.g());
                    intent5.putExtra("curl", this.f10084j.p());
                    intent5.putExtra(ug.f21009x, this.f10084j.c());
                    intent5.putExtra(b9.h.Z, this.f10084j.m());
                    intent5.putExtra(cc.f16874p, this.f10084j.n());
                    intent5.putExtra("agent", this.f10084j.a());
                    intent5.putExtra("channel_type", this.f10084j.f());
                    intent5.putExtra("eh1", this.f10084j.i());
                    intent5.putExtra("eh2", this.f10084j.j());
                    intent5.putExtra("cUrl", this.f10084j.p());
                    intent5.putExtra("bandwith", this.f10084j.b());
                    intent5.putExtra("name", this.f10084j.e());
                    intent5.putExtra("drm", this.f10084j.h());
                    startActivity(intent5);
                    Home.f10166y.showAd();
                    com.ariabolds.dateobjectz.b.a().c(this.f10082h.getInt("interstital_ad_click", 1));
                    return;
                }
                Intent intent6 = new Intent(getApplicationContext(), EP.class);
                intent6.putExtra("url", this.f10084j.g());
                intent6.putExtra("curl", this.f10084j.p());
                intent6.putExtra(ug.f21009x, this.f10084j.c());
                intent6.putExtra(b9.h.Z, this.f10084j.m());
                intent6.putExtra(cc.f16874p, this.f10084j.n());
                intent6.putExtra("agent", this.f10084j.a());
                intent6.putExtra("channel_type", this.f10084j.f());
                intent6.putExtra("eh1", this.f10084j.i());
                intent6.putExtra("eh2", this.f10084j.j());
                intent6.putExtra("cUrl", this.f10084j.p());
                intent6.putExtra("bandwith", this.f10084j.b());
                intent6.putExtra("name", this.f10084j.e());
                intent6.putExtra("drm", this.f10084j.h());
                startActivity(intent6);
                com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
            } else {
                Home.f10166y.loadAd();
                if (this.f10091q.isReady()) {
                    if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                        this.f10091q.showAd();
                        str = "bandwith";
                        com.ariabolds.dateobjectz.b.a().c(this.f10082h.getInt("interstital_ad_click", 1));
                    } else {
                        str = "bandwith";
                        com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                    }
                    Intent intent7 = new Intent(getApplicationContext(), EP.class);
                    intent7.putExtra("url", this.f10084j.g());
                    intent7.putExtra("curl", this.f10084j.p());
                    intent7.putExtra(ug.f21009x, this.f10084j.c());
                    intent7.putExtra(b9.h.Z, this.f10084j.m());
                    intent7.putExtra(cc.f16874p, this.f10084j.n());
                    intent7.putExtra("agent", this.f10084j.a());
                    intent7.putExtra("channel_type", this.f10084j.f());
                    intent7.putExtra("eh1", this.f10084j.i());
                    intent7.putExtra("eh2", this.f10084j.j());
                    intent7.putExtra("cUrl", this.f10084j.p());
                    intent7.putExtra(str, this.f10084j.b());
                    intent7.putExtra("name", this.f10084j.e());
                    intent7.putExtra("drm", this.f10084j.h());
                    startActivity(intent7);
                    return;
                }
                com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                Intent intent8 = new Intent(getApplicationContext(), EP.class);
                intent8.putExtra("url", this.f10084j.g());
                intent8.putExtra("curl", this.f10084j.p());
                intent8.putExtra(ug.f21009x, this.f10084j.c());
                intent8.putExtra(b9.h.Z, this.f10084j.m());
                intent8.putExtra(cc.f16874p, this.f10084j.n());
                intent8.putExtra("agent", this.f10084j.a());
                intent8.putExtra("channel_type", this.f10084j.f());
                intent8.putExtra("eh1", this.f10084j.i());
                intent8.putExtra("eh2", this.f10084j.j());
                intent8.putExtra("cUrl", this.f10084j.p());
                intent8.putExtra("bandwith", this.f10084j.b());
                intent8.putExtra("name", this.f10084j.e());
                intent8.putExtra("drm", this.f10084j.h());
                startActivity(intent8);
            }
        } catch (Exception unused3) {
        }
    }

    private void j(String str, String str2, boolean z10) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.getWindow().setBackgroundDrawableResource(17170445);
        String string = getString(2131886169, new Object[]{str});
        dialog.setContentView(2131558620);
        TextView textView = (TextView) dialog.findViewById(2131362550);
        TextView textView2 = (TextView) dialog.findViewById(2131362304);
        TextView textView3 = (TextView) dialog.findViewById(2131362474);
        ImageView imageView = (ImageView) dialog.findViewById(2131362160);
        textView.setText(2131886168);
        textView2.setText(2131886136);
        textView3.setText("To play this channel you need " + str + "\n" + string);
        textView3.setTextColor(-1);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        ((TextView) dialog.findViewById(2131361821)).setVisibility(8);
        ((TextView) dialog.findViewById(2131362481)).setText(2131886238);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(120, 120));
        if (this.f10084j.k().equals("1")) {
            try {
                com.bumptech.glide.b.u(imageView).r(this.f10082h.getString("newappimage", "")).i(2131231168).T(2131231184).s0(imageView);
            } catch (Exception unused) {
            }
        }
        textView.setOnClickListener(new a(dialog, str2));
        textView2.setOnClickListener(new b(dialog));
        dialog.show();
    }

    public void k(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10076b = (RecyclerView) findViewById(2131362377);
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10076b = (RecyclerView) findViewById(2131362377);
            } catch (Exception unused2) {
            }
        }
        try {
            if (this.f10075a.size() == 0) {
                findViewById(2131362217).setVisibility(0);
                ObjectAnimator ofInt = ObjectAnimator.ofInt((TextView) findViewById(R.id.empty), "textColor", -1, -65281, -65536, -16776961);
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.setDuration(2000L);
                ofInt.setRepeatCount(-1);
                ofInt.setRepeatMode(2);
                ofInt.setEvaluator(new ArgbEvaluator());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofInt);
                animatorSet.start();
            }
            this.f10081g.setRefreshing(false);
            RecyclerView recyclerView = (RecyclerView) findViewById(2131362377);
            this.f10076b = recyclerView;
            recyclerView.removeAllViews();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            this.f10078d = linearLayoutManager;
            this.f10076b.setLayoutManager(linearLayoutManager);
            q1.b bVar = new q1.b(this.f10075a, context);
            this.f10077c = bVar;
            bVar.e(new j());
            this.f10076b.setAdapter(this.f10077c);
            this.f10081g.setOnRefreshListener(new k());
        } catch (Exception unused3) {
        }
    }

    public void l(String str) {
        this.f10081g.setRefreshing(false);
        if (str == null) {
            findViewById(2131362109).setVisibility(0);
            this.f10081g.setRefreshing(false);
            return;
        }
        View findViewById = findViewById(2131362109);
        ((TextView) findViewById(2131362110)).setText("Please wait a moment We'll be back shortly.\nThe app is under maintenance, please visit again few moment later");
        findViewById.setVisibility(0);
        this.f10081g.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558485);
        this.f10085k = false;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10082h = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10082h = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            } catch (Exception unused2) {
            }
        }
        this.f10092r = 0;
        StartAppSDK.setUserConsent(this, "pas", System.currentTimeMillis(), true);
        this.f10091q = new StartAppAd(this);
        if (this.f10082h.getString("startapp", "").equals(com.ironsource.mediationsdk.metadata.a.f18924g)) {
            if (this.f10082h.getString("startapp_video", "").equals(com.ironsource.mediationsdk.metadata.a.f18924g)) {
                this.f10091q.loadAd(StartAppAd.AdMode.VIDEO);
            } else {
                this.f10091q.loadAd();
            }
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f10079e = intent.getStringExtra("cid");
            this.f10080f = intent.getStringExtra("cat_name");
        }
        ((Button) findViewById(2131362111)).setOnClickListener(new c());
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(2131362454);
        this.f10081g = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(2131100284, 2131099805, 2131099710, 2131100294);
        this.f10089o = (FrameLayout) findViewById(2131361930);
        g();
        try {
            if (getSupportActionBar() != null) {
                getSupportActionBar().s(true);
                getSupportActionBar().t(true);
                getSupportActionBar().v(this.f10080f);
            }
        } catch (Exception unused3) {
        }
        try {
            if (this.f10082h.getString("interstital_ad", com.ironsource.mediationsdk.metadata.a.f18924g).equals(com.ironsource.mediationsdk.metadata.a.f18924g)) {
                if (this.f10082h.getString("adsNetwork", "").equals(AdColonyAppOptions.IRONSOURCE)) {
                    IronSource.setLevelPlayInterstitialListener(new d());
                    IronSource.loadInterstitial();
                    new com.ariabolds.dateobjectz.a(this.f10089o, this);
                }
                if (this.f10082h.getString("adsNetwork", "").equals("AppLovin")) {
                    Home.f10167z.setListener(new e());
                    Home.f10167z.loadAd();
                    this.f10089o.removeAllViews();
                    MaxAdView maxAdView = new MaxAdView(this.f10082h.getString("fanBanner", ""), this);
                    maxAdView.setListener(new f(maxAdView));
                    int dpToPx = AppLovinSdkUtils.dpToPx(this, MaxAdFormat.BANNER.getAdaptiveSize(this).getHeight());
                    maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, dpToPx));
                    maxAdView.setExtraParameter("adaptive_banner", com.ironsource.mediationsdk.metadata.a.f18924g);
                    maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, dpToPx));
                    maxAdView.setBackgroundColor(0);
                    this.f10089o.addView(maxAdView);
                    maxAdView.loadAd();
                }
            }
        } catch (Exception unused4) {
        }
        try {
            if (this.f10082h.getString("u1", "").isEmpty()) {
                return;
            }
            this.f10093s = new g(this.f10082h.getInt("time", 20000), this.f10082h.getInt("i_time", UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS)).start();
        } catch (Exception unused5) {
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131623938, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case 2131362354:
                String packageName = getPackageName();
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f10082h.getString("update_link", ""))));
                } catch (ActivityNotFoundException unused) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + packageName)));
                }
                return true;
            case 2131362362:
                g();
                return true;
            case 2131362406:
                String obj = Html.fromHtml("Football Live Streaming App").toString();
                String obj2 = Html.fromHtml("I Would like to share this with you. Here You Can Download This Application from this link").toString();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                if (this.f10082h.getString("update_link", "").startsWith("market")) {
                    String[] split = this.f10082h.getString("update_link", "").split(b9.i.f16692b);
                    String str = split[0];
                    String str2 = split[1];
                    intent.putExtra("android.intent.extra.TEXT", obj + "\n\n" + obj2 + "\n\nhttp://play.google.com/store/apps/details?id=" + str2);
                } else {
                    intent.putExtra("android.intent.extra.TEXT", obj + "\n\n" + obj2 + "\n\n" + this.f10082h.getString("update_link", ""));
                }
                intent.setType("text/plain");
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            CountDownTimer countDownTimer = this.f10093s;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                this.f10082h = defaultSharedPreferences;
                if (defaultSharedPreferences.getString("reload", "").equals(com.ironsource.mediationsdk.metadata.a.f18924g) && this.f10092r == 1) {
                    h();
                }
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                this.f10082h = defaultSharedPreferences2;
                if (defaultSharedPreferences2.getString("reload", "").equals(com.ironsource.mediationsdk.metadata.a.f18924g) && this.f10092r == 1) {
                    h();
                }
            } catch (Exception unused2) {
            }
        }
    }
}
