package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.adcolony.sdk.e0;
import com.ironsource.b9;
import com.ironsource.ug;
import com.ironsource.xn;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b1 extends WebView {

    /* renamed from: u  reason: collision with root package name */
    public static final g f5818u = new g(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f5819a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f5820b;

    /* renamed from: c  reason: collision with root package name */
    private int f5821c;

    /* renamed from: d  reason: collision with root package name */
    private String f5822d;

    /* renamed from: e  reason: collision with root package name */
    private String f5823e;

    /* renamed from: f  reason: collision with root package name */
    private String f5824f;

    /* renamed from: g  reason: collision with root package name */
    private String f5825g;

    /* renamed from: h  reason: collision with root package name */
    private String f5826h;

    /* renamed from: i  reason: collision with root package name */
    private String f5827i;

    /* renamed from: j  reason: collision with root package name */
    private f1 f5828j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5829k;

    /* renamed from: l  reason: collision with root package name */
    private com.adcolony.sdk.c f5830l;

    /* renamed from: m  reason: collision with root package name */
    private int f5831m;

    /* renamed from: n  reason: collision with root package name */
    private int f5832n;

    /* renamed from: o  reason: collision with root package name */
    private int f5833o;

    /* renamed from: p  reason: collision with root package name */
    private int f5834p;

    /* renamed from: q  reason: collision with root package name */
    private int f5835q;

    /* renamed from: r  reason: collision with root package name */
    private int f5836r;

    /* renamed from: s  reason: collision with root package name */
    private int f5837s;

    /* renamed from: t  reason: collision with root package name */
    private int f5838t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class a extends WebChromeClient {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0062, code lost:
            if (r3 != false) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x007f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
        @Override // android.webkit.WebChromeClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onConsoleMessage(android.webkit.ConsoleMessage r9) {
            /*
                r8 = this;
                r0 = 0
                if (r9 != 0) goto L5
                r1 = r0
                goto L9
            L5:
                android.webkit.ConsoleMessage$MessageLevel r1 = r9.messageLevel()
            L9:
                if (r9 != 0) goto Ld
                r9 = r0
                goto L11
            Ld:
                java.lang.String r9 = r9.message()
            L11:
                r2 = 2
                r3 = 0
                r4 = 1
                if (r9 != 0) goto L17
                goto L21
            L17:
                java.lang.String r5 = "Viewport target-densitydpi is not supported."
                boolean r5 = b9.f.w(r9, r5, r3, r2, r0)
                if (r5 != r4) goto L21
                r5 = r4
                goto L22
            L21:
                r5 = r3
            L22:
                if (r5 != 0) goto L37
                if (r9 != 0) goto L27
                goto L31
            L27:
                java.lang.String r5 = "Viewport argument key \"shrink-to-fit\" not recognized and ignored"
                boolean r5 = b9.f.w(r9, r5, r3, r2, r0)
                if (r5 != r4) goto L31
                r5 = r4
                goto L32
            L31:
                r5 = r3
            L32:
                if (r5 == 0) goto L35
                goto L37
            L35:
                r5 = r3
                goto L38
            L37:
                r5 = r4
            L38:
                android.webkit.ConsoleMessage$MessageLevel r6 = android.webkit.ConsoleMessage.MessageLevel.ERROR
                if (r1 != r6) goto L3e
                r6 = r4
                goto L3f
            L3e:
                r6 = r3
            L3f:
                android.webkit.ConsoleMessage$MessageLevel r7 = android.webkit.ConsoleMessage.MessageLevel.WARNING
                if (r1 != r7) goto L45
                r1 = r4
                goto L46
            L45:
                r1 = r3
            L46:
                if (r9 != 0) goto L49
                goto L53
            L49:
                java.lang.String r7 = "ADC3_update is not defined"
                boolean r7 = b9.f.w(r9, r7, r3, r2, r0)
                if (r7 != r4) goto L53
                r7 = r4
                goto L54
            L53:
                r7 = r3
            L54:
                if (r7 != 0) goto L64
                if (r9 != 0) goto L59
                goto L62
            L59:
                java.lang.String r7 = "NativeLayer.dispatch_messages is not a function"
                boolean r2 = b9.f.w(r9, r7, r3, r2, r0)
                if (r2 != r4) goto L62
                r3 = r4
            L62:
                if (r3 == 0) goto L7d
            L64:
                com.adcolony.sdk.b1 r2 = com.adcolony.sdk.b1.this
                com.adcolony.sdk.h0 r3 = r2.getMessage()
                if (r3 != 0) goto L6d
                goto L71
            L6d:
                com.adcolony.sdk.f1 r0 = r3.a()
            L71:
                if (r0 != 0) goto L78
                com.adcolony.sdk.f1 r0 = new com.adcolony.sdk.f1
                r0.<init>()
            L78:
                java.lang.String r3 = "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device."
                r2.a(r0, r3)
            L7d:
                if (r5 != 0) goto Lc0
                if (r1 != 0) goto L83
                if (r6 == 0) goto Lc0
            L83:
                com.adcolony.sdk.b1 r0 = com.adcolony.sdk.b1.this
                com.adcolony.sdk.AdColonyInterstitial r0 = r0.getInterstitial()
                if (r0 != 0) goto L8c
                goto L92
            L8c:
                java.lang.String r0 = r0.a()
                if (r0 != 0) goto L94
            L92:
                java.lang.String r0 = "unknown"
            L94:
                com.adcolony.sdk.e0$a r1 = new com.adcolony.sdk.e0$a
                r1.<init>()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onConsoleMessage: "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r9 = " with ad id: "
                r2.append(r9)
                r2.append(r0)
                java.lang.String r9 = r2.toString()
                com.adcolony.sdk.e0$a r9 = r1.a(r9)
                if (r6 == 0) goto Lbb
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.e0.f5981i
                goto Lbd
            Lbb:
                com.adcolony.sdk.e0 r0 = com.adcolony.sdk.e0.f5979g
            Lbd:
                r9.a(r0)
            Lc0:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.b1.a.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (jsResult == null) {
                return true;
            }
            jsResult.confirm();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            i8.w wVar;
            f1 b10 = c0.b();
            c0.b(b10, ug.f21009x, b1.this.f5821c);
            c0.a(b10, "url", str);
            com.adcolony.sdk.c parentContainer = b1.this.getParentContainer();
            if (parentContainer == null) {
                wVar = null;
            } else {
                c0.a(b10, "ad_session_id", b1.this.getAdSessionId());
                c0.b(b10, "container_id", parentContainer.c());
                new h0("WebView.on_load", parentContainer.k(), b10).c();
                wVar = i8.w.f26638a;
            }
            if (wVar == null) {
                new h0("WebView.on_load", b1.this.getWebViewModuleId(), b10).c();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            b1.this.a(i10, str, str2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
            if (r6 == true) goto L5;
         */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r5, java.lang.String r6) {
            /*
                r4 = this;
                r5 = 1
                r0 = 0
                r1 = 0
                if (r6 != 0) goto L6
                goto L10
            L6:
                r2 = 2
                java.lang.String r3 = "mraid.js"
                boolean r6 = b9.f.k(r6, r3, r1, r2, r0)
                if (r6 != r5) goto L10
                goto L11
            L10:
                r5 = r1
            L11:
                if (r5 == 0) goto L35
                java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
                com.adcolony.sdk.b1 r6 = com.adcolony.sdk.b1.this
                java.lang.String r6 = com.adcolony.sdk.b1.a(r6)
                java.nio.charset.Charset r0 = com.adcolony.sdk.h.f6025a
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r6, r1)
                byte[] r6 = r6.getBytes(r0)
                r5.<init>(r6)
                android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse
                java.lang.String r0 = r0.name()
                java.lang.String r1 = "text/javascript"
                r6.<init>(r1, r0, r5)
                return r6
            L35:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.b1.b.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
            if (r6 == true) goto L9;
         */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r5, android.webkit.WebResourceRequest r6) {
            /*
                r4 = this;
                r5 = 1
                r0 = 0
                r1 = 0
                if (r6 != 0) goto L6
                goto L1e
            L6:
                android.net.Uri r6 = r6.getUrl()
                if (r6 != 0) goto Ld
                goto L1e
            Ld:
                java.lang.String r6 = r6.toString()
                if (r6 != 0) goto L14
                goto L1e
            L14:
                r2 = 2
                java.lang.String r3 = "mraid.js"
                boolean r6 = b9.f.k(r6, r3, r1, r2, r0)
                if (r6 != r5) goto L1e
                goto L1f
            L1e:
                r5 = r1
            L1f:
                if (r5 == 0) goto L43
                java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
                com.adcolony.sdk.b1 r6 = com.adcolony.sdk.b1.this
                java.lang.String r6 = com.adcolony.sdk.b1.a(r6)
                java.nio.charset.Charset r0 = com.adcolony.sdk.h.f6025a
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r6, r1)
                byte[] r6 = r6.getBytes(r0)
                r5.<init>(r6)
                android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse
                java.lang.String r0 = r0.name()
                java.lang.String r1 = "text/javascript"
                r6.<init>(r1, r0, r5)
                return r6
            L43:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.b1.c.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends c {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url;
            if (webResourceError == null) {
                return;
            }
            b1.this.a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e extends d {
        public e(b1 b1Var) {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f extends e {
        public f() {
            super(b1.this);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash()) {
                b1.this.a(c0.b(), "An error occurred while rendering the ad. Ad closing.");
            }
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g {
        private g() {
        }

        public /* synthetic */ g(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final b1 a(Context context, h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
            b1 b1Var;
            int e8 = com.adcolony.sdk.a.b().r().e();
            f1 a10 = h0Var.a();
            if (c0.b(a10, "use_mraid_module")) {
                b1Var = new l0(context, e8, h0Var, com.adcolony.sdk.a.b().r().e());
            } else if (c0.b(a10, "enable_messages")) {
                b1Var = new c1(context, e8, h0Var);
            } else {
                b1Var = new b1(context, e8, h0Var);
            }
            b1Var.a(h0Var, i10, cVar);
            b1Var.i();
            return b1Var;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class h implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class a extends kotlin.jvm.internal.o implements t8.a<i8.w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b1 f5845a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h0 f5846b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f5845a = b1Var;
                this.f5846b = h0Var;
            }

            public final void a() {
                this.f5845a.a(c0.h(this.f5846b.a(), "custom_js"));
            }

            @Override // t8.a
            public /* bridge */ /* synthetic */ i8.w invoke() {
                a();
                return i8.w.f26638a;
            }
        }

        h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class i implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class a extends kotlin.jvm.internal.o implements t8.a<i8.w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b1 f5848a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h0 f5849b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f5848a = b1Var;
                this.f5849b = h0Var;
            }

            public final void a() {
                this.f5848a.setVisible(this.f5849b);
            }

            @Override // t8.a
            public /* bridge */ /* synthetic */ i8.w invoke() {
                a();
                return i8.w.f26638a;
            }
        }

        i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class j implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class a extends kotlin.jvm.internal.o implements t8.a<i8.w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b1 f5851a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h0 f5852b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f5851a = b1Var;
                this.f5852b = h0Var;
            }

            public final void a() {
                this.f5851a.setBounds(this.f5852b);
            }

            @Override // t8.a
            public /* bridge */ /* synthetic */ i8.w invoke() {
                a();
                return i8.w.f26638a;
            }
        }

        j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class k implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        static final class a extends kotlin.jvm.internal.o implements t8.a<i8.w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b1 f5854a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h0 f5855b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, h0 h0Var) {
                super(0);
                this.f5854a = b1Var;
                this.f5855b = h0Var;
            }

            public final void a() {
                this.f5854a.setTransparent(c0.b(this.f5855b.a(), b9.h.T));
            }

            @Override // t8.a
            public /* bridge */ /* synthetic */ i8.w invoke() {
                a();
                return i8.w.f26638a;
            }
        }

        k() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            b1 b1Var = b1.this;
            b1Var.a(h0Var, new a(b1Var, h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ t8.a f5856a;

        l(t8.a aVar) {
            this.f5856a = aVar;
        }

        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.f5856a.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class m implements Runnable {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a extends WebViewClient {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b1 f5858a;

            a(b1 b1Var) {
                this.f5858a = b1Var;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                this.f5858a.destroy();
            }
        }

        m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b1.this.setWebChromeClient(null);
            b1.this.setWebViewClient(new a(b1.this));
            b1.this.clearCache(true);
            b1.this.removeAllViews();
            b1.this.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b1(Context context, int i10, h0 h0Var) {
        super(context);
        this.f5819a = i10;
        this.f5820b = h0Var;
        this.f5822d = "";
        this.f5823e = "";
        this.f5824f = "";
        this.f5825g = "";
        this.f5826h = "";
        this.f5827i = "";
        this.f5828j = c0.b();
    }

    public static final b1 a(Context context, h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        return f5818u.a(context, h0Var, i10, cVar);
    }

    private final void d() {
        ArrayList<String> j10;
        ArrayList<j0> i10;
        com.adcolony.sdk.c cVar = this.f5830l;
        if (cVar != null && (i10 = cVar.i()) != null) {
            i10.add(com.adcolony.sdk.a.a("WebView.execute_js", (j0) new h(), true));
            i10.add(com.adcolony.sdk.a.a("WebView.set_visible", (j0) new i(), true));
            i10.add(com.adcolony.sdk.a.a("WebView.set_bounds", (j0) new j(), true));
            i10.add(com.adcolony.sdk.a.a("WebView.set_transparent", (j0) new k(), true));
        }
        com.adcolony.sdk.c cVar2 = this.f5830l;
        if (cVar2 == null || (j10 = cVar2.j()) == null) {
            return;
        }
        j10.add("WebView.execute_js");
        j10.add("WebView.set_visible");
        j10.add("WebView.set_bounds");
        j10.add("WebView.set_transparent");
    }

    private final WebViewClient g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return getWebViewClientApi26();
        }
        if (i10 >= 24) {
            return getWebViewClientApi24();
        }
        if (i10 >= 23) {
            return getWebViewClientApi23();
        }
        if (i10 >= 21) {
            return getWebViewClientApi21();
        }
        return getWebViewClientDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTransparent(boolean z10) {
        setBackgroundColor(z10 ? 0 : -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public /* synthetic */ void e() {
        d();
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5833o, this.f5834p);
        layoutParams.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams.gravity = 0;
        com.adcolony.sdk.c cVar = this.f5830l;
        if (cVar == null) {
            return;
        }
        cVar.addView(this, layoutParams);
    }

    public final void f() {
        com.adcolony.sdk.a.b().c().a(this, this.f5826h, this.f5830l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ String getAdSessionId() {
        return this.f5826h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ AdColonyAdView getAdView() {
        return com.adcolony.sdk.a.b().c().d().get(this.f5826h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ String getBaseUrl() {
        return this.f5825g;
    }

    public final int getCurrentHeight() {
        return this.f5834p;
    }

    public final int getCurrentWidth() {
        return this.f5833o;
    }

    public final int getCurrentX() {
        return this.f5831m;
    }

    public final int getCurrentY() {
        return this.f5832n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ boolean getDestroyed() {
        return this.f5829k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ f1 getInfo() {
        return this.f5828j;
    }

    public final int getInitialHeight() {
        return this.f5838t;
    }

    public final int getInitialWidth() {
        return this.f5837s;
    }

    public final int getInitialX() {
        return this.f5835q;
    }

    public final int getInitialY() {
        return this.f5836r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ AdColonyInterstitial getInterstitial() {
        return com.adcolony.sdk.a.b().c().f().get(this.f5826h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ String getMUrl() {
        return this.f5824f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ h0 getMessage() {
        return this.f5820b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ String getMraidFilepath() {
        return this.f5827i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ com.adcolony.sdk.c getParentContainer() {
        return this.f5830l;
    }

    protected /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new c();
    }

    protected /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new d();
    }

    protected /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new e(this);
    }

    protected /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new f();
    }

    protected /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new b();
    }

    public final int getWebViewModuleId() {
        return this.f5819a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ String h() {
        AdColonyInterstitial interstitial;
        if (getInterstitial() != null) {
            String str = ((Object) interstitial.a()) + " : " + interstitial.getZoneID();
            if (str != null) {
                return str;
            }
        }
        return "unknown";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public /* synthetic */ void i() {
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        setWebChromeClient(new a());
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setGeolocationEnabled(true);
        if (i10 >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i10 >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccess(true);
        }
        setWebViewClient(g());
        j();
        if (!(this instanceof com.adcolony.sdk.j)) {
            e();
        }
        if (this.f5822d.length() > 0) {
            a(this.f5822d);
        }
    }

    protected /* synthetic */ void j() {
        boolean r10;
        boolean w10;
        boolean r11;
        boolean r12;
        r10 = b9.o.r(this.f5824f, "http", false, 2, null);
        if (!r10) {
            r12 = b9.o.r(this.f5824f, b9.h.f16640b, false, 2, null);
            if (!r12) {
                loadDataWithBaseURL(this.f5825g, this.f5824f, "text/html", null, null);
                return;
            }
        }
        w10 = b9.p.w(this.f5824f, ".html", false, 2, null);
        if (!w10) {
            r11 = b9.o.r(this.f5824f, b9.h.f16640b, false, 2, null);
            if (r11) {
                String str = this.f5824f;
                loadDataWithBaseURL(str, "<html><script src=\"" + this.f5824f + "\"></script></html>", "text/html", null, null);
                return;
            }
        }
        loadUrl(this.f5824f);
    }

    protected /* synthetic */ void k() {
        if (this.f5827i.length() > 0) {
            try {
                this.f5823e = com.adcolony.sdk.a.b().p().a(this.f5827i, false).toString();
                b9.e eVar = new b9.e("bridge.os_name\\s*=\\s*\"\"\\s*;");
                this.f5823e = eVar.c(this.f5823e, "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f5828j + ";\n");
            } catch (IOException e8) {
                a(e8);
            } catch (IllegalArgumentException e10) {
                a(e10);
            } catch (IndexOutOfBoundsException e11) {
                a(e11);
            }
        }
    }

    public final void l() {
        if (this.f5829k) {
            return;
        }
        this.f5829k = true;
        z0.b(new m());
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            AdColonyAdView adView = getAdView();
            if (adView != null && !adView.c()) {
                f1 b10 = c0.b();
                c0.a(b10, "ad_session_id", getAdSessionId());
                new h0("WebView.on_first_click", 1, b10).c();
                adView.setUserInteraction(true);
            }
            AdColonyInterstitial interstitial = getInterstitial();
            if (interstitial != null) {
                interstitial.b(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void setAdSessionId(String str) {
        this.f5826h = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void setBaseUrl(String str) {
        this.f5825g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public /* synthetic */ void setBounds(h0 h0Var) {
        f1 a10 = h0Var.a();
        this.f5831m = c0.d(a10, "x");
        this.f5832n = c0.d(a10, "y");
        this.f5833o = c0.d(a10, "width");
        this.f5834p = c0.d(a10, "height");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(getCurrentX(), getCurrentY(), 0, 0);
        layoutParams2.width = getCurrentWidth();
        layoutParams2.height = getCurrentHeight();
        i8.w wVar = i8.w.f26638a;
        setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void setInfo(f1 f1Var) {
        this.f5828j = f1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void setMUrl(String str) {
        this.f5824f = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void setMraidFilepath(String str) {
        this.f5827i = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public /* synthetic */ void setVisible(h0 h0Var) {
        setVisibility(c0.b(h0Var.a(), "visible") ? 0 : 4);
    }

    public final void b(h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        a(h0Var, i10, cVar);
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public /* synthetic */ void a(h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        this.f5821c = i10;
        this.f5830l = cVar;
        f1 a10 = h0Var.a();
        String i11 = c0.i(a10, "url");
        if (i11 == null) {
            i11 = c0.h(a10, "data");
        }
        this.f5824f = i11;
        this.f5825g = c0.h(a10, "base_url");
        this.f5822d = c0.h(a10, "custom_js");
        this.f5826h = c0.h(a10, "ad_session_id");
        this.f5828j = c0.f(a10, "info");
        this.f5827i = c0.h(a10, "mraid_filepath");
        this.f5833o = c0.d(a10, "width");
        this.f5834p = c0.d(a10, "height");
        this.f5831m = c0.d(a10, "x");
        int d10 = c0.d(a10, "y");
        this.f5832n = d10;
        this.f5837s = this.f5833o;
        this.f5838t = this.f5834p;
        this.f5835q = this.f5831m;
        this.f5836r = d10;
        k();
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final /* synthetic */ void a(String str) {
        if (this.f5829k) {
            new e0.a().a("Ignoring call to execute_js as WebView has been destroyed.").a(e0.f5975c);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                new e0.a().a("Device reporting incorrect OS version, evaluateJavascript ").a("is not available. Disabling AdColony.").a(e0.f5980h);
                AdColony.disable();
            }
        } else {
            loadUrl(kotlin.jvm.internal.n.n("javascript:", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public /* synthetic */ boolean a(f1 f1Var, String str) {
        Context a10 = com.adcolony.sdk.a.a();
        com.adcolony.sdk.b bVar = a10 instanceof com.adcolony.sdk.b ? (com.adcolony.sdk.b) a10 : null;
        if (bVar == null) {
            return false;
        }
        com.adcolony.sdk.a.b().c().a(bVar, f1Var, str);
        return true;
    }

    private final void a(Exception exc) {
        new e0.a().a(exc.getClass().toString()).a(" during metadata injection w/ metadata = ").a(c0.h(this.f5828j, "metadata")).a(e0.f5981i);
        com.adcolony.sdk.c cVar = this.f5830l;
        if (cVar == null) {
            return;
        }
        f1 b10 = c0.b();
        c0.a(b10, ug.f21009x, getAdSessionId());
        new h0("AdSession.on_error", cVar.k(), b10).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i10, String str, String str2) {
        com.adcolony.sdk.c cVar = this.f5830l;
        if (cVar != null) {
            f1 b10 = c0.b();
            c0.b(b10, ug.f21009x, this.f5821c);
            c0.a(b10, "ad_session_id", getAdSessionId());
            c0.b(b10, "container_id", cVar.c());
            c0.b(b10, "code", i10);
            c0.a(b10, xn.a.f21422g, str);
            c0.a(b10, "url", str2);
            new h0("WebView.on_error", cVar.k(), b10).c();
        }
        e0.a a10 = new e0.a().a("onReceivedError: ");
        if (str == null) {
            str = "WebViewErrorMessage: null description";
        }
        a10.a(str).a(e0.f5981i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(h0 h0Var, t8.a<i8.w> aVar) {
        f1 a10 = h0Var.a();
        if (c0.d(a10, ug.f21009x) == this.f5821c) {
            int d10 = c0.d(a10, "container_id");
            com.adcolony.sdk.c cVar = this.f5830l;
            if (cVar != null && d10 == cVar.c()) {
                String h10 = c0.h(a10, "ad_session_id");
                com.adcolony.sdk.c cVar2 = this.f5830l;
                if (kotlin.jvm.internal.n.a(h10, cVar2 == null ? null : cVar2.a())) {
                    z0.b(new l(aVar));
                }
            }
        }
    }

    public final void a(h0 h0Var) {
        setBounds(h0Var);
    }
}
