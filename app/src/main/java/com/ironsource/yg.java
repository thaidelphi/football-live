package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class yg {

    /* renamed from: a  reason: collision with root package name */
    private wg f21535a;

    /* renamed from: c  reason: collision with root package name */
    private WebView f21537c;

    /* renamed from: d  reason: collision with root package name */
    private String f21538d;

    /* renamed from: e  reason: collision with root package name */
    private String f21539e = yg.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    private String[] f21540f = {"handleGetViewVisibility"};

    /* renamed from: g  reason: collision with root package name */
    private final String[] f21541g = {ug.f20993h, ug.f20994i, ug.f20992g, "handleGetViewVisibility", ug.f20995j};

    /* renamed from: b  reason: collision with root package name */
    private pv f21536b = new pv();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21543b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f21544c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ JSONObject f21545d;

        a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f21542a = str;
            this.f21543b = str2;
            this.f21544c = str3;
            this.f21545d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!yg.this.b(this.f21542a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f21542a;
                    Log.e(yg.this.f21539e, str);
                    yg.this.a(this.f21543b, str);
                } else if (this.f21542a.equalsIgnoreCase("handleGetViewVisibility")) {
                    yg.this.e(this.f21544c);
                } else if (this.f21542a.equalsIgnoreCase(ug.f20995j) || this.f21542a.equalsIgnoreCase(ug.f20994i)) {
                    yg.this.a(this.f21545d.getString("params"), this.f21544c, this.f21543b);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f21542a;
                Log.e(yg.this.f21539e, str2);
                yg.this.a(this.f21543b, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21548b;

        b(String str, String str2) {
            this.f21547a = str;
            this.f21548b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                yg.this.f21537c.evaluateJavascript(this.f21547a, null);
            } catch (Throwable th) {
                o9.d().a(th);
                String str = yg.this.f21539e;
                Log.e(str, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f21548b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private String a(String str) {
        return String.format(ug.f21006u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ug.f21009x, jSONObject.getString(ug.f21009x));
            jSONObject2.put("data", this.f21536b.a());
        } catch (Exception e8) {
            o9.d().a(e8);
            String str = this.f21539e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.f21541g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void d() {
        if (this.f21535a == null || this.f21536b == null) {
            return;
        }
        a(ug.f20986a, a());
    }

    private void d(String str) {
        hg.f17676a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    private boolean h(String str) {
        for (String str2 : this.f21540f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(Build.VERSION.SDK_INT <= 22 ? ug.f20997l : ug.f20996k);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ug.f21004s, this.f21536b.a());
            jSONObject.put(ug.f21001p, jSONObject2);
            jSONObject.put("adViewId", c());
            return jSONObject;
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return new JSONObject();
        }
    }

    public void a(WebView webView) {
        this.f21537c = webView;
    }

    public void a(wg wgVar) {
        this.f21535a = wgVar;
    }

    public void a(String str, int i10, boolean z10) {
        this.f21536b.a(str, i10, z10);
        if (i(str)) {
            d();
        }
    }

    public void a(String str, String str2) {
        wg wgVar = this.f21535a;
        if (wgVar != null) {
            wgVar.a(str, str2, this.f21538d);
        }
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.f21537c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f21539e, str4);
            this.f21535a.a(str3, str4, this.f21538d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e8) {
            o9.d().a(e8);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f21538d);
        a(str2, jSONObject);
    }

    public void a(String str, JSONObject jSONObject) {
        wg wgVar = this.f21535a;
        if (wgVar != null) {
            wgVar.a(str, jSONObject);
        }
    }

    void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f21535a == null) {
            lh.a(er.f17312t, new gh().a(cc.f16883y, "mDelegate is null").a());
        } else {
            hg.f17676a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void b() {
        this.f21535a = null;
        this.f21536b = null;
    }

    public String c() {
        return this.f21538d;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !h(optString)) {
                a(jSONObject.optString(ug.f21007v, ug.f20988c), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e8) {
            o9.d().a(e8);
            String str2 = this.f21539e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void e() {
        if (this.f21535a == null || this.f21536b == null) {
            return;
        }
        a(ug.f20987b, a());
    }

    public void e(String str) throws JSONException {
        JSONObject a10 = this.f21536b.a();
        a10.put("adViewId", this.f21538d);
        a(str, a10);
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f21538d);
            a(str, jSONObject);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public void g(String str) {
        this.f21538d = str;
    }
}
