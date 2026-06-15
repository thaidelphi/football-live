package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.Cdo;
import com.ironsource.a8;
import com.ironsource.al;
import com.ironsource.ar;
import com.ironsource.bg;
import com.ironsource.cr;
import com.ironsource.dg;
import com.ironsource.dq;
import com.ironsource.dr;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.m5;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mm;
import com.ironsource.nc;
import com.ironsource.o5;
import com.ironsource.o9;
import com.ironsource.pk;
import com.ironsource.qs;
import com.ironsource.s4;
import com.ironsource.w7;
import com.ironsource.yq;
import com.ironsource.z7;
import com.ironsource.zb;
import com.ironsource.zk;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q extends m implements zk, dr, s4, dg, Cdo, com.ironsource.p {
    private long A;
    private Boolean B;
    private final Object C;
    private nc D;
    private final long E;
    private final bg.a F;
    private final bg G;

    /* renamed from: e  reason: collision with root package name */
    private al f19019e;

    /* renamed from: f  reason: collision with root package name */
    private ConcurrentHashMap<String, m5> f19020f;

    /* renamed from: g  reason: collision with root package name */
    private ConcurrentHashMap<String, h.a> f19021g;

    /* renamed from: h  reason: collision with root package name */
    private m5 f19022h;

    /* renamed from: i  reason: collision with root package name */
    private h f19023i;

    /* renamed from: j  reason: collision with root package name */
    private com.ironsource.mediationsdk.e f19024j;

    /* renamed from: k  reason: collision with root package name */
    private JSONObject f19025k;

    /* renamed from: l  reason: collision with root package name */
    private cr f19026l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f19027m;

    /* renamed from: n  reason: collision with root package name */
    private long f19028n;

    /* renamed from: o  reason: collision with root package name */
    private String f19029o;

    /* renamed from: p  reason: collision with root package name */
    private int f19030p;

    /* renamed from: q  reason: collision with root package name */
    private NetworkStateReceiver f19031q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f19032r;

    /* renamed from: s  reason: collision with root package name */
    private final ConcurrentHashMap<String, r> f19033s;

    /* renamed from: t  reason: collision with root package name */
    private qs f19034t;

    /* renamed from: u  reason: collision with root package name */
    private int f19035u;

    /* renamed from: v  reason: collision with root package name */
    private String f19036v;

    /* renamed from: w  reason: collision with root package name */
    private int f19037w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f19038x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f19039y;

    /* renamed from: z  reason: collision with root package name */
    private e f19040z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NetworkSettings f19041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ yq f19042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f19043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f19044d;

        a(NetworkSettings networkSettings, yq yqVar, String str, String str2) {
            this.f19041a = networkSettings;
            this.f19042b = yqVar;
            this.f19043c = str;
            this.f19044d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.a(this.f19041a, this.f19042b, this.f19043c, this.f19044d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            q.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.d("makeAuction()");
            q.this.f19028n = new Date().getTime();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            q.this.b(hashMap, arrayList, sb, arrayList2);
            q.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements z7.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f19049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f19050c;

        d(Map map, StringBuilder sb, List list) {
            this.f19048a = map;
            this.f19049b = sb;
            this.f19050c = list;
        }

        @Override // com.ironsource.z7.b
        public void a(List<a8> list, long j10, List<String> list2) {
            q.this.c((int) IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
            for (a8 a8Var : list) {
                r rVar = (r) q.this.f19033s.get(a8Var.c());
                if (a8Var.a() != null) {
                    this.f19048a.put(a8Var.c(), a8Var.a());
                    StringBuilder sb = this.f19049b;
                    sb.append(a8Var.d());
                    sb.append(a8Var.c());
                    sb.append(",");
                    if (rVar != null) {
                        rVar.a(1021, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}});
                    }
                } else if (rVar != null) {
                    rVar.a(1022, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}, new Object[]{"reason", a8Var.b()}});
                }
            }
            for (String str : list2) {
                r rVar2 = (r) q.this.f19033s.get(str);
                if (rVar2 != null) {
                    rVar2.a(1023, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
                }
            }
            q.this.a(this.f19048a, this.f19050c, this.f19049b.toString());
        }

        @Override // com.ironsource.z7.b
        public void onFailure(String str) {
            q.this.c((int) IronSourceConstants.RV_COLLECT_TOKENS_FAILED, pk.a(new Object[][]{new Object[]{"reason", str}}));
            q.this.a(this.f19048a, this.f19050c, this.f19049b.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public q(List<NetworkSettings> list, yq yqVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.f19029o = "";
        this.f19032r = false;
        this.f19035u = 1;
        this.C = new Object();
        this.F = mm.M().m();
        this.G = mm.S().B();
        long time = new Date().getTime();
        c(IronSourceConstants.RV_MANAGER_INIT_STARTED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.B = null;
        this.f19037w = yqVar.g();
        this.f19038x = yqVar.j();
        this.f19036v = "";
        this.f19025k = null;
        o5 k10 = yqVar.k();
        this.f19039y = false;
        this.f19019e = new al(yqVar.k().f(), yqVar.k().i());
        this.f19020f = new ConcurrentHashMap<>();
        this.f19021g = new ConcurrentHashMap<>();
        this.A = new Date().getTime();
        boolean z10 = k10.g() > 0;
        this.f19027m = z10;
        if (z10) {
            this.f19024j = new com.ironsource.mediationsdk.e(IronSource.AD_UNIT.REWARDED_VIDEO, k10, this);
        }
        this.f19026l = new cr(k10, this);
        ConcurrentHashMap<String, r> concurrentHashMap = new ConcurrentHashMap<>();
        this.f19033s = concurrentHashMap;
        a(list, yqVar, str, str2);
        this.f19023i = new h(list, k10.c());
        qs qsVar = new qs();
        this.f19034t = qsVar;
        qsVar.a(new ArrayList(concurrentHashMap.values()));
        this.D = new nc(yqVar.c(), this);
        this.E = yqVar.l();
        c(IronSourceConstants.RV_MANAGER_INIT_ENDED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        a(k10.k());
    }

    private String a(m5 m5Var) {
        r rVar = this.f19033s.get(m5Var.c());
        String num = rVar != null ? Integer.toString(rVar.g()) : TextUtils.isEmpty(m5Var.k()) ? "1" : CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
        return num + m5Var.c();
    }

    private void a(int i10) {
        a(i10, (Map<String, Object>) null, true, true);
    }

    private void a(int i10, Map<String, Object> map) {
        a(i10, map, false, true);
    }

    private void a(int i10, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z11 && !TextUtils.isEmpty(this.f19019e.d())) {
            hashMap.put("auctionId", this.f19019e.d());
        }
        JSONObject jSONObject = this.f19025k;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put("genericParams", this.f19025k);
        }
        if (z10 && !TextUtils.isEmpty(this.f19036v)) {
            hashMap.put("placement", this.f19036v);
        }
        if (c(i10)) {
            ar.i().a(hashMap, this.f19030p, this.f19029o);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.f19035u));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e8), 3);
            }
        }
        ar.i().a(new zb(i10, new JSONObject(hashMap)));
    }

    private void a(long j10) {
        Map<String, Object> a10;
        if (this.f19034t.a()) {
            d("all smashes are capped");
            a10 = pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{"reason", "all smashes are capped"}});
        } else {
            a(IronSource.AD_UNIT.REWARDED_VIDEO);
            if (this.f19027m) {
                if (!this.f19021g.isEmpty()) {
                    this.f19023i.a(this.f19021g);
                    this.f19021g.clear();
                }
                new Timer().schedule(new b(), j10);
                return;
            }
            d("auction fallback flow starting");
            k();
            if (!this.f19019e.c().isEmpty()) {
                b(1000);
                i();
                return;
            }
            d("loadSmashes -  waterfall is empty");
            a10 = pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}});
        }
        a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a10);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, yq yqVar, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter a10 = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (a10 != null) {
            r rVar = new r(str, str2, networkSettings, this, yqVar.h(), a10, this.f19035u);
            this.f19033s.put(rVar.c(), rVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private void a(e eVar) {
        d("current state=" + this.f19040z + ", new state=" + eVar);
        this.f19040z = eVar;
    }

    private void a(r rVar, String str) {
        String str2 = rVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(List<NetworkSettings> list, yq yqVar, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            arrayList.add(new a(networkSettings, yqVar, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(yqVar.f(), yqVar.o(), arrayList);
    }

    private void a(List<m5> list, String str, JSONObject jSONObject) {
        this.f19020f.clear();
        this.f19021g.clear();
        CopyOnWriteArrayList<r> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (m5 m5Var : list) {
            sb.append(a(m5Var) + ",");
            r rVar = this.f19033s.get(m5Var.c());
            if (rVar != null) {
                AbstractAdapter a10 = com.ironsource.mediationsdk.c.b().a(rVar.f19222b.h());
                if (a10 != null) {
                    r rVar2 = new r(rVar, this, a10, this.f19035u, str, jSONObject, this.f19030p, this.f19029o);
                    rVar2.a(true);
                    copyOnWriteArrayList.add(rVar2);
                    this.f19020f.put(rVar2.c(), m5Var);
                    this.f19021g.put(m5Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + m5Var.c());
            }
        }
        this.f19019e.a(copyOnWriteArrayList, str);
        if (this.f19019e.a()) {
            a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, pk.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f19019e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(1301, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
            return;
        }
        d("makeAuction() - request waterfall is: " + str);
        b(1000);
        b(IronSourceConstants.RV_AUCTION_REQUEST);
        c(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
        this.f19024j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f19023i, this.f19035u, this.f18912c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        z7 z7Var = new z7();
        d dVar = new d(map, sb, list);
        b(IronSourceConstants.RV_COLLECT_TOKENS);
        z7Var.a(list2, dVar, this.E, TimeUnit.MILLISECONDS);
    }

    private void a(boolean z10, Map<String, Object> map) {
        synchronized (this.C) {
            Boolean bool = this.B;
            if (bool == null || bool.booleanValue() != z10) {
                this.B = Boolean.valueOf(z10);
                long time = new Date().getTime() - this.A;
                this.A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                a(z10 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                dq a10 = dq.a();
                al alVar = this.f19019e;
                a10.a(z10, alVar.a(alVar.d()));
            }
        }
    }

    private void b(int i10) {
        a(i10, (Map<String, Object>) null, false, false);
    }

    private void b(int i10, Map<String, Object> map) {
        a(i10, map, true, true);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        for (r rVar : this.f19033s.values()) {
            if (!this.f19034t.b(rVar) && this.f19019e.b(rVar)) {
                if (rVar.p()) {
                    list2.add(new w7(rVar.g(), rVar.c(), null, rVar, null, null));
                } else {
                    list.add(rVar.c());
                    sb.append(rVar.g() + rVar.c() + ",");
                }
            }
        }
    }

    private void b(boolean z10) {
        a(z10, (Map<String, Object>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10, Map<String, Object> map) {
        a(i10, map, false, false);
    }

    private void c(r rVar, Placement placement) {
        d("showVideo()");
        this.f19034t.a(rVar);
        if (this.f19034t.b(rVar)) {
            rVar.B();
            IronSourceUtils.sendAutomationLog(rVar.c() + " rewarded video is now session capped");
        }
        bg.a aVar = this.F;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String placementName = placement.getPlacementName();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        aVar.a(applicationContext, placementName, ad_unit);
        if (this.G.b(ContextProvider.getInstance().getApplicationContext(), placement, ad_unit)) {
            a(IronSourceConstants.RV_CAP_PLACEMENT);
        }
        this.D.a();
        rVar.a(placement);
    }

    private void c(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    private boolean c(int i10) {
        return i10 == 1003 || i10 == 1302 || i10 == 1301 || i10 == 1303;
    }

    private boolean c(boolean z10) {
        Boolean bool = this.B;
        if (bool == null) {
            return false;
        }
        return (z10 && !bool.booleanValue() && d()) || (!z10 && this.B.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    private List<m5> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (r rVar : this.f19033s.values()) {
            if (!rVar.p() && !this.f19034t.b(rVar) && this.f19019e.b(rVar)) {
                copyOnWriteArrayList.add(new m5(rVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void g(r rVar) {
        String k10 = this.f19020f.get(rVar.c()).k();
        JSONObject a10 = this.f19020f.get(rVar.c()).a();
        rVar.c(k10);
        rVar.a(k10, a10);
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.f19039y) {
            b(false);
        }
        this.f19026l.a();
    }

    private void i() {
        if (this.f19019e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(e.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f19019e.c().size() && i10 < this.f19037w; i11++) {
            r rVar = this.f19019e.c().get(i11);
            if (rVar.h()) {
                if (this.f19038x && rVar.p()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + rVar.c() + " as a non bidder is being loaded";
                        d(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + rVar.c() + ". No other instances will be loaded at the same time.";
                    d(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    g(rVar);
                    return;
                }
                g(rVar);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.C) {
            e eVar = this.f19040z;
            e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
            if (eVar != eVar2) {
                a(eVar2);
                AsyncTask.execute(new c());
            }
        }
    }

    private void k() {
        List<m5> g10 = g();
        a(g10, "fallback_" + System.currentTimeMillis(), this.f19025k);
    }

    @Override // com.ironsource.p
    public void a() {
        a(e.RV_STATE_NOT_LOADED);
        a(false, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.s4
    public void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        d(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f19030p = i11;
        this.f19029o = str2;
        this.f19025k = null;
        k();
        a(1301, TextUtils.isEmpty(str) ? pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}) : pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
        i();
    }

    @Override // com.ironsource.dg
    public void a(Activity activity, Placement placement) {
        synchronized (this.C) {
            if (placement == null) {
                a("showRewardedVideo error: empty default placement");
                IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                dq a10 = dq.a();
                al alVar = this.f19019e;
                a10.a(ironSourceError, alVar.a(alVar.d()));
                a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                return;
            }
            this.f19036v = placement.getPlacementName();
            b("showRewardedVideo(" + placement + ")");
            r rVar = null;
            b(IronSourceConstants.RV_API_SHOW_CALLED, activity != null ? pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
            if (this.f19039y) {
                a("showRewardedVideo error: can't show ad while an ad is already showing");
                IronSourceError ironSourceError2 = new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                dq a11 = dq.a();
                al alVar2 = this.f19019e;
                a11.a(ironSourceError2, alVar2.a(alVar2.d()));
                b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
            } else if (this.f19040z != e.RV_STATE_READY_TO_SHOW) {
                a("showRewardedVideo error: show called while no ads are available");
                IronSourceError ironSourceError3 = new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                dq a12 = dq.a();
                al alVar3 = this.f19019e;
                a12.a(ironSourceError3, alVar3.a(alVar3.d()));
                b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
            } else if (this.G.b(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO)) {
                String str = "showRewardedVideo error: placement " + this.f19036v + " is capped";
                a(str);
                IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                dq a13 = dq.a();
                al alVar4 = this.f19019e;
                a13.a(ironSourceError4, alVar4.a(alVar4.d()));
                b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<r> it = this.f19019e.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r next = it.next();
                    if (next.A()) {
                        this.f19039y = true;
                        next.b(true);
                        a(e.RV_STATE_NOT_LOADED);
                        rVar = next;
                        break;
                    }
                    if (next.e() != null) {
                        stringBuffer.append(next.c() + ":" + next.e() + ",");
                    }
                    next.b(false);
                }
                if (rVar != null) {
                    c(rVar, placement);
                    return;
                }
                d("showRewardedVideo(): No ads to show");
                dq a14 = dq.a();
                IronSourceError buildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                al alVar5 = this.f19019e;
                a14.a(buildNoAdsToShowError, alVar5.a(alVar5.d()));
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                hashMap.put("reason", "showRewardedVideo(): No ads to show");
                if (stringBuffer.length() != 0) {
                    hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                }
                b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap);
                this.f19026l.b();
            }
        }
    }

    @Override // com.ironsource.dg
    public void a(Context context, boolean z10) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.f19032r = z10;
            if (z10) {
                if (this.f19031q == null) {
                    this.f19031q = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f19031q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f19031q != null) {
                context.getApplicationContext().unregisterReceiver(this.f19031q);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e8.getMessage());
        }
    }

    @Override // com.ironsource.zk
    public void a(IronSourceError ironSourceError, r rVar) {
        m5 m5Var;
        if (this.f19027m && (m5Var = this.f19020f.get(rVar.c())) != null) {
            al alVar = this.f19019e;
            alVar.a(alVar.d(), m5Var.a(this.f19036v), m5Var.d());
        }
        a(rVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f19039y = false;
        b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        dq.a().a(ironSourceError, this.f19019e.a(rVar.u()));
        this.f19021g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.f19040z != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.f19026l.b();
    }

    @Override // com.ironsource.zk
    public void a(r rVar) {
        a(rVar, "onRewardedVideoAdStarted");
        dq.a().c();
    }

    @Override // com.ironsource.zk
    public void a(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdRewarded");
        dq.a().b(placement, this.f19019e.a(rVar.u()));
    }

    @Override // com.ironsource.s4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        d("makeAuction(): success");
        this.f19022h = m5Var;
        this.f19030p = i10;
        this.f19025k = jSONObject;
        this.f19029o = "";
        if (!TextUtils.isEmpty(str2)) {
            a(88002, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.f18911b.a(ad_unit)) {
            a(IronSourceConstants.RV_AD_UNIT_CAPPED, pk.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
            return;
        }
        a(list, str, this.f19025k);
        a(IronSourceConstants.RV_AUCTION_SUCCESS, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}}));
        i();
    }

    @Override // com.ironsource.Cdo
    public void a(boolean z10) {
        if (this.f19032r) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z10, 0);
            if (c(z10)) {
                b(z10);
            }
        }
    }

    @Override // com.ironsource.dr
    public void b() {
        d("onLoadTriggered: RV load was triggered in " + this.f19040z + " state");
        a(0L);
    }

    @Override // com.ironsource.zk
    public void b(r rVar) {
        String str;
        r next;
        a(rVar, "onRewardedVideoAdClosed, mediation state: " + this.f19040z.name());
        dq.a().b(this.f19019e.a(rVar.u()));
        this.f19039y = false;
        boolean z10 = this.f19040z == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z10) {
            Iterator<r> it = this.f19019e.c().iterator();
            while (it.hasNext()) {
                if (it.next().y()) {
                    sb.append(next.c() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + ((Object) sb);
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        rVar.b(1203, objArr);
        if (rVar.equals(this.f19019e.f())) {
            this.f19019e.a((r) null);
            if (this.f19040z != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.ironsource.zk
    public void b(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdClicked");
        dq.a().a(placement, this.f19019e.a(rVar.u()));
    }

    @Override // com.ironsource.zk
    public void c(r rVar) {
        CopyOnWriteArrayList<r> copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (this.C) {
            a(rVar, "onLoadError mState=" + this.f19040z);
            if (rVar.u() == this.f19019e.d() && this.f19040z != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.f19021g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                e eVar = this.f19040z;
                if (eVar == e.RV_STATE_LOADING_SMASHES || eVar == e.RV_STATE_READY_TO_SHOW) {
                    Iterator<r> it = this.f19019e.c().iterator();
                    boolean z10 = false;
                    boolean z11 = false;
                    while (it.hasNext()) {
                        r next = it.next();
                        if (next.h()) {
                            if (this.f19038x && next.p()) {
                                if (!z10 && !z11) {
                                    String str = "Advanced Loading: Starting to load bidder " + next.c() + ". No other instances will be loaded at the same time.";
                                    d(str);
                                    IronSourceUtils.sendAutomationLog(str);
                                }
                                String str2 = "Advanced Loading: Won't start loading bidder " + next.c() + " as " + (z10 ? "a non bidder is being loaded" : "a non bidder was already loaded successfully");
                                d(str2);
                                IronSourceUtils.sendAutomationLog(str2);
                            }
                            if (this.f19020f.get(next.c()) != null) {
                                copyOnWriteArrayList.add(next);
                                if (!this.f19038x || !rVar.p() || next.p() || copyOnWriteArrayList.size() >= this.f19037w) {
                                    break;
                                }
                                z10 = true;
                            } else {
                                continue;
                            }
                        } else if (next.z()) {
                            z10 = true;
                        } else if (next.A()) {
                            z11 = true;
                        }
                    }
                    if (copyOnWriteArrayList.size() == 0 && !z11 && !z10) {
                        d("onLoadError(): No other available smashes");
                        if (!this.f19039y) {
                            b(false);
                        }
                        a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{"reason", "Mediation No fill"}}));
                        a(e.RV_STATE_NOT_LOADED);
                        this.f19026l.a();
                    }
                    for (r rVar2 : copyOnWriteArrayList) {
                        g(rVar2);
                    }
                    return;
                }
                return;
            }
            d("onLoadError was invoked with auctionId:" + rVar.u() + " and the current id is " + this.f19019e.d());
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 4};
            StringBuilder sb = new StringBuilder();
            sb.append("loadError wrong auction ID ");
            sb.append(this.f19040z);
            rVar.a(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", sb.toString()}});
        }
    }

    @Override // com.ironsource.zk
    public void d(r rVar) {
        this.f19019e.a(rVar);
        this.f19035u++;
        a(rVar, "onRewardedVideoAdOpened");
        if (this.f19027m) {
            m5 m5Var = this.f19020f.get(rVar.c());
            if (m5Var != null) {
                al alVar = this.f19019e;
                alVar.a(alVar.d(), m5Var.a(this.f19036v), m5Var.d());
                this.f19024j.a(m5Var, rVar.g(), this.f19022h, this.f19036v);
                this.f19021g.put(rVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(m5Var, this.f19036v);
            } else {
                String c10 = rVar.c();
                c("onRewardedVideoAdOpened showing instance " + c10 + " missing from waterfall");
                a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{"reason", "Showing missing " + this.f19040z}, new Object[]{IronSourceConstants.EVENTS_EXT1, c10}}));
            }
        }
        dq.a().c(this.f19019e.a(rVar.u()));
        b(false);
        this.f19026l.c();
    }

    @Override // com.ironsource.dg
    public boolean d() {
        if ((!this.f19032r || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f19040z == e.RV_STATE_READY_TO_SHOW && !this.f19039y) {
            Iterator<r> it = this.f19019e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.zk
    public void e(r rVar) {
        synchronized (this.C) {
            a(rVar, "onLoadSuccess mState=" + this.f19040z);
            if (rVar.u() == this.f19019e.d() && this.f19040z != e.RV_STATE_AUCTION_IN_PROGRESS) {
                this.f19021g.put(rVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                e eVar = this.f19040z;
                e eVar2 = e.RV_STATE_LOADING_SMASHES;
                if (eVar == eVar2) {
                    a(e.RV_STATE_READY_TO_SHOW);
                    a(1003, pk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.f19028n)}}));
                    this.D.a(0L);
                    if (this.f19027m) {
                        m5 m5Var = this.f19020f.get(rVar.c());
                        if (m5Var != null) {
                            al alVar = this.f19019e;
                            alVar.a(alVar.d(), m5Var.a(""), m5Var.d());
                            this.f19024j.a(m5Var, rVar.g(), this.f19022h);
                            this.f19024j.a(this.f19019e.c(), this.f19020f, rVar.g(), this.f19022h, m5Var);
                        } else {
                            String c10 = rVar.c();
                            c("onLoadSuccess winner instance " + c10 + " missing from waterfall. auctionId: " + rVar.u() + " and the current id is " + this.f19019e.d());
                            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                            StringBuilder sb = new StringBuilder();
                            sb.append("Loaded missing ");
                            sb.append(eVar2);
                            a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, pk.a(new Object[][]{objArr, new Object[]{"reason", sb.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, c10}}));
                        }
                    }
                    b(true);
                }
                return;
            }
            d("onLoadSuccess was invoked with auctionId: " + rVar.u() + " and the current id is " + this.f19019e.d());
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onLoadSuccess wrong auction ID ");
            sb2.append(this.f19040z);
            rVar.a(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{"reason", sb2.toString()}});
        }
    }

    @Override // com.ironsource.zk
    public void f(r rVar) {
        a(rVar, "onRewardedVideoAdEnded");
        dq.a().b();
    }
}
