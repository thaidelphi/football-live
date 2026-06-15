package com.iab.omid.library.startio.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.internal.g;
import com.iab.omid.library.startio.utils.c;
import com.iab.omid.library.startio.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: f  reason: collision with root package name */
    private WebView f16014f;

    /* renamed from: g  reason: collision with root package name */
    private Long f16015g = null;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f16016h;

    /* renamed from: i  reason: collision with root package name */
    private final String f16017i;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        String f16018a = "OMID NativeBridge WebViewClient";

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = this.f16018a;
            Log.w(str, "WebView renderer gone: " + renderProcessGoneDetail.toString());
            if (b.this.getWebView() == webView) {
                Log.w(this.f16018a, "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
                webView.destroy();
                return true;
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    /* compiled from: Sta */
    /* renamed from: com.iab.omid.library.startio.publisher.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class RunnableC0211b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f16020a;

        public RunnableC0211b() {
            this.f16020a = b.this.f16014f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16020a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f16016h = map;
        this.f16017i = str;
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0211b(), Math.max(4000 - (this.f16015g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f16015g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f16014f = null;
    }

    @Override // com.iab.omid.library.startio.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.startio.internal.f.b().a());
        this.f16014f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16014f.getSettings().setAllowContentAccess(false);
        this.f16014f.getSettings().setAllowFileAccess(false);
        this.f16014f.setWebViewClient(new a());
        a(this.f16014f);
        g.a().c(this.f16014f, this.f16017i);
        for (String str : this.f16016h.keySet()) {
            g.a().a(this.f16014f, this.f16016h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f16015g = Long.valueOf(f.b());
    }
}
