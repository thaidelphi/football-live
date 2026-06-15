package com.ironsource;

import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class am {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16382c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final String f16383d = "revenue";

    /* renamed from: e  reason: collision with root package name */
    public static final String f16384e = "precision";

    /* renamed from: a  reason: collision with root package name */
    private final double f16385a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16386b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final am a(JSONObject json) {
            kotlin.jvm.internal.n.f(json, "json");
            try {
                double d10 = json.getDouble("revenue");
                String precision = json.getString("precision");
                kotlin.jvm.internal.n.e(precision, "precision");
                return new am(d10, precision);
            } catch (Exception e8) {
                o9.d().a(e8);
                vt.a(e8);
                return null;
            }
        }
    }

    public am(double d10, String precision) {
        kotlin.jvm.internal.n.f(precision, "precision");
        this.f16385a = d10;
        this.f16386b = precision;
    }

    public static /* synthetic */ am a(am amVar, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = amVar.f16385a;
        }
        if ((i10 & 2) != 0) {
            str = amVar.f16386b;
        }
        return amVar.a(d10, str);
    }

    public static final am a(JSONObject jSONObject) {
        return f16382c.a(jSONObject);
    }

    public final double a() {
        return this.f16385a;
    }

    public final am a(double d10, String precision) {
        kotlin.jvm.internal.n.f(precision, "precision");
        return new am(d10, precision);
    }

    public final String b() {
        return this.f16386b;
    }

    public final String c() {
        return this.f16386b;
    }

    public final double d() {
        return this.f16385a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof am) {
            am amVar = (am) obj;
            return Double.compare(this.f16385a, amVar.f16385a) == 0 && kotlin.jvm.internal.n.a(this.f16386b, amVar.f16386b);
        }
        return false;
    }

    public int hashCode() {
        return (sw.a(this.f16385a) * 31) + this.f16386b.hashCode();
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.f16385a + ", precision=" + this.f16386b + ')';
    }
}
