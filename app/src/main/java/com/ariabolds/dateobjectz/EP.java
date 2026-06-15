package com.ariabolds.dateobjectz;

import a5.p0;
import a5.t;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import b5.a0;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.PlayerView;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.ug;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.k;
import n3.l2;
import n3.l3;
import n3.m;
import n3.o;
import n3.o2;
import n3.p2;
import n3.q3;
import n3.r2;
import n3.s;
import n3.u1;
import n3.z1;
import org.json.JSONObject;
import x4.a;
import y4.p;
import z4.b0;
import z4.l;
import z4.l0;
import z4.u;
import z4.v;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class EP extends AppCompatActivity {
    TextView A;
    MaxInterstitialAd C;
    String D;
    WebView E;

    /* renamed from: b  reason: collision with root package name */
    String f10112b;

    /* renamed from: c  reason: collision with root package name */
    String f10113c;

    /* renamed from: o  reason: collision with root package name */
    JSONObject f10125o;

    /* renamed from: q  reason: collision with root package name */
    private PlayerView f10127q;

    /* renamed from: r  reason: collision with root package name */
    private s f10128r;

    /* renamed from: t  reason: collision with root package name */
    public l.a f10130t;

    /* renamed from: u  reason: collision with root package name */
    private Handler f10131u;

    /* renamed from: v  reason: collision with root package name */
    private View f10132v;

    /* renamed from: w  reason: collision with root package name */
    ImageView f10133w;

    /* renamed from: x  reason: collision with root package name */
    TextView f10134x;

    /* renamed from: z  reason: collision with root package name */
    SharedPreferences f10136z;

    /* renamed from: a  reason: collision with root package name */
    String f10111a = "EXOP";

    /* renamed from: d  reason: collision with root package name */
    String f10114d = "0";

    /* renamed from: e  reason: collision with root package name */
    String f10115e = "";

    /* renamed from: f  reason: collision with root package name */
    String f10116f = "";

    /* renamed from: g  reason: collision with root package name */
    String f10117g = "";

    /* renamed from: h  reason: collision with root package name */
    String f10118h = "";

    /* renamed from: i  reason: collision with root package name */
    String f10119i = "";

    /* renamed from: j  reason: collision with root package name */
    String f10120j = "";

    /* renamed from: k  reason: collision with root package name */
    String f10121k = "";

    /* renamed from: l  reason: collision with root package name */
    String f10122l = "";

    /* renamed from: m  reason: collision with root package name */
    String f10123m = "";

    /* renamed from: n  reason: collision with root package name */
    String f10124n = "";

    /* renamed from: p  reason: collision with root package name */
    boolean f10126p = true;

    /* renamed from: s  reason: collision with root package name */
    z4.s f10129s = new z4.s();

    /* renamed from: y  reason: collision with root package name */
    int f10135y = 0;
    boolean B = false;
    int F = 0;
    int G = 0;
    private BroadcastReceiver H = new a();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String stringExtra = intent.getStringExtra("name");
                Locale locale = Locale.ROOT;
                if (EP.this.f10120j.toLowerCase(locale).split(" vs")[0].equals(stringExtra.toLowerCase(locale).split(" vs")[0])) {
                    EP.this.u();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements MaxAdListener {
        b() {
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
            EP.this.B = false;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (EP.this.C.isReady()) {
                EP ep = EP.this;
                ep.B = true;
                ep.C.showAd();
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements p2.d {
        c() {
        }

        @Override // n3.p2.d
        public /* synthetic */ void B(boolean z10) {
            r2.i(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void D(o oVar) {
            r2.d(this, oVar);
        }

        @Override // n3.p2.d
        public void F(int i10) {
            String str = EP.this.f10111a;
            Log.d(str, "onPlayerStateChanged: " + i10);
            if (i10 == 3) {
                EP.this.f10132v.setVisibility(8);
                EP.this.f10126p = true;
            }
            if (i10 == 2) {
                if (EP.this.f10119i.equals("GETURL")) {
                    EP.this.q();
                }
                EP.this.f10132v.setVisibility(0);
            } else if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                EP.this.t("0");
            } else {
                EP ep = EP.this;
                ep.f10135y = 0;
                ep.f10132v.setVisibility(8);
                EP.this.f10126p = true;
            }
        }

        @Override // n3.p2.d
        public void K(boolean z10) {
        }

        @Override // n3.p2.d
        public /* synthetic */ void L(int i10, boolean z10) {
            r2.e(this, i10, z10);
        }

        @Override // n3.p2.d
        public void N(l3 l3Var, int i10) {
        }

        @Override // n3.p2.d
        public /* synthetic */ void O(z1 z1Var) {
            r2.k(this, z1Var);
        }

        @Override // n3.p2.d
        public void P(l2 l2Var) {
            Log.e(EP.this.f10111a, "onPlayerError: ", l2Var);
            EP ep = EP.this;
            int i10 = ep.f10135y + 1;
            ep.f10135y = i10;
            if (i10 < 10) {
                ep.t(String.valueOf(l2Var.fillInStackTrace().getCause().getMessage()));
            } else {
                ep.p();
            }
        }

        @Override // n3.p2.d
        public /* synthetic */ void Q() {
            r2.v(this);
        }

        @Override // n3.p2.d
        public /* synthetic */ void R(p2 p2Var, p2.c cVar) {
            r2.f(this, p2Var, cVar);
        }

        @Override // n3.p2.d
        public /* synthetic */ void T(u1 u1Var, int i10) {
            r2.j(this, u1Var, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void U(int i10, int i11) {
            r2.A(this, i10, i11);
        }

        @Override // n3.p2.d
        public /* synthetic */ void V(p2.e eVar, p2.e eVar2, int i10) {
            r2.u(this, eVar, eVar2, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void W(p2.b bVar) {
            r2.a(this, bVar);
        }

        @Override // n3.p2.d
        public /* synthetic */ void Y(int i10) {
            r2.t(this, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void a(boolean z10) {
            r2.z(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void a0(boolean z10) {
            r2.g(this, z10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void b0() {
            r2.x(this);
        }

        @Override // n3.p2.d
        public /* synthetic */ void d0(boolean z10, int i10) {
            r2.s(this, z10, i10);
        }

        @Override // n3.p2.d
        public /* synthetic */ void g(Metadata metadata) {
            r2.l(this, metadata);
        }

        @Override // n3.p2.d
        public void g0(boolean z10, int i10) {
        }

        @Override // n3.p2.d
        public void h(List<n4.b> list) {
        }

        @Override // n3.p2.d
        public void k0(l2 l2Var) {
            String str = EP.this.f10111a;
            t.b(str, "onPlayerErrorChanged " + l2Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void m0(q3 q3Var) {
            r2.C(this, q3Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void n(n4.e eVar) {
            r2.c(this, eVar);
        }

        @Override // n3.p2.d
        public void n0(boolean z10) {
        }

        @Override // n3.p2.d
        public void t(int i10) {
        }

        @Override // n3.p2.d
        public /* synthetic */ void u(a0 a0Var) {
            r2.D(this, a0Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void w(o2 o2Var) {
            r2.n(this, o2Var);
        }

        @Override // n3.p2.d
        public /* synthetic */ void z(int i10) {
            r2.p(this, i10);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (EP.this.getApplicationContext().getResources().getConfiguration().orientation == 1) {
                EP ep = EP.this;
                ep.f10133w.setImageDrawable(androidx.core.content.a.f(ep.getApplicationContext(), 2131231118));
                EP.this.setRequestedOrientation(0);
                EP.this.f10127q.setResizeMode(3);
                EP.this.f10127q.setControllerHideOnTouch(true);
                EP.this.f10127q.setControllerShowTimeoutMs(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
                try {
                    EP.this.getWindow().getDecorView().setSystemUiVisibility(4102);
                    if (EP.this.getSupportActionBar() != null) {
                        EP.this.getSupportActionBar().k();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            try {
                EP.this.getWindow().getDecorView().setSystemUiVisibility(4102);
                if (EP.this.getSupportActionBar() != null) {
                    EP.this.getSupportActionBar().k();
                }
            } catch (Exception unused2) {
            }
            EP ep2 = EP.this;
            ep2.f10133w.setImageDrawable(androidx.core.content.a.f(ep2.getApplicationContext(), 2131231117));
            EP.this.setRequestedOrientation(1);
            EP.this.f10127q.setResizeMode(0);
            EP.this.f10127q.setControllerHideOnTouch(true);
            EP.this.f10127q.setControllerShowTimeoutMs(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements t1.a {
        e() {
        }

        @Override // t1.a
        public void a() {
            EP.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements t1.a {
        f() {
        }

        @Override // t1.a
        public void a() {
            EP ep = EP.this;
            ep.f10135y = 0;
            ep.t("0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements r1.c {
        g() {
        }

        @Override // r1.c
        public void a(String str, String str2, String str3) {
            EP.this.f10113c = str;
            EP.this.f10128r.c(EP.this.o(Uri.parse(str), null));
            EP.this.f10128r.k(true);
        }

        @Override // r1.c
        public void onError(String str, String str2) {
            EP.this.f10128r.c(EP.this.o(Uri.parse(EP.this.f10113c), null));
            EP.this.f10128r.k(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements r1.c {
        h() {
        }

        @Override // r1.c
        public void a(String str, String str2, String str3) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("post")) {
                    JSONObject jSONObject2 = new JSONObject(new String(new l0().a(jSONObject.getString("post"))));
                    EP.this.f10113c = jSONObject2.getString("channel_url");
                    EP.this.f10116f = jSONObject2.getString(b9.h.Z);
                    EP.this.f10117g = jSONObject2.getString(cc.f16874p);
                    EP.this.f10118h = jSONObject2.getString("agent");
                    EP.this.f10119i = jSONObject2.getString("channel_type");
                    EP.this.f10124n = jSONObject2.getString("drm");
                    if (jSONObject2.has("cUrl")) {
                        EP.this.f10114d = jSONObject2.getString("cUrl");
                    }
                } else {
                    EP.this.f10113c = jSONObject.getString("channel_url");
                    EP.this.f10116f = jSONObject.getString(b9.h.Z);
                    EP.this.f10117g = jSONObject.getString(cc.f16874p);
                    EP.this.f10118h = jSONObject.getString("agent");
                    EP.this.f10119i = jSONObject.getString("channel_type");
                    EP.this.f10124n = jSONObject.getString("drm");
                    if (jSONObject.has("cUrl")) {
                        EP.this.f10114d = jSONObject.getString("cUrl");
                    }
                }
                if (EP.this.f10119i.equals("GETURL")) {
                    EP ep = EP.this;
                    ep.f10112b = ep.f10125o.getString("channel_url");
                    EP.this.q();
                } else if (EP.this.f10119i.equals("URLGETPHP")) {
                    EP.this.r();
                } else {
                    Uri parse = Uri.parse(EP.this.f10113c);
                    EP ep2 = EP.this;
                    ep2.f10130t = ep2.m(true);
                    EP.this.f10128r.c(EP.this.o(parse, null));
                    EP.this.f10128r.k(true);
                }
            } catch (Exception unused) {
                EP.this.f10128r.c(EP.this.o(Uri.parse(EP.this.f10113c), null));
                EP.this.f10128r.k(true);
            }
        }

        @Override // r1.c
        public void onError(String str, String str2) {
            EP.this.f10128r.c(EP.this.o(Uri.parse(EP.this.f10113c), null));
            EP.this.f10128r.k(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProgressDialog f10145a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!EP.this.f10113c.contains(".m3u8") && !EP.this.f10113c.contains(".mpd")) {
                    EP ep = EP.this;
                    if (ep.G < 1) {
                        ep.E.stopLoading();
                        i iVar = i.this;
                        EP.this.G++;
                        if (iVar.f10145a.isShowing()) {
                            i.this.f10145a.dismiss();
                        }
                        if (!EP.this.f10113c.startsWith("http") && !EP.this.f10113c.startsWith("www")) {
                            EP.this.E.loadDataWithBaseURL(null, "<html><head><style data=\"text/css\">a {\n      color: #8ebf42;\n      }@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/righteous_regular.ttf\")}body{width: 100%;font-family: MyFont;color: #FFFFFF;text-align:center;font-size:15px;margin-left:0px;line-height:1.2}</style></head><body>" + EP.this.f10113c + "</body></html>", "text/html; charset=UTF-8", cc.N, null);
                            return;
                        }
                        EP ep2 = EP.this;
                        ep2.E.loadUrl(ep2.f10113c);
                        return;
                    }
                    ep.E.stopLoading();
                    if (i.this.f10145a.isShowing()) {
                        i.this.f10145a.dismiss();
                    }
                    EP ep3 = EP.this;
                    if (ep3.G >= 1) {
                        ep3.G = 0;
                        Toast.makeText(ep3.getApplicationContext(), "!Something Wrong Please Try Again", 1).show();
                        EP.this.E.stopLoading();
                    }
                } else if (i.this.f10145a.isShowing()) {
                    i.this.f10145a.dismiss();
                }
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f10145a.isShowing()) {
                    i.this.f10145a.dismiss();
                }
                Toast.makeText(EP.this.getApplicationContext(), "internet not connected!", 1).show();
            }
        }

        i(ProgressDialog progressDialog) {
            this.f10145a = progressDialog;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (str.contains(".m3u8") || str.contains(".mpd")) {
                try {
                    if (Integer.valueOf(EP.this.f10114d).intValue() <= 1) {
                        if (this.f10145a.isShowing()) {
                            this.f10145a.dismiss();
                        }
                        EP.this.f10113c = str;
                        Uri parse = Uri.parse(str);
                        EP ep = EP.this;
                        ep.f10130t = ep.m(true);
                        EP.this.f10128r.c(EP.this.o(parse, null));
                        EP.this.f10128r.k(true);
                        EP.this.E.stopLoading();
                        WebView webView2 = EP.this.E;
                        if (webView2 == null) {
                            return;
                        }
                        webView2.clearHistory();
                        EP.this.E.clearCache(true);
                        EP.this.E.clearView();
                        EP.this.E.destroy();
                    } else {
                        EP ep2 = EP.this;
                        int i10 = ep2.F + 1;
                        ep2.F = i10;
                        if (i10 != Integer.valueOf(ep2.f10114d).intValue()) {
                            return;
                        }
                        if (this.f10145a.isShowing()) {
                            this.f10145a.dismiss();
                        }
                        EP.this.f10113c = str;
                        Uri parse2 = Uri.parse(str);
                        EP ep3 = EP.this;
                        ep3.f10130t = ep3.m(true);
                        EP.this.f10128r.c(EP.this.o(parse2, null));
                        EP.this.f10128r.k(true);
                        EP.this.E.stopLoading();
                        WebView webView3 = EP.this.E;
                        if (webView3 == null) {
                            return;
                        }
                        webView3.clearHistory();
                        EP.this.E.clearCache(true);
                        EP.this.E.clearView();
                        EP.this.E.destroy();
                    }
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Log.d("", "getRequestHeaders - Finished");
            new Handler().postDelayed(new a(), 3000L);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (EP.this.f10113c.equals(webResourceRequest.getUrl())) {
                new Handler().postDelayed(new b(), 3000L);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21 || !webResourceRequest.getUrl().toString().contains(".m3u8")) {
                return null;
            }
            if (webResourceRequest.getRequestHeaders().containsKey("Referer")) {
                EP.this.f10116f = webResourceRequest.getRequestHeaders().get("Referer");
                Log.d("", "getRequestHeaders - Referer " + webResourceRequest.getRequestHeaders().get("Referer") + " | " + webResourceRequest.getUrl());
            } else if (webResourceRequest.getRequestHeaders().containsKey("referer")) {
                EP.this.f10116f = webResourceRequest.getRequestHeaders().get("referer");
                Log.d("", "getRequestHeaders - referer " + webResourceRequest.getRequestHeaders().get("referer") + " | " + webResourceRequest.getUrl());
            }
            if (webResourceRequest.getRequestHeaders().containsKey("Origin")) {
                EP.this.f10117g = webResourceRequest.getRequestHeaders().get("Origin");
                Log.d("", "getRequestHeaders - Origin " + webResourceRequest.getRequestHeaders().get("Origin") + " | " + webResourceRequest.getUrl());
            } else if (webResourceRequest.getRequestHeaders().containsKey(cc.f16874p)) {
                EP.this.f10117g = webResourceRequest.getRequestHeaders().get(cc.f16874p);
                Log.d("", "getRequestHeaders - origin " + webResourceRequest.getRequestHeaders().get(cc.f16874p) + " | " + webResourceRequest.getUrl());
            }
            if (EP.this.f10118h.isEmpty()) {
                if (webResourceRequest.getRequestHeaders().containsKey("User-Agent")) {
                    EP.this.f10118h = webResourceRequest.getRequestHeaders().get("User-Agent");
                    Log.d("", "getRequestHeaders - User-Agent " + webResourceRequest.getRequestHeaders().get("User-Agent") + " | " + webResourceRequest.getUrl());
                    return null;
                } else if (webResourceRequest.getRequestHeaders().containsKey("user-agent")) {
                    EP.this.f10118h = webResourceRequest.getRequestHeaders().get("user-agent");
                    Log.d("", "getRequestHeaders - user-agent " + webResourceRequest.getRequestHeaders().get("user-agent") + " | " + webResourceRequest.getUrl());
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l.a m(boolean z10) {
        return l(z10 ? this.f10129s : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(18:70|71|4|(2:66|67)|6|7|8|(1:10)|11|12|(1:14)|15|(1:17)|18|19|(1:21)(1:63)|22|(1:(2:25|(2:27|(3:29|(1:43)|(1:(2:53|54)(2:51|52))(2:46|47))(2:55|56))(2:57|58))(2:59|60))(2:61|62))|3|4|(0)|6|7|8|(0)|11|12|(0)|15|(0)|18|19|(0)(0)|22|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: Exception -> 0x0094, TryCatch #2 {Exception -> 0x0094, blocks: (B:11:0x0028, B:13:0x0035, B:14:0x003c, B:17:0x0046, B:18:0x004b, B:20:0x0053, B:21:0x0058), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: Exception -> 0x0094, TRY_ENTER, TryCatch #2 {Exception -> 0x0094, blocks: (B:11:0x0028, B:13:0x0035, B:14:0x003c, B:17:0x0046, B:18:0x004b, B:20:0x0053, B:21:0x0058), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: Exception -> 0x0094, TryCatch #2 {Exception -> 0x0094, blocks: (B:11:0x0028, B:13:0x0035, B:14:0x003c, B:17:0x0046, B:18:0x004b, B:20:0x0053, B:21:0x0058), top: B:74:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e4.t o(android.net.Uri r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ariabolds.dateobjectz.EP.o(android.net.Uri, java.lang.String):e4.t");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        try {
            new r1.f(getApplicationContext(), this.f10112b, this.f10118h, this.f10116f, new g()).execute(new Void[0]);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f10119i.equals("URLGETPHP")) {
            ProgressDialog show = ProgressDialog.show(this, "", "Loading. Please wait...", true);
            WebView webView = this.E;
            if (webView != null) {
                try {
                    webView.clearHistory();
                    this.E.clearCache(true);
                    this.E.stopLoading();
                    this.E = null;
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.E = new WebView(this);
                } catch (Exception unused2) {
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    this.E = new WebView(this);
                } catch (Exception unused3) {
                }
            }
            WebView webView2 = new WebView(this);
            this.E = webView2;
            String userAgentString = webView2.getSettings().getUserAgentString();
            if (!this.f10118h.equals(RewardedVideo.VIDEO_MODE_DEFAULT) && !this.f10118h.isEmpty()) {
                this.E.getSettings().setUserAgentString(this.f10118h);
            } else {
                this.E.getSettings().setUserAgentString(userAgentString);
            }
            this.E.setBackgroundColor(0);
            this.E.setFocusableInTouchMode(false);
            this.E.setFocusable(false);
            this.E.getSettings().setEnableSmoothTransition(true);
            this.E.getSettings().setDefaultTextEncodingName("UTF-8");
            this.E.getSettings().setJavaScriptEnabled(true);
            this.E.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.E.getSettings().setSupportMultipleWindows(true);
            this.E.getSettings().setDomStorageEnabled(true);
            this.E.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
            if (Build.VERSION.SDK_INT >= 17) {
                this.E.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            this.E.setWebViewClient(new i(show));
            if (!this.f10113c.startsWith("http") && !this.f10113c.startsWith("www")) {
                String str = this.f10113c;
                this.E.loadDataWithBaseURL(null, "<html><head><style data=\"text/css\">a {\n      color: #8ebf42;\n      }@font-face {font-family: MyFont;src: url(\"file:///android_asset/fonts/righteous_regular.ttf\")}body{width: 100%;font-family: MyFont;color: #FFFFFF;text-align:center;font-size:15px;margin-left:0px;line-height:1.2}</style></head><body>" + str + "</body></html>", "text/html; charset=UTF-8", cc.N, null);
                return;
            }
            this.E.loadUrl(this.f10113c);
        }
    }

    private void s(String str) {
        Context applicationContext = getApplicationContext();
        new r1.a(applicationContext, com.ariabolds.dateobjectz.c.f10244b + com.ariabolds.dateobjectz.c.f10243a + "retry.js?id=" + this.f10115e + "&code=" + str, new h()).execute(new Void[0]);
    }

    private void u() {
    }

    public l.a l(z4.s sVar) {
        return new u(this, sVar, n(sVar));
    }

    public b0 n(z4.s sVar) {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (this.f10118h.isEmpty()) {
                    p0.l0(this, "");
                }
            } catch (Exception unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                if (this.f10118h.isEmpty()) {
                    p0.l0(this, "");
                }
            } catch (Exception unused2) {
            }
        }
        if (this.f10118h.isEmpty()) {
            str = p0.l0(this, "");
        } else {
            str = this.f10118h;
        }
        HashMap hashMap = new HashMap();
        if (!this.f10116f.equals("")) {
            hashMap.put("Referer", this.f10116f);
        }
        if (!this.f10117g.equals("")) {
            hashMap.put("Origin", this.f10117g);
        }
        v.b f10 = new v.b().d(true).f(str);
        f10.b(hashMap);
        return f10;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        this.f10128r.stop();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        try {
            if (i10 == 2) {
                if (!this.f10136z.getString("watermark", "").isEmpty()) {
                    p.c(getApplicationContext(), this.f10127q, this.f10136z.getString("watermark", "").toUpperCase(), this.f10136z.getString("watermark_color", ""), this.f10136z.getString("watermark_margin", "10:30:10:30|400|10:30:10:30|TR"), configuration.orientation);
                }
            } else if (i10 != 1) {
            } else {
                if (!this.f10136z.getString("watermark", "").isEmpty()) {
                    p.c(getApplicationContext(), this.f10127q, this.f10136z.getString("watermark", "").toUpperCase(), this.f10136z.getString("watermark_color", ""), this.f10136z.getString("watermark_margin", "10:30:10:30|400|10:30:10:30|TR"), configuration.orientation);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                getWindow().getDecorView().setSystemUiVisibility(4102);
            }
            if (getSupportActionBar() != null) {
                getSupportActionBar().k();
            }
        } catch (Exception unused) {
        }
        setContentView(2131558428);
        this.f10136z = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        // Ads removed
        this.f10134x = (TextView) findViewById(2131362204);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setStartOffset(20L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(-1);
        this.f10134x.startAnimation(alphaAnimation);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                this.f10133w = (ImageView) findViewById(2131362073);
            } catch (Exception unused2) {
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                this.f10133w = (ImageView) findViewById(2131362073);
            } catch (Exception unused3) {
            }
        }
        this.f10133w = (ImageView) findViewById(2131362073);
        this.f10113c = getIntent().getStringExtra("url");
        this.f10115e = getIntent().getStringExtra(ug.f21009x);
        this.f10116f = getIntent().getStringExtra(b9.h.Z);
        this.f10117g = getIntent().getStringExtra(cc.f16874p);
        this.f10118h = getIntent().getStringExtra("agent");
        this.f10119i = getIntent().getStringExtra("channel_type");
        this.f10120j = getIntent().getStringExtra("name");
        if (getIntent().hasExtra("drm")) {
            this.f10124n = getIntent().getStringExtra("drm");
        }
        if (getIntent().hasExtra("curl")) {
            this.f10114d = getIntent().getStringExtra("curl");
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        this.f10136z = defaultSharedPreferences;
        v.f33668u = defaultSharedPreferences.getString("base", "");
        v.f33669v = this.f10136z.getString("target", "");
        if (this.f10119i.equals("GETURL")) {
            this.f10112b = getIntent().getStringExtra("url");
        }
        this.f10121k = getIntent().getStringExtra("eh1");
        this.f10122l = getIntent().getStringExtra("eh2");
        this.f10123m = getIntent().getStringExtra("bandwith");
        this.A = (TextView) findViewById(2131362496);
        try {
            if (!getIntent().getStringExtra("name").split("\n")[0].split(" vs ")[1].isEmpty() && !TextUtils.isEmpty(getIntent().getStringExtra("name").split("\n")[0].split(" vs ")[1].trim())) {
                this.A.setText(getIntent().getStringExtra("name").split("\n")[0].split(" vs ")[0] + " VS " + getIntent().getStringExtra("name").split("\n")[0].split(" vs ")[1]);
            } else {
                this.A.setText(getIntent().getStringExtra("name").replace(" vs ", ""));
            }
            try {
                this.D = "";
                Matcher matcher = Pattern.compile("(\\d+)").matcher(getIntent().getStringExtra("name"));
                if (matcher.find()) {
                    this.D = matcher.group();
                }
                if (getIntent().getStringExtra("name").contains(" - ")) {
                    TextView textView = this.A;
                    textView.setText(((Object) this.A.getText()) + " ( " + (this.D + " " + getIntent().getStringExtra("name").split(" - ")[1].split(" ")[0]) + " )");
                }
            } catch (Exception unused4) {
            }
        } catch (Exception unused5) {
            this.A.setText(getIntent().getStringExtra("name").replace("\n", " ").replace("⚽", ""));
        }
        this.A.setSelected(true);
        this.f10132v = findViewById(2131362350);
        this.f10130t = m(true);
        this.f10131u = new Handler();
        new z4.s();
        new m(this);
        x4.m mVar = new x4.m(this, new a.b());
        if (!this.f10123m.equals("")) {
            mVar.Z(mVar.z().r0(Integer.valueOf(this.f10123m).intValue()).q0(true).A());
        }
        this.f10128r = new s.b(this).o(mVar).n(new k()).g();
        PlayerView playerView = (PlayerView) findViewById(2131362053);
        this.f10127q = playerView;
        playerView.setResizeMode(0);
        this.f10127q.setPlayer(this.f10128r);
        this.f10127q.setUseController(true);
        this.f10127q.setControllerHideOnTouch(true);
        this.f10127q.setControllerShowTimeoutMs(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        this.f10127q.requestFocus();
        if (this.f10119i.equals("GETURL")) {
            q();
        } else if (this.f10119i.equals("URLGETPHP") && !this.f10113c.contains(".js") && !this.f10113c.contains(".m3u8") && !this.f10113c.contains(".mpd") && !this.f10113c.contains(".mp4")) {
            r();
        } else {
            e4.t o10 = o(Uri.parse(this.f10113c), null);
            this.f10128r.c(new e4.m(o10));
            this.f10128r.c(o10);
            this.f10128r.k(true);
        }
        int i10 = getApplicationContext().getResources().getConfiguration().orientation;
        try {
            if (!this.f10136z.getString("watermark", "").isEmpty()) {
                p.c(getApplicationContext(), this.f10127q, this.f10136z.getString("watermark", "").toUpperCase(), this.f10136z.getString("watermark_color", ""), this.f10136z.getString("watermark_margin", "10:30:10:30|400|10:30:10:30|TR"), i10);
            }
        } catch (Exception unused6) {
        }
        this.f10128r.x(new c());
        findViewById(2131362073).setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f10128r.stop();
        this.f10128r.I();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (!this.B) {
            LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.H);
            this.f10128r.stop();
            this.f10128r.I();
            finish();
            return;
        }
        this.f10128r.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.B) {
            this.f10128r.e();
        }
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.H, new IntentFilter("myNotification"));
    }

    public void p() {
        new s1.b(this).l("Server Down").k("My Be Server Down Please Try Another Server Or Retry").h(2131099781).j(2131231115, 2131100315).g(false).t("Retry").v(2131099781).u(2131100315).p("Cancel").r(2131099781).q(2131100315).s(new f()).o(new e()).m();
    }

    public void t(String str) {
        try {
            if (!str.contains("400") && !str.contains("403") && !str.contains("404") && !str.contains("500") && !str.contains("50")) {
                s("0");
            }
            s(String.valueOf(Integer.parseInt(str.replaceAll("[\\D]", ""))));
        } catch (NumberFormatException unused) {
            s("0");
        }
    }
}
