package com.startapp.sdk.adsbase;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.startapp.c0;
import com.startapp.c8;
import com.startapp.d0;
import com.startapp.e0;
import com.startapp.f0;
import com.startapp.f2;
import com.startapp.g2;
import com.startapp.h5;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.n7;
import com.startapp.n8;
import com.startapp.o8;
import com.startapp.o9;
import com.startapp.p8;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import com.startapp.startappsdk.R;
import com.startapp.w;
import com.startapp.y;
import com.startapp.z;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class StartAppSDKInternal implements e0 {
    public static final Object C = new Object();
    public static volatile InitState D = InitState.UNSET;
    public boolean A;
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public SDKAdPreferences f22909a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22910b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f22911c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22912d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22913e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22914f;

    /* renamed from: g  reason: collision with root package name */
    public long f22915g;

    /* renamed from: h  reason: collision with root package name */
    public Application f22916h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<Integer, Integer> f22917i;

    /* renamed from: j  reason: collision with root package name */
    public p8 f22918j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f22919k;

    /* renamed from: l  reason: collision with root package name */
    public Activity f22920l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f22921m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f22922n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f22923o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22924p;

    /* renamed from: q  reason: collision with root package name */
    public TreeMap f22925q;

    /* renamed from: r  reason: collision with root package name */
    public Bundle f22926r;

    /* renamed from: s  reason: collision with root package name */
    public AdPreferences f22927s;

    /* renamed from: t  reason: collision with root package name */
    public CacheKey f22928t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f22929u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f22930v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f22931w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f22932x;

    /* renamed from: y  reason: collision with root package name */
    public d f22933y;

    /* renamed from: z  reason: collision with root package name */
    public d0 f22934z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum InitState {
        UNSET,
        IMPLICIT,
        EXPLICIT
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22942a;

        public b(Context context) {
            this.f22942a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                StartAppSDKInternal.a(StartAppSDKInternal.this, this.f22942a);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a  reason: collision with root package name */
        public static final StartAppSDKInternal f22944a = new StartAppSDKInternal();
    }

    public StartAppSDKInternal() {
        WeakHashMap weakHashMap = o9.f22359a;
        this.f22910b = true;
        this.f22911c = y.b();
        this.f22912d = false;
        this.f22913e = false;
        this.f22914f = false;
        this.f22917i = new HashMap<>();
        this.f22919k = new AtomicBoolean();
        this.f22921m = false;
        this.f22922n = true;
        this.f22923o = false;
        this.f22924p = false;
        this.f22926r = null;
    }

    public static void a(StartAppSDKInternal startAppSDKInternal, Context context) {
        startAppSDKInternal.getClass();
        ListView listView = new ListView(context);
        listView.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        listView.setAdapter((ListAdapter) new ArrayAdapter(context, R.layout.com_startapp_sdk_webview, 16908308, new Object[]{""}));
        listView.getViewTreeObserver().addOnGlobalLayoutListener(new o8(listView, context));
        Toast toast = new Toast(context);
        toast.setView(listView);
        toast.setDuration(0);
        toast.setGravity(85, 0, 0);
        toast.show();
    }

    public static boolean b() {
        boolean z10;
        synchronized (C) {
            z10 = D == InitState.EXPLICIT;
        }
        return z10;
    }

    public static boolean e(Context context) {
        e a10 = com.startapp.sdk.components.a.a(context).G.a();
        if (a10.contains("isma")) {
            return a10.getBoolean("isma", false) ? a10.contains("iscd") && !a10.getBoolean("iscd", false) : (a10.contains("iscd") && a10.getBoolean("iscd", false)) ? false : true;
        } else if (a10.contains("iscd")) {
            return !a10.getBoolean("iscd", false);
        } else {
            return true;
        }
    }

    public final void c(Context context) {
        Application application;
        if (Build.VERSION.SDK_INT >= 14) {
            Context a10 = f0.a(context);
            if (a10 instanceof Application) {
                application = (Application) a10;
            } else if (context instanceof Application) {
                application = (Application) context;
            } else if (context instanceof Activity) {
                application = ((Activity) context).getApplication();
            } else {
                application = context instanceof Service ? ((Service) context).getApplication() : null;
            }
            if (application == null || this.f22934z != null) {
                return;
            }
            d0 d0Var = new d0(this);
            this.f22934z = d0Var;
            application.registerActivityLifecycleCallbacks(d0Var);
            try {
                n7 n7Var = com.startapp.sdk.components.a.a(context).f23244t.a().f22242e;
                if (n7Var != null) {
                    application.registerActivityLifecycleCallbacks(n7Var);
                    return;
                }
                throw new RuntimeException();
            } catch (Throwable unused) {
            }
        }
    }

    public final void d(Context context) {
        MetaData.c(context);
        WeakHashMap weakHashMap = o9.f22359a;
        AdsCommonMetaData.a(context);
        BannerMetaData.a(context);
        SplashMetaData.a(context);
        if (this.f22910b) {
            CacheMetaData.a(context);
        }
        AdInformationMetaData.a(context);
        if (y.b() && (context instanceof Application)) {
            Application application = (Application) context;
            this.f22916h = application;
            if (this.f22919k.compareAndSet(false, true) && this.f22918j == null) {
                p8 p8Var = new p8();
                application.registerActivityLifecycleCallbacks(p8Var);
                this.f22918j = p8Var;
            }
        }
    }

    public final void f(Context context) {
        if (this.A) {
            return;
        }
        try {
            this.A = true;
            WvfMetadata T = MetaData.f23158k.T();
            if (T == null || !o9.a(T.d())) {
                return;
            }
            ComponentInfoEventConfig a10 = T.a();
            if (a10 != null && a10.a(1048576L)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "wvt.start";
                l3Var.a();
            }
            new Handler(Looper.getMainLooper()).post(new b(context));
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    public final void g(Context context) {
        com.startapp.sdk.components.a a10 = com.startapp.sdk.components.a.a(context);
        a10.E.a().edit().putBoolean("periodicInfoEventPaused", false).putBoolean("periodicMetadataPaused", false).apply();
        a aVar = new a(context, a10);
        if (MetaData.f23158k.f23161b) {
            aVar.a(null, false);
        } else {
            MetaData.f23158k.a(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
        if (r0.isEmpty() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.b(android.content.Context):void");
    }

    public static void a(StartAppSDKInternal startAppSDKInternal, Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        startAppSDKInternal.getClass();
        com.startapp.sdk.components.a.a(context).J.a();
        InitState initState = D;
        InitState initState2 = InitState.EXPLICIT;
        if (initState == initState2) {
            return;
        }
        boolean b10 = com.startapp.sdk.components.a.a(context).f23236l.a().b();
        if (TextUtils.isEmpty(str2)) {
            if (!o9.f(context) && !y.e(context)) {
                Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
            } else {
                throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
            }
        }
        z a10 = com.startapp.sdk.components.a.a(context).f23236l.a();
        if (str != null) {
            str = str.trim();
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        synchronized (a10.f23646a) {
            a10.f23648c = str;
            a10.f23649d = str2;
            a10.f23647b.edit().putString("c88d4eab540fab77", str).putString("2696a7f502faed4b", str2).commit();
        }
        startAppSDKInternal.f22909a = sDKAdPreferences;
        try {
            com.startapp.sdk.components.a.a(context).A.a().execute(new f2(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences));
        } catch (Throwable th) {
            if (g2.a(1)) {
                l3.a(th);
            }
        }
        startAppSDKInternal.a(z10);
        if (D == InitState.IMPLICIT && !b10) {
            c8.f21846d.a(context, MetaDataRequest.RequestReason.LAUNCH);
        } else if (D == InitState.UNSET) {
            startAppSDKInternal.a(context, MetaDataRequest.RequestReason.LAUNCH);
        }
        D = initState2;
    }

    public final boolean c() {
        return this.f22922n;
    }

    public static StartAppSDKInternal a() {
        return c.f22944a;
    }

    public static void a(Context context) {
        MetaDataRequest.RequestReason requestReason;
        com.startapp.sdk.components.a a10 = com.startapp.sdk.components.a.a(context);
        a10.J.a();
        c0 a11 = a10.N.a();
        ((com.startapp.sdk.components.f0) a11.f21806a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a11.f21809d = elapsedRealtime;
        a11.f21810e = elapsedRealtime;
        h5 h5Var = new h5(context);
        if (h5Var.f22030e != null || h5Var.f22031f != null) {
            e.a edit = a10.G.a().edit();
            Boolean bool = h5Var.f22030e;
            if (bool != null) {
                edit.putBoolean("isma", bool.booleanValue());
            }
            Boolean bool2 = h5Var.f22031f;
            if (bool2 != null) {
                edit.putBoolean("iscd", bool2.booleanValue());
            }
            edit.apply();
        }
        String str = h5Var.f22026a;
        if (!h5Var.f22028c) {
            StartAppAd.disableSplash();
        }
        StartAppAd.enableConsent(context, h5Var.f22029d);
        if (!TextUtils.isEmpty(str)) {
            StartAppSDKInternal startAppSDKInternal = c.f22944a;
            boolean z10 = h5Var.f22027b;
            startAppSDKInternal.getClass();
            Context a12 = f0.a(context);
            Context context2 = a12 != null ? a12 : context;
            try {
                com.startapp.sdk.components.a.a(context2).f23244t.a().a(256);
            } catch (Throwable unused) {
            }
            com.startapp.sdk.components.a.a(context2).f23248x.a().execute(new n8(startAppSDKInternal, context2, null, str, null, z10));
            if (a10.E.a().getBoolean("shared_prefs_first_init", true)) {
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = "ManifestInit";
                l3Var.a();
            }
        } else if (D == InitState.UNSET) {
            D = InitState.IMPLICIT;
            StartAppSDKInternal startAppSDKInternal2 = c.f22944a;
            if (a10.f23236l.a().b()) {
                requestReason = MetaDataRequest.RequestReason.LAUNCH;
            } else {
                requestReason = MetaDataRequest.RequestReason.IMPLICIT_LAUNCH;
            }
            startAppSDKInternal2.a(context, requestReason);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r4 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r6 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
        r2.f23217d.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
        r1.f23225a.a().b();
        c(r10);
        com.startapp.sdk.adsbase.SimpleTokenUtils.a(r10);
        r1.P.a().b();
        r2 = r1.Q.a();
        r4 = r2.f23441c.call();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
        r6 = r4.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
        r2.f23439a.a().execute(new com.startapp.t5(r2, r6, r4.d()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
        r1.F.a();
        com.startapp.sdk.adsbase.remoteconfig.MetaData.f23158k.a(r1.f23233i.a());
        com.startapp.w1.a(r10);
        r1 = com.startapp.sdk.components.a.a(r10).E.a();
        r2 = r1.getInt("shared_prefs_app_version_id", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
        r5 = r10.getPackageManager().getPackageInfo(r10.getPackageName(), 0).versionCode;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r10, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r11) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.a(android.content.Context, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason):void");
    }

    public final void a(boolean z10) {
        if (z10 && y.b()) {
            this.f22929u = true;
            return;
        }
        this.f22929u = false;
        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
        synchronized (dVar.f23021a) {
            Iterator it = dVar.f23021a.entrySet().iterator();
            while (it.hasNext()) {
                if (((CacheKey) ((Map.Entry) it.next()).getKey()).a() == placement) {
                    it.remove();
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements com.startapp.sdk.adsbase.remoteconfig.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22939a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ com.startapp.sdk.components.a f22940b;

        public a(Context context, com.startapp.sdk.components.a aVar) {
            this.f22939a = context;
            this.f22940b = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:174:0x04b5  */
        /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
        @Override // com.startapp.sdk.adsbase.remoteconfig.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 1326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.StartAppSDKInternal.a.a(com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean):void");
        }

        @Override // com.startapp.sdk.adsbase.remoteconfig.c
        public final void a() {
            int i10;
            Resources resources;
            int identifier;
            w a10 = this.f22940b.f23239o.a();
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(a10.f23489b.incrementAndGet());
            Context context = a10.f23488a;
            try {
                resources = context.getResources();
                identifier = resources.getIdentifier("com_startapp_sdk_aar", "integer", context.getPackageName());
            } catch (Throwable unused) {
            }
            if (identifier != 0) {
                i10 = resources.getInteger(identifier);
                objArr[1] = Integer.valueOf(i10);
                objArr[2] = 0;
                String format = String.format(locale, "cnt=%d,aar=%d,mds=%d", objArr);
                l3 l3Var = new l3(m3.f22274d);
                l3Var.f22228d = MobileAdsBridgeBase.initializeMethodName;
                l3Var.f22229e = format;
                l3Var.a();
            }
            i10 = 0;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = 0;
            String format2 = String.format(locale, "cnt=%d,aar=%d,mds=%d", objArr);
            l3 l3Var2 = new l3(m3.f22274d);
            l3Var2.f22228d = MobileAdsBridgeBase.initializeMethodName;
            l3Var2.f22229e = format2;
            l3Var2.a();
        }
    }
}
