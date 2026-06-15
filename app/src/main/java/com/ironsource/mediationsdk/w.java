package com.ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.a8;
import com.ironsource.ai;
import com.ironsource.b8;
import com.ironsource.bg;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.h7;
import com.ironsource.ib;
import com.ironsource.m5;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mm;
import com.ironsource.o9;
import com.ironsource.oj;
import com.ironsource.s4;
import com.ironsource.t5;
import com.ironsource.vp;
import com.ironsource.w7;
import com.ironsource.wf;
import com.ironsource.wl;
import com.ironsource.xf;
import com.ironsource.yu;
import com.ironsource.z7;
import com.ironsource.zb;
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
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w extends m implements vp, s4 {
    private ConcurrentHashMap<String, h.a> A;
    private long B;
    private final Object C;
    private ib D;
    private boolean E;
    private final long F;
    private final Runnable G;

    /* renamed from: e  reason: collision with root package name */
    private final ai f19151e;

    /* renamed from: f  reason: collision with root package name */
    private final ai.a f19152f;

    /* renamed from: g  reason: collision with root package name */
    private final bg f19153g;

    /* renamed from: h  reason: collision with root package name */
    private final bg.a f19154h;

    /* renamed from: i  reason: collision with root package name */
    private k f19155i;

    /* renamed from: j  reason: collision with root package name */
    private i f19156j;

    /* renamed from: k  reason: collision with root package name */
    private wl f19157k;

    /* renamed from: l  reason: collision with root package name */
    private IronSourceBannerLayout f19158l;

    /* renamed from: m  reason: collision with root package name */
    private h7 f19159m;

    /* renamed from: n  reason: collision with root package name */
    private int f19160n;

    /* renamed from: o  reason: collision with root package name */
    private x f19161o;

    /* renamed from: p  reason: collision with root package name */
    private int f19162p;

    /* renamed from: q  reason: collision with root package name */
    private final ConcurrentHashMap<String, x> f19163q;

    /* renamed from: r  reason: collision with root package name */
    private CopyOnWriteArrayList<x> f19164r;

    /* renamed from: s  reason: collision with root package name */
    private String f19165s;

    /* renamed from: t  reason: collision with root package name */
    private JSONObject f19166t;

    /* renamed from: u  reason: collision with root package name */
    private String f19167u;

    /* renamed from: v  reason: collision with root package name */
    private int f19168v;

    /* renamed from: w  reason: collision with root package name */
    private com.ironsource.mediationsdk.e f19169w;

    /* renamed from: x  reason: collision with root package name */
    private m5 f19170x;

    /* renamed from: y  reason: collision with root package name */
    private com.ironsource.mediationsdk.h f19171y;

    /* renamed from: z  reason: collision with root package name */
    private ConcurrentHashMap<String, m5> f19172z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements l.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h7 f19173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IronSourceBannerLayout f19174b;

        a(h7 h7Var, IronSourceBannerLayout ironSourceBannerLayout) {
            this.f19173a = h7Var;
            this.f19174b = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f19173a.getPlacementName());
            l.b(this.f19174b);
            w.this.f19158l = this.f19174b;
            w.this.f19159m = this.f19173a;
            bg bgVar = w.this.f19153g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            h7 h7Var = this.f19173a;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            if (!bgVar.b(applicationContext, h7Var, ad_unit)) {
                w.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n a10 = n.a();
            a10.b(ad_unit, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + this.f19173a.getPlacementName() + " is capped"));
            w.this.a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
            w.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog ironLog = IronLog.API;
            ironLog.error("can't load banner - errorMessage = " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements l.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IronSourceBannerLayout f19176a;

        b(IronSourceBannerLayout ironSourceBannerLayout) {
            this.f19176a = ironSourceBannerLayout;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog.INTERNAL.verbose("destroying banner");
            w.this.f19157k.b();
            w.this.a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, w.this.f19161o != null ? w.this.f19161o.n() : w.this.f19162p);
            w.this.h();
            this.f19176a.a();
            w.this.f19158l = null;
            w.this.f19159m = null;
            w.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog ironLog = IronLog.API;
            ironLog.error("destroy banner failed - errorMessage = " + str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (w.this.f19158l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    w.this.a((int) IronSourceConstants.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else if (w.this.o()) {
                    w.this.v();
                } else {
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    w.this.a((int) IronSourceConstants.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE)}});
                    w.this.f19157k.a(TimeUnit.SECONDS.toMillis(w.this.f19155i.f()));
                }
            } catch (Throwable th) {
                o9.d().a(th);
                w.this.a((int) IronSourceConstants.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th.getMessage()}});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.w();
            if (w.this.y()) {
                return;
            }
            w.this.a((int) IronSourceConstants.BN_AUCTION_REQUEST);
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            w.this.b(hashMap, arrayList, sb, arrayList2);
            w.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements z7.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f19180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f19181b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f19182c;

        e(Map map, StringBuilder sb, List list) {
            this.f19180a = map;
            this.f19181b = sb;
            this.f19182c = list;
        }

        @Override // com.ironsource.z7.b
        public void a(List<a8> list, long j10, List<String> list2) {
            w.this.a((int) IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            for (a8 a8Var : list) {
                if (a8Var.a() != null) {
                    this.f19180a.put(a8Var.c(), a8Var.a());
                    StringBuilder sb = this.f19181b;
                    sb.append(a8Var.d());
                    sb.append(a8Var.c());
                    sb.append(",");
                    ((x) w.this.f19163q.get(a8Var.c())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}});
                } else {
                    ((x) w.this.f19163q.get(a8Var.c())).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}, new Object[]{"reason", a8Var.b()}});
                }
            }
            for (String str : list2) {
                ((x) w.this.f19163q.get(str)).a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            }
            w.this.a(this.f19180a, this.f19182c, this.f19181b);
        }

        @Override // com.ironsource.z7.b
        public void onFailure(String str) {
            w.this.a((int) IronSourceConstants.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, str}});
            w.this.a(this.f19180a, this.f19182c, this.f19181b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NetworkSettings f19184a;

        f(NetworkSettings networkSettings) {
            this.f19184a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.a(this.f19184a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements b8 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f19186a;

        g(x xVar) {
            this.f19186a = xVar;
        }

        @Override // com.ironsource.b8
        public void a() {
            this.f19186a.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h extends TimerTask {
        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            w.this.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    w(xf xfVar, wf wfVar, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.f19156j = i.NONE;
        this.f19167u = "";
        this.C = new Object();
        this.E = false;
        c cVar = new c();
        this.G = cVar;
        ai k10 = xfVar.k();
        this.f19151e = k10;
        this.f19152f = wfVar.e();
        this.f19153g = xfVar.B();
        this.f19154h = wfVar.m();
        long time = new Date().getTime();
        a(IronSourceConstants.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + kVar.j());
        this.f19155i = kVar;
        this.f19163q = new ConcurrentHashMap<>();
        this.f19164r = new CopyOnWriteArrayList<>();
        this.f19172z = new ConcurrentHashMap<>();
        this.A = new ConcurrentHashMap<>();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        this.f19162p = k10.a(ad_unit);
        n.a().a(ad_unit, this.f19155i.d());
        if (this.f19155i.j()) {
            this.f19169w = new com.ironsource.mediationsdk.e(ad_unit, this.f19155i.b(), this);
        }
        this.f19171y = new com.ironsource.mediationsdk.h(list, this.f19155i.b().c());
        a(list, kVar);
        this.B = new Date().getTime();
        a(i.READY_TO_LOAD);
        this.F = kVar.g();
        this.f19157k = new wl(cVar, com.ironsource.lifecycle.b.d(), new yu());
        a(IronSourceConstants.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    public w(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this(mm.S(), mm.M(), list, kVar, hashSet, ironSourceSegment);
    }

    private String a(List<m5> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("waterfall.size() = " + list.size());
        this.f19164r.clear();
        this.f19172z.clear();
        this.A.clear();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m5 m5Var = list.get(i10);
            a(m5Var);
            sb.append(b(m5Var));
            if (i10 != list.size() - 1) {
                sb.append(",");
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        a(i10, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr) {
        a(i10, objArr, this.f19162p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr, int i11) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize k10 = k();
            if (k10 != null) {
                a(mediationAdditionalData, k10);
            }
            if (this.f19159m != null) {
                mediationAdditionalData.put("placement", l());
            }
            mediationAdditionalData.put("sessionDepth", i11);
            if (!TextUtils.isEmpty(this.f19165s)) {
                mediationAdditionalData.put("auctionId", this.f19165s);
            }
            JSONObject jSONObject = this.f19166t;
            if (jSONObject != null && jSONObject.length() > 0) {
                mediationAdditionalData.put("genericParams", this.f19166t);
            }
            if (b(i10)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f19168v);
                if (!TextUtils.isEmpty(this.f19167u)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f19167u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(Log.getStackTraceString(e8));
        }
        oj.i().a(new zb(i10, mediationAdditionalData));
    }

    private void a(m5 m5Var) {
        x xVar = this.f19163q.get(m5Var.c());
        if (xVar == null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("could not find matching smash for auction response item - item = " + m5Var.c());
            return;
        }
        AbstractAdapter a10 = com.ironsource.mediationsdk.c.b().a(xVar.f19222b.h());
        if (a10 != null) {
            x xVar2 = new x(this.f19155i, this, xVar.f19222b.h(), a10, this.f19162p, this.f19165s, this.f19166t, this.f19168v, this.f19167u, p());
            xVar2.a(true);
            this.f19164r.add(xVar2);
            this.f19172z.put(xVar2.c(), m5Var);
            this.A.put(m5Var.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter a10 = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (a10 != null) {
            x xVar = new x(this.f19155i, this, networkSettings, a10, this.f19162p, p());
            this.f19163q.put(xVar.c(), xVar);
        } else {
            ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.f19156j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.f19156j = iVar;
        }
    }

    private void a(x xVar, m5 m5Var) {
        this.f19169w.a(m5Var, xVar.g(), this.f19170x, l());
        a(this.f19172z.get(xVar.c()), l());
    }

    private void a(List<NetworkSettings> list, k kVar) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            arrayList.add(new f(networkSettings));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb));
        if (map.size() != 0 || list.size() != 0) {
            a(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
            com.ironsource.mediationsdk.e eVar = this.f19169w;
            if (eVar != null) {
                eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f19171y, this.f19162p, this.f18912c, j());
                return;
            } else {
                ironLog.error("mAuctionHandler is null");
                return;
            }
        }
        a(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
        if (a(i.AUCTION, i.LOADED)) {
            this.f19157k.a(TimeUnit.SECONDS.toMillis(this.f19155i.f()));
            return;
        }
        n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
        a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
        a(i.READY_TO_LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb);
            return;
        }
        z7 z7Var = new z7();
        e eVar = new e(map, sb, list);
        a(IronSourceConstants.BN_COLLECT_TOKENS);
        z7Var.a(list2, eVar, this.F, TimeUnit.MILLISECONDS);
    }

    private static void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c10 = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f18872c)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals(l.f18871b)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f18874e)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals(l.f18875f)) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                jSONObject.put(l.f18877h, 1);
            } else if (c10 == 1) {
                jSONObject.put(l.f18877h, 2);
            } else if (c10 == 2) {
                jSONObject.put(l.f18877h, 3);
            } else if (c10 == 3) {
                jSONObject.put(l.f18877h, 5);
            } else if (c10 == 4) {
                jSONObject.put(l.f18877h, 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                boolean has = jSONObject.has(IronSourceConstants.EVENTS_EXT1);
                String str = l.f18886q;
                if (has) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , " + l.f18886q;
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(Log.getStackTraceString(e8));
        }
    }

    private boolean a(i iVar, i iVar2) {
        boolean z10;
        synchronized (this.C) {
            if (this.f19156j == iVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.f19156j + "' to '" + iVar2 + "'");
                z10 = true;
                this.f19156j = iVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private String b(m5 m5Var) {
        x xVar = this.f19163q.get(m5Var.c());
        String str = (xVar == null ? !TextUtils.isEmpty(m5Var.k()) : xVar.p()) ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : "1";
        return str + m5Var.c();
    }

    private void b(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f19158l != null) {
            xVar.E();
            l.a(this.f19158l, view, layoutParams, new g(xVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (this.f19153g.b(ContextProvider.getInstance().getApplicationContext(), this.f19159m, IronSource.AD_UNIT.BANNER)) {
            return;
        }
        for (x xVar : this.f19163q.values()) {
            AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(xVar.f19224d, IronSource.AD_UNIT.BANNER, null, this.f19158l);
            if (xVar.p()) {
                list2.add(new w7(xVar.g(), xVar.c(), createAdDataForNetworkAdapter, xVar, null, null));
            } else if (!xVar.p()) {
                list.add(xVar.c());
                sb.append(xVar.g() + xVar.c() + ",");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f19156j);
        if (!a(i.STARTED_LOADING, this.f19155i.j() ? z10 ? i.AUCTION : i.FIRST_AUCTION : z10 ? i.RELOADING : i.LOADING)) {
            ironLog.error("wrong state - " + this.f19156j);
            return;
        }
        this.D = new ib();
        this.f19165s = "";
        this.f19166t = null;
        this.f19160n = 0;
        this.f19162p = this.f19151e.a(IronSource.AD_UNIT.BANNER);
        a(z10 ? IronSourceConstants.BN_RELOAD : 3001);
        if (this.f19155i.j()) {
            u();
            return;
        }
        x();
        t();
    }

    private boolean b(int i10) {
        return i10 == 3201 || i10 == 3110 || i10 == 3111 || i10 == 3116 || i10 == 3119 || i10 == 3112 || i10 == 3115 || i10 == 3501 || i10 == 3502 || i10 == 3506;
    }

    private void f(x xVar) {
        String str;
        IronSourceBannerLayout ironSourceBannerLayout = this.f19158l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout2 = null;
        if (xVar.p()) {
            str = this.f19172z.get(xVar.c()).k();
            xVar.c(str);
        } else {
            str = null;
        }
        JSONObject a10 = this.f19172z.get(xVar.c()).a();
        try {
            ironSourceBannerLayout2 = this.f19158l.b();
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e8.getMessage());
        }
        xVar.a(ironSourceBannerLayout2, this.f19159m, str, a10);
    }

    private boolean g() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f19158l;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f19161o != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("mActiveSmash = " + this.f19161o.f());
            this.f19161o.t();
            this.f19161o = null;
        }
    }

    private List<m5> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (x xVar : this.f19163q.values()) {
            if (!xVar.p() && !this.f19153g.b(ContextProvider.getInstance().getApplicationContext(), this.f19159m, IronSource.AD_UNIT.BANNER)) {
                copyOnWriteArrayList.add(new m5(xVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f19158l;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return this.f19158l.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f18476e : ISBannerSize.BANNER : this.f19158l.getSize();
    }

    private ISBannerSize k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f19158l;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    private String l() {
        h7 h7Var = this.f19159m;
        return h7Var != null ? h7Var.getPlacementName() : "";
    }

    private void m() {
        String str = this.f19164r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = " + str);
        g((x) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
        } else if (a(i.RELOADING, i.LOADED)) {
            a(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.D))}});
            n.a().b(IronSource.AD_UNIT.BANNER, new IronSourceError(606, str));
            this.f19157k.a(TimeUnit.SECONDS.toMillis(this.f19155i.f()));
        } else {
            a(iVar2);
            ironLog.error("wrong state = " + this.f19156j);
        }
    }

    private void n() {
        String l10 = l();
        bg.a aVar = this.f19154h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        aVar.a(applicationContext, l10, ad_unit);
        if (this.f19153g.b(ContextProvider.getInstance().getApplicationContext(), this.f19159m, ad_unit)) {
            a(IronSourceConstants.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.f19156j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z10;
        synchronized (this.C) {
            z10 = this.f19156j == i.LOADED;
        }
        return z10;
    }

    private boolean r() {
        boolean z10;
        synchronized (this.C) {
            i iVar = this.f19156j;
            z10 = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
        }
        return z10;
    }

    private boolean s() {
        boolean z10;
        synchronized (this.C) {
            i iVar = this.f19156j;
            z10 = iVar == i.LOADING || iVar == i.RELOADING;
        }
        return z10;
    }

    private void t() {
        try {
            for (int i10 = this.f19160n; i10 < this.f19164r.size(); i10++) {
                x xVar = this.f19164r.get(i10);
                if (xVar.h()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loading smash - " + xVar.f());
                    this.f19160n = i10 + 1;
                    f(xVar);
                    return;
                }
            }
            m();
        } catch (Exception e8) {
            o9.d().a(e8);
            a(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e8)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.f19156j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A.isEmpty()) {
            return;
        }
        this.f19171y.a(this.A);
        this.A.clear();
    }

    private void x() {
        List<m5> i10 = i();
        this.f19165s = e();
        a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long a10 = l.a(this.B, this.f19155i.h());
        if (a10 > 0) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + a10);
            new Timer().schedule(new h(), a10);
            return true;
        }
        return false;
    }

    @Override // com.ironsource.s4
    public void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f19156j);
            return;
        }
        this.f19167u = str2;
        this.f19168v = i11;
        this.f19166t = null;
        x();
        a(IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}});
        a(this.f19156j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
        t();
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout) {
        IronLog.INTERNAL.verbose();
        l.a(ironSourceBannerLayout, new b(ironSourceBannerLayout));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(ad_unit);
        f();
        if (!a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (n.a().b(ad_unit)) {
            ironLog.verbose("can't load banner - already has pending invocation");
        } else {
            l.a(ironSourceBannerLayout, h7Var, new a(h7Var, ironSourceBannerLayout));
        }
    }

    @Override // com.ironsource.vp
    public void a(IronSourceError ironSourceError, x xVar, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (xVar.x() == this.f19165s) {
            if (s()) {
                this.A.put(xVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                t();
                return;
            }
            ironLog.warning("wrong state - mCurrentState = " + this.f19156j);
            return;
        }
        ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.f19165s);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
        xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "Wrong auction " + xVar.x() + " State - " + this.f19156j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
    }

    @Override // com.ironsource.vp
    public void a(x xVar) {
        m5 m5Var;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(xVar.f());
        if (q()) {
            if (this.f19155i.j() && this.f19155i.b().q() && (m5Var = this.f19172z.get(xVar.c())) != null) {
                a(xVar, m5Var);
            }
            a(IronSourceConstants.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f19156j);
        String c10 = xVar.c();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "Wrong State - " + this.f19156j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c10}});
    }

    @Override // com.ironsource.vp
    public void a(x xVar, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + xVar.f());
        if (xVar.x() != this.f19165s) {
            ironLog.error("invoked with auctionId: " + xVar.x() + " and the current id is " + this.f19165s);
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            xVar.a(IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{"reason", "Wrong auction id " + xVar.x() + " State - " + this.f19156j}, new Object[]{IronSourceConstants.EVENTS_EXT1, xVar.c()}});
        } else if (!s()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f19156j);
        } else {
            x xVar2 = this.f19161o;
            if (xVar2 != null) {
                xVar2.q();
            }
            g(xVar);
            this.f19161o = xVar;
            b(xVar, view, layoutParams);
            this.A.put(xVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f19155i.j()) {
                m5 m5Var = this.f19172z.get(xVar.c());
                if (m5Var != null) {
                    a(m5Var.a(l()), m5Var.d());
                    this.f19169w.a(m5Var, xVar.g(), this.f19170x);
                    this.f19169w.a(this.f19164r, this.f19172z, xVar.g(), this.f19170x, m5Var);
                    if (!this.f19155i.b().q()) {
                        a(xVar, m5Var);
                    }
                } else {
                    String c10 = xVar.c();
                    ironLog.error("onLoadSuccess winner instance " + c10 + " missing from waterfall. auctionId = " + this.f19165s);
                    a(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, c10}});
                }
            }
            if (this.f19156j == i.LOADING) {
                if (g()) {
                    t5.a().d(this.f18913d);
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.D))}};
                } else {
                    objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.D))}};
                }
                a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (g()) {
                    t5.a().d(this.f18913d);
                }
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.D))}});
            }
            n();
            this.f19152f.b(IronSource.AD_UNIT.BANNER);
            a(i.LOADED);
            this.f19157k.a(TimeUnit.SECONDS.toMillis(this.f19155i.f()));
        }
    }

    @Override // com.ironsource.s4
    public void a(List<m5> list, String str, m5 m5Var, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (!r()) {
            ironLog.warning("wrong state - mCurrentState = " + this.f19156j);
            return;
        }
        this.f19167u = "";
        this.f19165s = str;
        this.f19168v = i10;
        this.f19170x = m5Var;
        this.f19166t = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            a(88002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{"reason", str2}});
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        a(jSONObject2, ad_unit);
        if (!this.f18911b.a(ad_unit)) {
            a(IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10)}});
            a(this.f19156j == i.FIRST_AUCTION ? i.LOADING : i.RELOADING);
            a(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        a(IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
        i iVar = this.f19156j;
        a(i.READY_TO_LOAD);
        if (iVar == i.FIRST_AUCTION) {
            n.a().b(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
        }
    }

    @Override // com.ironsource.vp
    public void b(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().b(this.f18913d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_CLICK, objArr, xVar.n());
    }

    @Override // com.ironsource.vp
    public void c(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().c(this.f18913d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, xVar.n());
    }

    @Override // com.ironsource.vp
    public void d(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().f(this.f18913d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, xVar.n());
    }

    @Override // com.ironsource.vp
    public void e(x xVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(xVar.f());
        if (g()) {
            t5.a().e(this.f18913d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, xVar.n());
    }

    public void g(x xVar) {
        Iterator<x> it = this.f19164r.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (!next.equals(xVar)) {
                next.q();
            }
        }
    }

    public boolean o() {
        IronLog ironLog;
        String str;
        if (!this.f19158l.isShown()) {
            ironLog = IronLog.INTERNAL;
            str = "banner or one of its parents are INVISIBLE or GONE";
        } else if (this.f19158l.hasWindowFocus()) {
            boolean globalVisibleRect = this.f19158l.getGlobalVisibleRect(new Rect());
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("visible = " + globalVisibleRect);
            return globalVisibleRect;
        } else {
            ironLog = IronLog.INTERNAL;
            str = "banner has no window focus";
        }
        ironLog.verbose(str);
        return false;
    }
}
