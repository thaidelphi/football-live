package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class vi {

    /* renamed from: a  reason: collision with root package name */
    private final String f21142a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21143b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21144c;

    public vi() {
        this(null, 0, null, 7, null);
    }

    public vi(String instanceId, int i10, String str) {
        kotlin.jvm.internal.n.f(instanceId, "instanceId");
        this.f21142a = instanceId;
        this.f21143b = i10;
        this.f21144c = str;
    }

    public /* synthetic */ vi(String str, int i10, String str2, int i11, kotlin.jvm.internal.h hVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ vi a(vi viVar, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = viVar.f21142a;
        }
        if ((i11 & 2) != 0) {
            i10 = viVar.f21143b;
        }
        if ((i11 & 4) != 0) {
            str2 = viVar.f21144c;
        }
        return viVar.a(str, i10, str2);
    }

    public final vi a(String instanceId, int i10, String str) {
        kotlin.jvm.internal.n.f(instanceId, "instanceId");
        return new vi(instanceId, i10, str);
    }

    public final String a() {
        return this.f21142a;
    }

    public final int b() {
        return this.f21143b;
    }

    public final String c() {
        return this.f21144c;
    }

    public final String d() {
        return this.f21144c;
    }

    public final String e() {
        return this.f21142a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vi) {
            vi viVar = (vi) obj;
            return kotlin.jvm.internal.n.a(this.f21142a, viVar.f21142a) && this.f21143b == viVar.f21143b && kotlin.jvm.internal.n.a(this.f21144c, viVar.f21144c);
        }
        return false;
    }

    public final int f() {
        return this.f21143b;
    }

    public int hashCode() {
        int hashCode = ((this.f21142a.hashCode() * 31) + this.f21143b) * 31;
        String str = this.f21144c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstanceInformation(instanceId=" + this.f21142a + ", instanceType=" + this.f21143b + ", dynamicDemandSourceId=" + this.f21144c + ')';
    }
}
