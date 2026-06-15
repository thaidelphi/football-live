package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.b9;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class de implements Runnable {
    public static final String M = "sdkVersion";
    public static final String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private Context K;

    /* renamed from: a  reason: collision with root package name */
    private final String f17017a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final String f17018b = "bundleId";

    /* renamed from: c  reason: collision with root package name */
    private final String f17019c = "advertisingId";

    /* renamed from: d  reason: collision with root package name */
    private final String f17020d = b9.i.M;

    /* renamed from: e  reason: collision with root package name */
    private final String f17021e = "appKey";

    /* renamed from: f  reason: collision with root package name */
    private final String f17022f = "deviceOS";

    /* renamed from: g  reason: collision with root package name */
    private final String f17023g = "osVersion";

    /* renamed from: h  reason: collision with root package name */
    private final String f17024h = b9.i.f16727t;

    /* renamed from: i  reason: collision with root package name */
    private final String f17025i = b9.i.f16728u;

    /* renamed from: j  reason: collision with root package name */
    private final String f17026j = "language";

    /* renamed from: k  reason: collision with root package name */
    private final String f17027k = b9.i.f16710k;

    /* renamed from: l  reason: collision with root package name */
    private final String f17028l = b9.i.f16712l;

    /* renamed from: m  reason: collision with root package name */
    private final String f17029m = b9.i.f16724r;

    /* renamed from: n  reason: collision with root package name */
    private final String f17030n = "externalFreeMemory";

    /* renamed from: o  reason: collision with root package name */
    private final String f17031o = "internalFreeMemory";

    /* renamed from: p  reason: collision with root package name */
    private final String f17032p = "battery";

    /* renamed from: q  reason: collision with root package name */
    private final String f17033q = "gmtMinutesOffset";

    /* renamed from: r  reason: collision with root package name */
    private final String f17034r = b9.i.W;

    /* renamed from: s  reason: collision with root package name */
    private final String f17035s = JsonStorageKeyNames.SESSION_ID_KEY;

    /* renamed from: t  reason: collision with root package name */
    private final String f17036t = "pluginType";

    /* renamed from: u  reason: collision with root package name */
    private final String f17037u = "pluginVersion";

    /* renamed from: v  reason: collision with root package name */
    private final String f17038v = "plugin_fw_v";

    /* renamed from: w  reason: collision with root package name */
    private final String f17039w = "jb";

    /* renamed from: x  reason: collision with root package name */
    private final String f17040x = "advertisingIdType";

    /* renamed from: y  reason: collision with root package name */
    private final String f17041y = fe.V0;

    /* renamed from: z  reason: collision with root package name */
    private final String f17042z = "firstSession";
    private final String A = "mcc";
    private final String B = "mnc";
    private final String C = "icc";
    private final String D = "tz";
    private final String E = "auid";
    private final String F = "userLat";
    private final String G = "publisherAPI";
    private final String H = "missingDependencies";
    private final String I = "missingManifest";
    private final String J = "other";
    private final nf L = mm.S().f();

    private de() {
    }

    public de(Context context) {
        this.K = context.getApplicationContext();
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? "missingDependencies" : !xa.f21388a.b() ? "publisherAPI" : !this.L.v(this.K) ? "missingManifest" : Boolean.parseBoolean(str) ? "userLat" : "other";
    }

    private Map<String, Object> a() {
        String str;
        boolean z10;
        HashMap hashMap = new HashMap();
        hashMap.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.getSessionId());
        String e8 = e();
        if (!TextUtils.isEmpty(e8)) {
            hashMap.put("bundleId", e8);
            String b10 = c4.b(this.K, e8);
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(b9.i.W, b10);
            }
        }
        hashMap.put("appKey", c());
        String p10 = this.L.p(this.K);
        String a10 = this.L.a(this.K);
        boolean z11 = false;
        if (TextUtils.isEmpty(p10)) {
            String M2 = this.L.M(this.K);
            str = !TextUtils.isEmpty(M2) ? IronSourceConstants.TYPE_UUID : "";
            z10 = true;
            p10 = M2;
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z10 = false;
        }
        if (!TextUtils.isEmpty(p10)) {
            hashMap.put("advertisingId", p10);
            hashMap.put("advertisingIdType", str);
        }
        if (!TextUtils.isEmpty(a10)) {
            z11 = Boolean.parseBoolean(a10);
            hashMap.put(b9.i.M, Boolean.valueOf(z11));
        }
        if (z10 || z11) {
            hashMap.put(N, a(a10));
        }
        hashMap.put("deviceOS", h());
        if (!TextUtils.isEmpty(b())) {
            hashMap.put("osVersion", b());
        }
        String connectionType = IronSourceUtils.getConnectionType(this.K);
        if (!TextUtils.isEmpty(connectionType)) {
            hashMap.put(b9.i.f16727t, connectionType);
        }
        String d10 = y8.d(this.K);
        if (!TextUtils.isEmpty(d10)) {
            hashMap.put(b9.i.f16728u, d10);
        }
        hashMap.put("sdkVersion", r());
        String l10 = l();
        if (!TextUtils.isEmpty(l10)) {
            hashMap.put("language", l10);
        }
        String g10 = g();
        if (!TextUtils.isEmpty(g10)) {
            hashMap.put(b9.i.f16710k, g10);
        }
        String f10 = f();
        if (!TextUtils.isEmpty(f10)) {
            hashMap.put(b9.i.f16712l, f10);
        }
        String n10 = n();
        if (!TextUtils.isEmpty(n10)) {
            hashMap.put(b9.i.f16724r, n10);
        }
        hashMap.put("internalFreeMemory", Long.valueOf(k()));
        hashMap.put("externalFreeMemory", Long.valueOf(i()));
        hashMap.put("battery", Integer.valueOf(d()));
        int j10 = j();
        if (a(j10)) {
            hashMap.put("gmtMinutesOffset", Integer.valueOf(j10));
        }
        String p11 = p();
        if (!TextUtils.isEmpty(p11)) {
            hashMap.put("pluginType", p11);
        }
        String q10 = q();
        if (!TextUtils.isEmpty(q10)) {
            hashMap.put("pluginVersion", q10);
        }
        String o10 = o();
        if (!TextUtils.isEmpty(o10)) {
            hashMap.put("plugin_fw_v", o10);
        }
        String valueOf = String.valueOf(this.L.f());
        if (!TextUtils.isEmpty(valueOf)) {
            hashMap.put("jb", valueOf);
        }
        String m7 = m();
        if (!TextUtils.isEmpty(m7)) {
            hashMap.put(fe.V0, m7);
        }
        String valueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.K));
        if (!TextUtils.isEmpty(valueOf2)) {
            hashMap.put("firstSession", valueOf2);
        }
        String t10 = this.L.t(this.K);
        if (!TextUtils.isEmpty(t10)) {
            hashMap.put("auid", t10);
        }
        hashMap.put("mcc", Integer.valueOf(x8.b(this.K)));
        hashMap.put("mnc", Integer.valueOf(x8.c(this.K)));
        String n11 = this.L.n(this.K);
        if (!TextUtils.isEmpty(n11)) {
            hashMap.put("icc", n11);
        }
        String b11 = this.L.b();
        if (!TextUtils.isEmpty(b11)) {
            hashMap.put("tz", b11);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + hashMap);
        return hashMap;
    }

    private boolean a(int i10) {
        return i10 <= P && i10 >= Q && i10 % 15 == 0;
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            int i10 = Build.VERSION.SDK_INT;
            return "" + i10 + "(" + str + ")";
        } catch (Exception e8) {
            o9.d().a(e8);
            return "";
        }
    }

    private String c() {
        return com.ironsource.mediationsdk.p.m().n();
    }

    private int d() {
        try {
            Intent registerReceiver = this.K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f17017a + ":getBatteryLevel()", e8);
            return -1;
        }
    }

    private String e() {
        try {
            return this.K.getPackageName();
        } catch (Exception e8) {
            o9.d().a(e8);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e8) {
            o9.d().a(e8);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e8) {
            o9.d().a(e8);
            return "";
        }
    }

    private String h() {
        return b9.f16509d;
    }

    private long i() {
        if (s()) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
        }
        return -1L;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f17017a + ":getGmtMinutesOffset()", e8);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
        } catch (Exception e8) {
            o9.d().a(e8);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e8) {
            o9.d().a(e8);
            return "";
        }
    }

    private String m() {
        return com.ironsource.mediationsdk.p.m().q();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.K.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                return !networkOperatorName.equals("") ? networkOperatorName : "";
            }
            return "";
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f17017a + ":getMobileCarrier()", e8);
            return "";
        }
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e8);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e8);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e8);
            return "";
        }
    }

    private String r() {
        return IronSourceUtils.getSDKVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e8) {
            o9.d().a(e8);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ce.a().a(a());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "Thread name = " + getClass().getSimpleName(), e8);
        }
    }
}
