package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class il {

    /* renamed from: a  reason: collision with root package name */
    private final xf f17845a;

    /* renamed from: b  reason: collision with root package name */
    private final gl f17846b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements x1 {
        a() {
        }

        @Override // com.ironsource.x1
        public w1 a(boolean z10, f1 adProperties) {
            kotlin.jvm.internal.n.f(adProperties, "adProperties");
            return kj.f18084z.a(adProperties, il.this.f17845a.t().a(), z10);
        }
    }

    public il(String adUnitId, o1 adTools, ed adControllerFactory, xf provider, q9 currentTimeProvider, lf idFactory) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.n.f(provider, "provider");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.n.f(idFactory, "idFactory");
        this.f17845a = provider;
        this.f17846b = new gl(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, adTools, adControllerFactory, a(), provider, currentTimeProvider, idFactory);
    }

    private final x1 a() {
        return new a();
    }

    public final void a(Activity activity, String str) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f17846b.a(activity, str);
    }

    public final void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.f17846b.a(levelPlayInterstitialAdListener != null ? jl.b(levelPlayInterstitialAdListener) : null);
    }

    public final String b() {
        String uuid = this.f17846b.e().toString();
        kotlin.jvm.internal.n.e(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean c() {
        return this.f17846b.l();
    }

    public final void d() {
        this.f17846b.m();
    }
}
