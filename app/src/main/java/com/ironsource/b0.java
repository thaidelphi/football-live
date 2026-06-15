package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.q1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final w1 f16417a;

    /* renamed from: b  reason: collision with root package name */
    private final NetworkSettings f16418b;

    /* renamed from: c  reason: collision with root package name */
    private final j5 f16419c;

    /* renamed from: d  reason: collision with root package name */
    private final c3 f16420d;

    /* renamed from: e  reason: collision with root package name */
    private final m5 f16421e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16422f;

    /* renamed from: g  reason: collision with root package name */
    private final i0 f16423g;

    /* renamed from: h  reason: collision with root package name */
    private final IronSource.AD_UNIT f16424h;

    /* renamed from: i  reason: collision with root package name */
    private final JSONObject f16425i;

    /* renamed from: j  reason: collision with root package name */
    private final String f16426j;

    /* renamed from: k  reason: collision with root package name */
    private final int f16427k;

    /* renamed from: l  reason: collision with root package name */
    private final String f16428l;

    /* renamed from: m  reason: collision with root package name */
    private final m5 f16429m;

    /* renamed from: n  reason: collision with root package name */
    private final String f16430n;

    /* renamed from: o  reason: collision with root package name */
    private final String f16431o;

    /* renamed from: p  reason: collision with root package name */
    private final int f16432p;

    /* renamed from: q  reason: collision with root package name */
    private final AdData f16433q;

    public b0(w1 adUnitData, NetworkSettings providerSettings, j5 auctionData, c3 adapterConfig, m5 auctionResponseItem, int i10) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(auctionResponseItem, "auctionResponseItem");
        this.f16417a = adUnitData;
        this.f16418b = providerSettings;
        this.f16419c = auctionData;
        this.f16420d = adapterConfig;
        this.f16421e = auctionResponseItem;
        this.f16422f = i10;
        this.f16423g = new i0(q1.a.DidntAttemptToLoad);
        IronSource.AD_UNIT a10 = adUnitData.b().a();
        this.f16424h = a10;
        this.f16425i = auctionData.h();
        this.f16426j = auctionData.g();
        this.f16427k = auctionData.i();
        this.f16428l = auctionData.f();
        this.f16429m = auctionData.j();
        String f10 = adapterConfig.f();
        kotlin.jvm.internal.n.e(f10, "adapterConfig.providerName");
        this.f16430n = f10;
        kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{f10, Integer.valueOf(hashCode())}, 2));
        kotlin.jvm.internal.n.e(format, "format(format, *args)");
        this.f16431o = format;
        this.f16432p = adapterConfig.d();
        String k10 = auctionResponseItem.k();
        Map<String, Object> a11 = mk.a(auctionResponseItem.a());
        kotlin.jvm.internal.n.e(a11, "jsonObjectToMap(auctionResponseItem.adData)");
        a11.put("adUnit", a10);
        HashMap hashMap = new HashMap();
        Map<String, Object> a12 = mk.a(adapterConfig.c());
        kotlin.jvm.internal.n.e(a12, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        hashMap.putAll(a12);
        a11.put("userId", adUnitData.r());
        a11.put("adUnitId", adUnitData.b().c());
        a11.put("isMultipleAdUnits", Boolean.TRUE);
        this.f16433q = new AdData(k10, hashMap, a11);
    }

    public static /* synthetic */ b0 a(b0 b0Var, w1 w1Var, NetworkSettings networkSettings, j5 j5Var, c3 c3Var, m5 m5Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            w1Var = b0Var.f16417a;
        }
        if ((i11 & 2) != 0) {
            networkSettings = b0Var.f16418b;
        }
        NetworkSettings networkSettings2 = networkSettings;
        if ((i11 & 4) != 0) {
            j5Var = b0Var.f16419c;
        }
        j5 j5Var2 = j5Var;
        if ((i11 & 8) != 0) {
            c3Var = b0Var.f16420d;
        }
        c3 c3Var2 = c3Var;
        if ((i11 & 16) != 0) {
            m5Var = b0Var.f16421e;
        }
        m5 m5Var2 = m5Var;
        if ((i11 & 32) != 0) {
            i10 = b0Var.f16422f;
        }
        return b0Var.a(w1Var, networkSettings2, j5Var2, c3Var2, m5Var2, i10);
    }

    public final b0 a(w1 adUnitData, NetworkSettings providerSettings, j5 auctionData, c3 adapterConfig, m5 auctionResponseItem, int i10) {
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(auctionData, "auctionData");
        kotlin.jvm.internal.n.f(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.n.f(auctionResponseItem, "auctionResponseItem");
        return new b0(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i10);
    }

    public final w1 a() {
        return this.f16417a;
    }

    public final void a(q1.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        this.f16423g.b(performance);
    }

    public final NetworkSettings b() {
        return this.f16418b;
    }

    public final j5 c() {
        return this.f16419c;
    }

    public final c3 d() {
        return this.f16420d;
    }

    public final m5 e() {
        return this.f16421e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return kotlin.jvm.internal.n.a(this.f16417a, b0Var.f16417a) && kotlin.jvm.internal.n.a(this.f16418b, b0Var.f16418b) && kotlin.jvm.internal.n.a(this.f16419c, b0Var.f16419c) && kotlin.jvm.internal.n.a(this.f16420d, b0Var.f16420d) && kotlin.jvm.internal.n.a(this.f16421e, b0Var.f16421e) && this.f16422f == b0Var.f16422f;
        }
        return false;
    }

    public final int f() {
        return this.f16422f;
    }

    public final AdData g() {
        return this.f16433q;
    }

    public final IronSource.AD_UNIT h() {
        return this.f16424h;
    }

    public int hashCode() {
        return (((((((((this.f16417a.hashCode() * 31) + this.f16418b.hashCode()) * 31) + this.f16419c.hashCode()) * 31) + this.f16420d.hashCode()) * 31) + this.f16421e.hashCode()) * 31) + this.f16422f;
    }

    public final w1 i() {
        return this.f16417a;
    }

    public final c3 j() {
        return this.f16420d;
    }

    public final j5 k() {
        return this.f16419c;
    }

    public final String l() {
        return this.f16428l;
    }

    public final String m() {
        return this.f16426j;
    }

    public final m5 n() {
        return this.f16421e;
    }

    public final int o() {
        return this.f16427k;
    }

    public final m5 p() {
        return this.f16429m;
    }

    public final JSONObject q() {
        return this.f16425i;
    }

    public final String r() {
        return this.f16430n;
    }

    public final int s() {
        return this.f16432p;
    }

    public final i0 t() {
        return this.f16423g;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f16417a + ", providerSettings=" + this.f16418b + ", auctionData=" + this.f16419c + ", adapterConfig=" + this.f16420d + ", auctionResponseItem=" + this.f16421e + ", sessionDepth=" + this.f16422f + ')';
    }

    public final NetworkSettings u() {
        return this.f16418b;
    }

    public final int v() {
        return this.f16422f;
    }

    public final String w() {
        return this.f16431o;
    }
}
