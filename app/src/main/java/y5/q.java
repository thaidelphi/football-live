package y5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import y5.o;
/* compiled from: ImmutableList.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class q<E> extends o<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final t0<Object> f33253b = new b(j0.f33213e, 0);

    /* compiled from: ImmutableList.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a<E> extends o.a<E> {
        public a() {
            this(4);
        }

        @Override // y5.o.b
        /* renamed from: f */
        public a<E> a(E e8) {
            super.d(e8);
            return this;
        }

        public a<E> g(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public q<E> h() {
            this.f33246c = true;
            return q.i(this.f33244a, this.f33245b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b<E> extends y5.a<E> {

        /* renamed from: c  reason: collision with root package name */
        private final q<E> f33254c;

        b(q<E> qVar, int i10) {
            super(qVar.size(), i10);
            this.f33254c = qVar;
        }

        @Override // y5.a
        protected E a(int i10) {
            return this.f33254c.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableList.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends q<E> {

        /* renamed from: c  reason: collision with root package name */
        final transient int f33255c;

        /* renamed from: d  reason: collision with root package name */
        final transient int f33256d;

        c(int i10, int i11) {
            this.f33255c = i10;
            this.f33256d = i11;
        }

        @Override // y5.o
        Object[] c() {
            return q.this.c();
        }

        @Override // y5.o
        int d() {
            return q.this.e() + this.f33255c + this.f33256d;
        }

        @Override // y5.o
        int e() {
            return q.this.e() + this.f33255c;
        }

        @Override // y5.o
        boolean f() {
            return true;
        }

        @Override // java.util.List
        public E get(int i10) {
            x5.g.g(i10, this.f33256d);
            return q.this.get(i10 + this.f33255c);
        }

        @Override // y5.q, y5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // y5.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33256d;
        }

        @Override // y5.q, java.util.List
        /* renamed from: u */
        public q<E> subList(int i10, int i11) {
            x5.g.m(i10, i11, this.f33256d);
            q qVar = q.this;
            int i12 = this.f33255c;
            return qVar.subList(i10 + i12, i11 + i12);
        }

        @Override // y5.q, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> q<E> h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> q<E> i(Object[] objArr, int i10) {
        if (i10 == 0) {
            return p();
        }
        return new j0(objArr, i10);
    }

    public static <E> a<E> j() {
        return new a<>();
    }

    private static <E> q<E> k(Object... objArr) {
        return h(g0.b(objArr));
    }

    public static <E> q<E> l(Collection<? extends E> collection) {
        if (collection instanceof o) {
            q<E> a10 = ((o) collection).a();
            return a10.f() ? h(a10.toArray()) : a10;
        }
        return k(collection.toArray());
    }

    public static <E> q<E> m(E[] eArr) {
        if (eArr.length == 0) {
            return p();
        }
        return k((Object[]) eArr.clone());
    }

    public static <E> q<E> p() {
        return (q<E>) j0.f33213e;
    }

    public static <E> q<E> q(E e8) {
        return k(e8);
    }

    public static <E> q<E> r(E e8, E e10) {
        return k(e8, e10);
    }

    public static <E> q<E> s(E e8, E e10, E e11, E e12, E e13) {
        return k(e8, e10, e11, e12, e13);
    }

    @Override // y5.o
    @Deprecated
    public final q<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y5.o
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // y5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return w.c(this, obj);
    }

    @Override // y5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public s0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.f(this, obj);
    }

    @Override // java.util.List
    /* renamed from: n */
    public t0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: o */
    public t0<E> listIterator(int i10) {
        x5.g.k(i10, size());
        if (isEmpty()) {
            return (t0<E>) f33253b;
        }
        return new b(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: u */
    public q<E> subList(int i10, int i11) {
        x5.g.m(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return p();
        }
        return v(i10, i11);
    }

    q<E> v(int i10, int i11) {
        return new c(i10, i11 - i10);
    }
}
