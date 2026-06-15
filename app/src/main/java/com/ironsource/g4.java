package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g4 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f17529a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f17530b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17531c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17532d;

    /* renamed from: e  reason: collision with root package name */
    private final String f17533e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17534f;

    /* renamed from: g  reason: collision with root package name */
    private final int f17535g;

    /* renamed from: h  reason: collision with root package name */
    private final int f17536h;

    /* renamed from: i  reason: collision with root package name */
    private final int f17537i;

    /* renamed from: j  reason: collision with root package name */
    private final List<Integer> f17538j;

    /* renamed from: k  reason: collision with root package name */
    private final List<Integer> f17539k;

    /* renamed from: l  reason: collision with root package name */
    private final List<Integer> f17540l;

    /* renamed from: m  reason: collision with root package name */
    private final List<Integer> f17541m;

    public g4(JSONObject applicationEvents) {
        kotlin.jvm.internal.n.f(applicationEvents, "applicationEvents");
        this.f17529a = applicationEvents.optBoolean(i4.f17774a, false);
        this.f17530b = applicationEvents.optBoolean(i4.f17775b, false);
        this.f17531c = applicationEvents.optBoolean(i4.f17776c, false);
        this.f17532d = applicationEvents.optInt(i4.f17777d, -1);
        String optString = applicationEvents.optString(i4.f17778e);
        kotlin.jvm.internal.n.e(optString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f17533e = optString;
        String optString2 = applicationEvents.optString(i4.f17779f);
        kotlin.jvm.internal.n.e(optString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f17534f = optString2;
        this.f17535g = applicationEvents.optInt(i4.f17780g, -1);
        this.f17536h = applicationEvents.optInt(i4.f17781h, -1);
        this.f17537i = applicationEvents.optInt(i4.f17782i, 5000);
        this.f17538j = a(applicationEvents, i4.f17783j);
        this.f17539k = a(applicationEvents, i4.f17784k);
        this.f17540l = a(applicationEvents, i4.f17785l);
        this.f17541m = a(applicationEvents, i4.f17786m);
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        List<Integer> d10;
        y8.c h10;
        int k10;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            d10 = j8.q.d();
            return d10;
        }
        h10 = y8.i.h(0, optJSONArray.length());
        k10 = j8.r.k(h10, 10);
        ArrayList arrayList = new ArrayList(k10);
        Iterator<Integer> it = h10.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(optJSONArray.getInt(((j8.e0) it).a())));
        }
        return arrayList;
    }

    public final int a() {
        return this.f17535g;
    }

    public final boolean b() {
        return this.f17531c;
    }

    public final int c() {
        return this.f17532d;
    }

    public final String d() {
        return this.f17534f;
    }

    public final int e() {
        return this.f17537i;
    }

    public final int f() {
        return this.f17536h;
    }

    public final List<Integer> g() {
        return this.f17541m;
    }

    public final List<Integer> h() {
        return this.f17539k;
    }

    public final List<Integer> i() {
        return this.f17538j;
    }

    public final boolean j() {
        return this.f17530b;
    }

    public final boolean k() {
        return this.f17529a;
    }

    public final String l() {
        return this.f17533e;
    }

    public final List<Integer> m() {
        return this.f17540l;
    }
}
