package f6;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* compiled from: Dependency.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final e0<?> f25472a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25473b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25474c;

    private r(Class<?> cls, int i10, int i11) {
        this(e0.b(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i10);
            }
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        return "direct";
    }

    @Deprecated
    public static r g(Class<?> cls) {
        return new r(cls, 0, 0);
    }

    public static r h(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r i(e0<?> e0Var) {
        return new r(e0Var, 1, 0);
    }

    public static r j(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r k(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r l(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public e0<?> b() {
        return this.f25472a;
    }

    public boolean c() {
        return this.f25474c == 2;
    }

    public boolean d() {
        return this.f25474c == 0;
    }

    public boolean e() {
        return this.f25473b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f25472a.equals(rVar.f25472a) && this.f25473b == rVar.f25473b && this.f25474c == rVar.f25474c;
        }
        return false;
    }

    public boolean f() {
        return this.f25473b == 2;
    }

    public int hashCode() {
        return ((((this.f25472a.hashCode() ^ 1000003) * 1000003) ^ this.f25473b) * 1000003) ^ this.f25474c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f25472a);
        sb.append(", type=");
        int i10 = this.f25473b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.f25474c));
        sb.append("}");
        return sb.toString();
    }

    private r(e0<?> e0Var, int i10, int i11) {
        this.f25472a = (e0) d0.c(e0Var, "Null dependency anInterface.");
        this.f25473b = i10;
        this.f25474c = i11;
    }
}
