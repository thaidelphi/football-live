package com.iab.omid.library.startio.publisher;

import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.AdEvents;
import com.iab.omid.library.startio.adsession.AdSessionConfiguration;
import com.iab.omid.library.startio.adsession.AdSessionContext;
import com.iab.omid.library.startio.adsession.ErrorType;
import com.iab.omid.library.startio.adsession.VerificationScriptResource;
import com.iab.omid.library.startio.adsession.media.MediaEvents;
import com.iab.omid.library.startio.internal.g;
import com.iab.omid.library.startio.utils.c;
import com.iab.omid.library.startio.utils.f;
import com.ironsource.da;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private com.iab.omid.library.startio.weakreference.b f16005a;

    /* renamed from: b  reason: collision with root package name */
    private AdEvents f16006b;

    /* renamed from: c  reason: collision with root package name */
    private MediaEvents f16007c;

    /* renamed from: d  reason: collision with root package name */
    private a f16008d;

    /* renamed from: e  reason: collision with root package name */
    private long f16009e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        a();
        this.f16005a = new com.iab.omid.library.startio.weakreference.b(null);
    }

    public void a() {
        this.f16009e = f.b();
        this.f16008d = a.AD_STATE_IDLE;
    }

    public void a(float f10) {
        g.a().a(getWebView(), f10);
    }

    public void a(WebView webView) {
        this.f16005a = new com.iab.omid.library.startio.weakreference.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f16006b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        g.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        g.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.startio.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.startio.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.startio.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.7-Startio");
        c.a(jSONObject4, "appId", com.iab.omid.library.startio.internal.f.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        g.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f16007c = mediaEvents;
    }

    public void a(String str) {
        g.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f16009e) {
            a aVar = this.f16008d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f16008d = aVar2;
                g.a().a(getWebView(), str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        g.a().a(getWebView(), str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, da.a.f16995d, Long.valueOf(date.getTime()));
        g.a().c(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        g.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            g.a().b(getWebView(), z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.f16005a.clear();
    }

    public void b(String str, long j10) {
        if (j10 >= this.f16009e) {
            this.f16008d = a.AD_STATE_VISIBLE;
            g.a().a(getWebView(), str);
        }
    }

    public AdEvents c() {
        return this.f16006b;
    }

    public MediaEvents d() {
        return this.f16007c;
    }

    public boolean e() {
        return this.f16005a.get() != null;
    }

    public void f() {
        g.a().a(getWebView());
    }

    public void g() {
        g.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.f16005a.get();
    }

    public void h() {
        g.a().c(getWebView());
    }

    public void i() {
    }
}
