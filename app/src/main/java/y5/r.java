package y5;

import com.ironsource.b9;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import y5.o;
/* compiled from: ImmutableMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class r<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f33259d = new Map.Entry[0];

    /* renamed from: a  reason: collision with root package name */
    private transient s<Map.Entry<K, V>> f33260a;

    /* renamed from: b  reason: collision with root package name */
    private transient s<K> f33261b;

    /* renamed from: c  reason: collision with root package name */
    private transient o<V> f33262c;

    /* compiled from: ImmutableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f33263a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f33264b;

        /* renamed from: c  reason: collision with root package name */
        int f33265c;

        /* renamed from: d  reason: collision with root package name */
        boolean f33266d;

        /* renamed from: e  reason: collision with root package name */
        C0391a f33267e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ImmutableMap.java */
        /* renamed from: y5.r$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class C0391a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f33268a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f33269b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f33270c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0391a(Object obj, Object obj2, Object obj3) {
                this.f33268a = obj;
                this.f33269b = obj2;
                this.f33270c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f33268a);
                String valueOf2 = String.valueOf(this.f33269b);
                String valueOf3 = String.valueOf(this.f33268a);
                String valueOf4 = String.valueOf(this.f33270c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append(b9.i.f16692b);
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append(b9.i.f16692b);
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        private r<K, V> b(boolean z10) {
            Object[] objArr;
            C0391a c0391a;
            C0391a c0391a2;
            if (z10 && (c0391a2 = this.f33267e) != null) {
                throw c0391a2.a();
            }
            int i10 = this.f33265c;
            if (this.f33263a == null) {
                objArr = this.f33264b;
            } else {
                if (this.f33266d) {
                    this.f33264b = Arrays.copyOf(this.f33264b, i10 * 2);
                }
                objArr = this.f33264b;
                if (!z10) {
                    objArr = e(objArr, this.f33265c);
                    if (objArr.length < this.f33264b.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                i(objArr, i10, this.f33263a);
            }
            this.f33266d = true;
            k0 l10 = k0.l(i10, objArr, this);
            if (!z10 || (c0391a = this.f33267e) == null) {
                return l10;
            }
            throw c0391a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f33264b;
            if (i11 > objArr.length) {
                this.f33264b = Arrays.copyOf(objArr, o.b.c(objArr.length, i11));
                this.f33266d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, h0.a(comparator).c(y.j()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public r<K, V> a() {
            return c();
        }

        public r<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f33265c + 1);
            h.a(k10, v10);
            Object[] objArr = this.f33264b;
            int i10 = this.f33265c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f33265c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f33265c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                g(entry);
            }
            return this;
        }

        a(int i10) {
            this.f33264b = new Object[i10 * 2];
            this.f33265c = 0;
            this.f33266d = false;
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> r<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> r<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof r) && !(map instanceof SortedMap)) {
            r<K, V> rVar = (r) map;
            if (!rVar.h()) {
                return rVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> r<K, V> j() {
        return (r<K, V>) k0.f33220h;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract s<Map.Entry<K, V>> d();

    abstract s<K> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return y.c(this, obj);
    }

    abstract o<V> f();

    @Override // java.util.Map
    /* renamed from: g */
    public s<Map.Entry<K, V>> entrySet() {
        s<Map.Entry<K, V>> sVar = this.f33260a;
        if (sVar == null) {
            s<Map.Entry<K, V>> d10 = d();
            this.f33260a = d10;
            return d10;
        }
        return sVar;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return p0.d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public s<K> keySet() {
        s<K> sVar = this.f33261b;
        if (sVar == null) {
            s<K> e8 = e();
            this.f33261b = e8;
            return e8;
        }
        return sVar;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: k */
    public o<V> values() {
        o<V> oVar = this.f33262c;
        if (oVar == null) {
            o<V> f10 = f();
            this.f33262c = f10;
            return f10;
        }
        return oVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return y.i(this);
    }
}
