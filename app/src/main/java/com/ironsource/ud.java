package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.pd;
import com.unity3d.mediation.LevelPlayAdInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ud implements td, pd.a, y1 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f20981d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final String f20982e = "Fullscreen Progressive Strategy";

    /* renamed from: a  reason: collision with root package name */
    private final o1 f20983a;

    /* renamed from: b  reason: collision with root package name */
    private final qd f20984b;

    /* renamed from: c  reason: collision with root package name */
    private ae f20985c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public ud(o1 adTools, qd factory) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(factory, "factory");
        this.f20983a = adTools;
        this.f20984b = factory;
        this.f20985c = new vd(this, null, false, 4, null);
    }

    @Override // com.ironsource.pd.a
    public void a() {
        this.f20985c.a();
    }

    @Override // com.ironsource.td
    public void a(Activity activity, z1 adUnitDisplayStrategyListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(adUnitDisplayStrategyListener, "adUnitDisplayStrategyListener");
        this.f20985c.a(activity, adUnitDisplayStrategyListener);
    }

    public final void a(ae state) {
        kotlin.jvm.internal.n.f(state, "state");
        this.f20985c = state;
    }

    @Override // com.ironsource.pd.a
    public void a(IronSourceError ironSourceError) {
        this.f20985c.a(ironSourceError);
    }

    @Override // com.ironsource.td
    public void a(n2 adUnitLoadStrategyListener) {
        kotlin.jvm.internal.n.f(adUnitLoadStrategyListener, "adUnitLoadStrategyListener");
        this.f20985c.a(adUnitLoadStrategyListener);
    }

    @Override // com.ironsource.pd.a
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f20985c.a(adInfo);
    }

    public final void a(String message) {
        kotlin.jvm.internal.n.f(message, "message");
        fv h10 = this.f20983a.e().h();
        h10.f("Fullscreen Progressive Strategy - " + message);
    }

    @Override // com.ironsource.y1
    public void b() {
        this.f20985c.b();
    }

    @Override // com.ironsource.y1
    public void b(IronSourceError ironSourceError) {
        this.f20985c.b(ironSourceError);
    }

    @Override // com.ironsource.pd.a
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        this.f20985c.b(adInfo);
    }

    public final o1 c() {
        return this.f20983a;
    }

    public final qd d() {
        return this.f20984b;
    }
}
