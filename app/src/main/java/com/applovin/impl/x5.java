package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u5;
import com.applovin.impl.x5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class x5 extends z4 {

    /* renamed from: y  reason: collision with root package name */
    private static final AtomicBoolean f9583y = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final String f9584g;

    /* renamed from: h  reason: collision with root package name */
    private final MaxAdFormat f9585h;

    /* renamed from: i  reason: collision with root package name */
    private final JSONObject f9586i;

    /* renamed from: j  reason: collision with root package name */
    private final a.InterfaceC0126a f9587j;

    /* renamed from: k  reason: collision with root package name */
    private final WeakReference f9588k;

    /* renamed from: l  reason: collision with root package name */
    private final String f9589l;

    /* renamed from: m  reason: collision with root package name */
    private final Queue f9590m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f9591n;

    /* renamed from: o  reason: collision with root package name */
    private final Queue f9592o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f9593p;

    /* renamed from: q  reason: collision with root package name */
    private final int f9594q;

    /* renamed from: r  reason: collision with root package name */
    private long f9595r;

    /* renamed from: s  reason: collision with root package name */
    private final List f9596s;

    /* renamed from: t  reason: collision with root package name */
    private final AtomicBoolean f9597t;

    /* renamed from: u  reason: collision with root package name */
    private final AtomicBoolean f9598u;

    /* renamed from: v  reason: collision with root package name */
    private final AtomicBoolean f9599v;

    /* renamed from: w  reason: collision with root package name */
    private u2 f9600w;

    /* renamed from: x  reason: collision with root package name */
    private y6 f9601x;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends z4 {

        /* renamed from: g  reason: collision with root package name */
        private final String f9602g;

        /* renamed from: h  reason: collision with root package name */
        private final long f9603h;

        /* renamed from: i  reason: collision with root package name */
        private final u2 f9604i;

        /* renamed from: j  reason: collision with root package name */
        private final c f9605j;

        /* renamed from: k  reason: collision with root package name */
        private final int f9606k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class a extends c3 {
            a(a.InterfaceC0126a interfaceC0126a) {
                super(interfaceC0126a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void a() {
                x5 x5Var = x5.this;
                x5Var.b(x5Var.f9600w);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f9603h;
                com.applovin.impl.sdk.n unused = b.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = b.this.f9829c;
                    String str2 = b.this.f9602g;
                    nVar.a(str2, "Ad (" + b.this.f9606k + ") failed to load in " + elapsedRealtime + "ms for " + x5.this.f9585h + " ad unit " + str + " with error: " + maxError);
                }
                b bVar = b.this;
                bVar.b("failed to load ad: " + maxError.getCode());
                b bVar2 = b.this;
                x5.this.a(bVar2.f9604i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (x5.this.f9599v.get()) {
                    return;
                }
                if (x5.this.f9600w != null) {
                    b bVar3 = b.this;
                    if (b.this.b(x5.this.c(bVar3.f9605j))) {
                        x5 x5Var = x5.this;
                        x5Var.b(x5Var.f9600w);
                        return;
                    }
                }
                b bVar4 = b.this;
                if ((!x5.this.d(bVar4.f9605j)) && x5.this.f9598u.get() && x5.this.f9597t.get()) {
                    x5.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                boolean z10;
                long F;
                u2 u2Var;
                int i10;
                b.this.b("loaded ad");
                u2 u2Var2 = (u2) maxAd;
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f9603h;
                com.applovin.impl.sdk.n unused = b.this.f9829c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = b.this.f9829c;
                    String str = b.this.f9602g;
                    nVar.a(str, "Ad (" + b.this.f9606k + ") loaded in " + elapsedRealtime + "ms for " + x5.this.f9585h + " ad unit " + x5.this.f9584g);
                }
                x5.this.a(u2Var2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                b bVar = b.this;
                x5.this.b(bVar.f9605j);
                if (c.BIDDING == b.this.f9605j) {
                    z10 = x5.this.f9598u.get();
                    F = u2Var2.T();
                } else {
                    z10 = x5.this.f9597t.get();
                    F = u2Var2.F();
                }
                if (z10 || F == 0) {
                    if (b.this.b(u2Var2)) {
                        u2Var = u2Var2;
                        u2Var2 = x5.this.f9600w;
                    } else {
                        u2Var = x5.this.f9600w;
                    }
                    x5.this.a(u2Var2, u2Var);
                    return;
                }
                x5.this.f9600w = u2Var2;
                if (i10 < 0) {
                    return;
                }
                b bVar2 = b.this;
                x5.this.f9601x = y6.a(F, bVar2.f9827a, new Runnable() { // from class: com.applovin.impl.qf
                    @Override // java.lang.Runnable
                    public final void run() {
                        x5.b.a.this.a();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9602g;
                nVar.a(str, "Loading ad " + this.f9606k + " of " + x5.this.f9594q + " from " + this.f9604i.c() + " for " + x5.this.f9585h + " ad unit " + x5.this.f9584g);
            }
            b("started to load ad");
            Context context = (Context) x5.this.f9588k.get();
            Activity m02 = context instanceof Activity ? (Activity) context : this.f9827a.m0();
            this.f9827a.S().b(this.f9604i);
            this.f9827a.P().loadThirdPartyMediatedAd(x5.this.f9584g, this.f9604i, m02, new a(x5.this.f9587j));
        }

        private b(u2 u2Var, c cVar) {
            super(x5.this.f9828b, x5.this.f9827a, x5.this.f9584g);
            this.f9602g = this.f9828b + ":" + cVar;
            this.f9603h = SystemClock.elapsedRealtime();
            this.f9604i = u2Var;
            this.f9605j = cVar;
            this.f9606k = u2Var.K() + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(u2 u2Var) {
            if (x5.this.f9600w == null) {
                return false;
            }
            if (u2Var == null) {
                return true;
            }
            double O = x5.this.f9600w.O();
            double O2 = u2Var.O();
            return (O < 0.0d || O2 < 0.0d) ? x5.this.f9600w.K() < u2Var.K() : O > O2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        BIDDING,
        TAG
    }

    public x5(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.j jVar, a.InterfaceC0126a interfaceC0126a) {
        super("TaskProcessMediationWaterfallV2", jVar, str);
        this.f9590m = new LinkedList();
        this.f9591n = new Object();
        this.f9592o = new LinkedList();
        this.f9593p = new Object();
        this.f9597t = new AtomicBoolean();
        this.f9598u = new AtomicBoolean();
        this.f9599v = new AtomicBoolean();
        this.f9584g = str;
        this.f9585h = maxAdFormat;
        this.f9586i = jSONObject;
        this.f9587j = interfaceC0126a;
        this.f9588k = new WeakReference(context);
        this.f9589l = JsonUtils.getString(jSONObject, "mCode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            u2 a10 = u2.a(i10, map, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, jVar);
            if (a10.Y()) {
                this.f9592o.add(a10);
            } else {
                this.f9590m.add(a10);
            }
        }
        int size = this.f9590m.size() + this.f9592o.size();
        this.f9594q = size;
        this.f9596s = new ArrayList(size);
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f9595r = SystemClock.elapsedRealtime();
        if (this.f9586i.optBoolean("is_testing", false) && !this.f9827a.k0().c() && f9583y.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.of
                @Override // java.lang.Runnable
                public final void run() {
                    x5.this.e();
                }
            });
        }
        if (this.f9594q == 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f9829c.k(this.f9828b, "No ads were returned from the server for " + this.f9585h.getLabel() + " ad unit " + this.f9584g);
            }
            d7.a(this.f9584g, this.f9585h, this.f9586i, this.f9827a);
            JSONObject jSONObject = JsonUtils.getJSONObject(this.f9586i, "settings", new JSONObject());
            long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
            if (o3.a(this.f9586i, this.f9584g, this.f9827a)) {
                maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + this.f9584g + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
                if (d7.c(this.f9827a) && ((Boolean) this.f9827a.a(o4.f8074a6)).booleanValue()) {
                    j10 = 0;
                }
            } else {
                maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
            }
            if (j10 > 0) {
                long millis = TimeUnit.SECONDS.toMillis(j10);
                Runnable runnable = new Runnable() { // from class: com.applovin.impl.pf
                    @Override // java.lang.Runnable
                    public final void run() {
                        x5.this.b(maxErrorImpl);
                    }
                };
                if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
                    d0.a(millis, this.f9827a, runnable);
                    return;
                } else {
                    AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
                    return;
                }
            }
            b(maxErrorImpl);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f9829c.a(this.f9828b, "Starting waterfall for " + this.f9585h.getLabel() + " ad unit " + this.f9584g + " with " + this.f9594q + " ad(s)...");
        }
        d(c.TAG);
        d(c.BIDDING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(c cVar) {
        u2 a10 = a(cVar);
        if (a10 == null) {
            b(cVar);
            return false;
        }
        this.f9827a.i0().a((z4) new b(a10, cVar), u5.b.MEDIATION);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        d7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f9827a.m0());
    }

    private void f() {
        y6 y6Var = this.f9601x;
        if (y6Var == null) {
            return;
        }
        y6Var.a();
        this.f9601x = null;
    }

    private void g() {
        a(this.f9590m);
        a(this.f9592o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public u2 c(c cVar) {
        return a(cVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(c cVar) {
        if (c.BIDDING == cVar) {
            this.f9597t.compareAndSet(false, true);
        } else if (c.TAG == cVar) {
            this.f9598u.compareAndSet(false, true);
        }
    }

    private u2 a(c cVar) {
        return a(cVar, false);
    }

    private u2 a(c cVar, boolean z10) {
        u2 u2Var;
        u2 u2Var2;
        if (cVar == c.BIDDING) {
            synchronized (this.f9593p) {
                u2Var2 = (u2) (z10 ? this.f9592o.peek() : this.f9592o.poll());
            }
            return u2Var2;
        }
        synchronized (this.f9591n) {
            u2Var = (u2) (z10 ? this.f9590m.peek() : this.f9590m.poll());
        }
        return u2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(u2 u2Var) {
        a(u2Var, (u2) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u2 u2Var, u2 u2Var2) {
        if (this.f9599v.compareAndSet(false, true)) {
            f();
            g();
            this.f9827a.S().a(u2Var, u2Var2);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9595r;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.d(str, "Waterfall loaded in " + elapsedRealtime + "ms from " + u2Var.c() + " for " + this.f9585h + " ad unit " + this.f9584g);
            }
            u2Var.a(new MaxAdWaterfallInfoImpl(u2Var, elapsedRealtime, this.f9596s, this.f9589l));
            l2.f(this.f9587j, u2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void b(MaxError maxError) {
        int i10 = 0;
        if (this.f9599v.compareAndSet(false, true)) {
            if (maxError.getCode() == 204) {
                this.f9827a.C().c(v1.f9447u);
            } else if (maxError.getCode() == -5001) {
                this.f9827a.C().c(v1.f9448v);
            } else {
                this.f9827a.C().c(v1.f9449w);
            }
            ArrayList arrayList = new ArrayList(this.f9596s.size());
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f9596s) {
                if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                    arrayList.add(maxNetworkResponseInfo);
                }
            }
            if (arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
                sb.append("\n");
                while (i10 < arrayList.size()) {
                    MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                    i10++;
                    sb.append(i10);
                    sb.append(") ");
                    sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                    sb.append("\n");
                    sb.append("..code: ");
                    sb.append(maxNetworkResponseInfo2.getError().getCode());
                    sb.append("\n");
                    sb.append("..message: ");
                    sb.append(maxNetworkResponseInfo2.getError().getMessage());
                    sb.append("\n");
                }
                ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9595r;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f9829c;
                String str = this.f9828b;
                nVar.d(str, "Waterfall failed in " + elapsedRealtime + "ms for " + this.f9585h + " ad unit " + this.f9584g + " with error: " + maxError);
            }
            ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f9586i, "waterfall_name", ""), JsonUtils.getString(this.f9586i, "waterfall_test_name", ""), elapsedRealtime, this.f9596s, JsonUtils.optList(JsonUtils.getJSONArray(this.f9586i, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f9589l));
            l2.a(this.f9587j, this.f9584g, maxError);
        }
    }

    private void a(Queue queue) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            a((u2) it.next(), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u2 u2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
        this.f9596s.add(new MaxNetworkResponseInfoImpl(adLoadState, o3.a(u2Var.b()), u2Var.G(), u2Var.Y(), j10, u2Var.C(), maxError));
    }
}
