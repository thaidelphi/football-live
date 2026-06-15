package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.bg;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.s8;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class ls {
    protected static final boolean A = false;
    protected static final String A0 = "sharedManagersThread";
    protected static final String A1 = "spId";
    protected static final int B = 60;
    protected static final String B0 = "parallelLoad";
    protected static final String B1 = "mpis";
    protected static final int C = 10000;
    protected static final String C0 = "bidderExclusive";
    protected static final String C1 = "auction";
    protected static final int D = 10000;
    protected static final String D0 = "adapterTimeOutInSeconds";
    protected static final String D1 = "auctionData";
    protected static final int E = -1;
    protected static final String E0 = "atim";
    protected static final String E1 = "auctioneerURL";
    protected static final int F = 5000;
    protected static final String F0 = "bannerInterval";
    protected static final String F1 = "extAuctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "isOneFlow";
    protected static final String G1 = "objectPerWaterfall";
    protected static final int H = 3;
    protected static final String H0 = "expiredDurationInMinutes";
    protected static final String H1 = "minTimeBeforeFirstAuction";
    protected static final int I = 3;
    protected static final String I0 = "server";
    protected static final String I1 = "timeToWaitBeforeAuction";
    protected static final int J = 0;
    protected static final String J0 = "publisher";
    protected static final String J1 = "timeToWaitBeforeLoad";
    protected static final int K = 2;
    protected static final String K0 = "console";
    protected static final String K1 = "auctionRetryInterval";
    protected static final int L = 15;
    protected static final String L0 = "sendUltraEvents";
    protected static final String L1 = "isLoadWhileShow";
    protected static final long M = 10000;
    protected static final String M0 = "sendEventsToggle";
    protected static final String M1 = "auctionTrials";
    protected static final long N = 3000;
    protected static final String N0 = "eventsCompression";
    protected static final String N1 = "auctionTimeout";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompressionLevel";
    protected static final String O1 = "auctionSavedHistory";
    protected static final boolean P = false;
    protected static final String P0 = "serverEventsURL";
    protected static final String P1 = "disableLoadWhileShowSupportFor";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsType";
    protected static final String Q1 = "tokenPerAdapter";
    protected static final int R = -1;
    protected static final String R0 = "backupThreshold";
    protected static final String R1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final int S = 5000;
    protected static final String S0 = "maxNumberOfEvents";
    protected static final String S1 = "compressAuctionRequest";
    protected static final int T = 1;
    protected static final String T0 = "maxEventsPerBatch";
    protected static final String T1 = "compressAuctionResponse";
    protected static final boolean U = false;
    protected static final String U0 = "optOut";
    protected static final String U1 = "encryptionVersion";
    protected static final int V = 15000;
    protected static final String V0 = "optIn";
    protected static final String V1 = "shouldSendBannerBURLFromImpression";
    protected static final int W = 15000;
    protected static final String W0 = "triggerEvents";
    protected static final String W1 = "impressionTimeout";
    protected static final String X = "providerOrder";
    protected static final String X0 = "nonConnectivityEvents";
    protected static final String X1 = "optInKeys";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Y1 = "tokenGenericParams";
    protected static final String Z = "configurations";
    protected static final String Z0 = "pixel";
    protected static final String Z1 = "compressToken";

    /* renamed from: a0  reason: collision with root package name */
    protected static final String f18264a0 = "genericParams";

    /* renamed from: a1  reason: collision with root package name */
    protected static final String f18265a1 = "pixelEventsUrl";

    /* renamed from: a2  reason: collision with root package name */
    protected static final String f18266a2 = "compressExternalToken";

    /* renamed from: b0  reason: collision with root package name */
    protected static final String f18267b0 = "adUnits";

    /* renamed from: b1  reason: collision with root package name */
    protected static final String f18268b1 = "pixelEventsEnabled";

    /* renamed from: b2  reason: collision with root package name */
    protected static final String f18269b2 = "instanceType";

    /* renamed from: c0  reason: collision with root package name */
    protected static final String f18270c0 = "providerLoadName";

    /* renamed from: c1  reason: collision with root package name */
    protected static final String f18271c1 = "placements";

    /* renamed from: c2  reason: collision with root package name */
    protected static final String f18272c2 = "maxAdsPerSession";

    /* renamed from: d0  reason: collision with root package name */
    protected static final String f18273d0 = "application";

    /* renamed from: d1  reason: collision with root package name */
    protected static final String f18274d1 = "placementId";

    /* renamed from: d2  reason: collision with root package name */
    protected static final String f18275d2 = "reward";

    /* renamed from: e0  reason: collision with root package name */
    protected static final String f18276e0 = "rewardedVideo";

    /* renamed from: e1  reason: collision with root package name */
    protected static final String f18277e1 = "placementName";

    /* renamed from: e2  reason: collision with root package name */
    protected static final String f18278e2 = "name";

    /* renamed from: f0  reason: collision with root package name */
    protected static final String f18279f0 = "interstitial";

    /* renamed from: f1  reason: collision with root package name */
    protected static final String f18280f1 = "delivery";

    /* renamed from: f2  reason: collision with root package name */
    protected static final String f18281f2 = "amount";

    /* renamed from: g0  reason: collision with root package name */
    protected static final String f18282g0 = "banner";

    /* renamed from: g1  reason: collision with root package name */
    protected static final String f18283g1 = "isDefault";

    /* renamed from: g2  reason: collision with root package name */
    protected static final String f18284g2 = "bannerRefreshRate";

    /* renamed from: h0  reason: collision with root package name */
    protected static final String f18285h0 = "nativeAd";

    /* renamed from: h1  reason: collision with root package name */
    protected static final String f18286h1 = "capping";

    /* renamed from: h2  reason: collision with root package name */
    protected static final String f18287h2 = "protocolVersion";

    /* renamed from: i0  reason: collision with root package name */
    protected static final String f18288i0 = "integration";

    /* renamed from: i1  reason: collision with root package name */
    protected static final String f18289i1 = "pacing";

    /* renamed from: i2  reason: collision with root package name */
    protected static final String f18290i2 = "adFormats";

    /* renamed from: j0  reason: collision with root package name */
    protected static final String f18291j0 = "loggers";

    /* renamed from: j1  reason: collision with root package name */
    protected static final String f18292j1 = "enabled";

    /* renamed from: j2  reason: collision with root package name */
    protected static final String f18293j2 = "adUnits";

    /* renamed from: k0  reason: collision with root package name */
    protected static final String f18294k0 = "segment";

    /* renamed from: k1  reason: collision with root package name */
    protected static final String f18295k1 = "maxImpressions";

    /* renamed from: k2  reason: collision with root package name */
    protected static final String f18296k2 = "rewarded";

    /* renamed from: l  reason: collision with root package name */
    public static final String f18297l = "appKey";

    /* renamed from: l0  reason: collision with root package name */
    protected static final String f18298l0 = "events";

    /* renamed from: l1  reason: collision with root package name */
    protected static final String f18299l1 = "numOfSeconds";

    /* renamed from: m  reason: collision with root package name */
    public static final String f18300m = "userId";

    /* renamed from: m0  reason: collision with root package name */
    protected static final String f18301m0 = "crashReporter";

    /* renamed from: m1  reason: collision with root package name */
    protected static final String f18302m1 = "unit";

    /* renamed from: n  reason: collision with root package name */
    public static final String f18303n = "response";

    /* renamed from: n0  reason: collision with root package name */
    protected static final String f18304n0 = "token";

    /* renamed from: n1  reason: collision with root package name */
    protected static final String f18305n1 = "virtualItemName";

    /* renamed from: o  reason: collision with root package name */
    protected static final String f18306o = "error";

    /* renamed from: o0  reason: collision with root package name */
    protected static final String f18307o0 = "external";

    /* renamed from: o1  reason: collision with root package name */
    protected static final String f18308o1 = "virtualItemCount";

    /* renamed from: p  reason: collision with root package name */
    protected static final int f18309p = 3;

    /* renamed from: p0  reason: collision with root package name */
    protected static final String f18310p0 = "mediationTypes";

    /* renamed from: p1  reason: collision with root package name */
    protected static final String f18311p1 = "uuidEnabled";

    /* renamed from: q  reason: collision with root package name */
    protected static final boolean f18312q = false;

    /* renamed from: q0  reason: collision with root package name */
    protected static final String f18313q0 = "providerDefaultInstance";

    /* renamed from: q1  reason: collision with root package name */
    protected static final String f18314q1 = "abt";

    /* renamed from: r  reason: collision with root package name */
    protected static final boolean f18315r = true;

    /* renamed from: r0  reason: collision with root package name */
    protected static final String f18316r0 = "testSuite";

    /* renamed from: r1  reason: collision with root package name */
    protected static final String f18317r1 = "delayLoadFailure";

    /* renamed from: s  reason: collision with root package name */
    protected static final boolean f18318s = true;

    /* renamed from: s0  reason: collision with root package name */
    protected static final String f18319s0 = "controllerUrl";

    /* renamed from: s1  reason: collision with root package name */
    protected static final String f18320s1 = "keysToInclude";

    /* renamed from: t  reason: collision with root package name */
    protected static final int f18321t = 2;

    /* renamed from: t0  reason: collision with root package name */
    protected static final String f18322t0 = "AdQuality";

    /* renamed from: t1  reason: collision with root package name */
    protected static final String f18323t1 = "reporterURL";

    /* renamed from: u  reason: collision with root package name */
    protected static final int f18324u = 2;

    /* renamed from: u0  reason: collision with root package name */
    protected static final String f18325u0 = "initSDK";

    /* renamed from: u1  reason: collision with root package name */
    protected static final String f18326u1 = "reporterKeyword";

    /* renamed from: v  reason: collision with root package name */
    protected static final int f18327v = 1;

    /* renamed from: v0  reason: collision with root package name */
    protected static final String f18328v0 = "settings";

    /* renamed from: v1  reason: collision with root package name */
    protected static final String f18329v1 = "includeANR";

    /* renamed from: w  reason: collision with root package name */
    protected static final int f18330w = 1;

    /* renamed from: w0  reason: collision with root package name */
    protected static final String f18331w0 = "collectBiddingDataTimeout";

    /* renamed from: w1  reason: collision with root package name */
    protected static final String f18332w1 = "timeout";

    /* renamed from: x  reason: collision with root package name */
    protected static final boolean f18333x = true;

    /* renamed from: x0  reason: collision with root package name */
    protected static final String f18334x0 = "providers";

    /* renamed from: x1  reason: collision with root package name */
    protected static final String f18335x1 = "setIgnoreDebugger";

    /* renamed from: y  reason: collision with root package name */
    protected static final boolean f18336y = false;

    /* renamed from: y0  reason: collision with root package name */
    protected static final String f18337y0 = "parallelInit";

    /* renamed from: y1  reason: collision with root package name */
    protected static final String f18338y1 = "adSourceName";

    /* renamed from: z  reason: collision with root package name */
    protected static final boolean f18339z = false;

    /* renamed from: z0  reason: collision with root package name */
    protected static final String f18340z0 = "waitUntilAllProvidersFinishInit";

    /* renamed from: z1  reason: collision with root package name */
    protected static final String f18341z1 = "providerNetworkKey";

    /* renamed from: a  reason: collision with root package name */
    private aq f18342a;

    /* renamed from: b  reason: collision with root package name */
    private cq f18343b;

    /* renamed from: c  reason: collision with root package name */
    private s8 f18344c;

    /* renamed from: d  reason: collision with root package name */
    private String f18345d;

    /* renamed from: e  reason: collision with root package name */
    private String f18346e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f18347f;

    /* renamed from: g  reason: collision with root package name */
    private Context f18348g;

    /* renamed from: h  reason: collision with root package name */
    private a f18349h;

    /* renamed from: i  reason: collision with root package name */
    private bg.a f18350i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f18351j;

    /* renamed from: k  reason: collision with root package name */
    private mc f18352k;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER(CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        

        /* renamed from: a  reason: collision with root package name */
        private final String f18357a;

        a(String str) {
            this.f18357a = str;
        }

        public String a() {
            return this.f18357a;
        }
    }

    public ls(Context context, String str, String str2, String str3) {
        this.f18349h = a.NOT_SET;
        this.f18351j = false;
        this.f18348g = context;
        this.f18350i = mm.M().m();
        try {
            this.f18347f = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            this.f18351j = n();
            s();
            q();
            r();
            this.f18345d = TextUtils.isEmpty(str) ? "" : str;
            this.f18346e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f18347f);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            a();
        }
    }

    public ls(ls lsVar) {
        this.f18349h = a.NOT_SET;
        this.f18351j = false;
        try {
            this.f18348g = lsVar.d();
            this.f18347f = new JSONObject(lsVar.f18347f.toString());
            this.f18345d = lsVar.f18345d;
            this.f18346e = lsVar.f18346e;
            this.f18351j = lsVar.f18351j;
            this.f18342a = lsVar.j();
            this.f18343b = lsVar.k();
            this.f18344c = lsVar.c();
            this.f18349h = lsVar.h();
            this.f18350i = mm.M().m();
            b(this.f18347f);
        } catch (Exception e8) {
            o9.d().a(e8);
            a();
        }
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int i11 = 0;
        if (jSONObject.has(str)) {
            i11 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i11 = jSONObject2.optInt(str, 0);
        }
        return i11 == 0 ? i10 : i11;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j10) {
        long optLong = jSONObject.has(str) ? jSONObject.optLong(str, 0L) : jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        return optLong == 0 ? j10 : optLong;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.lp a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.lp$b r1 = new com.ironsource.lp$b
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.pp r7 = com.ironsource.pp.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.pp r7 = com.ironsource.pp.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.a(r3, r0)
        L74:
            com.ironsource.lp r10 = r1.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.ls.a(org.json.JSONObject):com.ironsource.lp");
    }

    public static a a(ls lsVar) {
        return lsVar != null ? lsVar.h() : a.NOT_SET;
    }

    private String a(String str) {
        try {
            JSONObject c10 = c(c(c(c(this.f18347f, "configurations"), "adFormats"), str), y2.f21466c);
            if (c10 != null) {
                Iterator<String> keys = c10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject c11 = c(c10, next);
                    if (c11 != null && c11.optBoolean(f18283g1)) {
                        return next;
                    }
                }
                return null;
            }
            return null;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return null;
        }
    }

    private void a() {
        this.f18347f = new JSONObject();
        this.f18345d = "";
        this.f18346e = "";
        this.f18342a = new aq();
        this.f18343b = cq.c();
        this.f18344c = new s8.a().a();
        this.f18350i = mm.M().m();
        b(this.f18347f);
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z10) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z10) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z10) : z10;
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int[] iArr = new int[optJSONArray.length()];
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                iArr[i10] = optJSONArray.optInt(i10);
            }
            return iArr;
        }
        return null;
    }

    public static dv b(ls lsVar) {
        return (lsVar == null || !lsVar.p()) ? dv.a() : lsVar.c().b().j();
    }

    private String b() {
        return this.f18351j ? "adFormats" : y2.f21466c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (this.f18351j) {
            JSONObject c10 = c(jSONObject, str);
            String a10 = a(str);
            if (c10 == null || a10 == null) {
                return null;
            }
            return c10.optJSONArray(a10);
        }
        return jSONObject.optJSONArray(str);
    }

    private void b(JSONObject jSONObject) {
        this.f18352k = new mc(jSONObject.optJSONObject(tr.f20860d));
    }

    private boolean b(String str) {
        return this.f18343b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private g1 c(JSONObject jSONObject) {
        g1 g1Var = new g1();
        JSONObject c10 = c(jSONObject, "AdQuality");
        if (c10 != null) {
            g1Var.a(c10.optBoolean(f18325u0));
        }
        return g1Var;
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private Context d() {
        return this.f18348g;
    }

    private h7 d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f18283g1, false);
            lp a10 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                h7 h7Var = new h7(optInt, optString, optBoolean, a10);
                if (a10 != null) {
                    this.f18350i.c(this.f18348g, h7Var, IronSource.AD_UNIT.BANNER);
                    return h7Var;
                }
                return h7Var;
            }
        }
        return null;
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject c10 = c(jSONObject, str);
        return c10 != null ? c10 : new JSONObject();
    }

    private InterstitialPlacement e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f18283g1, false);
            lp a10 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                InterstitialPlacement interstitialPlacement = new InterstitialPlacement(optInt, optString, optBoolean, a10);
                if (a10 != null) {
                    this.f18350i.c(this.f18348g, interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
                    return interstitialPlacement;
                }
                return interstitialPlacement;
            }
        }
        return null;
    }

    private cn f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f18283g1, false);
            lp a10 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                cn cnVar = new cn(optInt, optString, optBoolean, a10);
                if (a10 != null) {
                    this.f18350i.c(this.f18348g, cnVar, IronSource.AD_UNIT.NATIVE_AD);
                    return cnVar;
                }
                return cnVar;
            }
        }
        return null;
    }

    private Placement g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f18283g1, false);
            String optString2 = jSONObject.optString("virtualItemName", "");
            int optInt2 = jSONObject.optInt("virtualItemCount", -1);
            lp a10 = a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && optInt2 > 0) {
                Placement placement = new Placement(optInt, optString, optBoolean, optString2, optInt2, a10);
                if (a10 != null) {
                    this.f18350i.c(this.f18348g, placement, IronSource.AD_UNIT.REWARDED_VIDEO);
                    return placement;
                }
                return placement;
            }
        }
        return null;
    }

    private pu h(JSONObject jSONObject) {
        pu puVar = new pu();
        JSONObject c10 = c(jSONObject, "testSuite");
        if (c10 != null) {
            puVar.b(c10.optString("controllerUrl"));
        }
        return puVar;
    }

    private String l() {
        return this.f18351j ? "rewarded" : "rewardedVideo";
    }

    private boolean m() {
        JSONObject c10;
        JSONArray optJSONArray;
        JSONObject c11 = c(this.f18347f, "providerOrder");
        JSONArray names = c11.names();
        if (names == null) {
            return true;
        }
        JSONObject c12 = c(c(this.f18347f, "configurations"), b());
        for (int i10 = 0; i10 < names.length(); i10++) {
            String optString = names.optString(i10);
            JSONArray optJSONArray2 = c11.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (c10 = c(c12, optString)) != null && ((optJSONArray = c10.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        int i10;
        try {
            i10 = this.f18347f.optInt(f18287h2, 0);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            i10 = 0;
        }
        return i10 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0509 A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x076e A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da A[Catch: Exception -> 0x0b42, TRY_ENTER, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x095a A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0998 A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x09b6 A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x09fc A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0a56 A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a7b A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0a8d A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0aac A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0b2f A[Catch: Exception -> 0x0b42, TRY_LEAVE, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x031e A[Catch: Exception -> 0x0b42, TryCatch #0 {Exception -> 0x0b42, blocks: (B:3:0x0004, B:5:0x006f, B:9:0x0089, B:11:0x0095, B:16:0x00da, B:18:0x0174, B:19:0x0181, B:21:0x0187, B:24:0x019b, B:26:0x01a3, B:27:0x01ac, B:29:0x01b2, B:32:0x01c2, B:34:0x01ca, B:35:0x01d1, B:37:0x01d7, B:40:0x01e5, B:42:0x01ed, B:43:0x01f4, B:45:0x01fa, B:48:0x0208, B:50:0x0211, B:53:0x02c3, B:55:0x02c9, B:57:0x02e2, B:60:0x02ee, B:62:0x02f4, B:64:0x02fe, B:65:0x0301, B:69:0x031e, B:71:0x03ba, B:72:0x03c7, B:74:0x03cd, B:77:0x03e1, B:79:0x03e9, B:80:0x03f2, B:82:0x03f8, B:85:0x0408, B:87:0x0410, B:88:0x0417, B:90:0x041d, B:93:0x042b, B:95:0x0433, B:96:0x043a, B:98:0x0440, B:101:0x044e, B:103:0x0459, B:105:0x04d7, B:108:0x04e1, B:110:0x04e7, B:112:0x04f1, B:113:0x04f4, B:117:0x0509, B:119:0x05ce, B:120:0x05d9, B:122:0x05df, B:125:0x05f1, B:127:0x05f9, B:128:0x0602, B:130:0x0608, B:133:0x0618, B:135:0x0620, B:136:0x0627, B:138:0x062d, B:141:0x063b, B:143:0x0643, B:144:0x064a, B:146:0x0650, B:149:0x065e, B:151:0x0669, B:153:0x0673, B:157:0x0720, B:160:0x072e, B:162:0x0734, B:164:0x0740, B:165:0x0743, B:169:0x076e, B:171:0x0807, B:172:0x080e, B:174:0x0814, B:177:0x0822, B:179:0x082a, B:180:0x0831, B:182:0x0837, B:185:0x0845, B:187:0x084d, B:188:0x0854, B:190:0x085a, B:193:0x0868, B:195:0x0870, B:196:0x0877, B:198:0x087d, B:201:0x088b, B:203:0x0898, B:205:0x08a0, B:209:0x0917, B:212:0x0927, B:214:0x092d, B:216:0x0937, B:217:0x093a, B:219:0x0953, B:221:0x095a, B:224:0x0967, B:226:0x096d, B:227:0x0977, B:229:0x097f, B:230:0x0982, B:232:0x098f, B:234:0x0998, B:236:0x09b1, B:238:0x09b6, B:239:0x09d4, B:241:0x09fc, B:244:0x0a42, B:246:0x0a48, B:249:0x0a56, B:251:0x0a74, B:255:0x0a81, B:257:0x0a8d, B:259:0x0a9a, B:260:0x0a9e, B:261:0x0aa3, B:263:0x0aac, B:264:0x0ab5, B:266:0x0b10, B:268:0x0b18, B:270:0x0b2f, B:254:0x0a7b, B:206:0x0906, B:207:0x090e, B:154:0x0705, B:155:0x0713, B:104:0x04cc, B:56:0x02d3), top: B:275:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            Method dump skipped, instructions count: 2901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.ls.q():void");
    }

    private void r() {
        try {
            JSONObject c10 = c(this.f18347f, "providerOrder");
            JSONArray b10 = b(c10, l());
            JSONArray b11 = b(c10, "interstitial");
            JSONArray b12 = b(c10, "banner");
            JSONArray b13 = b(c10, "nativeAd");
            this.f18342a = new aq();
            if (b10 != null && c() != null && c().f() != null) {
                for (int i10 = 0; i10 < b10.length(); i10++) {
                    String optString = b10.optString(i10);
                    this.f18342a.d(optString);
                    NetworkSettings b14 = cq.c().b(optString);
                    if (b14 != null) {
                        b14.setRewardedVideoPriority(i10);
                    }
                }
            }
            if (b11 != null && c() != null && c().d() != null) {
                for (int i11 = 0; i11 < b11.length(); i11++) {
                    String optString2 = b11.optString(i11);
                    this.f18342a.b(optString2);
                    NetworkSettings b15 = cq.c().b(optString2);
                    if (b15 != null) {
                        b15.setInterstitialPriority(i11);
                    }
                }
            }
            if (b12 != null) {
                for (int i12 = 0; i12 < b12.length(); i12++) {
                    String optString3 = b12.optString(i12);
                    this.f18342a.a(optString3);
                    NetworkSettings b16 = cq.c().b(optString3);
                    if (b16 != null) {
                        b16.setBannerPriority(i12);
                    }
                }
            }
            if (b13 != null) {
                for (int i13 = 0; i13 < b13.length(); i13++) {
                    String optString4 = b13.optString(i13);
                    this.f18342a.c(optString4);
                    NetworkSettings b17 = cq.c().b(optString4);
                    if (b17 != null) {
                        b17.setNativeAdPriority(i13);
                    }
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private void s() {
        JSONObject jSONObject;
        Iterator<String> it;
        ls lsVar;
        NetworkSettings networkSettings;
        ls lsVar2 = this;
        try {
            lsVar2.f18343b = cq.c();
            JSONObject c10 = lsVar2.c(lsVar2.f18347f, "providerSettings");
            Iterator<String> keys = c10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = c10.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerNetworkKey", null);
                    String optString4 = optJSONObject.optString("providerLoadName", next);
                    String optString5 = optJSONObject.optString("providerDefaultInstance", optString4);
                    JSONObject c11 = lsVar2.c(optJSONObject, b());
                    JSONObject c12 = lsVar2.c(optJSONObject, "application");
                    JSONObject c13 = lsVar2.c(c11, l());
                    JSONObject c14 = lsVar2.c(c11, "interstitial");
                    JSONObject c15 = lsVar2.c(c11, "banner");
                    JSONObject c16 = lsVar2.c(c11, "nativeAd");
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(c13, c12);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(c14, c12);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(c15, c12);
                    JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(c16, c12);
                    if (lsVar2.f18343b.a(next)) {
                        ar.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, null));
                        NetworkSettings b10 = lsVar2.f18343b.b(next);
                        JSONObject rewardedVideoSettings = b10.getRewardedVideoSettings();
                        JSONObject interstitialSettings = b10.getInterstitialSettings();
                        JSONObject bannerSettings = b10.getBannerSettings();
                        JSONObject nativeAdSettings = b10.getNativeAdSettings();
                        b10.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        b10.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        b10.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        b10.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, mergeJsons4));
                        b10.setIsMultipleInstances(optBoolean);
                        b10.setSubProviderId(optString);
                        b10.setAdSourceNameForEvents(optString2);
                        b10.setProviderNetworkKey(optString3);
                    } else {
                        if (lsVar2.b(optString4)) {
                            jSONObject = c10;
                            NetworkSettings b11 = lsVar2.f18343b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = b11.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = b11.getInterstitialSettings();
                            JSONObject bannerSettings2 = b11.getBannerSettings();
                            JSONObject nativeAdSettings2 = b11.getNativeAdSettings();
                            it = keys;
                            JSONObject jSONObject2 = new JSONObject(rewardedVideoSettings2.toString());
                            JSONObject jSONObject3 = new JSONObject(interstitialSettings2.toString());
                            try {
                                networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c12, IronSourceUtils.mergeJsons(jSONObject2, mergeJsons), IronSourceUtils.mergeJsons(jSONObject3, mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), mergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), mergeJsons4));
                                networkSettings.setIsMultipleInstances(optBoolean);
                                networkSettings.setSubProviderId(optString);
                                networkSettings.setAdSourceNameForEvents(optString2);
                                lsVar = this;
                            } catch (Exception e8) {
                                e = e8;
                                o9.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        } else {
                            try {
                                jSONObject = c10;
                                it = keys;
                                lsVar = lsVar2;
                                networkSettings = new NetworkSettings(next, optString4, optString5, optString3, c12, mergeJsons, mergeJsons2, mergeJsons3, mergeJsons4);
                                networkSettings.setIsMultipleInstances(optBoolean);
                                networkSettings.setSubProviderId(optString);
                                networkSettings.setAdSourceNameForEvents(optString2);
                            } catch (Exception e10) {
                                e = e10;
                                o9.d().a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        }
                        lsVar.f18343b.a(networkSettings);
                        lsVar2 = lsVar;
                        c10 = jSONObject;
                        keys = it;
                    }
                }
            }
            lsVar2.f18343b.b();
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void a(a aVar) {
        this.f18349h = aVar;
    }

    public s8 c() {
        return this.f18344c;
    }

    public mc e() {
        return this.f18352k;
    }

    public li f() {
        return new li(this.f18345d, this.f18346e);
    }

    public List<IronSource.AD_UNIT> g() {
        aq aqVar;
        aq aqVar2;
        aq aqVar3;
        aq aqVar4;
        if (this.f18347f == null || this.f18344c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f18344c.f() != null && (aqVar4 = this.f18342a) != null && !aqVar4.d().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.f18344c.d() != null && (aqVar3 = this.f18342a) != null && !aqVar3.b().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.f18344c.c() != null && (aqVar2 = this.f18342a) != null && !aqVar2.a().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (this.f18344c.e() != null && (aqVar = this.f18342a) != null && !aqVar.c().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
        }
        return arrayList;
    }

    public a h() {
        return this.f18349h;
    }

    public JSONObject i() {
        return this.f18347f;
    }

    public aq j() {
        return this.f18342a;
    }

    public cq k() {
        return this.f18343b;
    }

    public boolean o() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean p() {
        JSONObject jSONObject = this.f18347f;
        return (((((jSONObject != null) && !jSONObject.has("error")) && this.f18342a != null) && this.f18343b != null) && this.f18344c != null) && m();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f18345d);
            jSONObject.put("userId", this.f18346e);
            jSONObject.put(f18303n, this.f18347f);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return jSONObject.toString();
    }
}
