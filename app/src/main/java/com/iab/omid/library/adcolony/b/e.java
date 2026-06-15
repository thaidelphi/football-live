package com.iab.omid.library.adcolony.b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.ironsource.b9;
import com.ironsource.xn;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static e f15597a = new e();

    private e() {
    }

    public static final e a() {
        return f15597a;
    }

    public void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public void a(WebView webView, float f10) {
        a(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public void a(WebView webView, ErrorType errorType, String str) {
        a(webView, xn.a.f21422g, errorType.toString(), str);
    }

    public void a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.adcolony.d.c.a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        a(sb, objArr);
        sb.append(")}");
        a(webView, sb);
    }

    void a(final WebView webView, StringBuilder sb) {
        final String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new Runnable() { // from class: com.iab.omid.library.adcolony.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    webView.loadUrl(sb2);
                }
            });
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, b9.a.f16535f, jSONObject);
    }

    void a(StringBuilder sb, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append('\"');
            } else {
                if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append('\"');
                        sb.append(obj2);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append('\"');
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    public boolean a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    public void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public void b(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public void b(WebView webView, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }

    public void c(WebView webView) {
        a(webView, "publishLoadedEvent", new Object[0]);
    }

    public void c(WebView webView, String str) {
        a(webView, "setState", str);
    }
}
