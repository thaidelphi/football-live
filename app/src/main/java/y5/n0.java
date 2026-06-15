package y5;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReverseOrdering.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class n0<T> extends h0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final h0<? super T> f33242a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(h0<? super T> h0Var) {
        this.f33242a = (h0) x5.g.i(h0Var);
    }

    @Override // y5.h0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f33242a.compare(t11, t10);
    }

    @Override // y5.h0
    public <S extends T> h0<S> d() {
        return (h0<? super T>) this.f33242a;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            return this.f33242a.equals(((n0) obj).f33242a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f33242a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f33242a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
