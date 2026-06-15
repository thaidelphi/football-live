package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.vh;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ah implements vh {

    /* renamed from: g  reason: collision with root package name */
    private static final String f16349g = "loadWithUrl | webView is not null";

    /* renamed from: h  reason: collision with root package name */
    private static final String f16350h = "ah";

    /* renamed from: i  reason: collision with root package name */
    private static final String f16351i = "file://";

    /* renamed from: a  reason: collision with root package name */
    private final String f16352a;

    /* renamed from: b  reason: collision with root package name */
    private String f16353b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f16354c;

    /* renamed from: d  reason: collision with root package name */
    private yg f16355d;

    /* renamed from: e  reason: collision with root package name */
    private tg f16356e;

    /* renamed from: f  reason: collision with root package name */
    private Context f16357f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f16359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f16360c;

        a(String str, JSONObject jSONObject, String str2) {
            this.f16358a = str;
            this.f16359b = jSONObject;
            this.f16360c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ah.this.f16354c != null) {
                lh.a(er.f17309q, new gh().a(cc.A, ah.f16349g).a());
            }
            try {
                ah.this.b(this.f16358a);
                ah.this.f16354c.loadUrl(ah.this.a(this.f16359b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", ah.this.f16352a);
                ah.this.f16355d.a(this.f16360c, jSONObject);
            } catch (Exception e8) {
                o9.d().a(e8);
                ah.this.b(this.f16358a, e8.getMessage());
                lh.a(er.f17309q, new gh().a(cc.A, e8.getMessage()).a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16363b;

        b(String str, String str2) {
            this.f16362a = str;
            this.f16363b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ah.this.f16354c != null) {
                    ah.this.f16354c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", ah.this.f16352a);
                if (ah.this.f16355d != null) {
                    ah.this.f16355d.a(this.f16362a, jSONObject);
                    ah.this.f16355d.b();
                }
                ah.this.f16355d = null;
                ah.this.f16357f = null;
            } catch (Exception e8) {
                o9.d().a(e8);
                String str = ah.f16350h;
                Log.e(str, "performCleanup | could not destroy ISNAdView webView ID: " + ah.this.f16352a);
                lh.a(er.f17310r, new gh().a(cc.A, e8.getMessage()).a());
                ah.this.b(this.f16363b, e8.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c implements vh.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16365a;

        c(String str) {
            this.f16365a = str;
        }

        @Override // com.ironsource.vh.a
        public void a(String str) {
            String str2 = ah.f16350h;
            Logger.i(str2, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            ah.this.b(this.f16365a, str);
        }

        @Override // com.ironsource.vh.a
        public void b(String str) {
            String str2 = ah.f16350h;
            Logger.i(str2, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) ah.this.f16354c.getParent()).removeView(ah.this.f16354c);
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
            ah.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d extends WebChromeClient {
        private d() {
        }

        /* synthetic */ d(ah ahVar, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(new d());
            webView2.setWebViewClient(new e(ah.this, null));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class e extends WebViewClient {
        private e() {
        }

        /* synthetic */ e(ah ahVar, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = ah.f16350h;
            Logger.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent a10 = new OpenUrlActivity.e(new k.b()).a(str).b(false).a(context);
            a10.addFlags(268435456);
            context.startActivity(a10);
            return true;
        }
    }

    public ah(wg wgVar, Context context, String str, tg tgVar) {
        this.f16357f = context;
        yg ygVar = new yg();
        this.f16355d = ygVar;
        ygVar.g(str);
        this.f16352a = str;
        this.f16355d.a(wgVar);
        this.f16356e = tgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (c(str)) {
            return f16351i + this.f16353b + d(str);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(f16350h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f16357f);
        this.f16354c = webView;
        webView.addJavascriptInterface(new xg(this), ug.f20990e);
        this.f16354c.setWebViewClient(new zg(new c(str)));
        this.f16354c.setWebChromeClient(new d(this, null));
        kw.a(this.f16354c);
        this.f16355d.a(this.f16354c);
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    private String d(String str) {
        String substring = str.substring(str.indexOf("/") + 1);
        return substring.substring(substring.indexOf("/"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        a("", "");
    }

    @Override // com.ironsource.vh
    public synchronized void a(String str, String str2) {
        if (this.f16357f == null) {
            return;
        }
        Logger.i(f16350h, "performCleanup");
        hg.f17676a.d(new b(str, str2));
    }

    @Override // com.ironsource.vh
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, b9.c.D);
            return;
        }
        String str4 = f16350h;
        Logger.i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(b9.h.f16677t0)) {
                this.f16354c.onPause();
            } else if (!str.equals(b9.h.f16679u0)) {
                b(str3, b9.c.C);
                return;
            } else {
                this.f16354c.onResume();
            }
            this.f16355d.f(str2);
        } catch (Exception e8) {
            o9.d().a(e8);
            b(str3, b9.c.E);
        }
    }

    @Override // com.ironsource.vh
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f16355d.e(str);
        } catch (Exception e8) {
            o9.d().a(e8);
            String str3 = f16350h;
            Logger.i(str3, "sendHandleGetViewVisibility fail with reason: " + e8.getMessage());
        }
    }

    public String b() {
        return this.f16352a;
    }

    public void b(String str, String str2) {
        yg ygVar = this.f16355d;
        if (ygVar != null) {
            ygVar.a(str, str2);
        }
    }

    @Override // com.ironsource.vh
    public void b(JSONObject jSONObject, String str, String str2) {
        hg.f17676a.d(new a(str2, jSONObject, str));
    }

    public yg c() {
        return this.f16355d;
    }

    @Override // com.ironsource.vh
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f16355d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e8) {
            o9.d().a(e8);
            String str3 = f16350h;
            Logger.i(str3, "sendMessageToAd fail message: " + e8.getMessage());
            throw e8;
        }
    }

    public tg d() {
        return this.f16356e;
    }

    public void e(String str) {
        this.f16353b = str;
    }

    @Override // com.ironsource.vh
    public WebView getPresentingView() {
        return this.f16354c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f16355d.c(str);
    }
}
