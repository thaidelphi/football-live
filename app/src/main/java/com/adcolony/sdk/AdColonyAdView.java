package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.e0;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.ironsource.ug;
import java.io.File;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyAdView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private com.adcolony.sdk.c f5661a;

    /* renamed from: b  reason: collision with root package name */
    private AdColonyAdViewListener f5662b;

    /* renamed from: c  reason: collision with root package name */
    private AdColonyAdSize f5663c;

    /* renamed from: d  reason: collision with root package name */
    private String f5664d;

    /* renamed from: e  reason: collision with root package name */
    private String f5665e;

    /* renamed from: f  reason: collision with root package name */
    private String f5666f;

    /* renamed from: g  reason: collision with root package name */
    private String f5667g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f5668h;

    /* renamed from: i  reason: collision with root package name */
    private p0 f5669i;

    /* renamed from: j  reason: collision with root package name */
    private h0 f5670j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5671k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5672l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5673m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5674n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5675o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5676p;

    /* renamed from: q  reason: collision with root package name */
    private int f5677q;

    /* renamed from: r  reason: collision with root package name */
    private int f5678r;

    /* renamed from: s  reason: collision with root package name */
    private int f5679s;

    /* renamed from: t  reason: collision with root package name */
    private int f5680t;

    /* renamed from: u  reason: collision with root package name */
    private int f5681u;

    /* renamed from: v  reason: collision with root package name */
    private c f5682v;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context a10 = com.adcolony.sdk.a.a();
            if (a10 instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) a10).b();
            }
            d c10 = com.adcolony.sdk.a.b().c();
            c10.a(AdColonyAdView.this.f5664d);
            c10.a(AdColonyAdView.this.f5661a);
            f1 b10 = c0.b();
            c0.a(b10, ug.f21009x, AdColonyAdView.this.f5664d);
            new h0("AdSession.on_ad_view_destroyed", 1, b10).c();
            if (AdColonyAdView.this.f5682v != null) {
                AdColonyAdView.this.f5682v.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5684a;

        b(AdColonyAdView adColonyAdView, Context context) {
            this.f5684a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = this.f5684a;
            if (context instanceof AdColonyAdViewActivity) {
                ((AdColonyAdViewActivity) context).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAdView(Context context, h0 h0Var, AdColonyAdViewListener adColonyAdViewListener) throws RuntimeException {
        super(context);
        this.f5676p = true;
        this.f5662b = adColonyAdViewListener;
        this.f5665e = adColonyAdViewListener.c();
        f1 a10 = h0Var.a();
        this.f5664d = c0.h(a10, ug.f21009x);
        this.f5666f = c0.h(a10, "close_button_filepath");
        this.f5671k = c0.b(a10, "trusted_demand_source");
        this.f5675o = c0.b(a10, "close_button_snap_to_webview");
        this.f5680t = c0.d(a10, "close_button_width");
        this.f5681u = c0.d(a10, "close_button_height");
        com.adcolony.sdk.c cVar = com.adcolony.sdk.a.b().c().c().get(this.f5664d);
        this.f5661a = cVar;
        if (cVar != null) {
            this.f5663c = adColonyAdViewListener.a();
            setLayoutParams(new FrameLayout.LayoutParams(this.f5661a.d(), this.f5661a.b()));
            setBackgroundColor(0);
            addView(this.f5661a);
            return;
        }
        throw new RuntimeException("AdColonyAdView container cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f5672l;
    }

    public boolean destroy() {
        if (this.f5672l) {
            new e0.a().a("Ignoring duplicate call to destroy().").a(e0.f5978f);
            return false;
        }
        this.f5672l = true;
        p0 p0Var = this.f5669i;
        if (p0Var != null && p0Var.c() != null) {
            this.f5669i.b();
        }
        z0.b(new a());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        b1 webView = getWebView();
        if (this.f5669i == null || webView == null) {
            return;
        }
        webView.f();
    }

    public AdColonyAdSize getAdSize() {
        return this.f5663c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getClickOverride() {
        return this.f5667g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.adcolony.sdk.c getContainer() {
        return this.f5661a;
    }

    public AdColonyAdViewListener getListener() {
        return this.f5662b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0 getOmidManager() {
        return this.f5669i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getOrientation() {
        return this.f5677q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getTrustedDemandSource() {
        return this.f5671k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1 getWebView() {
        com.adcolony.sdk.c cVar = this.f5661a;
        if (cVar == null) {
            return null;
        }
        return cVar.n().get(2);
    }

    public String getZoneId() {
        return this.f5665e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f5676p || this.f5672l) {
            return;
        }
        this.f5676p = false;
        AdColonyAdViewListener adColonyAdViewListener = this.f5662b;
        if (adColonyAdViewListener != null) {
            adColonyAdViewListener.onShow(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setClickOverride(String str) {
        this.f5667g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExpandMessage(h0 h0Var) {
        this.f5670j = h0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExpandedHeight(int i10) {
        this.f5679s = (int) (i10 * com.adcolony.sdk.a.b().n().s());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExpandedWidth(int i10) {
        this.f5678r = (int) (i10 * com.adcolony.sdk.a.b().n().s());
    }

    public void setListener(AdColonyAdViewListener adColonyAdViewListener) {
        this.f5662b = adColonyAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNoCloseButton(boolean z10) {
        this.f5673m = this.f5671k && z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOmidManager(p0 p0Var) {
        this.f5669i = p0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnDestroyListenerOrCall(c cVar) {
        if (this.f5672l) {
            cVar.a();
        } else {
            this.f5682v = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOrientation(int i10) {
        this.f5677q = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setUserInteraction(boolean z10) {
        this.f5674n = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f5671k || this.f5674n) {
            float s10 = com.adcolony.sdk.a.b().n().s();
            this.f5661a.setLayoutParams(new FrameLayout.LayoutParams((int) (this.f5663c.getWidth() * s10), (int) (this.f5663c.getHeight() * s10)));
            b1 webView = getWebView();
            if (webView != null) {
                h0 h0Var = new h0("WebView.set_bounds", 0);
                f1 b10 = c0.b();
                c0.b(b10, "x", webView.getInitialX());
                c0.b(b10, "y", webView.getInitialY());
                c0.b(b10, "width", webView.getInitialWidth());
                c0.b(b10, "height", webView.getInitialHeight());
                h0Var.b(b10);
                webView.a(h0Var);
                f1 b11 = c0.b();
                c0.a(b11, "ad_session_id", this.f5664d);
                new h0("MRAID.on_close", this.f5661a.k(), b11).c();
            }
            ImageView imageView = this.f5668h;
            if (imageView != null) {
                this.f5661a.removeView(imageView);
                this.f5661a.a(this.f5668h);
            }
            addView(this.f5661a);
            AdColonyAdViewListener adColonyAdViewListener = this.f5662b;
            if (adColonyAdViewListener != null) {
                adColonyAdViewListener.onClosed(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        int width;
        if (!this.f5671k && !this.f5674n) {
            if (this.f5670j != null) {
                f1 b10 = c0.b();
                c0.b(b10, "success", false);
                this.f5670j.a(b10).c();
                this.f5670j = null;
            }
            return false;
        }
        q n10 = com.adcolony.sdk.a.b().n();
        Rect w10 = n10.w();
        int i10 = this.f5678r;
        if (i10 <= 0) {
            i10 = w10.width();
        }
        int i11 = this.f5679s;
        if (i11 <= 0) {
            i11 = w10.height();
        }
        int width2 = (w10.width() - i10) / 2;
        int height = (w10.height() - i11) / 2;
        this.f5661a.setLayoutParams(new FrameLayout.LayoutParams(w10.width(), w10.height()));
        b1 webView = getWebView();
        if (webView != null) {
            h0 h0Var = new h0("WebView.set_bounds", 0);
            f1 b11 = c0.b();
            c0.b(b11, "x", width2);
            c0.b(b11, "y", height);
            c0.b(b11, "width", i10);
            c0.b(b11, "height", i11);
            h0Var.b(b11);
            webView.a(h0Var);
            float s10 = n10.s();
            f1 b12 = c0.b();
            c0.b(b12, "app_orientation", z0.d(z0.f()));
            c0.b(b12, "width", (int) (i10 / s10));
            c0.b(b12, "height", (int) (i11 / s10));
            c0.b(b12, "x", z0.a(webView));
            c0.b(b12, "y", z0.b(webView));
            c0.a(b12, "ad_session_id", this.f5664d);
            new h0("MRAID.on_size_change", this.f5661a.k(), b12).c();
        }
        ImageView imageView = this.f5668h;
        if (imageView != null) {
            this.f5661a.removeView(imageView);
        }
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 != null && !this.f5673m && webView != null) {
            float s11 = com.adcolony.sdk.a.b().n().s();
            int i12 = (int) (this.f5680t * s11);
            int i13 = (int) (this.f5681u * s11);
            if (this.f5675o) {
                width = webView.getCurrentX() + webView.getCurrentWidth();
            } else {
                width = w10.width();
            }
            int currentY = this.f5675o ? webView.getCurrentY() : 0;
            ImageView imageView2 = new ImageView(a10.getApplicationContext());
            this.f5668h = imageView2;
            imageView2.setImageURI(Uri.fromFile(new File(this.f5666f)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(width - i12, currentY, 0, 0);
            this.f5668h.setOnClickListener(new b(this, a10));
            this.f5661a.addView(this.f5668h, layoutParams);
            this.f5661a.a(this.f5668h, FriendlyObstructionPurpose.CLOSE_AD);
        }
        if (this.f5670j != null) {
            f1 b13 = c0.b();
            c0.b(b13, "success", true);
            this.f5670j.a(b13).c();
            this.f5670j = null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f5674n;
    }
}
