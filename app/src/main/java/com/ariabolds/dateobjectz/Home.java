package com.ariabolds.dateobjectz;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appnext.ads.interstitial.Interstitial;
import com.appnext.base.Appnext;
import com.appnext.core.AppnextAdCreativeType;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnAdOpened;
import com.facebook.ads.AudienceNetworkAds;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.a;
import z4.l0;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Home extends AppCompatActivity {
    public static int A;

    /* renamed from: y  reason: collision with root package name */
    public static Interstitial f10166y;

    /* renamed from: z  reason: collision with root package name */
    public static MaxInterstitialAd f10167z;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f10169b;

    /* renamed from: c  reason: collision with root package name */
    StaggeredGridLayoutManager f10170c;

    /* renamed from: d  reason: collision with root package name */
    q1.a f10171d;

    /* renamed from: e  reason: collision with root package name */
    LinearLayoutManager f10172e;

    /* renamed from: f  reason: collision with root package name */
    private SwipeRefreshLayout f10173f;

    /* renamed from: g  reason: collision with root package name */
    private SwipeRefreshLayout f10174g;

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f10175h;

    /* renamed from: i  reason: collision with root package name */
    View f10176i;

    /* renamed from: j  reason: collision with root package name */
    SharedPreferences f10177j;

    /* renamed from: k  reason: collision with root package name */
    WebView f10178k;

    /* renamed from: l  reason: collision with root package name */
    WebView f10179l;

    /* renamed from: n  reason: collision with root package name */
    TextView f10181n;

    /* renamed from: o  reason: collision with root package name */
    TextView f10182o;

    /* renamed from: p  reason: collision with root package name */
    WebView f10183p;

    /* renamed from: q  reason: collision with root package name */
    ImageView f10184q;

    /* renamed from: r  reason: collision with root package name */
    Button f10185r;

    /* renamed from: s  reason: collision with root package name */
    Button f10186s;

    /* renamed from: u  reason: collision with root package name */
    FrameLayout f10188u;

    /* renamed from: v  reason: collision with root package name */
    StartAppAd f10189v;

    /* renamed from: x  reason: collision with root package name */
    ApplovinAppOpenManager f10191x;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<p1.a> f10168a = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    String f10180m = "TAG";

    /* renamed from: t  reason: collision with root package name */
    private long f10187t = 0;

    /* renamed from: w  reason: collision with root package name */
    int f10190w = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements SwipeRefreshLayout.j {
        a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            Home.this.f10171d.d();
            Home.this.findViewById(2131362217).setVisibility(8);
            Home.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Home.this.f10175h.getVisibility() == 0) {
                Home.this.f10175h.setVisibility(8);
                Home.this.getWindow().getDecorView().setSystemUiVisibility(0);
                if (Home.this.getSupportActionBar() != null) {
                    Home.this.getSupportActionBar().x();
                }
                try {
                    if (Home.this.f10177j.getString("adsNetwork", "").equals(AdColonyAppOptions.IRONSOURCE) && IronSource.isInterstitialReady()) {
                        IronSource.showInterstitial();
                        Home.this.f10175h.setVisibility(8);
                    } else if (Home.this.f10177j.getString("adsNetwork", "AppLovin").equals("AppLovin") && Home.f10167z.isReady()) {
                        Home.f10167z.showAd();
                        Home.this.f10175h.setVisibility(8);
                    } else {
                        Interstitial interstitial = Home.f10166y;
                        if (interstitial != null && interstitial.isAdLoaded()) {
                            Home.f10166y.showAd();
                            Home.this.f10175h.setVisibility(8);
                        } else if (Home.this.f10189v.isReady()) {
                            Home.this.f10189v.showAd();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends WebViewClient {
        c() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
            Home.this.f10178k.setVisibility(0);
            Home.this.f10174g.setRefreshing(false);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            Home.this.f10178k.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements r1.c {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements View.OnLongClickListener {
            a() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class b implements View.OnLongClickListener {
            b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        }

        d() {
        }

        @Override // r1.c
        public void a(String str, String str2, String str3) {
            d dVar;
            String str4;
            String str5;
            String str6;
            String str7;
            JSONArray jSONArray;
            JSONArray jSONArray2;
            String str8;
            if (!(str2 + str3.toLowerCase()).equals("200application/javascript") && Home.this.f10190w < 2) {
                if (com.ariabolds.dateobjectz.c.f10244b.equals(l0.f33541f)) {
                    com.ariabolds.dateobjectz.c.f10244b = l0.f33542g;
                    Home.this.g();
                    Log.e("MY API ", str3 + " " + str2);
                    return;
                } else if (com.ariabolds.dateobjectz.c.f10244b.equals(l0.f33542g)) {
                    com.ariabolds.dateobjectz.c.f10244b = l0.f33541f;
                    Home.this.g();
                    Log.e("MY API ", str3 + " " + str2);
                    return;
                }
            } else {
                Home.this.f10190w = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject(str.toString());
                l0 l0Var = new l0();
                String str9 = "applovin_app_open";
                String str10 = "admobInterstital";
                String str11 = "admobBanner";
                String str12 = "target";
                String str13 = "base";
                String str14 = "intro";
                if (jSONObject.has("config_v2")) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(new String(l0Var.a(jSONObject.getString("config_v2"))));
                        SharedPreferences.Editor edit = Home.this.f10177j.edit();
                        edit.putString("adsNetwork", jSONObject2.getString("adsNetwork"));
                        edit.putString("interstital_ad", jSONObject2.getString("interstital_ad"));
                        edit.putInt("interstital_ad_click", Integer.parseInt(jSONObject2.getString("interstital_ad_click")));
                        edit.putInt("apkVersion", Integer.parseInt(jSONObject2.getString("apkVersion")));
                        edit.putBoolean("app_update", jSONObject2.getBoolean("app_update"));
                        edit.putInt("app_version_code", Integer.parseInt(jSONObject2.getString("app_version_code")));
                        edit.putString("update_note", jSONObject2.getString("update_note"));
                        edit.putString("update_link", jSONObject2.getString("update_link"));
                        edit.putInt("newapp", Integer.parseInt(jSONObject2.getString("newapp")));
                        edit.putString("newappimage", jSONObject2.getString("newappimage"));
                        edit.putString("api_url", jSONObject2.getString("api_url"));
                        str5 = "api_url";
                        edit.putInt("admobCap", Integer.parseInt(jSONObject2.getString("admobCap")));
                        str6 = "admobCap";
                        edit.putString(str11, jSONObject2.getString(str11));
                        str11 = str11;
                        edit.putString(str10, jSONObject2.getString(str10));
                        str10 = str10;
                        edit.putString(str9, jSONObject2.getString(str9));
                        str9 = str9;
                        edit.putString("fanInterstital1", jSONObject2.getString("fanInterstital1"));
                        edit.putString("fanInterstital", jSONObject2.getString("fanInterstital"));
                        edit.putString("fanBanner", jSONObject2.getString("fanBanner"));
                        edit.putString("appNext", jSONObject2.getString("appNext"));
                        edit.putString("appType", jSONObject2.getString("appType"));
                        edit.putString(b9.h.V, jSONObject2.getString(b9.h.V));
                        edit.putString("app_name", jSONObject2.getString("app_name"));
                        edit.putInt("vp", Integer.parseInt(jSONObject2.getString("vp")));
                        edit.putString("privacy_policy", jSONObject2.getString("privacy_policy"));
                        edit.putString(str14, jSONObject2.getString(str14));
                        str14 = str14;
                        edit.putString("reload", jSONObject2.getString("reload"));
                        edit.putString("startapp", jSONObject2.getString("startapp"));
                        edit.putString("startapp_video", jSONObject2.getString("startapp_video"));
                        edit.putString("u1", jSONObject2.getString("u1"));
                        edit.putString("a1", jSONObject2.getString("a1"));
                        edit.putInt("time", Integer.parseInt(jSONObject2.getString("time")));
                        edit.putInt("i_time", Integer.parseInt(jSONObject2.getString("i_time")));
                        edit.putString("noti", jSONObject2.getString("noti"));
                        edit.putString("sub", jSONObject2.getString("sub"));
                        edit.putString("watermark", jSONObject2.getString("watermark"));
                        edit.putString("watermark_color", jSONObject2.getString("watermark_color"));
                        edit.putString("watermark_margin", jSONObject2.getString("watermark_margin"));
                        edit.putString("p_check", jSONObject2.getString("p_check"));
                        edit.putString("is_id", jSONObject2.getString("is_id"));
                        edit.putString("p_check_popup", jSONObject2.getString("p_check_popup"));
                        if (jSONObject2.has(str13)) {
                            edit.putString(str13, jSONObject2.getString(str13));
                        }
                        if (jSONObject2.has(str12)) {
                            edit.putString(str12, jSONObject2.getString(str12));
                        }
                        str7 = "main_v2";
                        if (jSONObject.has(str7)) {
                            str12 = str12;
                            str13 = str13;
                            jSONArray = new JSONArray(new String(l0Var.a(jSONObject.getString(str7))));
                            edit.putString("cat", String.valueOf(l0Var.a(jSONObject.getString(str7))));
                        } else {
                            str13 = str13;
                            str12 = str12;
                            jSONArray = new JSONArray(jSONObject.getString("main_v1"));
                            edit.putString("cat", jSONObject.getString("main_v1"));
                        }
                        jSONArray2 = jSONArray;
                        edit.commit();
                    } catch (Exception unused) {
                        dVar = this;
                        str4 = "";
                        Home.this.j(str4);
                    }
                } else {
                    str6 = "admobCap";
                    str5 = "api_url";
                    str7 = "main_v2";
                    jSONArray2 = null;
                }
                if (jSONObject.has("config_v1")) {
                    JSONObject jSONObject3 = new JSONObject(jSONObject.getString("config_v1"));
                    SharedPreferences.Editor edit2 = Home.this.f10177j.edit();
                    edit2.putString("adsNetwork", jSONObject3.getString("adsNetwork"));
                    edit2.putString("interstital_ad", jSONObject3.getString("interstital_ad"));
                    edit2.putInt("interstital_ad_click", Integer.parseInt(jSONObject3.getString("interstital_ad_click")));
                    edit2.putInt("apkVersion", Integer.parseInt(jSONObject3.getString("apkVersion")));
                    edit2.putBoolean("app_update", jSONObject3.getBoolean("app_update"));
                    edit2.putInt("app_version_code", Integer.parseInt(jSONObject3.getString("app_version_code")));
                    edit2.putString("update_note", jSONObject3.getString("update_note"));
                    edit2.putString("update_link", jSONObject3.getString("update_link"));
                    edit2.putInt("newapp", Integer.parseInt(jSONObject3.getString("newapp")));
                    edit2.putString("newappimage", jSONObject3.getString("newappimage"));
                    String str15 = str5;
                    edit2.putString(str15, jSONObject3.getString(str15));
                    String str16 = str6;
                    edit2.putInt(str16, Integer.parseInt(jSONObject3.getString(str16)));
                    String str17 = str11;
                    edit2.putString(str17, jSONObject3.getString(str17));
                    String str18 = str10;
                    edit2.putString(str18, jSONObject3.getString(str18));
                    String str19 = str9;
                    edit2.putString(str19, jSONObject3.getString(str19));
                    edit2.putString("fanInterstital1", jSONObject3.getString("fanInterstital1"));
                    edit2.putString("fanInterstital", jSONObject3.getString("fanInterstital"));
                    edit2.putString("fanBanner", jSONObject3.getString("fanBanner"));
                    edit2.putString("appNext", jSONObject3.getString("appNext"));
                    edit2.putString("appType", jSONObject3.getString("appType"));
                    edit2.putString(b9.h.V, jSONObject3.getString(b9.h.V));
                    edit2.putString("app_name", jSONObject3.getString("app_name"));
                    edit2.putInt("vp", Integer.parseInt(jSONObject3.getString("vp")));
                    edit2.putString("privacy_policy", jSONObject3.getString("privacy_policy"));
                    str8 = str14;
                    edit2.putString(str8, jSONObject3.getString(str8));
                    edit2.putString("reload", jSONObject3.getString("reload"));
                    edit2.putString("startapp", jSONObject3.getString("startapp"));
                    edit2.putString("startapp_video", jSONObject3.getString("startapp_video"));
                    edit2.putString("u1", jSONObject3.getString("u1"));
                    edit2.putString("a1", jSONObject3.getString("a1"));
                    edit2.putInt("time", Integer.parseInt(jSONObject3.getString("time")));
                    edit2.putInt("i_time", Integer.parseInt(jSONObject3.getString("i_time")));
                    edit2.putString("noti", jSONObject3.getString("noti"));
                    edit2.putString("sub", jSONObject3.getString("sub"));
                    edit2.putString("watermark", jSONObject3.getString("watermark"));
                    edit2.putString("watermark_color", jSONObject3.getString("watermark_color"));
                    edit2.putString("watermark_margin", jSONObject3.getString("watermark_margin"));
                    edit2.putString("p_check", jSONObject3.getString("p_check"));
                    edit2.putString("is_id", jSONObject3.getString("is_id"));
                    edit2.putString("p_check_popup", jSONObject3.getString("p_check_popup"));
                    String str20 = str13;
                    if (jSONObject3.has(str20)) {
                        edit2.putString(str20, jSONObject3.getString(str20));
                    }
                    String str21 = str12;
                    if (jSONObject3.has(str21)) {
                        edit2.putString(str21, jSONObject3.getString(str21));
                    }
                    if (jSONObject.has(str7)) {
                        JSONArray jSONArray3 = new JSONArray(new String(l0Var.a(jSONObject.getString(str7))));
                        edit2.putString("cat", String.valueOf(l0Var.a(jSONObject.getString(str7))));
                        jSONArray2 = jSONArray3;
                    } else {
                        jSONArray2 = new JSONArray(jSONObject.getString("main_v1"));
                        edit2.putString("cat", jSONObject.getString("main_v1"));
                    }
                    edit2.commit();
                } else {
                    str8 = str14;
                }
                dVar = this;
            } catch (Exception unused2) {
                dVar = this;
                str4 = "";
            }
            try {
                str4 = "";
            } catch (Exception unused3) {
                str4 = "";
                Home.this.j(str4);
            }
            try {
                if (Home.this.f10177j.getString(str8, str4).startsWith("www") || Home.this.f10177j.getString(str8, str4).startsWith("http")) {
                    ImageView imageView = (ImageView) Home.this.findViewById(2131362175);
                    com.bumptech.glide.b.u(imageView).r(Home.this.f10177j.getString(str8, str4)).i(2131231168).T(2131231184).s0(imageView);
                }
                if (Home.this.f10177j.getInt("app_version_code", 0) > 3 && Home.this.f10175h.getVisibility() == 0) {
                    Home.this.f10176i.setVisibility(0);
                    com.bumptech.glide.b.u(Home.this.f10184q).q(2131689475).T(2131231120).s0(Home.this.f10184q);
                    Home.this.f10181n.setText("Update available!");
                    if (Home.this.f10177j.getString("update_note", str4).startsWith("<")) {
                        Home.this.f10183p.setBackgroundColor(0);
                        Home.this.f10183p.loadDataWithBaseURL(null, "<html><head><style data=\"text/css\">a {\n      color: #FF0000;\n      }@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/righteous_regular.ttf\")}body{align-items: center; justify-content: center; width: 100%; height: 100%; font-family: MyFont;color: #ffffff;text-align:center;font-size:20px;margin-left:0px;line-height:1.2}</style>    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no\">\n</head><body><div class=\"separator\"  style=\"clear: both; text-align: center; width: 100%;\">" + Home.this.f10177j.getString("update_note", str4) + "</div></body></html>", "text/html; charset=UTF-8", cc.N, null);
                        Home.this.f10183p.setOnLongClickListener(new a());
                        Home.this.f10183p.setLongClickable(false);
                    } else {
                        Home home = Home.this;
                        home.f10182o.setText(home.f10177j.getString("update_note", str4));
                    }
                    Home.this.f10185r.setText("Update Now");
                    Home.this.f10186s.setText("Update Later");
                    if (Home.this.f10177j.getBoolean("app_update", false)) {
                        Home.this.f10186s.setVisibility(8);
                        return;
                    }
                }
                if (Home.this.f10177j.getInt("newapp", 0) == 1) {
                    Home.this.f10175h.setVisibility(8);
                    com.bumptech.glide.b.u(Home.this.f10184q).r(Home.this.f10177j.getString("newappimage", str4)).i(2131231168).T(2131231184).s0(Home.this.f10184q);
                    Home.this.f10181n.setText("New App Available!");
                    if (Home.this.f10177j.getString("update_note", str4).startsWith("<")) {
                        Home.this.f10183p.setBackgroundColor(0);
                        Home.this.f10183p.loadDataWithBaseURL(null, "<html><head><style data=\"text/css\">a {\n      color: #FF0000;\n      }@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/righteous_regular.ttf\")}body{align-items: center; justify-content: center; width: 100%; height: 100%; font-family: MyFont;color: #ffffff;text-align:center;font-size:20px;margin-left:0px;line-height:1.2}</style>    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no\">\n</head><body><div class=\"separator\"  style=\"clear: both; text-align: center; width: 100%;\">" + Home.this.f10177j.getString("update_note", str4) + "</div></body></html>", "text/html; charset=UTF-8", cc.N, null);
                        Home.this.f10183p.setOnLongClickListener(new b());
                        Home.this.f10183p.setLongClickable(false);
                    } else {
                        Home home2 = Home.this;
                        home2.f10182o.setText(home2.f10177j.getString("update_note", str4));
                    }
                    Home.this.f10185r.setText("INSTALL NOW");
                    Home.this.f10186s.setText("Update Later");
                    Home.this.f10186s.setVisibility(8);
                    Home.this.f10176i.setVisibility(0);
                    Intent launchIntentForPackage = Home.this.getPackageManager().getLaunchIntentForPackage(Home.this.f10177j.getString("update_link", str4).split(b9.i.f16692b)[1].split(b9.i.f16694c)[0]);
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(268435456);
                        Home.this.startActivity(launchIntentForPackage);
                        Home.this.finish();
                        return;
                    }
                    return;
                }
                Home.this.h();
                p1.a[] aVarArr = new p1.a[jSONArray2.length()];
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                    aVarArr[i10] = new p1.a(jSONObject4.getString("category_image"), jSONObject4.getString("category_name"), jSONObject4.getString("cid"), jSONObject4.getString("cat_url"));
                }
                Home.this.f10168a = new ArrayList<>(Arrays.asList(aVarArr));
                Home home3 = Home.this;
                home3.i(home3.getApplicationContext());
            } catch (Exception unused4) {
                Home.this.j(str4);
            }
        }

        @Override // r1.c
        public void onError(String str, String str2) {
            Home home = Home.this;
            if (home.f10190w < 2) {
                if (com.ariabolds.dateobjectz.c.f10244b.equals(l0.f33541f)) {
                    com.ariabolds.dateobjectz.c.f10244b = l0.f33542g;
                    Home.this.g();
                    return;
                } else if (com.ariabolds.dateobjectz.c.f10244b.equals(l0.f33542g)) {
                    com.ariabolds.dateobjectz.c.f10244b = l0.f33541f;
                    Home.this.g();
                    return;
                }
            } else {
                home.f10190w = 0;
            }
            if (str != null) {
                if (!str.toLowerCase().contains("timeout") && !str.toLowerCase().contains("404")) {
                    Home.this.j(str);
                    return;
                }
                try {
                    if (Home.this.f10177j.getString("cat", "") != "") {
                        JSONArray jSONArray = new JSONArray(Home.this.f10177j.getString("cat", ""));
                        p1.a[] aVarArr = new p1.a[jSONArray.length()];
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            aVarArr[i10] = new p1.a(jSONObject.getString("category_image"), jSONObject.getString("category_name"), jSONObject.getString("cid"), jSONObject.getString("cat_url"));
                        }
                        Home.this.f();
                        Home.this.h();
                        Home.this.f10168a = new ArrayList<>(Arrays.asList(aVarArr));
                        Home home2 = Home.this;
                        home2.i(home2.getApplicationContext());
                        return;
                    }
                    Home.this.j(str);
                    return;
                } catch (Exception unused) {
                    Home.this.j(str);
                    return;
                }
            }
            Home.this.j(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Home.this.findViewById(2131362109).setVisibility(8);
            Home.this.f10175h.setVisibility(0);
            Home.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements OnAdLoaded {
        f() {
        }

        @Override // com.appnext.core.callbacks.OnAdLoaded
        public void adLoaded(String str, AppnextAdCreativeType appnextAdCreativeType) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements OnAdOpened {
        g() {
        }

        @Override // com.appnext.core.callbacks.OnAdOpened
        public void adOpened() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements OnAdClicked {
        h() {
        }

        @Override // com.appnext.core.callbacks.OnAdClicked
        public void adClicked() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements OnAdClosed {
        i() {
        }

        @Override // com.appnext.core.callbacks.OnAdClosed
        public void onAdClosed() {
            Home.f10166y.loadAd();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class j implements AppLovinSdk.SdkInitializationListener {
        j() {
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            if (Home.this.f10177j.getString("applovin_app_open", "").equals("0")) {
                return;
            }
            Home home = Home.this;
            home.f10191x = new ApplovinAppOpenManager(home.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k implements OnAdError {
        k() {
        }

        @Override // com.appnext.core.callbacks.OnAdError
        public void adError(String str) {
            Log.d(Home.this.f10180m, str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class l implements InitializationListener {
        l() {
        }

        @Override // com.ironsource.mediationsdk.sdk.InitializationListener
        public void onInitializationComplete() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Home.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Home.this.f10177j.getString("update_link", ""))));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Home.this.f10176i.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class o implements LevelPlayInterstitialListener {
        o() {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(AdInfo adInfo) {
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(AdInfo adInfo) {
            IronSource.loadInterstitial();
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(IronSourceError ironSourceError) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class p implements MaxAdListener {
        p() {
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
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            Home.A = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class q implements MaxAdViewAdListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxAdView f10211a;

        q(MaxAdView maxAdView) {
            this.f10211a = maxAdView;
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
            this.f10211a.stopAutoRefresh();
            Home.this.f10188u.setVisibility(8);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            this.f10211a.startAutoRefresh();
            Home.this.f10188u.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class r implements a.b {
        r() {
        }

        @Override // q1.a.b
        public void a(View view, p1.a aVar, int i10) {
            if (!aVar.c().startsWith("http") && !aVar.c().startsWith("www") && !aVar.c().startsWith("market")) {
                Intent intent = new Intent(Home.this.getApplicationContext(), DA.class);
                intent.putExtra("cid", aVar.a());
                intent.putExtra("cat_name", aVar.b());
                Home.this.startActivity(intent);
            } else if (aVar.c().startsWith("market")) {
                Home.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aVar.c())));
            } else {
                Intent intent2 = new Intent(Home.this.getApplicationContext(), WSP.class);
                intent2.putExtra("agent", "");
                intent2.putExtra("url", aVar.c());
                Home.this.startActivity(intent2);
            }
            try {
                if (Home.this.f10177j.getString("adsNetwork", "").equals(AdColonyAppOptions.IRONSOURCE)) {
                    if (IronSource.isInterstitialReady()) {
                        if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                            IronSource.showInterstitial();
                            com.ariabolds.dateobjectz.b.a().c(Home.this.f10177j.getInt("interstital_ad_click", 1));
                            return;
                        }
                    } else if (!IronSource.isInterstitialReady()) {
                        IronSource.loadInterstitial();
                    }
                }
                if (Home.this.f10177j.getString("adsNetwork", "").equals("AppLovin")) {
                    if (Home.f10167z.isReady()) {
                        if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                            Home.f10167z.showAd();
                            com.ariabolds.dateobjectz.b.a().c(Home.this.f10177j.getInt("interstital_ad_click", 1));
                            return;
                        }
                    } else if (!Home.f10167z.isReady()) {
                        Home.f10167z.loadAd();
                    }
                }
                if (Home.f10166y.isAdLoaded()) {
                    if (com.ariabolds.dateobjectz.b.a().b() <= 1) {
                        Home.f10166y.showAd();
                        com.ariabolds.dateobjectz.b.a().c(Home.this.f10177j.getInt("interstital_ad_click", 1));
                        return;
                    }
                    com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
                    return;
                }
                Interstitial interstitial = Home.f10166y;
                if (interstitial != null && !interstitial.isAdLoaded()) {
                    Home.f10166y.loadAd();
                }
                if (Home.this.f10189v.isReady() && com.ariabolds.dateobjectz.b.a().b() <= 1) {
                    Home.this.f10189v.showAd();
                    com.ariabolds.dateobjectz.b.a().c(Home.this.f10177j.getInt("interstital_ad_click", 1));
                    return;
                }
                com.ariabolds.dateobjectz.b.a().c(com.ariabolds.dateobjectz.b.a().b() - 1);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class s implements SwipeRefreshLayout.j {
        s() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            Home.this.f10171d.d();
            Home.this.findViewById(2131362217).setVisibility(8);
            Home.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f10190w++;
        this.f10173f.setRefreshing(true);
        this.f10174g.setRefreshing(true);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10173f.setRefreshing(true);
                this.f10174g.setRefreshing(true);
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10173f.setRefreshing(true);
                this.f10174g.setRefreshing(true);
            } catch (Exception unused2) {
            }
        }
        new r1.a(getApplicationContext(), com.ariabolds.dateobjectz.c.f10244b + com.ariabolds.dateobjectz.c.f10243a + "get_ads_config.js", new d()).execute(new Void[0]);
    }

    void f() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (this.f10177j.getString("interstital_ad", "false").equals("false")) {
                    return;
                }
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                if (this.f10177j.getString("interstital_ad", "false").equals("false")) {
                    return;
                }
            } catch (Exception unused2) {
            }
        }
        if (this.f10177j.getString("interstital_ad", "false").equals("false")) {
            return;
        }
        if (this.f10177j.getString("startapp", "").equals(com.ironsource.mediationsdk.metadata.a.f18924g)) {
            if (this.f10177j.getString("startapp_video", "").equals(com.ironsource.mediationsdk.metadata.a.f18924g)) {
                this.f10189v.loadAd(StartAppAd.AdMode.VIDEO);
            } else {
                this.f10189v.loadAd();
            }
        }
        if (this.f10177j.getString("adsNetwork", "").equals(AdColonyAppOptions.IRONSOURCE)) {
            IronSource.setLevelPlayInterstitialListener(new o());
            IronSource.loadInterstitial();
            new com.ariabolds.dateobjectz.a(this.f10188u, this);
        }
        if (this.f10177j.getString("adsNetwork", "").equals("AppLovin")) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(this.f10177j.getString("fanInterstital", ""), this);
            f10167z = maxInterstitialAd;
            maxInterstitialAd.setListener(new p());
            f10167z.loadAd();
            this.f10188u.removeAllViews();
            MaxAdView maxAdView = new MaxAdView(this.f10177j.getString("fanBanner", ""), this);
            maxAdView.setListener(new q(maxAdView));
            int dpToPx = AppLovinSdkUtils.dpToPx(this, MaxAdFormat.BANNER.getAdaptiveSize(this).getHeight());
            maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, dpToPx));
            maxAdView.setExtraParameter("adaptive_banner", com.ironsource.mediationsdk.metadata.a.f18924g);
            maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, dpToPx));
            maxAdView.setBackgroundColor(0);
            this.f10188u.addView(maxAdView);
            maxAdView.loadAd();
        }
    }

    public void h() {
        Interstitial interstitial = f10166y;
        if (interstitial == null || !interstitial.isAdLoaded()) {
            Interstitial interstitial2 = new Interstitial(this, this.f10177j.getString("appNext", "000000000000"));
            f10166y = interstitial2;
            interstitial2.setAutoPlay(true);
            f10166y.setMute(true);
            f10166y.setBackButtonCanClose(false);
            f10166y.setOnAdLoadedCallback(new f());
            f10166y.setOnAdOpenedCallback(new g());
            f10166y.setOnAdClickedCallback(new h());
            f10166y.setOnAdClosedCallback(new i());
            f10166y.setOnAdErrorCallback(new k());
            f10166y.loadAd();
        }
    }

    public void i(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10169b = (RecyclerView) findViewById(2131362377);
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10169b = (RecyclerView) findViewById(2131362377);
            } catch (Exception unused2) {
            }
        }
        if (this.f10168a.size() == 0) {
            View findViewById = findViewById(2131362217);
            ImageView imageView = (ImageView) findViewById(2131362308);
            com.bumptech.glide.b.u(imageView).q(2131231169).T(2131231120).s0(imageView);
            findViewById.setVisibility(0);
        }
        this.f10173f.setRefreshing(false);
        this.f10174g.setRefreshing(false);
        this.f10169b = (RecyclerView) findViewById(2131362377);
        this.f10172e = new LinearLayoutManager(context);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
        this.f10170c = staggeredGridLayoutManager;
        this.f10169b.setLayoutManager(staggeredGridLayoutManager);
        q1.a aVar = new q1.a(this.f10168a, context);
        this.f10171d = aVar;
        aVar.e(new r());
        this.f10169b.setAdapter(this.f10171d);
        if (!this.f10177j.getString("privacy_policy", "").equals("")) {
            WebView webView = (WebView) findViewById(2131362540);
            this.f10179l = webView;
            webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            this.f10179l.setVisibility(0);
            this.f10179l.setBackgroundColor(0);
            this.f10179l.getSettings().setEnableSmoothTransition(true);
            this.f10179l.getSettings().setDefaultTextEncodingName("UTF-8");
            this.f10179l.getSettings().setJavaScriptEnabled(true);
            this.f10179l.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.f10179l.getSettings().setDomStorageEnabled(true);
            this.f10179l.getSettings().setUseWideViewPort(true);
            this.f10179l.getSettings().setLoadWithOverviewMode(true);
            this.f10179l.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f10179l.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            String str = "<html><head><style data=\"text/css\">a {\n      color: red;\n      }@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/righteous_regular.ttf\")}body{align-items: center; justify-content: center; width: 100%; height: 100%; font-family: MyFont;color: #ffffff;text-align:center;font-size:20px;margin-left:0px;line-height:1.2}</style>    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\">\n</head><body><div class=\"separator\"  style=\"clear: both; text-align: center; width: 100%;\">" + this.f10177j.getString("privacy_policy", "") + "</div></body></html>";
            if (this.f10177j.getString("privacy_policy", "").startsWith("<html>")) {
                this.f10179l.loadDataWithBaseURL(null, this.f10177j.getString("privacy_policy", ""), "text/html; charset=UTF-8", cc.N, null);
            } else {
                this.f10179l.loadDataWithBaseURL(null, str, "text/html; charset=UTF-8", cc.N, null);
            }
        } else {
            WebView webView2 = (WebView) findViewById(2131362540);
            this.f10179l = webView2;
            webView2.setVisibility(8);
        }
        this.f10173f.setOnRefreshListener(new s());
        this.f10174g.setOnRefreshListener(new a());
        if (this.f10175h.getVisibility() == 0) {
            new Handler().postDelayed(new b(), 6000L);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(0);
            if (getSupportActionBar() != null) {
                getSupportActionBar().x();
            }
        }
        if (this.f10177j.getString("appType", "").toLowerCase().equals("score")) {
            findViewById(2131362380).setVisibility(0);
            this.f10169b.setVisibility(8);
            this.f10178k.setVisibility(0);
            this.f10178k.setBackgroundColor(0);
            this.f10178k.setFocusableInTouchMode(false);
            this.f10178k.setFocusable(false);
            this.f10178k.getSettings().setEnableSmoothTransition(true);
            this.f10178k.getSettings().setDefaultTextEncodingName("UTF-8");
            this.f10178k.getSettings().setJavaScriptEnabled(true);
            this.f10178k.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.f10178k.getSettings().setSupportMultipleWindows(true);
            this.f10178k.getSettings().setDomStorageEnabled(true);
            this.f10178k.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
            this.f10178k.getSettings().setMediaPlaybackRequiresUserGesture(false);
            this.f10178k.getSettings().setUseWideViewPort(true);
            this.f10178k.getSettings().setLoadWithOverviewMode(true);
            this.f10178k.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            this.f10178k.canGoBack();
            this.f10178k.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f10178k.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            this.f10178k.loadUrl(this.f10177j.getString("api_url", ""));
            this.f10178k.setWebViewClient(new c());
            this.f10178k.setWebChromeClient(new WebChromeClient() { // from class: com.ariabolds.dateobjectz.Home.13

                /* renamed from: com.ariabolds.dateobjectz.Home$13$a */
                /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
                class a extends WebViewClient {
                    a() {
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        if (str.equals("https://www.scorebat.com/") || str.contains("utm_campaign=match") || str.equals("https://www.scorebat.com/video-widget/") || str.equals("https://www.scorebat.com/free-livescore-widget/")) {
                            return true;
                        }
                        Home.this.f10178k.loadUrl(str);
                        return true;
                    }
                }

                @Override // android.webkit.WebChromeClient
                public boolean onCreateWindow(WebView webView3, boolean z10, boolean z11, Message message) {
                    WebView webView4 = new WebView(webView3.getContext());
                    webView4.setWebViewClient(new a());
                    ((WebView.WebViewTransport) message.obj).setWebView(webView4);
                    message.sendToTarget();
                    return true;
                }
            });
            return;
        }
        this.f10169b.setVisibility(0);
        findViewById(2131362380).setVisibility(8);
        this.f10178k.setVisibility(8);
    }

    public void j(String str) {
        ((Button) findViewById(2131362111)).setOnClickListener(new e());
        q1.a aVar = this.f10171d;
        if (aVar != null) {
            aVar.d();
        }
        this.f10173f.setRefreshing(false);
        this.f10175h.setVisibility(8);
        if (str == null) {
            findViewById(2131362109).setVisibility(0);
            this.f10173f.setRefreshing(false);
            return;
        }
        View findViewById = findViewById(2131362109);
        TextView textView = (TextView) findViewById(2131362110);
        if (str.contains("404")) {
            textView.setText("The app is under maintenance, please visit again few moment later");
        } else if (str.contains("timeout")) {
            textView.setText("Please wait a moment We'll be back shortly.\nThe app is under maintenance, please visit again few moment later");
        } else {
            textView.setText("The app is under maintenance, please visit again few moment later");
        }
        findViewById.setVisibility(0);
        this.f10173f.setRefreshing(false);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f10178k.canGoBack()) {
            this.f10178k.goBack();
        } else if (System.currentTimeMillis() - this.f10187t > 2000) {
            Toast.makeText(this, "Press again to exit app", 0).show();
            this.f10187t = System.currentTimeMillis();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558429);
        if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.a(this, "android.permission.POST_NOTIFICATIONS") == -1) {
            androidx.core.app.b.r(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 101);
        }
        Appnext.init(getApplicationContext());
        this.f10177j = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        StartAppSDK.setUserConsent(this, "pas", System.currentTimeMillis(), true);
        StartAppSDK.getExtras(this).edit().putString("IABUSPrivacy_String", "1YNN").apply();
        StartAppSDK.init((Context) this, "203473016", false);
        this.f10189v = new StartAppAd(this);
        AppLovinSdk.getInstance(this).setMediationProvider(AppLovinMediationProvider.MAX);
        AudienceNetworkAds.initialize(getApplicationContext());
        Appnext.init(getApplicationContext());
        try {
            getWindow().getDecorView().setSystemUiVisibility(4102);
            if (getSupportActionBar() != null) {
                getSupportActionBar().k();
            }
        } catch (Exception unused) {
        }
        AppLovinPrivacySettings.setHasUserConsent(true, getApplicationContext());
        AppLovinSdk.initializeSdk(this, new j());
        IronSource.setConsent(true);
        IronSource.setMetaData("AdMob_TFCD", "false");
        IronSource.setMetaData("AdMob_TFUA", com.ironsource.mediationsdk.metadata.a.f18924g);
        IronSource.setMetaData("AppLovin_AgeRestrictedUser", com.ironsource.mediationsdk.metadata.a.f18924g);
        IronSource.setMetaData("UnityAds_coppa", "false");
        IronSource.setAdaptersDebug(true);
        IronSource.init(this, this.f10177j.getString("is_id", ""), new l());
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10177j = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            } catch (Exception unused2) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10177j = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            } catch (Exception unused3) {
            }
        }
        if (this.f10177j.getString("intro", "").startsWith("www") || this.f10177j.getString("intro", "").startsWith("http")) {
            ImageView imageView = (ImageView) findViewById(2131362175);
            com.bumptech.glide.b.u(imageView).r(this.f10177j.getString("intro", "")).i(2131231168).T(2131231184).s0(imageView);
        }
        com.bumptech.glide.b.u((ImageView) findViewById(2131362212)).l().u0(2131231138).i(2131231168).T(2131231184).s0((ImageView) findViewById(2131362212));
        com.bumptech.glide.b.u((ImageView) findViewById(2131362132)).l().u0(2131231138).i(2131231168).T(2131231184).s0((ImageView) findViewById(2131362132));
        this.f10178k = (WebView) findViewById(2131362539);
        this.f10175h = (RelativeLayout) findViewById(2131362214);
        this.f10176i = findViewById(2131362522);
        this.f10181n = (TextView) findViewById(2131362525);
        this.f10182o = (TextView) findViewById(2131362523);
        this.f10183p = (WebView) findViewById(2131362524);
        this.f10184q = (ImageView) findViewById(2131362154);
        this.f10185r = (Button) findViewById(2131362316);
        this.f10186s = (Button) findViewById(2131362304);
        this.f10185r.setOnClickListener(new m());
        this.f10186s.setOnClickListener(new n());
        this.f10173f = (SwipeRefreshLayout) findViewById(2131362454);
        this.f10174g = (SwipeRefreshLayout) findViewById(2131362455);
        this.f10173f.setColorSchemeResources(2131100284, 2131099805, 2131099710, 2131100294);
        this.f10174g.setColorSchemeResources(2131100284, 2131099805, 2131099710, 2131100294);
        this.f10188u = (FrameLayout) findViewById(2131361930);
        g();
        f();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131623938, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131362354) {
            String packageName = getPackageName();
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f10177j.getString("update_link", ""))));
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + packageName)));
            }
            return true;
        } else if (itemId == 2131362362) {
            g();
            return true;
        } else if (itemId != 2131362406) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            String obj = Html.fromHtml("Football Live Streaming App").toString();
            String obj2 = Html.fromHtml("I Would like to share this with you. Here You Can Download This Application from this link").toString();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            if (this.f10177j.getString("update_link", "").startsWith("market")) {
                String[] split = this.f10177j.getString("update_link", "").split(b9.i.f16692b);
                String str = split[0];
                String str2 = split[1];
                intent.putExtra("android.intent.extra.TEXT", obj + "\n\n" + obj2 + "\n\nhttp://play.google.com/store/apps/details?id=" + str2);
            } else {
                intent.putExtra("android.intent.extra.TEXT", obj + "\n\n" + obj2 + "\n\n" + this.f10177j.getString("update_link", ""));
            }
            intent.setType("text/plain");
            startActivity(intent);
            return true;
        }
    }
}
