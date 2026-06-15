package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.d7;
import com.applovin.impl.g5;
import com.applovin.impl.j3;
import com.applovin.impl.l2;
import com.applovin.impl.m5;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.impl.u5;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f7720a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7721b = new HashMap(4);

    /* renamed from: c  reason: collision with root package name */
    private final Object f7722c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map f7723d = new HashMap(4);

    /* renamed from: e  reason: collision with root package name */
    private final Object f7724e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final Map f7725f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Object f7726g = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements g5.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f7728b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f7729c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f7730d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f7731e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map f7732f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f7733g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0126a f7734h;

        a(long j10, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.InterfaceC0126a interfaceC0126a) {
            this.f7727a = j10;
            this.f7728b = map;
            this.f7729c = str;
            this.f7730d = maxAdFormat;
            this.f7731e = map2;
            this.f7732f = map3;
            this.f7733g = context;
            this.f7734h = interfaceC0126a;
        }

        @Override // com.applovin.impl.g5.b
        public void a(JSONArray jSONArray) {
            this.f7728b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f7727a));
            this.f7728b.put("calfc", Integer.valueOf(d.this.b(this.f7729c)));
            m5 m5Var = new m5(this.f7729c, this.f7730d, this.f7731e, this.f7732f, this.f7728b, jSONArray, this.f7733g, d.this.f7720a, this.f7734h);
            if (((Boolean) d.this.f7720a.a(j3.D7)).booleanValue()) {
                d.this.f7720a.i0().a((z4) m5Var, u5.b.MEDIATION);
            } else {
                d.this.f7720a.i0().a(m5Var);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f7743a;

        b(String str) {
            this.f7743a = str;
        }

        public String b() {
            return this.f7743a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements a.InterfaceC0126a {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.sdk.j f7744a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference f7745b;

        /* renamed from: c  reason: collision with root package name */
        private final d f7746c;

        /* renamed from: d  reason: collision with root package name */
        private final C0127d f7747d;

        /* renamed from: e  reason: collision with root package name */
        private final MaxAdFormat f7748e;

        /* renamed from: f  reason: collision with root package name */
        private final Map f7749f;

        /* renamed from: g  reason: collision with root package name */
        private final Map f7750g;

        /* renamed from: h  reason: collision with root package name */
        private final Map f7751h;

        /* renamed from: i  reason: collision with root package name */
        private final int f7752i;

        /* renamed from: j  reason: collision with root package name */
        private long f7753j;

        /* renamed from: k  reason: collision with root package name */
        private long f7754k;

        /* synthetic */ c(Map map, Map map2, Map map3, C0127d c0127d, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.j jVar, Context context, a aVar) {
            this(map, map2, map3, c0127d, maxAdFormat, j10, j11, dVar, jVar, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f7750g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f7750g.put("retry_attempt", Integer.valueOf(this.f7747d.f7758d));
            Context context = (Context) this.f7745b.get();
            if (context == null) {
                context = com.applovin.impl.sdk.j.m();
            }
            this.f7751h.put("art", b.EXPONENTIAL_RETRY.b());
            this.f7751h.put("era", Integer.valueOf(this.f7747d.f7758d));
            this.f7754k = System.currentTimeMillis();
            this.f7746c.a(str, this.f7748e, this.f7749f, this.f7750g, this.f7751h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            this.f7746c.c(str);
            if (((Boolean) this.f7744a.a(j3.f7318u7)).booleanValue() && this.f7747d.f7757c.get()) {
                this.f7744a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f7744a.I().a("MediationAdLoadManager", "Ad failed to load but its load state was destroyed");
                    return;
                }
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7753j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f7744a.P().processWaterfallInfoPostback(str, this.f7748e, maxAdWaterfallInfoImpl, maxError, this.f7754k, elapsedRealtime);
            }
            boolean z10 = maxError.getCode() == -5603 && d7.c(this.f7744a) && ((Boolean) this.f7744a.a(o4.f8074a6)).booleanValue();
            if (!this.f7744a.a(j3.f7317t7, this.f7748e) || this.f7747d.f7758d >= this.f7752i || z10) {
                this.f7747d.f7758d = 0;
                this.f7747d.f7756b.set(false);
                if (this.f7747d.f7759e != null) {
                    MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                    maxErrorImpl.setLoadTag(this.f7747d.f7755a);
                    maxErrorImpl.setRequestLatencyMillis(elapsedRealtime);
                    l2.a(this.f7747d.f7759e, str, maxError);
                    this.f7747d.f7759e = null;
                    return;
                }
                return;
            }
            C0127d.f(this.f7747d);
            final int pow = (int) Math.pow(2.0d, this.f7747d.f7758d);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.s
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.a(pow, str);
                }
            }, TimeUnit.SECONDS.toMillis(pow));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (((Boolean) this.f7744a.a(j3.f7318u7)).booleanValue() && this.f7747d.f7757c.get()) {
                this.f7744a.I();
                if (com.applovin.impl.sdk.n.a()) {
                    this.f7744a.I().a("MediationAdLoadManager", "Ad loaded but its load state was destroyed");
                }
                this.f7744a.P().destroyAd(maxAd);
                return;
            }
            u2 u2Var = (u2) maxAd;
            u2Var.i(this.f7747d.f7755a);
            u2Var.a(SystemClock.elapsedRealtime() - this.f7753j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) u2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f7744a.P().processWaterfallInfoPostback(u2Var.getAdUnitId(), this.f7748e, maxAdWaterfallInfoImpl, null, this.f7754k, u2Var.getRequestLatencyMillis());
            }
            this.f7746c.a(maxAd.getAdUnitId());
            this.f7747d.f7758d = 0;
            if (this.f7747d.f7759e != null) {
                u2Var.A().c().a(this.f7747d.f7759e);
                this.f7747d.f7759e.onAdLoaded(u2Var);
                if (u2Var.Q().endsWith("load")) {
                    this.f7747d.f7759e.onAdRevenuePaid(u2Var);
                }
                this.f7747d.f7759e = null;
                if ((!this.f7744a.c(j3.f7315r7).contains(maxAd.getAdUnitId()) && !this.f7744a.a(j3.f7314q7, maxAd.getFormat())) || this.f7744a.k0().c() || this.f7744a.k0().d()) {
                    this.f7747d.f7756b.set(false);
                    return;
                }
                Context context = (Context) this.f7745b.get();
                if (context == null) {
                    context = com.applovin.impl.sdk.j.m();
                }
                this.f7753j = SystemClock.elapsedRealtime();
                this.f7754k = System.currentTimeMillis();
                this.f7751h.put("art", b.SEQUENTIAL_OR_PRECACHE.b());
                this.f7746c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f7749f, this.f7750g, this.f7751h, context, this);
                return;
            }
            this.f7746c.a(u2Var);
            this.f7747d.f7756b.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private c(Map map, Map map2, Map map3, C0127d c0127d, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.j jVar, Context context) {
            this.f7744a = jVar;
            this.f7745b = new WeakReference(context);
            this.f7746c = dVar;
            this.f7747d = c0127d;
            this.f7748e = maxAdFormat;
            this.f7750g = map2;
            this.f7749f = map;
            this.f7751h = map3;
            this.f7753j = j10;
            this.f7754k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f7752i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f7752i = Math.min(2, ((Integer) jVar.a(j3.f7316s7)).intValue());
            } else {
                this.f7752i = ((Integer) jVar.a(j3.f7316s7)).intValue();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.mediation.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class C0127d {

        /* renamed from: a  reason: collision with root package name */
        private final String f7755a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f7756b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f7757c;

        /* renamed from: d  reason: collision with root package name */
        private int f7758d;

        /* renamed from: e  reason: collision with root package name */
        private volatile a.InterfaceC0126a f7759e;

        /* synthetic */ C0127d(String str, a aVar) {
            this(str);
        }

        static /* synthetic */ int f(C0127d c0127d) {
            int i10 = c0127d.f7758d;
            c0127d.f7758d = i10 + 1;
            return i10;
        }

        private C0127d(String str) {
            this.f7756b = new AtomicBoolean();
            this.f7757c = new AtomicBoolean();
            this.f7755a = str;
        }
    }

    public d(com.applovin.impl.sdk.j jVar) {
        this.f7720a = jVar;
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    private u2 e(String str) {
        u2 u2Var;
        synchronized (this.f7724e) {
            u2Var = (u2) this.f7723d.get(str);
            this.f7723d.remove(str);
        }
        return u2Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f7722c) {
            String b10 = b(str, str2);
            a(str, str2).f7757c.set(true);
            this.f7721b.remove(b10);
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f7724e) {
            z10 = this.f7723d.get(str) != null;
        }
        return z10;
    }

    public int b(String str) {
        int intValue;
        synchronized (this.f7726g) {
            Integer num = (Integer) this.f7725f.get(str);
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, b bVar, Map map, Map map2, Context context, a.InterfaceC0126a interfaceC0126a) {
        u2 e8 = (this.f7720a.k0().d() || d7.f(com.applovin.impl.sdk.j.m())) ? null : e(str);
        if (e8 != null) {
            e8.i(str2);
            e8.A().c().a(interfaceC0126a);
            interfaceC0126a.onAdLoaded(e8);
            if (e8.Q().endsWith("load")) {
                interfaceC0126a.onAdRevenuePaid(e8);
            }
        }
        C0127d a10 = a(str, str2);
        if (!a10.f7756b.compareAndSet(false, true)) {
            if (a10.f7759e != null && a10.f7759e != interfaceC0126a) {
                com.applovin.impl.sdk.n.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            a10.f7759e = interfaceC0126a;
            return;
        }
        if (e8 == null) {
            a10.f7759e = interfaceC0126a;
        }
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.put("art", bVar.b());
        if (StringUtils.isValidString(str2)) {
            synchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, synchronizedMap, context, new c(map, map2, synchronizedMap, a10, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f7720a, context, null));
    }

    public void c(String str) {
        synchronized (this.f7726g) {
            this.f7720a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f7720a.I();
                I.a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
            }
            Integer num = (Integer) this.f7725f.get(str);
            if (num == null) {
                num = 0;
            }
            this.f7725f.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0126a interfaceC0126a) {
        this.f7720a.i0().a((z4) new g5(str, maxAdFormat, map, context, this.f7720a, new a(SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0126a)), u5.b.MEDIATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(u2 u2Var) {
        synchronized (this.f7724e) {
            if (this.f7723d.containsKey(u2Var.getAdUnitId())) {
                com.applovin.impl.sdk.n.h("AppLovinSdk", "Ad in cache already: " + u2Var.getAdUnitId());
            }
            this.f7723d.put(u2Var.getAdUnitId(), u2Var);
        }
    }

    private C0127d a(String str, String str2) {
        C0127d c0127d;
        synchronized (this.f7722c) {
            String b10 = b(str, str2);
            c0127d = (C0127d) this.f7721b.get(b10);
            if (c0127d == null) {
                c0127d = new C0127d(str2, null);
                this.f7721b.put(b10, c0127d);
            }
        }
        return c0127d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f7726g) {
            this.f7720a.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n I = this.f7720a.I();
                I.a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
            }
            this.f7725f.remove(str);
        }
    }
}
