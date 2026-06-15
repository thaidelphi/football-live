package y5;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class j0<E> extends q<E> {

    /* renamed from: e  reason: collision with root package name */
    static final q<Object> f33213e = new j0(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f33214c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f33215d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(Object[] objArr, int i10) {
        this.f33214c = objArr;
        this.f33215d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y5.q, y5.o
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f33214c, 0, objArr, i10, this.f33215d);
        return i10 + this.f33215d;
    }

    @Override // y5.o
    Object[] c() {
        return this.f33214c;
    }

    @Override // y5.o
    int d() {
        return this.f33215d;
    }

    @Override // y5.o
    int e() {
        return 0;
    }

    @Override // y5.o
    boolean f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        x5.g.g(i10, this.f33215d);
        E e8 = (E) this.f33214c[i10];
        Objects.requireNonNull(e8);
        return e8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f33215d;
    }
}
