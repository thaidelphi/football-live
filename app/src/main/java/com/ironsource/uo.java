package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class uo {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21066a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21067b;

    public uo() {
        this(false, 0, 3, null);
    }

    public uo(boolean z10, int i10) {
        this.f21066a = z10;
        this.f21067b = i10;
    }

    public /* synthetic */ uo(boolean z10, int i10, int i11, kotlin.jvm.internal.h hVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 805306368 : i10);
    }

    public static /* synthetic */ uo a(uo uoVar, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = uoVar.f21066a;
        }
        if ((i11 & 2) != 0) {
            i10 = uoVar.f21067b;
        }
        return uoVar.a(z10, i10);
    }

    public final uo a(boolean z10, int i10) {
        return new uo(z10, i10);
    }

    public final boolean a() {
        return this.f21066a;
    }

    public final int b() {
        return this.f21067b;
    }

    public final int c() {
        return this.f21067b;
    }

    public final boolean d() {
        return this.f21066a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uo) {
            uo uoVar = (uo) obj;
            return this.f21066a == uoVar.f21066a && this.f21067b == uoVar.f21067b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f21066a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.f21067b;
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f21066a + ", flags=" + this.f21067b + ')';
    }
}
