package com.applovin.impl;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.ironsource.b9;
import com.ironsource.in;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class z1 {

    /* renamed from: g  reason: collision with root package name */
    private static final int f9809g = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f9810a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f9811b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f9812c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d  reason: collision with root package name */
    private final Set f9813d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f9814e;

    /* renamed from: f  reason: collision with root package name */
    protected final com.applovin.impl.sdk.n f9815f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f9816a;

        /* renamed from: com.applovin.impl.z1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0141a implements Thread.UncaughtExceptionHandler {
            C0141a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                a.this.f9816a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    a.this.f9816a.I().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        a(com.applovin.impl.sdk.j jVar) {
            this.f9816a = jVar;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) this.f9816a.a(o4.T)).intValue());
            thread.setUncaughtExceptionHandler(new C0141a());
            return thread;
        }
    }

    public z1(com.applovin.impl.sdk.j jVar) {
        this.f9814e = jVar;
        this.f9815f = jVar.I();
        this.f9811b = Executors.newFixedThreadPool(1, new a(jVar));
    }

    private void c(y1 y1Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (y1Var.a() == y1.b.AD || y1Var.a() == y1.b.USER_SESSION || !d7.a(((Integer) this.f9814e.a(o4.C)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(y1Var, map).openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                int i10 = f9809g;
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod(in.f17849b);
                httpURLConnection.setRequestProperty("AppLovin-Event-Type", y1Var.b());
                int responseCode = httpURLConnection.getResponseCode();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f9815f.a("HealthEventsReporter", y1Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                }
                this.f9812c.put(y1Var, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f9815f.d("HealthEventsReporter", "Failed to report " + y1Var.b() + " with extra parameters " + map, th);
                    }
                    d7.a(httpURLConnection, this.f9814e);
                } finally {
                    d7.a(httpURLConnection, this.f9814e);
                }
            }
        }
    }

    public void a(y1 y1Var, com.applovin.impl.sdk.ad.b bVar) {
        a(y1Var, bVar, new HashMap());
    }

    public void d(y1 y1Var, Map map) {
        a(y1Var, map, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void a(String str, y1 y1Var, JSONObject jSONObject) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = jSONObject.toString().getBytes("UTF-8");
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i10 = f9809g;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestMethod(in.f17849b);
            httpURLConnection.setRequestProperty("AppLovin-Event-Type", y1Var.b());
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9815f;
                nVar.a("HealthEventsReporter", y1Var.b() + " reported with code " + responseCode);
            }
            this.f9812c.put(y1Var, Long.valueOf(System.currentTimeMillis()));
            d7.a(httpURLConnection, this.f9814e);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar2 = this.f9815f;
                    nVar2.d("HealthEventsReporter", "Failed to report " + y1Var.b(), th);
                }
            } finally {
                d7.a(httpURLConnection2, this.f9814e);
            }
        }
    }

    private void d(final y1 y1Var, List list) {
        final String str = (String) this.f9814e.a(o4.D);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double a10 = y1Var.a(this.f9814e);
        if (d7.a(a10)) {
            if (((Boolean) this.f9814e.a(o4.J)).booleanValue()) {
                a(str, y1Var, a(y1Var, a10, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final JSONObject a11 = a(y1Var, a10, Collections.singletonList((Map) it.next()));
                this.f9811b.execute(new Runnable() { // from class: com.applovin.impl.vf
                    @Override // java.lang.Runnable
                    public final void run() {
                        z1.this.a(str, y1Var, a11);
                    }
                });
            }
        }
    }

    public void a(y1 y1Var, com.applovin.impl.sdk.ad.b bVar, Map map) {
        a(y1Var, bVar != null ? bVar.getAdZone() : null, bVar, null, map);
    }

    public void a(y1 y1Var, q qVar, AppLovinError appLovinError) {
        a(y1Var, qVar, null, appLovinError, new HashMap());
    }

    public void a(y1 y1Var, u2 u2Var) {
        a(y1Var, u2Var, new HashMap());
    }

    public void a(y1 y1Var, u2 u2Var, Map map) {
        a(y1Var, u2Var.getFormat(), u2Var.getAdUnitId(), u2Var, null, map);
    }

    public void a(y1 y1Var, u2 u2Var, MaxError maxError) {
        a(y1Var, u2Var.getFormat(), u2Var.getAdUnitId(), u2Var, maxError, new HashMap());
    }

    public void a(y1 y1Var, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        a(y1Var, maxAdFormat, str, null, maxError, new HashMap());
    }

    public void a(String str, String str2, Throwable th) {
        a(str, str2, th, new HashMap());
    }

    public void a(String str, String str2, Throwable th, Map map) {
        a(str + ":" + str2, th, map);
    }

    public void a(String str, Throwable th) {
        a(str, th, new HashMap());
    }

    public void a(String str, Throwable th, Map map) {
        Throwable[] suppressed;
        map.put("source", str);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("source", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), hashMap);
            arrayList.add(hashMap);
        }
        a(y1.f9669h0, arrayList, 0L);
    }

    private Map c(y1 y1Var, Map map) {
        HashMap hashMap = new HashMap(map);
        if (y1Var == y1.f9673j0) {
            hashMap.remove("details");
        }
        return hashMap;
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        hashMap.put("error_message", str2);
        if (bVar != null) {
            hashMap.putAll(a2.b(bVar));
            hashMap.putAll(a2.a(bVar));
            boolean G0 = bVar.G0();
            hashMap.put("is_video_stream", String.valueOf(G0));
            if (G0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).g1(), hashMap);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.Q(), hashMap);
            }
        }
        d(y1.f9679m0, hashMap);
    }

    private Map b(y1 y1Var, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", y1Var.b());
        if (y1Var == y1.f9665f0 || y1Var == y1.f9695u0 || y1Var == y1.f9691s0) {
            if (((Boolean) this.f9814e.a(o4.f8175n4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(d8.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", d8.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", d8.b(), hashMap);
            }
            CollectionUtils.putStringIfValid("oglv", this.f9814e.x().E(), hashMap);
        }
        Map H = this.f9814e.x().H();
        hashMap.put(com.ironsource.fe.G, String.valueOf(H.get(com.ironsource.fe.G)));
        hashMap.put("country_code", String.valueOf(H.get("country_code")));
        hashMap.put("cc", this.f9814e.s().getCountryCode());
        hashMap.put("applovin_random_token", this.f9814e.Z());
        hashMap.put("compass_random_token", this.f9814e.r());
        hashMap.put(com.ironsource.fe.B, Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put(com.ironsource.fe.E, Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", f.b(), hashMap);
        hashMap.put(com.ironsource.fe.f17455u, (String) this.f9814e.a(o4.f8226u));
        b(hashMap);
        a(hashMap);
        if (map != null) {
            hashMap.putAll(c(y1Var, map));
        }
        return hashMap;
    }

    public void a(String str, String str2, int i10, String str3) {
        List a10 = a(str2);
        boolean z10 = a10 != null;
        if (z10 && a10.contains(Integer.valueOf(i10))) {
            return;
        }
        if (z10 || i10 >= 400) {
            String emptyIfNull = StringUtils.emptyIfNull(str3);
            if (emptyIfNull.length() > 1000) {
                emptyIfNull = emptyIfNull.substring(0, 1000);
            }
            HashMap hashMap = new HashMap(4);
            hashMap.put("source", str);
            hashMap.put("url", StringUtils.emptyIfNull(str2));
            hashMap.put("code", String.valueOf(i10));
            hashMap.put("error_message", emptyIfNull);
            d(y1.f9685p0, hashMap);
        }
    }

    public void a(y1 y1Var, String str) {
        a(y1Var, str, new HashMap());
    }

    public void a(y1 y1Var, String str, Map map) {
        map.put("source", str);
        d(y1Var, map);
    }

    public void a(y1 y1Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f9813d.add(str2)) {
            map.put("source", str);
            a(y1Var, str, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.j.m()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.j.m()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L18:
            r3 = r0
        L19:
            r2 = 0
        L1a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.versionName
        L23:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L2c
            int r1 = r2.versionCode
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.z1.b(java.util.Map):void");
    }

    public void a(y1 y1Var, Map map, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(y1Var, arrayList, j10);
    }

    public void a(final y1 y1Var, final List list, long j10) {
        if (a(y1Var, j10)) {
            return;
        }
        try {
            if (d7.h()) {
                this.f9811b.execute(new Runnable() { // from class: com.applovin.impl.uf
                    @Override // java.lang.Runnable
                    public final void run() {
                        z1.this.b(y1Var, list);
                    }
                });
            } else {
                b(y1Var, list);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9815f;
                nVar.d("HealthEventsReporter", "Failed to report " + y1Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    private void a(y1 y1Var, q qVar, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.f9814e.a(o4.K)).booleanValue() && this.f9814e.y0()) {
            return;
        }
        if (bVar != null) {
            map.putAll(a2.b(bVar));
        }
        if (qVar != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", qVar.e(), map);
            MaxAdFormat d10 = qVar.d();
            if (d10 != null) {
                CollectionUtils.putStringIfValid("ad_format", d10.getLabel(), map);
            }
        }
        AppLovinAdSize a10 = a(qVar, bVar);
        if (a10 != null) {
            CollectionUtils.putStringIfValid("ad_size", a10.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        d(y1Var, map);
    }

    private void a(y1 y1Var, MaxAdFormat maxAdFormat, String str, u2 u2Var, MaxError maxError, Map map) {
        if (u2Var != null) {
            map.putAll(a2.a(u2Var));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            CollectionUtils.putStringIfValid("error_message", maxError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(maxError.getCode()), map);
            CollectionUtils.putStringIfValid("mediated_network_error_message", maxError.getMediatedNetworkErrorMessage(), map);
            CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(maxError.getMediatedNetworkErrorCode()), map);
        }
        d(y1Var, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void b(y1 y1Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f9815f;
            nVar.a("HealthEventsReporter", "Reporting " + y1Var.b() + " with extra parameters collection " + list);
        }
        c(y1Var, list);
        d(y1Var, list);
    }

    private URL a(y1 y1Var, Map map) {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb.append("?");
        Iterator it = b(y1Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String encode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb.append(encode);
            sb.append(b9.i.f16692b);
            sb.append(encode2);
            if (it.hasNext()) {
                sb.append(b9.i.f16694c);
            }
        }
        return new URL(sb.toString());
    }

    private JSONObject a(y1 y1Var, double d10, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (y1Var == y1.f9665f0 || y1Var == y1.f9695u0 || y1Var == y1.f9691s0) {
            if (((Boolean) this.f9814e.a(o4.f8175n4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(d8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", d8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", d8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f9814e.x().E());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map H = this.f9814e.x().H();
        JsonUtils.putObject(jSONObject2, com.ironsource.fe.G, H.get(com.ironsource.fe.G));
        JsonUtils.putObject(jSONObject2, com.ironsource.fe.E, H.get(com.ironsource.fe.E));
        JsonUtils.putObject(jSONObject2, "brand", H.get("brand"));
        JsonUtils.putObject(jSONObject2, com.ironsource.fe.B, H.get(com.ironsource.fe.B));
        JsonUtils.putObject(jSONObject2, "revision", H.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", H.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f9814e.s().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f9814e.Z());
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(f.b()));
        Map B = this.f9814e.x().B();
        JsonUtils.putObject(jSONObject2, "sdk_version", B.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f9814e.a(o4.J3));
        JsonUtils.putObject(jSONObject2, "app_version", B.get("app_version"));
        JsonUtils.putObject(jSONObject2, b9.h.V, B.get(b9.h.V));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) B.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, com.ironsource.fe.f17455u, this.f9814e.a(o4.f8226u));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f9814e.N());
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", y1Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d10);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object a10 = this.f9814e.B().a();
        if (a10 instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) a10).getAdIdNumber()));
        } else if (a10 instanceof u2) {
            u2 u2Var = (u2) a10;
            map.put("fs_ad_network", u2Var.getNetworkName());
            map.put("fs_ad_creative_id", u2Var.getCreativeId());
        } else {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
        }
    }

    private boolean a(y1 y1Var, long j10) {
        Long l10 = (Long) this.f9812c.get(y1Var);
        return System.currentTimeMillis() - (l10 != null ? l10.longValue() : -1L) < j10;
    }

    public void a() {
        this.f9810a = JsonUtils.deserialize((String) this.f9814e.a(o4.L));
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f9810a, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f9810a, RewardedVideo.VIDEO_MODE_DEFAULT, null) : integerList;
    }

    private AppLovinAdSize a(q qVar, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize f10 = qVar != null ? qVar.f() : null;
        if (f10 != null) {
            return f10;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }
}
