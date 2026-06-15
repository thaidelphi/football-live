package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.sdk.controller.f;
import java.util.Date;
import java.util.Objects;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f19463f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final String f19464g = "0";

    /* renamed from: h  reason: collision with root package name */
    public static final String f19465h = "0";

    /* renamed from: i  reason: collision with root package name */
    public static final String f19466i = "0";

    /* renamed from: j  reason: collision with root package name */
    public static final String f19467j = "0";

    /* renamed from: a  reason: collision with root package name */
    private final rj f19468a;

    /* renamed from: b  reason: collision with root package name */
    private ig f19469b;

    /* renamed from: c  reason: collision with root package name */
    private String f19470c;

    /* renamed from: d  reason: collision with root package name */
    private n1 f19471d;

    /* renamed from: e  reason: collision with root package name */
    private double f19472e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public o0(rj adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        this.f19468a = adInstance;
        this.f19469b = ig.UnknownProvider;
        this.f19470c = "0";
        this.f19471d = n1.LOAD_REQUEST;
        this.f19472e = new Date().getTime() / 1000.0d;
    }

    public static /* synthetic */ o0 a(o0 o0Var, rj rjVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rjVar = o0Var.f19468a;
        }
        return o0Var.a(rjVar);
    }

    public final o0 a(rj adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        return new o0(adInstance);
    }

    public final rj a() {
        return this.f19468a;
    }

    public final void a(double d10) {
        this.f19472e = d10;
    }

    public final void a(ig igVar) {
        kotlin.jvm.internal.n.f(igVar, "<set-?>");
        this.f19469b = igVar;
    }

    public final void a(n1 n1Var) {
        kotlin.jvm.internal.n.f(n1Var, "<set-?>");
        this.f19471d = n1Var;
    }

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f19470c = str;
    }

    public final IronSource.AD_UNIT b() {
        return this.f19468a.i() ? IronSource.AD_UNIT.BANNER : this.f19468a.n() ? IronSource.AD_UNIT.REWARDED_VIDEO : IronSource.AD_UNIT.INTERSTITIAL;
    }

    public final String c() {
        String e8 = this.f19468a.e();
        kotlin.jvm.internal.n.e(e8, "adInstance.id");
        return e8;
    }

    public final rj d() {
        return this.f19468a;
    }

    public final ig e() {
        return this.f19469b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            return kotlin.jvm.internal.n.a(c(), o0Var.c()) && kotlin.jvm.internal.n.a(g(), o0Var.g()) && b() == o0Var.b() && kotlin.jvm.internal.n.a(i(), o0Var.i()) && this.f19469b == o0Var.f19469b && kotlin.jvm.internal.n.a(this.f19470c, o0Var.f19470c) && this.f19471d == o0Var.f19471d;
        }
        return false;
    }

    public final n1 f() {
        return this.f19471d;
    }

    public final String g() {
        String c10 = this.f19468a.c();
        return c10 == null ? "0" : c10;
    }

    public final String h() {
        return this.f19470c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f19469b, this.f19470c, this.f19471d, Double.valueOf(this.f19472e));
    }

    public final String i() {
        String g10 = this.f19468a.g();
        kotlin.jvm.internal.n.e(g10, "adInstance.name");
        return g10;
    }

    public final double j() {
        return this.f19472e;
    }

    public String toString() {
        String jSONObject = new JSONObject().put(f.b.f20339c, c()).put("advertiserBundleId", this.f19470c).put("adProvider", this.f19469b.ordinal()).put("adStatus", this.f19471d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f19472e).put("adUnitId", g()).put(ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, b().toString()).put("instanceId", i()).toString();
        kotlin.jvm.internal.n.e(jSONObject, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return jSONObject;
    }
}
