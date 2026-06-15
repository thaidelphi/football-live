package j8;
/* compiled from: IndexedValue.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f27087a;

    /* renamed from: b  reason: collision with root package name */
    private final T f27088b;

    public d0(int i10, T t10) {
        this.f27087a = i10;
        this.f27088b = t10;
    }

    public final int a() {
        return this.f27087a;
    }

    public final T b() {
        return this.f27088b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return this.f27087a == d0Var.f27087a && kotlin.jvm.internal.n.a(this.f27088b, d0Var.f27088b);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f27087a * 31;
        T t10 = this.f27088b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f27087a + ", value=" + this.f27088b + ')';
    }
}
