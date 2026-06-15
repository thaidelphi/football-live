package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e5 {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f17191a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f17192b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f17193c;

    /* renamed from: d  reason: collision with root package name */
    private final StringBuilder f17194d;

    public e5(w1 adUnitData) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        this.f17191a = adUnitData;
        this.f17192b = new HashMap();
        this.f17193c = new ArrayList();
        this.f17194d = new StringBuilder();
    }

    private final void a(String str, int i10, Map<String, ? extends Object> map) {
        this.f17192b.put(str, map);
        StringBuilder sb = this.f17194d;
        sb.append(i10);
        sb.append(str);
        sb.append(",");
    }

    public final Map<String, Object> a() {
        return this.f17192b;
    }

    public final void a(a8 biddingResponse) {
        kotlin.jvm.internal.n.f(biddingResponse, "biddingResponse");
        String c10 = biddingResponse.c();
        kotlin.jvm.internal.n.e(c10, "biddingResponse.instanceName");
        int d10 = biddingResponse.d();
        Map<String, Object> a10 = biddingResponse.a();
        kotlin.jvm.internal.n.e(a10, "biddingResponse.biddingData");
        a(c10, d10, a10);
    }

    public final void a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        List<String> list = this.f17193c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.n.e(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb = this.f17194d;
        sb.append(providerSettings.getInstanceType(this.f17191a.b().a()));
        sb.append(providerSettings.getProviderInstanceName());
        sb.append(",");
    }

    public final void a(NetworkSettings providerSettings, Map<String, ? extends Object> biddingData) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.n.e(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.f17191a.b().a()), biddingData);
    }

    public final List<String> b() {
        return this.f17193c;
    }

    public final StringBuilder c() {
        return this.f17194d;
    }

    public final boolean d() {
        return (this.f17192b.isEmpty() ^ true) || (this.f17193c.isEmpty() ^ true);
    }
}
