package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.s;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final s.d f18536a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18537b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f18538c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18539d;

    public b(s.d sdkState, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.n.f(sdkState, "sdkState");
        this.f18536a = sdkState;
        this.f18537b = z10;
        this.f18538c = z11;
        this.f18539d = z12;
    }

    public static /* synthetic */ b a(b bVar, s.d dVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = bVar.f18536a;
        }
        if ((i10 & 2) != 0) {
            z10 = bVar.f18537b;
        }
        if ((i10 & 4) != 0) {
            z11 = bVar.f18538c;
        }
        if ((i10 & 8) != 0) {
            z12 = bVar.f18539d;
        }
        return bVar.a(dVar, z10, z11, z12);
    }

    public final b a(s.d sdkState, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.n.f(sdkState, "sdkState");
        return new b(sdkState, z10, z11, z12);
    }

    public final s.d a() {
        return this.f18536a;
    }

    public final boolean b() {
        return this.f18537b;
    }

    public final boolean c() {
        return this.f18538c;
    }

    public final boolean d() {
        return this.f18539d;
    }

    public final s.d e() {
        return this.f18536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f18536a == bVar.f18536a && this.f18537b == bVar.f18537b && this.f18538c == bVar.f18538c && this.f18539d == bVar.f18539d;
        }
        return false;
    }

    public final boolean f() {
        return this.f18539d;
    }

    public final boolean g() {
        return this.f18538c;
    }

    public final boolean h() {
        return this.f18537b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f18536a.hashCode() * 31;
        boolean z10 = this.f18537b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f18538c;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f18539d;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f18536a + ", isRetryForMoreThan15Secs=" + this.f18537b + ", isDemandOnlyInitRequested=" + this.f18538c + ", isAdUnitInitRequested=" + this.f18539d + ')';
    }
}
