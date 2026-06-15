package k8;

import com.ironsource.cc;
import j8.e0;
import j8.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
import y8.i;
/* compiled from: MapBuilder.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c<K, V> implements Map<K, V>, Serializable {

    /* renamed from: m  reason: collision with root package name */
    private static final a f27280m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private K[] f27281a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f27282b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f27283c;

    /* renamed from: d  reason: collision with root package name */
    private int[] f27284d;

    /* renamed from: e  reason: collision with root package name */
    private int f27285e;

    /* renamed from: f  reason: collision with root package name */
    private int f27286f;

    /* renamed from: g  reason: collision with root package name */
    private int f27287g;

    /* renamed from: h  reason: collision with root package name */
    private int f27288h;

    /* renamed from: i  reason: collision with root package name */
    private k8.e<K> f27289i;

    /* renamed from: j  reason: collision with root package name */
    private k8.f<V> f27290j;

    /* renamed from: k  reason: collision with root package name */
    private k8.d<K, V> f27291k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f27292l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapBuilder.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            int a10;
            a10 = i.a(i10, 1);
            return Integer.highestOneBit(a10 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c<K, V> map) {
            super(map);
            n.f(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: g */
        public C0307c<K, V> next() {
            if (a() < ((c) c()).f27286f) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                C0307c<K, V> c0307c = new C0307c<>(c(), b());
                d();
                return c0307c;
            }
            throw new NoSuchElementException();
        }

        public final void h(StringBuilder sb) {
            n.f(sb, "sb");
            if (a() < ((c) c()).f27286f) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                Object obj = ((c) c()).f27281a[b()];
                if (n.a(obj, c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append(cc.T);
                Object[] objArr = ((c) c()).f27282b;
                n.c(objArr);
                Object obj2 = objArr[b()];
                if (n.a(obj2, c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                d();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int i() {
            if (a() < ((c) c()).f27286f) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                Object obj = ((c) c()).f27281a[b()];
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] objArr = ((c) c()).f27282b;
                n.c(objArr);
                Object obj2 = objArr[b()];
                int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
                d();
                return hashCode2;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: k8.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class C0307c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final c<K, V> f27293a;

        /* renamed from: b  reason: collision with root package name */
        private final int f27294b;

        public C0307c(c<K, V> map, int i10) {
            n.f(map, "map");
            this.f27293a = map;
            this.f27294b = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (n.a(entry.getKey(), getKey()) && n.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((c) this.f27293a).f27281a[this.f27294b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((c) this.f27293a).f27282b;
            n.c(objArr);
            return (V) objArr[this.f27294b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            this.f27293a.j();
            Object[] h10 = this.f27293a.h();
            int i10 = this.f27294b;
            V v11 = (V) h10[i10];
            h10[i10] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(cc.T);
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class d<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final c<K, V> f27295a;

        /* renamed from: b  reason: collision with root package name */
        private int f27296b;

        /* renamed from: c  reason: collision with root package name */
        private int f27297c;

        public d(c<K, V> map) {
            n.f(map, "map");
            this.f27295a = map;
            this.f27297c = -1;
            d();
        }

        public final int a() {
            return this.f27296b;
        }

        public final int b() {
            return this.f27297c;
        }

        public final c<K, V> c() {
            return this.f27295a;
        }

        public final void d() {
            while (this.f27296b < ((c) this.f27295a).f27286f) {
                int[] iArr = ((c) this.f27295a).f27283c;
                int i10 = this.f27296b;
                if (iArr[i10] >= 0) {
                    return;
                }
                this.f27296b = i10 + 1;
            }
        }

        public final void e(int i10) {
            this.f27296b = i10;
        }

        public final void f(int i10) {
            this.f27297c = i10;
        }

        public final boolean hasNext() {
            return this.f27296b < ((c) this.f27295a).f27286f;
        }

        public final void remove() {
            if (this.f27297c != -1) {
                this.f27295a.j();
                this.f27295a.I(this.f27297c);
                this.f27297c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c<K, V> map) {
            super(map);
            n.f(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() < ((c) c()).f27286f) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                K k10 = (K) ((c) c()).f27281a[b()];
                d();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c<K, V> map) {
            super(map);
            n.f(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() < ((c) c()).f27286f) {
                int a10 = a();
                e(a10 + 1);
                f(a10);
                Object[] objArr = ((c) c()).f27282b;
                n.c(objArr);
                V v10 = (V) objArr[b()];
                d();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    private c(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f27281a = kArr;
        this.f27282b = vArr;
        this.f27283c = iArr;
        this.f27284d = iArr2;
        this.f27285e = i10;
        this.f27286f = i11;
        this.f27287g = f27280m.d(v());
    }

    private final boolean B(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        p(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (C(entry)) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean C(Map.Entry<? extends K, ? extends V> entry) {
        int g10 = g(entry.getKey());
        V[] h10 = h();
        if (g10 >= 0) {
            h10[g10] = entry.getValue();
            return true;
        }
        int i10 = (-g10) - 1;
        if (n.a(entry.getValue(), h10[i10])) {
            return false;
        }
        h10[i10] = entry.getValue();
        return true;
    }

    private final boolean D(int i10) {
        int z10 = z(this.f27281a[i10]);
        int i11 = this.f27285e;
        while (true) {
            int[] iArr = this.f27284d;
            if (iArr[z10] == 0) {
                iArr[z10] = i10 + 1;
                this.f27283c[i10] = z10;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            z10 = z10 == 0 ? v() - 1 : z10 - 1;
        }
    }

    private final void E(int i10) {
        if (this.f27286f > size()) {
            k();
        }
        int i11 = 0;
        if (i10 != v()) {
            this.f27284d = new int[i10];
            this.f27287g = f27280m.d(i10);
        } else {
            l.e(this.f27284d, 0, 0, v());
        }
        while (i11 < this.f27286f) {
            int i12 = i11 + 1;
            if (!D(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    private final void G(int i10) {
        int c10;
        c10 = i.c(this.f27285e * 2, v() / 2);
        int i11 = c10;
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? v() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f27285e) {
                this.f27284d[i13] = 0;
                return;
            }
            int[] iArr = this.f27284d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((z(this.f27281a[i15]) - i10) & (v() - 1)) >= i12) {
                    this.f27284d[i13] = i14;
                    this.f27283c[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f27284d[i13] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i10) {
        k8.b.c(this.f27281a, i10);
        G(this.f27283c[i10]);
        this.f27283c[i10] = -1;
        this.f27288h = size() - 1;
    }

    private final boolean K(int i10) {
        int t10 = t();
        int i11 = this.f27286f;
        int i12 = t10 - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= t() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] h() {
        V[] vArr = this.f27282b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) k8.b.a(t());
        this.f27282b = vArr2;
        return vArr2;
    }

    private final void k() {
        int i10;
        V[] vArr = this.f27282b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f27286f;
            if (i11 >= i10) {
                break;
            }
            if (this.f27283c[i11] >= 0) {
                K[] kArr = this.f27281a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        k8.b.d(this.f27281a, i12, i10);
        if (vArr != null) {
            k8.b.d(vArr, i12, this.f27286f);
        }
        this.f27286f = i12;
    }

    private final boolean n(Map<?, ?> map) {
        return size() == map.size() && l(map.entrySet());
    }

    private final void o(int i10) {
        if (i10 >= 0) {
            if (i10 > t()) {
                int t10 = (t() * 3) / 2;
                if (i10 <= t10) {
                    i10 = t10;
                }
                this.f27281a = (K[]) k8.b.b(this.f27281a, i10);
                V[] vArr = this.f27282b;
                this.f27282b = vArr != null ? (V[]) k8.b.b(vArr, i10) : null;
                int[] copyOf = Arrays.copyOf(this.f27283c, i10);
                n.e(copyOf, "copyOf(this, newSize)");
                this.f27283c = copyOf;
                int c10 = f27280m.c(i10);
                if (c10 > v()) {
                    E(c10);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void p(int i10) {
        if (K(i10)) {
            E(v());
        } else {
            o(this.f27286f + i10);
        }
    }

    private final int r(K k10) {
        int z10 = z(k10);
        int i10 = this.f27285e;
        while (true) {
            int i11 = this.f27284d[z10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (n.a(this.f27281a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            z10 = z10 == 0 ? v() - 1 : z10 - 1;
        }
    }

    private final int s(V v10) {
        int i10 = this.f27286f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f27283c[i10] >= 0) {
                V[] vArr = this.f27282b;
                n.c(vArr);
                if (n.a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final int v() {
        return this.f27284d.length;
    }

    private final int z(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f27287g;
    }

    public final e<K, V> A() {
        return new e<>(this);
    }

    public final boolean F(Map.Entry<? extends K, ? extends V> entry) {
        n.f(entry, "entry");
        j();
        int r10 = r(entry.getKey());
        if (r10 < 0) {
            return false;
        }
        V[] vArr = this.f27282b;
        n.c(vArr);
        if (n.a(vArr[r10], entry.getValue())) {
            I(r10);
            return true;
        }
        return false;
    }

    public final int H(K k10) {
        j();
        int r10 = r(k10);
        if (r10 < 0) {
            return -1;
        }
        I(r10);
        return r10;
    }

    public final boolean J(V v10) {
        j();
        int s10 = s(v10);
        if (s10 < 0) {
            return false;
        }
        I(s10);
        return true;
    }

    public final f<K, V> L() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        j();
        e0 it = new y8.c(0, this.f27286f - 1).iterator();
        while (it.hasNext()) {
            int a10 = it.a();
            int[] iArr = this.f27283c;
            int i10 = iArr[a10];
            if (i10 >= 0) {
                this.f27284d[i10] = 0;
                iArr[a10] = -1;
            }
        }
        k8.b.d(this.f27281a, 0, this.f27286f);
        V[] vArr = this.f27282b;
        if (vArr != null) {
            k8.b.d(vArr, 0, this.f27286f);
        }
        this.f27288h = 0;
        this.f27286f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return r(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return s(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return u();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && n((Map) obj));
    }

    public final int g(K k10) {
        int c10;
        j();
        while (true) {
            int z10 = z(k10);
            c10 = i.c(this.f27285e * 2, v() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f27284d[z10];
                if (i11 <= 0) {
                    if (this.f27286f >= t()) {
                        p(1);
                    } else {
                        int i12 = this.f27286f;
                        int i13 = i12 + 1;
                        this.f27286f = i13;
                        this.f27281a[i12] = k10;
                        this.f27283c[i12] = z10;
                        this.f27284d[z10] = i13;
                        this.f27288h = size() + 1;
                        if (i10 > this.f27285e) {
                            this.f27285e = i10;
                        }
                        return i12;
                    }
                } else if (n.a(this.f27281a[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > c10) {
                        E(v() * 2);
                        break;
                    }
                    z10 = z10 == 0 ? v() - 1 : z10 - 1;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int r10 = r(obj);
        if (r10 < 0) {
            return null;
        }
        V[] vArr = this.f27282b;
        n.c(vArr);
        return vArr[r10];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> q10 = q();
        int i10 = 0;
        while (q10.hasNext()) {
            i10 += q10.i();
        }
        return i10;
    }

    public final Map<K, V> i() {
        j();
        this.f27292l = true;
        return this;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void j() {
        if (this.f27292l) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return w();
    }

    public final boolean l(Collection<?> m7) {
        n.f(m7, "m");
        for (Object obj : m7) {
            if (obj != null) {
                try {
                    if (!m((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean m(Map.Entry<? extends K, ? extends V> entry) {
        n.f(entry, "entry");
        int r10 = r(entry.getKey());
        if (r10 < 0) {
            return false;
        }
        V[] vArr = this.f27282b;
        n.c(vArr);
        return n.a(vArr[r10], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        j();
        int g10 = g(k10);
        V[] h10 = h();
        if (g10 < 0) {
            int i10 = (-g10) - 1;
            V v11 = h10[i10];
            h10[i10] = v10;
            return v11;
        }
        h10[g10] = v10;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        n.f(from, "from");
        j();
        B(from.entrySet());
    }

    public final b<K, V> q() {
        return new b<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int H = H(obj);
        if (H < 0) {
            return null;
        }
        V[] vArr = this.f27282b;
        n.c(vArr);
        V v10 = vArr[H];
        k8.b.c(vArr, H);
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return x();
    }

    public final int t() {
        return this.f27281a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> q10 = q();
        int i10 = 0;
        while (q10.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            q10.h(sb);
            i10++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        n.e(sb2, "sb.toString()");
        return sb2;
    }

    public Set<Map.Entry<K, V>> u() {
        k8.d<K, V> dVar = this.f27291k;
        if (dVar == null) {
            k8.d<K, V> dVar2 = new k8.d<>(this);
            this.f27291k = dVar2;
            return dVar2;
        }
        return dVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return y();
    }

    public Set<K> w() {
        k8.e<K> eVar = this.f27289i;
        if (eVar == null) {
            k8.e<K> eVar2 = new k8.e<>(this);
            this.f27289i = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public int x() {
        return this.f27288h;
    }

    public Collection<V> y() {
        k8.f<V> fVar = this.f27290j;
        if (fVar == null) {
            k8.f<V> fVar2 = new k8.f<>(this);
            this.f27290j = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public c() {
        this(8);
    }

    public c(int i10) {
        this(k8.b.a(i10), null, new int[i10], new int[f27280m.c(i10)], 2, 0);
    }
}
