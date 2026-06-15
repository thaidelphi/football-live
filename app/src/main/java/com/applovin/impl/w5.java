package com.applovin.impl;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.n3;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w5 extends z4 implements n3.a {

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f9515g;

    /* renamed from: h  reason: collision with root package name */
    private AppLovinAdLoadListener f9516h;

    /* renamed from: i  reason: collision with root package name */
    private com.applovin.impl.adview.b f9517i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends com.applovin.impl.adview.c {
        @Override // com.applovin.impl.adview.c
        protected boolean a(WebView webView, String str) {
            com.applovin.impl.sdk.n nVar = w5.this.f9829c;
            if (com.applovin.impl.sdk.n.a()) {
                w5 w5Var = w5.this;
                com.applovin.impl.sdk.n nVar2 = w5Var.f9829c;
                String str2 = w5Var.f9828b;
                nVar2.d(str2, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.b)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (a(scheme, o4.L1)) {
                if (a(host, o4.M1)) {
                    com.applovin.impl.sdk.n nVar3 = w5.this.f9829c;
                    if (com.applovin.impl.sdk.n.a()) {
                        w5 w5Var2 = w5.this;
                        w5Var2.f9829c.a(w5Var2.f9828b, "Ad load succeeded");
                    }
                    if (w5.this.f9516h != null) {
                        w5.this.f9516h.adReceived(w5.this.f9515g);
                        w5.this.f9516h = null;
                        return true;
                    }
                    return true;
                } else if (a(host, o4.N1)) {
                    com.applovin.impl.sdk.n nVar4 = w5.this.f9829c;
                    if (com.applovin.impl.sdk.n.a()) {
                        w5 w5Var3 = w5.this;
                        w5Var3.f9829c.a(w5Var3.f9828b, "Ad load failed");
                    }
                    if (w5.this.f9516h != null) {
                        w5.this.f9516h.failedToReceiveAd(204);
                        w5.this.f9516h = null;
                        return true;
                    }
                    return true;
                } else {
                    com.applovin.impl.sdk.n nVar5 = w5.this.f9829c;
                    if (com.applovin.impl.sdk.n.a()) {
                        w5 w5Var4 = w5.this;
                        w5Var4.f9829c.b(w5Var4.f9828b, "Unrecognized webview event");
                        return true;
                    }
                    return true;
                }
            }
            return true;
        }

        private b(com.applovin.impl.sdk.j jVar) {
            super(null, jVar);
        }

        private boolean a(String str, o4 o4Var) {
            for (String str2 : w5.this.f9827a.c(o4Var)) {
                if (str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public w5(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessJavaScriptTagAd", jVar);
        this.f9515g = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, jVar);
        this.f9516h = appLovinAdLoadListener;
        jVar.R().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(new b(this.f9827a), this.f9827a, a());
            this.f9517i = bVar;
            bVar.loadDataWithBaseURL(this.f9515g.h(), this.f9515g.e1(), "text/html", null, "");
        } catch (Throwable th) {
            this.f9827a.R().b(this);
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.a(this.f9828b, "Failed to initialize WebView", th);
            }
            AppLovinAdLoadListener appLovinAdLoadListener = this.f9516h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(-1);
                this.f9516h = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9829c;
            String str = this.f9828b;
            nVar.a(str, "Rendering AppLovin ad #" + this.f9515g.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.kf
            @Override // java.lang.Runnable
            public final void run() {
                w5.this.e();
            }
        });
    }

    @Override // com.applovin.impl.n3.a
    public void a(u2 u2Var) {
        if (u2Var.S().equalsIgnoreCase(this.f9515g.I())) {
            this.f9827a.R().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f9516h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f9515g);
                this.f9516h = null;
            }
        }
    }
}
