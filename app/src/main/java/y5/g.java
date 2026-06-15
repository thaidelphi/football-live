package y5;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ByFunctionOrdering.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class g<F, T> extends h0<F> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final x5.d<F, ? extends T> f33208a;

    /* renamed from: b  reason: collision with root package name */
    final h0<T> f33209b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(x5.d<F, ? extends T> dVar, h0<T> h0Var) {
        this.f33208a = (x5.d) x5.g.i(dVar);
        this.f33209b = (h0) x5.g.i(h0Var);
    }

    @Override // y5.h0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f33209b.compare(this.f33208a.apply(f10), this.f33208a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f33208a.equals(gVar.f33208a) && this.f33209b.equals(gVar.f33209b);
        }
        return false;
    }

    public int hashCode() {
        return x5.f.b(this.f33208a, this.f33209b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33209b);
        String valueOf2 = String.valueOf(this.f33208a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
