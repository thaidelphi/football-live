package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.ai;
import com.ironsource.bg;
import com.ironsource.e2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.o2;
import com.ironsource.q7;
import com.ironsource.z7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class n7<Smash extends q7<?>, Listener extends AdapterAdListener> implements r2, s4, d2, fm, Cdo, p, bw, x7, tp {
    private AdInfo A;
    private qk B;
    final ai C;
    final ai.a D;
    protected final bg E;
    private final bg.a F;
    private boolean G;
    private eu H;
    private AtomicBoolean I;
    private yj J;

    /* renamed from: a  reason: collision with root package name */
    protected aw<Smash> f19346a;

    /* renamed from: b  reason: collision with root package name */
    protected ConcurrentHashMap<String, h.a> f19347b;

    /* renamed from: c  reason: collision with root package name */
    protected com.ironsource.mediationsdk.e f19348c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ironsource.mediationsdk.h f19349d;

    /* renamed from: e  reason: collision with root package name */
    protected int f19350e;

    /* renamed from: f  reason: collision with root package name */
    protected String f19351f;

    /* renamed from: g  reason: collision with root package name */
    protected JSONObject f19352g;

    /* renamed from: h  reason: collision with root package name */
    protected m5 f19353h;

    /* renamed from: i  reason: collision with root package name */
    protected Placement f19354i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f19355j;

    /* renamed from: k  reason: collision with root package name */
    private NetworkStateReceiver f19356k;

    /* renamed from: l  reason: collision with root package name */
    protected qs f19357l;

    /* renamed from: m  reason: collision with root package name */
    protected ib f19358m;

    /* renamed from: n  reason: collision with root package name */
    protected ib f19359n;

    /* renamed from: o  reason: collision with root package name */
    protected u0 f19360o;

    /* renamed from: p  reason: collision with root package name */
    protected f f19361p;

    /* renamed from: q  reason: collision with root package name */
    protected q2 f19362q;

    /* renamed from: r  reason: collision with root package name */
    protected nc f19363r;

    /* renamed from: s  reason: collision with root package name */
    protected e2 f19364s;

    /* renamed from: t  reason: collision with root package name */
    protected l2 f19365t;

    /* renamed from: u  reason: collision with root package name */
    protected s f19366u;

    /* renamed from: v  reason: collision with root package name */
    protected IronSourceSegment f19367v;

    /* renamed from: w  reason: collision with root package name */
    protected UUID f19368w;

    /* renamed from: x  reason: collision with root package name */
    protected final Object f19369x;

    /* renamed from: y  reason: collision with root package name */
    private long f19370y;

    /* renamed from: z  reason: collision with root package name */
    private Boolean f19371z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a extends hr {
        a() {
        }

        @Override // com.ironsource.hr
        public void a() {
            n7.this.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NetworkSettings f19373a;

        b(NetworkSettings networkSettings) {
            this.f19373a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            n7.this.c(this.f19373a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            n7.this.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n7.this.f19352g = new JSONObject();
            n7.this.f19364s.f17169i.a();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            n7.this.b(hashMap, arrayList, sb, arrayList2);
            n7.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e implements z7.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f19378b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f19379c;

        e(Map map, StringBuilder sb, List list) {
            this.f19377a = map;
            this.f19378b = sb;
            this.f19379c = list;
        }

        @Override // com.ironsource.z7.b
        public void a(List<a8> list, long j10, List<String> list2) {
            n7.this.f19364s.f17168h.a(j10);
            for (a8 a8Var : list) {
                NetworkSettings a10 = n7.this.f19360o.a(a8Var.c());
                Map<String, Object> b10 = n7.this.b(a10, com.ironsource.mediationsdk.c.b().b(a10, n7.this.f19360o.b(), n7.this.k()));
                if (a8Var.a() != null) {
                    this.f19377a.put(a8Var.c(), a8Var.a());
                    StringBuilder sb = this.f19378b;
                    sb.append(a8Var.d());
                    sb.append(a8Var.c());
                    sb.append(",");
                    n7.this.f19364s.f17168h.a(b10, a8Var.e());
                } else {
                    n7.this.f19364s.f17168h.a(b10, a8Var.e(), a8Var.b());
                }
            }
            for (String str : list2) {
                NetworkSettings a11 = n7.this.f19360o.a(str);
                n7.this.f19364s.f17168h.b(n7.this.b(a11, com.ironsource.mediationsdk.c.b().b(a11, n7.this.f19360o.b(), n7.this.k())), j10);
            }
            n7.this.a(this.f19377a, this.f19379c, this.f19378b.toString());
        }

        @Override // com.ironsource.z7.b
        public void onFailure(String str) {
            n7.this.f19364s.f17168h.a(str);
            n7.this.a(this.f19377a, this.f19379c, this.f19378b.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public n7(u0 u0Var, qk qkVar, IronSourceSegment ironSourceSegment) {
        this(mm.S(), mm.M(), u0Var, qkVar, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n7(xf xfVar, wf wfVar, u0 u0Var, qk qkVar, IronSourceSegment ironSourceSegment) {
        this.f19351f = "";
        this.f19355j = false;
        this.f19369x = new Object();
        this.f19370y = 0L;
        this.I = new AtomicBoolean(false);
        this.f19368w = UUID.randomUUID();
        this.C = xfVar.k();
        this.D = wfVar.e();
        this.E = xfVar.B();
        this.F = wfVar.m();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + u0Var.b() + ", loading mode = " + u0Var.h().a());
        StringBuilder sb = new StringBuilder();
        sb.append(u0Var.b());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.sendAutomationLog(sb.toString());
        ib ibVar = new ib();
        this.J = a(u0Var);
        this.f19367v = ironSourceSegment;
        this.f19360o = u0Var;
        this.f19364s = new e2(u0Var.b(), e2.b.MEDIATION, this);
        this.f19365t = g();
        this.f19362q = h();
        a(f.NONE);
        this.B = qkVar;
        this.f19346a = new aw<>(this.f19360o.d().f(), this.f19360o.d().i(), this);
        this.f19364s.f17166f.a(o(), this.f19360o.h().a().toString());
        this.f19347b = new ConcurrentHashMap<>();
        this.f19354i = null;
        G();
        this.f19352g = new JSONObject();
        if (this.f19360o.q()) {
            this.f19348c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.f19360o.d(), IronSourceUtils.getSessionId()));
        }
        this.f19349d = new com.ironsource.mediationsdk.h(this.f19360o.j(), this.f19360o.d().c());
        s();
        r();
        this.f19358m = new ib();
        a(f.READY_TO_LOAD);
        this.f19363r = new nc(u0Var.a(), this);
        this.f19366u = new s();
        this.f19364s.f17166f.a(ib.a(ibVar));
        if (this.f19360o.h().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.f19369x) {
            if (this.f19360o.h().e() && this.f19357l.a()) {
                ironLog.verbose(b("all smashes are capped"));
                a(a2.a(this.f19360o.b()), "all smashes are capped", false);
            } else if (!t() && this.f19361p == f.SHOWING) {
                IronLog.API.error(b("load cannot be invoked while showing an ad"));
                a(new IronSourceError(a2.d(this.f19360o.b()), "load cannot be invoked while showing an ad"));
            } else if (this.f19360o.h().a() != o2.a.AUTOMATIC_LOAD_WHILE_SHOW && this.f19360o.h().a() != o2.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.f19361p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.n.a().b(this.f19360o.b()))) {
                IronLog.API.error(b("load is already in progress"));
            } else {
                this.f19352g = new JSONObject();
                F();
                if (v()) {
                    this.f19364s.f17167g.a();
                } else {
                    this.f19364s.f17167g.a(q());
                }
                this.f19359n = new ib();
                if (this.f19360o.q()) {
                    if (!this.f19347b.isEmpty()) {
                        this.f19349d.a(this.f19347b);
                        this.f19347b.clear();
                    }
                    K();
                } else {
                    a(f.LOADING);
                }
                if (this.f19360o.q()) {
                    return;
                }
                ironLog.verbose(b("auction disabled"));
                L();
                C();
            }
        }
    }

    private void C() {
        gw<Smash> E = E();
        if (E.c()) {
            a((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        for (Smash smash : E.a()) {
            smash.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private gw<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new fw(this.f19360o).d(this.f19346a.b());
    }

    private void F() {
        this.f19366u.a(this.f19360o.b(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.f19369x) {
            f fVar = this.f19361p;
            f fVar2 = f.AUCTION;
            if (fVar == fVar2) {
                return;
            }
            a(fVar2);
            this.I.set(false);
            long k10 = this.f19360o.d().k() - ib.a(this.f19358m);
            if (k10 > 0) {
                new Timer().schedule(new c(), k10);
            } else {
                D();
            }
        }
    }

    private void L() {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    private Smash a(m5 m5Var, String str) {
        NetworkSettings a10 = this.f19360o.a(m5Var.c());
        if (a10 != null) {
            com.ironsource.mediationsdk.c.b().b(a10, this.f19360o.b(), k());
            BaseAdAdapter<?, Listener> a11 = a(a10, this.f19360o.b());
            if (a11 != null) {
                Smash a12 = a(a10, a11, this.C.a(this.f19360o.b()), str, m5Var);
                this.f19347b.put(m5Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return a12;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + a10.getProviderInstanceName()));
        } else {
            String str2 = "could not find matching provider settings for auction response item - item = " + m5Var.c() + " state = " + this.f19361p;
            IronLog.INTERNAL.error(b(str2));
            this.f19364s.f17171k.h(str2);
        }
        return null;
    }

    private yj a(u0 u0Var) {
        if (u0Var.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private String a(List<m5> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("waterfall.size() = " + list.size()));
        this.f19347b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m5 m5Var = list.get(i10);
            Smash a10 = a(m5Var, str);
            if (a10 != null) {
                copyOnWriteArrayList.add(a10);
                sb.append(a(m5Var, a10.l()));
            }
            if (i10 != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f19346a.a(this.f19360o.h().a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z10 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.f19364s.f17169i.a(1005, "No candidates available for auctioning");
            a(a2.e(this.f19360o.b()), "no available ad to load", false);
            return;
        }
        this.f19364s.f17169i.b(str);
        if (this.f19348c == null) {
            ironLog.error(b("mAuctionHandler is null"));
            return;
        }
        int a10 = this.C.a(this.f19360o.b());
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f19360o.b());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(map);
        iVar.a(list);
        iVar.a(this.f19349d);
        iVar.a(a10);
        iVar.a(this.f19367v);
        iVar.d(this.G);
        eu euVar = this.H;
        if (euVar != null && euVar.b()) {
            z10 = true;
        }
        iVar.e(z10);
        a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        z7 z7Var = new z7();
        e eVar = new e(map, sb, list);
        this.f19364s.f17168h.a();
        z7Var.a(list2, eVar, this.f19360o.e(), TimeUnit.MILLISECONDS);
    }

    private void a(JSONObject jSONObject) {
        this.f19366u.a(this.f19360o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f18560f, false) : false);
        b(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put("spId", networkSettings.getSubProviderId());
            hashMap.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f19360o.b())));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.logException(ironSourceTag, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e8);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        StringBuilder sb2;
        String str;
        for (NetworkSettings networkSettings : this.f19360o.j()) {
            eu euVar = this.H;
            if (euVar == null || euVar.a(networkSettings, this.f19360o.b())) {
                if (!this.f19357l.b(new ps(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f19360o.b()))) && d(networkSettings)) {
                    AdData a10 = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f19360o.b())) {
                        AdapterBaseInterface b10 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f19360o.b(), k());
                        if (b10 instanceof y7) {
                            list2.add(new w7(networkSettings.getInstanceType(this.f19360o.b()), networkSettings.getProviderInstanceName(), a10, (y7) b10, this, networkSettings));
                        } else {
                            if (b10 == null) {
                                sb2 = new StringBuilder();
                                sb2.append("prepareAuctionCandidates - could not load network adapter ");
                                str = networkSettings.getProviderName();
                            } else {
                                sb2 = new StringBuilder();
                                sb2.append("network adapter ");
                                sb2.append(networkSettings.getProviderName());
                                str = " does not implementing BiddingDataInterface";
                            }
                            sb2.append(str);
                            this.f19364s.f17171k.g(sb2.toString());
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.f19360o.b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(",");
                    }
                }
            }
        }
    }

    private void b(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f19360o.b(false);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b("loading configuration from auction response is null, using the following: " + this.f19360o.r()));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f18578x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f18578x)) > 0) {
                    this.f19360o.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f18579y)) {
                    this.f19360o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f18579y));
                }
                this.f19360o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f18580z, false));
            } catch (JSONException e8) {
                o9.d().a(e8);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("failed to update loading configuration for" + this.f19360o.b() + " Error: " + e8.getMessage());
                ironLog2.verbose(b(this.f19360o.r()));
            }
        } finally {
            IronLog.INTERNAL.verbose(b(this.f19360o.r()));
        }
    }

    private boolean b(b2 b2Var) {
        return !new ArrayList(Arrays.asList(b2.INIT_STARTED, b2.LOAD_AD, b2.AUCTION_REQUEST, b2.AUCTION_REQUEST_WATERFALL, b2.AUCTION_FAILED_NO_CANDIDATES, b2.COLLECT_TOKEN, b2.COLLECT_TOKENS_COMPLETED, b2.COLLECT_TOKENS_FAILED, b2.INSTANCE_COLLECT_TOKEN, b2.INSTANCE_COLLECT_TOKEN_SUCCESS, b2.INSTANCE_COLLECT_TOKEN_FAILED, b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(b2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData a10 = a(networkSettings, this.f19360o.o());
        AdapterBaseInterface b10 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f19360o.b(), k());
        if (b10 != null) {
            try {
                b10.init(a10, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e8) {
                o9.d().a(e8);
                fv fvVar = this.f19364s.f17171k;
                fvVar.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e8);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    private boolean c(b2 b2Var) {
        return new ArrayList(Arrays.asList(b2.LOAD_AD_SUCCESS, b2.LOAD_AD_FAILED, b2.LOAD_AD_FAILED_WITH_REASON, b2.AUCTION_SUCCESS, b2.AUCTION_FAILED, b2.AUCTION_FAILED_NO_CANDIDATES, b2.AD_FORMAT_CAPPED, b2.AD_OPENED, b2.SHOW_AD, b2.SHOW_AD_FAILED, b2.AD_CLICKED, b2.RELOAD_AD_FAILED_WITH_REASON, b2.RELOAD_AD_SUCCESS, b2.AD_LEFT_APPLICATION)).contains(b2Var);
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f19346a.a(adapterBaseInterface, this.f19360o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f19360o.b());
    }

    private boolean c(boolean z10) {
        Boolean bool = this.f19371z;
        if (bool == null) {
            return false;
        }
        return (z10 && !bool.booleanValue() && u()) || (!z10 && this.f19371z.booleanValue());
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface b10 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f19360o.b(), k());
        if (b10 instanceof AdapterSettingsInterface) {
            return this.f19346a.a(this.f19360o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, b10), b10, this.f19360o.b());
        }
        return false;
    }

    private List<m5> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f19360o.j()) {
            if (!networkSettings.isBidder(this.f19360o.b()) && d(networkSettings)) {
                ps psVar = new ps(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f19360o.b()));
                if (!this.f19357l.b(psVar)) {
                    copyOnWriteArrayList.add(new m5(psVar.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f19360o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.f19360o.b(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f19360o.k(), this.f19360o.p(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f19360o.j()) {
            arrayList.add(new ps(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f19360o.b())));
        }
        qs qsVar = new qs();
        this.f19357l = qsVar;
        qsVar.a(arrayList);
    }

    public void A() {
        if (c()) {
            a(new a());
        } else {
            B();
        }
    }

    protected void G() {
        com.ironsource.mediationsdk.n.a().a(this.f19360o.b(), this.f19360o.f());
    }

    protected boolean H() {
        return true;
    }

    protected boolean I() {
        return true;
    }

    public void J() {
        for (NetworkSettings networkSettings : this.f19360o.j()) {
            com.ironsource.mediationsdk.c.b().b(networkSettings, this.f19360o.b(), k());
        }
    }

    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    protected BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, ad_unit, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f19360o.b(), str);
    }

    protected abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i10, String str, m5 m5Var);

    protected String a(m5 m5Var, int i10) {
        return String.format("%s%s", Integer.valueOf(i10), m5Var.c());
    }

    public Map<String, Object> a(b2 b2Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f19352g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put("genericParams", this.f19352g);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.C.a(this.f19360o.b())));
        if (c(b2Var)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f19350e));
            if (!TextUtils.isEmpty(this.f19351f)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f19351f);
            }
        }
        if (b(b2Var) && !TextUtils.isEmpty(this.f19346a.c())) {
            hashMap.put("auctionId", this.f19346a.c());
        }
        return hashMap;
    }

    @Override // com.ironsource.p
    public void a() {
        if (this.f19360o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    @Override // com.ironsource.bw
    public void a(int i10) {
        fv fvVar = this.f19364s.f17171k;
        fvVar.u("waterfalls hold too many with size = " + i10);
    }

    @Override // com.ironsource.s4
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            String str3 = "unexpected auction fail - error = " + i10 + ", " + str + " state = " + this.f19361p;
            ironLog.error(b(str3));
            this.f19364s.f17171k.i(str3);
            return;
        }
        String str4 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        ironLog.verbose(b(str4));
        IronSourceUtils.sendAutomationLog(l() + ": " + str4);
        this.f19350e = i11;
        this.f19351f = str2;
        this.f19352g = new JSONObject();
        L();
        this.f19364s.f17169i.a(j10, i10, str);
        a(f.LOADING);
        C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10, String str, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f19360o.h().f()) {
            if (!z10) {
                this.f19364s.f17167g.a(ib.a(this.f19359n), i10, str, q());
            }
            a(new IronSourceError(i10, str));
        } else {
            if (!z10) {
                this.f19364s.f17171k.b(i10, str);
            }
            b(false);
        }
        this.f19362q.e();
    }

    protected void a(Context context, com.ironsource.mediationsdk.i iVar, s4 s4Var) {
        com.ironsource.mediationsdk.e eVar = this.f19348c;
        if (eVar != null) {
            eVar.a(context, iVar, s4Var);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    public void a(Context context, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("track = " + z10));
        try {
            this.f19355j = z10;
            if (z10) {
                if (this.f19356k == null) {
                    this.f19356k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f19356k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f19356k != null) {
                context.getApplicationContext().unregisterReceiver(this.f19356k);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Got an error from receiver with message: " + e8.getMessage());
        }
    }

    public void a(eu euVar) {
        this.H = euVar;
        this.G = euVar != null;
        this.f19371z = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(l2 l2Var) {
        this.f19365t = l2Var;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.f19367v = ironSourceSegment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.n.a().b(this.f19360o.b(), ironSourceError);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // com.ironsource.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.ironsource.mediationsdk.logger.IronSourceError r5, com.ironsource.q7<?> r6) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.n7.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.q7):void");
    }

    @Override // com.ironsource.x7
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface b10 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f19360o.b(), k());
        if (b10 != null) {
            this.f19364s.f17168h.a(b(networkSettings, b10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(f fVar) {
        synchronized (this.f19369x) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("set current state to = " + fVar);
            this.f19361p = fVar;
        }
    }

    protected void a(q7<?> q7Var, AdInfo adInfo) {
        this.f19365t.c(adInfo);
    }

    @Override // com.ironsource.tp
    public void a(Runnable runnable) {
        yj yjVar = this.J;
        if (yjVar != null) {
            yjVar.a(runnable);
        }
    }

    @Override // com.ironsource.x7
    public void a(String str) {
        this.f19364s.f17171k.g(str);
    }

    @Override // com.ironsource.s4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.f19361p));
            fv fvVar = this.f19364s.f17171k;
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected auction success, state = ");
            sb.append(this.f19361p);
            fvVar.j(sb.toString());
            return;
        }
        this.f19351f = "";
        this.f19350e = i10;
        this.f19353h = m5Var;
        this.f19352g = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.f19364s.f17171k.a(i11, str2);
        }
        a(jSONObject2);
        if (this.f19366u.a(this.f19360o.b())) {
            this.f19364s.f17169i.a(str);
            a((int) IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
            return;
        }
        String a10 = a(list, str);
        this.f19364s.f17169i.a(j10, this.f19360o.r());
        this.f19364s.f17169i.c(a10);
        a(f.LOADING);
        C();
    }

    @Override // com.ironsource.Cdo
    public void a(boolean z10) {
        if (!this.f19355j || this.f19360o.h().f()) {
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("network availability changed to - " + z10);
        if (c(z10)) {
            a(z10, false, (q7<?>) null);
        }
    }

    protected void a(boolean z10, boolean z11, q7<?> q7Var) {
        synchronized (this.f19369x) {
            Boolean bool = this.f19371z;
            if (bool == null || bool.booleanValue() != z10) {
                this.f19371z = Boolean.valueOf(z10);
                long j10 = 0;
                if (this.f19370y != 0) {
                    j10 = new Date().getTime() - this.f19370y;
                }
                this.f19370y = new Date().getTime();
                this.f19364s.f17167g.a(z10, j10, z11);
                AdInfo f10 = q7Var != null ? q7Var.f() : this.A;
                this.A = f10;
                l2 l2Var = this.f19365t;
                if (!z10) {
                    f10 = null;
                }
                l2Var.a(z10, f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(f fVar, f fVar2) {
        boolean z10;
        synchronized (this.f19369x) {
            if (this.f19361p == fVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                z10 = true;
                this.f19361p = fVar2;
            } else {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("wrong state, current state = " + this.f19361p + ", expected state = " + fVar);
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str) {
        String str2 = this.f19360o.b().name() + " state:" + this.f19361p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    protected abstract JSONObject b(NetworkSettings networkSettings);

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    protected void b(m5 m5Var, String str) {
        if (m5Var == null) {
            IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
            e2 e2Var = this.f19364s;
            if (e2Var != null) {
                e2Var.f17171k.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
                return;
            }
            return;
        }
        ImpressionData a10 = m5Var.a(str);
        if (a10 != null) {
            for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a10));
                impressionDataListener.onImpressionSuccess(a10);
            }
        }
    }

    @Override // com.ironsource.r2
    public void b(q7<?> q7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(q7Var.k()));
        this.f19364s.f17170j.g(n());
        this.f19346a.a(q7Var);
        this.f19346a.b(q7Var);
        this.f19357l.a(q7Var);
        if (this.f19357l.b(q7Var)) {
            ironLog.verbose(b(q7Var.c() + " was session capped"));
            q7Var.N();
            IronSourceUtils.sendAutomationLog(q7Var.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.f19360o.b());
        if (this.E.b(ContextProvider.getInstance().getApplicationContext(), this.f19354i, this.f19360o.b())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.f19364s.f17170j.b(n(), null);
        }
        this.D.b(this.f19360o.b());
        if (this.f19360o.q()) {
            m5 i10 = q7Var.i();
            this.f19348c.a(i10, q7Var.l(), this.f19353h, n());
            this.f19347b.put(q7Var.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(i10, n());
            }
        }
        g(q7Var);
        if (this.f19360o.h().e()) {
            b(false);
        }
        this.f19362q.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z10) {
        a(false, z10, (q7<?>) null);
    }

    @Override // com.ironsource.tp
    public boolean c() {
        yj yjVar = this.J;
        if (yjVar == null || yjVar == Thread.currentThread()) {
            return false;
        }
        return this.f19360o.l();
    }

    @Override // com.ironsource.r2
    public void e(q7<?> q7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(q7Var.k()));
        if (!q7Var.h().equals(this.f19346a.c())) {
            ironLog.error(b("invoked from " + q7Var.c() + " with state = " + this.f19361p + " auctionId: " + q7Var.h() + " and the current id is " + this.f19346a.c()));
            fv fvVar = this.f19364s.f17171k;
            StringBuilder sb = new StringBuilder();
            sb.append("onAdLoadSuccess invoked with state = ");
            sb.append(this.f19361p);
            fvVar.o(sb.toString());
            return;
        }
        if (this.f19360o.m()) {
            List<Smash> b10 = this.f19346a.b();
            fw fwVar = new fw(this.f19360o);
            boolean a10 = fwVar.a(q7Var, b10);
            synchronized (this.f19369x) {
                if (a10) {
                    if (w()) {
                        i(q7Var);
                    }
                }
                if (fwVar.a(b10)) {
                    i(fwVar.c(b10));
                }
            }
        }
        this.f19347b.put(q7Var.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long a11 = ib.a(this.f19359n);
            if (v()) {
                this.f19364s.f17167g.a(a11);
            } else {
                this.f19364s.f17167g.a(a11, q());
            }
            if (this.f19360o.h().e()) {
                this.f19363r.a(0L);
            }
            if (!this.f19360o.m()) {
                i(q7Var);
            }
            h(q7Var);
        }
    }

    @Override // com.ironsource.r2
    public void f(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f19364s.f17170j.a(n());
        this.f19365t.a(this.f19354i, q7Var.f());
    }

    protected abstract l2 g();

    protected void g(q7<?> q7Var) {
        this.f19365t.d(q7Var.f());
    }

    protected q2 h() {
        return new q2(this.f19360o.h(), this);
    }

    protected void h(q7<?> q7Var) {
        if (this.f19360o.h().f()) {
            a(q7Var, q7Var.f());
        } else {
            a(true, false, q7Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String i() {
        return b((String) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(q7<?> q7Var) {
        if (this.f19360o.q() && this.I.compareAndSet(false, true)) {
            m5 i10 = q7Var.i();
            this.f19348c.a(i10, q7Var.l(), this.f19353h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, m5> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f19346a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f19348c.a(arrayList, concurrentHashMap, q7Var.l(), this.f19353h, i10);
        }
    }

    public UUID k() {
        return this.f19368w;
    }

    protected abstract String l();

    protected String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String n() {
        Placement placement = this.f19354i;
        return placement == null ? "" : placement.getPlacementName();
    }

    abstract String o();

    protected boolean q() {
        return false;
    }

    protected boolean t() {
        return false;
    }

    protected boolean u() {
        return false;
    }

    protected abstract boolean v();

    protected boolean w() {
        boolean z10;
        synchronized (this.f19369x) {
            f fVar = this.f19361p;
            z10 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x() {
        boolean z10;
        synchronized (this.f19369x) {
            z10 = this.f19361p == f.READY_TO_SHOW;
        }
        return z10;
    }

    protected boolean y() {
        boolean z10;
        synchronized (this.f19369x) {
            z10 = this.f19361p == f.AUCTION;
        }
        return z10;
    }

    protected boolean z() {
        boolean z10;
        synchronized (this.f19369x) {
            z10 = this.f19361p == f.LOADING;
        }
        return z10;
    }
}
