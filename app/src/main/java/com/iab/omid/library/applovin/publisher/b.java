package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.internal.h;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g  reason: collision with root package name */
    private WebView f15752g;

    /* renamed from: h  reason: collision with root package name */
    private Long f15753h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f15754i;

    /* renamed from: j  reason: collision with root package name */
    private final String f15755j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.applovin.publisher.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class RunnableC0203b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f15757a;

        RunnableC0203b() {
            this.f15757a = b.this.f15752g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15757a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f15753h = null;
        this.f15754i = map;
        this.f15755j = str2;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0203b(), Math.max(4000 - (this.f15753h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f15753h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f15752g = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(g.b().a());
        this.f15752g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f15752g.getSettings().setAllowContentAccess(false);
        this.f15752g.getSettings().setAllowFileAccess(false);
        this.f15752g.setWebViewClient(new a());
        a(this.f15752g);
        h.a().c(this.f15752g, this.f15755j);
        for (String str : this.f15754i.keySet()) {
            h.a().c(this.f15752g, this.f15754i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f15753h = Long.valueOf(f.b());
    }
}
