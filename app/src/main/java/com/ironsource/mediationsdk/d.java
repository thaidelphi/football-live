package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.ak;
import com.ironsource.ar;
import com.ironsource.b5;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.f5;
import com.ironsource.fe;
import com.ironsource.m5;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mk;
import com.ironsource.mm;
import com.ironsource.nf;
import com.ironsource.o9;
import com.ironsource.v4;
import com.ironsource.x2;
import com.ironsource.zb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final String f18557c = "auctionId";

    /* renamed from: d  reason: collision with root package name */
    public static final String f18558d = "armData";

    /* renamed from: e  reason: collision with root package name */
    public static final String f18559e = "larmData";

    /* renamed from: f  reason: collision with root package name */
    public static final String f18560f = "isAdUnitCapped";

    /* renamed from: g  reason: collision with root package name */
    public static final String f18561g = "settings";

    /* renamed from: h  reason: collision with root package name */
    public static final String f18562h = "waterfall";

    /* renamed from: i  reason: collision with root package name */
    public static final String f18563i = "genericParams";

    /* renamed from: j  reason: collision with root package name */
    public static final String f18564j = "configurations";

    /* renamed from: k  reason: collision with root package name */
    public static final String f18565k = "instances";

    /* renamed from: l  reason: collision with root package name */
    public static final String f18566l = "${AUCTION_LOSS}";

    /* renamed from: m  reason: collision with root package name */
    public static final String f18567m = "${AUCTION_MBR}";

    /* renamed from: n  reason: collision with root package name */
    public static final String f18568n = "${AUCTION_PRICE}";

    /* renamed from: o  reason: collision with root package name */
    public static final String f18569o = "${DYNAMIC_DEMAND_SOURCE}";

    /* renamed from: p  reason: collision with root package name */
    public static final String f18570p = "${INSTANCE}";

    /* renamed from: q  reason: collision with root package name */
    public static final String f18571q = "${INSTANCE_TYPE}";

    /* renamed from: r  reason: collision with root package name */
    public static final String f18572r = "${PLACEMENT_NAME}";

    /* renamed from: s  reason: collision with root package name */
    private static final String f18573s = "adMarkup";

    /* renamed from: t  reason: collision with root package name */
    private static final String f18574t = "dynamicDemandSource";

    /* renamed from: u  reason: collision with root package name */
    private static final String f18575u = "params";

    /* renamed from: v  reason: collision with root package name */
    public static final String f18576v = "dlpl";

    /* renamed from: w  reason: collision with root package name */
    public static final String f18577w = "adUnit";

    /* renamed from: x  reason: collision with root package name */
    public static final String f18578x = "parallelLoad";

    /* renamed from: y  reason: collision with root package name */
    public static final String f18579y = "bidderExclusive";

    /* renamed from: z  reason: collision with root package name */
    public static final String f18580z = "showPriorityEnabled";

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f18581a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final nf f18582b = mm.S().f();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f18583a;

        /* renamed from: b  reason: collision with root package name */
        private List<m5> f18584b;

        /* renamed from: c  reason: collision with root package name */
        private m5 f18585c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f18586d;

        /* renamed from: e  reason: collision with root package name */
        private JSONObject f18587e;

        /* renamed from: f  reason: collision with root package name */
        private int f18588f;

        /* renamed from: g  reason: collision with root package name */
        private String f18589g;

        /* renamed from: h  reason: collision with root package name */
        private v4 f18590h;

        public a(String str) {
            this.f18583a = str;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            v4 v4Var = this.f18590h;
            return v4Var != null ? v4Var.a(str) : new p.b();
        }

        public String a() {
            return this.f18583a;
        }

        public JSONObject b() {
            return this.f18587e;
        }

        public int c() {
            return this.f18588f;
        }

        public String d() {
            return this.f18589g;
        }

        public m5 e() {
            return this.f18585c;
        }

        public JSONObject f() {
            return this.f18586d;
        }

        public v4 g() {
            return this.f18590h;
        }

        public List<m5> h() {
            return this.f18584b;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class b implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        private static final int f18591d = 15000;

        /* renamed from: a  reason: collision with root package name */
        private String f18592a;

        /* renamed from: b  reason: collision with root package name */
        private String f18593b;

        /* renamed from: c  reason: collision with root package name */
        private String f18594c;

        public b(String str, String str2, String str3) {
            this.f18592a = str;
            this.f18593b = str2;
            this.f18594c = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0057 A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:3:0x0020, B:11:0x0057), top: B:16:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r8.f18592a
                r0.append(r1)
                java.lang.String r1 = ";"
                r0.append(r1)
                java.lang.String r2 = r8.f18593b
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = r8.f18594c
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Exception -> L87
                java.lang.String r3 = r8.f18594c     // Catch: java.lang.Exception -> L87
                r2.<init>(r3)     // Catch: java.lang.Exception -> L87
                java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Exception -> L87
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Exception -> L87
                java.lang.String r3 = "GET"
                r2.setRequestMethod(r3)     // Catch: java.lang.Exception -> L87
                r3 = 15000(0x3a98, float:2.102E-41)
                r2.setReadTimeout(r3)     // Catch: java.lang.Exception -> L87
                r2.setConnectTimeout(r3)     // Catch: java.lang.Exception -> L87
                r2.connect()     // Catch: java.lang.Exception -> L87
                int r3 = r2.getResponseCode()     // Catch: java.lang.Exception -> L87
                java.lang.String r4 = r2.getResponseMessage()     // Catch: java.lang.Exception -> L87
                r2.disconnect()     // Catch: java.lang.Exception -> L87
                r2 = 200(0xc8, float:2.8E-43)
                r5 = 1
                if (r3 == r2) goto L54
                r2 = 204(0xcc, float:2.86E-43)
                if (r3 != r2) goto L52
                goto L54
            L52:
                r2 = 0
                goto L55
            L54:
                r2 = r5
            L55:
                if (r2 != 0) goto Laf
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L87
                r2.<init>()     // Catch: java.lang.Exception -> L87
                java.lang.String r6 = "provider"
                java.lang.String r7 = "Mediation"
                r2.put(r6, r7)     // Catch: java.lang.Exception -> L87
                java.lang.String r6 = "programmatic"
                r2.put(r6, r5)     // Catch: java.lang.Exception -> L87
                java.lang.String r5 = "ext1"
                r2.put(r5, r0)     // Catch: java.lang.Exception -> L87
                java.lang.String r5 = "errorCode"
                r2.put(r5, r3)     // Catch: java.lang.Exception -> L87
                java.lang.String r3 = "reason"
                r2.put(r3, r4)     // Catch: java.lang.Exception -> L87
                com.ironsource.zb r3 = new com.ironsource.zb     // Catch: java.lang.Exception -> L87
                r4 = 81320(0x13da8, float:1.13954E-40)
                r3.<init>(r4, r2)     // Catch: java.lang.Exception -> L87
                com.ironsource.ar r2 = com.ironsource.ar.i()     // Catch: java.lang.Exception -> L87
                r2.a(r3)     // Catch: java.lang.Exception -> L87
                goto Laf
            L87:
                r2 = move-exception
                com.ironsource.o9 r3 = com.ironsource.o9.d()
                r3.a(r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Send auction url failed with params - "
                r3.append(r4)
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r2.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                r1.error(r0)
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.d.b.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        NOT_SECURE,
        SECURE
    }

    private c a() {
        c cVar = c.SECURE;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return cVar;
            }
        } else if (i10 >= 23) {
            if (!((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0)) {
                return cVar;
            }
        }
        return c.NOT_SECURE;
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double parseDouble = Double.parseDouble(str);
        double parseDouble2 = Double.parseDouble(str2);
        return parseDouble2 == 0.0d ? "" : String.valueOf(Math.round((parseDouble / parseDouble2) * 1000.0d) / 1000.0d);
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(optString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f18585c = new m5(jSONObject2);
            r0 = jSONObject2.has(f18558d) ? jSONObject2.optJSONObject(f18558d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f18586d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f18587e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f18565k)) {
                aVar.f18590h = new v4.a(jSONObject2.optJSONObject(f18565k));
            }
        }
        aVar.f18584b = new ArrayList();
        if (jSONObject.has(f18562h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f18562h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                m5 m5Var = new m5(jSONArray.getJSONObject(i10), i10, r0);
                if (!m5Var.m()) {
                    aVar.f18588f = 1002;
                    aVar.f18589g = "waterfall " + i10;
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f18584b.add(m5Var);
            }
        }
        return aVar;
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e8.getMessage());
            return str;
        }
    }

    public String a(String str, int i10, m5 m5Var, String str2, String str3, String str4) {
        String i11 = m5Var.i();
        return a(str, m5Var.c(), i10, b().c(m5Var.k()), i11, b().a(i11, str2), str3, str4);
    }

    public String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f18568n, str4).replace(f18566l, str6).replace(f18567m, str5).replace(f18570p, str2).replace(f18571q, Integer.toString(i10)).replace(f18569o, str3).replace(f18572r, str7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a(i iVar) throws JSONException {
        boolean z10;
        boolean z11;
        ISBannerSize iSBannerSize;
        IronSource.AD_UNIT c10 = iVar.c();
        boolean s10 = iVar.s();
        Map<String, Object> g10 = iVar.g();
        List<String> k10 = iVar.k();
        h e8 = iVar.e();
        int n10 = iVar.n();
        ISBannerSize f10 = iVar.f();
        IronSourceSegment m7 = iVar.m();
        boolean o10 = iVar.o();
        boolean p10 = iVar.p();
        ArrayList<f5> j10 = iVar.j();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = g10.keySet().iterator();
        while (true) {
            z10 = o10;
            z11 = s10;
            String str = "";
            iSBannerSize = f10;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it2 = it;
            JSONObject jSONObject3 = new JSONObject();
            IronSourceSegment ironSourceSegment = m7;
            jSONObject3.put(fe.f17453t0, 2);
            jSONObject3.put(fe.f17426k0, new JSONObject((Map) g10.get(next)));
            if (e8 != null) {
                str = e8.a(next);
            }
            jSONObject3.put(fe.f17462w0, str);
            jSONObject3.put("ts", p10 ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            o10 = z10;
            s10 = z11;
            f10 = iSBannerSize;
            it = it2;
            m7 = ironSourceSegment;
        }
        IronSourceSegment ironSourceSegment2 = m7;
        int i10 = 2;
        for (String str2 : k10) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(fe.f17453t0, 1);
            jSONObject4.put(fe.f17462w0, e8 != null ? e8.a(str2) : "");
            jSONObject2.put(str2, jSONObject4);
        }
        Iterator<f5> it3 = j10.iterator();
        while (it3.hasNext()) {
            f5 next2 = it3.next();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(fe.f17453t0, next2.e() ? i10 : 1);
            Map<String, Object> f11 = next2.f();
            if (!f11.isEmpty()) {
                jSONObject5.put(fe.f17426k0, new JSONObject(f11));
            }
            jSONObject5.put(fe.f17462w0, e8 != null ? e8.a(next2.g()) : "");
            jSONObject5.put("ts", p10 ? 1 : 0);
            if (!next2.h().isEmpty()) {
                jSONObject5.put(f18576v, next2.h());
            }
            jSONObject2.put(next2.g(), jSONObject5);
            i10 = 2;
        }
        jSONObject.put(fe.f17450s0, jSONObject2);
        if (iVar.u()) {
            jSONObject.put(fe.f17451s1, 1);
        }
        if (iVar.r()) {
            jSONObject.put(fe.f17448r1, 1);
        }
        new ak().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject a10 = new b5(x2.a(c10)).a();
        a(a10, false);
        a10.put(fe.f17456u0, n10);
        a10.put(fe.f17459v0, a().ordinal());
        if (ironSourceSegment2 != null) {
            a10.put(fe.f17409e1, ironSourceSegment2.toJson());
        }
        jSONObject.put(fe.f17441p0, a10);
        if (iSBannerSize != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(fe.f17432m0, iSBannerSize.getDescription());
            jSONObject6.put(fe.f17438o0, iSBannerSize.getWidth());
            jSONObject6.put(fe.f17435n0, iSBannerSize.getHeight());
            jSONObject.put(fe.f17429l0, jSONObject6);
        }
        jSONObject.put(fe.f17414g0, c10.toString());
        if (iVar.b() != null) {
            jSONObject.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObject.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.t() != null) {
            jSONObject.put(fe.f17423j0, iVar.t());
        }
        jSONObject.put(fe.f17444q0, !z11);
        Object remove = a10.remove(fe.f17439o1);
        if (remove != null) {
            jSONObject.put(fe.f17439o1, remove);
        }
        if (z10) {
            jSONObject.put(fe.f17433m1, 1);
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(fe.f17415g1)) || !this.f18581a.compareAndSet(false, true)) {
            return;
        }
        ar.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z10, true, -1)));
    }

    public Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e8.getMessage());
        }
        return hashMap;
    }

    public String c(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str) || !mk.a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("parameters = " + jSONObject2);
                if (jSONObject2.has("dynamicDemandSource")) {
                    str2 = jSONObject2.getString("dynamicDemandSource");
                    ironLog.verbose("demand source = " + str2);
                    return str2;
                }
                return "";
            }
            return "";
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("exception " + e8.getMessage());
            return str2;
        }
    }
}
