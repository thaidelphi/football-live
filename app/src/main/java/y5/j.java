package y5;

import java.io.Serializable;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ComparatorOrdering.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class j<T> extends h0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator<T> f33212a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Comparator<T> comparator) {
        this.f33212a = (Comparator) x5.g.i(comparator);
    }

    @Override // y5.h0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f33212a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f33212a.equals(((j) obj).f33212a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33212a.hashCode();
    }

    public String toString() {
        return this.f33212a.toString();
    }
}
