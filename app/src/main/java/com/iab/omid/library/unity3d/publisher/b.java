package com.iab.omid.library.unity3d.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.internal.g;
import com.iab.omid.library.unity3d.utils.c;
import com.iab.omid.library.unity3d.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g  reason: collision with root package name */
    private WebView f16143g;

    /* renamed from: h  reason: collision with root package name */
    private Long f16144h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f16145i;

    /* renamed from: j  reason: collision with root package name */
    private final String f16146j;

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

    /* renamed from: com.iab.omid.library.unity3d.publisher.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class RunnableC0215b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f16148a;

        RunnableC0215b() {
            this.f16148a = b.this.f16143g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16148a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f16144h = null;
        this.f16145i = map;
        this.f16146j = str2;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.unity3d.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0215b(), Math.max(4000 - (this.f16144h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f16144h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f16143g = null;
    }

    @Override // com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(com.iab.omid.library.unity3d.internal.f.b().a());
        this.f16143g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16143g.getSettings().setAllowContentAccess(false);
        this.f16143g.getSettings().setAllowFileAccess(false);
        this.f16143g.setWebViewClient(new a());
        a(this.f16143g);
        g.a().c(this.f16143g, this.f16146j);
        for (String str : this.f16145i.keySet()) {
            g.a().c(this.f16143g, this.f16145i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f16144h = Long.valueOf(f.b());
    }
}
