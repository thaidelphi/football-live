package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.ironsource.a3;
import com.ironsource.b9;
import com.ironsource.bh;
import com.ironsource.c4;
import com.ironsource.cc;
import com.ironsource.d10;
import com.ironsource.d9;
import com.ironsource.dp;
import com.ironsource.e9;
import com.ironsource.eh;
import com.ironsource.ep;
import com.ironsource.er;
import com.ironsource.fe;
import com.ironsource.fh;
import com.ironsource.fr;
import com.ironsource.gb;
import com.ironsource.gh;
import com.ironsource.gv;
import com.ironsource.h9;
import com.ironsource.hg;
import com.ironsource.hs;
import com.ironsource.i9;
import com.ironsource.ik;
import com.ironsource.jh;
import com.ironsource.jw;
import com.ironsource.k1;
import com.ironsource.kk;
import com.ironsource.kw;
import com.ironsource.l9;
import com.ironsource.lh;
import com.ironsource.m0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mm;
import com.ironsource.nf;
import com.ironsource.nh;
import com.ironsource.nv;
import com.ironsource.o9;
import com.ironsource.om;
import com.ironsource.po;
import com.ironsource.q9;
import com.ironsource.qe;
import com.ironsource.rk;
import com.ironsource.s3;
import com.ironsource.s9;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.m;
import com.ironsource.sdk.controller.p;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.so;
import com.ironsource.t9;
import com.ironsource.te;
import com.ironsource.to;
import com.ironsource.u9;
import com.ironsource.ue;
import com.ironsource.uo;
import com.ironsource.v8;
import com.ironsource.v9;
import com.ironsource.va;
import com.ironsource.vg;
import com.ironsource.vh;
import com.ironsource.vk;
import com.ironsource.wa;
import com.ironsource.x8;
import com.ironsource.y8;
import com.ironsource.y9;
import com.ironsource.z2;
import com.ironsource.za;
import com.ironsource.zy;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v implements com.ironsource.sdk.controller.l, po, DownloadListener {

    /* renamed from: b0  reason: collision with root package name */
    private static final String f20481b0 = "about:blank";

    /* renamed from: c0  reason: collision with root package name */
    public static int f20482c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public static String f20483d0 = "is_store";

    /* renamed from: e0  reason: collision with root package name */
    public static String f20484e0 = "external_url";

    /* renamed from: f0  reason: collision with root package name */
    public static String f20485f0 = "secondary_web_view";

    /* renamed from: g0  reason: collision with root package name */
    private static String f20486g0 = "success";

    /* renamed from: h0  reason: collision with root package name */
    private static String f20487h0 = "fail";
    private String A;
    private com.ironsource.sdk.controller.d B;
    private nv C;
    private a3 D;
    private wa G;
    private com.ironsource.sdk.controller.o H;
    private com.ironsource.sdk.controller.q I;
    private com.ironsource.sdk.controller.u J;
    private com.ironsource.sdk.controller.i K;
    private com.ironsource.sdk.controller.a L;
    private com.ironsource.sdk.controller.j M;
    private s3 N;
    private y9 O;
    private jw P;
    private com.ironsource.sdk.controller.c Q;
    private v8 R;
    private JSONObject S;
    private l.a T;
    private l.b U;
    private l9 V;
    private boolean W;
    e9 Y;
    final kk Z;

    /* renamed from: a  reason: collision with root package name */
    private final hg f20488a;

    /* renamed from: a0  reason: collision with root package name */
    private so f20489a0;

    /* renamed from: b  reason: collision with root package name */
    private h9 f20490b;

    /* renamed from: f  reason: collision with root package name */
    private String f20494f;

    /* renamed from: g  reason: collision with root package name */
    private String f20495g;

    /* renamed from: h  reason: collision with root package name */
    private final gb f20496h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20497i;

    /* renamed from: j  reason: collision with root package name */
    private p f20498j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20499k;

    /* renamed from: l  reason: collision with root package name */
    private CountDownTimer f20500l;

    /* renamed from: m  reason: collision with root package name */
    public CountDownTimer f20501m;

    /* renamed from: q  reason: collision with root package name */
    private final o f20505q;

    /* renamed from: r  reason: collision with root package name */
    private View f20506r;

    /* renamed from: s  reason: collision with root package name */
    private FrameLayout f20507s;

    /* renamed from: t  reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f20508t;

    /* renamed from: u  reason: collision with root package name */
    private FrameLayout f20509u;

    /* renamed from: v  reason: collision with root package name */
    private u f20510v;

    /* renamed from: w  reason: collision with root package name */
    private String f20511w;

    /* renamed from: x  reason: collision with root package name */
    private v9 f20512x;

    /* renamed from: y  reason: collision with root package name */
    private u9 f20513y;

    /* renamed from: z  reason: collision with root package name */
    private t9 f20514z;

    /* renamed from: c  reason: collision with root package name */
    private String f20491c = v.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private String f20492d = "IronSource";

    /* renamed from: e  reason: collision with root package name */
    private final String f20493e = "We're sorry, some error occurred. we will investigate it";

    /* renamed from: n  reason: collision with root package name */
    private int f20502n = 50;

    /* renamed from: o  reason: collision with root package name */
    private int f20503o = 50;

    /* renamed from: p  reason: collision with root package name */
    private String f20504p = b9.e.f16596b;
    private Object E = new Object();
    private boolean F = false;
    private final nf X = mm.S().f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fh f20516a;

        b(fh fhVar) {
            this.f20516a = fhVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.c cVar = v.this.Q;
            cVar.b("controller html - failed to download - " + this.f20516a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20518a;

        c(Context context) {
            this.f20518a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.e(this.f20518a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20520a;

        d(Context context) {
            this.f20520a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.f(this.f20520a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ eh.e f20522a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20523b;

        e(eh.e eVar, String str) {
            this.f20522a = eVar;
            this.f20523b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            s9 a10;
            eh.e eVar = this.f20522a;
            if ((eVar == eh.e.RewardedVideo || eVar == eh.e.Interstitial) && (a10 = v.this.a(eVar)) != null) {
                a10.a(this.f20522a, this.f20523b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f extends v8 {
        f(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.v8, com.ironsource.Cif
        public void a() {
            if (v.this.f20497i) {
                v.this.m("none");
            }
        }

        @Override // com.ironsource.v8, com.ironsource.Cif
        public void a(String str, JSONObject jSONObject) {
            if (v.this.f20497i) {
                v.this.m(str);
            }
        }

        @Override // com.ironsource.v8, com.ironsource.Cif
        public void b(String str, JSONObject jSONObject) {
            if (jSONObject == null || !v.this.f20497i) {
                return;
            }
            try {
                jSONObject.put(b9.i.f16727t, str);
                v.this.e(jSONObject);
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements jw {
        g() {
        }

        @Override // com.ironsource.jw
        public void a(String str, JSONObject jSONObject) {
            v.this.i(v.this.e(str, jSONObject.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f20527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WebView f20528b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f20529c;

        h(JSONObject jSONObject, WebView webView, String str) {
            this.f20527a = jSONObject;
            this.f20528b = webView;
            this.f20529c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(this.f20527a, this.f20528b);
            v.this.l("about:blank");
            v.this.l(this.f20529c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20531a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Q.b(b9.c.f16565j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j10, long j11, int i10) {
            super(j10, j11);
            this.f20531a = i10;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            Logger.i(v.this.f20491c, "Loading Controller Timer Finish");
            int i10 = this.f20531a;
            if (i10 == 3) {
                v.this.b(new a());
            } else {
                v.this.a(i10 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            String str = v.this.f20491c;
            Logger.i(str, "Loading Controller Timer Tick " + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements s {
        j() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, eh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class k implements s {
        k() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, eh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class l implements s {
        l() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(String str, eh.e eVar, va vaVar) {
            v.this.a(str, eVar, vaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ eh.e f20537a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ va f20538b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f20539c;

        m(eh.e eVar, va vaVar, String str) {
            this.f20537a = eVar;
            this.f20538b = vaVar;
            this.f20539c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            va vaVar;
            eh.e eVar = eh.e.RewardedVideo;
            eh.e eVar2 = this.f20537a;
            if ((eVar != eVar2 && eh.e.Interstitial != eVar2 && eh.e.Banner != eVar2) || (vaVar = this.f20538b) == null || TextUtils.isEmpty(vaVar.h())) {
                return;
            }
            s9 a10 = v.this.a(this.f20537a);
            String str = v.this.f20491c;
            Log.d(str, "onAdProductInitFailed (message:" + this.f20539c + ")(" + this.f20537a + ")");
            if (a10 != null) {
                a10.a(this.f20537a, this.f20538b.h(), this.f20539c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class o extends WebChromeClient {
        private o() {
        }

        /* synthetic */ o(v vVar, f fVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(v.this.Z.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new q(v.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (v.this.f20506r == null) {
                return;
            }
            v.this.f20506r.setVisibility(8);
            v.this.f20507s.removeView(v.this.f20506r);
            v.this.f20506r = null;
            v.this.f20507s.setVisibility(8);
            v.this.f20508t.onCustomViewHidden();
            v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            v.this.Z.setVisibility(8);
            if (v.this.f20506r != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            v.this.f20507s.addView(view);
            v.this.f20506r = view;
            v.this.f20508t = customViewCallback;
            v.this.f20507s.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class p {

        /* renamed from: a  reason: collision with root package name */
        eh.e f20543a;

        /* renamed from: b  reason: collision with root package name */
        String f20544b;

        public p(eh.e eVar, String str) {
            this.f20543a = eVar;
            this.f20544b = str;
        }

        String a() {
            return this.f20544b;
        }

        eh.e b() {
            return this.f20543a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class q extends WebViewClient {
        private q() {
        }

        /* synthetic */ q(v vVar, f fVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = v.this.f20491c;
            Logger.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context q10 = v.this.q();
            q10.startActivity(new OpenUrlActivity.e(new k.b()).a(str).b(false).a(q10));
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class r {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20547a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20548b;

            a(String str, String str2) {
                this.f20547a = str;
                this.f20548b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f20547a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = v.this.f20491c;
                Log.d(str2, "onRVShowFail(message:" + this.f20547a + ")");
                v.this.f20512x.d(this.f20548b, str);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20550a;

            b(String str) {
                this.f20550a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f20491c, "onInterstitialInitSuccess()");
                v.this.f20513y.a(eh.e.Interstitial, this.f20550a, (z2) null);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20552a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20553b;

            c(String str, String str2) {
                this.f20552a = str;
                this.f20553b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f20552a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = v.this.f20491c;
                Log.d(str2, "onInterstitialInitFail(message:" + str + ")");
                v.this.f20513y.a(eh.e.Interstitial, this.f20553b, str);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s9 f20555a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ eh.e f20556b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f20557c;

            d(s9 s9Var, eh.e eVar, String str) {
                this.f20555a = s9Var;
                this.f20556b = eVar;
                this.f20557c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f20555a.c(this.f20556b, this.f20557c);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20559a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ JSONObject f20560b;

            e(String str, JSONObject jSONObject) {
                this.f20559a = str;
                this.f20560b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f20513y.a(this.f20559a, this.f20560b);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20562a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20563b;

            f(String str, String str2) {
                this.f20562a = str;
                this.f20563b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f20562a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f20513y.c(this.f20563b, str);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20565a;

            g(String str) {
                this.f20565a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f20491c, "onBannerInitSuccess()");
                v.this.f20514z.a(eh.e.Banner, this.f20565a, (z2) null);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20567a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20568b;

            h(String str, String str2) {
                this.f20567a = str;
                this.f20568b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f20567a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = v.this.f20491c;
                Log.d(str2, "onBannerInitFail(message:" + str + ")");
                v.this.f20514z.a(eh.e.Banner, this.f20568b, str);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class i implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20570a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ vg f20571b;

            i(String str, vg vgVar) {
                this.f20570a = str;
                this.f20571b = vgVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f20491c, "onBannerLoadSuccess()");
                v.this.f20514z.a(this.f20570a, this.f20571b);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class j implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20573a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20574b;

            j(String str, String str2) {
                this.f20573a = str;
                this.f20574b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.d(v.this.f20491c, "onLoadBannerFail()");
                String str = this.f20573a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f20514z.a(this.f20574b, str);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.F();
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class l implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20577a;

            l(String str) {
                this.f20577a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new JSONObject(this.f20577a).has(f.b.f20338b)) {
                        v.this.T.a(f.a.a(this.f20577a));
                    } else {
                        v.this.U.a(om.a(this.f20577a));
                    }
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    Logger.e(v.this.f20491c, "failed to parse received message");
                    IronLog.INTERNAL.error(e8.toString());
                }
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class m implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ eh.e f20579a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20580b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f20581c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ JSONObject f20582d;

            m(eh.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f20579a = eVar;
                this.f20580b = str;
                this.f20581c = str2;
                this.f20582d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                s9 a10;
                eh.e eVar = this.f20579a;
                if ((eVar == eh.e.Interstitial || eVar == eh.e.RewardedVideo || eVar == eh.e.Banner) && (a10 = v.this.a(eVar)) != null) {
                    a10.a(this.f20579a, this.f20580b, this.f20581c, this.f20582d);
                }
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class n implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20584a;

            n(String str) {
                this.f20584a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String str = v.this.f20491c;
                    Logger.i(str, "omidAPI(" + this.f20584a + ")");
                    v.this.H.a(new fr(this.f20584a).toString(), new w());
                } catch (Exception e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                    String str2 = v.this.f20491c;
                    Logger.i(str2, "omidAPI failed with exception " + e8.getMessage());
                }
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class o implements Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.B();
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.Z.removeJavascriptInterface(b9.f16510e);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Build.VERSION.SDK_INT >= 21) {
                    v.this.Z.getSettings().setMixedContentMode(0);
                }
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$r  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0235r implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f20589a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20590b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z2 f20591c;

            RunnableC0235r(int i10, String str, z2 z2Var) {
                this.f20589a = i10;
                this.f20590b = str;
                this.f20591c = z2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f20589a <= 0) {
                    v.this.f20512x.c(this.f20590b);
                    return;
                }
                Log.d(v.this.f20491c, "onRVInitSuccess()");
                v.this.f20512x.a(eh.e.RewardedVideo, this.f20590b, this.f20591c);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class s implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20593a;

            s(String str) {
                this.f20593a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    v.this.M.a(new JSONObject(this.f20593a), new w());
                } catch (Exception e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                    String str = v.this.f20491c;
                    Logger.i(str, "fileSystemAPI failed with exception " + e8.getMessage());
                }
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class t implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20595a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20596b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f20597c;

            t(String str, String str2, int i10) {
                this.f20595a = str;
                this.f20596b = str2;
                this.f20597c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f20595a.equalsIgnoreCase(eh.e.RewardedVideo.toString())) {
                    v.this.f20512x.a(this.f20596b, this.f20597c);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class u implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20599a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f20600b;

            u(String str, int i10) {
                this.f20599a = str;
                this.f20600b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.f20513y.onInterstitialAdRewarded(this.f20599a, this.f20600b);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.v$r$v  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0236v implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f20602a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f20603b;

            RunnableC0236v(String str, String str2) {
                this.f20602a = str;
                this.f20603b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f20602a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = v.this.f20491c;
                Log.d(str2, "onRVInitFail(message:" + str + ")");
                v.this.f20512x.a(eh.e.RewardedVideo, this.f20603b, str);
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class w implements rk {
            public w() {
            }

            @Override // com.ironsource.rk
            public void a(boolean z10, String str, fr frVar) {
                frVar.b(z10 ? v.f20486g0 : v.f20487h0, str);
                v.this.a(frVar.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.rk
            public void a(boolean z10, String str, String str2) {
                fr frVar = new fr();
                frVar.b(z10 ? v.f20486g0 : v.f20487h0, str);
                frVar.b("data", str2);
                v.this.a(frVar.toString(), z10, (String) null, (String) null);
            }

            @Override // com.ironsource.rk
            public void a(boolean z10, String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z10 ? v.f20486g0 : v.f20487h0, str);
                    v.this.a(jSONObject.toString(), z10, (String) null, (String) null);
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                }
            }
        }

        public r() {
        }

        private void a(String str, int i10) {
            va a10;
            v vVar = v.this;
            eh.e eVar = eh.e.Interstitial;
            if (vVar.q(eVar.toString()) && (a10 = v.this.G.a(eVar, str)) != null && a10.k()) {
                v.this.b(new u(str, i10));
            }
        }

        private void a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            v.this.i(v.this.e(str, str2));
        }

        private void a(String str, boolean z10) {
            va a10 = v.this.G.a(eh.e.Interstitial, str);
            if (a10 != null) {
                a10.a(z10);
            }
        }

        private void a(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", v.this.B.f());
            } catch (Exception e8) {
                o9.d().a(e8);
                Logger.d(v.this.f20491c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void a(JSONObject jSONObject, String str) {
            if (a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    Logger.d(v.this.f20491c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str) {
            if (z10) {
                v.this.f20513y.b(eh.e.Interstitial, str);
                v.this.f20513y.b(str);
            }
            a(str, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10, String str, String str2) {
            if (z10) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                v.this.f20513y.b(str2, str);
            }
            a(str2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            try {
                s3.a a10 = v.this.N.a(v.this.Z.getContext(), d10.a(str));
                v.this.i(v.this.e(a10.f(), a10.i().toString()));
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(b9.a.f16537h, new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e8) {
                o9.d().a(e8);
                lh.a(er.f17308p, new gh().a(cc.A, e8.getMessage()).a());
                Logger.d(v.this.f20491c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, SDKUtils.getTesterParameters());
            if (v.this.W) {
                return;
            }
            a(jSONObject);
        }

        boolean a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                return false;
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "adClicked(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d(b9.h.f16662m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            eh.e g10 = v.this.g(d10);
            s9 a10 = v.this.a(g10);
            if (g10 == null || a10 == null) {
                return;
            }
            v.this.b(new d(a10, g10, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            String str2 = v.this.f20492d;
            Log.d(str2, "adCredited(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d(b9.h.f16658k);
            int parseInt = d10 != null ? Integer.parseInt(d10) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            String d11 = frVar.d(b9.h.f16662m);
            if (TextUtils.isEmpty(d11)) {
                Log.d(v.this.f20492d, "adCredited | product type is missing");
            }
            if (eh.e.Interstitial.toString().equalsIgnoreCase(d11)) {
                a(fetchDemandSourceId, parseInt);
            } else if (v.this.q(d11)) {
                v.this.b(new t(d11, fetchDemandSourceId, parseInt));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new fr(str));
            z2 z2Var = new z2(str);
            if (!z2Var.g()) {
                v.this.a(str, false, b9.c.f16573r, (String) null);
                return;
            }
            v.this.a(str, true, (String) null, (String) null);
            String d10 = z2Var.d();
            if (eh.e.RewardedVideo.toString().equalsIgnoreCase(d10) && v.this.q(d10)) {
                v.this.b(new RunnableC0235r(Integer.parseInt(z2Var.c()), fetchDemandSourceId, z2Var));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "adViewAPI(" + str + ")");
                v.this.L.a(new fr(str).toString(), new w());
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                String str3 = v.this.f20491c;
                Logger.i(str3, "adViewAPI failed with exception " + e8.getMessage());
            }
        }

        @JavascriptInterface
        public void androidSandboxApi(final String str) {
            hg.f17676a.b(new Runnable() { // from class: com.ironsource.sdk.controller.d0
                @Override // java.lang.Runnable
                public final void run() {
                    v.r.this.b(str);
                }
            });
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(v.this.f20491c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(String str) {
            v.this.i(v.this.a(b9.g.f16611d, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            eh.e g10;
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "cleanAdInstance(" + str + ")");
                fr frVar = new fr(str);
                String d10 = frVar.d(b9.h.f16662m);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
                if (TextUtils.isEmpty(fetchDemandSourceId) || (g10 = v.this.g(d10)) == null) {
                    return;
                }
                v.this.G.b(g10, fetchDemandSourceId);
            } catch (Exception e8) {
                o9.d().a(e8);
                v.this.a(str, false, e8.getMessage(), (String) null);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                ArrayList<String> a10 = ik.e().a();
                fr frVar = new fr(str);
                if (!a10.isEmpty()) {
                    frVar.b(b9.h.f16685x0, a10.toString());
                }
                v.this.a(frVar.toString(), true, (String) null, (String) null);
            } catch (Exception e8) {
                o9.d().a(e8);
                v.this.a(str, false, e8.getMessage(), (String) null);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d(String str) {
            v.this.i(v.this.a(b9.g.f16613e, str, (String) null, (String) null));
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "deleteFile(" + str + ")");
                fr frVar = new fr(str);
                String d10 = frVar.d(b9.h.f16640b);
                String d11 = frVar.d("path");
                if (d11 != null && !TextUtils.isEmpty(d10)) {
                    nh nhVar = new nh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, d11), d10);
                    IronSourceStorageUtils.ensurePathSafety(nhVar, v.this.A);
                    if (!nhVar.exists()) {
                        v.this.a(str, false, b9.c.f16561f, "1");
                        return;
                    }
                    v.this.a(str, IronSourceStorageUtils.deleteFile(nhVar), (String) null, (String) null);
                    return;
                }
                v.this.a(str, false, b9.c.f16562g, "1");
            } catch (Exception e8) {
                o9.d().a(e8);
                v.this.a(str, false, e8.getMessage(), (String) null);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "deleteFolder(" + str + ")");
                String d10 = new fr(str).d("path");
                if (d10 == null) {
                    v.this.a(str, false, b9.c.f16562g, "1");
                    return;
                }
                nh nhVar = new nh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, d10));
                IronSourceStorageUtils.ensurePathSafety(nhVar, v.this.A);
                if (!nhVar.exists()) {
                    v.this.a(str, false, b9.c.f16560e, "1");
                    return;
                }
                v.this.a(str, IronSourceStorageUtils.deleteFolder(nhVar.getPath()), (String) null, (String) null);
            } catch (Exception e8) {
                o9.d().a(e8);
                v.this.a(str, false, e8.getMessage(), (String) null);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "deviceDataAPI(" + str + ")");
                v.this.K.a(new fr(str).toString(), new w());
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                String str3 = v.this.f20491c;
                Logger.i(str3, "deviceDataAPI failed with exception " + e8.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "displayWebView(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            fr frVar = new fr(str);
            boolean booleanValue = ((Boolean) frVar.b(b9.h.f16644d)).booleanValue();
            String d10 = frVar.d(b9.h.f16662m);
            boolean c10 = frVar.c(b9.h.f16678u);
            String d11 = frVar.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            boolean c11 = frVar.c(b9.h.f16689z0);
            if (!booleanValue) {
                v.this.a(u.Gone);
                v.this.o();
                return;
            }
            v.this.F = frVar.c(b9.h.f16680v);
            boolean c12 = frVar.c(b9.h.f16686y);
            u v10 = v.this.v();
            u uVar = u.Display;
            if (v10 == uVar) {
                String str3 = v.this.f20491c;
                Logger.i(str3, "State: " + v.this.f20510v);
                return;
            }
            v.this.a(uVar);
            String str4 = v.this.f20491c;
            Logger.i(str4, "State: " + v.this.f20510v);
            Context q10 = v.this.q();
            String t10 = v.this.t();
            int L = v.this.X.L(q10);
            if (c10) {
                com.ironsource.sdk.controller.h hVar = new com.ironsource.sdk.controller.h(q10);
                hVar.addView(v.this.f20509u);
                hVar.a(v.this);
                return;
            }
            Intent intent = c12 ? new Intent(q10, InterstitialActivity.class) : new Intent(q10, ControllerActivity.class);
            eh.e eVar = eh.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d10)) {
                if ("application".equals(t10)) {
                    t10 = SDKUtils.translateRequestedOrientation(v.this.X.N(q10));
                }
                intent.putExtra(b9.h.f16662m, eVar.toString());
                v.this.D.a(eVar.ordinal());
                v.this.D.f(fetchDemandSourceId);
                if (v.this.q(eVar.toString())) {
                    v.this.f20512x.b(eVar, fetchDemandSourceId);
                }
            } else {
                eh.e eVar2 = eh.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(d10)) {
                    if ("application".equals(t10)) {
                        t10 = SDKUtils.translateRequestedOrientation(v.this.X.N(q10));
                    }
                    intent.putExtra(b9.h.f16662m, eVar2.toString());
                }
            }
            if (d11 != null) {
                intent.putExtra("adViewId", d11);
            }
            intent.putExtra(b9.h.f16689z0, c11);
            intent.setFlags(536870912);
            intent.putExtra(b9.h.f16680v, v.this.F);
            intent.putExtra(b9.h.A, t10);
            intent.putExtra(b9.h.B, L);
            v vVar = v.this;
            vVar.f20498j = new p(vVar.g(d10), fetchDemandSourceId);
            q10.startActivity(intent);
        }

        @JavascriptInterface
        public void dsSharedSignalsAPI(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "dsSharedSignalsAPI(" + str + ")");
                v.this.O.a(new fr(str).toString(), new w());
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                String str3 = v.this.f20491c;
                Logger.i(str3, "dsSharedSignalsAPI failed with exception " + e8.getMessage());
            }
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "fileSystemAPI(" + str + ")");
            v.this.a(new s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.A(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getApplicationInfo("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.a(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = com.ironsource.sdk.controller.v.b(r1, r5)
                com.ironsource.fr r2 = new com.ironsource.fr
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.v r3 = com.ironsource.sdk.controller.v.this
                java.lang.Object[] r5 = com.ironsource.sdk.controller.v.a(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L58
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L5f
                r0 = r1
                goto L60
            L58:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5f
                goto L60
            L5f:
                r0 = 0
            L60:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L75
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.e(r0, r5)
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.r.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            v vVar;
            String str2;
            String str3 = v.this.f20491c;
            Logger.i(str3, "getCachedFilesMap(" + str + ")");
            String e8 = v.this.e(str);
            if (TextUtils.isEmpty(e8)) {
                return;
            }
            fr frVar = new fr(str);
            if (frVar.a("path")) {
                String str4 = (String) frVar.b("path");
                if (IronSourceStorageUtils.isPathExist(v.this.A, str4)) {
                    v.this.i(v.this.a(e8, IronSourceStorageUtils.getCachedFilesMap(v.this.A, str4), b9.g.f16628s, b9.g.f16627r));
                    return;
                }
                vVar = v.this;
                str2 = b9.c.f16575t;
            } else {
                vVar = v.this;
                str2 = b9.c.f16574s;
            }
            vVar.a(str, false, str2, (String) null);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String e8;
            String str2 = v.this.f20491c;
            Logger.i(str2, "getConnectivityInfo(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d(v.f20486g0);
            String d11 = frVar.d(v.f20487h0);
            JSONObject jSONObject = new JSONObject();
            if (v.this.R != null) {
                jSONObject = v.this.R.a(v.this.Z.getContext());
            }
            if (jSONObject.length() > 0) {
                e8 = v.this.e(d10, jSONObject.toString());
            } else {
                e8 = v.this.e(d11, v.this.a("errMsg", b9.c.A, null, null, null, null, null, null, null, false));
            }
            v.this.i(e8);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "getControllerConfig(" + str + ")");
            String d10 = new fr(str).d(v.f20486g0);
            if (TextUtils.isEmpty(d10)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            v.this.i(v.this.e(d10, controllerConfigAsJSONObject.toString()));
        }

        @JavascriptInterface
        public void getDemandSourceState(String str) {
            String d10;
            String str2 = v.this.f20491c;
            Logger.i(str2, "getMediationState(" + str + ")");
            fr frVar = new fr(str);
            String d11 = frVar.d("demandSourceName");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            String d12 = frVar.d(b9.h.f16662m);
            if (d12 == null || d11 == null) {
                return;
            }
            try {
                eh.e productType = SDKUtils.getProductType(d12);
                if (productType != null) {
                    va a10 = v.this.G.a(productType, fetchDemandSourceId);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(b9.h.f16662m, d12);
                    jSONObject.put("demandSourceName", d11);
                    jSONObject.put("demandSourceId", fetchDemandSourceId);
                    if (a10 == null || a10.a(-1)) {
                        d10 = v.this.d(str);
                    } else {
                        d10 = v.this.e(str);
                        jSONObject.put("state", a10.j());
                    }
                    a(d10, jSONObject.toString());
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                v.this.a(str, false, e8.getMessage(), (String) null);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0053, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.A(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getDeviceStatus("
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                java.lang.String r0 = com.ironsource.sdk.controller.v.a(r0, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                java.lang.String r5 = com.ironsource.sdk.controller.v.b(r1, r5)
                com.ironsource.sdk.controller.v r1 = com.ironsource.sdk.controller.v.this
                com.ironsource.kk r2 = r1.Z
                android.content.Context r2 = r2.getContext()
                java.lang.Object[] r1 = com.ironsource.sdk.controller.v.a(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L4f
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L56
                r0 = r5
                goto L57
            L4f:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L56
                goto L57
            L56:
                r0 = 0
            L57:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L6c
                com.ironsource.sdk.controller.v r5 = com.ironsource.sdk.controller.v.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.v.a(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.v r0 = com.ironsource.sdk.controller.v.this
                com.ironsource.sdk.controller.v.e(r0, r5)
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.r.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "getDeviceVolume(" + str + ")");
            try {
                Context context = v.this.Z.getContext();
                float a10 = za.b(context).a(context);
                fr frVar = new fr(str);
                frVar.b(b9.i.P, String.valueOf(a10));
                v.this.a(frVar.toString(), true, (String) null, (String) null);
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "getInitSummery(" + str + ")");
            fr frVar = new fr(str);
            frVar.a(b9.i.f16725r0, v.this.S);
            v.this.a(frVar.toString(), true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            lh.a(er.f17318z, new gh().a(cc.f16883y, str).a());
            String e8 = v.this.e(str);
            String jSONObject = SDKUtils.getOrientation(v.this.Z.getContext()).toString();
            if (TextUtils.isEmpty(e8)) {
                return;
            }
            v.this.i(v.this.a(e8, jSONObject, b9.g.X, b9.g.Y));
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "getUserData(" + str + ")");
            fr frVar = new fr(str);
            if (!frVar.a(b9.h.W)) {
                v.this.a(str, false, b9.c.F, (String) null);
                return;
            }
            String e8 = v.this.e(str);
            String d10 = frVar.d(b9.h.W);
            v.this.i(v.this.e(e8, v.this.a(d10, ik.e().a(d10), null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "iabTokenAPI(" + str + ")");
                v.this.J.a(new fr(str).toString(), new w());
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                String str3 = v.this.f20491c;
                Logger.i(str3, "iabTokenAPI failed with exception " + e8.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "initController(" + str + ")");
            fr frVar = new fr(str);
            CountDownTimer countDownTimer = v.this.f20501m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                v.this.f20501m = null;
            }
            if (frVar.a(b9.h.f16670q)) {
                String d10 = frVar.d(b9.h.f16670q);
                if (b9.h.f16674s.equalsIgnoreCase(d10)) {
                    v.this.f20497i = true;
                    v.this.Q.c();
                } else if (b9.h.f16672r.equalsIgnoreCase(d10)) {
                    v.this.Q.b();
                } else if (!b9.h.f16676t.equalsIgnoreCase(d10)) {
                    Logger.i(v.this.f20491c, "No STAGE mentioned! should not get here!");
                } else {
                    String d11 = frVar.d("errMsg");
                    com.ironsource.sdk.controller.c cVar = v.this.Q;
                    cVar.b("controller js failed to initialize : " + d11);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            v.this.c(new n(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onAdWindowsClosed(" + str + ")");
            v.this.D.a();
            v.this.D.f(null);
            v.this.f20498j = null;
            fr frVar = new fr(str);
            String d10 = frVar.d(b9.h.f16662m);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            eh.e g10 = v.this.g(d10);
            String str3 = v.this.f20492d;
            Log.d(str3, "onAdClosed() with type " + g10);
            if (v.this.q(d10)) {
                v.this.a(g10, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onGetApplicationInfoFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onGetApplicationInfoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onGetCachedFilesMapFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onGetCachedFilesMapSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onGetDeviceStatusFail(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onGetDeviceStatusSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onInitBannerFail(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f20491c, "onInitBannerFail failed with no demand source");
                return;
            }
            wa waVar = v.this.G;
            eh.e eVar = eh.e.Banner;
            va a10 = waVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new h(d10, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(v.this.f20491c, "onInitBannerSuccess()");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new fr(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f20491c, "onInitBannerSuccess failed with no demand source");
            } else if (v.this.q(eh.e.Banner.toString())) {
                v.this.b(new g(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onInitInterstitialFail(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f20491c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            wa waVar = v.this.G;
            eh.e eVar = eh.e.Interstitial;
            va a10 = waVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new c(d10, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(v.this.f20491c, "onInitInterstitialSuccess()");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new fr(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f20491c, "onInitInterstitialSuccess failed with no demand source");
            } else if (v.this.q(eh.e.Interstitial.toString())) {
                v.this.b(new b(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onInitRewardedVideoFail(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            wa waVar = v.this.G;
            eh.e eVar = eh.e.RewardedVideo;
            va a10 = waVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.b(3);
            }
            if (v.this.q(eVar.toString())) {
                v.this.b(new RunnableC0236v(d10, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(v.this.f20491c, "onLoadBannerFail()");
            fr frVar = new fr(str);
            String d10 = frVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            v.this.a(str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && v.this.q(eh.e.Banner.toString())) {
                v.this.b(new j(d10, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(v.this.f20491c, "onLoadBannerSuccess()");
            fr frVar = new fr(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            String d10 = frVar.d("adViewId");
            v.this.a(str, true, (String) null, (String) null);
            vh a10 = bh.a().a(d10);
            if (a10 == null) {
                t9 t9Var = v.this.f20514z;
                t9Var.a(fetchDemandSourceId, "not found view for the current adViewId= " + d10);
            } else if (a10 instanceof vg) {
                vg vgVar = (vg) a10;
                if (v.this.q(eh.e.Banner.toString())) {
                    v.this.b(new i(fetchDemandSourceId, vgVar));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onLoadInterstitialFail(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (v.this.q(eh.e.Interstitial.toString())) {
                v.this.b(new f(d10, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onLoadInterstitialSuccess(" + str + ")");
            fr frVar = new fr(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            JSONObject a10 = frVar.a();
            a(fetchDemandSourceId, true);
            v.this.a(str, true, (String) null, (String) null);
            if (v.this.q(eh.e.Interstitial.toString())) {
                v.this.b(new e(fetchDemandSourceId, a10));
            }
        }

        @JavascriptInterface
        public void onReceivedMessage(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onReceivedMessage(" + str + ")");
            hg.f17676a.b(new l(str));
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onShowInterstitialFail(" + str + ")");
            fr frVar = new fr(str);
            final String d10 = frVar.d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            v.this.a(str, true, (String) null, (String) null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            final boolean q10 = v.this.q(eh.e.Interstitial.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.f0
                @Override // java.lang.Runnable
                public final void run() {
                    v.r.this.a(q10, d10, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onShowInterstitialSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new fr(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(v.this.f20491c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            a3 a3Var = v.this.D;
            eh.e eVar = eh.e.Interstitial;
            a3Var.a(eVar.ordinal());
            v.this.D.f(fetchDemandSourceId);
            final boolean q10 = v.this.q(eVar.toString());
            v.this.b(new Runnable() { // from class: com.ironsource.sdk.controller.e0
                @Override // java.lang.Runnable
                public final void run() {
                    v.r.this.a(q10, fetchDemandSourceId);
                }
            });
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onShowRewardedVideoFail(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
            if (v.this.q(eh.e.RewardedVideo.toString())) {
                v.this.b(new a(d10, fetchDemandSourceId));
            }
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onShowRewardedVideoSuccess(" + str + ")");
            v.this.a(str, true, (String) null, (String) null);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String str2 = v.this.f20491c;
            Log.d(str2, "onVideoStatusChanged(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d(b9.h.f16662m);
            if (v.this.C == null || TextUtils.isEmpty(d10)) {
                return;
            }
            String d11 = frVar.d("status");
            if (b9.h.f16645d0.equalsIgnoreCase(d11)) {
                v.this.C.onVideoStarted();
            } else if (b9.h.f16647e0.equalsIgnoreCase(d11)) {
                v.this.C.onVideoPaused();
            } else if (b9.h.f16649f0.equalsIgnoreCase(d11)) {
                v.this.C.onVideoResumed();
            } else if (b9.h.f16651g0.equalsIgnoreCase(d11)) {
                v.this.C.onVideoEnded();
            } else if (b9.h.f16653h0.equalsIgnoreCase(d11)) {
                v.this.C.onVideoStopped();
            } else {
                String str3 = v.this.f20491c;
                Logger.i(str3, "onVideoStatusChanged: unknown status: " + d11);
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "openUrl(" + str + ")");
                fr frVar = new fr(str);
                String d10 = frVar.d("url");
                p.c a10 = new p.a(frVar.d("method"), new uo(v.this.F, 805306368)).a(frVar.c(b9.h.L0) ? v.this.Z.getContext() : v.this.q(), new to(d10, frVar.d(b9.h.V)));
                if (a10 instanceof p.c.a) {
                    v.this.a(str, false, ((p.c.a) a10).b(), (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                }
            } catch (Exception e8) {
                v.this.a(str, false, e8.getLocalizedMessage(), (String) null);
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            v.this.c(new o());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "permissionsAPI(" + str + ")");
                v.this.I.a(new fr(str).toString(), new w());
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                String str3 = v.this.f20491c;
                Logger.i(str3, "permissionsAPI failed with exception " + e8.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "postAdEventNotification(" + str + ")");
                fr frVar = new fr(str);
                String d10 = frVar.d(b9.h.f16657j0);
                if (TextUtils.isEmpty(d10)) {
                    v.this.a(str, false, b9.c.f16578w, (String) null);
                    return;
                }
                String d11 = frVar.d(b9.h.f16659k0);
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(frVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d11;
                JSONObject jSONObject = (JSONObject) frVar.b(b9.h.f16661l0);
                String d12 = frVar.d(b9.h.f16662m);
                eh.e g10 = v.this.g(d12);
                if (!v.this.q(d12)) {
                    v.this.a(str, false, b9.c.f16577v, (String) null);
                    return;
                }
                String e8 = v.this.e(str);
                if (!TextUtils.isEmpty(e8)) {
                    v.this.i(v.this.a(e8, v.this.a(b9.h.f16662m, d12, b9.h.f16657j0, d10, "demandSourceName", d11, "demandSourceId", str3, null, false), b9.g.f16610c0, b9.g.f16612d0));
                }
                v.this.b(new m(g10, str3, d10, jSONObject));
            } catch (Exception e10) {
                o9.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "removeCloseEventHandler(" + str + ")");
            if (v.this.f20500l != null) {
                v.this.f20500l.cancel();
            }
            v.this.f20499k = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            v.this.c(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            v.this.c(new k());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "saveFile(" + str + ")");
                fr frVar = new fr(str);
                String d10 = frVar.d("path");
                String d11 = frVar.d(b9.h.f16640b);
                if (TextUtils.isEmpty(d11)) {
                    v.this.a(str, false, b9.c.f16562g, "1");
                    return;
                }
                nh nhVar = new nh(IronSourceStorageUtils.buildAbsolutePathToDirInCache(v.this.A, d10), SDKUtils.getFileName(d11));
                IronSourceStorageUtils.ensurePathSafety(nhVar, v.this.A);
                if (v.this.X.a(v.this.A) <= 0) {
                    v.this.a(str, false, d9.A, (String) null);
                } else if (nhVar.exists()) {
                    v.this.a(str, false, d9.f16982z, (String) null);
                } else if (!x8.h(v.this.Z.getContext())) {
                    v.this.a(str, false, d9.C, (String) null);
                } else {
                    v.this.a(str, true, (String) null, (String) null);
                    v.this.f20496h.a(nhVar, d11, frVar.a("connectionTimeout", 0), frVar.a("readTimeout", 0));
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                v.this.a(str, false, e8.getMessage(), (String) null);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "setBackButtonState(" + str + ")");
            ik.e().c(new fr(str).d("state"));
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "setForceClose(" + str + ")");
            fr frVar = new fr(str);
            String d10 = frVar.d("width");
            String d11 = frVar.d("height");
            v.this.f20502n = Integer.parseInt(d10);
            v.this.f20503o = Integer.parseInt(d11);
            v.this.f20504p = frVar.d(b9.h.L);
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "setMixedContentAlwaysAllow(" + str + ")");
            v.this.c(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            try {
                String str2 = v.this.f20491c;
                Logger.i(str2, "setOrientation(" + str + ")");
                String d10 = new fr(str).d("orientation");
                v.this.n(d10);
                if (v.this.f20489a0 != null) {
                    v.this.f20489a0.onOrientationChanged(d10, v.this.X.L(v.this.Z.getContext()));
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "setStoreSearchKeys(" + str + ")");
            ik.e().e(str);
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "setUserData(" + str + ")");
            fr frVar = new fr(str);
            if (!frVar.a(b9.h.W)) {
                v.this.a(str, false, b9.c.F, (String) null);
            } else if (!frVar.a(b9.h.X)) {
                v.this.a(str, false, b9.c.G, (String) null);
            } else {
                String d10 = frVar.d(b9.h.W);
                String d11 = frVar.d(b9.h.X);
                ik.e().a(d10, d11);
                v.this.i(v.this.e(v.this.e(str), v.this.a(d10, d11, null, null, null, null, null, null, null, false)));
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "setWebviewBackgroundColor(" + str + ")");
            v.this.p(str);
        }

        @JavascriptInterface
        public void stillAlive(String str) {
            String str2 = v.this.f20491c;
            Logger.i(str2, "stillAlive(" + str + ")");
            v.this.f20490b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface s {
        void a(String str, eh.e eVar, va vaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class t {

        /* renamed from: a  reason: collision with root package name */
        String f20606a;

        /* renamed from: b  reason: collision with root package name */
        String f20607b;

        t() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum u {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.v$v  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class C0237v extends WebViewClient {
        private C0237v() {
        }

        /* synthetic */ C0237v(v vVar, f fVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(b9.f16511f) && v.this.Q != null) {
                com.ironsource.sdk.controller.c cVar = v.this.Q;
                cVar.b("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = v.this.f20491c;
            Log.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str2 = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (v.this.Q != null) {
                v.this.Q.c(str2);
            }
            v.this.w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z10;
            Logger.i("shouldInterceptRequest", str);
            try {
                z10 = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException e8) {
                o9.d().a(e8);
                z10 = false;
            }
            if (z10) {
                String str2 = "file://" + v.this.A + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException e10) {
                    o9.d().a(e10);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (v.this.h(str)) {
                    v.this.z();
                    return true;
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public v(Context context, wa waVar, e9 e9Var, com.ironsource.sdk.controller.c cVar, hg hgVar, int i10, gb gbVar, String str, l.a aVar, l.b bVar, String str2, String str3) throws Throwable {
        kk kkVar = new kk(context, new vk.a());
        this.Z = kkVar;
        Logger.i(this.f20491c, "C'tor");
        this.Y = e9Var;
        this.Q = cVar;
        this.f20488a = hgVar;
        this.G = waVar;
        a(context, kkVar);
        this.A = str;
        this.D = new a3();
        this.S = new JSONObject();
        this.f20496h = gbVar;
        this.T = aVar;
        this.U = bVar;
        boolean optBoolean = SDKUtils.getNetworkConfiguration().optBoolean(b9.a.f16538i, false);
        this.W = optBoolean;
        if (optBoolean) {
            this.V = new l9(new i9(SDKUtils.getControllerUrl(), this.A, SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new ep(SDKUtils.getControllerUrl())), new t8.l() { // from class: com.ironsource.sdk.controller.c0
                @Override // t8.l
                public final Object invoke(Object obj) {
                    Object c10;
                    c10 = v.this.c((nh) obj);
                    return c10;
                }
            }, gbVar, new q9.a());
        } else {
            gbVar.a(this);
            this.B = new com.ironsource.sdk.controller.d(SDKUtils.getNetworkConfiguration(), this.A, SDKUtils.getControllerUrl(), gbVar);
        }
        o oVar = new o(this, null);
        this.f20505q = oVar;
        kkVar.setWebViewClient(new C0237v(this, null));
        kkVar.setWebChromeClient(oVar);
        kw.a(kkVar);
        a(kkVar);
        kkVar.setDownloadListener(this);
        this.R = c(context);
        b(context);
        b(i10);
        this.f20494f = str2;
        this.f20495g = str3;
        this.f20490b = zy.a(FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    @SuppressLint({"NewApi"})
    private void G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s9 a(eh.e eVar) {
        if (eVar == eh.e.Interstitial) {
            return this.f20513y;
        }
        if (eVar == eh.e.RewardedVideo) {
            return this.f20512x;
        }
        if (eVar == eh.e.Banner) {
            return this.f20514z;
        }
        return null;
    }

    private t a(eh.e eVar, va vaVar) {
        t tVar = new t();
        if (eVar == eh.e.RewardedVideo || eVar == eh.e.Interstitial || eVar == eh.e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put(b9.i.f16702g, this.f20494f);
            if (!TextUtils.isEmpty(this.f20495g)) {
                hashMap.put(b9.i.f16700f, this.f20495g);
            }
            if (vaVar != null) {
                if (vaVar.g() != null) {
                    hashMap.putAll(vaVar.g());
                    hashMap.put(b9.h.f16687y0, String.valueOf(m0.f18364a.c(vaVar.h())));
                }
                hashMap.put("demandSourceName", vaVar.f());
                hashMap.put("demandSourceId", vaVar.h());
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            b9.g a10 = b9.g.a(eVar);
            String a11 = a(a10.f16636a, flatMapToJsonAsString, a10.f16637b, a10.f16638c);
            tVar.f20606a = a10.f16636a;
            tVar.f20607b = a11;
        }
        return tVar;
    }

    private String a(eh.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.toString(jSONObject.optInt("sessionDepth")));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        va a10 = this.G.a(eVar, fetchDemandSourceId);
        if (a10 != null) {
            if (a10.g() != null) {
                hashMap.putAll(a10.g());
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        b9.g b10 = b9.g.b(eVar);
        return a(b10.f16636a, flatMapToJsonAsString, b10.f16637b, b10.f16638c);
    }

    private String a(String str, String str2) {
        return a(str, str2, b9.h.f16650g);
    }

    private String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            return new JSONObject(str).put(str3, str2).toString();
        } catch (JSONException e8) {
            o9.d().a(e8);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4) {
        return new m.a(str, str2, str3, str4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z10);
            }
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject.toString();
    }

    private void a(Context context, WebView webView) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f20509u = new FrameLayout(context);
        this.f20507s = new FrameLayout(context);
        this.f20507s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f20507s.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.f20509u.addView(this.f20507s, layoutParams);
        this.f20509u.addView(frameLayout);
    }

    @SuppressLint({"NewApi"})
    private void a(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"AddJavascriptInterface"})
    private void a(WebView webView) {
        com.ironsource.sdk.controller.s sVar = new com.ironsource.sdk.controller.s(com.ironsource.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), b9.f16509d);
        webView.addJavascriptInterface(b(sVar), b9.f16510e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(qe qeVar) {
        try {
            this.Q.a(qeVar);
        } catch (Exception e8) {
            o9.d().a(e8);
            String str = this.f20491c;
            Logger.e(str, "handleLoadAd: " + e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(te teVar) {
        teVar.a(new ue() { // from class: com.ironsource.sdk.controller.a0
            @Override // com.ironsource.ue
            public final void a(qe qeVar) {
                v.this.a(qeVar);
            }
        });
    }

    private void a(va vaVar, Map<String, String> map) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()});
        if (map.containsKey("adm")) {
            this.f20490b.a(new h9.d() { // from class: com.ironsource.sdk.controller.z
                @Override // com.ironsource.h9.d
                public final void a(te teVar) {
                    v.this.a(teVar);
                }
            });
        }
        this.D.d(vaVar.h(), true);
        i(a(b9.g.E, SDKUtils.flatMapToJsonAsString(mergeHashMaps), b9.g.F, b9.g.G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, eh.e eVar, va vaVar) {
        if (q(eVar.toString())) {
            b(new m(eVar, vaVar, str));
        }
    }

    private void a(String str, eh.e eVar, va vaVar, s sVar) {
        if (TextUtils.isEmpty(str)) {
            sVar.a("Application key are missing", eVar, vaVar);
        } else {
            i(a(eVar, vaVar).f20607b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z10, String str2, String str3) {
        String d10 = new fr(str).d(z10 ? f20486g0 : f20487h0);
        if (TextUtils.isEmpty(d10)) {
            return;
        }
        i(e(d10, a(b(str, str2), str3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, WebView webView) {
        boolean optBoolean = jSONObject.optBoolean("inspectWebview");
        if (optBoolean) {
            WebView.setWebContentsDebuggingEnabled(optBoolean);
        }
    }

    private String b(String str) {
        String str2 = this.A + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    private String b(String str, String str2) {
        return a(str, str2, "errMsg");
    }

    private v8 c(Context context) {
        return new f(SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object c(nh nhVar) {
        this.f20496h.a(this);
        if (nhVar == null || !nhVar.exists()) {
            a(new nh(b9.f16511f), new fh(1, "Unable to download Html file"));
            return null;
        }
        a(nhVar);
        return null;
    }

    private String c(String str, String str2, String str3) {
        return new m.a(str, null, str2, str3).a();
    }

    private void c(JSONObject jSONObject) throws JSONException {
        jSONObject.put(SDKUtils.encodeString("gpi"), dp.d(this.Z.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return new fr(str).d(f20487h0);
    }

    private String d(JSONObject jSONObject) {
        za b10 = za.b(this.Z.getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb.append(b9.i.f16722q);
            sb.append(b9.i.f16692b);
            sb.append(sDKVersion);
            sb.append(b9.i.f16694c);
        }
        String e8 = b10.e();
        if (!TextUtils.isEmpty(e8)) {
            sb.append(b9.i.f16714m);
            sb.append(b9.i.f16692b);
            sb.append(e8);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append(b9.i.f16694c);
            sb.append("protocol");
            sb.append(b9.i.f16692b);
            sb.append(str);
            sb.append(b9.i.f16694c);
            sb.append(b9.i.D);
            sb.append(b9.i.f16692b);
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{b9.i.Z, b9.i.f16702g}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append(b9.i.f16694c);
                        sb.append("controllerConfig");
                        sb.append(b9.i.f16692b);
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e10) {
                    o9.d().a(e10);
                    IronLog.INTERNAL.error(e10.toString());
                }
            }
            sb.append(b9.i.f16694c);
            sb.append("debug");
            sb.append(b9.i.f16692b);
            sb.append(r());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] d(Context context) {
        boolean z10;
        za b10 = za.b(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(b9.i.f16733z, "none");
            jSONObject.put(b9.i.A, SDKUtils.translateDeviceOrientation(this.X.H(context)));
            String d10 = b10.d();
            if (d10 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16710k), SDKUtils.encodeString(d10));
            }
            String c10 = b10.c();
            if (c10 != null) {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16712l), SDKUtils.encodeString(c10));
                z10 = false;
            } else {
                z10 = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.i(this.f20491c, "add AID");
                    jSONObject.put("deviceIds" + b9.i.f16696d + b9.i.L + b9.i.f16698e, SDKUtils.encodeString(advertiserId));
                }
                String limitAdTracking = SDKUtils.getLimitAdTracking();
                if (!TextUtils.isEmpty(limitAdTracking)) {
                    Logger.i(this.f20491c, "add LAT");
                    jSONObject.put(b9.i.M, Boolean.parseBoolean(limitAdTracking));
                }
                String e8 = b10.e();
                if (e8 != null) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16714m), SDKUtils.encodeString(e8));
                } else {
                    z10 = true;
                }
                String f10 = b10.f();
                if (f10 != null) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16716n), f10.replaceAll("[^0-9/.]", ""));
                } else {
                    z10 = true;
                }
                String f11 = b10.f();
                if (f11 != null) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16718o), SDKUtils.encodeString(f11));
                }
                String valueOf = String.valueOf(b10.a());
                if (valueOf != null) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16720p), valueOf);
                } else {
                    z10 = true;
                }
                jSONObject.put(fe.f17408e0, String.valueOf(k1.a()));
                String sDKVersion = SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16722q), SDKUtils.encodeString(sDKVersion));
                }
                if (b10.b() != null && b10.b().length() > 0) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16724r), SDKUtils.encodeString(b10.b()));
                }
                String b11 = y8.b(context);
                if (b11.equals("none")) {
                    z10 = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16727t), SDKUtils.encodeString(b11));
                }
                String d11 = y8.d(context);
                if (d11 != null) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16728u), SDKUtils.encodeString(d11));
                } else {
                    z10 = true;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16729v), y8.e(context));
                }
                jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16731x), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
                }
                jSONObject.put(b9.i.f16732y, SDKUtils.encodeString(String.valueOf(this.X.a(this.A))));
                String valueOf2 = String.valueOf(this.X.s());
                if (TextUtils.isEmpty(valueOf2)) {
                    z10 = true;
                } else {
                    jSONObject.put(SDKUtils.encodeString(b9.i.G) + b9.i.f16696d + SDKUtils.encodeString("width") + b9.i.f16698e, SDKUtils.encodeString(valueOf2));
                }
                jSONObject.put(SDKUtils.encodeString(b9.i.G) + b9.i.f16696d + SDKUtils.encodeString("height") + b9.i.f16698e, SDKUtils.encodeString(String.valueOf(this.X.a())));
                String g10 = c4.g(this.Z.getContext());
                if (!TextUtils.isEmpty(g10)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(g10));
                }
                String valueOf3 = String.valueOf(this.X.h());
                if (!TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.K), SDKUtils.encodeString(valueOf3));
                }
                String valueOf4 = String.valueOf(this.X.f());
                if (!TextUtils.isEmpty(valueOf4)) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.O), SDKUtils.encodeString(valueOf4));
                }
                jSONObject.put(SDKUtils.encodeString(b9.i.P), za.b(context).a(context));
                jSONObject.put(SDKUtils.encodeString(b9.i.Y), this.X.y(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), x8.b(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), x8.c(context));
                jSONObject.put(SDKUtils.encodeString(b9.i.S), x8.f(context));
                jSONObject.put(SDKUtils.encodeString(b9.i.R), SDKUtils.encodeString(x8.g(context)));
                jSONObject.put(SDKUtils.encodeString(b9.i.V), c4.f(context));
                jSONObject.put(SDKUtils.encodeString(b9.i.X), c4.d(context));
                jSONObject.put(SDKUtils.encodeString(b9.i.W), SDKUtils.encodeString(c4.b(context)));
                String e10 = c4.e(context);
                if (!TextUtils.isEmpty(e10)) {
                    jSONObject.put(SDKUtils.encodeString(b9.i.f16695c0), SDKUtils.encodeString(e10));
                }
                c(jSONObject);
                jSONObject.put(SDKUtils.encodeString(b9.i.f16721p0), this.X.C(context));
            } catch (JSONException e11) {
                e = e11;
                o9.d().a(e);
                IronLog.INTERNAL.error(e.toString());
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
            }
        } catch (JSONException e12) {
            e = e12;
            z10 = false;
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        return new fr(str).d(f20486g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, String str2) {
        return new m.a(str, str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        try {
            v8 v8Var = this.R;
            if (v8Var == null) {
                return;
            }
            v8Var.b(context);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    private String f(String str) {
        return new m.a(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            v8 v8Var = this.R;
            if (v8Var == null) {
                return;
            }
            v8Var.c(context);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] f(String str, String str2) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            z10 = true;
        } else {
            va a10 = this.G.a(g(str), str2);
            if (a10 != null) {
                map = a10.g();
                map.put("demandSourceName", a10.f());
                map.put("demandSourceId", a10.h());
            }
            try {
                jSONObject.put(b9.h.f16662m, str);
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e10) {
                o9.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            z10 = false;
        }
        if (!TextUtils.isEmpty(this.f20495g)) {
            try {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16700f), SDKUtils.encodeString(this.f20495g));
            } catch (JSONException e11) {
                o9.d().a(e11);
                IronLog.INTERNAL.error(e11.toString());
            }
        }
        if (TextUtils.isEmpty(this.f20494f)) {
            z10 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString(b9.i.f16702g), SDKUtils.encodeString(this.f20494f));
            } catch (JSONException e12) {
                o9.d().a(e12);
                IronLog.INTERNAL.error(e12.toString());
            }
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    o(entry.getValue());
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e13) {
                    o9.d().a(e13);
                    IronLog.INTERNAL.error(e13.toString());
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public eh.e g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        eh.e eVar = eh.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        eh.e eVar2 = eh.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        eh.e eVar3 = eh.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(new Runnable() { // from class: com.ironsource.sdk.controller.b0
            @Override // java.lang.Runnable
            public final void run() {
                v.this.j(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str) {
        this.Z.a(new m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        try {
            String str2 = this.f20491c;
            Logger.i(str2, "load(): " + str);
            this.Z.loadUrl(str);
        } catch (Throwable th) {
            o9.d().a(th);
            String str3 = this.f20491c;
            Logger.e(str3, "WebViewController::load: " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        so soVar = this.f20489a0;
        if (soVar != null) {
            soVar.onCloseRequested();
        }
    }

    private void o(String str) {
        WebSettings settings;
        int i10;
        if (str.equalsIgnoreCase("0")) {
            settings = this.Z.getSettings();
            i10 = 2;
        } else {
            settings = this.Z.getSettings();
            i10 = -1;
        }
        settings.setCacheMode(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        WebView webView;
        fr frVar = new fr(str);
        String d10 = frVar.d(b9.h.S);
        String d11 = frVar.d("adViewId");
        int parseColor = !b9.h.T.equalsIgnoreCase(d10) ? Color.parseColor(d10) : 0;
        if (d11 != null) {
            webView = bh.a().a(d11).getPresentingView();
            if (webView == null) {
                return;
            }
        } else {
            webView = this.Z;
        }
        webView.setBackgroundColor(parseColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f20491c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(eh.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(eh.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(eh.e.Banner.toString()) || this.f20514z == null : this.f20512x == null) : this.f20513y != null) {
            z10 = true;
        }
        if (!z10) {
            String str2 = this.f20491c;
            Logger.d(str2, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z10;
    }

    public void A() {
        i(f(b9.g.A));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (Throwable th) {
            o9.d().a(th);
            String str = this.f20491c;
            Logger.i(str, "WebViewController: onPause() - " + th);
        }
    }

    public void C() {
        this.C = null;
    }

    public void D() {
        this.Z.a();
        this.f20489a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (Throwable th) {
            o9.d().a(th);
            String str = this.f20491c;
            Logger.i(str, "WebViewController: onResume() - " + th);
        }
    }

    com.ironsource.sdk.controller.g a(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.g(new com.ironsource.sdk.controller.b(new r()), sVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        if (this.W) {
            this.V.a();
            return;
        }
        this.B.a(new gh());
        if (this.B.k()) {
            a(1);
        }
    }

    public void a(int i10) {
        if (!this.W && !this.B.m()) {
            Logger.i(this.f20491c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String d10 = d(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            d10 = String.format("%s&sessionid=%s", d10, initSDKParams.get("sessionid"));
        }
        String uri = (this.W ? this.V.b() : this.B.g()).toURI().toString();
        this.f20488a.d(new h(controllerConfigAsJSONObject, this.Z, uri + "?" + d10));
        this.f20501m = new i(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, 1000L, i10).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
        this.Y.a(activity);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
        a(new d(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.ironsource.a3 r11) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.v.a(com.ironsource.a3):void");
    }

    void a(eh.e eVar, String str) {
        b(new e(eVar, str));
    }

    @Override // com.ironsource.po
    public void a(nh nhVar) {
        if (this.W && this.V.a(nhVar)) {
            a(1);
        } else if (nhVar.getName().contains(b9.f16511f)) {
            this.B.a(new n());
        } else {
            c(nhVar.getName(), nhVar.getParent());
        }
    }

    @Override // com.ironsource.po
    public void a(nh nhVar, fh fhVar) {
        if (!this.W || !this.V.a(nhVar)) {
            if (nhVar.getName().contains(b9.f16511f)) {
                this.B.a(new a(), new b(fhVar));
                return;
            } else {
                b(nhVar.getName(), nhVar.getParent(), fhVar.b());
                return;
            }
        }
        com.ironsource.sdk.controller.c cVar = this.Q;
        cVar.b("controller html - failed to download - " + fhVar.b());
    }

    public void a(nv nvVar) {
        this.C = nvVar;
    }

    public void a(s3 s3Var) {
        this.N = s3Var;
    }

    public void a(com.ironsource.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(p());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        i(a(cVar.e(), cVar.h(), b9.g.U, b9.g.U));
    }

    public void a(com.ironsource.sdk.controller.i iVar) {
        this.K = iVar;
    }

    public void a(com.ironsource.sdk.controller.j jVar) {
        this.M = jVar;
    }

    public void a(com.ironsource.sdk.controller.o oVar) {
        this.H = oVar;
    }

    public void a(com.ironsource.sdk.controller.q qVar) {
        this.I = qVar;
    }

    public void a(com.ironsource.sdk.controller.u uVar) {
        this.J = uVar;
    }

    public void a(u uVar) {
        this.f20510v = uVar;
    }

    public void a(so soVar) {
        this.f20489a0 = soVar;
        this.Z.a(soVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar) {
        Map<String, String> b10 = vaVar.b();
        if (b10 != null) {
            i(a(b9.g.S, SDKUtils.flatMapToJsonAsString(b10), b9.g.P, b9.g.Q));
        }
        this.G.b(eh.e.Banner, vaVar.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, t9 t9Var) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()});
        if (map != null) {
            i(a(b9.g.N, SDKUtils.flatMapToJsonAsString(mergeHashMaps), b9.g.O, b9.g.R));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(va vaVar, Map<String, String> map, u9 u9Var) {
        i(a(eh.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, vaVar.b()}))));
    }

    public void a(y9 y9Var) {
        this.O = y9Var;
    }

    void a(Runnable runnable) {
        hg hgVar = this.f20488a;
        if (hgVar != null) {
            hgVar.b(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, u9 u9Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.D.d(str, true);
        i(a(b9.g.E, flatMapToJsonAsString, b9.g.F, b9.g.G));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, t9 t9Var) {
        this.f20494f = str;
        this.f20495g = str2;
        this.f20514z = t9Var;
        a(str, eh.e.Banner, vaVar, new l());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, u9 u9Var) {
        this.f20494f = str;
        this.f20495g = str2;
        this.f20513y = u9Var;
        this.D.g(str);
        this.D.h(this.f20495g);
        a(this.f20494f, eh.e.Interstitial, vaVar, new k());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, va vaVar, v9 v9Var) {
        this.f20494f = str;
        this.f20495g = str2;
        this.f20512x = v9Var;
        this.D.i(str);
        this.D.j(str2);
        a(str, eh.e.RewardedVideo, vaVar, new j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, t9 t9Var) {
        i(a(b9.g.N, jSONObject.toString(), b9.g.O, b9.g.R));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, u9 u9Var) {
        i(a(eh.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, v9 v9Var) {
        i(a(eh.e.RewardedVideo, jSONObject));
    }

    public void a(boolean z10, String str) {
        i(e(b9.g.V, a(b9.h.K, str, null, null, null, null, null, null, b9.h.f16666o, z10)));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        va a10 = this.G.a(eh.e.Interstitial, str);
        return a10 != null && a10.d();
    }

    com.ironsource.sdk.controller.r b(com.ironsource.sdk.controller.s sVar) {
        return new com.ironsource.sdk.controller.r(sVar);
    }

    public void b(int i10) {
        f20482c0 = i10;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
        a(new c(context));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar) {
        Map<String, String> b10 = vaVar.b();
        if (b10 != null) {
            i(e(b9.g.T, SDKUtils.flatMapToJsonAsString(b10)));
        }
        this.G.b(eh.e.Interstitial, vaVar.h());
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(va vaVar, Map<String, String> map, u9 u9Var) {
        a(vaVar, map);
    }

    void b(Runnable runnable) {
        hg hgVar = this.f20488a;
        if (hgVar != null) {
            hgVar.c(runnable);
        }
    }

    public void b(String str, String str2, String str3) {
        try {
            i(e(b9.g.f16626q, a(b9.h.f16640b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception e8) {
            o9.d().a(e8);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
        i(e(b9.g.f16614e0, jSONObject != null ? jSONObject.toString() : null));
    }

    void c(Runnable runnable) {
        hg hgVar = this.f20488a;
        if (hgVar != null) {
            hgVar.d(runnable);
        }
    }

    public void c(String str) {
        if (str.equals(b9.h.f16654i)) {
            o();
        }
        i(e(b9.g.f16635z, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void c(String str, String str2) {
        try {
            i(e(b9.g.f16625p, a(b9.h.f16640b, str, "path", b(str2), null, null, null, null, null, false)));
        } catch (Exception e8) {
            o9.d().a(e8);
            b(str, str2, e8.getMessage());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void d() {
        i(f(b9.g.f16629t));
    }

    public void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = b9.c.f16581z;
        }
        i(e(b9.g.f16608a0, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void destroy() {
        this.Z.destroy();
        gb gbVar = this.f20496h;
        if (gbVar != null) {
            gbVar.d();
        }
        v8 v8Var = this.R;
        if (v8Var != null) {
            v8Var.b();
        }
        CountDownTimer countDownTimer = this.f20501m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        a(this.D);
    }

    public void e(JSONObject jSONObject) {
        String str = this.f20491c;
        Logger.i(str, "device connection info changed: " + jSONObject.toString());
        i(e(b9.g.f16634y, a(b9.i.f16705h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
        i(f(b9.g.f16630u));
    }

    @Override // com.ironsource.sdk.controller.l
    public eh.c g() {
        return eh.c.Web;
    }

    public void g(String str, String str2) {
        i(e(b9.g.W, a(b9.h.f16668p, str2, b9.h.f16662m, str, null, null, null, null, null, false)));
    }

    public boolean h(String str) {
        try {
            if (new hs(str, ik.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                gv.a(q(), str);
                return true;
            }
            return false;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return false;
        }
    }

    public void k(String str) {
        i(e(b9.g.f16632w, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void m(String str) {
        try {
            String d10 = y8.d(this.Z.getContext());
            String str2 = this.f20491c;
            Logger.i(str2, "device status changed, connection type " + str);
            jh.a(str);
            jh.b(d10);
            i(e(b9.g.f16633x, a(b9.i.f16727t, str, b9.i.f16728u, d10, null, null, null, null, null, false)));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception: " + Log.getStackTraceString(e8));
        }
    }

    public void n(String str) {
        this.f20511w = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        String str5 = this.f20491c;
        Logger.i(str5, str + " " + str4);
    }

    public jw p() {
        if (this.P == null) {
            this.P = new g();
        }
        return this.P;
    }

    public Context q() {
        return this.Y.a();
    }

    public int r() {
        return f20482c0;
    }

    public FrameLayout s() {
        return this.f20509u;
    }

    public String t() {
        return this.f20511w;
    }

    public a3 u() {
        return this.D;
    }

    public u v() {
        return this.f20510v;
    }

    public void w() {
        if (this.f20498j == null) {
            return;
        }
        o();
        eh.e b10 = this.f20498j.b();
        String a10 = this.f20498j.a();
        if (q(b10.toString())) {
            a(b10, a10);
        }
    }

    public void x() {
        this.f20505q.onHideCustomView();
    }

    public boolean y() {
        return this.f20506r != null;
    }

    public void z() {
        i(f(b9.g.Z));
    }
}
