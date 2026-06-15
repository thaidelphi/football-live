package com.ironsource;

import android.app.Activity;
import com.ironsource.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.td;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class dd extends n implements sd, n2, z1 {

    /* renamed from: b  reason: collision with root package name */
    private final gd f17010b;

    /* renamed from: c  reason: collision with root package name */
    private final f1 f17011c;

    /* renamed from: d  reason: collision with root package name */
    private final td f17012d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.p<w1, sd, pd> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1 f17013a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o1 o1Var) {
            super(2);
            this.f17013a = o1Var;
        }

        @Override // t8.p
        /* renamed from: a */
        public final pd invoke(w1 adUnitData, sd fullscreenAdUnitListener) {
            kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
            kotlin.jvm.internal.n.f(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            return new pd(mm.f19249r.c(), new w2(this.f17013a, adUnitData, e2.b.MEDIATION), adUnitData, fullscreenAdUnitListener, null, null, null, null, 240, null);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements qd {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x1 f17014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dd f17015b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t8.p<w1, sd, pd> f17016c;

        /* JADX WARN: Multi-variable type inference failed */
        b(x1 x1Var, dd ddVar, t8.p<? super w1, ? super sd, pd> pVar) {
            this.f17014a = x1Var;
            this.f17015b = ddVar;
            this.f17016c = pVar;
        }

        @Override // com.ironsource.qd
        public pd a(boolean z10) {
            return this.f17016c.invoke(this.f17014a.a(z10, this.f17015b.f17011c), this.f17015b);
        }
    }

    public dd(gd listener, o1 adTools, f1 adProperties, td.b adUnitStrategyFactory, x1 adUnitDataFactory, t8.p<? super w1, ? super sd, pd> createFullscreenAdUnit) {
        kotlin.jvm.internal.n.f(listener, "listener");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        kotlin.jvm.internal.n.f(adUnitStrategyFactory, "adUnitStrategyFactory");
        kotlin.jvm.internal.n.f(adUnitDataFactory, "adUnitDataFactory");
        kotlin.jvm.internal.n.f(createFullscreenAdUnit, "createFullscreenAdUnit");
        this.f17010b = listener;
        this.f17011c = adProperties;
        this.f17012d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.d(), adProperties.c()), new b(adUnitDataFactory, this, createFullscreenAdUnit));
    }

    public /* synthetic */ dd(gd gdVar, o1 o1Var, f1 f1Var, td.b bVar, x1 x1Var, t8.p pVar, int i10, kotlin.jvm.internal.h hVar) {
        this(gdVar, o1Var, f1Var, (i10 & 8) != 0 ? new td.b() : bVar, x1Var, (i10 & 32) != 0 ? new a(o1Var) : pVar);
    }

    @Override // com.ironsource.n2
    public void a() {
        this.f17010b.a();
    }

    public final void a(Activity activity, Placement placement) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f17011c.a(placement);
        this.f17012d.a(activity, this);
    }

    @Override // com.ironsource.n2
    public void a(IronSourceError ironSourceError) {
        gd gdVar = this.f17010b;
        String uuid = this.f17011c.b().toString();
        kotlin.jvm.internal.n.e(uuid, "adProperties.adId.toString()");
        gdVar.onAdLoadFailed(new LevelPlayAdError(ironSourceError, uuid, this.f17011c.c()));
    }

    @Override // com.ironsource.n2
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f17010b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.sd
    public void a(LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(reward, "reward");
        this.f17010b.a(reward);
    }

    @Override // com.ironsource.z1
    public void b() {
        this.f17010b.b();
    }

    @Override // com.ironsource.z1
    public void b(IronSourceError ironSourceError) {
        gd gdVar = this.f17010b;
        String uuid = this.f17011c.b().toString();
        kotlin.jvm.internal.n.e(uuid, "adProperties.adId.toString()");
        gdVar.a(new LevelPlayAdError(ironSourceError, uuid, this.f17011c.c()));
    }

    @Override // com.ironsource.k2
    public void c() {
        this.f17010b.onAdClicked();
    }

    public final void i() {
        this.f17012d.a(this);
    }

    @Override // com.ironsource.n2
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f17010b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.sd
    public void onClosed() {
        this.f17010b.onAdClosed();
    }
}
