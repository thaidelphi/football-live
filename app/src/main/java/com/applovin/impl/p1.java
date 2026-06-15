package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.c2;
import com.applovin.impl.e0;
import com.applovin.impl.p1;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class p1 implements c2.a, AppLovinBroadcastManager.Receiver, a.b {
    protected AppLovinAdClickListener A;
    protected AppLovinAdDisplayListener B;
    protected AppLovinAdVideoPlaybackListener C;
    protected final c2 D;
    protected y6 E;
    protected y6 F;
    protected boolean G;
    private final e0 H;

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f8323a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f8324b;

    /* renamed from: c  reason: collision with root package name */
    protected final com.applovin.impl.sdk.n f8325c;

    /* renamed from: d  reason: collision with root package name */
    protected Activity f8326d;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.b f8328f;

    /* renamed from: g  reason: collision with root package name */
    private final h.a f8329g;

    /* renamed from: h  reason: collision with root package name */
    protected AppLovinAdView f8330h;

    /* renamed from: i  reason: collision with root package name */
    protected com.applovin.impl.adview.k f8331i;

    /* renamed from: j  reason: collision with root package name */
    protected final com.applovin.impl.adview.g f8332j;

    /* renamed from: k  reason: collision with root package name */
    protected final com.applovin.impl.adview.g f8333k;

    /* renamed from: p  reason: collision with root package name */
    protected long f8338p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f8339q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f8340r;

    /* renamed from: s  reason: collision with root package name */
    protected int f8341s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f8342t;

    /* renamed from: z  reason: collision with root package name */
    protected boolean f8348z;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f8327e = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    protected final long f8334l = SystemClock.elapsedRealtime();

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f8335m = new AtomicBoolean();

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f8336n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    protected long f8337o = -1;

    /* renamed from: u  reason: collision with root package name */
    private int f8343u = 0;

    /* renamed from: v  reason: collision with root package name */
    private final ArrayList f8344v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    protected int f8345w = 0;

    /* renamed from: x  reason: collision with root package name */
    protected int f8346x = 0;

    /* renamed from: y  reason: collision with root package name */
    protected int f8347y = com.applovin.impl.sdk.h.f8866h;
    private boolean I = false;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = p1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                p1.this.f8325c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = p1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                p1.this.f8325c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            p1.this.c();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements h.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.h.a
        public void a(int i10) {
            p1 p1Var = p1.this;
            if (p1Var.f8347y != com.applovin.impl.sdk.h.f8866h) {
                p1Var.f8348z = true;
            }
            com.applovin.impl.adview.b f10 = p1Var.f8330h.getController().f();
            if (f10 == null) {
                com.applovin.impl.sdk.n nVar = p1.this.f8325c;
                if (com.applovin.impl.sdk.n.a()) {
                    p1.this.f8325c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.h.a(i10) && !com.applovin.impl.sdk.h.a(p1.this.f8347y)) {
                f10.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                f10.a("javascript:al_muteSwitchOff();");
            }
            p1.this.f8347y = i10;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class c extends com.applovin.impl.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f8351a;

        c(com.applovin.impl.sdk.j jVar) {
            this.f8351a = jVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!activity.getClass().getName().equals(d7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f8351a)) || p1.this.f8336n.get()) {
                return;
            }
            com.applovin.impl.sdk.n.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
            try {
                p1.this.c();
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                try {
                    p1.this.k();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d {
        void a(p1 p1Var);

        void a(String str, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements AppLovinAdClickListener, View.OnClickListener {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            p1.this.f8337o = SystemClock.elapsedRealtime();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.n nVar = p1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                p1.this.f8325c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            l2.a(p1.this.A, appLovinAd);
            p1.this.f8346x++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p1 p1Var = p1.this;
            if (view == p1Var.f8332j && ((Boolean) p1Var.f8324b.a(o4.f8085c2)).booleanValue()) {
                p1.c(p1.this);
                if (p1.this.f8323a.R0()) {
                    p1 p1Var2 = p1.this;
                    p1Var2.c("javascript:al_onCloseButtonTapped(" + p1.this.f8343u + "," + p1.this.f8345w + "," + p1.this.f8346x + ");");
                }
                List L = p1.this.f8323a.L();
                com.applovin.impl.sdk.n nVar = p1.this.f8325c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar2 = p1.this.f8325c;
                    nVar2.a("AppLovinFullscreenActivity", "Handling close button tap " + p1.this.f8343u + " with multi close delay: " + L);
                }
                if (L != null && L.size() > p1.this.f8343u) {
                    p1.this.f8344v.add(Long.valueOf(SystemClock.elapsedRealtime() - p1.this.f8337o));
                    List J = p1.this.f8323a.J();
                    if (J != null && J.size() > p1.this.f8343u) {
                        p1 p1Var3 = p1.this;
                        p1Var3.f8332j.a((e.a) J.get(p1Var3.f8343u));
                    }
                    com.applovin.impl.sdk.n nVar3 = p1.this.f8325c;
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n nVar4 = p1.this.f8325c;
                        nVar4.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + L.get(p1.this.f8343u));
                    }
                    p1.this.f8332j.setVisibility(8);
                    p1 p1Var4 = p1.this;
                    p1Var4.a(p1Var4.f8332j, ((Integer) L.get(p1Var4.f8343u)).intValue(), new Runnable() { // from class: com.applovin.impl.kd
                        @Override // java.lang.Runnable
                        public final void run() {
                            p1.e.this.a();
                        }
                    });
                    return;
                }
                p1.this.c();
                return;
            }
            com.applovin.impl.sdk.n nVar5 = p1.this.f8325c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar6 = p1.this.f8325c;
                nVar6.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        /* synthetic */ e(p1 p1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f8323a = bVar;
        this.f8324b = jVar;
        this.f8325c = jVar.I();
        this.f8326d = activity;
        this.A = appLovinAdClickListener;
        this.B = appLovinAdDisplayListener;
        this.C = appLovinAdVideoPlaybackListener;
        c2 c2Var = new c2(activity, jVar);
        this.D = c2Var;
        c2Var.a(this);
        this.H = new e0(jVar);
        e eVar = new e(this, null);
        if (((Boolean) jVar.a(o4.f8261y2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) jVar.a(o4.E2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        n1 n1Var = new n1(jVar.q0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f8330h = n1Var;
        n1Var.setAdClickListener(eVar);
        this.f8330h.setAdDisplayListener(new a());
        bVar.e().putString("ad_view_address", u7.a(this.f8330h));
        this.f8330h.getController().a(this);
        x1 x1Var = new x1(map, jVar);
        if (x1Var.c()) {
            this.f8331i = new com.applovin.impl.adview.k(x1Var, activity);
        }
        jVar.j().trackImpression(bVar);
        List L = bVar.L();
        if (bVar.p() < 0 && L == null) {
            this.f8332j = null;
        } else {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.n(), activity);
            this.f8332j = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(eVar);
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f8333k = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.dd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.this.b(view);
            }
        });
        if (bVar.U0()) {
            this.f8329g = new b();
        } else {
            this.f8329g = null;
        }
        this.f8328f = new c(jVar);
    }

    static /* synthetic */ int c(p1 p1Var) {
        int i10 = p1Var.f8343u;
        p1Var.f8343u = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f8323a.D0().getAndSet(true)) {
            return;
        }
        this.f8324b.i0().a((z4) new f6(this.f8323a, this.f8324b), u5.b.OTHER);
    }

    private void y() {
        if (this.f8329g != null) {
            this.f8324b.o().a(this.f8329g);
        }
        if (this.f8328f != null) {
            this.f8324b.e().a(this.f8328f);
        }
    }

    public abstract void a(long j10);

    public abstract void a(ViewGroup viewGroup);

    public void e() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f8340r = true;
    }

    public boolean g() {
        return this.f8339q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f8323a.getType();
    }

    protected boolean i() {
        return this.f8326d instanceof AppLovinFullscreenActivity;
    }

    protected void k() {
        if (this.f8336n.compareAndSet(false, true)) {
            l2.b(this.B, this.f8323a);
            this.f8324b.B().b(this.f8323a);
            this.f8324b.D().a(y1.f9686q, this.f8323a);
        }
    }

    protected abstract void l();

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
        y6 y6Var = this.E;
        if (y6Var != null) {
            y6Var.d();
        }
    }

    protected void n() {
        y6 y6Var = this.E;
        if (y6Var != null) {
            y6Var.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
        com.applovin.impl.adview.b f10;
        if (this.f8330h == null || !this.f8323a.v0() || (f10 = this.f8330h.getController().f()) == null) {
            return;
        }
        this.H.a(f10, new e0.c() { // from class: com.applovin.impl.ed
            @Override // com.applovin.impl.e0.c
            public final void a(View view) {
                p1.this.a(view);
            }
        });
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.f8340r) {
            f();
        } else if ("com.applovin.al_onPoststitialShow_evaluation_error".equals(intent.getAction())) {
            e();
        }
    }

    public void p() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.I) {
            c();
        }
        if (this.f8323a.R0()) {
            c("javascript:onBackPressed();");
        }
    }

    public void q() {
        AppLovinAdView appLovinAdView = this.f8330h;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f8330h.destroy();
            this.f8330h = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        l();
        k();
        this.A = null;
        this.B = null;
        this.C = null;
        this.f8326d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void r() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "onPause()");
        }
        b("javascript:al_onAppPaused();");
        if (this.D.b()) {
            this.D.a();
        }
        m();
    }

    public void s() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "onResume()");
        }
        b("javascript:al_onAppResumed();");
        n();
        if (this.D.b()) {
            this.D.a();
        }
    }

    public void t() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void u();

    public abstract void v();

    /* JADX INFO: Access modifiers changed from: protected */
    public void w() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.G = true;
    }

    protected abstract void x();

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.j jVar, Activity activity, d dVar) {
        p1 s1Var;
        if (bVar instanceof e7) {
            try {
                s1Var = new s1(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                dVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + jVar + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                s1Var = new t1(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                dVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + jVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                s1Var = new q1(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                dVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + jVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        s1Var.y();
        dVar.a(s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(boolean z10) {
        a(z10, ((Long) this.f8324b.a(o4.f8245w2)).longValue());
        l2.a(this.B, this.f8323a);
        this.f8324b.B().a(this.f8323a);
        if (this.f8323a.hasVideoUrl() || h()) {
            l2.a(this.C, this.f8323a);
        }
        new d4(this.f8326d).a(this.f8323a);
        this.f8323a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        int r10 = this.f8323a.r();
        return (r10 <= 0 && ((Boolean) this.f8324b.a(o4.f8237v2)).booleanValue()) ? this.f8341s + 1 : r10;
    }

    public void b(boolean z10) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        b("javascript:al_onWindowFocusChanged( " + z10 + " );");
        y6 y6Var = this.F;
        if (y6Var != null) {
            if (z10) {
                y6Var.e();
            } else {
                y6Var.d();
            }
        }
    }

    protected void b(String str) {
        if (this.f8323a.z0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        u7.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.gd
            @Override // java.lang.Runnable
            public final void run() {
                p1.a(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    public void c() {
        this.f8339q = true;
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.d("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.b bVar = this.f8323a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f8327e.removeCallbacksAndMessages(null);
        com.applovin.impl.sdk.ad.b bVar2 = this.f8323a;
        a("javascript:al_onPoststitialDismiss();", bVar2 != null ? bVar2.C() : 0L);
        k();
        this.H.b();
        if (this.f8329g != null) {
            this.f8324b.o().b(this.f8329g);
        }
        if (this.f8328f != null) {
            this.f8324b.e().b(this.f8328f);
        }
        if (i()) {
            this.f8326d.finish();
            return;
        }
        this.f8324b.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f8324b.I().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(long j10) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.E = y6.a(j10, this.f8324b, new Runnable() { // from class: com.applovin.impl.id
            @Override // java.lang.Runnable
            public final void run() {
                p1.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(boolean z10) {
        List a10 = d7.a(z10, this.f8323a, this.f8324b, this.f8326d);
        if (a10.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f8324b.a(o4.f8264y5)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f8325c;
                nVar.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + a10);
            }
            if (((Boolean) this.f8324b.a(o4.B5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.B;
                if (appLovinAdDisplayListener instanceof f2) {
                    l2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
                c();
            } else {
                h2.a(this.f8323a, this.B, "Missing ad resources", null, null);
                c();
            }
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid("error_message", "Missing ad resources: " + a10, hashMap);
            CollectionUtils.putStringIfValid("details", "Failing ad display", hashMap);
            this.f8324b.D().a(y1.f9667g0, "missingCachedAdResources", hashMap);
            return ((Boolean) this.f8324b.a(o4.A5)).booleanValue();
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar2 = this.f8325c;
            nVar2.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + a10);
        }
        this.f8323a.I0();
        HashMap hashMap2 = new HashMap();
        CollectionUtils.putStringIfValid("error_message", "Missing ad resources: " + a10, hashMap2);
        CollectionUtils.putStringIfValid("details", "Streaming ad", hashMap2);
        this.f8324b.D().a(y1.f9667g0, "missingCachedAdResources", hashMap2);
        return false;
    }

    public void c(String str) {
        a(str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.fd
            @Override // java.lang.Runnable
            public final void run() {
                p1.b(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f8325c != null && com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f8323a;
        if (bVar == null || !bVar.T0()) {
            return;
        }
        if (i10 == 24 || i10 == 25) {
            String str = i10 == 24 ? "volume_up" : "volume_down";
            c("javascript:al_onVolumeChangedEvent('" + str + "');");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final String str, long j10) {
        if (j10 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.jd
            @Override // java.lang.Runnable
            public final void run() {
                p1.this.a(str);
            }
        }, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        com.applovin.impl.adview.b f10;
        AppLovinAdView appLovinAdView = this.f8330h;
        if (appLovinAdView == null || (f10 = appLovinAdView.getController().f()) == null) {
            return;
        }
        f10.a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final com.applovin.impl.adview.g gVar, long j10, final Runnable runnable) {
        if (j10 >= ((Long) this.f8324b.a(o4.f8077b2)).longValue()) {
            return;
        }
        this.F = y6.a(TimeUnit.SECONDS.toMillis(j10), this.f8324b, new Runnable() { // from class: com.applovin.impl.hd
            @Override // java.lang.Runnable
            public final void run() {
                p1.c(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10, boolean z10, boolean z11, long j10) {
        if (this.f8335m.compareAndSet(false, true)) {
            if (this.f8323a.hasVideoUrl() || h()) {
                l2.a(this.C, this.f8323a, i10, z11);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8334l;
            this.f8324b.j().trackVideoEnd(this.f8323a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i10, z10);
            long elapsedRealtime2 = this.f8337o != -1 ? SystemClock.elapsedRealtime() - this.f8337o : -1L;
            this.f8324b.j().trackFullScreenAdClosed(this.f8323a, elapsedRealtime2, this.f8344v, j10, this.f8348z, this.f8347y);
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f8325c;
                nVar.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i10 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j10 + "ms, closeTimeMillis: " + elapsedRealtime2 + "ms");
            }
        }
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z10, long j10) {
        if (this.f8323a.J0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        if (((Boolean) this.f8324b.a(o4.Q0)).booleanValue()) {
            this.f8324b.A().c(this.f8323a, com.applovin.impl.sdk.j.m());
        }
        Map b10 = a2.b(this.f8323a);
        b10.putAll(a2.a(this.f8323a));
        this.f8324b.D().d(y1.f9665f0, b10);
        if (((Boolean) this.f8324b.a(o4.U5)).booleanValue()) {
            w();
        }
        if (((Boolean) this.f8324b.a(o4.Q5)).booleanValue()) {
            c();
            return;
        }
        this.I = ((Boolean) this.f8324b.a(o4.R5)).booleanValue();
        if (((Boolean) this.f8324b.a(o4.S5)).booleanValue()) {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f8327e);
    }
}
