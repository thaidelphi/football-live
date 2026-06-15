package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class sl {

    /* renamed from: a  reason: collision with root package name */
    private final gl f20706a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements x1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ xf f20707a;

        a(xf xfVar) {
            this.f20707a = xfVar;
        }

        @Override // com.ironsource.x1
        public w1 a(boolean z10, f1 adProperties) {
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            return sq.f20716z.a(adProperties, this.f20707a.t().a(), z10);
        }
    }

    public sl(String adUnitId, o1 adTools, ed adControllerFactory, xf provider, q9 currentTimeProvider, lf idFactory) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.n.f(provider, "provider");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(idFactory, "idFactory");
        this.f20706a = new gl(LevelPlay.AdFormat.REWARDED, adUnitId, adTools, adControllerFactory, new a(provider), provider, currentTimeProvider, idFactory);
    }

    public final String a() {
        String uuid = this.f20706a.e().toString();
        kotlin.jvm.internal.n.e(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f20706a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.f20706a.a(levelPlayRewardedAdListener != null ? tl.b(levelPlayRewardedAdListener) : null);
    }

    public final boolean b() {
        return this.f20706a.l();
    }

    public final void c() {
        this.f20706a.m();
    }
}
