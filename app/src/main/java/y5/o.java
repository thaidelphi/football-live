package y5;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: ImmutableCollection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class o<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f33243a = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImmutableCollection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f33244a;

        /* renamed from: b  reason: collision with root package name */
        int f33245b;

        /* renamed from: c  reason: collision with root package name */
        boolean f33246c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10) {
            h.b(i10, "initialCapacity");
            this.f33244a = new Object[i10];
            this.f33245b = 0;
        }

        private void e(int i10) {
            Object[] objArr = this.f33244a;
            if (objArr.length < i10) {
                this.f33244a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
                this.f33246c = false;
            } else if (this.f33246c) {
                this.f33244a = (Object[]) objArr.clone();
                this.f33246c = false;
            }
        }

        @Override // y5.o.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                e(this.f33245b + collection.size());
                if (collection instanceof o) {
                    this.f33245b = ((o) collection).b(this.f33244a, this.f33245b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e8) {
            x5.g.i(e8);
            e(this.f33245b + 1);
            Object[] objArr = this.f33244a;
            int i10 = this.f33245b;
            this.f33245b = i10 + 1;
            objArr[i10] = e8;
            return this;
        }
    }

    /* compiled from: ImmutableCollection.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class b<E> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int c(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                return i12 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public abstract b<E> a(E e8);

        public b<E> b(Iterable<? extends E> iterable) {
            for (E e8 : iterable) {
                a(e8);
            }
            return this;
        }
    }

    public q<E> a() {
        return isEmpty() ? q.p() : q.h(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    int b(Object[] objArr, int i10) {
        s0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public abstract s0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f33243a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        x5.g.i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] c10 = c();
            if (c10 != null) {
                return (T[]) i0.a(c10, e(), d(), tArr);
            }
            tArr = (T[]) g0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        b(tArr, 0);
        return tArr;
    }
}
