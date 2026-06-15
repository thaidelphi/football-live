package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import com.adcolony.sdk.c1;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.io.File;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l0 extends c1 {
    private final int F;
    private ImageView G;
    private String H;
    private String I;
    private int J;
    private int K;
    private boolean L;
    private boolean M;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class a extends c1.c {
        public a() {
            super();
        }

        @Override // com.adcolony.sdk.c1.c, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class b extends c1.d {
        public b() {
            super();
        }

        @Override // com.adcolony.sdk.c1.d, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class c extends c1.e {
        public c() {
            super();
        }

        @Override // com.adcolony.sdk.c1.e, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class d extends c1.f {
        public d() {
            super();
        }

        @Override // com.adcolony.sdk.c1.f, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class e extends c1.g {
        public e() {
            super();
        }

        @Override // com.adcolony.sdk.c1.g, com.adcolony.sdk.b1.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            new f().a();
            super.onPageFinished(webView, str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private final class f {
        public f() {
        }

        public final void a() {
            if (l0.this.getModuleInitialized()) {
                return;
            }
            float s10 = com.adcolony.sdk.a.b().n().s();
            f1 info = l0.this.getInfo();
            l0 l0Var = l0.this;
            c0.b(info, "app_orientation", z0.d(z0.f()));
            c0.b(info, "x", z0.a(l0Var));
            c0.b(info, "y", z0.b(l0Var));
            c0.b(info, "width", (int) (l0Var.getCurrentWidth() / s10));
            c0.b(info, "height", (int) (l0Var.getCurrentHeight() / s10));
            c0.a(info, "ad_session_id", l0Var.getAdSessionId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            z0.a(new Intent("android.intent.action.VIEW", Uri.parse(l0.this.I)));
            com.adcolony.sdk.a.b().A().c(l0.this.getAdSessionId());
        }
    }

    public l0(Context context, int i10, h0 h0Var, int i11) {
        super(context, i10, h0Var);
        this.F = i11;
        this.H = "";
        this.I = "";
    }

    private final void q() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null || getParentContainer() == null || this.M) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        ImageView imageView = new ImageView(a10);
        imageView.setImageURI(Uri.fromFile(new File(this.H)));
        imageView.setBackground(gradientDrawable);
        imageView.setOnClickListener(new g());
        i8.w wVar = i8.w.f26638a;
        this.G = imageView;
        r();
        addView(this.G);
    }

    private final void r() {
        ImageView imageView = this.G;
        if (imageView == null) {
            return;
        }
        Rect w10 = com.adcolony.sdk.a.b().n().w();
        int currentX = this.L ? getCurrentX() + getCurrentWidth() : w10.width();
        int currentY = this.L ? getCurrentY() + getCurrentHeight() : w10.height();
        float s10 = com.adcolony.sdk.a.b().n().s();
        int i10 = (int) (this.J * s10);
        int i11 = (int) (this.K * s10);
        imageView.setLayoutParams(new AbsoluteLayout.LayoutParams(i10, i11, currentX - i10, currentY - i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void e() {
        super.e();
        if (this.H.length() > 0) {
            if (this.I.length() > 0) {
                q();
            }
        }
    }

    @Override // com.adcolony.sdk.c1
    protected /* synthetic */ int getAdc3ModuleId() {
        return this.F;
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

    @Override // com.adcolony.sdk.b1
    protected /* synthetic */ void k() {
        if (getMraidFilepath().length() > 0) {
            b9.e eVar = new b9.e("script\\s*src\\s*=\\s*\"mraid.js\"");
            setMUrl(a(eVar.c(getMUrl(), "script src=\"file://" + getMraidFilepath() + '\"'), c0.h(c0.f(getInfo(), "device_info"), "iab_filepath")));
        }
    }

    public final void p() {
        com.adcolony.sdk.c parentContainer;
        ImageView imageView = this.G;
        if (imageView == null || (parentContainer = getParentContainer()) == null) {
            return;
        }
        parentContainer.a(imageView, FriendlyObstructionPurpose.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.b1
    public /* synthetic */ void setBounds(h0 h0Var) {
        super.setBounds(h0Var);
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.c1, com.adcolony.sdk.b1
    public /* synthetic */ void a(h0 h0Var, int i10, com.adcolony.sdk.c cVar) {
        f1 a10 = h0Var.a();
        this.H = c0.h(a10, "ad_choices_filepath");
        this.I = c0.h(a10, "ad_choices_url");
        this.J = c0.d(a10, "ad_choices_width");
        this.K = c0.d(a10, "ad_choices_height");
        this.L = c0.b(a10, "ad_choices_snap_to_webview");
        this.M = c0.b(a10, "disable_ad_choices");
        super.a(h0Var, i10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.adcolony.sdk.b1
    public /* synthetic */ boolean a(f1 f1Var, String str) {
        if (super.a(f1Var, str)) {
            return true;
        }
        setEnableMessages(false);
        return true;
    }
}
