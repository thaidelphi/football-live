package androidx.core.util;
/* compiled from: Pair.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f2786a;

    /* renamed from: b  reason: collision with root package name */
    public final S f2787b;

    public e(F f10, S s10) {
        this.f2786a = f10;
        this.f2787b = s10;
    }

    public static <A, B> e<A, B> a(A a10, B b10) {
        return new e<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return d.a(eVar.f2786a, this.f2786a) && d.a(eVar.f2787b, this.f2787b);
        }
        return false;
    }

    public int hashCode() {
        F f10 = this.f2786a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f2787b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f2786a + " " + this.f2787b + "}";
    }
}
