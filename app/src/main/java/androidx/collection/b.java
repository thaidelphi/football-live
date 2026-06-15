package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ArraySet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f1921e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f1922f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    private static Object[] f1923g;

    /* renamed from: h  reason: collision with root package name */
    private static int f1924h;

    /* renamed from: i  reason: collision with root package name */
    private static Object[] f1925i;

    /* renamed from: j  reason: collision with root package name */
    private static int f1926j;

    /* renamed from: a  reason: collision with root package name */
    private int[] f1927a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f1928b;

    /* renamed from: c  reason: collision with root package name */
    int f1929c;

    /* renamed from: d  reason: collision with root package name */
    private g<E, E> f1930d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArraySet.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends g<E, E> {
        a() {
        }

        @Override // androidx.collection.g
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.g
        protected Object b(int i10, int i11) {
            return b.this.f1928b[i10];
        }

        @Override // androidx.collection.g
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.g
        protected int d() {
            return b.this.f1929c;
        }

        @Override // androidx.collection.g
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.g
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.g
        protected void g(E e8, E e10) {
            b.this.add(e8);
        }

        @Override // androidx.collection.g
        protected void h(int i10) {
            b.this.g(i10);
        }

        @Override // androidx.collection.g
        protected E i(int i10, E e8) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1925i;
                if (objArr != null) {
                    this.f1928b = objArr;
                    f1925i = (Object[]) objArr[0];
                    this.f1927a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1926j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1923g;
                if (objArr2 != null) {
                    this.f1928b = objArr2;
                    f1923g = (Object[]) objArr2[0];
                    this.f1927a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1924h--;
                    return;
                }
            }
        }
        this.f1927a = new int[i10];
        this.f1928b = new Object[i10];
    }

    private static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1926j < 10) {
                    objArr[0] = f1925i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1925i = objArr;
                    f1926j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1924h < 10) {
                    objArr[0] = f1923g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1923g = objArr;
                    f1924h++;
                }
            }
        }
    }

    private g<E, E> d() {
        if (this.f1930d == null) {
            this.f1930d = new a();
        }
        return this.f1930d;
    }

    private int e(Object obj, int i10) {
        int i11 = this.f1929c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = d.a(this.f1927a, i11, i10);
        if (a10 >= 0 && !obj.equals(this.f1928b[a10])) {
            int i12 = a10 + 1;
            while (i12 < i11 && this.f1927a[i12] == i10) {
                if (obj.equals(this.f1928b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a10 - 1; i13 >= 0 && this.f1927a[i13] == i10; i13--) {
                if (obj.equals(this.f1928b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return a10;
    }

    private int f() {
        int i10 = this.f1929c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = d.a(this.f1927a, i10, 0);
        if (a10 >= 0 && this.f1928b[a10] != null) {
            int i11 = a10 + 1;
            while (i11 < i10 && this.f1927a[i11] == 0) {
                if (this.f1928b[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && this.f1927a[i12] == 0; i12--) {
                if (this.f1928b[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return a10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e8) {
        int i10;
        int e10;
        if (e8 == null) {
            e10 = f();
            i10 = 0;
        } else {
            int hashCode = e8.hashCode();
            i10 = hashCode;
            e10 = e(e8, hashCode);
        }
        if (e10 >= 0) {
            return false;
        }
        int i11 = ~e10;
        int i12 = this.f1929c;
        int[] iArr = this.f1927a;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f1928b;
            a(i13);
            int[] iArr2 = this.f1927a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1928b, 0, objArr.length);
            }
            c(iArr, objArr, this.f1929c);
        }
        int i14 = this.f1929c;
        if (i11 < i14) {
            int[] iArr3 = this.f1927a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f1928b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f1929c - i11);
        }
        this.f1927a[i11] = i10;
        this.f1928b[i11] = e8;
        this.f1929c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        b(this.f1929c + collection.size());
        boolean z10 = false;
        for (E e8 : collection) {
            z10 |= add(e8);
        }
        return z10;
    }

    public void b(int i10) {
        int[] iArr = this.f1927a;
        if (iArr.length < i10) {
            Object[] objArr = this.f1928b;
            a(i10);
            int i11 = this.f1929c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f1927a, 0, i11);
                System.arraycopy(objArr, 0, this.f1928b, 0, this.f1929c);
            }
            c(iArr, objArr, this.f1929c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f1929c;
        if (i10 != 0) {
            c(this.f1927a, this.f1928b, i10);
            this.f1927a = f1921e;
            this.f1928b = f1922f;
            this.f1929c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1929c; i10++) {
                try {
                    if (!set.contains(h(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E g(int i10) {
        Object[] objArr = this.f1928b;
        E e8 = (E) objArr[i10];
        int i11 = this.f1929c;
        if (i11 <= 1) {
            c(this.f1927a, objArr, i11);
            this.f1927a = f1921e;
            this.f1928b = f1922f;
            this.f1929c = 0;
        } else {
            int[] iArr = this.f1927a;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                a(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f1929c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1927a, 0, i10);
                    System.arraycopy(objArr, 0, this.f1928b, 0, i10);
                }
                int i12 = this.f1929c;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, this.f1927a, i10, i12 - i10);
                    System.arraycopy(objArr, i13, this.f1928b, i10, this.f1929c - i10);
                }
            } else {
                int i14 = i11 - 1;
                this.f1929c = i14;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, iArr, i10, i14 - i10);
                    Object[] objArr2 = this.f1928b;
                    System.arraycopy(objArr2, i15, objArr2, i10, this.f1929c - i10);
                }
                this.f1928b[this.f1929c] = null;
            }
        }
        return e8;
    }

    public E h(int i10) {
        return (E) this.f1928b[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1927a;
        int i10 = this.f1929c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1929c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return d().m().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            g(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f1929c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f1928b[i10])) {
                g(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1929c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f1929c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f1928b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1929c * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1929c; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            E h10 = h(i10);
            if (h10 != this) {
                sb.append(h10);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f1927a = f1921e;
            this.f1928b = f1922f;
        } else {
            a(i10);
        }
        this.f1929c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1929c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1929c));
        }
        System.arraycopy(this.f1928b, 0, tArr, 0, this.f1929c);
        int length = tArr.length;
        int i10 = this.f1929c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
