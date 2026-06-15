package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class tm extends n implements hn, m2, y1 {

    /* renamed from: b  reason: collision with root package name */
    private final wm f20846b;

    /* renamed from: c  reason: collision with root package name */
    private final o1 f20847c;

    /* renamed from: d  reason: collision with root package name */
    private final dn f20848d;

    /* renamed from: e  reason: collision with root package name */
    private fn f20849e;

    /* renamed from: f  reason: collision with root package name */
    private LevelPlayAdInfo f20850f;

    public tm(wm listener, o1 adTools, dn nativeAdProperties) {
        kotlin.jvm.internal.n.f(listener, "listener");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(nativeAdProperties, "nativeAdProperties");
        this.f20846b = listener;
        this.f20847c = adTools;
        this.f20848d = nativeAdProperties;
        this.f20850f = i();
    }

    private final fn a(o1 o1Var, dn dnVar) {
        IronLog.INTERNAL.verbose();
        return new fn(o1Var, gn.f17600y.a(dnVar, h().a()), this);
    }

    private final LevelPlayAdInfo i() {
        String uuid = this.f20848d.b().toString();
        kotlin.jvm.internal.n.e(uuid, "nativeAdProperties.adId.toString()");
        String c10 = this.f20848d.c();
        String ad_unit = this.f20848d.a().toString();
        kotlin.jvm.internal.n.e(ad_unit, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c10, ad_unit, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.m2
    public /* synthetic */ void a() {
        pz.a(this);
    }

    @Override // com.ironsource.m2
    public void a(IronSourceError ironSourceError) {
        this.f20846b.onNativeAdLoadFailed(ironSourceError);
    }

    public final void a(qm nativeAdBinder) {
        kotlin.jvm.internal.n.f(nativeAdBinder, "nativeAdBinder");
        fn fnVar = this.f20849e;
        if (fnVar == null) {
            kotlin.jvm.internal.n.u("nativeAdUnit");
            fnVar = null;
        }
        fnVar.a(new ym(nativeAdBinder), this);
    }

    @Override // com.ironsource.y1
    public void b() {
        throw new i8.m("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.y1
    public void b(IronSourceError ironSourceError) {
        throw new i8.m("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.m2
    public /* synthetic */ void b(t1 t1Var) {
        pz.b(this, t1Var);
    }

    @Override // com.ironsource.k2
    public void c() {
        this.f20846b.f(this.f20850f);
    }

    @Override // com.ironsource.m2
    public void c(t1 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c10 = adUnitCallback.c();
        if (c10 != null) {
            this.f20850f = c10;
            this.f20846b.b(c10);
        }
    }

    public final void j() {
        this.f20850f = i();
        fn fnVar = this.f20849e;
        if (fnVar == null) {
            kotlin.jvm.internal.n.u("nativeAdUnit");
            fnVar = null;
        }
        fnVar.a(true);
    }

    public final void k() {
        fn a10 = a(this.f20847c, this.f20848d);
        this.f20849e = a10;
        if (a10 == null) {
            kotlin.jvm.internal.n.u("nativeAdUnit");
            a10 = null;
        }
        a10.a((m2) this);
    }
}
