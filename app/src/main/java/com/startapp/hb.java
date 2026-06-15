package com.startapp;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class hb implements gb {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22065a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<Executor> f22066b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<w2> f22067c;

    /* renamed from: d  reason: collision with root package name */
    public final t4<f5> f22068d;

    /* renamed from: e  reason: collision with root package name */
    public final j2<WvfMetadata> f22069e;

    /* renamed from: g  reason: collision with root package name */
    public String f22071g;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedList<WebView> f22070f = new LinkedList<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f22072h = true;

    /* renamed from: i  reason: collision with root package name */
    public final a f22073i = new a();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hb.this.d();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22075a;

        public b(String str) {
            this.f22075a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hb.this.f22071g = this.f22075a;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22077a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebView f22078b;

        public c(String str, WebView webView) {
            this.f22077a = str;
            this.f22078b = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            hb.this.f22071g = this.f22077a;
            this.f22078b.setWebViewClient(new WebViewClient());
            hb hbVar = hb.this;
            WebView webView = this.f22078b;
            hbVar.getClass();
            try {
                hbVar.f22070f.addLast(webView);
            } catch (Throwable th) {
                if (hbVar.a(4)) {
                    l3.a(th);
                }
            }
        }
    }

    public hb(Context context, t4<Executor> t4Var, t4<w2> t4Var2, t4<f5> t4Var3, j2<WvfMetadata> j2Var) {
        if (Build.VERSION.SDK_INT >= 31 && !context.isUiContext()) {
            this.f22065a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        } else {
            this.f22065a = context;
        }
        this.f22066b = t4Var;
        this.f22067c = t4Var2;
        this.f22068d = t4Var3;
        this.f22069e = j2Var;
    }

    @Override // com.startapp.gb
    public final void a(String str) {
        this.f22071g = str;
    }

    @Override // com.startapp.gb
    public final void b() {
        try {
            this.f22068d.a().a(this.f22073i);
        } catch (Throwable th) {
            if (a(256)) {
                l3.a(th);
            }
        }
    }

    @Override // com.startapp.gb
    public final WebView c() {
        if (this.f22070f.size() < 1) {
            return new WebView(this.f22065a);
        }
        if (this.f22070f.size() == 1) {
            b();
        }
        return this.f22070f.removeFirst();
    }

    public final void d() {
        WebView webView;
        if (this.f22070f.size() < 1) {
            try {
                webView = new WebView(this.f22065a);
            } catch (Throwable th) {
                if (a(2)) {
                    l3.a(th);
                }
                webView = null;
            }
            if (webView != null) {
                try {
                    this.f22070f.addLast(webView);
                } catch (Throwable th2) {
                    if (a(4)) {
                        l3.a(th2);
                    }
                }
                if (this.f22072h && TextUtils.isEmpty(this.f22071g)) {
                    b();
                }
            }
        } else if (this.f22072h && TextUtils.isEmpty(this.f22071g)) {
            this.f22072h = false;
            WvfMetadata call = this.f22069e.call();
            int b10 = o9.b(call != null ? call.c() : WvfMetadata.f23194a);
            int i10 = b10 >= 0 ? b10 : 0;
            if (i10 != 1) {
                if (i10 == 2 && Build.VERSION.SDK_INT >= 21) {
                    WebView removeFirst = this.f22070f.removeFirst();
                    try {
                        removeFirst.setWebViewClient(new jb(this));
                        this.f22067c.a().execute(new kb(removeFirst));
                    } catch (Throwable th3) {
                        if (a(32)) {
                            l3.a(th3);
                        }
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 17) {
                try {
                    this.f22066b.a().execute(new ib(this));
                } catch (Throwable th4) {
                    if (a(8)) {
                        l3.a(th4);
                    }
                }
            }
        }
    }

    public final void e() {
        try {
            this.f22067c.a().execute(new b(WebSettings.getDefaultUserAgent(this.f22065a)));
        } catch (Throwable th) {
            if (a(16)) {
                l3.a(th);
            }
        }
    }

    public final boolean a(int i10) {
        WvfMetadata call = this.f22069e.call();
        ComponentInfoEventConfig a10 = call != null ? call.a() : null;
        return a10 != null && a10.a((long) i10);
    }

    @Override // com.startapp.gb
    public final String a() {
        String str = this.f22071g;
        WeakHashMap weakHashMap = o9.f22359a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (str == null) {
            try {
                str = System.getProperty("http.agent");
                if (str == null) {
                    return null;
                }
                if (str.length() <= 0) {
                    return null;
                }
            } catch (Throwable th) {
                if (a(1)) {
                    l3.a(th);
                    return null;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r4.length() > 0) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.webkit.WebView r3, android.webkit.WebResourceRequest r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L27
            java.util.Map r4 = r4.getRequestHeaders()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L27
            java.lang.String r0 = "User-Agent"
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1b
            java.util.WeakHashMap r0 = com.startapp.o9.f22359a     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L27
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1b
            if (r0 <= 0) goto L27
            goto L28
        L1b:
            r4 = move-exception
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L27
            com.startapp.l3.a(r4)     // Catch: java.lang.Throwable -> L39
        L27:
            r4 = 0
        L28:
            com.startapp.t4<com.startapp.w2> r0 = r2.f22067c     // Catch: java.lang.Throwable -> L39
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L39
            com.startapp.w2 r0 = (com.startapp.w2) r0     // Catch: java.lang.Throwable -> L39
            com.startapp.hb$c r1 = new com.startapp.hb$c     // Catch: java.lang.Throwable -> L39
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L39
            r0.execute(r1)     // Catch: java.lang.Throwable -> L39
            goto L45
        L39:
            r3 = move-exception
            r4 = 64
            boolean r4 = r2.a(r4)
            if (r4 == 0) goto L45
            com.startapp.l3.a(r3)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.hb.a(android.webkit.WebView, android.webkit.WebResourceRequest):void");
    }
}
