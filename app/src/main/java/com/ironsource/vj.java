package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.bi;
import com.ironsource.eh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.p0;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class vj implements gr, v9, u9, s9, t9, bk, oo {

    /* renamed from: m  reason: collision with root package name */
    private static final String f21145m = "IronSourceAdsPublisherAgent";

    /* renamed from: n  reason: collision with root package name */
    private static vj f21146n;

    /* renamed from: a  reason: collision with root package name */
    private com.ironsource.sdk.controller.e f21147a;

    /* renamed from: b  reason: collision with root package name */
    private String f21148b;

    /* renamed from: c  reason: collision with root package name */
    private String f21149c;

    /* renamed from: d  reason: collision with root package name */
    private wa f21150d;

    /* renamed from: e  reason: collision with root package name */
    private pn f21151e;

    /* renamed from: g  reason: collision with root package name */
    private e9 f21153g;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21152f = false;

    /* renamed from: h  reason: collision with root package name */
    private FeaturesManager f21154h = FeaturesManager.getInstance();

    /* renamed from: i  reason: collision with root package name */
    private bi.a f21155i = mm.M().g();

    /* renamed from: j  reason: collision with root package name */
    private p0.a f21156j = mm.M().E();

    /* renamed from: k  reason: collision with root package name */
    private p0 f21157k = mm.S().F();

    /* renamed from: l  reason: collision with root package name */
    private ch f21158l = mm.S().z();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21160b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ va f21161c;

        a(String str, String str2, va vaVar) {
            this.f21159a = str;
            this.f21160b = str2;
            this.f21161c = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            vj.this.f21147a.a(this.f21159a, this.f21160b, this.f21161c, (v9) vj.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f21163a;

        b(JSONObject jSONObject) {
            this.f21163a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            vj.this.f21147a.a(this.f21163a, (v9) vj.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21166b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ va f21167c;

        c(String str, String str2, va vaVar) {
            this.f21165a = str;
            this.f21166b = str2;
            this.f21167c = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            vj.this.f21147a.a(this.f21165a, this.f21166b, this.f21167c, (u9) vj.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21169a;

        d(String str) {
            this.f21169a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            vj.this.f21147a.a(this.f21169a, vj.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f21171a;

        e(JSONObject jSONObject) {
            this.f21171a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            vj.this.f21147a.a(this.f21171a, (u9) vj.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ rj f21173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f21174b;

        f(rj rjVar, Map map) {
            this.f21173a = rjVar;
            this.f21174b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            eh.e eVar = this.f21173a.i() ? eh.e.Banner : eh.e.Interstitial;
            va a10 = vj.this.f21150d.a(eVar, this.f21173a);
            gh ghVar = new gh();
            ghVar.a(cc.f16882x, Boolean.valueOf(this.f21173a.j())).a(cc.G, Boolean.valueOf(this.f21173a.m())).a(cc.f16880v, this.f21173a.g()).a(cc.f16881w, ck.a(this.f21173a)).a(cc.I, Long.valueOf(m0.f18364a.b(this.f21173a.e())));
            lh.a(er.f17300h, ghVar.a());
            if (eVar == eh.e.Banner) {
                vj.this.f21147a.a(vj.this.f21148b, vj.this.f21149c, a10, (t9) vj.this);
                vj.this.f21147a.a(a10, this.f21174b, (t9) vj.this);
                return;
            }
            vj.this.f21147a.a(vj.this.f21148b, vj.this.f21149c, a10, (u9) vj.this);
            vj.this.f21147a.b(a10, this.f21174b, vj.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ va f21176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f21177b;

        g(va vaVar, Map map) {
            this.f21176a = vaVar;
            this.f21177b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            vj.this.f21147a.a(this.f21176a, this.f21177b, (u9) vj.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ rj f21179a;

        h(rj rjVar) {
            this.f21179a = rjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            eh.e eVar = this.f21179a.i() ? eh.e.Banner : eh.e.Interstitial;
            va a10 = vj.this.f21150d.a(eVar, this.f21179a);
            gh ghVar = new gh();
            ghVar.a(cc.f16882x, Boolean.valueOf(this.f21179a.j())).a(cc.f16880v, this.f21179a.g()).a(cc.f16881w, ck.a(this.f21179a)).a("isMultipleAdObjects", Boolean.valueOf(this.f21179a.l()));
            lh.a(er.f17305m, ghVar.a());
            if (eVar == eh.e.Banner) {
                vj.this.f21147a.a(a10);
                return;
            }
            a10.a(false);
            vj.this.f21147a.b(a10);
        }
    }

    private vj(Context context, int i10) {
        c(context);
    }

    vj(String str, String str2, Context context) {
        this.f21148b = str;
        this.f21149c = str2;
        c(context);
    }

    public static bk a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    public static synchronized bk a(String str, String str2, Context context) {
        vj vjVar;
        synchronized (vj.class) {
            if (f21146n == null) {
                lh.a(er.f17293a);
                f21146n = new vj(str, str2, context);
            }
            vjVar = f21146n;
        }
        return vjVar;
    }

    private jo a(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (jo) vaVar.i();
    }

    public static synchronized vj a(Context context, int i10) throws Exception {
        vj vjVar;
        synchronized (vj.class) {
            Logger.i(f21145m, "getInstance()");
            if (f21146n == null) {
                f21146n = new vj(context, i10);
            }
            vjVar = f21146n;
        }
        return vjVar;
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    private lo b(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (lo) vaVar.i();
    }

    public static synchronized vj b(Context context) throws Exception {
        vj a10;
        synchronized (vj.class) {
            a10 = a(context, 0);
        }
        return a10;
    }

    private void b(rj rjVar, Map<String, String> map) {
        Logger.d(f21145m, "loadOnNewInstance " + rjVar.e());
        this.f21147a.a(new f(rjVar, map));
    }

    private qo c(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (qo) vaVar.i();
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            ik.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new rt(SDKUtils.getNetworkConfiguration().optJSONObject(b9.a.f16540k)));
            ik.e().d(SDKUtils.getSDKVersion());
            this.f21150d = new wa();
            e9 e9Var = new e9();
            this.f21153g = e9Var;
            if (context instanceof Activity) {
                e9Var.a((Activity) context);
            }
            int debugMode = this.f21154h.getDebugMode();
            this.f21151e = new pn();
            this.f21147a = new com.ironsource.sdk.controller.e(context, this.f21153g, this.f21150d, hg.f17676a, debugMode, this.f21154h.getDataManagerConfig(), this.f21148b, this.f21149c, this.f21151e);
            Logger.enableLogging(debugMode);
            Logger.i(f21145m, "C'tor");
            a(context);
            this.f21151e.d();
            this.f21151e.e();
            this.f21151e.a(context);
            this.f21151e.b();
            this.f21151e.a();
            this.f21151e.b(context);
            this.f21151e.c();
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    private void c(rj rjVar, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e8) {
            o9.d().a(e8);
            gh a10 = new gh().a(cc.A, e8.getMessage()).a(cc.f16882x, Boolean.valueOf(rjVar.j())).a(cc.G, Boolean.valueOf(rjVar.m())).a(cc.f16880v, rjVar.g()).a(cc.f16881w, ck.a(rjVar)).a(cc.I, Long.valueOf(m0.f18364a.b(rjVar.e())));
            m0.f18364a.a(rjVar.e());
            lh.a(er.f17303k, a10.a());
            IronLog.INTERNAL.error(e8.toString());
            Logger.d(f21145m, "loadInAppBiddingAd failed decoding  ADM " + e8.getMessage());
        }
        b(rjVar, map);
    }

    private va d(eh.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f21150d.a(eVar, str);
    }

    @Override // com.ironsource.bk
    public com.ironsource.sdk.controller.e a() {
        return this.f21147a;
    }

    @Override // com.ironsource.gr, com.ironsource.bk
    public void a(Activity activity) {
        try {
            Logger.i(f21145m, "release()");
            za.g();
            this.f21153g.b();
            this.f21147a.a((Context) activity);
            this.f21147a.destroy();
            this.f21147a = null;
        } catch (Exception e8) {
            o9.d().a(e8);
        }
        f21146n = null;
    }

    @Override // com.ironsource.dk
    public void a(Activity activity, rj rjVar, Map<String, String> map) {
        this.f21153g.a(activity);
        Logger.i(f21145m, "showAd " + rjVar.e());
        va a10 = this.f21150d.a(eh.e.Interstitial, rjVar.e());
        if (a10 == null) {
            return;
        }
        this.f21147a.a(new g(a10, map));
    }

    public void a(Context context) {
        this.f21152f = false;
        Boolean c10 = this.f21158l.c(b9.a.f16536g);
        if (c10 == null) {
            c10 = Boolean.FALSE;
        }
        boolean booleanValue = c10.booleanValue();
        this.f21152f = booleanValue;
        if (booleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new i(this));
            } catch (Throwable th) {
                o9.d().a(th);
                gh ghVar = new gh();
                ghVar.a(cc.f16883y, th.getMessage());
                lh.a(er.f17313u, ghVar.a());
            }
        }
    }

    @Override // com.ironsource.s9
    public void a(eh.e eVar, String str) {
        lo b10;
        va d10 = d(eVar, str);
        if (d10 != null) {
            if (eVar == eh.e.RewardedVideo) {
                qo c10 = c(d10);
                if (c10 != null) {
                    c10.c();
                }
            } else if (eVar != eh.e.Interstitial || (b10 = b(d10)) == null) {
            } else {
                b10.onInterstitialClose();
            }
        }
    }

    @Override // com.ironsource.s9
    public void a(eh.e eVar, String str, z2 z2Var) {
        jo a10;
        va d10 = d(eVar, str);
        if (d10 != null) {
            d10.b(2);
            if (eVar == eh.e.RewardedVideo) {
                qo c10 = c(d10);
                if (c10 != null) {
                    c10.a(z2Var);
                }
            } else if (eVar == eh.e.Interstitial) {
                lo b10 = b(d10);
                if (b10 != null) {
                    b10.onInterstitialInitSuccess();
                }
            } else if (eVar != eh.e.Banner || (a10 = a(d10)) == null) {
            } else {
                a10.onBannerInitSuccess();
            }
        }
    }

    @Override // com.ironsource.s9
    public void a(eh.e eVar, String str, String str2) {
        jo a10;
        va d10 = d(eVar, str);
        gh a11 = new gh().a(cc.f16880v, str).a(cc.f16881w, eVar).a(cc.A, str2);
        if (d10 != null) {
            m0 m0Var = m0.f18364a;
            a11.a(cc.I, Long.valueOf(m0Var.b(d10.h())));
            a11.a(cc.f16882x, Boolean.valueOf(mh.a(d10)));
            m0Var.a(d10.h());
            d10.b(3);
            if (eVar == eh.e.RewardedVideo) {
                qo c10 = c(d10);
                if (c10 != null) {
                    c10.b(str2);
                }
            } else if (eVar == eh.e.Interstitial) {
                lo b10 = b(d10);
                if (b10 != null) {
                    b10.onInterstitialInitFailed(str2);
                }
            } else if (eVar == eh.e.Banner && (a10 = a(d10)) != null) {
                a10.onBannerLoadFail(str2);
            }
        }
        lh.a(er.f17301i, a11.a());
    }

    @Override // com.ironsource.s9
    public void a(eh.e eVar, String str, String str2, JSONObject jSONObject) {
        jo a10;
        va d10 = d(eVar, str);
        if (d10 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(f21145m, "Received Event Notification: " + str2 + " for demand source: " + d10.f());
            if (eVar == eh.e.Interstitial) {
                lo b10 = b(d10);
                if (b10 != null) {
                    jSONObject.put("demandSourceName", str);
                    b10.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == eh.e.RewardedVideo) {
                qo c10 = c(d10);
                if (c10 != null) {
                    jSONObject.put("demandSourceName", str);
                    c10.a(str2, jSONObject);
                }
            } else if (eVar == eh.e.Banner && (a10 = a(d10)) != null) {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    a10.onBannerShowSuccess();
                }
            }
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    @Override // com.ironsource.dk
    public void a(rj rjVar, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        map.put(b9.h.f16687y0, String.valueOf(currentTimeMillis));
        m0.f18364a.a(rjVar.e(), currentTimeMillis);
        gh ghVar = new gh();
        ghVar.a(cc.f16882x, Boolean.valueOf(rjVar.j())).a(cc.G, Boolean.valueOf(rjVar.m())).a(cc.f16880v, rjVar.g()).a(cc.f16881w, ck.a(rjVar)).a(cc.I, Long.valueOf(currentTimeMillis));
        lh.a(er.f17298f, ghVar.a());
        Logger.d(f21145m, "loadAd " + rjVar.e());
        o0 o0Var = new o0(rjVar);
        this.f21156j.a(o0Var);
        this.f21156j.a(new JSONObject(map), n1.LOAD_REQUEST, o0Var.c());
        if (c(rjVar)) {
            this.f21155i.a(new xs(o0Var));
        }
        if (rjVar.k()) {
            c(rjVar, map);
        } else {
            b(rjVar, map);
        }
    }

    @Override // com.ironsource.v9
    public void a(String str, int i10) {
        qo c10;
        va d10 = d(eh.e.RewardedVideo, str);
        if (d10 == null || (c10 = c(d10)) == null) {
            return;
        }
        c10.a(i10);
    }

    @Override // com.ironsource.t9
    public void a(String str, vg vgVar) {
        jo a10;
        va d10 = d(eh.e.Banner, str);
        if (d10 == null || (a10 = a(d10)) == null) {
            return;
        }
        a10.onBannerLoadSuccess(d10.c(), vgVar);
    }

    @Override // com.ironsource.t9
    public void a(String str, String str2) {
        jo a10;
        va d10 = d(eh.e.Banner, str);
        if (d10 == null || (a10 = a(d10)) == null) {
            return;
        }
        a10.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.gr
    public void a(String str, String str2, int i10) {
        eh.e productType;
        va a10;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a10 = this.f21150d.a(productType, str2)) == null) {
            return;
        }
        a10.c(i10);
    }

    @Override // com.ironsource.gr
    public void a(String str, String str2, String str3, Map<String, String> map, lo loVar) {
        this.f21148b = str;
        this.f21149c = str2;
        this.f21147a.a(new c(str, str2, this.f21150d.a(eh.e.Interstitial, str3, map, loVar)));
    }

    @Override // com.ironsource.gr
    public void a(String str, String str2, String str3, Map<String, String> map, qo qoVar) {
        this.f21148b = str;
        this.f21149c = str2;
        this.f21147a.a(new a(str, str2, this.f21150d.a(eh.e.RewardedVideo, str3, map, qoVar)));
    }

    @Override // com.ironsource.u9
    public void a(String str, JSONObject jSONObject) {
        eh.e eVar = eh.e.Interstitial;
        va d10 = d(eVar, str);
        gh a10 = new gh().a(cc.f16880v, str);
        if (d10 != null) {
            rj c10 = d10.c();
            this.f21156j.a(jSONObject, n1.LOAD_SUCCESS, c10.e());
            if (c(c10)) {
                this.f21155i.a(new ys(this.f21157k.a(c10.e())));
            }
            gh a11 = a10.a(cc.f16881w, mh.a(d10, eVar)).a(cc.f16882x, Boolean.valueOf(mh.a(d10)));
            m0 m0Var = m0.f18364a;
            a11.a(cc.I, Long.valueOf(m0Var.b(d10.h())));
            m0Var.a(d10.h());
            lo b10 = b(d10);
            if (b10 != null) {
                b10.onInterstitialLoadSuccess(d10.c());
            }
        }
        lh.a(er.f17304l, a10.a());
    }

    @Override // com.ironsource.gr
    public void a(JSONObject jSONObject) {
        this.f21147a.a(new b(jSONObject));
    }

    @Override // com.ironsource.dk
    public boolean a(rj rjVar) {
        Logger.d(f21145m, "isAdAvailable " + rjVar.e());
        va a10 = this.f21150d.a(eh.e.Interstitial, rjVar.e());
        if (a10 == null) {
            return false;
        }
        return a10.d();
    }

    @Override // com.ironsource.gr
    public boolean a(String str) {
        return this.f21147a.a(str);
    }

    @Override // com.ironsource.oo
    public void b(Activity activity) {
        try {
            this.f21147a.d();
            this.f21147a.a((Context) activity);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    @Override // com.ironsource.dk
    public void b(Activity activity, rj rjVar, Map<String, String> map) {
        this.f21153g.a(activity);
        a(rjVar, map);
    }

    @Override // com.ironsource.s9
    public void b(eh.e eVar, String str) {
        qo c10;
        va d10 = d(eVar, str);
        if (d10 != null) {
            if (eVar == eh.e.Interstitial) {
                lo b10 = b(d10);
                if (b10 != null) {
                    b10.onInterstitialOpen();
                }
            } else if (eVar != eh.e.RewardedVideo || (c10 = c(d10)) == null) {
            } else {
                c10.a();
            }
        }
    }

    @Override // com.ironsource.dk
    public void b(rj rjVar) {
        Logger.d(f21145m, "destroyInstance " + rjVar.e());
        if (c(rjVar)) {
            this.f21156j.a(n1.DESTROYED, rjVar.e());
            this.f21155i.a(new ws(this.f21157k.a(rjVar.e())));
        }
        this.f21147a.a(new h(rjVar));
    }

    @Override // com.ironsource.u9
    public void b(String str) {
        va d10 = d(eh.e.Interstitial, str);
        if (d10 != null) {
            rj c10 = d10.c();
            this.f21156j.a(n1.SHOW_SUCCESS, c10.e());
            if (c(c10)) {
                this.f21155i.a(new at(this.f21157k.a(c10.e())));
            }
            lo b10 = b(d10);
            if (b10 != null) {
                b10.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.u9
    public void b(String str, String str2) {
        va d10 = d(eh.e.Interstitial, str);
        if (d10 != null) {
            rj c10 = d10.c();
            this.f21156j.a(n1.SHOW_FAIL, c10.e());
            if (c(c10)) {
                this.f21155i.a(new zs(this.f21157k.a(c10.e())));
            }
            lo b10 = b(d10);
            if (b10 != null) {
                b10.onInterstitialShowFailed(str2);
            }
        }
    }

    @Override // com.ironsource.gr
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.f21147a.a(new d(optString));
    }

    @Override // com.ironsource.oo
    public void c(Activity activity) {
        this.f21153g.a(activity);
        this.f21147a.f();
        this.f21147a.b(activity);
    }

    @Override // com.ironsource.s9
    public void c(eh.e eVar, String str) {
        jo a10;
        va d10 = d(eVar, str);
        if (d10 != null) {
            if (eVar == eh.e.RewardedVideo) {
                qo c10 = c(d10);
                if (c10 != null) {
                    c10.d();
                }
            } else if (eVar == eh.e.Interstitial) {
                lo b10 = b(d10);
                if (b10 != null) {
                    b10.onInterstitialClick();
                }
            } else if (eVar != eh.e.Banner || (a10 = a(d10)) == null) {
            } else {
                a10.onBannerClick();
            }
        }
    }

    @Override // com.ironsource.v9
    public void c(String str) {
        qo c10;
        va d10 = d(eh.e.RewardedVideo, str);
        if (d10 == null || (c10 = c(d10)) == null) {
            return;
        }
        c10.b();
    }

    @Override // com.ironsource.u9
    public void c(String str, String str2) {
        eh.e eVar = eh.e.Interstitial;
        va d10 = d(eVar, str);
        gh ghVar = new gh();
        ghVar.a(cc.A, str2).a(cc.f16880v, str);
        if (d10 != null) {
            gh a10 = ghVar.a(cc.f16881w, mh.a(d10, eVar)).a(cc.f16883y, d10.e() == 2 ? cc.E : cc.F).a(cc.f16882x, Boolean.valueOf(mh.a(d10)));
            m0 m0Var = m0.f18364a;
            a10.a(cc.I, Long.valueOf(m0Var.b(d10.h())));
            m0Var.a(d10.h());
            lo b10 = b(d10);
            if (b10 != null) {
                b10.onInterstitialLoadFailed(str2);
            }
        }
        lh.a(er.f17299g, ghVar.a());
    }

    @Override // com.ironsource.gr
    public void c(JSONObject jSONObject) {
        this.f21147a.a(new e(jSONObject));
    }

    public boolean c(rj rjVar) {
        return rjVar.l() && !rjVar.i() && a(rjVar);
    }

    @Override // com.ironsource.v9
    public void d(String str, String str2) {
        qo c10;
        va d10 = d(eh.e.RewardedVideo, str);
        if (d10 == null || (c10 = c(d10)) == null) {
            return;
        }
        c10.a(str2);
    }

    @Override // com.ironsource.u9
    public void onInterstitialAdRewarded(String str, int i10) {
        va d10 = d(eh.e.Interstitial, str);
        lo b10 = b(d10);
        if (d10 == null || b10 == null) {
            return;
        }
        b10.onInterstitialAdRewarded(str, i10);
    }

    @Override // com.ironsource.gr, com.ironsource.bk
    public void onPause(Activity activity) {
        if (this.f21152f) {
            return;
        }
        b(activity);
    }

    @Override // com.ironsource.gr, com.ironsource.bk
    public void onResume(Activity activity) {
        if (this.f21152f) {
            return;
        }
        c(activity);
    }
}
