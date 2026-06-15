package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.u5;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class q1 extends p1 {
    private final r1 J;
    private d0 K;
    private long L;
    private final AtomicBoolean M;

    public q1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.J = new r1(this.f8323a, this.f8326d, this.f8324b);
        this.M = new AtomicBoolean();
    }

    private int A() {
        d0 d0Var;
        int i10 = 100;
        if (h()) {
            if (!B() && (d0Var = this.K) != null) {
                i10 = (int) Math.min(100.0d, ((this.L - d0Var.b()) / this.L) * 100.0d);
            }
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f8325c;
                nVar.a("AppLovinFullscreenActivity", "Ad engaged at " + i10 + "%");
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.M.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f8337o = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f8332j;
        if (gVar != null) {
            arrayList.add(new x3(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f8331i;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f8331i;
            arrayList.add(new x3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f8323a.getAdEventTracker().b(this.f8330h, arrayList);
    }

    private long z() {
        com.applovin.impl.sdk.ad.b bVar = this.f8323a;
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            float f12 = ((com.applovin.impl.sdk.ad.a) bVar).f1();
            if (f12 <= 0.0f) {
                f12 = (float) this.f8323a.p();
            }
            return (long) (d7.c(f12) * (this.f8323a.E() / 100.0d));
        }
        return 0L;
    }

    protected boolean B() {
        if (!(this.G && this.f8323a.Y0()) && h()) {
            return this.M.get();
        }
        return true;
    }

    protected void F() {
        long W;
        long j10 = 0;
        if (this.f8323a.V() >= 0 || this.f8323a.W() >= 0) {
            if (this.f8323a.V() >= 0) {
                W = this.f8323a.V();
            } else {
                if (this.f8323a.V0()) {
                    int f12 = (int) ((com.applovin.impl.sdk.ad.a) this.f8323a).f1();
                    if (f12 > 0) {
                        j10 = TimeUnit.SECONDS.toMillis(f12);
                    } else {
                        int p10 = (int) this.f8323a.p();
                        if (p10 > 0) {
                            j10 = TimeUnit.SECONDS.toMillis(p10);
                        }
                    }
                }
                W = (long) (j10 * (this.f8323a.W() / 100.0d));
            }
            b(W);
        }
    }

    @Override // com.applovin.impl.c2.a
    public void a() {
    }

    @Override // com.applovin.impl.p1
    public void a(long j10) {
    }

    @Override // com.applovin.impl.p1
    public void a(ViewGroup viewGroup) {
        this.J.a(this.f8332j, this.f8331i, this.f8330h, viewGroup);
        if (a(false)) {
            return;
        }
        com.applovin.impl.adview.k kVar = this.f8331i;
        if (kVar != null) {
            kVar.b();
        }
        this.f8330h.renderAd(this.f8323a);
        a("javascript:al_onPoststitialShow();", this.f8323a.D());
        if (h()) {
            long z10 = z();
            this.L = z10;
            if (z10 > 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n nVar = this.f8325c;
                    nVar.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.L + "ms...");
                }
                this.K = d0.a(this.L, this.f8324b, new Runnable() { // from class: com.applovin.impl.rd
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.this.C();
                    }
                });
            }
        }
        if (this.f8332j != null) {
            if (this.f8323a.p() >= 0) {
                a(this.f8332j, this.f8323a.p(), new Runnable() { // from class: com.applovin.impl.qd
                    @Override // java.lang.Runnable
                    public final void run() {
                        q1.this.D();
                    }
                });
            } else {
                this.f8332j.setVisibility(0);
            }
        }
        F();
        this.f8324b.i0().a(new k6(this.f8324b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.sd
            @Override // java.lang.Runnable
            public final void run() {
                q1.this.E();
            }
        }), u5.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
        o();
        super.c(d7.e(this.f8324b));
    }

    @Override // com.applovin.impl.c2.a
    public void b() {
    }

    @Override // com.applovin.impl.p1
    public void c() {
        l();
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.a();
            this.K = null;
        }
        super.c();
    }

    @Override // com.applovin.impl.p1
    public void e() {
        super.e();
        x();
    }

    @Override // com.applovin.impl.p1
    public void f() {
        super.f();
        x();
    }

    @Override // com.applovin.impl.p1
    protected void l() {
        super.a(A(), false, B(), -2L);
    }

    @Override // com.applovin.impl.p1
    public void u() {
    }

    @Override // com.applovin.impl.p1
    public void v() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.p1
    public void w() {
        super.w();
        this.M.set(true);
    }

    @Override // com.applovin.impl.p1
    protected void x() {
        this.J.a(this.f8333k);
        this.f8337o = SystemClock.elapsedRealtime();
        this.M.set(true);
    }
}
