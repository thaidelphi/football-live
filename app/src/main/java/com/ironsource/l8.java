package com.ironsource;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class l8 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18165a;

    /* renamed from: b  reason: collision with root package name */
    private final n8 f18166b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18167a;

        static {
            int[] iArr = new int[n8.values().length];
            try {
                iArr[n8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18167a = iArr;
        }
    }

    public l8(boolean z10, n8 n8Var) {
        this.f18165a = z10;
        this.f18166b = n8Var;
    }

    public /* synthetic */ l8(boolean z10, n8 n8Var, int i10, kotlin.jvm.internal.h hVar) {
        this(z10, (i10 & 2) != 0 ? null : n8Var);
    }

    public static /* synthetic */ l8 a(l8 l8Var, boolean z10, n8 n8Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = l8Var.f18165a;
        }
        if ((i10 & 2) != 0) {
            n8Var = l8Var.f18166b;
        }
        return l8Var.a(z10, n8Var);
    }

    public final l8 a(boolean z10, n8 n8Var) {
        return new l8(z10, n8Var);
    }

    public final boolean a() {
        return this.f18165a;
    }

    public final n8 b() {
        return this.f18166b;
    }

    public final n8 c() {
        return this.f18166b;
    }

    public final boolean d() {
        return this.f18165a;
    }

    public final String e() {
        n8 n8Var = this.f18166b;
        int i10 = n8Var == null ? -1 : a.f18167a[n8Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return "Max ad cap reached";
            }
            return "In pacing mode";
        }
        return "Placement delivery is false";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l8) {
            l8 l8Var = (l8) obj;
            return this.f18165a == l8Var.f18165a && this.f18166b == l8Var.f18166b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f18165a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        n8 n8Var = this.f18166b;
        return i10 + (n8Var == null ? 0 : n8Var.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.f18165a + " reason=" + this.f18166b + ')';
    }
}
