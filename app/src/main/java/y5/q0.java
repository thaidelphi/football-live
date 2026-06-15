package y5;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonImmutableSet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class q0<E> extends s<E> {

    /* renamed from: c  reason: collision with root package name */
    final transient E f33258c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(E e8) {
        this.f33258c = (E) x5.g.i(e8);
    }

    @Override // y5.s, y5.o
    public q<E> a() {
        return q.q(this.f33258c);
    }

    @Override // y5.o
    int b(Object[] objArr, int i10) {
        objArr[i10] = this.f33258c;
        return i10 + 1;
    }

    @Override // y5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f33258c.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y5.o
    public boolean f() {
        return false;
    }

    @Override // y5.s, y5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public s0<E> iterator() {
        return u.p(this.f33258c);
    }

    @Override // y5.s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33258c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f33258c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
