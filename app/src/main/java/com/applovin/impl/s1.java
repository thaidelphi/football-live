package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.e7;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s1 extends t1 {

    /* renamed from: m0  reason: collision with root package name */
    private final e7 f8579m0;

    /* renamed from: n0  reason: collision with root package name */
    private final Set f8580n0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements x0.b {
        a() {
        }

        @Override // com.applovin.impl.x0.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(s1.this.f9220d0 - (s1.this.M.getDuration() - s1.this.M.getCurrentPosition()));
            int z10 = s1.this.z();
            HashSet hashSet = new HashSet();
            for (o7 o7Var : new HashSet(s1.this.f8580n0)) {
                if (o7Var.a(seconds, z10)) {
                    hashSet.add(o7Var);
                    s1.this.f8580n0.remove(o7Var);
                }
            }
            s1.this.a(hashSet);
            if (z10 >= 25 && z10 < 50) {
                s1.this.f8579m0.getAdEventTracker().x();
            } else if (z10 >= 50 && z10 < 75) {
                s1.this.f8579m0.getAdEventTracker().y();
            } else if (z10 >= 75) {
                s1.this.f8579m0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.x0.b
        public boolean b() {
            return !s1.this.f9223g0;
        }
    }

    public s1(com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f8580n0 = hashSet;
        e7 e7Var = (e7) bVar;
        this.f8579m0 = e7Var;
        if (e7Var.p1()) {
            ImageView a10 = k7.a(e7Var.j1().e(), activity, jVar);
            this.U = a10;
            a10.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.vd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s1.this.a(activity, jVar, view);
                }
            });
        }
        e7.d dVar = e7.d.VIDEO;
        hashSet.addAll(e7Var.a(dVar, p7.f8364a));
        a(e7.d.IMPRESSION);
        a(dVar, "creativeView");
        e7Var.getAdEventTracker().g();
    }

    private boolean T() {
        return this.U != null && this.f8579m0.p1();
    }

    private void U() {
        if (!D() || this.f8580n0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.k("AppLovinFullscreenActivity", "Firing " + this.f8580n0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.f8580n0);
    }

    @Override // com.applovin.impl.t1
    public void A() {
        a(e7.d.VIDEO, "skip");
        this.f8579m0.getAdEventTracker().B();
        super.A();
    }

    @Override // com.applovin.impl.t1
    protected void B() {
        super.B();
        e7 e7Var = this.f8579m0;
        if (e7Var != null) {
            e7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.t1
    protected void L() {
        long W;
        int p10;
        long j10 = 0;
        if (this.f8579m0.V() >= 0 || this.f8579m0.W() >= 0) {
            if (this.f8579m0.V() >= 0) {
                W = this.f8579m0.V();
            } else {
                e7 e7Var = this.f8579m0;
                r7 n12 = e7Var.n1();
                if (n12 != null && n12.d() > 0) {
                    j10 = TimeUnit.SECONDS.toMillis(n12.d());
                } else {
                    long j11 = this.f9220d0;
                    if (j11 > 0) {
                        j10 = j11;
                    }
                }
                if (e7Var.V0() && (p10 = (int) e7Var.p()) > 0) {
                    j10 += TimeUnit.SECONDS.toMillis(p10);
                }
                W = (long) (j10 * (this.f8579m0.W() / 100.0d));
            }
            b(W);
        }
    }

    @Override // com.applovin.impl.t1
    protected void P() {
        super.P();
        e7 e7Var = this.f8579m0;
        if (e7Var != null) {
            e7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.t1
    public void Q() {
        U();
        if (q7.a(this.f8579m0)) {
            if (this.f9223g0) {
                return;
            }
            a(e7.d.COMPANION, "creativeView");
            this.f8579m0.getAdEventTracker().w();
            super.Q();
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f8325c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        c();
    }

    @Override // com.applovin.impl.t1
    public void S() {
        super.S();
        a(e7.d.VIDEO, this.f9219c0 ? "mute" : "unmute");
        this.f8579m0.getAdEventTracker().b(this.f9219c0);
    }

    @Override // com.applovin.impl.t1, com.applovin.impl.p1
    public void c() {
        if (this.f8579m0 != null) {
            a(e7.d.VIDEO, "close");
            a(e7.d.COMPANION, "close");
        }
        super.c();
    }

    @Override // com.applovin.impl.t1
    public void d(String str) {
        a(e7.d.ERROR, j7.MEDIA_FILE_ERROR);
        this.f8579m0.getAdEventTracker().b(str);
        super.d(str);
    }

    @Override // com.applovin.impl.p1
    public void r() {
        super.r();
        a(this.f9223g0 ? e7.d.COMPANION : e7.d.VIDEO, "pause");
        this.f8579m0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.p1
    public void s() {
        super.s();
        a(this.f9223g0 ? e7.d.COMPANION : e7.d.VIDEO, "resume");
        this.f8579m0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.t1, com.applovin.impl.p1
    public void u() {
        this.Z.c();
        super.u();
    }

    @Override // com.applovin.impl.t1, com.applovin.impl.p1
    public void v() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, com.applovin.impl.sdk.j jVar, View view) {
        Uri c10 = this.f8579m0.j1().c();
        if (c10 != null) {
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.n nVar = this.f8325c;
                nVar.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + c10);
            }
            a(e7.d.INDUSTRY_ICON_CLICK);
            b7.a(c10, activity, jVar);
        }
    }

    @Override // com.applovin.impl.t1
    protected void c(long j10) {
        super.c(j10);
        this.f8579m0.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(j10), d7.e(this.f8324b));
    }

    @Override // com.applovin.impl.t1, com.applovin.impl.p1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (T()) {
            a(e7.d.INDUSTRY_ICON_IMPRESSION);
            this.U.setVisibility(0);
        }
        this.Z.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.N;
        if (aVar != null) {
            arrayList.add(new x3(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.O;
        if (gVar != null) {
            arrayList.add(new x3(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        f0 f0Var = this.P;
        if (f0Var != null) {
            arrayList.add(new x3(f0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.S;
        if (progressBar != null) {
            arrayList.add(new x3(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.T;
        if (progressBar2 != null) {
            arrayList.add(new x3(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.Q;
        if (imageView != null) {
            arrayList.add(new x3(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.R;
        if (lVar != null) {
            arrayList.add(new x3(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f8331i;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f8331i;
            arrayList.add(new x3(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f8579m0.getAdEventTracker().b(this.M, arrayList);
    }

    @Override // com.applovin.impl.t1
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(e7.d.VIDEO_CLICK);
        this.f8579m0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, j7.UNSPECIFIED);
    }

    private void a(e7.d dVar) {
        a(dVar, j7.UNSPECIFIED);
    }

    private void a(e7.d dVar, String str) {
        a(dVar, str, j7.UNSPECIFIED);
    }

    private void a(e7.d dVar, j7 j7Var) {
        a(dVar, "", j7Var);
    }

    private void a(e7.d dVar, String str, j7 j7Var) {
        a(this.f8579m0.a(dVar, str), j7Var);
    }

    private void a(Set set, j7 j7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.M.getCurrentPosition());
        s7 o12 = this.f8579m0.o1();
        Uri d10 = o12 != null ? o12.d() : null;
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n nVar = this.f8325c;
            nVar.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        q7.a(set, seconds, d10, j7Var, this.f8324b);
    }
}
