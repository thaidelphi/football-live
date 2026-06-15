package androidx.collection;

import com.ironsource.b9;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapCollections.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    g<K, V>.b f1944a;

    /* renamed from: b  reason: collision with root package name */
    g<K, V>.c f1945b;

    /* renamed from: c  reason: collision with root package name */
    g<K, V>.e f1946c;

    /* compiled from: MapCollections.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f1947a;

        /* renamed from: b  reason: collision with root package name */
        int f1948b;

        /* renamed from: c  reason: collision with root package name */
        int f1949c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1950d = false;

        a(int i10) {
            this.f1947a = i10;
            this.f1948b = g.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1949c < this.f1948b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t10 = (T) g.this.b(this.f1949c, this.f1947a);
                this.f1949c++;
                this.f1950d = true;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1950d) {
                int i10 = this.f1949c - 1;
                this.f1949c = i10;
                this.f1948b--;
                this.f1950d = false;
                g.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = g.this.d();
            for (Map.Entry<K, V> entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e8 = g.this.e(entry.getKey());
                if (e8 < 0) {
                    return false;
                }
                return androidx.collection.d.c(g.this.b(e8, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                Object b11 = g.this.b(d10, 1);
                i10 += (b10 == null ? 0 : b10.hashCode()) ^ (b11 == null ? 0 : b11.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return g.j(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int d10 = g.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = g.this.b(d10, 0);
                i10 += b10 == null ? 0 : b10.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e8 = g.this.e(obj);
            if (e8 >= 0) {
                g.this.h(e8);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return g.o(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return g.p(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return g.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.r(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        int f1954a;

        /* renamed from: c  reason: collision with root package name */
        boolean f1956c = false;

        /* renamed from: b  reason: collision with root package name */
        int f1955b = -1;

        d() {
            this.f1954a = g.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1955b++;
                this.f1956c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f1956c) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return androidx.collection.d.c(entry.getKey(), g.this.b(this.f1955b, 0)) && androidx.collection.d.c(entry.getValue(), g.this.b(this.f1955b, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1956c) {
                return (K) g.this.b(this.f1955b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1956c) {
                return (V) g.this.b(this.f1955b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1955b < this.f1954a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f1956c) {
                Object b10 = g.this.b(this.f1955b, 0);
                Object b11 = g.this.b(this.f1955b, 1);
                return (b10 == null ? 0 : b10.hashCode()) ^ (b11 != null ? b11.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1956c) {
                g.this.h(this.f1955b);
                this.f1955b--;
                this.f1954a--;
                this.f1956c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f1956c) {
                return (V) g.this.i(this.f1955b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + b9.i.f16692b + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f10 = g.this.f(obj);
            if (f10 >= 0) {
                g.this.h(f10);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d10 = g.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(g.this.b(i10, 1))) {
                    g.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return g.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i10, int i11);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k10, V v10);

    protected abstract void h(int i10);

    protected abstract V i(int i10, V v10);

    public Set<Map.Entry<K, V>> l() {
        if (this.f1944a == null) {
            this.f1944a = new b();
        }
        return this.f1944a;
    }

    public Set<K> m() {
        if (this.f1945b == null) {
            this.f1945b = new c();
        }
        return this.f1945b;
    }

    public Collection<V> n() {
        if (this.f1946c == null) {
            this.f1946c = new e();
        }
        return this.f1946c;
    }

    public Object[] q(int i10) {
        int d10 = d();
        Object[] objArr = new Object[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] r(T[] tArr, int i10) {
        int d10 = d();
        if (tArr.length < d10) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d10));
        }
        for (int i11 = 0; i11 < d10; i11++) {
            tArr[i11] = b(i11, i10);
        }
        if (tArr.length > d10) {
            tArr[d10] = null;
        }
        return tArr;
    }
}
