package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import i8.o;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class i5 {

    /* renamed from: h  reason: collision with root package name */
    public static final b f17789h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f17790a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ironsource.mediationsdk.demandOnly.a f17791b;

    /* renamed from: c  reason: collision with root package name */
    private final m5 f17792c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f17793d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f17794e;

    /* renamed from: f  reason: collision with root package name */
    private final c5 f17795f;

    /* renamed from: g  reason: collision with root package name */
    private final n5 f17796g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f17797a;

        /* renamed from: b  reason: collision with root package name */
        private final String f17798b;

        /* renamed from: c  reason: collision with root package name */
        private final String f17799c;

        /* renamed from: d  reason: collision with root package name */
        private final com.ironsource.mediationsdk.demandOnly.a f17800d;

        /* renamed from: e  reason: collision with root package name */
        private final m5 f17801e;

        /* renamed from: f  reason: collision with root package name */
        private final JSONObject f17802f;

        /* renamed from: g  reason: collision with root package name */
        private final JSONObject f17803g;

        /* renamed from: h  reason: collision with root package name */
        private final c5 f17804h;

        /* renamed from: i  reason: collision with root package name */
        private final n5 f17805i;

        public a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.n.f(auctionData, "auctionData");
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            this.f17797a = auctionData;
            this.f17798b = instanceId;
            JSONObject a10 = a(auctionData);
            this.f17799c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a a11 = a(auctionData, a10);
            this.f17800d = a11;
            this.f17801e = c(a10);
            this.f17802f = d(a10);
            this.f17803g = b(a10);
            this.f17804h = a(a11, instanceId);
            this.f17805i = b(a11, instanceId);
        }

        private final c5 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            m5 a10 = aVar.a(str);
            if (a10 != null) {
                c5 c5Var = new c5();
                c5Var.a(a10.b());
                c5Var.c(a10.h());
                c5Var.b(a10.g());
                return c5Var;
            }
            return null;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            y8.c h10;
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.f18558d);
            JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.f18562h);
            if (optJSONArray != null) {
                h10 = y8.i.h(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = h10.iterator();
                while (it.hasNext()) {
                    int a10 = ((j8.e0) it).a();
                    m5 m5Var = new m5(optJSONArray.getJSONObject(a10), a10, optJSONObject);
                    if (!m5Var.m()) {
                        m5Var = null;
                    }
                    if (m5Var != null) {
                        arrayList2.add(m5Var);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C0226a(arrayList);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        private final n5 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            m5 a10 = aVar.a(str);
            if (a10 != null) {
                String k10 = a10.k();
                kotlin.jvm.internal.n.e(k10, "it.serverData");
                return new n5(k10);
            }
            return null;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final m5 c(JSONObject jSONObject) {
            return new m5(jSONObject);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final i5 a() {
            return new i5(this.f17799c, this.f17800d, this.f17801e, this.f17802f, this.f17803g, this.f17804h, this.f17805i);
        }

        public final JSONObject b() {
            return this.f17797a;
        }

        public final String c() {
            return this.f17798b;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        private final Object a(i5 i5Var, String str) {
            qg qgVar;
            Object obj;
            String b10 = i5Var.b();
            boolean z10 = false;
            if (b10 == null || b10.length() == 0) {
                o.a aVar = i8.o.f26626b;
                qgVar = new qg(wb.f21282a.i());
            } else if (i5Var.i()) {
                o.a aVar2 = i8.o.f26626b;
                qgVar = new qg(wb.f21282a.f());
            } else {
                m5 a10 = i5Var.a(str);
                if (a10 == null) {
                    o.a aVar3 = i8.o.f26626b;
                    qgVar = new qg(wb.f21282a.j());
                } else {
                    String k10 = a10.k();
                    if (k10 == null || k10.length() == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        o.a aVar4 = i8.o.f26626b;
                        obj = i5Var;
                        return i8.o.b(obj);
                    }
                    o.a aVar5 = i8.o.f26626b;
                    qgVar = new qg(wb.f21282a.e());
                }
            }
            obj = i8.p.a(qgVar);
            return i8.o.b(obj);
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.n.f(auctionData, "auctionData");
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }
    }

    public i5(String str, com.ironsource.mediationsdk.demandOnly.a waterfall, m5 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, c5 c5Var, n5 n5Var) {
        kotlin.jvm.internal.n.f(waterfall, "waterfall");
        kotlin.jvm.internal.n.f(genericNotifications, "genericNotifications");
        this.f17790a = str;
        this.f17791b = waterfall;
        this.f17792c = genericNotifications;
        this.f17793d = jSONObject;
        this.f17794e = jSONObject2;
        this.f17795f = c5Var;
        this.f17796g = n5Var;
    }

    private final m5 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }

    public final m5 a(String providerName) {
        kotlin.jvm.internal.n.f(providerName, "providerName");
        return a(this.f17791b, providerName);
    }

    public final String a() {
        n5 n5Var = this.f17796g;
        if (n5Var != null) {
            return n5Var.d();
        }
        return null;
    }

    public final String b() {
        return this.f17790a;
    }

    public final c5 c() {
        return this.f17795f;
    }

    public final JSONObject d() {
        return this.f17794e;
    }

    public final m5 e() {
        return this.f17792c;
    }

    public final JSONObject f() {
        return this.f17793d;
    }

    public final n5 g() {
        return this.f17796g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.f17791b;
    }

    public final boolean i() {
        return this.f17791b.isEmpty();
    }
}
