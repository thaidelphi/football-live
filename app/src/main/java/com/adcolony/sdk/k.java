package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.adcolony.sdk.AdColonyAdView;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.s;
import com.adcolony.sdk.v;
import com.iab.omid.library.adcolony.Omid;
import com.iab.omid.library.adcolony.adsession.Partner;
import com.ironsource.cc;
import com.ironsource.ls;
import com.ironsource.ug;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k {
    static String Z = "https://adc3-launch.adcolony.com/v4/launch";

    /* renamed from: a0  reason: collision with root package name */
    private static volatile String f6052a0 = "";
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private Application.ActivityLifecycleCallbacks O;
    private boolean T;
    private int X;

    /* renamed from: a  reason: collision with root package name */
    private i0 f6053a;

    /* renamed from: b  reason: collision with root package name */
    private com.adcolony.sdk.t f6054b;

    /* renamed from: c  reason: collision with root package name */
    private t0 f6055c;

    /* renamed from: d  reason: collision with root package name */
    private com.adcolony.sdk.d f6056d;

    /* renamed from: e  reason: collision with root package name */
    private com.adcolony.sdk.r f6057e;

    /* renamed from: f  reason: collision with root package name */
    private com.adcolony.sdk.w f6058f;

    /* renamed from: g  reason: collision with root package name */
    private x0 f6059g;

    /* renamed from: h  reason: collision with root package name */
    private v0 f6060h;

    /* renamed from: i  reason: collision with root package name */
    private g0 f6061i;

    /* renamed from: j  reason: collision with root package name */
    private com.adcolony.sdk.q f6062j;

    /* renamed from: k  reason: collision with root package name */
    private m0 f6063k;

    /* renamed from: l  reason: collision with root package name */
    private com.adcolony.sdk.c f6064l;

    /* renamed from: m  reason: collision with root package name */
    private com.adcolony.sdk.z f6065m;

    /* renamed from: n  reason: collision with root package name */
    private AdColonyAdView f6066n;

    /* renamed from: o  reason: collision with root package name */
    private AdColonyInterstitial f6067o;

    /* renamed from: p  reason: collision with root package name */
    private AdColonyRewardListener f6068p;

    /* renamed from: r  reason: collision with root package name */
    private AdColonyAppOptions f6070r;

    /* renamed from: s  reason: collision with root package name */
    private h0 f6071s;

    /* renamed from: t  reason: collision with root package name */
    private f1 f6072t;

    /* renamed from: w  reason: collision with root package name */
    private String f6075w;

    /* renamed from: x  reason: collision with root package name */
    private String f6076x;

    /* renamed from: y  reason: collision with root package name */
    private String f6077y;

    /* renamed from: q  reason: collision with root package name */
    private HashMap<String, AdColonyCustomMessageListener> f6069q = new HashMap<>();

    /* renamed from: u  reason: collision with root package name */
    private HashMap<String, AdColonyZone> f6073u = new HashMap<>();

    /* renamed from: v  reason: collision with root package name */
    private HashMap<Integer, c1> f6074v = new HashMap<>();

    /* renamed from: z  reason: collision with root package name */
    private String f6078z = "";
    private com.adcolony.sdk.f D = new com.adcolony.sdk.f();
    private int N = 1;
    private Partner P = null;
    private f1 Q = new f1();
    private long R = 500;
    private long S = 500;
    private long U = 20000;
    private long V = 300000;
    private long W = 15000;
    private boolean Y = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements j0 {
        a(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            f1 b10 = c0.b();
            c0.b(b10, "crc32", z0.a(c0.h(h0Var.a(), "data")));
            h0Var.a(b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a0 implements j0 {
        a0() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.a(true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements j0 {
        b(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            int d10 = c0.d(h0Var.a(), "number");
            f1 b10 = c0.b();
            c0.a(b10, "uuids", z0.a(d10));
            h0Var.a(b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b0 implements j0 {
        b0(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            f1 b10 = c0.b();
            c0.a(b10, "sha1", z0.b(c0.h(h0Var.a(), "data")));
            h0Var.a(b10).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements com.adcolony.sdk.y<String> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6081a;

            a(h0 h0Var) {
                this.f6081a = h0Var;
            }

            @Override // com.adcolony.sdk.y
            public void a(String str) {
                f1 b10 = c0.b();
                c0.a(b10, "advertiser_id", k.this.n().f());
                c0.b(b10, "limit_ad_tracking", k.this.n().A());
                this.f6081a.a(b10).c();
            }

            @Override // com.adcolony.sdk.y
            public void a(Throwable th) {
                new e0.a().a("Device.query_advertiser_info").a(" failed with error: ").a(Log.getStackTraceString(th)).a(e0.f5979g);
            }
        }

        c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.n().a(com.adcolony.sdk.a.a(), new a(h0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements j0 {
        d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            s0 a10 = k.this.q().a();
            k.this.n().c(c0.h(h0Var.a(), "version"));
            if (a10 != null) {
                a10.e(k.this.n().o());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements j0 {
        e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.Q = c0.f(h0Var.a(), "signals");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements j0 {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements com.adcolony.sdk.x<o.b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h0 f6086a;

            a(f fVar, h0 h0Var) {
                this.f6086a = h0Var;
            }

            @Override // com.adcolony.sdk.x
            public void a(o.b bVar) {
                f1 b10 = c0.b();
                if (bVar != null) {
                    c0.a(b10, "odt", bVar.b());
                }
                this.f6086a.a(b10).c();
            }
        }

        f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (k.this.G()) {
                o0.c().a(new a(this, h0Var), k.this.g());
                return;
            }
            o.b b10 = o0.c().b();
            f1 b11 = c0.b();
            if (b10 != null) {
                c0.a(b11, "odt", b10.b());
            }
            h0Var.a(b11).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements j0 {
        g(k kVar) {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            o0.c().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h implements j0 {
        h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.f6065m.a(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Context a10 = com.adcolony.sdk.a.a();
            if (!k.this.L && a10 != null) {
                try {
                    Omid.activate(a10.getApplicationContext());
                    k.this.L = true;
                } catch (IllegalArgumentException unused) {
                    new e0.a().a("IllegalArgumentException when activating Omid").a(e0.f5981i);
                    k.this.L = false;
                }
            }
            if (k.this.L && k.this.P == null) {
                try {
                    k.this.P = Partner.createPartner("AdColony", "4.8.0");
                } catch (IllegalArgumentException unused2) {
                    new e0.a().a("IllegalArgumentException when creating Omid Partner").a(e0.f5981i);
                    k.this.L = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class j implements Runnable {

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements s.a {
            a() {
            }

            @Override // com.adcolony.sdk.s.a
            public void a(com.adcolony.sdk.s sVar, h0 h0Var, Map<String, List<String>> map) {
                k.this.a(sVar);
            }
        }

        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 b10 = c0.b();
            c0.a(b10, "url", k.Z);
            c0.a(b10, "content_type", cc.L);
            c0.a(b10, "content", k.this.n().t().toString());
            c0.a(b10, "url", k.Z);
            if (k.this.Y) {
                f1 b11 = c0.b();
                c0.a(b11, "request", "la-req-01");
                c0.a(b11, ls.f18303n, "la-res-01");
                c0.a(b10, "dictionaries_mapping", b11);
            }
            k.this.f6054b.a(new com.adcolony.sdk.s(new h0("WebServices.post", 0, b10), new a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.adcolony.sdk.k$k  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0115k implements v.c {
        C0115k(k kVar) {
        }

        @Override // com.adcolony.sdk.v.c
        public void a() {
            o0.c().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f6091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h0 f6092b;

        l(Context context, h0 h0Var) {
            this.f6091a = context;
            this.f6092b = h0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adcolony.sdk.j a10 = com.adcolony.sdk.j.a(this.f6091a.getApplicationContext(), this.f6092b);
            k.this.f6074v.put(Integer.valueOf(a10.getAdc3ModuleId()), a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.adcolony.sdk.a.b().x().f()) {
                k.this.K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class n implements s.a {
        n() {
        }

        @Override // com.adcolony.sdk.s.a
        public void a(com.adcolony.sdk.s sVar, h0 h0Var, Map<String, List<String>> map) {
            k.this.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.L();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class p implements AdColonyInterstitial.f {
        p() {
        }

        @Override // com.adcolony.sdk.AdColonyInterstitial.f
        public void a() {
            k.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class q implements AdColonyAdView.c {
        q() {
        }

        @Override // com.adcolony.sdk.AdColonyAdView.c
        public void a() {
            k.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class r implements com.adcolony.sdk.x<n0> {
        r(k kVar) {
        }

        @Override // com.adcolony.sdk.x
        public void a(n0 n0Var) {
            o0.c().a(n0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f6099a;

        s(h0 h0Var) {
            this.f6099a = h0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f6068p.onReward(new AdColonyReward(this.f6099a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class t implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Integer> f6101a = new HashSet();

        t() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!k.this.f6055c.f()) {
                k.this.f6055c.c(true);
            }
            com.adcolony.sdk.a.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            com.adcolony.sdk.a.f5751d = false;
            k.this.f6055c.d(false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ScheduledExecutorService scheduledExecutorService;
            this.f6101a.add(Integer.valueOf(activity.hashCode()));
            com.adcolony.sdk.a.f5751d = true;
            com.adcolony.sdk.a.a(activity);
            s0 a10 = k.this.q().a();
            Context a11 = com.adcolony.sdk.a.a();
            if (a11 == null || !k.this.f6055c.e() || !(a11 instanceof com.adcolony.sdk.b) || ((com.adcolony.sdk.b) a11).f5808d) {
                com.adcolony.sdk.a.a(activity);
                if (k.this.f6071s != null) {
                    if (!Objects.equals(c0.h(k.this.f6071s.a(), "m_origin"), "")) {
                        k.this.f6071s.a(k.this.f6071s.a()).c();
                    }
                    k.this.f6071s = null;
                }
                k.this.B = false;
                k.this.f6055c.g(false);
                if (k.this.E && !k.this.f6055c.f()) {
                    k.this.f6055c.c(true);
                }
                k.this.f6055c.d(true);
                k.this.f6057e.c();
                if (a10 == null || (scheduledExecutorService = a10.f6251b) == null || scheduledExecutorService.isShutdown() || a10.f6251b.isTerminated()) {
                    AdColony.a(activity, com.adcolony.sdk.a.b().f6070r);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            k.this.f6055c.e(true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            this.f6101a.remove(Integer.valueOf(activity.hashCode()));
            if (this.f6101a.isEmpty()) {
                k.this.f6055c.e(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class u implements j0 {
        u() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.c(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class v implements j0 {
        v() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.a(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class w implements j0 {
        w() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            s0 a10 = k.this.q().a();
            k.this.D.a(true);
            if (k.this.J) {
                f1 b10 = c0.b();
                f1 b11 = c0.b();
                c0.a(b11, "app_version", z0.c());
                c0.a(b10, "app_bundle_info", b11);
                new h0("AdColony.on_update", 1, b10).c();
                k.this.J = false;
            }
            if (k.this.K) {
                new h0("AdColony.on_install", 1).c();
            }
            f1 a11 = h0Var.a();
            if (a10 != null) {
                a10.f(c0.h(a11, "app_session_id"));
            }
            if (AdColonyEventTracker.a()) {
                AdColonyEventTracker.b();
            }
            Integer i10 = a11.i("base_download_threads");
            if (i10 != null) {
                k.this.f6054b.a(i10.intValue());
            }
            Integer i11 = a11.i("concurrent_requests");
            if (i11 != null) {
                k.this.f6054b.b(i11.intValue());
            }
            Integer i12 = a11.i("threads_keep_alive_time");
            if (i12 != null) {
                k.this.f6054b.c(i12.intValue());
            }
            double h10 = a11.h("thread_pool_scaling_factor");
            if (!Double.isNaN(h10)) {
                k.this.f6054b.a(h10);
            }
            k.this.f6065m.b();
            k.this.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class x implements j0 {
        x() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.b(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class y implements j0 {
        y() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.e(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class z implements j0 {
        z() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            k.this.f(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        new Thread(new j()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        this.f6053a.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        f1 b10 = c0.b();
        c0.a(b10, "type", "AdColony.on_configuration_completed");
        e1 e1Var = new e1();
        for (String str : C().keySet()) {
            e1Var.b(str);
        }
        f1 b11 = c0.b();
        c0.a(b11, "zone_ids", e1Var);
        c0.a(b10, "message", b11);
        new h0("CustomMessage.controller_send", 0, b10).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (!a(this.f6076x) && !com.adcolony.sdk.l.H) {
            new e0.a().a("Downloaded controller sha1 does not match, retrying.").a(e0.f5978f);
            S();
            return;
        }
        if (!this.F && !this.I) {
            z0.b(new o());
        }
        if (this.F && this.I) {
            Q();
        }
    }

    private void O() {
        Application application;
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null || this.O != null || Build.VERSION.SDK_INT <= 14) {
            return;
        }
        this.O = new t();
        if (a10 instanceof Application) {
            application = (Application) a10;
        } else {
            application = ((Activity) a10).getApplication();
        }
        application.registerActivityLifecycleCallbacks(this.O);
    }

    private void S() {
        if (com.adcolony.sdk.a.b().x().f()) {
            int i10 = this.M + 1;
            this.M = i10;
            this.N = Math.min(this.N * i10, 120);
            z0.a(new m(), this.N * 1000);
            return;
        }
        new e0.a().a("Max launch server download attempts hit, or AdColony is no longer").a(" active.").a(e0.f5979g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0 A() {
        if (this.f6059g == null) {
            x0 x0Var = new x0();
            this.f6059g = x0Var;
            x0Var.a();
        }
        return this.f6059g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, c1> B() {
        return this.f6074v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, AdColonyZone> C() {
        return this.f6073u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        return this.f6070r != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H() {
        return this.Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I() {
        return this.D.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J() {
        return this.A;
    }

    void P() {
        this.D.a(false);
        this.f6056d.b();
        Object option = this.f6070r.getOption("force_ad_id");
        if ((option instanceof String) && !((String) option).isEmpty()) {
            R();
        }
        AdColony.a(com.adcolony.sdk.a.a(), this.f6070r);
        T();
        this.f6073u.clear();
        this.f6053a.a();
    }

    void Q() {
        this.X = 0;
        for (AdColonyInterstitial adColonyInterstitial : this.f6056d.f().values()) {
            if (adColonyInterstitial.m()) {
                this.X++;
                adColonyInterstitial.a(new p());
            }
        }
        for (AdColonyAdView adColonyAdView : this.f6056d.d().values()) {
            this.X++;
            adColonyAdView.setOnDestroyListenerOrCall(new q());
        }
        if (this.X == 0) {
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        synchronized (this.f6056d.f()) {
            for (AdColonyInterstitial adColonyInterstitial : this.f6056d.f().values()) {
                adColonyInterstitial.p();
            }
            this.f6056d.f().clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        a(1);
        for (c1 c1Var : this.f6074v.values()) {
            this.f6053a.b(c1Var);
        }
        this.f6074v.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAppOptions u() {
        if (this.f6070r == null) {
            this.f6070r = new AdColonyAppOptions();
        }
        return this.f6070r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String v() {
        return f6052a0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyRewardListener w() {
        return this.f6068p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0 x() {
        if (this.f6055c == null) {
            t0 t0Var = new t0();
            this.f6055c = t0Var;
            t0Var.d();
        }
        return this.f6055c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long y() {
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0 z() {
        if (this.f6060h == null) {
            v0 v0Var = new v0();
            this.f6060h = v0Var;
            v0Var.e();
        }
        return this.f6060h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f6078z;
    }

    long g() {
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        return this.V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long i() {
        return this.W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyInterstitial j() {
        return this.f6067o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyAdView k() {
        return this.f6066n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.adcolony.sdk.c l() {
        return this.f6064l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, AdColonyCustomMessageListener> m() {
        return this.f6069q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.adcolony.sdk.q n() {
        if (this.f6062j == null) {
            com.adcolony.sdk.q qVar = new com.adcolony.sdk.q();
            this.f6062j = qVar;
            qVar.M();
        }
        return this.f6062j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.adcolony.sdk.r o() {
        if (this.f6057e == null) {
            this.f6057e = new com.adcolony.sdk.r();
        }
        return this.f6057e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.adcolony.sdk.w p() {
        if (this.f6058f == null) {
            com.adcolony.sdk.w wVar = new com.adcolony.sdk.w();
            this.f6058f = wVar;
            wVar.b();
        }
        return this.f6058f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0 q() {
        if (this.f6061i == null) {
            g0 g0Var = new g0();
            this.f6061i = g0Var;
            g0Var.c();
        }
        return this.f6061i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0 r() {
        if (this.f6053a == null) {
            i0 i0Var = new i0();
            this.f6053a = i0Var;
            i0Var.a();
        }
        return this.f6053a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0 s() {
        if (this.f6063k == null) {
            this.f6063k = new m0();
        }
        return this.f6063k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Partner t() {
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(h0 h0Var) {
        AdColonyZone adColonyZone;
        if (this.C) {
            return;
        }
        String h10 = c0.h(h0Var.a(), "zone_id");
        if (this.f6073u.containsKey(h10)) {
            adColonyZone = this.f6073u.get(h10);
        } else {
            AdColonyZone adColonyZone2 = new AdColonyZone(h10);
            this.f6073u.put(h10, adColonyZone2);
            adColonyZone = adColonyZone2;
        }
        adColonyZone.a(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(h0 h0Var) {
        this.f6071s = h0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(h0 h0Var) {
        if (this.f6068p != null) {
            z0.b(new s(h0Var));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(h0 h0Var) {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 == null) {
            return false;
        }
        try {
            int j10 = h0Var.a().j(ug.f21009x);
            if (j10 > 0) {
                a(j10);
            }
            z0.b(new l(a10, h0Var));
            return true;
        } catch (RuntimeException e8) {
            e0.a aVar = new e0.a();
            aVar.a(e8.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f5980h);
            AdColony.disable();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z10) {
        this.D.a(false);
        this.C = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z10) {
        this.E = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long d() {
        return this.U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z10) {
        this.A = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h0 h0Var) {
        f1 b10 = this.f6070r.b();
        c0.a(b10, "app_id", this.f6070r.a());
        f1 b11 = c0.b();
        c0.a(b11, "options", b10);
        h0Var.a(b11).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1 e() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.adcolony.sdk.AdColonyAppOptions r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.k.a(com.adcolony.sdk.AdColonyAppOptions, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i10 = this.X - 1;
        this.X = i10;
        if (i10 == 0) {
            P();
        }
    }

    private void b(f1 f1Var) {
        if (!com.adcolony.sdk.l.H) {
            f1 f10 = c0.f(f1Var, "logging");
            g0.f6002h = c0.a(f10, "send_level", 1);
            g0.f6000f = c0.b(f10, "log_private");
            g0.f6001g = c0.a(f10, "print_level", 3);
            this.f6061i.b(c0.a(f10, "modules"));
            this.f6061i.c(c0.e(f10, "included_fields"));
        }
        f1 f11 = c0.f(f1Var, "metadata");
        n().a(f11);
        x().a(c0.d(f11, "session_timeout"));
        f6052a0 = c0.h(f1Var, "pie");
        this.f6078z = c0.h(c0.f(f1Var, "controller"), "version");
        this.R = c0.a(f11, "signals_timeout", this.R);
        this.S = c0.a(f11, "calculate_odt_timeout", this.S);
        this.T = c0.a(f11, "async_odt_query", this.T);
        this.U = c0.a(f11, "ad_request_timeout", this.U);
        this.V = c0.a(f11, "controller_heartbeat_interval", this.V);
        this.W = c0.a(f11, "controller_heartbeat_timeout", this.W);
        this.Y = c0.a(f11, "enable_compression", false);
        com.adcolony.sdk.v.a().a(f11.n("odt_config"), new r(this));
    }

    private boolean c(f1 f1Var) {
        if (f1Var == null) {
            return false;
        }
        try {
            try {
                f1 f10 = c0.f(f1Var, "controller");
                this.f6075w = c0.h(f10, "url");
                this.f6076x = c0.h(f10, "sha1");
                this.f6077y = c0.h(f1Var, "status");
                b(f1Var);
                if (AdColonyEventTracker.a()) {
                    AdColonyEventTracker.b();
                }
            } catch (Exception unused) {
                new File(this.f6060h.a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141").delete();
            }
        } catch (Exception unused2) {
        }
        if (this.f6077y.equals("disable") && !com.adcolony.sdk.l.H) {
            try {
                new File(this.f6060h.a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5").delete();
            } catch (Exception unused3) {
            }
            new e0.a().a("Launch server response with disabled status. Disabling AdColony ").a("until next launch.").a(e0.f5979g);
            AdColony.disable();
            return false;
        } else if ((this.f6075w.equals("") || this.f6077y.equals("")) && !com.adcolony.sdk.l.H) {
            new e0.a().a("Missing controller status or URL. Disabling AdColony until next ").a("launch.").a(e0.f5981i);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(AdColonyAppOptions adColonyAppOptions) {
        this.f6070r = adColonyAppOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10) {
        this.B = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.adcolony.sdk.d c() {
        if (this.f6056d == null) {
            com.adcolony.sdk.d dVar = new com.adcolony.sdk.d();
            this.f6056d = dVar;
            dVar.h();
        }
        return this.f6056d;
    }

    private boolean a(boolean z10) {
        return a(z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z10, boolean z11) {
        if (com.adcolony.sdk.a.c()) {
            this.I = z11;
            this.F = z10;
            if (z10 && !z11) {
                if (!L()) {
                    return false;
                }
                this.I = true;
            }
            K();
            return true;
        }
        return false;
    }

    private boolean a(f1 f1Var) {
        if (this.F) {
            f1 f1Var2 = this.f6072t;
            if (f1Var2 == null || !c0.h(c0.f(f1Var2, "controller"), "sha1").equals(c0.h(c0.f(f1Var, "controller"), "sha1"))) {
                new e0.a().a("Controller sha1 does not match, downloading new controller.").a(e0.f5979g);
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h0 h0Var) {
        a(c0.d(h0Var.a(), ug.f21009x));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.adcolony.sdk.s sVar) {
        if (sVar.f6247n) {
            f1 a10 = c0.a(sVar.f6246m, "Parsing launch response");
            c0.a(a10, "sdkVersion", n().I());
            c0.j(a10, this.f6060h.a() + "026ae9c9824b3e483fa6c71fa88f57ae27816141");
            if (!c(a10)) {
                if (this.F) {
                    return;
                }
                new e0.a().a("Incomplete or disabled launch server response. ").a("Disabling AdColony until next launch.").a(e0.f5980h);
                b(true);
                return;
            }
            if (a(a10)) {
                f1 b10 = c0.b();
                c0.a(b10, "url", this.f6075w);
                c0.a(b10, "filepath", this.f6060h.a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
                this.f6054b.a(new com.adcolony.sdk.s(new h0("WebServices.download", 0, b10), new n()));
            }
            this.f6072t = a10;
            return;
        }
        S();
    }

    private boolean a(String str) {
        Context a10 = com.adcolony.sdk.a.a();
        if (a10 != null) {
            File file = new File(a10.getFilesDir().getAbsolutePath() + "/adc3/7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            if (file.exists()) {
                return z0.a(str, file);
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f6056d.a();
        P();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyAppOptions adColonyAppOptions) {
        this.D.a(false);
        this.f6056d.b();
        R();
        AdColony.a(com.adcolony.sdk.a.a(), adColonyAppOptions);
        T();
        this.f6073u.clear();
        this.f6070r = adColonyAppOptions;
        this.f6053a.a();
        a(true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(k0 k0Var) {
        this.f6074v.remove(Integer.valueOf(k0Var.getModuleId()));
        return this.f6053a.b(k0Var);
    }

    boolean a(int i10) {
        this.f6074v.remove(Integer.valueOf(i10));
        return this.f6053a.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyRewardListener adColonyRewardListener) {
        this.f6068p = adColonyRewardListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.adcolony.sdk.c cVar) {
        this.f6064l = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyAdView adColonyAdView) {
        this.f6066n = adColonyAdView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyInterstitial adColonyInterstitial) {
        this.f6067o = adColonyInterstitial;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j10) {
        this.D.a(j10);
    }
}
