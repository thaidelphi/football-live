package j8;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ArrayDeque.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h<E> extends e<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f27091d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f27092e = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f27093a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f27094b = f27092e;

    /* renamed from: c  reason: collision with root package name */
    private int f27095c;

    /* compiled from: ArrayDeque.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                if (i11 > 2147483639) {
                    return Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                return 2147483639;
            }
            return i12;
        }
    }

    private final void e(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f27094b.length;
        while (i10 < length && it.hasNext()) {
            this.f27094b[i10] = it.next();
            i10++;
        }
        int i11 = this.f27093a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f27094b[i12] = it.next();
        }
        this.f27095c = size() + collection.size();
    }

    private final void f(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f27094b;
        l.c(objArr2, objArr, 0, this.f27093a, objArr2.length);
        Object[] objArr3 = this.f27094b;
        int length = objArr3.length;
        int i11 = this.f27093a;
        l.c(objArr3, objArr, length - i11, 0, i11);
        this.f27093a = 0;
        this.f27094b = objArr;
    }

    private final int g(int i10) {
        return i10 == 0 ? m.n(this.f27094b) : i10 - 1;
    }

    private final void h(int i10) {
        int a10;
        if (i10 >= 0) {
            Object[] objArr = this.f27094b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f27092e) {
                a10 = y8.i.a(i10, 10);
                this.f27094b = new Object[a10];
                return;
            }
            f(f27091d.a(objArr.length, i10));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int i(int i10) {
        if (i10 == m.n(this.f27094b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int j(int i10) {
        return i10 < 0 ? i10 + this.f27094b.length : i10;
    }

    private final int k(int i10) {
        Object[] objArr = this.f27094b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // j8.e
    public int a() {
        return this.f27095c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e8) {
        d(e8);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        h(size() + elements.size());
        e(k(this.f27093a + size()), elements);
        return true;
    }

    @Override // j8.e
    public E b(int i10) {
        c.f27085a.a(i10, size());
        if (i10 == o.e(this)) {
            return n();
        }
        if (i10 == 0) {
            return l();
        }
        int k10 = k(this.f27093a + i10);
        E e8 = (E) this.f27094b[k10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f27093a;
            if (k10 >= i11) {
                Object[] objArr = this.f27094b;
                l.c(objArr, objArr, i11 + 1, i11, k10);
            } else {
                Object[] objArr2 = this.f27094b;
                l.c(objArr2, objArr2, 1, 0, k10);
                Object[] objArr3 = this.f27094b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f27093a;
                l.c(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f27094b;
            int i13 = this.f27093a;
            objArr4[i13] = null;
            this.f27093a = i(i13);
        } else {
            int k11 = k(this.f27093a + o.e(this));
            if (k10 <= k11) {
                Object[] objArr5 = this.f27094b;
                l.c(objArr5, objArr5, k10, k10 + 1, k11 + 1);
            } else {
                Object[] objArr6 = this.f27094b;
                l.c(objArr6, objArr6, k10, k10 + 1, objArr6.length);
                Object[] objArr7 = this.f27094b;
                objArr7[objArr7.length - 1] = objArr7[0];
                l.c(objArr7, objArr7, 0, 1, k11 + 1);
            }
            this.f27094b[k11] = null;
        }
        this.f27095c = size() - 1;
        return e8;
    }

    public final void c(E e8) {
        h(size() + 1);
        int g10 = g(this.f27093a);
        this.f27093a = g10;
        this.f27094b[g10] = e8;
        this.f27095c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int k10 = k(this.f27093a + size());
        int i10 = this.f27093a;
        if (i10 < k10) {
            l.f(this.f27094b, null, i10, k10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f27094b;
            l.f(objArr, null, this.f27093a, objArr.length);
            l.f(this.f27094b, null, 0, k10);
        }
        this.f27093a = 0;
        this.f27095c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(E e8) {
        h(size() + 1);
        this.f27094b[k(this.f27093a + size())] = e8;
        this.f27095c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f27085a.a(i10, size());
        return (E) this.f27094b[k(this.f27093a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int k10 = k(this.f27093a + size());
        int i11 = this.f27093a;
        if (i11 < k10) {
            while (i11 < k10) {
                if (kotlin.jvm.internal.n.a(obj, this.f27094b[i11])) {
                    i10 = this.f27093a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < k10) {
            return -1;
        } else {
            int length = this.f27094b.length;
            while (true) {
                if (i11 >= length) {
                    for (int i12 = 0; i12 < k10; i12++) {
                        if (kotlin.jvm.internal.n.a(obj, this.f27094b[i12])) {
                            i11 = i12 + this.f27094b.length;
                            i10 = this.f27093a;
                        }
                    }
                    return -1;
                } else if (kotlin.jvm.internal.n.a(obj, this.f27094b[i11])) {
                    i10 = this.f27093a;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E l() {
        if (!isEmpty()) {
            Object[] objArr = this.f27094b;
            int i10 = this.f27093a;
            E e8 = (E) objArr[i10];
            objArr[i10] = null;
            this.f27093a = i(i10);
            this.f27095c = size() - 1;
            return e8;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int n10;
        int i10;
        int k10 = k(this.f27093a + size());
        int i11 = this.f27093a;
        if (i11 < k10) {
            n10 = k10 - 1;
            if (i11 <= n10) {
                while (!kotlin.jvm.internal.n.a(obj, this.f27094b[n10])) {
                    if (n10 != i11) {
                        n10--;
                    }
                }
                i10 = this.f27093a;
                return n10 - i10;
            }
            return -1;
        }
        if (i11 > k10) {
            int i12 = k10 - 1;
            while (true) {
                if (-1 < i12) {
                    if (kotlin.jvm.internal.n.a(obj, this.f27094b[i12])) {
                        n10 = i12 + this.f27094b.length;
                        i10 = this.f27093a;
                        break;
                    }
                    i12--;
                } else {
                    n10 = m.n(this.f27094b);
                    int i13 = this.f27093a;
                    if (i13 <= n10) {
                        while (!kotlin.jvm.internal.n.a(obj, this.f27094b[n10])) {
                            if (n10 != i13) {
                                n10--;
                            }
                        }
                        i10 = this.f27093a;
                    }
                }
            }
        }
        return -1;
    }

    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return l();
    }

    public final E n() {
        if (!isEmpty()) {
            int k10 = k(this.f27093a + o.e(this));
            Object[] objArr = this.f27094b;
            E e8 = (E) objArr[k10];
            objArr[k10] = null;
            this.f27095c = size() - 1;
            return e8;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int k10;
        kotlin.jvm.internal.n.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f27094b.length == 0 ? 1 : null) == null) {
                int k11 = k(this.f27093a + size());
                int i10 = this.f27093a;
                if (i10 < k11) {
                    k10 = i10;
                    while (i10 < k11) {
                        Object obj = this.f27094b[i10];
                        if (!elements.contains(obj)) {
                            this.f27094b[k10] = obj;
                            k10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    l.f(this.f27094b, null, k10, k11);
                } else {
                    int length = this.f27094b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f27094b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f27094b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    k10 = k(i11);
                    for (int i12 = 0; i12 < k11; i12++) {
                        Object[] objArr2 = this.f27094b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f27094b[k10] = obj3;
                            k10 = i(k10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f27095c = j(k10 - this.f27093a);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int k10;
        kotlin.jvm.internal.n.f(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f27094b.length == 0 ? 1 : null) == null) {
                int k11 = k(this.f27093a + size());
                int i10 = this.f27093a;
                if (i10 < k11) {
                    k10 = i10;
                    while (i10 < k11) {
                        Object obj = this.f27094b[i10];
                        if (elements.contains(obj)) {
                            this.f27094b[k10] = obj;
                            k10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    l.f(this.f27094b, null, k10, k11);
                } else {
                    int length = this.f27094b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f27094b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f27094b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    k10 = k(i11);
                    for (int i12 = 0; i12 < k11; i12++) {
                        Object[] objArr2 = this.f27094b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f27094b[k10] = obj3;
                            k10 = i(k10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f27095c = j(k10 - this.f27093a);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e8) {
        c.f27085a.a(i10, size());
        int k10 = k(this.f27093a + i10);
        Object[] objArr = this.f27094b;
        E e10 = (E) objArr[k10];
        objArr[k10] = e8;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.n.f(array, "array");
        if (array.length < size()) {
            array = (T[]) j.a(array, size());
        }
        int k10 = k(this.f27093a + size());
        int i10 = this.f27093a;
        if (i10 < k10) {
            l.d(this.f27094b, array, 0, i10, k10, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f27094b;
            l.c(objArr, array, 0, this.f27093a, objArr.length);
            Object[] objArr2 = this.f27094b;
            l.c(objArr2, array, objArr2.length - this.f27093a, 0, k10);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e8) {
        c.f27085a.b(i10, size());
        if (i10 == size()) {
            d(e8);
        } else if (i10 == 0) {
            c(e8);
        } else {
            h(size() + 1);
            int k10 = k(this.f27093a + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int g10 = g(k10);
                int g11 = g(this.f27093a);
                int i11 = this.f27093a;
                if (g10 >= i11) {
                    Object[] objArr = this.f27094b;
                    objArr[g11] = objArr[i11];
                    l.c(objArr, objArr, i11, i11 + 1, g10 + 1);
                } else {
                    Object[] objArr2 = this.f27094b;
                    l.c(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f27094b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    l.c(objArr3, objArr3, 0, 1, g10 + 1);
                }
                this.f27094b[g10] = e8;
                this.f27093a = g11;
            } else {
                int k11 = k(this.f27093a + size());
                if (k10 < k11) {
                    Object[] objArr4 = this.f27094b;
                    l.c(objArr4, objArr4, k10 + 1, k10, k11);
                } else {
                    Object[] objArr5 = this.f27094b;
                    l.c(objArr5, objArr5, 1, 0, k11);
                    Object[] objArr6 = this.f27094b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    l.c(objArr6, objArr6, k10 + 1, k10, objArr6.length - 1);
                }
                this.f27094b[k10] = e8;
            }
            this.f27095c = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        kotlin.jvm.internal.n.f(elements, "elements");
        c.f27085a.b(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        h(size() + elements.size());
        int k10 = k(this.f27093a + size());
        int k11 = k(this.f27093a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f27093a;
            int i12 = i11 - size;
            if (k11 < i11) {
                Object[] objArr = this.f27094b;
                l.c(objArr, objArr, i12, i11, objArr.length);
                if (size >= k11) {
                    Object[] objArr2 = this.f27094b;
                    l.c(objArr2, objArr2, objArr2.length - size, 0, k11);
                } else {
                    Object[] objArr3 = this.f27094b;
                    l.c(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f27094b;
                    l.c(objArr4, objArr4, 0, size, k11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f27094b;
                l.c(objArr5, objArr5, i12, i11, k11);
            } else {
                Object[] objArr6 = this.f27094b;
                i12 += objArr6.length;
                int i13 = k11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    l.c(objArr6, objArr6, i12, i11, k11);
                } else {
                    l.c(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f27094b;
                    l.c(objArr7, objArr7, 0, this.f27093a + length, k11);
                }
            }
            this.f27093a = i12;
            e(j(k11 - size), elements);
        } else {
            int i14 = k11 + size;
            if (k11 < k10) {
                int i15 = size + k10;
                Object[] objArr8 = this.f27094b;
                if (i15 <= objArr8.length) {
                    l.c(objArr8, objArr8, i14, k11, k10);
                } else if (i14 >= objArr8.length) {
                    l.c(objArr8, objArr8, i14 - objArr8.length, k11, k10);
                } else {
                    int length2 = k10 - (i15 - objArr8.length);
                    l.c(objArr8, objArr8, 0, length2, k10);
                    Object[] objArr9 = this.f27094b;
                    l.c(objArr9, objArr9, i14, k11, length2);
                }
            } else {
                Object[] objArr10 = this.f27094b;
                l.c(objArr10, objArr10, size, 0, k10);
                Object[] objArr11 = this.f27094b;
                if (i14 >= objArr11.length) {
                    l.c(objArr11, objArr11, i14 - objArr11.length, k11, objArr11.length);
                } else {
                    l.c(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f27094b;
                    l.c(objArr12, objArr12, i14, k11, objArr12.length - size);
                }
            }
            e(k11, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
