package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class cm {

    /* renamed from: a  reason: collision with root package name */
    private final wi f16890a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16891b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16892c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16893d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16894e;

    public cm(wi instanceType, String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        kotlin.jvm.internal.n.f(adSourceNameForEvents, "adSourceNameForEvents");
        this.f16890a = instanceType;
        this.f16891b = adSourceNameForEvents;
        this.f16892c = j10;
        this.f16893d = z10;
        this.f16894e = z11;
    }

    public /* synthetic */ cm(wi wiVar, String str, long j10, boolean z10, boolean z11, int i10, kotlin.jvm.internal.h hVar) {
        this(wiVar, str, j10, z10, (i10 & 16) != 0 ? true : z11);
    }

    public static /* synthetic */ cm a(cm cmVar, wi wiVar, String str, long j10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wiVar = cmVar.f16890a;
        }
        if ((i10 & 2) != 0) {
            str = cmVar.f16891b;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            j10 = cmVar.f16892c;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = cmVar.f16893d;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = cmVar.f16894e;
        }
        return cmVar.a(wiVar, str2, j11, z12, z11);
    }

    public final cm a(wi instanceType, String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.f(instanceType, "instanceType");
        kotlin.jvm.internal.n.f(adSourceNameForEvents, "adSourceNameForEvents");
        return new cm(instanceType, adSourceNameForEvents, j10, z10, z11);
    }

    public final wi a() {
        return this.f16890a;
    }

    public final String b() {
        return this.f16891b;
    }

    public final long c() {
        return this.f16892c;
    }

    public final boolean d() {
        return this.f16893d;
    }

    public final boolean e() {
        return this.f16894e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cm) {
            cm cmVar = (cm) obj;
            return this.f16890a == cmVar.f16890a && kotlin.jvm.internal.n.a(this.f16891b, cmVar.f16891b) && this.f16892c == cmVar.f16892c && this.f16893d == cmVar.f16893d && this.f16894e == cmVar.f16894e;
        }
        return false;
    }

    public final String f() {
        return this.f16891b;
    }

    public final wi g() {
        return this.f16890a;
    }

    public final long h() {
        return this.f16892c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f16890a.hashCode() * 31) + this.f16891b.hashCode()) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.f16892c)) * 31;
        boolean z10 = this.f16893d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f16894e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean i() {
        return this.f16894e;
    }

    public final boolean j() {
        return this.f16893d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f16890a + ", adSourceNameForEvents=" + this.f16891b + ", loadTimeoutInMills=" + this.f16892c + ", isOneFlow=" + this.f16893d + ", isMultipleAdObjects=" + this.f16894e + ')';
    }
}
