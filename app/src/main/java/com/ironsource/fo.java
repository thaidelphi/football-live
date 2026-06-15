package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class fo extends xv {

    /* renamed from: e  reason: collision with root package name */
    private final w2 f17493e;

    /* renamed from: f  reason: collision with root package name */
    private final w1 f17494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(w2 tools, w1 adUnitData) {
        super(tools, adUnitData);
        kotlin.jvm.internal.n.f(tools, "tools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f17493e = tools;
        this.f17494f = adUnitData;
    }

    private final void a(yv yvVar, j5 j5Var, d0 d0Var) {
        IronLog.INTERNAL.verbose(o1.a(this.f17493e, (String) null, (String) null, 3, (Object) null));
        yvVar.a(a(e(), c(), j5Var, d0Var));
    }

    private final j5 b() {
        return new j5("", new JSONObject(), null, 0, "");
    }

    private final Map<String, h0> c() {
        int k10;
        int c10;
        int a10;
        eu f10 = this.f17494f.b().f();
        List<NetworkSettings> m7 = this.f17494f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : m7) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if ((f10 == null || f10.a(networkSettings, this.f17494f.b().a())) && !networkSettings.isBidder(this.f17494f.b().a())) {
                arrayList.add(obj);
            }
        }
        k10 = j8.r.k(arrayList, 10);
        c10 = j8.i0.c(k10);
        a10 = y8.i.a(c10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (NetworkSettings networkSettings2 : arrayList) {
            i8.n a11 = i8.s.a(networkSettings2.getProviderInstanceName(), new h0(this.f17493e, this.f17494f, networkSettings2));
            linkedHashMap.put(a11.c(), a11.d());
        }
        return linkedHashMap;
    }

    private final String d() {
        return "fallback_" + System.currentTimeMillis();
    }

    private final List<m5> e() {
        int k10;
        eu f10 = this.f17494f.b().f();
        List<NetworkSettings> m7 = this.f17494f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : m7) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if ((f10 == null || f10.a(networkSettings, this.f17494f.b().a())) && !networkSettings.isBidder(this.f17494f.b().a())) {
                arrayList.add(obj);
            }
        }
        k10 = j8.r.k(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(k10);
        for (NetworkSettings networkSettings2 : arrayList) {
            arrayList2.add(new m5(networkSettings2.getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.xv
    public void a(d0 adInstanceFactory, yv waterfallFetcherListener) {
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.n.f(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(o1.a(this.f17493e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, b(), adInstanceFactory);
    }

    public final void a(yv waterfallFetcherListener, int i10, String auctionFallback, d0 adInstanceFactory) {
        kotlin.jvm.internal.n.f(waterfallFetcherListener, "waterfallFetcherListener");
        kotlin.jvm.internal.n.f(auctionFallback, "auctionFallback");
        kotlin.jvm.internal.n.f(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new j5(d(), new JSONObject(), null, i10, auctionFallback), adInstanceFactory);
    }
}
