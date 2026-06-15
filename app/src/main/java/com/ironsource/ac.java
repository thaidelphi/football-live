package com.ironsource;

import com.ironsource.e2;
import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ac implements d2 {

    /* renamed from: a  reason: collision with root package name */
    private final IronSource.AD_UNIT f16307a;

    /* renamed from: b  reason: collision with root package name */
    private final e2 f16308b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d2> f16309c;

    /* renamed from: d  reason: collision with root package name */
    private final ki f16310d;

    /* renamed from: e  reason: collision with root package name */
    private final zl f16311e;

    /* renamed from: f  reason: collision with root package name */
    private final av f16312f;

    /* renamed from: g  reason: collision with root package name */
    private final r4 f16313g;

    /* renamed from: h  reason: collision with root package name */
    private final n0 f16314h;

    /* renamed from: i  reason: collision with root package name */
    private final fv f16315i;

    /* renamed from: j  reason: collision with root package name */
    private final vo f16316j;

    public ac(IronSource.AD_UNIT adFormat, e2.b level, List<? extends d2> eventsInterfaces, s7 s7Var) {
        List<d2> O;
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(level, "level");
        kotlin.jvm.internal.n.f(eventsInterfaces, "eventsInterfaces");
        this.f16307a = adFormat;
        e2 e2Var = new e2(adFormat, level, this, s7Var);
        this.f16308b = e2Var;
        O = j8.y.O(eventsInterfaces);
        this.f16309c = O;
        ki kiVar = e2Var.f17166f;
        kotlin.jvm.internal.n.e(kiVar, "wrapper.init");
        this.f16310d = kiVar;
        zl zlVar = e2Var.f17167g;
        kotlin.jvm.internal.n.e(zlVar, "wrapper.load");
        this.f16311e = zlVar;
        av avVar = e2Var.f17168h;
        kotlin.jvm.internal.n.e(avVar, "wrapper.token");
        this.f16312f = avVar;
        r4 r4Var = e2Var.f17169i;
        kotlin.jvm.internal.n.e(r4Var, "wrapper.auction");
        this.f16313g = r4Var;
        n0 n0Var = e2Var.f17170j;
        kotlin.jvm.internal.n.e(n0Var, "wrapper.adInteraction");
        this.f16314h = n0Var;
        fv fvVar = e2Var.f17171k;
        kotlin.jvm.internal.n.e(fvVar, "wrapper.troubleshoot");
        this.f16315i = fvVar;
        vo voVar = e2Var.f17172l;
        kotlin.jvm.internal.n.e(voVar, "wrapper.operational");
        this.f16316j = voVar;
    }

    public /* synthetic */ ac(IronSource.AD_UNIT ad_unit, e2.b bVar, List list, s7 s7Var, int i10, kotlin.jvm.internal.h hVar) {
        this(ad_unit, bVar, (i10 & 4) != 0 ? j8.q.d() : list, (i10 & 8) != 0 ? null : s7Var);
    }

    public final n0 a() {
        return this.f16314h;
    }

    @Override // com.ironsource.d2
    public Map<String, Object> a(b2 event) {
        kotlin.jvm.internal.n.f(event, "event");
        HashMap hashMap = new HashMap();
        for (d2 d2Var : this.f16309c) {
            Map<String, Object> a10 = d2Var.a(event);
            kotlin.jvm.internal.n.e(a10, "it.getEventsAdditionalDataMap(event)");
            hashMap.putAll(a10);
        }
        return hashMap;
    }

    public final void a(d2 eventInterface) {
        kotlin.jvm.internal.n.f(eventInterface, "eventInterface");
        this.f16309c.add(eventInterface);
    }

    public final void a(boolean z10) {
        zl zlVar;
        boolean z11 = true;
        if (z10) {
            zlVar = this.f16311e;
        } else if (z10) {
            throw new i8.l();
        } else {
            if (this.f16307a == IronSource.AD_UNIT.BANNER) {
                this.f16311e.a();
                return;
            } else {
                zlVar = this.f16311e;
                z11 = false;
            }
        }
        zlVar.a(z11);
    }

    public final r4 b() {
        return this.f16313g;
    }

    public final List<d2> c() {
        return this.f16309c;
    }

    public final ki d() {
        return this.f16310d;
    }

    public final zl e() {
        return this.f16311e;
    }

    public final vo f() {
        return this.f16316j;
    }

    public final av g() {
        return this.f16312f;
    }

    public final fv h() {
        return this.f16315i;
    }
}
