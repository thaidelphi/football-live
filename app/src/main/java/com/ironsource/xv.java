package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class xv {

    /* renamed from: d  reason: collision with root package name */
    public static final a f21451d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final w2 f21452a;

    /* renamed from: b  reason: collision with root package name */
    private final w1 f21453b;

    /* renamed from: c  reason: collision with root package name */
    private final xo f21454c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final xv a(w2 adTools, w1 adUnitData) {
            kotlin.jvm.internal.n.f(adTools, "adTools");
            kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
            return adUnitData.t() ? new p5(adTools, adUnitData) : new fo(adTools, adUnitData);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b implements xo {
        b() {
        }

        @Override // com.ironsource.xo
        public /* synthetic */ void a(a0 a0Var, String str, qk qkVar) {
            v20.a(this, a0Var, str, qkVar);
        }

        @Override // com.ironsource.xo
        public /* synthetic */ void a(List list, a0 a0Var) {
            v20.b(this, list, a0Var);
        }
    }

    public xv(w2 adTools, w1 adUnitData) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f21452a = adTools;
        this.f21453b = adUnitData;
        this.f21454c = new b();
    }

    private final a0 a(m5 m5Var, j5 j5Var, d0 d0Var, h0 h0Var) {
        String c10;
        String str;
        w1 w1Var = this.f21453b;
        String c11 = m5Var.c();
        kotlin.jvm.internal.n.e(c11, "item.instanceName");
        NetworkSettings a10 = w1Var.a(c11);
        if (a10 == null) {
            c10 = m5Var.c();
            kotlin.jvm.internal.n.e(c10, "item.instanceName");
            str = "Could not find matching provider settings for auction response item";
        } else if (h0Var != null) {
            com.ironsource.mediationsdk.c.b().b(a10, this.f21453b.b().a(), this.f21453b.b().b());
            int f10 = this.f21452a.f();
            w1 w1Var2 = this.f21453b;
            return d0Var.a(new b0(w1Var2, a10, j5Var, new c3(a10, w1Var2.b(a10), this.f21453b.b().a()), m5Var, f10), h0Var);
        } else {
            c10 = m5Var.c();
            kotlin.jvm.internal.n.e(c10, "item.instanceName");
            str = "Could not find matching adInstancePayload for auction response item";
        }
        a(str, c10);
        return null;
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(o1.a(this.f21452a, str3, (String) null, 2, (Object) null));
        this.f21452a.e().h().h(str3);
    }

    public xo a() {
        return this.f21454c;
    }

    public final zv a(List<? extends m5> waterfallItems, Map<String, h0> adInstancePayloads, j5 auctionData, d0 adInstanceFactory) {
        kotlin.jvm.internal.n.f(waterfallItems, "waterfallItems");
        kotlin.jvm.internal.n.f(adInstancePayloads, "adInstancePayloads");
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        IronLog ironLog = IronLog.INTERNAL;
        w2 w2Var = this.f21452a;
        ironLog.verbose(o1.a(w2Var, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            m5 m5Var = waterfallItems.get(i10);
            a0 a10 = a(m5Var, auctionData, adInstanceFactory, adInstancePayloads.get(m5Var.c()));
            if (a10 != null && a10.g() != null) {
                arrayList.add(a10);
            }
        }
        zv zvVar = new zv(arrayList);
        IronLog.INTERNAL.verbose(o1.a(this.f21452a, "updateWaterfall() - next waterfall is " + zvVar + ".toWaterfallString()", (String) null, 2, (Object) null));
        return zvVar;
    }

    public abstract void a(d0 d0Var, yv yvVar);
}
