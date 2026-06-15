package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y5 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23581a;

    /* renamed from: b  reason: collision with root package name */
    public final t4<com.startapp.sdk.adsbase.e> f23582b;

    /* renamed from: c  reason: collision with root package name */
    public final t4<Executor> f23583c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f23584d;

    /* renamed from: e  reason: collision with root package name */
    public String f23585e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23586f;

    /* renamed from: i  reason: collision with root package name */
    public final long f23589i;

    /* renamed from: j  reason: collision with root package name */
    public final long f23590j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f23591k;

    /* renamed from: l  reason: collision with root package name */
    public final Boolean f23592l;

    /* renamed from: m  reason: collision with root package name */
    public final String f23593m;

    /* renamed from: n  reason: collision with root package name */
    public final Runnable f23594n;

    /* renamed from: r  reason: collision with root package name */
    public long f23598r;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23587g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23588h = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23595o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f23596p = false;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashMap<String, Float> f23597q = new LinkedHashMap<>();

    /* renamed from: s  reason: collision with root package name */
    public final a f23599s = new a();

    /* renamed from: t  reason: collision with root package name */
    public final b f23600t = new b();

    /* renamed from: u  reason: collision with root package name */
    public final c f23601u = new c();

    /* renamed from: v  reason: collision with root package name */
    public final d f23602v = new d();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y5.this.f23583c.a().execute(y5.this.f23600t);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y5 y5Var = y5.this;
            if (y5Var.f23587g) {
                return;
            }
            try {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "Failed smart redirect hop info: ".concat(y5Var.f23596p ? "Page Finished" : "Timeout");
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry<String, Float> entry : y5Var.f23597q.entrySet()) {
                    String key = entry.getKey();
                    Float value = entry.getValue();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        Float f10 = y5Var.f23597q.get(key);
                        if (f10 == null || f10.floatValue() < 0.0f) {
                            y5Var.f23597q.put(key, Float.valueOf(((float) (System.currentTimeMillis() - y5Var.f23598r)) / 1000.0f));
                        }
                        jSONObject.put("time", String.valueOf(value));
                        jSONObject.put("url", key);
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                l3Var.f22230f = jSONArray;
                l3Var.f22231g = y5Var.f23586f;
                l3Var.a();
            } catch (Throwable th) {
                l3.a(th);
            }
            try {
                y5Var.f23595o = true;
                com.startapp.sdk.adsbase.a.b(y5Var.f23581a);
                synchronized (y5Var.f23584d) {
                    y5Var.f23584d.removeCallbacks(y5Var.f23601u);
                }
                if (y5Var.f23591k && MetaData.f23158k.W()) {
                    com.startapp.sdk.adsbase.a.a(y5Var.f23581a, y5Var.f23585e, y5Var.f23586f);
                } else {
                    com.startapp.sdk.adsbase.a.a(y5Var.f23581a, y5Var.f23585e);
                }
                Runnable runnable = y5Var.f23594n;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th2) {
                l3.a(th2);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y5.this.f23583c.a().execute(y5.this.f23602v);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y5 y5Var = y5.this;
            if (y5Var.f23595o || y5Var.f23587g) {
                return;
            }
            try {
                y5Var.f23587g = true;
                com.startapp.sdk.adsbase.a.b(y5Var.f23581a);
                if (y5Var.f23591k && MetaData.f23158k.W()) {
                    com.startapp.sdk.adsbase.a.a(y5Var.f23581a, y5Var.f23585e, y5Var.f23586f);
                } else {
                    com.startapp.sdk.adsbase.a.a(y5Var.f23581a, y5Var.f23585e);
                }
                Runnable runnable = y5Var.f23594n;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j2<Executor> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4 f23607a;

        public e(t4 t4Var) {
            this.f23607a = t4Var;
        }

        @Override // com.startapp.j2
        public final Executor call() {
            return new a8((Executor) this.f23607a.a());
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23608a;

        public f(String str) {
            this.f23608a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y5 y5Var = y5.this;
            String str = this.f23608a;
            if (!y5Var.f23588h) {
                y5Var.f23598r = System.currentTimeMillis();
                y5Var.f23597q.put(str, Float.valueOf(-1.0f));
                y5Var.f23584d.postDelayed(y5Var.f23599s, y5Var.f23589i);
                y5Var.f23588h = true;
            }
            y5Var.f23596p = false;
            synchronized (y5Var.f23584d) {
                y5Var.f23584d.removeCallbacks(y5Var.f23601u);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23610a;

        public g(String str) {
            this.f23610a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y5 y5Var = y5.this;
            String str = this.f23610a;
            y5Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            y5Var.f23598r = currentTimeMillis;
            y5Var.f23597q.put(y5Var.f23585e, Float.valueOf(((float) (currentTimeMillis - y5Var.f23598r)) / 1000.0f));
            y5Var.f23597q.put(str, Float.valueOf(-1.0f));
            y5Var.f23585e = str;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23612a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f23613b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f23614c;

        public h(String str, boolean z10, String str2) {
            this.f23612a = str;
            this.f23613b = z10;
            this.f23614c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float f10;
            y5 y5Var = y5.this;
            String str = this.f23612a;
            boolean z10 = this.f23613b;
            String str2 = this.f23614c;
            y5Var.getClass();
            try {
                if (y5Var.f23595o) {
                    return;
                }
                boolean z11 = true;
                y5Var.f23587g = true;
                com.startapp.sdk.adsbase.a.b(y5Var.f23581a);
                synchronized (y5Var.f23584d) {
                    y5Var.f23584d.removeCallbacks(y5Var.f23601u);
                }
                Context context = y5Var.f23581a;
                if (z10) {
                    str = str2;
                }
                com.startapp.sdk.adsbase.a.a(context, str);
                String str3 = y5Var.f23593m;
                if (str3 != null && !str3.equals("") && !y5Var.f23585e.toLowerCase().contains(y5Var.f23593m.toLowerCase())) {
                    l3 l3Var = new l3(m3.f22275e);
                    l3Var.f22228d = "Wrong package reached";
                    l3Var.f22229e = "Expected: " + y5Var.f23593m + ", Link: " + y5Var.f23585e;
                    l3Var.f22231g = y5Var.f23586f;
                    l3Var.a();
                } else {
                    if (!MetaData.f23158k.analytics.k() || !y5Var.f23582b.a().getBoolean("firstSucceededSmartRedirect", true)) {
                        z11 = false;
                    }
                    Boolean bool = y5Var.f23592l;
                    if (bool == null) {
                        f10 = MetaData.f23158k.analytics.j();
                    } else {
                        f10 = bool.booleanValue() ? 100.0f : 0.0f;
                    }
                    if (z11 || Math.random() * 100.0d < f10) {
                        l3 l3Var2 = new l3(m3.f22283m);
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry<String, Float> entry : y5Var.f23597q.entrySet()) {
                            String key = entry.getKey();
                            Float value = entry.getValue();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                Float f11 = y5Var.f23597q.get(key);
                                if (f11 == null || f11.floatValue() < 0.0f) {
                                    y5Var.f23597q.put(key, Float.valueOf(((float) (System.currentTimeMillis() - y5Var.f23598r)) / 1000.0f));
                                }
                                jSONObject.put("time", String.valueOf(value));
                                jSONObject.put("url", key);
                                jSONArray.put(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        l3Var2.f22230f = jSONArray;
                        l3Var2.f22231g = y5Var.f23586f;
                        l3Var2.a();
                        y5Var.f23582b.a().edit().putBoolean("firstSucceededSmartRedirect", false).apply();
                    }
                }
                Runnable runnable = y5Var.f23594n;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23616a;

        public i(String str) {
            this.f23616a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y5 y5Var = y5.this;
            String str = this.f23616a;
            if (y5Var.f23587g || y5Var.f23595o || !y5Var.f23585e.equals(str) || com.startapp.sdk.adsbase.a.a(str)) {
                return;
            }
            if (str.startsWith("http://") || str.startsWith("https://")) {
                y5Var.f23596p = true;
                Float f10 = y5Var.f23597q.get(str);
                if (f10 == null || f10.floatValue() < 0.0f) {
                    y5Var.f23597q.put(str, Float.valueOf(((float) (System.currentTimeMillis() - y5Var.f23598r)) / 1000.0f));
                }
                synchronized (y5Var.f23584d) {
                    y5Var.f23584d.removeCallbacks(y5Var.f23601u);
                    y5Var.f23584d.postDelayed(y5Var.f23601u, y5Var.f23590j);
                }
            }
        }
    }

    public y5(Context context, t4<com.startapp.sdk.adsbase.e> t4Var, t4<Executor> t4Var2, Handler handler, long j10, long j11, boolean z10, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f23581a = context;
        this.f23582b = t4Var;
        this.f23583c = new t4<>(new e(t4Var2));
        this.f23584d = handler;
        this.f23589i = j10;
        this.f23590j = j11;
        this.f23591k = z10;
        this.f23592l = bool;
        this.f23585e = str;
        this.f23593m = str2;
        this.f23586f = str3;
        this.f23594n = runnable;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f23583c.a().execute(new i(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f23583c.a().execute(new f(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        synchronized (this.f23584d) {
            this.f23584d.removeCallbacks(this.f23601u);
        }
        if (str2 != null && !com.startapp.sdk.adsbase.a.a(str2) && com.startapp.sdk.adsbase.a.b(str2)) {
            l3 l3Var = new l3(m3.f22275e);
            l3Var.f22228d = "Failed smart redirect: " + i10;
            l3Var.f22229e = str2;
            l3Var.f22231g = this.f23586f;
            l3Var.a();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            this.f23583c.a().execute(new g(str));
            if (o9.c(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean a10 = com.startapp.sdk.adsbase.a.a(lowerCase);
            boolean startsWith = lowerCase.startsWith("intent://");
            if (!a10 && !startsWith) {
                return false;
            }
            this.f23583c.a().execute(new h(str, startsWith, webView.getUrl()));
        }
        return true;
    }
}
