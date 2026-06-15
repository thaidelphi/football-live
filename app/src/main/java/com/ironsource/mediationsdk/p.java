package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.ak;
import com.ironsource.an;
import com.ironsource.ar;
import com.ironsource.as;
import com.ironsource.au;
import com.ironsource.bf;
import com.ironsource.bg;
import com.ironsource.cn;
import com.ironsource.cv;
import com.ironsource.d8;
import com.ironsource.de;
import com.ironsource.dg;
import com.ironsource.dq;
import com.ironsource.dv;
import com.ironsource.environment.ContextProvider;
import com.ironsource.eo;
import com.ironsource.eu;
import com.ironsource.fg;
import com.ironsource.fk;
import com.ironsource.g6;
import com.ironsource.h4;
import com.ironsource.h7;
import com.ironsource.hj;
import com.ironsource.i1;
import com.ironsource.ip;
import com.ironsource.k1;
import com.ironsource.k4;
import com.ironsource.ke;
import com.ironsource.lb;
import com.ironsource.ls;
import com.ironsource.mb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.s;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mg;
import com.ironsource.mj;
import com.ironsource.mm;
import com.ironsource.mo;
import com.ironsource.nf;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.oc;
import com.ironsource.oj;
import com.ironsource.op;
import com.ironsource.qa;
import com.ironsource.qi;
import com.ironsource.qk;
import com.ironsource.r8;
import com.ironsource.ra;
import com.ironsource.rm;
import com.ironsource.s8;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sg;
import com.ironsource.si;
import com.ironsource.st;
import com.ironsource.u6;
import com.ironsource.vq;
import com.ironsource.xa;
import com.ironsource.xh;
import com.ironsource.yl;
import com.ironsource.yq;
import com.ironsource.z8;
import com.ironsource.zb;
import com.ironsource.zj;
import com.ironsource.zr;
import com.ironsource.zt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p implements zj, mo, qa, qa.b, qa.c, qa.a {

    /* renamed from: t0  reason: collision with root package name */
    private static boolean f18968t0 = false;
    private Set<IronSource.AD_UNIT> A;
    private boolean B;
    private IronSourceSegment C;
    private final String D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private Boolean M;
    private IronSourceBannerLayout N;
    private String O;
    private Boolean P;
    private dg Q;
    private w R;
    private hj S;
    private vq T;
    private g6 U;
    private InitializationListener V;
    private eo W;
    private AtomicBoolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final String f18969a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f18970a0;

    /* renamed from: b  reason: collision with root package name */
    private final String f18971b;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f18972b0;

    /* renamed from: c  reason: collision with root package name */
    private final nf f18973c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f18974c0;

    /* renamed from: d  reason: collision with root package name */
    private final nf.a f18975d;

    /* renamed from: d0  reason: collision with root package name */
    private int f18976d0;

    /* renamed from: e  reason: collision with root package name */
    private final bg f18977e;

    /* renamed from: e0  reason: collision with root package name */
    private final ConcurrentHashMap<String, h.d> f18978e0;

    /* renamed from: f  reason: collision with root package name */
    private final bf f18979f;

    /* renamed from: f0  reason: collision with root package name */
    private final ConcurrentHashMap<String, h.b> f18980f0;

    /* renamed from: g  reason: collision with root package name */
    private final xh.a f18981g;

    /* renamed from: g0  reason: collision with root package name */
    private final ConcurrentHashMap<String, h.d> f18982g0;

    /* renamed from: h  reason: collision with root package name */
    private IronSourceLoggerManager f18983h;

    /* renamed from: h0  reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.f f18984h0;

    /* renamed from: i  reason: collision with root package name */
    private yl f18985i;

    /* renamed from: i0  reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.k f18986i0;

    /* renamed from: j  reason: collision with root package name */
    private com.ironsource.mediationsdk.logger.b f18987j;

    /* renamed from: j0  reason: collision with root package name */
    private com.ironsource.mediationsdk.demandOnly.c f18988j0;

    /* renamed from: k  reason: collision with root package name */
    private AtomicBoolean f18989k;

    /* renamed from: k0  reason: collision with root package name */
    private oc f18990k0;

    /* renamed from: l  reason: collision with root package name */
    private final Object f18991l;

    /* renamed from: l0  reason: collision with root package name */
    private ak f18992l0;

    /* renamed from: m  reason: collision with root package name */
    private ls f18993m;

    /* renamed from: m0  reason: collision with root package name */
    private ke f18994m0;

    /* renamed from: n  reason: collision with root package name */
    private String f18995n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f18996n0;

    /* renamed from: o  reason: collision with root package name */
    private String f18997o;

    /* renamed from: o0  reason: collision with root package name */
    private AdQualityBridge f18998o0;

    /* renamed from: p  reason: collision with root package name */
    private String f18999p;

    /* renamed from: p0  reason: collision with root package name */
    private final AtomicBoolean f19000p0;

    /* renamed from: q  reason: collision with root package name */
    private String f19001q;

    /* renamed from: q0  reason: collision with root package name */
    ISErrorListener f19002q0;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, String> f19003r;

    /* renamed from: r0  reason: collision with root package name */
    mg<ISDemandOnlyInterstitialListener> f19004r0;

    /* renamed from: s  reason: collision with root package name */
    private String f19005s;

    /* renamed from: s0  reason: collision with root package name */
    mg<ISDemandOnlyRewardedVideoListener> f19006s0;

    /* renamed from: t  reason: collision with root package name */
    private AtomicBoolean f19007t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f19008u;

    /* renamed from: v  reason: collision with root package name */
    private List<IronSource.AD_UNIT> f19009v;

    /* renamed from: w  reason: collision with root package name */
    private String f19010w;

    /* renamed from: x  reason: collision with root package name */
    private Context f19011x;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f19012y;

    /* renamed from: z  reason: collision with root package name */
    private Set<IronSource.AD_UNIT> f19013z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements ISErrorListener {
        a() {
        }

        @Override // com.ironsource.mediationsdk.events.ISErrorListener
        public void onError(Throwable th) {
            IronLog.INTERNAL.error(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19015a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f19016b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f19017c;

        static {
            int[] iArr = new int[op.b.values().length];
            f19017c = iArr;
            try {
                iArr[op.b.CAPPED_PER_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19017c[op.b.CAPPED_PER_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19017c[op.b.CAPPED_PER_PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19017c[op.b.NOT_CAPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[s.d.values().length];
            f19016b = iArr2;
            try {
                iArr2[s.d.INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19016b[s.d.INIT_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[IronSource.AD_UNIT.values().length];
            f19015a = iArr3;
            try {
                iArr3[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19015a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19015a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19015a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface c {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        static volatile p f19018a = new p(null);

        private d() {
        }
    }

    private p() {
        this(mm.S().f(), mm.M().b(), mm.S().B(), mm.S().v(), mm.M().q());
    }

    /* synthetic */ p(a aVar) {
        this();
    }

    p(nf nfVar, nf.a aVar, bg bgVar, bf bfVar, xh.a aVar2) {
        this.f18969a = getClass().getName();
        this.f18971b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b8.7.0";
        this.f18991l = new Object();
        this.f18993m = null;
        this.f18995n = null;
        this.f18997o = "";
        this.f18999p = null;
        this.f19001q = null;
        this.f19003r = null;
        this.f19005s = null;
        this.f19008u = false;
        this.f19012y = null;
        this.B = true;
        this.D = "sessionDepth";
        this.P = null;
        this.f18996n0 = false;
        this.f18973c = nfVar;
        this.f18975d = aVar;
        this.f18977e = bgVar;
        this.f18979f = bfVar;
        this.f18981g = aVar2;
        w();
        this.f18989k = new AtomicBoolean();
        this.f19013z = new HashSet();
        this.A = new HashSet();
        this.G = false;
        this.F = false;
        this.H = false;
        this.f19007t = new AtomicBoolean(true);
        this.X = new AtomicBoolean(false);
        this.f19000p0 = new AtomicBoolean(false);
        this.E = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.f19010w = IronSourceUtils.getSessionId();
        this.M = Boolean.FALSE;
        this.f18972b0 = false;
        this.O = null;
        this.Q = null;
        this.V = null;
        this.W = null;
        this.R = null;
        this.Y = false;
        this.f18978e0 = new ConcurrentHashMap<>();
        this.f18982g0 = new ConcurrentHashMap<>();
        this.f18980f0 = new ConcurrentHashMap<>();
        this.f18984h0 = null;
        this.f18986i0 = null;
        this.f18988j0 = null;
        this.f18976d0 = 1;
        this.f18990k0 = new oc();
        ak akVar = new ak();
        this.f18992l0 = akVar;
        this.f18994m0 = new ke(akVar);
        this.f19002q0 = new a();
        this.f18998o0 = null;
        this.f19004r0 = new mg.a();
        this.f19006s0 = new mg.b();
    }

    private boolean A() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.j() == null || this.f18993m.j().a() == null || this.f18993m.j().a().size() <= 0) ? false : true;
    }

    private synchronized boolean C() {
        return this.f19008u;
    }

    private boolean D() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.c() == null || this.f18993m.c().d() == null) ? false : true;
    }

    private boolean E() {
        return D() && G();
    }

    private boolean G() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.j() == null || this.f18993m.j().b() == null || this.f18993m.j().b().size() <= 0) ? false : true;
    }

    private boolean H() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.c() == null || this.f18993m.c().e() == null) ? false : true;
    }

    private boolean I() {
        return H() && J();
    }

    private boolean J() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.j() == null || this.f18993m.j().c() == null || this.f18993m.j().c().isEmpty()) ? false : true;
    }

    private boolean L() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.c() == null || this.f18993m.c().f() == null) ? false : true;
    }

    private boolean M() {
        return L() && N();
    }

    private boolean N() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.j() == null || this.f18993m.j().d() == null || this.f18993m.j().d().size() <= 0) ? false : true;
    }

    private void T() {
        if (this.V == null || !this.X.compareAndSet(false, true)) {
            return;
        }
        IronLog.CALLBACK.verbose("onInitializationCompleted()");
        ar.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
        this.V.onInitializationComplete();
    }

    private void V() {
        ConcurrentHashMap<String, List<String>> c10 = qk.b().c();
        if (c10.containsKey(com.ironsource.mediationsdk.metadata.a.f18920c)) {
            String str = c10.get(com.ironsource.mediationsdk.metadata.a.f18920c).get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            xa.f21388a.b(!MetaDataUtils.getMetaDataBooleanValue(str));
        }
    }

    private boolean W() {
        return this.f18998o0 == null && this.f19000p0.get() && this.f18993m.c().a().a() && AdQualityBridge.adQualityAvailable();
    }

    private void X() {
        if (this.H) {
            Z();
            return;
        }
        boolean h10 = this.f18993m.c().c().d().h();
        this.f18974c0 = h10;
        if (h10) {
            Y();
        } else {
            f0();
        }
    }

    private void Y() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a10 = a(this.f18993m.j().a());
        if (a10.size() > 0) {
            this.U = new g6(a10, this.f18993m.c().c(), IronSourceUtils.getUserIdForNetworks(), qk.b(), this.C);
            v();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.BANNER, false);
    }

    private void Z() {
        this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f18993m.j().a().size(); i10++) {
            String str = this.f18993m.j().a().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f18993m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.BANNER, false);
            return;
        }
        synchronized (this.f18980f0) {
            u6 c10 = this.f18993m.c().c();
            ra.a aVar = new ra.a("Mediation");
            if (c10.k()) {
                aVar.a("isOneFlow", 1);
            }
            this.f18988j0 = new com.ironsource.mediationsdk.demandOnly.c(arrayList, c10, n(), o(), new ra.b(oj.i(), aVar));
        }
        for (h.b bVar : this.f18980f0.values()) {
            this.f18988j0.a(bVar.g(), bVar.c());
        }
        this.f18980f0.clear();
    }

    private int a(yq yqVar) {
        return !this.f18970a0 && !this.Y && yqVar.k().e() ? 2 : 1;
    }

    private ls a(Context context, String str, c cVar) {
        ls lsVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String b10 = b(context);
            if (TextUtils.isEmpty(b10)) {
                b10 = this.f18973c.M(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = b10;
            IronSourceSegment ironSourceSegment = this.C;
            String sendPostRequest = HttpFunctions.sendPostRequest(ServerURL.buildInitURL(context, n(), str, str2, q(), this.Y, ironSourceSegment != null ? ironSourceSegment.getSegmentData() : null, B()), qi.a().toString(), cVar);
            if (sendPostRequest == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.isEncryptedResponse()) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                JSONObject jSONObject = new JSONObject(sendPostRequest);
                String optString = jSONObject.optString(ls.f18303n, null);
                if (TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                sendPostRequest = a(optString, Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (TextUtils.isEmpty(sendPostRequest)) {
                    ironLog.warning("encoded response invalid - return null");
                    U();
                    return null;
                }
            }
            ls lsVar2 = new ls(context, n(), str, sendPostRequest);
            try {
                lsVar2.a(ls.a.SERVER);
                if (lsVar2.p()) {
                    return lsVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e8) {
                e = e8;
                lsVar = lsVar2;
                o9.d().a(e);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.warning("exception = " + e);
                return lsVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(List<NetworkSettings> list) {
        mj d10 = this.f18993m.c().d();
        ra.a aVar = new ra.a("Mediation");
        if (d10.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, d10, com.ironsource.mediationsdk.c.b(), this.f19004r0, n(), o(), new ra.b(oj.i(), aVar));
    }

    private IronSourceError a(s.d dVar) {
        if (this.K) {
            if (this.H) {
                if (dVar == s.d.INIT_FAILED) {
                    return new IronSourceError(510, "ironSource initialization failed");
                }
                if (dVar == s.d.INIT_IN_PROGRESS && s.c().d()) {
                    return new IronSourceError(510, "ironSource initialization in progress");
                }
                return null;
            }
            return new IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        return new IronSourceError(510, "ironSource SDK was not initialized");
    }

    private String a(String str, Boolean bool) {
        return bool.booleanValue() ? IronSourceAES.decryptAndDecompress(mb.b().c(), str) : IronSourceAES.decode(mb.b().c(), str);
    }

    private List<NetworkSettings> a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(this.f18993m.k().b(str));
            }
        }
        return arrayList2;
    }

    private void a(int i10, JSONObject jSONObject) {
        oj.i().a(new zb(i10, jSONObject));
    }

    private synchronized void a(eo eoVar) {
        this.W = eoVar;
    }

    private void a(h4 h4Var, Context context, ls lsVar) {
        oj.i().a(h4Var.c(), context);
        oj.i().b(h4Var.d(), context);
        oj.i().b(h4Var.f());
        oj.i().a(h4Var.e());
        oj.i().c(h4Var.a());
        oj.i().c(h4Var.i(), context);
        oj.i().a(h4Var.h(), context);
        oj.i().b(h4Var.j(), context);
        oj.i().d(h4Var.g(), context);
        oj.i().a(lsVar.c().b().i());
        oj.i().a(h4Var.k());
        oj.i().d(h4Var.b());
    }

    private void a(k4 k4Var) {
        xa xaVar = xa.f21388a;
        xaVar.c(k4Var.g());
        xaVar.a(k4Var.f());
        xaVar.a(k4Var.j());
        this.f18979f.a(k4Var);
    }

    private void a(ls lsVar) {
        this.f18987j.setDebugLevel(lsVar.c().b().g().b());
        this.f18983h.setLoggerDebugLevel("console", lsVar.c().b().g().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.ironsource.ls r8, android.content.Context r9) {
        /*
            r7 = this;
            boolean r0 = r7.L()
            r1 = 0
            if (r0 == 0) goto L18
            com.ironsource.s8 r0 = r8.c()
            com.ironsource.yq r0 = r0.f()
            com.ironsource.h4 r0 = r0.m()
            boolean r0 = r0.l()
            goto L19
        L18:
            r0 = r1
        L19:
            boolean r2 = r7.D()
            if (r2 == 0) goto L30
            com.ironsource.s8 r2 = r8.c()
            com.ironsource.mj r2 = r2.d()
            com.ironsource.h4 r2 = r2.i()
            boolean r2 = r2.l()
            goto L31
        L30:
            r2 = r1
        L31:
            boolean r3 = r7.y()
            if (r3 == 0) goto L48
            com.ironsource.s8 r3 = r8.c()
            com.ironsource.u6 r3 = r3.c()
            com.ironsource.h4 r3 = r3.g()
            boolean r3 = r3.l()
            goto L49
        L48:
            r3 = r1
        L49:
            boolean r4 = r7.H()
            if (r4 == 0) goto L60
            com.ironsource.s8 r4 = r8.c()
            com.ironsource.rm r4 = r4.e()
            com.ironsource.h4 r4 = r4.g()
            boolean r4 = r4.l()
            goto L61
        L60:
            r4 = r1
        L61:
            com.ironsource.s8 r5 = r8.c()
            com.ironsource.a4 r5 = r5.b()
            com.ironsource.jp r5 = r5.h()
            boolean r6 = r5.i()
            if (r0 == 0) goto L83
            com.ironsource.s8 r0 = r8.c()
            com.ironsource.yq r0 = r0.f()
            com.ironsource.h4 r0 = r0.m()
            r7.b(r0, r9, r8)
            goto L8a
        L83:
            com.ironsource.ar r0 = com.ironsource.ar.i()
            r0.b(r1)
        L8a:
            if (r2 == 0) goto L9c
            com.ironsource.s8 r0 = r8.c()
            com.ironsource.mj r0 = r0.d()
            com.ironsource.h4 r0 = r0.i()
        L98:
            r7.a(r0, r9, r8)
            goto Lc1
        L9c:
            if (r3 == 0) goto Lab
            com.ironsource.s8 r0 = r8.c()
            com.ironsource.u6 r0 = r0.c()
            com.ironsource.h4 r0 = r0.g()
            goto L98
        Lab:
            if (r4 == 0) goto Lba
            com.ironsource.s8 r0 = r8.c()
            com.ironsource.rm r0 = r0.e()
            com.ironsource.h4 r0 = r0.g()
            goto L98
        Lba:
            com.ironsource.oj r8 = com.ironsource.oj.i()
            r8.b(r1)
        Lc1:
            com.ironsource.ip r8 = com.ironsource.ip.P
            r8.b(r6)
            if (r6 == 0) goto Leb
            java.lang.String r0 = r5.j()
            r8.b(r0, r9)
            int[] r0 = r5.l()
            r8.c(r0, r9)
            int[] r0 = r5.k()
            r8.a(r0, r9)
            boolean r9 = r5.g()
            r8.a(r9)
            int r9 = r5.h()
            r8.d(r9)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p.a(com.ironsource.ls, android.content.Context):void");
    }

    private void a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f18983h.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    private void a(IronSource.AD_UNIT ad_unit, boolean z10) {
        ConcurrentHashMap concurrentHashMap;
        int i10 = b.f19015a[ad_unit.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                if (!this.H) {
                    if (this.M.booleanValue()) {
                        this.M = Boolean.FALSE;
                        n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD, "init() had failed"));
                        this.N = null;
                        this.O = null;
                        return;
                    }
                    return;
                }
                for (h.b bVar : this.f18980f0.values()) {
                    ISDemandOnlyBannerLayout g10 = bVar.g();
                    if (g10 != null) {
                        g10.getListener().a(bVar.c(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                    }
                }
                concurrentHashMap = this.f18980f0;
            } else if (!this.G) {
                if (this.f18972b0) {
                    this.f18972b0 = false;
                    n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                    return;
                }
                return;
            } else {
                for (h.d dVar : this.f18978e0.values()) {
                    String c10 = dVar.c();
                    this.f19004r0.a(c10).onInterstitialAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
                }
                concurrentHashMap = this.f18978e0;
            }
        } else if (!this.F) {
            if (this.Y) {
                if (this.Z) {
                    this.Z = false;
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            } else if (z10 || L() || this.A.contains(ad_unit)) {
                dq.a().a(false, (AdInfo) null);
                return;
            } else {
                return;
            }
        } else {
            for (h.d dVar2 : this.f18982g0.values()) {
                String c11 = dVar2.c();
                this.f19006s0.a(c11).onRewardedVideoAdLoadFailed(c11, ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            concurrentHashMap = this.f18982g0;
        }
        concurrentHashMap.clear();
    }

    private synchronized void a(h.d dVar, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        String c10 = dVar.c();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + c10);
        if (!this.J) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c10, new IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
        } else if (!this.G) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c10, new IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
        } else {
            s.d a10 = s.c().a();
            if (a10 == s.d.INIT_FAILED) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                return;
            }
            IronSourceError a11 = dVar.a();
            if (a11 != null) {
                if (a11.getErrorCode() == 1060) {
                    b(IronSourceConstants.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                }
                ironLog.error(a11.toString());
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c10, a11);
                return;
            }
            e(dVar.e());
            if (a10 == s.d.INIT_IN_PROGRESS) {
                if (s.c().d()) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else {
                    synchronized (this.f18978e0) {
                        this.f18978e0.put(dVar.c(), dVar);
                    }
                    if (!TextUtils.isEmpty(dVar.c())) {
                        a(83003, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                }
            } else if (!E()) {
                ironLog.error("No interstitial configurations found");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            } else {
                synchronized (this.f18978e0) {
                    com.ironsource.mediationsdk.demandOnly.f fVar = this.f18984h0;
                    if (fVar != null) {
                        fVar.a(dVar);
                        return;
                    }
                    this.f18978e0.put(dVar.c(), dVar);
                    if (!TextUtils.isEmpty(dVar.b())) {
                        a(83003, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                }
            }
        }
    }

    private void a(String str, r8 r8Var) {
        if (a(str, 1, 128)) {
            return;
        }
        r8Var.a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private void a(JSONObject jSONObject, Object[][] objArr) {
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e8), 3);
            }
        }
    }

    private void a(boolean z10, String str) {
        if (z10) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.F, true, this.f18976d0);
            if (str != null) {
                a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            b(IronSourceConstants.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r6, boolean r7, int r8, org.json.JSONObject r9, boolean r10) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r0.<init>()     // Catch: java.lang.Exception -> L63
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L25
            java.lang.String r6 = ",Activity=%s"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L63
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch: java.lang.Exception -> L63
            android.app.Activity r4 = r4.getCurrentActiveActivity()     // Catch: java.lang.Exception -> L63
            if (r4 == 0) goto L19
            r4 = r2
            goto L1a
        L19:
            r4 = r1
        L1a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L63
            r3[r1] = r4     // Catch: java.lang.Exception -> L63
            java.lang.String r6 = java.lang.String.format(r6, r3)     // Catch: java.lang.Exception -> L63
            goto L2e
        L25:
            if (r6 != 0) goto L31
            java.lang.String r6 = ","
            r0.append(r6)     // Catch: java.lang.Exception -> L63
            java.lang.String r6 = "init_context_flow"
        L2e:
            r0.append(r6)     // Catch: java.lang.Exception -> L63
        L31:
            java.lang.String r6 = ",cachedUserAgent=%s"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L63
            com.ironsource.nf r4 = r5.f18973c     // Catch: java.lang.Exception -> L63
            boolean r4 = r4.r()     // Catch: java.lang.Exception -> L63
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L63
            r3[r1] = r4     // Catch: java.lang.Exception -> L63
            java.lang.String r6 = java.lang.String.format(r6, r3)     // Catch: java.lang.Exception -> L63
            r0.append(r6)     // Catch: java.lang.Exception -> L63
            java.lang.String r6 = "ext1"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L63
            r9.put(r6, r0)     // Catch: java.lang.Exception -> L63
            java.lang.String r6 = "sessionDepth"
            r9.put(r6, r8)     // Catch: java.lang.Exception -> L63
            if (r10 == 0) goto L74
            if (r7 == 0) goto L5d
            java.lang.String r6 = "isMultipleAdObjects"
            goto L5f
        L5d:
            java.lang.String r6 = "isMultipleAdUnits"
        L5f:
            r9.put(r6, r2)     // Catch: java.lang.Exception -> L63
            goto L74
        L63:
            r6 = move-exception
            com.ironsource.o9 r7 = com.ironsource.o9.d()
            r7.a(r6)
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r6 = r6.toString()
            r7.error(r6)
        L74:
            com.ironsource.zb r6 = new com.ironsource.zb
            r7 = 14
            r6.<init>(r7, r9)
            com.ironsource.ar r7 = com.ironsource.ar.i()
            r7.a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p.a(boolean, boolean, int, org.json.JSONObject, boolean):void");
    }

    private synchronized void a(boolean z10, boolean z11, boolean z12, IronSource.AD_UNIT... ad_unitArr) {
        JSONObject mediationAdditionalData;
        int i10 = 0;
        for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
            if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                this.J = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                this.K = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                this.I = true;
            } else if (ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                this.L = true;
            }
        }
        if (s.c().a() == s.d.INIT_FAILED) {
            try {
                if (this.f18985i != null) {
                    int length = ad_unitArr.length;
                    while (i10 < length) {
                        IronSource.AD_UNIT ad_unit2 = ad_unitArr[i10];
                        if (!this.f19013z.contains(ad_unit2)) {
                            a(ad_unit2, true);
                        }
                        i10++;
                    }
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
            return;
        } else if (!C()) {
            mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z11);
            int length2 = ad_unitArr.length;
            while (i10 < length2) {
                IronSource.AD_UNIT ad_unit3 = ad_unitArr[i10];
                if (this.f19013z.contains(ad_unit3)) {
                    this.f18983h.log(IronSourceLogger.IronSourceTag.API, ad_unit3 + " ad unit has started initializing.", 3);
                } else {
                    this.f19013z.add(ad_unit3);
                    this.A.add(ad_unit3);
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (Exception e10) {
                        o9.d().a(e10);
                        IronLog.INTERNAL.error(e10.toString());
                    }
                }
                i10++;
            }
            JSONObject jSONObject = mediationAdditionalData;
            int i11 = 1 + this.E;
            this.E = i11;
            a(z10, z11, i11, jSONObject, z12);
            return;
        } else if (this.f19009v == null) {
            return;
        } else {
            try {
                new nm().a(this.f18993m.c().b().d().b(), B());
            } catch (Exception e11) {
                o9.d().a(e11);
                IronLog.INTERNAL.error(e11.toString());
            }
            mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z11);
            for (IronSource.AD_UNIT ad_unit4 : ad_unitArr) {
                if (this.f19013z.contains(ad_unit4)) {
                    a(ad_unit4);
                } else {
                    this.f19013z.add(ad_unit4);
                    this.A.add(ad_unit4);
                    try {
                        mediationAdditionalData.put(ad_unit4.toString(), true);
                    } catch (Exception e12) {
                        o9.d().a(e12);
                        IronLog.INTERNAL.error(e12.toString());
                    }
                    List<IronSource.AD_UNIT> list = this.f19009v;
                    if (list == null || !list.contains(ad_unit4)) {
                        a(ad_unit4, false);
                    } else {
                        b(ad_unit4);
                    }
                }
            }
            JSONObject jSONObject2 = mediationAdditionalData;
            int i112 = 1 + this.E;
            this.E = i112;
            a(z10, z11, i112, jSONObject2, z12);
            return;
        }
    }

    private boolean a(h.b bVar) {
        if (s.c().a() == s.d.INIT_IN_PROGRESS) {
            synchronized (this.f18980f0) {
                this.f18980f0.put(bVar.c(), bVar);
            }
            return true;
        }
        return false;
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }

    private void a0() {
        this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f18993m.j().b().size(); i10++) {
            String str = this.f18993m.j().b().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f18993m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        synchronized (this.f18978e0) {
            this.f18984h0 = a((List<NetworkSettings>) arrayList);
        }
        for (h.d dVar : this.f18978e0.values()) {
            this.f18984h0.a(dVar);
        }
        this.f18978e0.clear();
    }

    private com.ironsource.mediationsdk.demandOnly.k b(List<NetworkSettings> list) {
        yq f10 = this.f18993m.c().f();
        ra.a aVar = new ra.a("Mediation");
        if (f10.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, f10, com.ironsource.mediationsdk.c.b(), this.f19006s0, n(), o(), new ra.b(ar.i(), aVar));
    }

    private void b(int i10, JSONObject jSONObject) {
        ar.i().a(new zb(i10, jSONObject));
    }

    private void b(h4 h4Var, Context context, ls lsVar) {
        ar.i().a(h4Var.c(), context);
        ar.i().b(h4Var.d(), context);
        ar.i().b(h4Var.f());
        ar.i().a(h4Var.e());
        ar.i().c(h4Var.a());
        ar.i().c(h4Var.i(), context);
        ar.i().a(h4Var.h(), context);
        ar.i().b(h4Var.j(), context);
        ar.i().d(h4Var.g(), context);
        ar.i().a(lsVar.c().b().i());
        ar.i().a(h4Var.k());
        ar.i().d(h4Var.b());
    }

    private void b(IronSource.AD_UNIT ad_unit) {
        int i10 = b.f19015a[ad_unit.ordinal()];
        if (i10 == 1) {
            g0();
        } else if (i10 == 2) {
            c0();
        } else if (i10 != 3) {
        } else {
            X();
        }
    }

    private boolean b(ls lsVar) {
        return lsVar != null && lsVar.o();
    }

    private boolean b(h.b bVar) {
        synchronized (this.f18980f0) {
            if (this.f18988j0 == null) {
                this.f18980f0.put(bVar.c(), bVar);
                return true;
            }
            return false;
        }
    }

    private boolean b(List<IronSource.AD_UNIT> list, boolean z10, s8 s8Var) {
        IronSource.AD_UNIT[] values;
        IronLog.INTERNAL.verbose();
        try {
            this.f18987j.a(s8Var.b().g().d());
            this.f19009v = list;
            c(true);
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z10) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e8) {
                    o9.d().a(e8);
                    IronLog.INTERNAL.error(e8.toString());
                }
                ar.i().a(new zb(114, mediationAdditionalData));
            }
            int b10 = s8Var.b().e().b();
            if (b10 >= 0) {
                z8 z8Var = new z8();
                z8Var.a(b10);
                z8Var.a(b10, this.f18993m.k().d());
            }
            oj.i().h();
            ar.i().h();
            com.ironsource.mediationsdk.c.b().b(n(), o());
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f19013z.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        b(ad_unit);
                    } else {
                        a(ad_unit, false);
                    }
                }
            }
            if (x() && W()) {
                AdQualityBridge adQualityBridge = new AdQualityBridge(ContextProvider.getInstance().getApplicationContext(), n(), o(), new i1(), this.f18993m.c().b().g().a());
                this.f18998o0 = adQualityBridge;
                IronSourceSegment ironSourceSegment = this.C;
                if (ironSourceSegment != null) {
                    adQualityBridge.setSegment(ironSourceSegment);
                }
            }
            T();
            eo r10 = r();
            if (r10 != null) {
                r10.a(this.f18993m);
            }
            return true;
        } catch (Exception e10) {
            o9.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            eo r11 = r();
            if (r11 != null) {
                r11.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private void b0() {
        this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f18993m.j().d().size(); i10++) {
            String str = this.f18993m.j().d().get(i10);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f18993m.k().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.f18982g0) {
            this.f18986i0 = b(arrayList);
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        for (h.d dVar : this.f18982g0.values()) {
            this.f18986i0.a(dVar);
        }
        this.f18982g0.clear();
    }

    private synchronized void c(boolean z10) {
        this.f19008u = z10;
    }

    private void c0() {
        if (this.G) {
            a0();
        } else {
            d0();
        }
    }

    private void d(Activity activity, String str) {
        try {
            InterstitialPlacement m7 = m(str);
            if (m7 == null) {
                m7 = i();
            }
            if (m7 == null) {
                this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticInterstitial error: empty default placement in response", 3);
                sg.a().a(new IronSourceError(1020, "showProgrammaticInterstitial error: empty default placement in response"), (AdInfo) null);
                return;
            }
            if (activity != null) {
                e(activity);
            } else if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Activity must be provided in showInterstitial when initializing SDK with context", 3);
                sg.a().a(new IronSourceError(510, "Activity must be provided in showInterstitial when initializing SDK with context"), (AdInfo) null);
                return;
            }
            this.S.a(activity, new Placement(m7));
        } catch (Exception e8) {
            o9.d().a(e8);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e8);
        }
    }

    private void d(Context context) {
        AtomicBoolean atomicBoolean = this.f18989k;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        st.a().a(new de(context));
        oj.i().a(context, this.C);
        ar.i().a(context, this.C);
        ip.P.a(context, this.C);
    }

    private void d0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a10 = a(this.f18993m.j().b());
        if (a10.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            a(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.INTERSTITIAL, false);
            return;
        }
        hj hjVar = new hj(a10, this.f18993m.c().d(), IronSourceUtils.getUserIdForNetworks(), qk.b(), this.C);
        this.S = hjVar;
        Boolean bool = this.f19012y;
        if (bool != null) {
            hjVar.a(this.f19011x, bool.booleanValue());
        }
        if (this.f18972b0) {
            this.f18972b0 = false;
            this.S.A();
        }
    }

    private void e(Activity activity) {
        ContextProvider.getInstance().updateActivity(activity);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("activity is updated to: " + activity.hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(android.app.Activity r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 3
            r1 = 0
            com.ironsource.mediationsdk.model.Placement r8 = r6.p(r8)     // Catch: java.lang.Exception -> L29
            if (r8 != 0) goto Lf
            com.ironsource.mediationsdk.model.Placement r8 = r6.j()     // Catch: java.lang.Exception -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L2b
        Lf:
            if (r8 != 0) goto L3b
            java.lang.String r2 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f18983h     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch: java.lang.Exception -> Ld
            r3.log(r4, r2, r0)     // Catch: java.lang.Exception -> Ld
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch: java.lang.Exception -> Ld
            r4 = 1021(0x3fd, float:1.431E-42)
            r3.<init>(r4, r2)     // Catch: java.lang.Exception -> Ld
            com.ironsource.dq r2 = com.ironsource.dq.a()     // Catch: java.lang.Exception -> Ld
            r2.a(r3, r1)     // Catch: java.lang.Exception -> Ld
            return
        L29:
            r2 = move-exception
            r8 = r1
        L2b:
            com.ironsource.o9 r3 = com.ironsource.o9.d()
            r3.a(r2)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r6.f18983h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r5 = "showProgrammaticRewardedVideo()"
            r3.logException(r4, r5, r2)
        L3b:
            if (r7 == 0) goto L41
            r6.e(r7)
            goto L62
        L41:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.app.Activity r2 = r2.getCurrentActiveActivity()
            if (r2 != 0) goto L62
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f18983h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "Activity must be provided in showRewardedVideo when initializing SDK with context"
            r7.log(r8, r2, r0)
            com.ironsource.dq r7 = com.ironsource.dq.a()
            java.lang.String r8 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r8)
            r7.a(r8, r1)
            return
        L62:
            com.ironsource.vq r2 = r6.T
            if (r2 == 0) goto L72
            boolean r3 = r6.Y
            if (r3 != 0) goto L6e
            boolean r3 = r6.f18970a0
            if (r3 == 0) goto L72
        L6e:
            r2.a(r7, r8)
            goto L91
        L72:
            com.ironsource.dg r2 = r6.Q
            if (r2 == 0) goto L7a
            r2.a(r7, r8)
            goto L91
        L7a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f18983h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            r7.log(r8, r2, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r7 = new com.ironsource.mediationsdk.logger.IronSourceError
            r8 = 1023(0x3ff, float:1.434E-42)
            r7.<init>(r8, r2)
            com.ironsource.dq r8 = com.ironsource.dq.a()
            r8.a(r7, r1)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p.e(android.app.Activity, java.lang.String):void");
    }

    private void e0() {
        this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in programmatic mode", 0);
        List<NetworkSettings> a10 = a(this.f18993m.j().d());
        if (a10.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f18976d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        q qVar = new q(a10, this.f18993m.c().f(), n(), IronSourceUtils.getUserIdForNetworks(), qk.b().a(), this.C);
        this.Q = qVar;
        Boolean bool = this.f19012y;
        if (bool != null) {
            qVar.a(this.f19011x, bool.booleanValue());
        }
    }

    private void f0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a10 = a(this.f18993m.j().a());
        if (a10.size() > 0) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
            this.R = new w(a10, new k(n(), IronSourceUtils.getUserIdForNetworks(), this.f18993m.c().c()), qk.b().a(), this.C);
            v();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        a(IronSource.AD_UNIT.BANNER, false);
    }

    private void g0() {
        if (this.F) {
            b0();
            return;
        }
        yq f10 = this.f18993m.c().f();
        this.f18970a0 = f10.k().h();
        this.f18976d0 = a(f10);
        if (this.Y || this.f18970a0) {
            h0();
        } else {
            e0();
        }
    }

    private void h0() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a10 = a(this.f18993m.j().d());
        if (a10.size() <= 0) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f18976d0);
            a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
            b(IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
            a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
            return;
        }
        vq vqVar = new vq(a10, this.f18993m.c().f(), IronSourceUtils.getUserIdForNetworks(), this.Y, qk.b(), this.C);
        this.T = vqVar;
        Boolean bool = this.f19012y;
        if (bool != null) {
            vqVar.a(this.f19011x, bool.booleanValue());
        }
        if (this.Z && this.Y) {
            this.Z = false;
            this.T.A();
        }
    }

    private InterstitialPlacement i() {
        mj d10 = this.f18993m.c().d();
        if (d10 != null) {
            return d10.a();
        }
        return null;
    }

    private Placement j() {
        yq f10 = this.f18993m.c().f();
        if (f10 != null) {
            return f10.a();
        }
        return null;
    }

    private h7 k(String str) {
        h7 a10;
        u6 c10 = this.f18993m.c().c();
        return c10 == null ? new lb() : (TextUtils.isEmpty(str) || (a10 = c10.a(str)) == null) ? c10.i() : a10;
    }

    private ra k() {
        return new ra.b(ar.i(), new ra.a("IronSource"));
    }

    private op.b l(String str) {
        ls lsVar = this.f18993m;
        if (lsVar == null || lsVar.c() == null || this.f18993m.c().d() == null) {
            return op.b.NOT_CAPPED;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = m(str);
            if (interstitialPlacement == null && (interstitialPlacement = i()) == null) {
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return interstitialPlacement == null ? op.b.NOT_CAPPED : a(interstitialPlacement);
    }

    private InterstitialPlacement m(String str) {
        mj d10 = this.f18993m.c().d();
        if (d10 != null) {
            return d10.a(str);
        }
        return null;
    }

    public static p m() {
        return d.f19018a;
    }

    private op.b o(String str) {
        ls lsVar = this.f18993m;
        if (lsVar == null || lsVar.c() == null || this.f18993m.c().f() == null) {
            return op.b.NOT_CAPPED;
        }
        Placement placement = null;
        try {
            placement = p(str);
            if (placement == null && (placement = j()) == null) {
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        return placement == null ? op.b.NOT_CAPPED : a(placement);
    }

    private Placement p(String str) {
        yq f10 = this.f18993m.c().f();
        if (f10 != null) {
            return f10.a(str);
        }
        return null;
    }

    private synchronized eo r() {
        return this.W;
    }

    private boolean u(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private r8 v(String str) {
        IronSourceError ironSourceError;
        String str2;
        r8 r8Var = new r8();
        if (str != null) {
            if (a(str, 5, 10)) {
                str2 = u(str) ? "length should be between 5-10 characters" : "should contain only english characters and numbers";
                return r8Var;
            }
            ironSourceError = ErrorBuilder.buildInvalidCredentialsError("appKey", str, str2);
        } else {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "Init Fail - appKey is missing");
        }
        r8Var.a(ironSourceError);
        return r8Var;
    }

    private void v() {
        if (this.M.booleanValue()) {
            IronLog.INTERNAL.verbose("load banner after init");
            this.M = Boolean.FALSE;
            a(this.N, this.O);
            this.N = null;
            this.O = null;
        }
    }

    private void w() {
        this.f18983h = IronSourceLoggerManager.getLogger(0);
        com.ironsource.mediationsdk.logger.b bVar = new com.ironsource.mediationsdk.logger.b(null, 1);
        this.f18987j = bVar;
        this.f18983h.addLogger(bVar);
        this.f18985i = new yl();
    }

    private boolean x() {
        try {
            Class<?> cls = Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("AdQuality SDK exist: " + cls.getName());
            return true;
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean y() {
        ls lsVar = this.f18993m;
        return (lsVar == null || lsVar.c() == null || this.f18993m.c().c() == null) ? false : true;
    }

    private boolean z() {
        return y() && A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.F || this.G || this.H;
    }

    public boolean F() {
        boolean z10;
        try {
            if (this.G) {
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead", 3);
                return false;
            }
            hj hjVar = this.S;
            boolean z11 = hjVar != null && hjVar.u();
            try {
                oj.i().a(new zb(z11 ? IronSourceConstants.IS_CHECK_READY_TRUE : IronSourceConstants.IS_CHECK_READY_FALSE, IronSourceUtils.getMediationAdditionalData(false, true, 1)));
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "isInterstitialReady():" + z11, 1);
                return z11;
            } catch (Throwable th) {
                z10 = z11;
                th = th;
                o9.d().a(th);
                IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isInterstitialReady():" + z10, 1);
                this.f18983h.logException(ironSourceTag, "isInterstitialReady()", th);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r3.u() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean K() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.F     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L13
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f18983h     // Catch: java.lang.Throwable -> L7e
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch: java.lang.Throwable -> L7e
            return r2
        L13:
            boolean r3 = r9.Y     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L27
            boolean r3 = r9.f18970a0     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L1c
            goto L27
        L1c:
            com.ironsource.dg r3 = r9.Q     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L33
            boolean r3 = r3.d()     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L33
            goto L31
        L27:
            com.ironsource.vq r3 = r9.T     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L33
            boolean r3 = r3.u()     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L33
        L31:
            r3 = r1
            goto L34
        L33:
            r3 = r2
        L34:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch: java.lang.Throwable -> L79
            java.lang.Object[][] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L79
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch: java.lang.Throwable -> L79
            int r7 = r9.f18976d0     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L79
            r6[r1] = r7     // Catch: java.lang.Throwable -> L79
            r5[r2] = r6     // Catch: java.lang.Throwable -> L79
            r9.a(r4, r5)     // Catch: java.lang.Throwable -> L79
            com.ironsource.zb r5 = new com.ironsource.zb     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L55
            r6 = 1101(0x44d, float:1.543E-42)
            goto L57
        L55:
            r6 = 1102(0x44e, float:1.544E-42)
        L57:
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L79
            com.ironsource.ar r4 = com.ironsource.ar.i()     // Catch: java.lang.Throwable -> L79
            r4.a(r5)     // Catch: java.lang.Throwable -> L79
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f18983h     // Catch: java.lang.Throwable -> L79
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r6.<init>()     // Catch: java.lang.Throwable -> L79
            r6.append(r0)     // Catch: java.lang.Throwable -> L79
            r6.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L79
            r4.log(r5, r6, r1)     // Catch: java.lang.Throwable -> L79
            r2 = r3
            goto La4
        L79:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L80
        L7e:
            r3 = move-exception
            r4 = r2
        L80:
            com.ironsource.o9 r5 = com.ironsource.o9.d()
            r5.a(r3)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f18983h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f18983h
            java.lang.String r1 = "isRewardedVideoAvailable()"
            r0.logException(r6, r1, r3)
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p.K():boolean");
    }

    public boolean O() {
        return C();
    }

    public void P() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (this.G) {
                this.f18983h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
            } else if (!this.J) {
                this.f18983h.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
            } else {
                s.d a10 = s.c().a();
                if (a10 == s.d.INIT_FAILED) {
                    this.f18983h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else if (a10 == s.d.INIT_IN_PROGRESS) {
                    if (!s.c().d()) {
                        this.f18972b0 = true;
                        return;
                    }
                    this.f18983h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else if (!E()) {
                    this.f18983h.log(ironSourceTag, "No interstitial configurations found", 3);
                    n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                } else {
                    hj hjVar = this.S;
                    if (hjVar == null) {
                        this.f18972b0 = true;
                    } else {
                        hjVar.A();
                    }
                }
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public void Q() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (this.F) {
                this.f18983h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!this.Y && !this.f18996n0) {
                this.f18983h.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
            } else if (!this.I) {
                this.f18983h.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                s.d a10 = s.c().a();
                if (a10 == s.d.INIT_FAILED) {
                    this.f18983h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (a10 == s.d.INIT_IN_PROGRESS) {
                    if (!s.c().d()) {
                        this.Z = true;
                        return;
                    }
                    this.f18983h.log(ironSourceTag, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (!M()) {
                    this.f18983h.log(ironSourceTag, "No rewarded video configurations found", 3);
                    n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    vq vqVar = this.T;
                    if (vqVar == null) {
                        this.Z = true;
                    } else {
                        vqVar.A();
                    }
                }
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public void R() {
        hj hjVar = this.S;
        if (hjVar != null) {
            hjVar.a((eu) null);
        }
        vq vqVar = this.T;
        if (vqVar != null) {
            vqVar.a((eu) null);
        }
        g6 g6Var = this.U;
        if (g6Var != null) {
            g6Var.a((eu) null);
        }
        this.f18996n0 = false;
    }

    public void S() {
        IronLog.API.info("removing all impression data listeners");
        qk.b().d();
        dg dgVar = this.Q;
        if (dgVar != null) {
            dgVar.c();
        }
        w wVar = this.R;
        if (wVar != null) {
            wVar.c();
        }
    }

    public void U() {
        if (f18968t0) {
            return;
        }
        f18968t0 = true;
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", "false");
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
        } catch (JSONException e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        ar.i().a(new zb(114, mediationAdditionalData));
    }

    public ls a(Context context, String str) {
        if (si.a(context)) {
            d8 c10 = si.c(context);
            String d10 = c10.d();
            String f10 = c10.f();
            String e8 = c10.e();
            if (d10.equals(str)) {
                ls lsVar = new ls(context, d10, f10, e8);
                lsVar.a(ls.a.CACHE);
                return lsVar;
            }
        }
        return null;
    }

    @Override // com.ironsource.qa.a
    public ISDemandOnlyBannerLayout a(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.f18983h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public synchronized IronSourceError a(Context context, String str, boolean z10, InitializationListener initializationListener, eo eoVar, IronSource.AD_UNIT... ad_unitArr) {
        IronLog.INTERNAL.verbose("GitHash: de66667");
        com.ironsource.j.f17882a.a(context);
        if (!fk.a((Object) context, "Init Failed - provided context is null")) {
            d("Provided context is null");
            return new IronSourceError(2000, "Provided context is null");
        }
        this.f18981g.a(context);
        boolean z11 = context instanceof Activity;
        if (z11) {
            e((Activity) context);
        }
        if (initializationListener != null) {
            this.V = initializationListener;
        }
        if (!z10) {
            this.f19000p0.set(true);
        }
        AtomicBoolean atomicBoolean = this.f19007t;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
            if (ad_unitArr != null) {
                a(z11, z10, eoVar != null, ad_unitArr);
                if (C() && !z10) {
                    T();
                }
            } else {
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
            }
            zr b10 = as.f16400a.b();
            if (C()) {
                return new IronSourceError(IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
            } else if (b10 == zr.INIT_FAILED) {
                return new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
            } else if (b10 == zr.NOT_INIT) {
                return new IronSourceError(2020, "Already called new init");
            } else {
                if (eoVar != null) {
                    a(eoVar);
                }
                return new IronSourceError(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
            }
        }
        as.f16400a.a(eoVar == null);
        if ((ad_unitArr == null || ad_unitArr.length == 0) && eoVar == null) {
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                this.f19013z.add(ad_unit);
            }
            this.I = true;
            this.J = true;
            this.K = true;
            this.L = true;
        } else {
            for (IronSource.AD_UNIT ad_unit2 : ad_unitArr) {
                this.f19013z.add(ad_unit2);
                this.A.add(ad_unit2);
                if (ad_unit2.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                    this.J = true;
                }
                if (ad_unit2.equals(IronSource.AD_UNIT.BANNER)) {
                    this.K = true;
                }
                if (ad_unit2.equals(IronSource.AD_UNIT.NATIVE_AD)) {
                    this.L = true;
                }
                if (ad_unit2.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    this.I = true;
                }
            }
        }
        IronLog.API.info("init(appKey:" + str + ")");
        r8 v10 = v(str);
        if (v10.b()) {
            this.f18995n = str;
        }
        ls a10 = a(context, this.f18995n);
        if (a10 != null) {
            IronLog.INTERNAL.verbose("init cache exists");
            a(a10.c().b().e());
        } else {
            IronLog.INTERNAL.verbose("init cache does not exist");
        }
        ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        this.f18975d.a(context.getApplicationContext(), TimeUnit.HOURS.toMillis(xa.f21388a.d()));
        this.f18992l0.f(IronSourceUtils.getSDKVersion());
        this.f18992l0.a(fg.a());
        this.f18992l0.b(IronSourceUtils.isGooglePlayInstalled(context));
        this.f18992l0.a(k1.a());
        V();
        d(context);
        if (this.f18995n == null) {
            s.c().f();
            if (this.f19013z.contains(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                dq.a().a(false, (AdInfo) null);
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, v10.a().toString(), 1);
            return new IronSourceError(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, "App key is null");
        }
        this.f18992l0.a(context);
        this.f18992l0.b(this.f18995n);
        this.f18992l0.h(this.f19010w);
        this.f18992l0.g(ConfigFile.getConfigFile().getPluginType());
        if (this.B) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z10);
            if (ad_unitArr != null) {
                for (IronSource.AD_UNIT ad_unit3 : ad_unitArr) {
                    try {
                        mediationAdditionalData.put(ad_unit3.toString(), true);
                    } catch (Exception e8) {
                        o9.d().a(e8);
                    }
                }
            }
            int i10 = this.E + 1;
            this.E = i10;
            a(z11, z10, i10, mediationAdditionalData, eoVar != null);
            this.B = false;
        }
        return null;
    }

    op.b a(InterstitialPlacement interstitialPlacement) {
        return this.f18977e.a(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
    }

    op.b a(Placement placement) {
        return this.f18977e.a(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO);
    }

    @Override // com.ironsource.qa
    public String a(Context context) {
        dv j10;
        ra k10 = k();
        zr a10 = as.f16400a.a();
        k10.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, a10);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            k10.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (zr) null);
            return null;
        } else if (a10 == zr.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            return null;
        } else {
            s.c().g();
            ls lsVar = this.f18993m;
            boolean e8 = (lsVar == null || (j10 = lsVar.c().b().j()) == null) ? true : j10.e();
            this.f18992l0.b(context);
            JSONObject a11 = new cv().a(context);
            com.ironsource.mediationsdk.d.b().a(a11, true);
            String jSONObject = a11.toString();
            String compressAndEncrypt = e8 ? IronSourceAES.compressAndEncrypt(jSONObject) : IronSourceAES.encrypt(jSONObject);
            if (compressAndEncrypt == null) {
                k10.a(IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (zr) null);
            }
            return compressAndEncrypt;
        }
    }

    String a(String str, op.b bVar) {
        if (bVar == null) {
            return null;
        }
        int i10 = b.f19017c[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return "placement " + str + " is capped";
        }
        return null;
    }

    HashSet<String> a(String str, String str2) {
        ls lsVar = this.f18993m;
        return lsVar == null ? new HashSet<>() : lsVar.k().a(str, str2);
    }

    public synchronized List<IronSource.AD_UNIT> a(Context context, String str, boolean z10, IronSource.AD_UNIT... ad_unitArr) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if ((ad_unitArr == null || ad_unitArr.length == 0) && z10) {
            if (this.I) {
                a(IronSource.AD_UNIT.REWARDED_VIDEO);
            } else {
                this.F = true;
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            }
            if (this.J) {
                a(IronSource.AD_UNIT.INTERSTITIAL);
            } else {
                this.G = true;
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            }
            if (this.K) {
                a(IronSource.AD_UNIT.BANNER);
            } else {
                this.H = true;
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
        } else {
            for (IronSource.AD_UNIT ad_unit : ad_unitArr) {
                if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                    if (this.J) {
                        a(ad_unit);
                    } else {
                        this.G = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
                if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                    if (this.I) {
                        a(ad_unit);
                    } else {
                        this.F = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
                if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                    if (this.K) {
                        a(ad_unit);
                    } else {
                        this.H = true;
                        if (!arrayList.contains(ad_unit)) {
                            arrayList.add(ad_unit);
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof Activity) {
                e((Activity) context);
            }
            ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        return arrayList;
    }

    @Override // com.ironsource.mo
    public void a() {
        if (this.M.booleanValue()) {
            this.M = Boolean.FALSE;
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
            this.N = null;
            this.O = null;
        }
        if (this.f18972b0) {
            this.f18972b0 = false;
            n.a().b(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.Z) {
            this.Z = false;
            n.a().b(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f18978e0) {
            for (h.d dVar : this.f18978e0.values()) {
                String c10 = dVar.c();
                this.f19004r0.a(c10).onInterstitialAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.f18978e0.clear();
        }
        synchronized (this.f18982g0) {
            for (h.d dVar2 : this.f18982g0.values()) {
                String c11 = dVar2.c();
                this.f19006s0.a(c11).onRewardedVideoAdLoadFailed(c11, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f18982g0.clear();
        }
        synchronized (this.f18980f0) {
            for (h.b bVar : this.f18980f0.values()) {
                ISDemandOnlyBannerLayout g10 = bVar.g();
                if (g10 != null) {
                    g10.getListener().a(bVar.c(), ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.f18980f0.clear();
        }
    }

    public void a(long j10, ls.a aVar) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(B());
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j10);
            mediationAdditionalData.put("sessionDepth", this.E);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, aVar.a());
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
        ar.i().a(new zb(IronSourceConstants.INIT_COMPLETE, mediationAdditionalData));
    }

    public void a(Activity activity) {
        try {
            if (FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                return;
            }
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            o9.d().a(th);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    @Override // com.ironsource.qa.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        h.b a10 = new h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError a11 = a10.a();
        if (a11 != null) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, a11.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, a11);
            }
            return;
        }
        IronSourceError a12 = a(s.c().a());
        if (a12 != null) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, a12.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, a12);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(a10)) {
            return;
        }
        if (!z()) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else if (b(a10)) {
        } else {
            this.f18988j0.a(iSDemandOnlyBannerLayout, str);
        }
    }

    @Override // com.ironsource.qa.a
    public synchronized void a(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        h.b a10 = new h.c().b(str).a(activity).a(true).a(str2).a(iSDemandOnlyBannerLayout).a(IronSource.AD_UNIT.BANNER).a();
        IronSourceError a11 = a10.a();
        if (a11 != null) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, a11.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, a11);
            }
            return;
        }
        IronSourceError a12 = a(s.c().a());
        if (a12 != null) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, a12.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, a12);
            return;
        }
        ContextProvider.getInstance().updateActivity(activity);
        if (a(a10)) {
            return;
        }
        if (!z()) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else if (b(a10)) {
        } else {
            this.f18988j0.a(iSDemandOnlyBannerLayout, str, str2);
        }
    }

    @Override // com.ironsource.qa.b
    public synchronized void a(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).b(), this.f19004r0.a(str));
    }

    @Override // com.ironsource.qa.c
    public synchronized void a(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(str2).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.f19006s0.a(str));
    }

    public synchronized void a(Context context, String str, boolean z10, InitializationListener initializationListener, IronSource.AD_UNIT... ad_unitArr) {
        if (a(context, str, z10, initializationListener, null, ad_unitArr) == null) {
            s.c().a(this);
            s.c().a(this.f18990k0);
            s.c().a(context, str, this.f18997o, ad_unitArr);
        }
    }

    @Override // com.ironsource.qa
    public synchronized void a(Context context, String str, IronSource.AD_UNIT... ad_unitArr) {
        List<IronSource.AD_UNIT> a10 = a(context, str, true, ad_unitArr);
        if (!a10.isEmpty()) {
            a(context, str, true, (InitializationListener) null, (IronSource.AD_UNIT[]) a10.toArray(new IronSource.AD_UNIT[a10.size()]));
        }
    }

    @Override // com.ironsource.zj
    public void a(Context context, boolean z10) {
        this.f19011x = context;
        this.f19012y = Boolean.valueOf(z10);
        hj hjVar = this.S;
        if (hjVar != null) {
            hjVar.a(context, z10);
        }
        if (this.f18970a0) {
            vq vqVar = this.T;
            if (vqVar != null) {
                vqVar.a(context, z10);
                return;
            }
            return;
        }
        dg dgVar = this.Q;
        if (dgVar != null) {
            dgVar.a(context, z10);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, eu euVar) {
        g6 g6Var;
        vq vqVar;
        hj hjVar;
        if (this.f18996n0) {
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL && (hjVar = this.S) != null) {
                hjVar.a(euVar);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO && (vqVar = this.T) != null) {
                vqVar.a(euVar);
            }
            if (ad_unit != IronSource.AD_UNIT.BANNER || (g6Var = this.U) == null) {
                return;
            }
            g6Var.a(euVar);
        }
    }

    public void a(IronSource.AD_UNIT ad_unit, WaterfallConfiguration waterfallConfiguration) {
        if (ad_unit == null) {
            IronLog.API.error("AdUnit should not be null.");
            return;
        }
        IronLog ironLog = IronLog.API;
        Object[] objArr = new Object[2];
        objArr[0] = ad_unit.name();
        objArr[1] = waterfallConfiguration == null ? "NULL" : waterfallConfiguration.toString();
        ironLog.info(String.format("(%s, %s)", objArr));
        zb zbVar = new zb(53, IronSourceUtils.getMediationAdditionalData(false));
        zbVar.a(IronSourceConstants.EVENTS_EXT1, waterfallConfiguration == null ? "" : waterfallConfiguration.toJsonString());
        ar.i().a(zbVar, ad_unit);
        this.f18992l0.a(ad_unit, waterfallConfiguration);
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        g6 g6Var;
        this.f18983h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!this.f18974c0 || (g6Var = this.U) == null) {
                w wVar = this.R;
                if (wVar != null) {
                    wVar.a(ironSourceBannerLayout);
                }
            } else {
                g6Var.a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placementName = " + str);
        if (this.H) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildInitFailedError("Banner was initialized in demand only mode. Use loadISDemandOnlyBanner instead", "Banner"));
        } else if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("loadBanner can't be called - ");
            sb.append(ironSourceBannerLayout == null ? "banner layout is null " : "banner layout is destroyed");
            String sb2 = sb.toString();
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, sb2, 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError(sb2));
        } else if (!this.K) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadBanner()", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.buildLoadFailedError("init() must be called before loadBanner()"));
        } else if (ironSourceBannerLayout.getSize().getDescription().equals(l.f18875f) && (ironSourceBannerLayout.getSize().getWidth() <= 0 || ironSourceBannerLayout.getSize().getHeight() <= 0)) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "loadBanner: Unsupported banner size. Height and width must be bigger than 0", 3);
            n.a().b(IronSource.AD_UNIT.BANNER, ErrorBuilder.unsupportedBannerSize(""));
        } else {
            s.d a10 = s.c().a();
            if (a10 == s.d.INIT_FAILED) {
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(600, "Init() had failed"));
            } else if (a10 == s.d.INIT_IN_PROGRESS) {
                if (s.c().d()) {
                    this.f18983h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Init() had failed"));
                    return;
                }
                this.N = ironSourceBannerLayout;
                this.M = Boolean.TRUE;
                this.O = str;
            } else if (!z()) {
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
                n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "the server response does not contain banner data"));
            } else {
                w wVar = this.R;
                if (wVar == null && this.U == null) {
                    this.N = ironSourceBannerLayout;
                    this.M = Boolean.TRUE;
                    this.O = str;
                } else if (this.f18974c0) {
                    this.U.a(ironSourceBannerLayout, new Placement(k(str)));
                } else {
                    wVar.a(ironSourceBannerLayout, k(str));
                }
            }
        }
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.C = ironSourceSegment;
        vq vqVar = this.T;
        if (vqVar != null) {
            vqVar.a(ironSourceSegment);
        }
        dg dgVar = this.Q;
        if (dgVar != null) {
            dgVar.a(ironSourceSegment);
        }
        hj hjVar = this.S;
        if (hjVar != null) {
            hjVar.a(ironSourceSegment);
        }
        w wVar = this.R;
        if (wVar != null) {
            wVar.a(ironSourceSegment);
        }
        g6 g6Var = this.U;
        if (g6Var != null) {
            g6Var.a(ironSourceSegment);
        }
        AdQualityBridge adQualityBridge = this.f18998o0;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(ironSourceSegment);
        }
        oj.i().a(this.C);
        ar.i().a(this.C);
        ip.P.a(this.C);
    }

    @Override // com.ironsource.qa.b
    public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.f19004r0.a((mg<ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.qa.c
    public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.f19006s0.a((mg<ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    void a(h.d dVar, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        String c10 = dVar.c();
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + c10);
        try {
            if (!this.I) {
                ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c10, new IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            } else if (!this.F) {
                ironLog.error("Rewarded video was initialized in mediation mode");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c10, new IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            } else {
                s.d a10 = s.c().a();
                if (a10 == s.d.INIT_FAILED) {
                    ironLog.error("init() had failed");
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                IronSourceError a11 = dVar.a();
                if (a11 != null) {
                    if (a11.getErrorCode() == 1060) {
                        b(81321, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                    }
                    ironLog.error(a11.toString());
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c10, a11);
                    return;
                }
                e(dVar.e());
                if (a10 == s.d.INIT_IN_PROGRESS) {
                    if (s.c().d()) {
                        ironLog.error("init() had failed");
                        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    synchronized (this.f18982g0) {
                        this.f18982g0.put(c10, dVar);
                    }
                    if (TextUtils.isEmpty(dVar.b())) {
                        return;
                    }
                    b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                } else if (!M()) {
                    ironLog.error("No rewarded video configurations found");
                    iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c10, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    synchronized (this.f18982g0) {
                        com.ironsource.mediationsdk.demandOnly.k kVar = this.f18986i0;
                        if (kVar != null) {
                            kVar.a(dVar);
                            return;
                        }
                        this.f18982g0.put(c10, dVar);
                        if (!TextUtils.isEmpty(dVar.b())) {
                            b(IronSourceConstants.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, IronSourceUtils.getMediationAdditionalData(true, !TextUtils.isEmpty(dVar.b()), 1));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(c10, new IronSourceError(510, th.getMessage()));
        }
    }

    @Override // com.ironsource.ji
    public void a(ImpressionDataListener impressionDataListener) {
        if (fk.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            qk.b().b(impressionDataListener);
            dg dgVar = this.Q;
            if (dgVar != null) {
                dgVar.a(impressionDataListener);
            }
            w wVar = this.R;
            if (wVar != null) {
                wVar.a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    @Override // com.ironsource.im
    public void a(LogListener logListener) {
        if (logListener == null) {
            this.f18983h.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        this.f18987j.a(logListener);
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        IronLog.API.info();
        sg.a().a(levelPlayInterstitialListener);
    }

    public void a(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        IronLog.API.info();
        dq.a().a(levelPlayRewardedVideoListener);
    }

    public synchronized void a(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        String str;
        IronLog ironLog = IronLog.API;
        ironLog.info();
        if (!this.I) {
            if (levelPlayRewardedVideoManualListener == null) {
                this.Y = false;
                str = "Disabling rewarded video manual mode";
            } else {
                this.Y = true;
                str = "Enabling rewarded video manual mode";
            }
            ironLog.info(str);
        }
        dq.a().a(levelPlayRewardedVideoManualListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SegmentListener segmentListener) {
        yl ylVar = this.f18985i;
        if (ylVar != null) {
            ylVar.a(segmentListener);
            s.c().a(this.f18985i);
        }
    }

    @Override // com.ironsource.qa.c
    public synchronized void a(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.info("instanceId=" + str);
        ISDemandOnlyRewardedVideoListener a10 = this.f19006s0.a(str);
        try {
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.API.error(e8.getMessage());
            if (a10 != null) {
                a10.onRewardedVideoAdShowFailed(str, new IronSourceError(510, e8.getMessage()));
            }
        }
        if (!this.F) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            a10.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.f18986i0;
        if (kVar != null) {
            kVar.b(str);
            return;
        }
        ironLog.error("Rewarded video was not initiated");
        a10.onRewardedVideoAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
    }

    public void a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            ironLog.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            ironLog.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                com.ironsource.mediationsdk.c.b().a(metaDataKey, metaDataValue);
            } else if (C() && MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                ironLog.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                qk.b().a(metaDataKey, metaDataValue);
            }
            try {
                ConcurrentHashMap<String, List<String>> c10 = com.ironsource.mediationsdk.c.b().c();
                c10.putAll(qk.b().c());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, List<String>> entry : c10.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                this.f18994m0.a(jSONObject);
                this.f18992l0.a(jSONObject);
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("got the following error " + e8.getMessage());
            }
            ar.i().a(new zb(C() ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (fk.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && fk.a((Object) str, "setAdRevenueData - dataSource is null")) {
            this.f18990k0.a(str, jSONObject);
        }
    }

    @Override // com.ironsource.mo
    public void a(List<IronSource.AD_UNIT> list, boolean z10, s8 s8Var) {
        b(list, z10, s8Var);
    }

    @Override // com.ironsource.zj
    public void a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                this.f18983h.log(IronSourceLogger.IronSourceTag.API, this.f18969a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                this.f19003r = new HashMap(map);
            } catch (Exception e8) {
                o9.d().a(e8);
                IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, this.f18969a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e8);
            }
        }
    }

    @Override // com.ironsource.zj
    public void a(boolean z10) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z10, 1);
        com.ironsource.mediationsdk.c.b().a(z10);
    }

    boolean a(h7 h7Var) {
        return this.f18977e.b(ContextProvider.getInstance().getApplicationContext(), h7Var, IronSource.AD_UNIT.BANNER);
    }

    public boolean a(boolean z10, ls lsVar) {
        if (C()) {
            return true;
        }
        synchronized (this.f18991l) {
            this.f18993m = lsVar;
        }
        return b(lsVar.g(), z10, lsVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ls b(Context context, String str, c cVar) {
        synchronized (this.f18991l) {
            ls lsVar = this.f18993m;
            if (lsVar != null) {
                return new ls(lsVar);
            }
            ls a10 = a(context, str, cVar);
            if (a10 == null || !a10.p()) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                a10 = a(context, n());
                if (a10 != null) {
                    IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(n(), str);
                    IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
                    ironSourceLoggerManager.log(ironSourceTag, buildUsingCachedConfigurationError.toString() + ": " + a10.toString(), 1);
                    ar.i().a(new zb(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
                }
            }
            if (a10 != null) {
                this.f18993m = a10;
                IronSourceUtils.saveLastResponse(context, a10.toString());
                b(this.f18993m, context);
                oj.i().c(true);
                ar.i().c(true);
                ip.P.c(true);
            }
            return a10;
        }
    }

    public IronSourceBannerLayout b(Activity activity, ISBannerSize iSBannerSize) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.f18983h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    @Override // com.ironsource.zj
    public String b(Context context) {
        String p10 = this.f18973c.p(context);
        return !TextUtils.isEmpty(p10) ? p10 : "";
    }

    @Override // com.ironsource.zj
    public void b() {
        this.f19003r = null;
    }

    public void b(Activity activity) {
        IronLog ironLog = IronLog.API;
        ironLog.info("onResume()");
        try {
            if (!FeaturesManager.getInstance().getStopUseOnResumeAndPause()) {
                ContextProvider.getInstance().onResume(activity);
                return;
            }
            ironLog.info("onResume() is disabled");
        } catch (Throwable th) {
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
            o9.d().a(th);
        }
    }

    @Override // com.ironsource.qa.c
    public synchronized void b(Activity activity, String str) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.REWARDED_VIDEO).b(), this.f19006s0.a(str));
    }

    @Override // com.ironsource.qa.b
    public synchronized void b(Activity activity, String str, String str2) {
        a(new h.c().b(str).a(activity, ContextProvider.getInstance().getCurrentActiveActivity()).a(IronSource.AD_UNIT.INTERSTITIAL).a(true).a(str2).b(), this.f19004r0.a(str));
    }

    public void b(ls lsVar, Context context) {
        a(lsVar);
        a(lsVar, context);
    }

    public void b(IronSourceBannerLayout ironSourceBannerLayout) {
        a(ironSourceBannerLayout, "");
    }

    @Override // com.ironsource.ji
    public void b(ImpressionDataListener impressionDataListener) {
        if (fk.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            qk.b().a(impressionDataListener);
            dg dgVar = this.Q;
            if (dgVar != null) {
                dgVar.b(impressionDataListener);
            }
            w wVar = this.R;
            if (wVar != null) {
                wVar.b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    @Override // com.ironsource.qa.b
    public void b(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        ISDemandOnlyInterstitialListener a10 = this.f19004r0.a(str);
        try {
            if (!this.G) {
                IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                a10.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.f18984h0;
            if (fVar != null) {
                fVar.a(str);
                return;
            }
            IronLog.API.error("Interstitial was not initiated");
            a10.onInterstitialAdShowFailed(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated"));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.API.error(e8.getMessage());
            if (a10 != null) {
                a10.onInterstitialAdShowFailed(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void b(String str, JSONObject jSONObject) {
        v vVar = new v(str, jSONObject);
        IronLog.API.verbose(vVar.toString());
        com.ironsource.mediationsdk.c.b().a(vVar);
    }

    public void b(boolean z10) {
        this.P = Boolean.valueOf(z10);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z10, 1);
        com.ironsource.mediationsdk.c.b().b(z10);
        this.f18992l0.a(z10);
        ar.i().a(new zb(z10 ? 40 : 41, IronSourceUtils.getMediationAdditionalData(false)));
    }

    @Override // com.ironsource.zj
    public void c() {
        this.f18983h.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        dq.a().a((LevelPlayRewardedVideoBaseListener) null);
    }

    public void c(Activity activity) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (this.G) {
                this.f18983h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                sg.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!D()) {
                sg.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            } else {
                InterstitialPlacement i10 = i();
                if (i10 != null) {
                    c(activity, i10.getPlacementName());
                } else {
                    sg.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e8);
            sg.a().a(new IronSourceError(510, e8.getMessage()), (AdInfo) null);
        }
    }

    public void c(Activity activity, String str) {
        String str2 = "showInterstitial(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.G) {
                this.f18983h.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                sg.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (D()) {
                d(activity, str);
            } else {
                sg.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), (AdInfo) null);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, str2, e8);
            sg.a().a(new IronSourceError(510, e8.getMessage()), (AdInfo) null);
        }
    }

    public void c(Context context) {
        zt ztVar = zt.f21716a;
        ztVar.b();
        if (!C()) {
            ztVar.a(IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
        } else if (!b(this.f18993m)) {
            ztVar.a(IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            IronLog.API.error("TestSuite cannot be launched, Please contact your account manager to enable it");
        } else if (!IronSourceUtils.isNetworkConnected(context)) {
            ztVar.a(IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            IronLog.API.error("TestSuite cannot be launched, No network connectivity");
        } else {
            hj hjVar = this.S;
            if (hjVar != null) {
                hjVar.J();
            }
            vq vqVar = this.T;
            if (vqVar != null) {
                vqVar.J();
            }
            g6 g6Var = this.U;
            if (g6Var != null) {
                g6Var.J();
                this.U.T();
            }
            new au().a(context, n(), this.f18993m.i(), IronSourceUtils.getSDKVersion(), this.f18993m.c().g().b(), g(), this.Y);
            this.f18996n0 = true;
            ztVar.c();
        }
    }

    @Override // com.ironsource.qa.a
    public void c(String str) {
        this.f18983h.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.f18988j0;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (Throwable th) {
            o9.d().a(th);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.ironsource.zj
    public void d() {
        this.f18983h.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        sg.a().a((LevelPlayInterstitialListener) null);
    }

    public void d(Activity activity) {
        if (!L()) {
            dq.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement j10 = j();
        if (j10 != null) {
            f(activity, j10.getPlacementName());
            return;
        }
        this.f18983h.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        dq.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    @Override // com.ironsource.mo
    public void d(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f18985i != null) {
                for (IronSource.AD_UNIT ad_unit : this.f19013z) {
                    a(ad_unit, true);
                }
            }
            eo r10 = r();
            if (r10 != null) {
                r10.onInitFailed(new IronSourceError(IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public String e() {
        String str;
        if (this.L) {
            s c10 = s.c();
            int i10 = b.f19016b[c10.a().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    str = "";
                } else if (!c10.d()) {
                    str = "init() not finished yet";
                }
            }
            str = "init() had failed";
        } else {
            str = "init() must be called first";
        }
        return (I() || !str.isEmpty()) ? str : "No Native Ad configurations found";
    }

    @Override // com.ironsource.zj
    public boolean e(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, this.f18969a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            r8 r8Var = new r8();
            a(str, r8Var);
            if (!r8Var.b()) {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, r8Var.a().toString(), 2);
                return false;
            }
            this.f19001q = str;
            ar.i().a(new zb(52, IronSourceUtils.getJsonForUserId(true)));
            return true;
        } catch (Exception e8) {
            o9.d().a(e8);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, this.f18969a + ":setDynamicUserId(dynamicUserId:" + str + ")", e8);
            return false;
        }
    }

    public an f() {
        IronLog.INTERNAL.verbose();
        List<NetworkSettings> a10 = a(this.f18993m.j().c());
        if (a10.size() > 0) {
            return new an(a10, this.f18993m.c().e(), IronSourceUtils.getUserIdForNetworks(), qk.b(), this.C);
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        a(IronSourceConstants.TROUBLESHOOTING_NT_INIT_FAILED, mediationAdditionalData);
        return null;
    }

    public void f(Activity activity, String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, str2, 1);
        try {
            if (this.F) {
                this.f18983h.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                dq.a().a(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            } else if (L()) {
                e(activity, str);
            } else {
                dq.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, str2, e8);
            dq.a().a(new IronSourceError(510, e8.getMessage()), (AdInfo) null);
        }
    }

    @Override // com.ironsource.qa.b
    public synchronized boolean f(String str) {
        boolean z10;
        com.ironsource.mediationsdk.demandOnly.f fVar = this.f18984h0;
        if (fVar != null) {
            z10 = fVar.b(str);
        }
        return z10;
    }

    @Override // com.ironsource.zj
    public InterstitialPlacement g(String str) {
        InterstitialPlacement interstitialPlacement;
        try {
            interstitialPlacement = m(str);
            if (interstitialPlacement == null) {
                try {
                    this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    interstitialPlacement = i();
                } catch (Exception e8) {
                    e = e8;
                    o9.d().a(e);
                    return interstitialPlacement;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + interstitialPlacement, 1);
        } catch (Exception e10) {
            e = e10;
            interstitialPlacement = null;
        }
        return interstitialPlacement;
    }

    Boolean g() {
        return this.P;
    }

    public ls h() {
        return this.f18993m;
    }

    @Override // com.ironsource.zj
    public void h(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f18969a + ":setMediationType(mediationType:" + str + ")", 1);
            if (a(str, 1, 64) && u(str)) {
                this.f19005s = str;
                this.f18992l0.e(str);
            } else {
                this.f18983h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            this.f18983h.logException(IronSourceLogger.IronSourceTag.API, this.f18969a + ":setMediationType(mediationType:" + str + ")", e8);
        }
    }

    @Override // com.ironsource.zj
    public Placement i(String str) {
        Placement placement;
        try {
            placement = p(str);
            if (placement == null) {
                try {
                    this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    placement = j();
                } catch (Exception e8) {
                    e = e8;
                    o9.d().a(e);
                    return placement;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f18983h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + placement, 1);
        } catch (Exception e10) {
            e = e10;
            placement = null;
        }
        return placement;
    }

    @Override // com.ironsource.qa.c
    public synchronized boolean j(String str) {
        boolean z10;
        com.ironsource.mediationsdk.demandOnly.k kVar = this.f18986i0;
        if (kVar != null) {
            z10 = kVar.a(str);
        }
        return z10;
    }

    public String l() {
        return this.f19001q;
    }

    public cn n(String str) {
        cn a10;
        rm e8 = this.f18993m.c().e();
        if (e8 == null) {
            return null;
        }
        return (TextUtils.isEmpty(str) || (a10 = e8.a(str)) == null) ? e8.e() : a10;
    }

    public String n() {
        return this.f18995n;
    }

    public String o() {
        return this.f18997o;
    }

    public List<IronSource.AD_UNIT> p() {
        ArrayList arrayList = new ArrayList();
        Set<IronSource.AD_UNIT> set = this.f19013z;
        if (set != null) {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    public String q() {
        return this.f19005s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q(String str) {
        if (y()) {
            h7 h7Var = null;
            try {
                h7Var = this.f18993m.c().c().a(str);
                if (h7Var == null && (h7Var = this.f18993m.c().c().i()) == null) {
                    this.f18983h.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                    return false;
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
            if (h7Var == null) {
                return false;
            }
            return a(h7Var);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(String str) {
        if (this.G) {
            return false;
        }
        boolean z10 = l(str) != op.b.NOT_CAPPED;
        if (z10) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.G, true, 1);
            try {
                mediationAdditionalData.put("placement", str);
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            } catch (Exception e8) {
                o9.d().a(e8);
            }
            oj.i().a(new zb(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z10;
    }

    public Map<String, String> s() {
        return this.f19003r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(String str) {
        int i10;
        op.b o10 = o(str);
        boolean z10 = true;
        if (o10 == null || ((i10 = b.f19017c[o10.ordinal()]) != 1 && i10 != 2 && i10 != 3)) {
            z10 = false;
        }
        a(z10, str);
        return z10;
    }

    public IronSourceSegment t() {
        return this.C;
    }

    public void t(String str) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str);
        this.f18997o = str;
        ar.i().a(new zb(52, IronSourceUtils.getJsonForUserId(false)));
        AdQualityBridge adQualityBridge = this.f18998o0;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public String u() {
        return this.f19010w;
    }
}
