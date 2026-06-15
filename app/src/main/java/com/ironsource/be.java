package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.pd;
import com.ironsource.td;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class be implements td, pd.a, y1 {

    /* renamed from: a  reason: collision with root package name */
    private final o1 f16740a;

    /* renamed from: b  reason: collision with root package name */
    private final td.a f16741b;

    /* renamed from: c  reason: collision with root package name */
    private final qd f16742c;

    /* renamed from: d  reason: collision with root package name */
    private pd f16743d;

    /* renamed from: e  reason: collision with root package name */
    private z1 f16744e;

    /* renamed from: f  reason: collision with root package name */
    private n2 f16745f;

    public be(o1 adTools, td.a config, qd fullscreenAdUnitFactory) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f16740a = adTools;
        this.f16741b = config;
        this.f16742c = fullscreenAdUnitFactory;
    }

    @Override // com.ironsource.pd.a
    public void a() {
        this.f16743d = null;
        n2 n2Var = this.f16745f;
        if (n2Var != null) {
            n2Var.a();
        }
    }

    @Override // com.ironsource.td
    public void a(Activity activity, z1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        this.f16744e = adUnitDisplayStrategyListener;
        pd pdVar = this.f16743d;
        if (pdVar != null) {
            pdVar.a(activity, this);
        }
    }

    @Override // com.ironsource.pd.a
    public void a(IronSourceError ironSourceError) {
        n2 n2Var = this.f16745f;
        if (n2Var != null) {
            n2Var.a(ironSourceError);
        }
    }

    @Override // com.ironsource.td
    public void a(n2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.n.f(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        this.f16745f = adUnitLoadStrategyListener;
        pd a10 = this.f16742c.a(true);
        a10.a(this);
        this.f16743d = a10;
    }

    @Override // com.ironsource.pd.a
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        n2 n2Var = this.f16745f;
        if (n2Var != null) {
            n2Var.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.y1
    public void b() {
        z1 z1Var = this.f16744e;
        if (z1Var != null) {
            z1Var.b();
        }
    }

    @Override // com.ironsource.y1
    public void b(IronSourceError ironSourceError) {
        z1 z1Var = this.f16744e;
        if (z1Var != null) {
            z1Var.b(ironSourceError);
        }
    }

    @Override // com.ironsource.pd.a
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        n2 n2Var = this.f16745f;
        if (n2Var != null) {
            n2Var.a(adInfo);
        }
    }

    public final o1 c() {
        return this.f16740a;
    }

    public final td.a d() {
        return this.f16741b;
    }
}
