package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.d7;
import com.applovin.impl.e7;
import com.applovin.impl.e8;
import com.applovin.impl.h7;
import com.applovin.impl.k4;
import com.applovin.impl.l0;
import com.applovin.impl.m7;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends com.applovin.impl.g0 {

    /* renamed from: j  reason: collision with root package name */
    private static final Set f6594j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k  reason: collision with root package name */
    private static final Object f6595k = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.n f6596c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f6597d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f6598e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6599f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6600g;

    /* renamed from: h  reason: collision with root package name */
    private final List f6601h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f6602i;

    public b(c cVar, com.applovin.impl.sdk.j jVar, Context context) {
        super(context);
        this.f6601h = new ArrayList();
        this.f6602i = new Object();
        if (jVar != null) {
            this.f6597d = jVar;
            this.f6596c = jVar.I();
            Integer num = (Integer) jVar.a(o4.f8121g6);
            if (num.intValue() > 0) {
                synchronized (f6595k) {
                    Set set = f6594j;
                    set.add(this);
                    d7.a("AdWebView", set.size(), num.intValue(), jVar.D());
                }
            }
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setWebViewClient(cVar != null ? cVar : new k4());
            setWebChromeClient(new com.applovin.impl.p(cVar != null ? cVar.c() : null, jVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (l0.k() && ((Boolean) jVar.a(o4.D5)).booleanValue()) {
                setWebViewRenderProcessClient(new d(jVar).a());
            }
            setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.c0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a10;
                    a10 = b.a(view, motionEvent);
                    return a10;
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.b0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean a10;
                    a10 = b.this.a(view);
                    return a10;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    private void b() {
        synchronized (this.f6602i) {
            for (String str : this.f6601h) {
                e8.a(this, str, "AdWebView", this.f6597d);
            }
            this.f6601h.clear();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f6599f = true;
        this.f6600g = false;
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f6598e;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f6600g = z10;
        if (z10 && ((Boolean) this.f6597d.a(o4.Y5)).booleanValue()) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f6596c.a("AdWebView", "Received a LongClick event.");
            return true;
        }
        return true;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.f6599f) {
            this.f6598e = bVar;
            try {
                applySettings(bVar);
                if (d7.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof com.applovin.impl.sdk.ad.a) {
                    loadDataWithBaseURL(bVar.h(), ((com.applovin.impl.sdk.ad.a) bVar).e1(), "text/html", null, "");
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f6596c.a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                } else if (bVar instanceof e7) {
                    e7 e7Var = (e7) bVar;
                    h7 e12 = e7Var.e1();
                    if (e12 != null) {
                        m7 e8 = e12.e();
                        Uri c10 = e8.c();
                        String uri = c10 != null ? c10.toString() : "";
                        String b10 = e8.b();
                        String g12 = e7Var.g1();
                        if (!StringUtils.isValidString(uri) && !StringUtils.isValidString(b10)) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f6596c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (e8.d() == m7.a.STATIC) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f6596c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a10 = a((String) this.f6597d.a(o4.f8239v4), uri);
                            if (e7Var.v1() && e7Var.isOpenMeasurementEnabled() && e7Var.w1()) {
                                a10 = this.f6597d.V().a(a10);
                            }
                            loadDataWithBaseURL(bVar.h(), a10, "text/html", null, "");
                            return;
                        } else if (e8.d() == m7.a.HTML) {
                            if (StringUtils.isValidString(b10)) {
                                String a11 = a(g12, b10);
                                String str = StringUtils.isValidString(a11) ? a11 : b10;
                                if (com.applovin.impl.sdk.n.a()) {
                                    com.applovin.impl.sdk.n nVar = this.f6596c;
                                    nVar.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.h(), str, "text/html", null, "");
                                return;
                            } else if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f6596c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(uri, bVar.h(), g12, this.f6597d, e7Var);
                                return;
                            } else {
                                return;
                            }
                        } else if (e8.d() == m7.a.IFRAME) {
                            if (StringUtils.isValidString(uri)) {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f6596c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(uri, bVar.h(), g12, this.f6597d, e7Var);
                                return;
                            } else if (StringUtils.isValidString(b10)) {
                                String a12 = a(g12, b10);
                                String str2 = StringUtils.isValidString(a12) ? a12 : b10;
                                if (com.applovin.impl.sdk.n.a()) {
                                    com.applovin.impl.sdk.n nVar2 = this.f6596c;
                                    nVar2.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                }
                                loadDataWithBaseURL(bVar.h(), str2, "text/html", null, "");
                                return;
                            } else {
                                return;
                            }
                        } else if (com.applovin.impl.sdk.n.a()) {
                            this.f6596c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        } else {
                            return;
                        }
                    } else if (com.applovin.impl.sdk.n.a()) {
                        this.f6596c.a("AdWebView", "No companion ad provided.");
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                String valueOf = bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null";
                throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
            }
        }
        com.applovin.impl.sdk.n.h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    public void a(String str) {
        if (((Boolean) this.f6597d.a(o4.Y5)).booleanValue()) {
            if (this.f6600g) {
                e8.a(this, str, "AdWebView", this.f6597d);
                return;
            }
            synchronized (this.f6601h) {
                this.f6601h.add(str);
            }
            return;
        }
        e8.a(this, str, "AdWebView", this.f6597d);
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.j jVar, e7 e7Var) {
        String a10 = a(str3, str);
        if (StringUtils.isValidString(a10)) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f6596c;
                nVar.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a10);
            }
            loadDataWithBaseURL(str2, a10, "text/html", null, "");
            return;
        }
        String a11 = a((String) jVar.a(o4.f8247w4), str);
        if (StringUtils.isValidString(a11)) {
            if (e7Var.v1() && e7Var.isOpenMeasurementEnabled()) {
                a11 = jVar.V().a(a11);
            }
            String str4 = a11;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar2 = this.f6596c;
                nVar2.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", null, "");
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar3 = this.f6596c;
            nVar3.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
