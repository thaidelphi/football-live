package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.b9;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class d7 {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f6814a = {60, 60, 24, 7, 4, 12};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f6815b = {" second", " minute", " hour", " day", " week", " month"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f6816c = {"s", "m", "h", "d", "w", "mth"};

    /* renamed from: d  reason: collision with root package name */
    private static final DecimalFormat f6817d = new DecimalFormat();

    /* renamed from: e  reason: collision with root package name */
    private static final Random f6818e = new Random();

    /* renamed from: f  reason: collision with root package name */
    private static Boolean f6819f;

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f6820g;

    /* renamed from: h  reason: collision with root package name */
    private static String f6821h;

    /* renamed from: i  reason: collision with root package name */
    private static Boolean f6822i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    public static double a(long j10) {
        return j10 / 1024.0d;
    }

    public static int a(int i10, int i11) {
        return (i10 < 0 || i10 > 100) ? i11 : i10;
    }

    public static String a(Map map, boolean z10) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z10) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(b9.i.f16694c);
            }
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.contains(b9.i.f16694c)) {
                    value = str.replace(b9.i.f16694c, "%26");
                }
            }
            sb.append(entry.getKey());
            sb.append(com.ironsource.cc.T);
            sb.append(value);
        }
        return sb.toString();
    }

    public static void a() {
    }

    public static boolean a(long j10, long j11) {
        return (j10 & j11) != 0;
    }

    public static float b(float f10) {
        return f10 * 1000.0f;
    }

    public static int b(int i10) {
        return i10 * 1024;
    }

    public static long b(long j10) {
        return j10 * 8;
    }

    public static void b() {
    }

    public static void b(String str, String str2) {
        if (str == null || str.length() <= b(8)) {
            return;
        }
        com.applovin.impl.sdk.n.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + b(8) + " maximum)");
    }

    public static long c(float f10) {
        return a(b(f10));
    }

    public static void c() {
    }

    public static double d(long j10) {
        return j10 / 1000.0d;
    }

    public static long d(String str) {
        if (StringUtils.isValidString(str)) {
            try {
                return Color.parseColor(str);
            } catch (Throwable unused) {
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    public static String e(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static int f(String str) {
        String[] split;
        int i10 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.n.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i10;
            }
            i10 = (i10 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i10 * 100) + 99 : i10;
    }

    public static boolean g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    public static boolean h() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean i() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:2:0x0000, B:3:0x0004, B:5:0x000a, B:7:0x001c, B:9:0x0024), top: B:17:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j() {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L2e
        L4:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L2e
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getDisplayName()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "tun"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ppp"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ipsec"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L4
        L2c:
            r0 = 1
            return r0
        L2e:
            r0 = move-exception
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "Unable to check Network Interfaces"
            com.applovin.impl.sdk.n.c(r1, r2, r0)
        L36:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d7.j():boolean");
    }

    public static boolean k() {
        Context m7 = com.applovin.impl.sdk.j.m();
        if (m7 != null) {
            return u.a(m7).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static double c(long j10) {
        return a(b(j10));
    }

    public static boolean h(Context context) {
        if (f6820g == null) {
            f6820g = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return f6820g.booleanValue();
    }

    public static boolean i(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static String b(Class cls, String str) {
        try {
            Field a10 = a(cls, str);
            a10.setAccessible(true);
            return (String) a10.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    public static String e() {
        Field[] fields;
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static boolean k(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.j.m();
        }
        if (context != null) {
            return u.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static boolean c(com.applovin.impl.sdk.j jVar) {
        String str = jVar.f0().getExtraParameters().get("run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.j.m().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Boolean g(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = f6822i;
        if (bool != null) {
            return bool;
        }
        try {
            String a10 = u.a(context).a();
            String b10 = b(context);
            if (b10 == null) {
                return null;
            }
            if (b10.equals(a10)) {
                Boolean bool2 = Boolean.TRUE;
                f6822i = bool2;
                return bool2;
            } else if (TextUtils.isEmpty(a10) && b10.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                f6822i = bool3;
                return bool3;
            } else {
                Boolean bool4 = Boolean.FALSE;
                f6822i = bool4;
                return bool4;
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    public static void b(AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            String a02 = jVar.a0();
            String a03 = appLovinAdBase.getSdk().a0();
            if (a02.equals(a03)) {
                return;
            }
            String str = "Ad was loaded from sdk with key: " + a03 + ", but is being rendered from sdk with key: " + a02;
            com.applovin.impl.sdk.n.h("AppLovinAd", str);
            jVar.C().c(v1.f9443q);
            a(str, appLovinAdBase, "AppLovinAd", jVar);
        }
    }

    public static boolean e(Context context) {
        return u.a(context).a("applovin.sdk.is_test_environment");
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
    }

    public static boolean e(com.applovin.impl.sdk.j jVar) {
        if (((Boolean) jVar.a(o4.f8173n2)).booleanValue()) {
            return jVar.f0().isMuted();
        }
        return ((Boolean) jVar.a(o4.f8157l2)).booleanValue();
    }

    public static boolean f(Context context) {
        if (f6819f == null) {
            f6819f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f6819f.booleanValue();
    }

    public static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    public static int f() {
        if (l0.b()) {
            return WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
        }
        return 0;
    }

    public static boolean d(com.applovin.impl.sdk.j jVar) {
        String str = jVar.f0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static Map a(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    private static long b(String str) {
        if (str == null) {
            return 0L;
        }
        return new File(str).length();
    }

    public static Context d(Context context) {
        return j(context) ? context : com.applovin.impl.sdk.j.m();
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static boolean b(com.applovin.impl.sdk.j jVar) {
        if (l0.e()) {
            try {
                JSONObject.wrap(JSONObject.NULL);
                return true;
            } catch (Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().d("Utils", "Failed to wrap JSONObject with exception", th);
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    public static int a(int i10) {
        return a(i10, 95);
    }

    public static boolean b(List list) {
        Context m7 = com.applovin.impl.sdk.j.m();
        if (m7 == null) {
            com.applovin.impl.sdk.n.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(m7.getPackageName());
    }

    public static long a(com.applovin.impl.sdk.j jVar) {
        long longValue = ((Long) jVar.a(o4.f8176n5)).longValue();
        long longValue2 = ((Long) jVar.a(o4.f8184o5)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : currentTimeMillis + (longValue - longValue2);
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
    }

    public static void a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static String b(Context context) {
        int myPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(f6821h)) {
            return f6821h;
        }
        try {
            myPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to determine process name", th);
        }
        if (runningAppProcesses == null) {
            com.applovin.impl.sdk.n.c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (myPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                f6821h = str;
                return str;
            }
        }
        return null;
    }

    private static long a(float f10) {
        return Math.round(f10);
    }

    public static String a(long j10, boolean z10) {
        String[] strArr = z10 ? f6815b : f6816c;
        long currentTimeMillis = (System.currentTimeMillis() - j10) / 1000;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            long j11 = f6814a[i10];
            if (currentTimeMillis < j11) {
                if (currentTimeMillis <= 0) {
                    return z10 ? "just now" : "now";
                }
                return String.format("%d%s%s%s", Long.valueOf(currentTimeMillis), strArr[i10], (!z10 || currentTimeMillis <= 1) ? "" : "s", z10 ? " ago" : "");
            }
            currentTimeMillis /= j11;
        }
        return z10 ? "just now" : "now";
    }

    public static double a(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to parse double from String: " + str, th);
            return d10;
        }
    }

    public static String a(Uri uri, String str, com.applovin.impl.sdk.j jVar) {
        List c10 = jVar.c(o4.I0);
        String lastPathSegment = uri.getLastPathSegment();
        if (c10.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String encodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) jVar.a(o4.J0);
        int length = StringUtils.emptyIfNull(encodeUriString).length() + StringUtils.emptyIfNull(str).length();
        if (length > num.intValue() && StringUtils.isValidString(encodeUriString)) {
            encodeUriString = encodeUriString.substring(length - num.intValue());
        }
        if (StringUtils.isValidString(encodeUriString) && StringUtils.isValidString(str)) {
            return str + encodeUriString;
        }
        return encodeUriString;
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder sb = new StringBuilder();
            sb.append("\n**************************************************\nNO FILL received:\n..ID: \"");
            sb.append(str);
            sb.append("\"\n..FORMAT: \"");
            sb.append(maxAdFormat != null ? maxAdFormat.getLabel() : "None");
            sb.append("\"\n..SDK KEY: \"");
            sb.append(jVar.a0());
            sb.append("\"\n..PACKAGE NAME: \"");
            sb.append(com.applovin.impl.sdk.j.m().getPackageName());
            sb.append("\"\n..Reason: ");
            sb.append(object);
            sb.append("\n**************************************************\n");
            String sb2 = sb.toString();
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("AppLovinSdk", sb2);
            }
        }
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, com.applovin.impl.sdk.j jVar) {
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.c) {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd;
            AppLovinAd dequeueAd = jVar.j().dequeueAd(cVar.getAdZone());
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = jVar.I();
                I.a("Utils", "Dequeued ad for dummy ad: " + dequeueAd);
            }
            if (dequeueAd != null) {
                cVar.a(dequeueAd);
                ((AppLovinAdImpl) dequeueAd).setDummyAd(cVar);
                return dequeueAd;
            }
            return cVar.f();
        }
        return appLovinAd;
    }

    public static q a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        return q.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, "zone_id", null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, com.applovin.impl.sdk.j jVar) {
        return a(jSONObject, str, null, str2, null, false, jVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z10, com.applovin.impl.sdk.j jVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z10, jVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z10, com.applovin.impl.sdk.j jVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new e(str, null, map2, z10));
        }
        if (jSONObject.length() <= 0) {
            return arrayList;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    String optString = jSONObject.optString(next);
                    String replace = StringUtils.replace(next, map);
                    if (AppLovinSdkUtils.isValidString(optString)) {
                        optString = StringUtils.replace(optString, map);
                    }
                    arrayList.add(new e(replace, optString, map2, z10));
                }
            } catch (Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static void a(com.applovin.impl.sdk.j jVar, String str) {
        String a02 = jVar.a0();
        if (((Boolean) jVar.a(o4.B)).booleanValue()) {
            if (a02 == null || a02.length() != 86) {
                a(TextUtils.isEmpty(a02) ? "Empty SDK key" : "Invalid SDK key length", str, jVar);
            }
        }
    }

    private static void a(String str, String str2, com.applovin.impl.sdk.j jVar) {
        a(str, (AppLovinAdBase) null, str2, jVar);
    }

    private static void a(String str, AppLovinAdBase appLovinAdBase, String str2, com.applovin.impl.sdk.j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("sdkKey=");
        sb.append(jVar.a0());
        if (appLovinAdBase != null) {
            sb.append(",adSdkKey=");
            sb.append(appLovinAdBase.getSdk().a0());
        }
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("details", sb.toString(), hashMap);
        CollectionUtils.putStringIfValid("error_message", str, hashMap);
        jVar.D().a(y1.f9677l0, str2, hashMap);
    }

    public static Map a(Map map, com.applovin.impl.sdk.j jVar) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static String a(Context context, String str, com.applovin.impl.sdk.j jVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities.isEmpty()) {
                return null;
            }
            return queryIntentActivities.get(0).activityInfo.name;
        } catch (Throwable th) {
            jVar.D().a(str, th);
            return null;
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.j jVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = jVar.I();
                    I.a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.j jVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = jVar.I();
                    I.a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static void a(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.x9
            @Override // java.lang.Runnable
            public final void run() {
                d7.a(context, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setMargin(0.0f, 0.1f);
        makeText.show();
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    public static String a(Object obj) {
        if (obj instanceof u2) {
            return ((u2) obj).S();
        }
        if (o3.a(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).I();
        }
        return null;
    }

    public static List a(boolean z10, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar, Context context) {
        boolean z11;
        if (bVar instanceof e7) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(bVar.i()).iterator();
        while (true) {
            z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Uri uri = (Uri) it.next();
            boolean c10 = jVar.A().c(uri.getLastPathSegment(), context);
            if (!((Boolean) jVar.a(o4.f8272z5)).booleanValue() || b(uri.getPath()) != 0) {
                z11 = false;
            }
            if (!c10 || z11) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("Utils", "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        Uri q02 = bVar.q0();
        if (z10 && q02 != null) {
            boolean c11 = jVar.A().c(q02.getLastPathSegment(), context);
            if (!((Boolean) jVar.a(o4.f8272z5)).booleanValue() || b(q02.getPath()) != 0) {
                z11 = false;
            }
            if (!c11 || z11) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().b("Utils", "Cached video missing: " + q02);
                }
                arrayList.add(q02);
            }
        }
        return arrayList;
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append("\nFailed to load " + str + " from " + name + ":\n");
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        a("", sb.toString(), context);
    }

    public static void a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(17039370, (DialogInterface.OnClickListener) null).create().show();
    }

    public static boolean a(double d10) {
        if (d10 >= 100.0d) {
            return true;
        }
        return d10 > 0.0d && ((double) f6818e.nextFloat()) < d10 / 100.0d;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static long a(byte[] bArr, int i10) {
        int i11 = i10 + 8;
        if (bArr.length >= i11) {
            long j10 = 0;
            while (i10 < i11) {
                j10 |= (bArr[i10] & 255) << (i10 * 8);
                i10++;
            }
            return j10;
        }
        throw new IllegalArgumentException("byte array must be at least 8 bytes long");
    }

    public static int a(Context context) {
        l0.d();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static int a(String str, String str2) {
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            String[] split = digitsOnlyVersionString.split("\\.");
            String[] split2 = digitsOnlyVersionString2.split("\\.");
            int max = Math.max(split.length, split2.length);
            for (int i10 = 0; i10 < max; i10++) {
                String str3 = StringUtils.isValidString(split[i10]) ? split[i10] : "0";
                String str4 = StringUtils.isValidString(split2[i10]) ? split2[i10] : "0";
                int parseInt = Integer.parseInt(str3);
                int parseInt2 = Integer.parseInt(str4);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
            }
            return 0;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static WebView a(Context context, String str, boolean z10) {
        try {
            WebView webView = new WebView(context);
            if (z10) {
                webView.setWebViewClient(new k4());
            }
            return webView;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static void a(Uri uri, Activity activity, com.applovin.impl.sdk.j jVar) {
        if (activity == null) {
            activity = jVar.m0();
        }
        Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, jVar.a0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static String a(int i10, Context context, com.applovin.impl.sdk.j jVar) {
        if (i10 == 0) {
            return "";
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i10);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e8) {
                if (jVar != null) {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.I().a("Utils", "Opening raw resource file threw exception", e8);
                    }
                }
                return "";
            } finally {
                a(openRawResource, jVar);
            }
        } catch (Throwable th) {
            if (jVar != null) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = jVar.I();
                    I.a("Utils", "Failed to retrieve resource " + i10, th);
                }
            }
            return "";
        }
    }

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && ((!maxAdFormat.isAdViewAd() || !maxAdFormat2.isAdViewAd()) && (!maxAdFormat.isFullscreenAd() || !maxAdFormat2.isFullscreenAd())))) ? false : true;
    }

    public static boolean a(String str, com.applovin.impl.sdk.j jVar) {
        if (str == null) {
            return false;
        }
        return StringUtils.containsAtLeastOneSubstring(str, jVar.c(o4.f8267z0));
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static String a(AppLovinSdkSettings appLovinSdkSettings) {
        String emptyIfNull = StringUtils.emptyIfNull(appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (TextUtils.isEmpty(emptyIfNull)) {
            return null;
        }
        Map<String, String> tryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(emptyIfNull, new JSONObject()));
        if (CollectionUtils.isEmpty(tryToStringMap)) {
            return null;
        }
        return tryToStringMap.get("UnityVersion");
    }

    public static void a(String str, int i10, int i11, z1 z1Var) {
        if (i10 > i11) {
            z1Var.a(y1.f9681n0, str, CollectionUtils.hashMap("details", i10 + " Leaking Instances"));
        }
    }
}
