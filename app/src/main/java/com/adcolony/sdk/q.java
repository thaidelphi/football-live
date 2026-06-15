package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.adcolony.sdk.e0;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.dp;
import com.ironsource.fe;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ObsoleteSdkInt"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q {

    /* renamed from: d  reason: collision with root package name */
    private boolean f6201d;

    /* renamed from: a  reason: collision with root package name */
    private final f f6198a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final f f6199b = new f();

    /* renamed from: c  reason: collision with root package name */
    private String f6200c = "";

    /* renamed from: e  reason: collision with root package name */
    private String f6202e = "";

    /* renamed from: f  reason: collision with root package name */
    private f1 f6203f = c0.b();

    /* renamed from: g  reason: collision with root package name */
    private String f6204g = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {

        /* renamed from: com.adcolony.sdk.q$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class RunnableC0116a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6205a;

            /* renamed from: com.adcolony.sdk.q$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            class RunnableC0117a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f1 f6206a;

                RunnableC0117a(f1 f1Var) {
                    this.f6206a = f1Var;
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC0116a.this.f6205a.a(this.f6206a).c();
                }
            }

            RunnableC0116a(a aVar, h0 h0Var) {
                this.f6205a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                z0.b(new RunnableC0117a(com.adcolony.sdk.a.b().n().c(2000L)));
            }
        }

        a(q qVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (z0.a(new RunnableC0116a(this, h0Var))) {
                return;
            }
            new e0.a().a("Error retrieving device info, disabling AdColony.").a(e0.f5981i);
            AdColony.disable();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Callable<f1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f6208a;

        b(long j10) {
            this.f6208a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public f1 call() {
            if (!q.this.N() && this.f6208a > 0) {
                q.this.f6198a.a(this.f6208a);
            }
            return q.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f6210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f6211b;

        c(Context context, y yVar) {
            this.f6210a = context;
            this.f6211b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            boolean z10;
            if (com.adcolony.sdk.a.f5752e) {
                str = "00000000-0000-0000-0000-000000000000";
                z10 = true;
            } else {
                str = null;
                z10 = false;
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f6210a);
                    str = advertisingIdInfo.getId();
                    z10 = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (Exception e8) {
                    new e0.a().a("Query Advertising ID failed with: ").a(Log.getStackTraceString(e8)).a(e0.f5979g);
                } catch (NoClassDefFoundError unused) {
                    new e0.a().a("Google Play Services Ads dependencies are missing.").a(e0.f5978f);
                } catch (NoSuchMethodError unused2) {
                    new e0.a().a("Google Play Services is out of date, please update to GPS 4.0+.").a(e0.f5978f);
                }
                if (str == null && Build.MANUFACTURER.equals("Amazon")) {
                    str = q.this.g();
                    z10 = q.this.h();
                }
            }
            if (str == null) {
                new e0.a().a("Advertising ID is not available. ").a("Collecting Android ID instead of Advertising ID.").a(e0.f5978f);
                y yVar = this.f6211b;
                if (yVar != null) {
                    yVar.a(new Throwable("Advertising ID is not available."));
                }
            } else {
                q.this.a(str);
                s0 a10 = com.adcolony.sdk.a.b().q().a();
                if (a10 != null) {
                    a10.f6253d.put("advertisingId", q.this.f());
                }
                q.this.c(z10);
                y yVar2 = this.f6211b;
                if (yVar2 != null) {
                    yVar2.a((y) q.this.f());
                }
            }
            q.this.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Callable<f1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f6213a;

        d(long j10) {
            this.f6213a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b */
        public f1 call() {
            if (!q.this.O() && this.f6213a > 0) {
                q.this.f6199b.a(this.f6213a);
            }
            return q.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f6215a;

        e(y yVar) {
            this.f6215a = yVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(Task<AppSetIdInfo> task) {
            Throwable th;
            if (task.isSuccessful()) {
                q.this.b(task.getResult().getId());
                y yVar = this.f6215a;
                if (yVar != null) {
                    yVar.a((y) q.this.k());
                }
            } else {
                if (task.getException() != null) {
                    th = task.getException();
                } else {
                    th = new Throwable("Task failed with unknown exception.");
                }
                new e0.a().a("App Set ID is not available. Unexpected exception occurred: ").a(Log.getStackTraceString(th)).a(e0.f5979g);
                y yVar2 = this.f6215a;
                if (yVar2 != null) {
                    yVar2.a(th);
                }
            }
            q.this.b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f6201d;
    }

    String B() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String C() {
        return Build.MANUFACTURER;
    }

    int D() {
        ActivityManager activityManager;
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null || (activityManager = (ActivityManager) a10.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    long E() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / 1048576;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String F() {
        return Build.MODEL;
    }

    @SuppressLint({"SwitchIntDef"})
    int G() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return 2;
        }
        int i10 = a10.getResources().getConfiguration().orientation;
        if (i10 != 1) {
            return i10 != 2 ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String H() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String I() {
        return "4.8.0";
    }

    String J() {
        TelephonyManager telephonyManager;
        Context a10 = com.adcolony.sdk.a.a();
        return (a10 == null || (telephonyManager = (TelephonyManager) a10.getSystemService("phone")) == null) ? "" : telephonyManager.getSimCountryIso();
    }

    int K() {
        return TimeZone.getDefault().getOffset(15L) / 60000;
    }

    String L() {
        return TimeZone.getDefault().getID();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M() {
        a(false);
        b(false);
        com.adcolony.sdk.a.a("Device.get_info", new a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        return this.f6198a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O() {
        return this.f6199b.a();
    }

    boolean P() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return false;
        }
        DisplayMetrics displayMetrics = a10.getResources().getDisplayMetrics();
        float f10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        float f11 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((double) ((f10 * f10) + (f11 * f11))) >= 6.0d;
    }

    void c(boolean z10) {
        this.f6201d = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 d() {
        f1 b10 = c0.b();
        k b11 = com.adcolony.sdk.a.b();
        c0.a(b10, "carrier_name", m());
        c0.a(b10, "data_path", b11.z().b());
        c0.b(b10, "device_api", j());
        Rect w10 = w();
        c0.b(b10, "screen_width", w10.width());
        c0.b(b10, "screen_height", w10.height());
        c0.b(b10, "display_dpi", v());
        c0.a(b10, "device_type", u());
        c0.a(b10, "locale_language_code", y());
        c0.a(b10, "ln", y());
        c0.a(b10, "locale_country_code", p());
        c0.a(b10, "locale", p());
        c0.a(b10, "mac_address", B());
        c0.a(b10, "manufacturer", C());
        c0.a(b10, "device_brand", C());
        c0.a(b10, "media_path", b11.z().c());
        c0.a(b10, "temp_storage_path", b11.z().d());
        c0.b(b10, "memory_class", D());
        c0.b(b10, "memory_used_mb", E());
        c0.a(b10, fe.B, F());
        c0.a(b10, "device_model", F());
        c0.a(b10, "sdk_type", "android_native");
        c0.a(b10, "sdk_version", I());
        c0.a(b10, "network_type", b11.s().e());
        c0.a(b10, "os_version", H());
        c0.a(b10, "os_name", "android");
        c0.a(b10, fe.G, "android");
        c0.a(b10, "arch", a());
        c0.a(b10, "user_id", c0.h(b11.u().b(), "user_id"));
        c0.a(b10, "app_id", b11.u().a());
        c0.a(b10, "app_bundle_name", z0.b());
        c0.a(b10, "app_bundle_version", z0.c());
        c0.a(b10, "battery_level", l());
        c0.a(b10, "cell_service_country_code", J());
        c0.a(b10, "timezone_ietf", L());
        c0.b(b10, "timezone_gmt_m", K());
        c0.b(b10, "timezone_dst_m", q());
        c0.a(b10, "launch_metadata", z());
        c0.a(b10, "controller_version", b11.f());
        c0.b(b10, "current_orientation", G());
        c0.b(b10, "cleartext_permitted", n());
        c0.a(b10, "density", s());
        c0.b(b10, "dark_mode", r());
        c0.a(b10, "adc_alt_id", e());
        e1 a10 = c0.a();
        if (z0.c(dp.f17077b)) {
            a10.b(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        }
        if (z0.c("com.amazon.venezia")) {
            a10.b("amazon");
        }
        if (z0.c("com.huawei.appmarket")) {
            a10.b("huawei");
        }
        if (z0.c("com.sec.android.app.samsungapps")) {
            a10.b("samsung");
        }
        c0.a(b10, "available_stores", a10);
        return b10;
    }

    String e() {
        return z0.a(com.adcolony.sdk.a.b().z());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f6200c;
    }

    String g() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return null;
        }
        return Settings.Secure.getString(a10.getContentResolver(), "advertising_id");
    }

    boolean h() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return false;
        }
        try {
            return Settings.Secure.getInt(a10.getContentResolver(), "limit_ad_tracking") != 0;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    @SuppressLint({"HardwareIds"})
    String i() {
        Context a10 = com.adcolony.sdk.a.a();
        return a10 == null ? "" : Settings.Secure.getString(a10.getContentResolver(), "android_id");
    }

    int j() {
        return Build.VERSION.SDK_INT;
    }

    public String k() {
        return this.f6202e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double l() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = a10.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            return intExtra / intExtra2;
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) a10.getSystemService("phone");
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
        return networkOperatorName.length() == 0 ? "unknown" : networkOperatorName;
    }

    boolean n() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String o() {
        return this.f6204g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String p() {
        return Locale.getDefault().getCountry();
    }

    int q() {
        TimeZone timeZone = TimeZone.getDefault();
        if (timeZone.inDaylightTime(new Date())) {
            return timeZone.getDSTSavings() / 60000;
        }
        return 0;
    }

    boolean r() {
        int i10;
        Context a10 = com.adcolony.sdk.a.a();
        return a10 != null && Build.VERSION.SDK_INT >= 29 && (i10 = a10.getResources().getConfiguration().uiMode & 48) != 16 && i10 == 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return 0.0f;
        }
        return a10.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 t() {
        if (!N()) {
            try {
                return z0.b(c0.a(d(), a(2000L).call()));
            } catch (Exception unused) {
            }
        }
        return z0.b(c0.a(d(), b()));
    }

    String u() {
        return P() ? "tablet" : "phone";
    }

    int v() {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 != null) {
            if (Build.VERSION.SDK_INT < 17) {
                try {
                    WindowManager windowManager = (WindowManager) a10.getSystemService("window");
                    if (windowManager != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                        return displayMetrics.densityDpi;
                    }
                    return 0;
                } catch (RuntimeException unused) {
                    return 0;
                }
            }
            return a10.getResources().getConfiguration().densityDpi;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect w() {
        Rect rect = new Rect();
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 != null) {
            try {
                WindowManager windowManager = (WindowManager) a10.getSystemService("window");
                if (windowManager != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                return rect;
            } catch (RuntimeException unused) {
                return rect;
            }
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect x() {
        Rect rect;
        Rect rect2 = new Rect();
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 != null) {
            try {
                WindowManager windowManager = (WindowManager) a10.getSystemService("window");
                if (windowManager != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 17) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                        return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels - z0.f(a10));
                    }
                    if (i10 < 30) {
                        DisplayMetrics displayMetrics2 = new DisplayMetrics();
                        DisplayMetrics displayMetrics3 = new DisplayMetrics();
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getMetrics(displayMetrics2);
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int f10 = z0.f(a10);
                        int b10 = z0.b(a10);
                        int i11 = displayMetrics3.heightPixels - displayMetrics2.heightPixels;
                        if (i11 <= 0) {
                            rect = new Rect(0, 0, displayMetrics2.widthPixels, displayMetrics2.heightPixels - f10);
                        } else {
                            if (b10 > 0 && (i11 > f10 || b10 <= f10)) {
                                return new Rect(0, 0, displayMetrics2.widthPixels, displayMetrics3.heightPixels - (b10 + f10));
                            }
                            rect = new Rect(0, 0, displayMetrics2.widthPixels, displayMetrics3.heightPixels - f10);
                        }
                    } else {
                        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        try {
                            Point point = new Point();
                            Point point2 = new Point();
                            a10.getDisplay().getCurrentSizeRange(point, point2);
                            Point point3 = currentWindowMetrics.getBounds().width() > currentWindowMetrics.getBounds().height() ? true : true ? new Point(point2.x, point.y) : new Point(point.x, point2.y);
                            return new Rect(0, 0, point3.x, point3.y);
                        } catch (UnsupportedOperationException unused) {
                            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.statusBars());
                            rect = new Rect(0, 0, currentWindowMetrics.getBounds().width() - (insetsIgnoringVisibility.right + insetsIgnoringVisibility.left), currentWindowMetrics.getBounds().height() - (insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom));
                        }
                    }
                    return rect;
                }
                return rect2;
            } catch (RuntimeException unused2) {
                return rect2;
            }
        }
        return rect2;
    }

    String y() {
        return Locale.getDefault().getLanguage();
    }

    f1 z() {
        return this.f6203f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f1 f1Var) {
        this.f6203f = f1Var;
    }

    public void b(String str) {
        this.f6202e = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str) {
        this.f6204g = str;
    }

    void a(String str) {
        this.f6200c = str;
    }

    void b(boolean z10) {
        this.f6199b.a(z10);
    }

    f1 c(long j10) {
        if (j10 <= 0) {
            return c0.a(d(), b(), c());
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(d()));
        q0 q0Var = new q0();
        if (N()) {
            arrayList.add(b());
        } else {
            q0Var.a(a(j10));
        }
        if (O()) {
            arrayList.add(c());
        } else {
            q0Var.a(b(j10));
        }
        if (!q0Var.b()) {
            arrayList.addAll(q0Var.a());
        }
        return c0.a((f1[]) arrayList.toArray(new f1[0]));
    }

    void a(boolean z10) {
        this.f6198a.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 b() {
        f1 b10 = c0.b();
        String f10 = f();
        c0.a(b10, "advertiser_id", f10);
        c0.b(b10, "limit_tracking", A());
        if (f10 == null || f10.isEmpty()) {
            c0.a(b10, "android_id_sha1", z0.b(i()));
        }
        return b10;
    }

    String a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Callable<f1> a(long j10) {
        return new b(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        a(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, y<String> yVar) {
        if (context != null) {
            if (f().isEmpty()) {
                a(false);
            }
            if (z0.a(new c(context, yVar))) {
                return;
            }
            new e0.a().a("Executing Query Advertising ID failed.").a(e0.f5981i);
            if (yVar != null) {
                yVar.a(new Throwable("Query Advertising ID failed on execute."));
            }
        } else if (yVar != null) {
            yVar.a(new Throwable("Context cannot be null."));
        }
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Callable<f1> b(long j10) {
        return new d(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context) {
        b(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b(android.content.Context r3, com.adcolony.sdk.y<java.lang.String> r4) {
        /*
            r2 = this;
            if (r3 != 0) goto Lf
            if (r4 == 0) goto L80
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r0 = "Context cannot be null."
            r3.<init>(r0)
            r4.a(r3)
            goto L80
        Lf:
            java.lang.String r0 = r2.k()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L23
            if (r4 == 0) goto L80
            java.lang.String r3 = r2.k()
            r4.a(r3)
            goto L80
        L23:
            r0 = 0
            r2.b(r0)
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L56
            com.google.android.gms.appset.AppSetIdClient r3 = com.google.android.gms.appset.AppSet.getClient(r3)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L56
            com.google.android.gms.tasks.Task r3 = r3.getAppSetIdInfo()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L56
            com.adcolony.sdk.q$e r0 = new com.adcolony.sdk.q$e     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L56
            r0.<init>(r4)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L56
            r3.addOnCompleteListener(r0)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L56
            return
        L3c:
            r3 = move-exception
            com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
            r0.<init>()
            java.lang.String r1 = "Query App Set ID failed with: "
            com.adcolony.sdk.e0$a r0 = r0.a(r1)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            com.adcolony.sdk.e0$a r3 = r0.a(r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.e0.f5979g
            r3.a(r0)
            goto L66
        L56:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "Google Play Services App Set dependency is missing."
            com.adcolony.sdk.e0$a r3 = r3.a(r0)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.e0.f5978f
            r3.a(r0)
        L66:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "App Set ID is not available."
            com.adcolony.sdk.e0$a r3 = r3.a(r0)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.e0.f5978f
            r3.a(r1)
            if (r4 == 0) goto L80
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>(r0)
            r4.a(r3)
        L80:
            r3 = 1
            r2.b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.q.b(android.content.Context, com.adcolony.sdk.y):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 c() {
        f1 b10 = c0.b();
        c0.a(b10, "app_set_id", k());
        return b10;
    }
}
