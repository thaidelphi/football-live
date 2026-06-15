package com.adcolony.sdk;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adcolony.sdk.c1;
import com.ironsource.ug;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j extends c1 {
    public static final f F = new f(null);

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class a extends c1.c {
        public a() {
            super();
        }

        @Override // com.adcolony.sdk.c1.c, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new g().a();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class b extends c1.d {
        public b() {
            super();
        }

        @Override // com.adcolony.sdk.c1.d, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new g().a();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class c extends c1.e {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.c1.e, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new g().a();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class d extends c1.f {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.c1.f, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new g().a();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    protected class e extends c1.g {
        public e() {
            super();
        }

        @Override // com.adcolony.sdk.c1.g, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new g().a();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final j a(Context context, h0 h0Var) {
            j jVar;
            int e8 = com.adcolony.sdk.a.b().r().e();
            if (kotlin.jvm.internal.n.a(c0.h(h0Var.a(), "type"), "aurora")) {
                jVar = new com.adcolony.sdk.e(context, e8, h0Var);
            } else {
                jVar = new j(context, e8, h0Var);
            }
            jVar.i();
            return jVar;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class g {
        public g() {
        }

        public final void a() {
            h0 a10;
            if (j.this instanceof l) {
                return;
            }
            f1 b10 = c0.b();
            j jVar = j.this;
            c0.b(b10, "success", true);
            c0.b(b10, ug.f21009x, jVar.getAdc3ModuleId());
            h0 message = j.this.getMessage();
            if (message == null || (a10 = message.a(b10)) == null) {
                return;
            }
            a10.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(Context context, int i10, h0 h0Var) {
        super(context, i10, h0Var);
    }

    public static final j a(Context context, h0 h0Var) {
        return F.a(context, h0Var);
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi21() {
        return new b();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi23() {
        return new c();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi24() {
        return new d();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientApi26() {
        return new e();
    }

    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    protected /* synthetic */ WebViewClient getWebViewClientDefault() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ void i() {
        h0 message = getMessage();
        f1 a10 = message == null ? null : message.a();
        if (a10 == null) {
            a10 = c0.b();
        }
        setMraidFilepath(c0.h(a10, "mraid_filepath"));
        setBaseUrl(c0.h(a10, "base_url"));
        setIab(c0.f(a10, "iab"));
        setInfo(c0.f(a10, "info"));
        setAdSessionId(c0.h(a10, "ad_session_id"));
        setMUrl(d(a10));
        super.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void setBounds(h0 h0Var) {
        super.setBounds(h0Var);
        f1 b10 = c0.b();
        c0.b(b10, "success", true);
        c0.b(b10, ug.f21009x, getAdc3ModuleId());
        h0Var.a(b10).c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void setVisible(h0 h0Var) {
        super.setVisible(h0Var);
        f1 b10 = c0.b();
        c0.b(b10, "success", true);
        c0.b(b10, ug.f21009x, getAdc3ModuleId());
        h0Var.a(b10).c();
    }
}
