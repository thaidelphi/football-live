package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.b9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class o9 {

    /* renamed from: k  reason: collision with root package name */
    private static final String f19528k = "1.0.6";

    /* renamed from: l  reason: collision with root package name */
    public static String f19529l = "";

    /* renamed from: a  reason: collision with root package name */
    private final nf f19530a;

    /* renamed from: b  reason: collision with root package name */
    private String f19531b;

    /* renamed from: c  reason: collision with root package name */
    private String f19532c;

    /* renamed from: d  reason: collision with root package name */
    private String f19533d;

    /* renamed from: e  reason: collision with root package name */
    private String f19534e;

    /* renamed from: f  reason: collision with root package name */
    private ContextProvider f19535f;

    /* renamed from: g  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f19536g;

    /* renamed from: h  reason: collision with root package name */
    public String f19537h;

    /* renamed from: i  reason: collision with root package name */
    private String f19538i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19539j;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements com.ironsource.b {
        a() {
        }

        @Override // com.ironsource.b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" ");
                    sb.append("(");
                    sb.append(thread.getState().toString());
                    sb.append(")");
                    sb.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            o9.f19529l = sb.toString();
        }

        @Override // com.ironsource.b
        public void b() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f19541a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19542b;

        b(Context context, String str) {
            this.f19541a = context;
            this.f19542b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String p10 = o9.this.f19530a.p(this.f19541a);
                if (!TextUtils.isEmpty(p10)) {
                    o9.this.f19532c = p10;
                }
                String a10 = o9.this.f19530a.a(this.f19541a);
                if (!TextUtils.isEmpty(a10)) {
                    o9.this.f19534e = a10;
                }
                SharedPreferences.Editor edit = this.f19541a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", o9.this.f19532c);
                edit.putString("sId", this.f19542b);
                edit.apply();
            } catch (Exception e8) {
                IronLog.INTERNAL.error(e8.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends p9 {
        c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        static volatile o9 f19545a = new o9(null);

        private d() {
        }
    }

    private o9() {
        this.f19539j = false;
        this.f19530a = mm.S().f();
        this.f19535f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f19536g = defaultUncaughtExceptionHandler;
        this.f19538i = " ";
        this.f19537h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new m9(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ o9(a aVar) {
        this();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return x8.f21379b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return x8.f21384g;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return x8.f21379b;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return x8.f21384g;
                    }
                }
            }
            return "none";
        } catch (Exception e8) {
            IronLog.INTERNAL.error(e8.toString());
            return "none";
        }
    }

    private void a(Context context, HashSet<String> hashSet) {
        String a10 = a(a());
        if (a10.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f19532c);
        String string2 = sharedPreferences.getString("sId", this.f19533d);
        List<lc> b10 = fa.b();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("reportList size " + b10.size());
        for (lc lcVar : b10) {
            JSONObject jSONObject = new JSONObject();
            String b11 = lcVar.b();
            String e8 = lcVar.e();
            String d10 = lcVar.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo z10 = this.f19530a.z(context);
                if (z10 != null) {
                    jSONObject2.put("availRam", this.f19530a.c(z10));
                    jSONObject2.put(fe.f17464x, this.f19530a.b(z10));
                    jSONObject2.put(fe.f17466y, this.f19530a.a(z10));
                }
                String i10 = this.f19530a.i();
                if (i10 != null) {
                    jSONObject2.put(fe.f17468z, i10);
                }
                jSONObject2.put("crashDate", b11);
                jSONObject2.put("stacktraceCrash", e8);
                jSONObject2.put("crashType", d10);
                jSONObject2.put("CrashReporterVersion", f19528k);
                jSONObject2.put(b9.i.f16722q, "8.7.0");
                jSONObject2.put(b9.i.f16731x, this.f19530a.b(context));
                jSONObject2.put(b9.i.W, c4.b(context, packageName));
                jSONObject2.put(b9.i.f16716n, this.f19530a.p());
                jSONObject2.put("network", a10);
                jSONObject2.put(b9.i.f16720p, this.f19530a.l());
                jSONObject2.put(b9.i.f16712l, this.f19530a.e());
                jSONObject2.put("totalRam", this.f19530a.h(context));
                jSONObject2.put("deviceOS", this.f19530a.m());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put(b9.i.f16710k, this.f19530a.g());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f19534e)) {
                    jSONObject2.put(b9.i.M, Boolean.parseBoolean(this.f19534e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (Exception e10) {
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        fa.a();
    }

    static List<lc> c() {
        return null;
    }

    public static o9 d() {
        return d.f19545a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context a() {
        return this.f19535f.getApplicationContext();
    }

    public void a(Throwable th) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isInitialized=" + this.f19539j);
        if (!this.f19539j || th == null) {
            return;
        }
        String b10 = new n9(th).b();
        new lc(b10, "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) {
        Context applicationContext = this.f19535f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f19538i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f19537h = str;
            }
            this.f19533d = str3;
            if (z10) {
                new com.ironsource.a(i10).a(z11).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f19539j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return f19528k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.f19538i;
    }
}
