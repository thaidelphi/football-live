package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.b1;
import com.adcolony.sdk.e0;
import com.iab.omid.library.adcolony.ScriptInjector;
import java.io.IOException;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c1 extends b1 implements k0 {
    private i A;
    private boolean B;
    private f1 C;
    private boolean D;
    private boolean E;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5899v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f5900w;

    /* renamed from: x  reason: collision with root package name */
    private final Object f5901x;

    /* renamed from: y  reason: collision with root package name */
    private e1 f5902y;

    /* renamed from: z  reason: collision with root package name */
    private String f5903z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a {
        public a() {
        }

        @JavascriptInterface
        public final void dispatch_messages(String str, String str2) {
            if (kotlin.jvm.internal.n.a(str2, c1.this.f5903z)) {
                c1.this.c(str);
            }
        }

        @JavascriptInterface
        public final void enable_reverse_messaging(String str) {
            if (kotlin.jvm.internal.n.a(str, c1.this.f5903z)) {
                c1.this.f5899v = true;
            }
        }

        @JavascriptInterface
        public final String pull_messages(String str) {
            String str2;
            if (kotlin.jvm.internal.n.a(str, c1.this.f5903z)) {
                str2 = "[]";
                Object obj = c1.this.f5901x;
                c1 c1Var = c1.this;
                synchronized (obj) {
                    if (c1Var.f5902y.b() > 0) {
                        str2 = c1Var.getEnableMessages() ? c1Var.f5902y.toString() : "[]";
                        c1Var.f5902y = c0.a();
                    }
                    i8.w wVar = i8.w.f26638a;
                }
                return str2;
            }
            return "[]";
        }

        @JavascriptInterface
        public final void push_messages(String str, String str2) {
            if (kotlin.jvm.internal.n.a(str2, c1.this.f5903z)) {
                c1.this.c(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class b extends a {
        public b() {
            super();
        }

        @JavascriptInterface
        public final void enable_event_messaging(String str) {
            if (kotlin.jvm.internal.n.a(str, c1.this.f5903z)) {
                c1.this.f5900w = true;
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class c extends b1.b {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new l().a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new l().a(str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class d extends b1.c {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new l().a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new l().a(str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class e extends b1.d {
        public e() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new j().a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return new l().a(str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class f extends b1.e {
        public f() {
            super(c1.this);
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new j().a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new k().a(webResourceRequest);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class g extends b1.f {
        public g() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new j().a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new l().b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return new k().a(webResourceRequest);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        private final WebMessagePort[] f5911a;

        public i(WebMessagePort[] webMessagePortArr) {
            this.f5911a = webMessagePortArr;
        }

        public final WebMessagePort a() {
            Object o10;
            o10 = j8.m.o(this.f5911a, 1);
            return (WebMessagePort) o10;
        }

        public final WebMessagePort b() {
            Object o10;
            o10 = j8.m.o(this.f5911a, 0);
            return (WebMessagePort) o10;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class j {
        public j() {
        }

        public final void a(String str) {
            new l().a();
            if (str != null) {
                c1.this.d(str);
            } else {
                new e0.a().a("ADCWebViewModule: initializeEventMessaging failed due to url = null").a(e0.f5979g);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class k {
        public k() {
        }

        public final boolean a(WebResourceRequest webResourceRequest) {
            if (c1.this.getModuleInitialized()) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    String clickOverride = c1.this.getClickOverride();
                    Uri parse = clickOverride == null ? null : Uri.parse(clickOverride);
                    if (parse == null) {
                        parse = webResourceRequest.getUrl();
                    }
                    if (parse != null) {
                        z0.a(new Intent("android.intent.action.VIEW", parse));
                        f1 b10 = c0.b();
                        c1 c1Var = c1.this;
                        c0.a(b10, "url", parse.toString());
                        c0.a(b10, "ad_session_id", c1Var.getAdSessionId());
                        com.adcolony.sdk.c parentContainer = c1.this.getParentContainer();
                        new h0("WebView.redirect_detected", parentContainer != null ? parentContainer.k() : 0, b10).c();
                        x0 A = com.adcolony.sdk.a.b().A();
                        c1 c1Var2 = c1.this;
                        A.a(c1Var2.getAdSessionId());
                        A.c(c1Var2.getAdSessionId());
                    } else {
                        new e0.a().a(kotlin.jvm.internal.n.n("shouldOverrideUrlLoading called with null request url, with ad id: ", c1.this.h())).a(e0.f5981i);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class m extends WebMessagePort.WebMessageCallback {
        m() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            String data;
            if (webMessage == null || (data = webMessage.getData()) == null) {
                return;
            }
            c1 c1Var = c1.this;
            List<String> d10 = new b9.e(":").d(data, 2);
            if (d10.size() == 2 && kotlin.jvm.internal.n.a(d10.get(0), c1Var.f5903z)) {
                c1Var.b(d10.get(1));
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c1.this.removeJavascriptInterface("NativeLayer");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class o implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5918b;

        o(String str) {
            this.f5918b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (c1.this.getEnableMessages()) {
                c1 c1Var = c1.this;
                c1Var.a("NativeLayer.dispatch_messages(ADC3_update(" + this.f5918b + "), '" + c1.this.f5903z + "');");
            }
        }
    }

    static {
        new h(null);
    }

    public c1(Context context, int i10, h0 h0Var) {
        super(context, i10, h0Var);
        this.f5901x = new Object();
        this.f5902y = c0.a();
        this.f5903z = "";
        this.B = true;
        this.C = c0.b();
    }

    private final void e(f1 f1Var) {
        WebMessagePort webMessagePort;
        if (this.B) {
            i iVar = this.A;
            if (iVar == null || (webMessagePort = iVar.b()) == null) {
                webMessagePort = null;
            } else {
                e1 a10 = c0.a();
                a10.a(f1Var);
                webMessagePort.postMessage(new WebMessage(a10.toString()));
            }
            if (webMessagePort == null) {
                new e0.a().a("Sending message before event messaging is initialized").a(e0.f5979g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClickOverride() {
        AdColonyInterstitial interstitial = getInterstitial();
        String c10 = interstitial == null ? null : interstitial.c();
        if (c10 == null) {
            AdColonyAdView adView = getAdView();
            if (adView == null) {
                return null;
            }
            return adView.getClickOverride();
        }
        return c10;
    }

    private final a m() {
        return Build.VERSION.SDK_INT >= 23 ? new b() : new a();
    }

    private final void o() {
        String str;
        str = "";
        synchronized (this.f5901x) {
            if (this.f5902y.b() > 0) {
                str = getEnableMessages() ? this.f5902y.toString() : "";
                this.f5902y = c0.a();
            }
            i8.w wVar = i8.w.f26638a;
        }
        z0.b(new o(str));
    }

    @Override // com.adcolony.sdk.k0
    public int getAdcModuleId() {
        return getAdc3ModuleId();
    }

    protected final /* synthetic */ boolean getEnableMessages() {
        return this.B;
    }

    protected final /* synthetic */ f1 getIab() {
        return this.C;
    }

    @Override // 
    /* renamed from: getModuleId */
    public int getAdc3ModuleId() {
        return getWebViewModuleId();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ boolean getModuleInitialized() {
        return this.D;
    }

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new d();
    }

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new e();
    }

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new f();
    }

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new g();
    }

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.b1
    @SuppressLint({"AddJavascriptInterface"})
    public /* synthetic */ void i() {
        addJavascriptInterface(m(), "NativeLayer");
        com.adcolony.sdk.a.b().r().a(this);
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ boolean n() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void setEnableMessages(boolean z10) {
        this.B = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void setIab(f1 f1Var) {
        this.C = f1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public /* synthetic */ String d(f1 f1Var) {
        return kotlin.jvm.internal.n.n("file:///", c(f1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str) {
        if (this.A == null) {
            i iVar = new i(createWebMessageChannel());
            WebMessagePort b10 = iVar.b();
            if (b10 != null) {
                b10.setWebMessageCallback(new m());
            }
            postWebMessage(new WebMessage("", new WebMessagePort[]{iVar.a()}), Uri.parse(str));
            i8.w wVar = i8.w.f26638a;
            this.A = iVar;
        }
    }

    @Override // com.adcolony.sdk.k0
    public void b() {
        if (!com.adcolony.sdk.a.c() || !this.D || this.f5899v || this.f5900w) {
            return;
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public /* synthetic */ String c(f1 f1Var) {
        return c0.h(f1Var, "filepath");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void a(h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        f1 a10 = h0Var.a();
        this.B = c0.b(a10, "enable_messages");
        if (this.C.b()) {
            this.C = c0.f(a10, "iab");
        }
        super.a(h0Var, i10, cVar);
    }

    @Override // com.adcolony.sdk.k0
    public void c() {
        if (getDestroyed()) {
            return;
        }
        l();
        z0.b(new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class l {
        public l() {
        }

        public final void a() {
            if (!c1.this.getEnableMessages() || c1.this.getModuleInitialized()) {
                return;
            }
            c1.this.f5903z = z0.a();
            f1 a10 = c0.a(c0.b(), c1.this.getInfo());
            c0.a(a10, "message_key", c1.this.f5903z);
            c1 c1Var = c1.this;
            c1Var.a("ADC3_init(" + c1.this.getAdcModuleId() + ',' + a10 + ");");
            c1.this.D = true;
        }

        public final void b() {
            c1.this.D = false;
        }

        public final boolean a(String str) {
            if (c1.this.getModuleInitialized()) {
                String clickOverride = c1.this.getClickOverride();
                if (clickOverride != null) {
                    str = clickOverride;
                }
                if (str != null) {
                    z0.a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    f1 b10 = c0.b();
                    c1 c1Var = c1.this;
                    c0.a(b10, "url", str);
                    c0.a(b10, "ad_session_id", c1Var.getAdSessionId());
                    com.adcolony.sdk.c parentContainer = c1.this.getParentContainer();
                    new h0("WebView.redirect_detected", parentContainer != null ? parentContainer.k() : 0, b10).c();
                    x0 A = com.adcolony.sdk.a.b().A();
                    c1 c1Var2 = c1.this;
                    A.a(c1Var2.getAdSessionId());
                    A.c(c1Var2.getAdSessionId());
                    return true;
                }
                new e0.a().a(kotlin.jvm.internal.n.n("shouldOverrideUrlLoading called with null request url, with ad id: ", c1.this.h())).a(e0.f5981i);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        b(c0.b(str));
    }

    private final void b(f1 f1Var) {
        com.adcolony.sdk.a.b().r().c(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str) {
        for (f1 f1Var : c0.a(str).c()) {
            b(f1Var);
        }
    }

    protected /* synthetic */ void b(Exception exc) {
        new e0.a().a(exc.getClass().toString()).a(" during metadata injection w/ metadata = ").a(c0.h(getInfo(), "metadata")).a(e0.f5981i);
    }

    @Override // com.adcolony.sdk.k0
    public void a(f1 f1Var) {
        synchronized (this.f5901x) {
            if (this.f5900w) {
                e(f1Var);
                i8.w wVar = i8.w.f26638a;
            } else {
                this.f5902y.a(f1Var);
            }
        }
    }

    @Override // com.adcolony.sdk.k0
    public boolean a() {
        return (this.f5899v || this.f5900w) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ String a(String str, String str2) {
        p0 p0Var;
        if (!this.C.b()) {
            AdColonyInterstitial interstitial = getInterstitial();
            p0 p0Var2 = null;
            if (interstitial == null || kotlin.jvm.internal.n.a(c0.h(getIab(), "ad_type"), "video")) {
                p0Var = null;
            } else {
                interstitial.a(getIab());
                p0Var = interstitial.e();
            }
            if (p0Var == null) {
                AdColonyAdViewListener adColonyAdViewListener = com.adcolony.sdk.a.b().c().e().get(getAdSessionId());
                if (adColonyAdViewListener != null) {
                    adColonyAdViewListener.a(new p0(getIab(), getAdSessionId()));
                    p0Var2 = adColonyAdViewListener.f5688c;
                }
            } else {
                p0Var2 = p0Var;
            }
            if (p0Var2 != null && p0Var2.d() == 2) {
                this.E = true;
                if (str2.length() > 0) {
                    try {
                        return ScriptInjector.injectScriptContentIntoHtml(com.adcolony.sdk.a.b().p().a(str2, false).toString(), str);
                    } catch (IOException e8) {
                        b(e8);
                    }
                }
            }
        }
        return str;
    }
}
