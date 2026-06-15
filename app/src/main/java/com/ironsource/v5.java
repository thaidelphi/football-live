package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class v5 extends n implements o6, j7 {

    /* renamed from: b  reason: collision with root package name */
    private final o1 f21100b;

    /* renamed from: c  reason: collision with root package name */
    private final j6 f21101c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<w5> f21102d;

    /* renamed from: e  reason: collision with root package name */
    private LevelPlayAdInfo f21103e;

    /* renamed from: f  reason: collision with root package name */
    private LevelPlayAdInfo f21104f;

    /* renamed from: g  reason: collision with root package name */
    private final i7 f21105g;

    public v5(w5 listener, o1 adTools, j6 bannerAdProperties, w6 bannerViewContainer) {
        kotlin.jvm.internal.n.f(listener, "listener");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.n.f(bannerViewContainer, "bannerViewContainer");
        this.f21100b = adTools;
        this.f21101c = bannerAdProperties;
        this.f21102d = new WeakReference<>(listener);
        this.f21103e = j();
        this.f21104f = j();
        this.f21105g = i7.f17806c.a(adTools, bannerViewContainer, adTools.b(bannerAdProperties.c()), bannerAdProperties, this, i());
    }

    private final l6 a(o1 o1Var, j6 j6Var, boolean z10) {
        IronLog.INTERNAL.verbose();
        return new l6(o1Var, m6.f18438z.a(j6Var, h().a(), z10), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l6 a(v5 this$0, boolean z10) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        return this$0.a(this$0.f21100b, this$0.f21101c, z10);
    }

    private final n6 i() {
        return new n6() { // from class: com.ironsource.y10
            @Override // com.ironsource.n6
            public final l6 a(boolean z10) {
                l6 a10;
                a10 = v5.a(v5.this, z10);
                return a10;
            }
        };
    }

    private final LevelPlayAdInfo j() {
        String uuid = this.f21101c.b().toString();
        kotlin.jvm.internal.n.e(uuid, "bannerAdProperties.adId.toString()");
        String c10 = this.f21101c.c();
        String ad_unit = this.f21101c.a().toString();
        kotlin.jvm.internal.n.e(ad_unit, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c10, ad_unit, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.j7
    public void a(t1 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c10 = adUnitCallback.c();
        if (c10 != null) {
            this.f21104f = c10;
            w5 w5Var = this.f21102d.get();
            if (w5Var != null) {
                w5Var.a(c10, false);
            }
        }
    }

    @Override // com.ironsource.k2
    public void c() {
        w5 w5Var = this.f21102d.get();
        if (w5Var != null) {
            w5Var.e(this.f21103e);
        }
    }

    @Override // com.ironsource.j7
    public void c(IronSourceError ironSourceError) {
        w5 w5Var = this.f21102d.get();
        if (w5Var != null) {
            String uuid = this.f21101c.b().toString();
            kotlin.jvm.internal.n.e(uuid, "bannerAdProperties.adId.toString()");
            w5Var.a(new LevelPlayAdError(ironSourceError, uuid, this.f21101c.c()));
        }
    }

    @Override // com.ironsource.o6
    public /* bridge */ /* synthetic */ i8.w d() {
        m();
        return i8.w.f26638a;
    }

    @Override // com.ironsource.j7
    public void d(IronSourceError ironSourceError) {
        w5 w5Var = this.f21102d.get();
        if (w5Var != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f21103e;
            String uuid = this.f21101c.b().toString();
            kotlin.jvm.internal.n.e(uuid, "bannerAdProperties.adId.toString()");
            w5Var.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, uuid, this.f21101c.c()));
        }
    }

    @Override // com.ironsource.o6
    public /* bridge */ /* synthetic */ i8.w e() {
        o();
        return i8.w.f26638a;
    }

    @Override // com.ironsource.j7
    public void f() {
        this.f21103e = this.f21104f;
        this.f21104f = j();
        w5 w5Var = this.f21102d.get();
        if (w5Var != null) {
            w5Var.c(this.f21103e);
        }
    }

    @Override // com.ironsource.o6
    public /* bridge */ /* synthetic */ i8.w g() {
        n();
        return i8.w.f26638a;
    }

    public final void k() {
        this.f21105g.c();
    }

    public final void l() {
        this.f21105g.f();
    }

    public void m() {
        w5 w5Var = this.f21102d.get();
        if (w5Var != null) {
            w5Var.g(this.f21103e);
        }
    }

    public void n() {
        w5 w5Var = this.f21102d.get();
        if (w5Var != null) {
            w5Var.d(this.f21103e);
        }
    }

    public void o() {
        w5 w5Var = this.f21102d.get();
        if (w5Var != null) {
            w5Var.a(this.f21103e);
        }
    }

    public final void p() {
        this.f21105g.g();
    }

    public final void q() {
        this.f21105g.h();
    }
}
