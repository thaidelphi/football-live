package com.ironsource;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.IronSourceSharedPreferencesUtilities;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.nf;
import com.ironsource.q9;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ab implements nf, nf.a {
    private static final String A = "browser_user_agent";
    private static final String B = "browser_user_agent_time";
    private static final String C = "IABTCF_gdprApplies";
    private static final String D = "IABTCF_TCString";
    private static final String E = "IABTCF_AddtlConsent";

    /* renamed from: j  reason: collision with root package name */
    private static final String f16281j = "android";

    /* renamed from: k  reason: collision with root package name */
    private static final String f16282k = "com.google.android.gms.permission.AD_ID";

    /* renamed from: l  reason: collision with root package name */
    private static final String f16283l = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* renamed from: m  reason: collision with root package name */
    private static final String f16284m = "com.google.android.gms.appset.AppSet";

    /* renamed from: n  reason: collision with root package name */
    private static final String f16285n = "com.google.android.gms.tasks.OnSuccessListener";

    /* renamed from: o  reason: collision with root package name */
    private static final String f16286o = "getAdvertisingIdInfo";

    /* renamed from: p  reason: collision with root package name */
    private static final String f16287p = "getClient";

    /* renamed from: q  reason: collision with root package name */
    private static final String f16288q = "getAppSetIdInfo";

    /* renamed from: r  reason: collision with root package name */
    private static final String f16289r = "addOnSuccessListener";

    /* renamed from: s  reason: collision with root package name */
    private static final String f16290s = "getId";

    /* renamed from: t  reason: collision with root package name */
    private static final String f16291t = "isLimitAdTrackingEnabled";

    /* renamed from: u  reason: collision with root package name */
    private static final String f16292u = "Mediation_Shared_Preferences";

    /* renamed from: v  reason: collision with root package name */
    private static final String f16293v = "supersonic_shared_preferen";

    /* renamed from: w  reason: collision with root package name */
    private static final String f16294w = "cachedUUID";

    /* renamed from: x  reason: collision with root package name */
    private static final String f16295x = "auid";

    /* renamed from: y  reason: collision with root package name */
    private static final String f16296y = "unityads-installinfo";

    /* renamed from: z  reason: collision with root package name */
    private static final String f16297z = "unityads-idfi";

    /* renamed from: b  reason: collision with root package name */
    private String f16298b = null;

    /* renamed from: c  reason: collision with root package name */
    private String f16299c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f16300d = null;

    /* renamed from: e  reason: collision with root package name */
    private String f16301e = "";

    /* renamed from: f  reason: collision with root package name */
    private boolean f16302f = false;

    /* renamed from: g  reason: collision with root package name */
    private String f16303g = "";

    /* renamed from: h  reason: collision with root package name */
    private volatile String f16304h;

    /* renamed from: i  reason: collision with root package name */
    private volatile String f16305i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements InvocationHandler {
        a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length <= 0 || (obj2 = objArr[0]) == null) {
                        return null;
                    }
                    String obj3 = obj2.getClass().getMethod(ab.f16290s, new Class[0]).invoke(objArr[0], new Object[0]).toString();
                    if (TextUtils.isEmpty(obj3)) {
                        return null;
                    }
                    ab.this.f16303g = obj3;
                    return null;
                } catch (Exception e8) {
                    o9.d().a(e8);
                    return null;
                }
            }
            return null;
        }
    }

    private String O(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object Q = Q(context);
        return Q.getClass().getMethod(f16290s, new Class[0]).invoke(Q, new Object[0]).toString();
    }

    private void P(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object invoke = AppSet.class.getMethod(f16287p, Context.class).invoke(AppSet.class, context);
        Object invoke2 = invoke.getClass().getMethod(f16288q, new Class[0]).invoke(invoke, new Object[0]);
        invoke2.getClass().getMethod(f16289r, OnSuccessListener.class).invoke(invoke2, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{OnSuccessListener.class}, new a()));
    }

    private Object Q(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return AdvertisingIdClient.class.getMethod(f16286o, Context.class).invoke(AdvertisingIdClient.class, context);
    }

    private String R(Context context) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object Q = Q(context);
        return String.valueOf(((Boolean) Q.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(Q, new Object[0])).booleanValue());
    }

    private String S(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f16292u, A, "");
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return "";
        }
    }

    private long T(Context context) {
        try {
            return Long.parseLong(IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f16292u, B, String.valueOf(-1L)));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return -1L;
        }
    }

    private long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1048576;
    }

    private void a(Context context, String str) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f16292u, A, str);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private void b(Context context, long j10) {
        try {
            IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f16292u, B, String.valueOf(j10));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private boolean b(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e8) {
            o9.d().a(e8);
            return false;
        }
    }

    @Override // com.ironsource.nf
    public int A(Context context) {
        int L = L(context);
        int H = H(context);
        return (((L == 0 || L == 2) && H == 2) || ((L == 1 || L == 3) && H == 1)) ? 2 : 1;
    }

    @Override // com.ironsource.nf
    public int B(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, C, -1);
        } catch (Exception e8) {
            o9.d().a(e8);
            return -1;
        }
    }

    @Override // com.ironsource.nf
    public int C(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    @Override // com.ironsource.nf
    public String D(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, "IABTCF_TCString", null);
        } catch (Exception e8) {
            o9.d().a(e8);
            return null;
        }
    }

    @Override // com.ironsource.nf
    public boolean E(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    @Override // com.ironsource.nf
    public String F(Context context) {
        return Locale.getDefault().toString();
    }

    @Override // com.ironsource.nf
    public String G(Context context) {
        if (xa.f21388a.c()) {
            try {
                P(context);
                if (!TextUtils.isEmpty(this.f16303g)) {
                    return this.f16303g;
                }
            } catch (Exception e8) {
                o9.d().a(e8);
            }
        }
        return "";
    }

    @Override // com.ironsource.nf
    public int H(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    @Override // com.ironsource.nf
    public String I(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    @Override // com.ironsource.nf
    public boolean J(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.ironsource.nf
    public String K(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, E, null);
        } catch (Exception e8) {
            o9.d().a(e8);
            return null;
        }
    }

    @Override // com.ironsource.nf
    public int L(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    @Override // com.ironsource.nf
    public synchronized String M(Context context) {
        if (!TextUtils.isEmpty(this.f16298b)) {
            return this.f16298b;
        }
        if (IronSourceSharedPreferencesUtilities.getBooleanFromSharedPrefs(context, f16292u, nf.f19404a, true)) {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, f16292u, f16294w, "");
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String uuid = UUID.randomUUID().toString();
                this.f16298b = uuid;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, f16292u, f16294w, uuid);
            } else {
                this.f16298b = stringFromSharedPrefs;
            }
        }
        return this.f16298b;
    }

    @Override // com.ironsource.nf
    public int N(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    @Override // com.ironsource.nf
    public int a() {
        return k();
    }

    @Override // com.ironsource.nf
    public long a(String str) {
        return a(new File(str));
    }

    @Override // com.ironsource.nf
    public Long a(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.threshold);
    }

    @Override // com.ironsource.nf
    public String a(Context context) {
        String R;
        try {
            if (!xa.f21388a.a()) {
                R = R(context);
            } else if (this.f16304h == null) {
                String R2 = R(context);
                if (TextUtils.isEmpty(R2)) {
                    return R2;
                }
                this.f16304h = R2;
                return R2;
            } else {
                R = this.f16304h;
            }
            return R;
        } catch (Exception e8) {
            o9.d().a(e8);
            return null;
        }
    }

    @Override // com.ironsource.nf.a
    public void a(Context context, long j10) {
        if (context != null) {
            if (!new hv(new q9.a()).a(T(context), j10)) {
                String S = S(context);
                this.f16301e = S;
                this.f16302f = !S.isEmpty();
            }
            if (this.f16301e.isEmpty()) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    this.f16301e = defaultUserAgent;
                    a(context, defaultUserAgent);
                    if (j10 > 0) {
                        b(context, System.currentTimeMillis());
                    }
                } catch (Exception e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                }
            }
        }
    }

    @Override // com.ironsource.nf
    public boolean a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | CodedOutputStream.DEFAULT_BUFFER_SIZE) == systemUiVisibility || (systemUiVisibility | com.ironsource.mediationsdk.metadata.a.f18931n) == systemUiVisibility;
    }

    @Override // com.ironsource.nf
    public Boolean b(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Boolean.valueOf(memoryInfo.lowMemory);
    }

    @Override // com.ironsource.nf
    public String b() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    @Override // com.ironsource.nf
    public String b(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    @Override // com.ironsource.nf
    public Long c(ActivityManager.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            return null;
        }
        return Long.valueOf(memoryInfo.availMem);
    }

    @Override // com.ironsource.nf
    public boolean c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return Environment.isExternalStorageRemovable();
            }
            return false;
        } catch (Exception e8) {
            o9.d().a(e8);
            return false;
        }
    }

    @Override // com.ironsource.nf
    public boolean c(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return false;
        }
    }

    @Override // com.ironsource.nf
    public int d() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // com.ironsource.nf
    public boolean d(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return false;
        }
    }

    @Override // com.ironsource.nf
    public File e(Context context) {
        return context.getExternalCacheDir();
    }

    @Override // com.ironsource.nf
    public String e() {
        return Build.MODEL;
    }

    @Override // com.ironsource.nf
    public String f(Context context) {
        if (context == null) {
            return "";
        }
        int N = N(context);
        if (N != 0) {
            if (N != 1) {
                if (N != 11) {
                    if (N != 12) {
                        switch (N) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    @Override // com.ironsource.nf
    public boolean f() {
        return b(AndroidStaticDeviceInfoDataSource.BINARY_SU);
    }

    @Override // com.ironsource.nf
    public String g() {
        return Build.MANUFACTURER;
    }

    @Override // com.ironsource.nf
    public boolean g(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // com.ironsource.nf
    public float h() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    @Override // com.ironsource.nf
    public long h(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        return -1L;
    }

    @Override // com.ironsource.nf
    public String i() {
        try {
            return System.getProperty("os.arch");
        } catch (SecurityException e8) {
            IronLog.INTERNAL.error(e8.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.nf
    public String i(Context context) {
        return s(context) ? "Tablet" : "Phone";
    }

    @Override // com.ironsource.nf
    public long j() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    @Override // com.ironsource.nf
    public String j(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkOperatorName();
    }

    @Override // com.ironsource.nf
    public int k() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // com.ironsource.nf
    public File k(Context context) {
        return context.getCacheDir();
    }

    @Override // com.ironsource.nf
    public int l() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.ironsource.nf
    public int l(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    @Override // com.ironsource.nf
    public float m(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        try {
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return -1.0f;
        }
    }

    @Override // com.ironsource.nf
    public String m() {
        return "android";
    }

    @Override // com.ironsource.nf
    public long n() {
        if (c()) {
            return a(Environment.getExternalStorageDirectory());
        }
        return 0L;
    }

    @Override // com.ironsource.nf
    public String n(Context context) {
        TelephonyManager telephonyManager;
        return (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) ? "" : telephonyManager.getNetworkCountryIso();
    }

    @Override // com.ironsource.nf
    public long o() {
        return a(Environment.getDataDirectory());
    }

    @Override // com.ironsource.nf
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<ApplicationInfo> o(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    @Override // com.ironsource.nf
    public String p() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.ironsource.nf
    public String p(Context context) {
        String O;
        xa xaVar = xa.f21388a;
        if (xaVar.b()) {
            try {
                if (!xaVar.a()) {
                    O = O(context);
                } else if (this.f16305i == null) {
                    String O2 = O(context);
                    if (TextUtils.isEmpty(O2)) {
                        return O2;
                    }
                    this.f16305i = O2;
                    return O2;
                } else {
                    O = this.f16305i;
                }
                return O;
            } catch (Exception e8) {
                o9.d().a(e8);
                return null;
            }
        }
        return null;
    }

    @Override // com.ironsource.nf
    public int q() {
        return -(TimeZone.getDefault().getOffset(j()) / 60000);
    }

    @Override // com.ironsource.nf
    public boolean q(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return false;
    }

    @Override // com.ironsource.nf
    public String r(Context context) {
        try {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
            if (resolveActivity != null) {
                return resolveActivity.activityInfo.packageName;
            }
            return null;
        } catch (Throwable th) {
            o9.d().a(th);
            return null;
        }
    }

    @Override // com.ironsource.nf
    public boolean r() {
        return this.f16302f;
    }

    @Override // com.ironsource.nf
    public int s() {
        return d();
    }

    @Override // com.ironsource.nf
    public boolean s(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return ((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f;
        }
        return false;
    }

    @Override // com.ironsource.nf
    public String t() {
        try {
            return this.f16301e.isEmpty() ? S(ContextProvider.getInstance().getApplicationContext()) : this.f16301e;
        } catch (Exception e8) {
            o9.d().a(e8);
            return "";
        }
    }

    @Override // com.ironsource.nf
    public synchronized String t(Context context) {
        if (!TextUtils.isEmpty(this.f16299c)) {
            return this.f16299c;
        } else if (context == null) {
            return "";
        } else {
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
            this.f16299c = stringFromSharedPrefs;
            if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                String uuid = UUID.randomUUID().toString();
                this.f16299c = uuid;
                IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", uuid);
            }
            return this.f16299c;
        }
    }

    @Override // com.ironsource.nf
    public File u(Context context) {
        return context.getExternalFilesDir(null);
    }

    @Override // com.ironsource.nf
    public boolean v(Context context) {
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), CodedOutputStream.DEFAULT_BUFFER_SIZE).requestedPermissions) {
                if (str.equalsIgnoreCase(f16282k)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e8) {
            o9.d().a(e8);
            return false;
        }
    }

    @Override // com.ironsource.nf
    public String w(Context context) {
        if (TextUtils.isEmpty(this.f16300d)) {
            if (context == null) {
                return null;
            }
            String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "unityads-installinfo", "unityads-idfi", null);
            this.f16300d = stringFromSharedPrefs;
            return stringFromSharedPrefs;
        }
        return this.f16300d;
    }

    @Override // com.ironsource.nf
    public File x(Context context) {
        return context.getFilesDir();
    }

    @Override // com.ironsource.nf
    public int y(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return -1;
        }
    }

    @Override // com.ironsource.nf
    public ActivityManager.MemoryInfo z(Context context) {
        if (context == null || !mm.S().d().a()) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        }
        return null;
    }
}
