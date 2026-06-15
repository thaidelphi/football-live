package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class wj {

    /* renamed from: a  reason: collision with root package name */
    private final String f21301a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21302b;

    public wj(String advId, String advIdType) {
        kotlin.jvm.internal.n.f(advId, "advId");
        kotlin.jvm.internal.n.f(advIdType, "advIdType");
        this.f21301a = advId;
        this.f21302b = advIdType;
    }

    public static /* synthetic */ wj a(wj wjVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = wjVar.f21301a;
        }
        if ((i10 & 2) != 0) {
            str2 = wjVar.f21302b;
        }
        return wjVar.a(str, str2);
    }

    public final wj a(String advId, String advIdType) {
        kotlin.jvm.internal.n.f(advId, "advId");
        kotlin.jvm.internal.n.f(advIdType, "advIdType");
        return new wj(advId, advIdType);
    }

    public final String a() {
        return this.f21301a;
    }

    public final String b() {
        return this.f21302b;
    }

    public final String c() {
        return this.f21301a;
    }

    public final String d() {
        return this.f21302b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wj) {
            wj wjVar = (wj) obj;
            return kotlin.jvm.internal.n.a(this.f21301a, wjVar.f21301a) && kotlin.jvm.internal.n.a(this.f21302b, wjVar.f21302b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f21301a.hashCode() * 31) + this.f21302b.hashCode();
    }

    public String toString() {
        return "IronSourceAdvId(advId=" + this.f21301a + ", advIdType=" + this.f21302b + ')';
    }
}
