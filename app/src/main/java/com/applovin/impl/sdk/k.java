package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.b7;
import com.applovin.impl.c7;
import com.applovin.impl.d7;
import com.applovin.impl.d8;
import com.applovin.impl.f5;
import com.applovin.impl.h4;
import com.applovin.impl.k6;
import com.applovin.impl.l0;
import com.applovin.impl.l2;
import com.applovin.impl.l4;
import com.applovin.impl.n0;
import com.applovin.impl.o4;
import com.applovin.impl.q4;
import com.applovin.impl.r;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.impl.v1;
import com.applovin.impl.w1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.b9;
import com.ironsource.dp;
import com.ironsource.fe;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k {

    /* renamed from: i  reason: collision with root package name */
    private static String f8945i;

    /* renamed from: j  reason: collision with root package name */
    private static final AtomicReference f8946j = new AtomicReference();

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicReference f8947k = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    private final j f8948a;

    /* renamed from: b  reason: collision with root package name */
    private final n f8949b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8950c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f8951d;

    /* renamed from: f  reason: collision with root package name */
    private final Map f8953f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8954g;

    /* renamed from: e  reason: collision with root package name */
    private final Object f8952e = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference f8955h = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements f5.a {
        a() {
        }

        @Override // com.applovin.impl.f5.a
        public void a(r.a aVar) {
            k.f8946j.set(aVar);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8957a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8958b;

        public b(String str, int i10) {
            this.f8957a = str;
            this.f8958b = i10;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f8959a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f8960b = -1;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f8961c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k(j jVar) {
        if (jVar != null) {
            this.f8948a = jVar;
            this.f8949b = jVar.I();
            this.f8950c = j.m();
            this.f8951d = z();
            this.f8953f = y();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private double A() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    private Map F() {
        return d7.a(a(null, true, false));
    }

    private JSONArray I() {
        if (com.applovin.impl.l0.f()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean J() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean K() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.l0.h() && (connectivityManager = (ConnectivityManager) this.f8950c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.f8948a.I();
                if (n.a()) {
                    this.f8948a.I().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private Boolean L() {
        if (com.applovin.impl.l0.i()) {
            return Boolean.valueOf(this.f8950c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.f8955h.set(o());
    }

    private String a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "portrait" : "landscape_left" : "portrait_upside_down" : "landscape_right";
    }

    private String b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "landscape_left" : "portrait_upside_down" : "landscape_right" : "portrait";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String D = D();
            if (StringUtils.isValidString(D)) {
                this.f8948a.I();
                if (n.a()) {
                    this.f8948a.I().a("DataCollector", "Successfully retrieved bid token");
                }
                l2.a(appLovinBidTokenCollectionListener, D);
                return;
            }
            this.f8948a.I();
            if (n.a()) {
                this.f8948a.I().b("DataCollector", "Empty bid token");
            }
            l2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (n.a()) {
                this.f8949b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f8948a.D().a("DataCollector", "collectBidToken", th);
            l2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(c(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long d() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.d():long");
    }

    private String g() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f8950c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private c h() {
        c cVar = new c();
        Intent registerReceiver = this.f8950c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra > 0 && intExtra2 > 0) {
            cVar.f8960b = (int) ((intExtra / intExtra2) * 100.0f);
        } else {
            cVar.f8960b = -1;
        }
        cVar.f8959a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        if (com.applovin.impl.l0.d()) {
            cVar.f8961c = Boolean.valueOf(Settings.Global.getInt(this.f8950c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        } else {
            cVar.f8961c = Boolean.valueOf(((registerReceiver.getIntExtra("plugged", -1) & 1) | 14) > 0);
        }
        return cVar;
    }

    private String i() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8950c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                if (n.a()) {
                    this.f8949b.a("DataCollector", "Unable to collect carrier", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String k() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8950c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String l() {
        Point b10 = com.applovin.impl.l0.b(this.f8950c);
        int i10 = b10.x;
        int i11 = b10.y;
        int c10 = d7.c(this.f8950c);
        if ((i10 > i11 && (c10 == 0 || c10 == 2)) || (i11 > i10 && (c10 == 1 || c10 == 3))) {
            return a(c10);
        }
        return b(c10);
    }

    private String n() {
        if (com.applovin.impl.l0.h()) {
            try {
                StringBuilder sb = new StringBuilder();
                LocaleList locales = this.f8950c.getResources().getConfiguration().getLocales();
                for (int i10 = 0; i10 < locales.size(); i10++) {
                    sb.append(locales.get(i10));
                    sb.append(",");
                }
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private Integer o() {
        AudioManager audioManager = (AudioManager) this.f8950c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        try {
            return Integer.valueOf((int) (audioManager.getStreamVolume(3) * ((Float) this.f8948a.a(o4.Y3)).floatValue()));
        } catch (Throwable th) {
            this.f8948a.I();
            if (n.a()) {
                this.f8948a.I().a("DataCollector", "Unable to collect device volume", th);
            }
            return null;
        }
    }

    private float p() {
        try {
            return Settings.System.getFloat(this.f8950c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e8) {
            if (n.a()) {
                this.f8949b.a("DataCollector", "Error collecting font scale", e8);
                return -1.0f;
            }
            return -1.0f;
        }
    }

    private boolean q() {
        SensorManager sensorManager = (SensorManager) this.f8950c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map r() {
        HashMap hashMap = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f8948a.j0().g(), hashMap);
        CollectionUtils.putStringIfValid(AndroidTcfDataSource.TCF_TCSTRING_KEY, this.f8948a.j0().k(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f8948a.j0().c(), hashMap);
        return hashMap;
    }

    private Boolean s() {
        AudioManager audioManager = (AudioManager) this.f8950c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean t() {
        AudioManager audioManager = (AudioManager) this.f8950c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String u() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8950c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(0, Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (n.a()) {
                    this.f8949b.a("DataCollector", "Unable to collect mobile country code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String v() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f8950c.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                return networkOperator.substring(Math.min(3, networkOperator.length()));
            } catch (Throwable th) {
                if (n.a()) {
                    this.f8949b.a("DataCollector", "Unable to collect mobile network code", th);
                    return "";
                }
                return "";
            }
        }
        return "";
    }

    private String x() {
        AudioManager audioManager = (AudioManager) this.f8950c.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            StringBuilder sb = new StringBuilder();
            if (com.applovin.impl.l0.g()) {
                for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                    sb.append(audioDeviceInfo.getType());
                    sb.append(",");
                }
            } else {
                if (audioManager.isWiredHeadsetOn()) {
                    sb.append(3);
                    sb.append(",");
                }
                if (audioManager.isBluetoothScoOn()) {
                    sb.append(7);
                    sb.append(",");
                }
                if (audioManager.isBluetoothA2dpOn()) {
                    sb.append(8);
                }
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2) && n.a()) {
                this.f8949b.a("DataCollector", "No sound outputs detected");
            }
            return sb2;
        }
        return null;
    }

    private Map y() {
        PackageInfo packageInfo;
        HashMap hashMap = new HashMap();
        PackageManager packageManager = this.f8950c.getPackageManager();
        ApplicationInfo applicationInfo = this.f8950c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f8950c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        hashMap.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(packageInfo != null ? packageInfo.versionCode : -1));
        if (str == null) {
            str = "";
        }
        hashMap.put("installer_name", str);
        hashMap.put("tg", c7.a(this.f8948a));
        hashMap.put("debug", Boolean.valueOf(d7.c(this.f8948a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        hashMap.put("alts_ms", Long.valueOf(j.l()));
        hashMap.put("j8", Boolean.valueOf(j.w0()));
        hashMap.put("ps_tpg", Boolean.valueOf(h4.d(this.f8950c)));
        hashMap.put("ps_apg", Boolean.valueOf(h4.b(this.f8950c)));
        hashMap.put("ps_capg", Boolean.valueOf(h4.c(this.f8950c)));
        hashMap.put("ps_aipg", Boolean.valueOf(h4.a(this.f8950c)));
        j jVar = this.f8948a;
        q4 q4Var = q4.f8443f;
        Long l10 = (Long) jVar.a(q4Var);
        if (l10 != null) {
            hashMap.put("ia_v2", l10);
        } else {
            this.f8948a.b(q4Var, Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.f8948a.V().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.f.b(), hashMap);
        hashMap.put("api_did", this.f8948a.a(o4.f8106f));
        hashMap.put("first_install_v3_ms", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : "");
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (com.applovin.impl.l0.h()) {
            hashMap.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f8948a.z0()) {
            hashMap.put("unity_version", d7.a(this.f8948a.f0()));
        }
        return hashMap;
    }

    private Map z() {
        HashMap hashMap = new HashMap(35);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(com.applovin.impl.r.a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put(fe.B, Build.MODEL);
        hashMap.put(fe.E, Build.VERSION.RELEASE);
        hashMap.put(fe.G, w());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(A()));
        hashMap.put("gy", Boolean.valueOf(q()));
        hashMap.put("country_code", k());
        hashMap.put("mcc", u());
        hashMap.put("mnc", v());
        hashMap.put(fe.L0, i());
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f8950c)));
        hashMap.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("hdr", L());
        hashMap.put("supported_abis", I());
        DisplayMetrics displayMetrics = this.f8950c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            l0.a a10 = com.applovin.impl.l0.a(this.f8950c, this.f8948a);
            if (a10 != null) {
                hashMap.put("tl_cr", Integer.valueOf(a10.c()));
                hashMap.put("tr_cr", Integer.valueOf(a10.d()));
                hashMap.put("bl_cr", Integer.valueOf(a10.a()));
                hashMap.put("br_cr", Integer.valueOf(a10.b()));
            }
        }
        hashMap.put("bt_ms", Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        hashMap.put("tbalsi_ms", Long.valueOf(this.f8948a.H() - j.l()));
        CollectionUtils.putBooleanIfValid("psase", Boolean.valueOf(h4.e(this.f8950c)), hashMap);
        CollectionUtils.putStringIfValid("process_name", d7.b(this.f8950c), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", d7.g(this.f8950c), hashMap);
        try {
            PackageInfo packageInfo = this.f8950c.getPackageManager().getPackageInfo(dp.f17077b, 0);
            hashMap.put("ps_version", packageInfo.versionName);
            hashMap.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            hashMap.put("ps_version", "");
            hashMap.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", b7.a(this.f8950c), hashMap);
        a(hashMap);
        return hashMap;
    }

    public Map B() {
        Map map = CollectionUtils.map(this.f8953f);
        String str = StringUtils.isValidString(f8945i) ? f8945i : this.f8950c.getApplicationInfo().packageName;
        map.put(b9.h.V, str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f8948a.t0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f8948a.r0()));
        map.put("test_ads", Boolean.valueOf(this.f8954g));
        map.put("test_mode", Integer.valueOf(this.f8948a.k0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f8948a.f0().isMuted()));
        if (((Boolean) this.f8948a.a(o4.A3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f8948a.o0().c(), map);
        }
        if (((Boolean) this.f8948a.a(o4.D3)).booleanValue()) {
            map.put("compass_random_token", this.f8948a.r());
        }
        if (((Boolean) this.f8948a.a(o4.F3)).booleanValue()) {
            map.put("applovin_random_token", this.f8948a.Z());
        }
        map.putAll(r());
        if (this.f8948a.Y() != null) {
            CollectionUtils.putJsonArrayIfValid("ps_topics", this.f8948a.Y().a(), map);
        }
        return map;
    }

    public b C() {
        return (b) f8947k.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String D() {
        String encodeToString = Base64.encodeToString(new JSONObject(F()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f8948a.a(o4.U4)).booleanValue() ? l4.b(encodeToString, d7.a(this.f8948a), l4.a.a(((Integer) this.f8948a.a(o4.V4)).intValue()), this.f8948a.a0(), this.f8948a) : encodeToString;
    }

    public String E() {
        ActivityManager activityManager = (ActivityManager) this.f8950c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map G() {
        return CollectionUtils.map(this.f8953f);
    }

    public Map H() {
        return CollectionUtils.map(this.f8951d);
    }

    public boolean M() {
        return this.f8954g;
    }

    public void O() {
        u5 i02 = this.f8948a.i0();
        f5 f5Var = new f5(this.f8948a, new a());
        u5.b bVar = u5.b.OTHER;
        i02.a((z4) f5Var, bVar);
        this.f8948a.i0().a((z4) new k6(this.f8948a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.z0
            @Override // java.lang.Runnable
            public final void run() {
                k.this.N();
            }
        }), bVar);
    }

    public void P() {
        synchronized (this.f8952e) {
            a(this.f8951d);
        }
    }

    public Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sc", this.f8948a.a(o4.f8154l));
        hashMap.put("sc2", this.f8948a.a(o4.f8162m));
        hashMap.put("sc3", this.f8948a.a(o4.f8170n));
        hashMap.put("server_installed_at", this.f8948a.a(o4.f8178o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f8948a.a(q4.H), hashMap);
        return hashMap;
    }

    public r.a f() {
        List<String> testDeviceAdvertisingIds;
        r.a b10 = com.applovin.impl.r.b(this.f8950c);
        if (b10 == null) {
            return new r.a();
        }
        if (((Boolean) this.f8948a.a(o4.f8262y3)).booleanValue()) {
            if (b10.c() && !((Boolean) this.f8948a.a(o4.f8254x3)).booleanValue()) {
                b10.a("");
            }
            f8946j.set(b10);
        } else {
            b10 = new r.a();
        }
        if (this.f8948a.x0().get()) {
            testDeviceAdvertisingIds = this.f8948a.f0().getTestDeviceAdvertisingIds();
        } else {
            testDeviceAdvertisingIds = this.f8948a.G() != null ? this.f8948a.G().getTestDeviceAdvertisingIds() : null;
        }
        if (testDeviceAdvertisingIds != null) {
            String a10 = b10.a();
            if (StringUtils.isValidString(a10)) {
                this.f8954g = testDeviceAdvertisingIds.contains(a10);
            }
            b C = C();
            String str = C != null ? C.f8957a : null;
            if (StringUtils.isValidString(str)) {
                this.f8954g = testDeviceAdvertisingIds.contains(str) | this.f8954g;
            }
        } else {
            this.f8954g = false;
        }
        return b10;
    }

    public Map j() {
        n0.d a10 = this.f8948a.t().a();
        if (a10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("lrm_ts_ms", String.valueOf(a10.c()));
        hashMap.put("lrm_url", a10.d());
        hashMap.put("lrm_ct_ms", String.valueOf(a10.a()));
        hashMap.put("lrm_rs", String.valueOf(a10.b()));
        return hashMap;
    }

    public Map m() {
        return a(false);
    }

    public String w() {
        return AppLovinSdkUtils.isFireOS(this.f8950c) ? "fireos" : "android";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f8948a.i0().a((z4) new k6(this.f8948a, ((Boolean) this.f8948a.a(o4.L3)).booleanValue(), "DataCollector", new Runnable() { // from class: com.applovin.impl.sdk.a1
            @Override // java.lang.Runnable
            public final void run() {
                k.this.b(appLovinBidTokenCollectionListener);
            }
        }), u5.b.CORE);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap(64);
        Map a10 = a(z10);
        Map B = B();
        Map j10 = j();
        Map c02 = this.f8948a.c0();
        if (z11) {
            hashMap.put("device_info", a10);
            hashMap.put("app_info", B);
            if (j10 != null) {
                hashMap.put("connection_info", j10);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(c02)) {
                hashMap.put("segments", c02);
            }
        } else {
            hashMap.putAll(a10);
            hashMap.putAll(B);
            if (j10 != null) {
                hashMap.putAll(j10);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!CollectionUtils.isEmpty(c02)) {
                hashMap.putAll(c02);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f8948a.N(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f8948a.y(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f8948a.a(o4.J3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f8948a.l0()), hashMap);
        if (!((Boolean) this.f8948a.a(o4.S4)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8948a.a0());
        }
        hashMap.putAll(e());
        if (((Boolean) this.f8948a.a(o4.f8223t4)).booleanValue()) {
            w1 C = this.f8948a.C();
            hashMap.put("li", Long.valueOf(C.b(v1.f9431e)));
            hashMap.put("si", Long.valueOf(C.b(v1.f9434h)));
            hashMap.put("mad", Long.valueOf(C.b(v1.f9432f)));
            hashMap.put("msad", Long.valueOf(C.b(v1.f9435i)));
            hashMap.put("pf", Long.valueOf(C.b(v1.f9439m)));
            hashMap.put("mpf", Long.valueOf(C.b(v1.f9446t)));
            hashMap.put("gpf", Long.valueOf(C.b(v1.f9440n)));
            hashMap.put("asoac", Long.valueOf(C.b(v1.f9444r)));
        }
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f8950c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    public Map a(boolean z10) {
        Map map;
        synchronized (this.f8952e) {
            map = CollectionUtils.map(this.f8951d);
        }
        return a(map, z10);
    }

    private void a(Map map) {
        if (((Boolean) this.f8948a.a(o4.S3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f8948a.a(o4.T3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(p()));
        }
        if (((Boolean) this.f8948a.a(o4.f8072a4)).booleanValue() && d7.d(this.f8948a)) {
            d8.a(this.f8948a);
        }
        if (((Boolean) this.f8948a.a(o4.f8175n4)).booleanValue()) {
            d8.b(this.f8948a);
        }
        if (((Boolean) this.f8948a.a(o4.Z3)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f8948a.a(o4.V3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(K()));
        }
        if (((Boolean) this.f8948a.a(o4.f8095d4)).booleanValue()) {
            boolean z10 = true;
            boolean z11 = this.f8950c.getResources().getConfiguration().keyboard == 2;
            boolean hasSystemFeature = this.f8950c.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
            boolean hasSystemFeature2 = this.f8950c.getPackageManager().hasSystemFeature("android.hardware.type.pc");
            if (!z11 || (!hasSystemFeature && !hasSystemFeature2)) {
                z10 = false;
            }
            map.put("is_pc", Boolean.valueOf(z10));
        }
        if (((Boolean) this.f8948a.a(o4.f8191p4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", E(), map);
        }
    }

    private Map a(Map map, boolean z10) {
        r.a f10;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point b10 = com.applovin.impl.l0.b(this.f8950c);
        map2.put("dx", Integer.valueOf(b10.x));
        map2.put("dy", Integer.valueOf(b10.y));
        DisplayMetrics displayMetrics = this.f8950c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(b10.x, 2.0d) + Math.pow(b10.y, 2.0d)) / displayMetrics.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f8950c)));
        if (z10) {
            f10 = (r.a) f8946j.get();
            if (f10 != null) {
                O();
            } else if (d7.h()) {
                f10 = new r.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                f10 = f();
            }
        } else {
            f10 = f();
        }
        String a10 = f10.a();
        if (StringUtils.isValidString(a10)) {
            map2.put("idfa", a10);
        }
        map2.put("dnt", Boolean.valueOf(f10.c()));
        map2.put("dnt_code", f10.b().b());
        b bVar = (b) f8947k.get();
        if (((Boolean) this.f8948a.a(o4.f8270z3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f8957a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f8958b));
        }
        Boolean b11 = com.applovin.impl.m0.b().b(this.f8950c);
        if (b11 != null) {
            map2.put("huc", b11);
        }
        Boolean b12 = com.applovin.impl.m0.c().b(this.f8950c);
        if (b12 != null) {
            map2.put("aru", b12);
        }
        Boolean b13 = com.applovin.impl.m0.a().b(this.f8950c);
        if (b13 != null) {
            map2.put("dns", b13);
        }
        if (((Boolean) this.f8948a.a(o4.M3)).booleanValue()) {
            c h10 = h();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(h10.f8959a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(h10.f8960b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", h10.f8961c, map2);
        }
        if (((Boolean) this.f8948a.a(o4.U3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f8948a.e0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f8948a.a(o4.X3)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(J()));
        }
        Integer o10 = z10 ? (Integer) this.f8955h.get() : o();
        if (o10 != null) {
            map2.put("volume", o10);
        }
        CollectionUtils.putBooleanIfValid("ma", s(), map2);
        CollectionUtils.putBooleanIfValid("spo", t(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f8948a.e0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f8948a.e0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f8948a.e0().getAppEnteredBackgroundTimeMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f8950c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e8) {
            if (n.a()) {
                this.f8949b.a("DataCollector", "Unable to collect screen brightness", e8);
            }
        }
        if (((Boolean) this.f8948a.a(o4.f8072a4)).booleanValue() && d7.d(this.f8948a)) {
            d8.a(this.f8948a);
            String a11 = d8.a();
            if (StringUtils.isValidString(a11)) {
                map2.put(fe.f17396a0, a11);
            }
        }
        if (((Boolean) this.f8948a.a(o4.f8175n4)).booleanValue()) {
            d8.b(this.f8948a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(d8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", d8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", d8.b(), map2);
        }
        if (((Boolean) this.f8948a.a(o4.O3)).booleanValue()) {
            try {
                map2.put(fe.P0, Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put(fe.P0, -1);
                map2.put("tds", -1);
                if (n.a()) {
                    this.f8949b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f8948a.a(o4.P3)).booleanValue()) {
            ActivityManager.MemoryInfo a12 = d7.a((ActivityManager) this.f8950c.getSystemService("activity"));
            if (a12 != null) {
                map2.put("fm", Long.valueOf(a12.availMem));
                map2.put("tm", Long.valueOf(a12.totalMem));
                map2.put("lmt", Long.valueOf(a12.threshold));
                map2.put("lm", Boolean.valueOf(a12.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f8948a.a(o4.Q3)).booleanValue() && com.applovin.impl.l0.a("android.permission.READ_PHONE_STATE", this.f8950c) && com.applovin.impl.l0.h()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f8950c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f8948a.a(o4.N3)).booleanValue()) {
            String x10 = x();
            if (!TextUtils.isEmpty(x10)) {
                map2.put("so", x10);
            }
        }
        map2.put("device_orientation", l());
        map2.put("orientation_lock", g());
        if (((Boolean) this.f8948a.a(o4.R3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(d7.j()));
        }
        if (com.applovin.impl.l0.f() && (powerManager = (PowerManager) this.f8950c.getSystemService("power")) != null) {
            map2.put(fe.U0, Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f8948a.a(o4.f8079b4)).booleanValue() && this.f8948a.d0() != null) {
            map2.put("da", Float.valueOf(this.f8948a.d0().a()));
        }
        if (((Boolean) this.f8948a.a(o4.f8087c4)).booleanValue() && this.f8948a.d0() != null) {
            map2.put("dm", Float.valueOf(this.f8948a.d0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f8948a.o().a()));
        map2.put("network", com.applovin.impl.o0.g(this.f8948a));
        String n10 = n();
        if (StringUtils.isValidString(n10)) {
            map2.put("kb", n10);
        }
        ArrayService n11 = this.f8948a.n();
        if (n11.isAppHubInstalled()) {
            if (n11.getIsDirectDownloadEnabled() != null) {
                map2.put("ah_dd_enabled", n11.getIsDirectDownloadEnabled());
            }
            map2.put("ah_sdk_version_code", Long.valueOf(n11.getAppHubVersionCode()));
            map2.put("ah_random_user_token", StringUtils.emptyIfNull(n11.getRandomUserToken()));
            map2.put("ah_sdk_package_name", StringUtils.emptyIfNull(n11.getAppHubPackageName()));
        }
        return map2;
    }

    public static void a(r.a aVar) {
        f8946j.set(aVar);
    }

    public static void a(b bVar) {
        f8947k.set(bVar);
    }

    public static void a(String str, j jVar) {
        String installerPackageName = j.m().getPackageManager().getInstallerPackageName(j.m().getApplicationInfo().packageName);
        List c10 = jVar.c(o4.f8161l6);
        if (!StringUtils.isValidString(installerPackageName) || c10.contains(installerPackageName)) {
            f8945i = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }
}
