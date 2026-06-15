package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class pu {

    /* renamed from: a  reason: collision with root package name */
    private String f19789a;

    public pu() {
        this(null, 1, null);
    }

    public pu(String str) {
        this.f19789a = str;
    }

    public /* synthetic */ pu(String str, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ pu a(pu puVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = puVar.f19789a;
        }
        return puVar.a(str);
    }

    public final pu a(String str) {
        return new pu(str);
    }

    public final String a() {
        return this.f19789a;
    }

    public final String b() {
        return this.f19789a;
    }

    public final void b(String str) {
        this.f19789a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu) && kotlin.jvm.internal.n.a(this.f19789a, ((pu) obj).f19789a);
    }

    public int hashCode() {
        String str = this.f19789a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f19789a + ')';
    }
}
