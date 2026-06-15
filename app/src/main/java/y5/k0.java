package y5;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import y5.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k0<K, V> extends r<K, V> {

    /* renamed from: h  reason: collision with root package name */
    static final r<Object, Object> f33220h = new k0(null, new Object[0], 0);

    /* renamed from: e  reason: collision with root package name */
    private final transient Object f33221e;

    /* renamed from: f  reason: collision with root package name */
    final transient Object[] f33222f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f33223g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegularImmutableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a<K, V> extends s<Map.Entry<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private final transient r<K, V> f33224c;

        /* renamed from: d  reason: collision with root package name */
        private final transient Object[] f33225d;

        /* renamed from: e  reason: collision with root package name */
        private final transient int f33226e;

        /* renamed from: f  reason: collision with root package name */
        private final transient int f33227f;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: y5.k0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class C0389a extends q<Map.Entry<K, V>> {
            C0389a() {
            }

            @Override // y5.o
            public boolean f() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f33227f;
            }

            @Override // java.util.List
            /* renamed from: w */
            public Map.Entry<K, V> get(int i10) {
                x5.g.g(i10, a.this.f33227f);
                int i11 = i10 * 2;
                Object obj = a.this.f33225d[a.this.f33226e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f33225d[i11 + (a.this.f33226e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        }

        a(r<K, V> rVar, Object[] objArr, int i10, int i11) {
            this.f33224c = rVar;
            this.f33225d = objArr;
            this.f33226e = i10;
            this.f33227f = i11;
        }

        @Override // y5.o
        int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // y5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f33224c.get(key));
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // y5.o
        public boolean f() {
            return true;
        }

        @Override // y5.s, y5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public s0<Map.Entry<K, V>> iterator() {
            return a().iterator();
        }

        @Override // y5.s
        q<Map.Entry<K, V>> l() {
            return new C0389a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33227f;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b<K> extends s<K> {

        /* renamed from: c  reason: collision with root package name */
        private final transient r<K, ?> f33229c;

        /* renamed from: d  reason: collision with root package name */
        private final transient q<K> f33230d;

        b(r<K, ?> rVar, q<K> qVar) {
            this.f33229c = rVar;
            this.f33230d = qVar;
        }

        @Override // y5.s, y5.o
        public q<K> a() {
            return this.f33230d;
        }

        @Override // y5.o
        int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // y5.o, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f33229c.get(obj) != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // y5.o
        public boolean f() {
            return true;
        }

        @Override // y5.s, y5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public s0<K> iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f33229c.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class c extends q<Object> {

        /* renamed from: c  reason: collision with root package name */
        private final transient Object[] f33231c;

        /* renamed from: d  reason: collision with root package name */
        private final transient int f33232d;

        /* renamed from: e  reason: collision with root package name */
        private final transient int f33233e;

        c(Object[] objArr, int i10, int i11) {
            this.f33231c = objArr;
            this.f33232d = i10;
            this.f33233e = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // y5.o
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            x5.g.g(i10, this.f33233e);
            Object obj = this.f33231c[(i10 * 2) + this.f33232d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f33233e;
        }
    }

    private k0(Object obj, Object[] objArr, int i10) {
        this.f33221e = obj;
        this.f33222f = objArr;
        this.f33223g = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> k0<K, V> l(int i10, Object[] objArr, r.a<K, V> aVar) {
        if (i10 == 0) {
            return (k0) f33220h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return new k0<>(null, objArr, 1);
        }
        x5.g.k(i10, objArr.length >> 1);
        Object m7 = m(objArr, i10, s.h(i10), 0);
        if (m7 instanceof Object[]) {
            Object[] objArr2 = (Object[]) m7;
            r.a.C0391a c0391a = (r.a.C0391a) objArr2[2];
            if (aVar != null) {
                aVar.f33267e = c0391a;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                m7 = obj3;
                i10 = intValue;
            } else {
                throw c0391a.a();
            }
        }
        return new k0<>(m7, objArr, i10);
    }

    private static Object m(Object[] objArr, int i10, int i11, int i12) {
        r.a.C0391a c0391a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                h.a(obj3, obj4);
                int a10 = n.a(obj3.hashCode());
                while (true) {
                    int i19 = a10 & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else if (obj3.equals(objArr[i20])) {
                        int i21 = i20 ^ 1;
                        Object obj5 = objArr[i21];
                        Objects.requireNonNull(obj5);
                        c0391a = new r.a.C0391a(obj3, obj4, obj5);
                        objArr[i21] = obj4;
                        break;
                    } else {
                        a10 = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c0391a};
        } else if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                h.a(obj6, obj7);
                int a11 = n.a(obj6.hashCode());
                while (true) {
                    int i26 = a11 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else if (obj6.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj8 = objArr[i28];
                        Objects.requireNonNull(obj8);
                        c0391a = new r.a.C0391a(obj6, obj7, obj8);
                        objArr[i28] = obj7;
                        break;
                    } else {
                        a11 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c0391a};
        } else {
            int[] iArr = new int[i11];
            Arrays.fill(iArr, -1);
            int i29 = 0;
            int i30 = 0;
            while (i29 < i10) {
                int i31 = (i29 * 2) + i12;
                int i32 = (i30 * 2) + i12;
                Object obj9 = objArr[i31];
                Objects.requireNonNull(obj9);
                Object obj10 = objArr[i31 ^ 1];
                Objects.requireNonNull(obj10);
                h.a(obj9, obj10);
                int a12 = n.a(obj9.hashCode());
                while (true) {
                    int i33 = a12 & i13;
                    int i34 = iArr[i33];
                    if (i34 == i14) {
                        iArr[i33] = i32;
                        if (i30 < i29) {
                            objArr[i32] = obj9;
                            objArr[i32 ^ 1] = obj10;
                        }
                        i30++;
                    } else if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c0391a = new r.a.C0391a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    } else {
                        a12 = i33 + 1;
                        i14 = -1;
                    }
                }
                i29++;
                i14 = -1;
            }
            return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c0391a};
        }
    }

    static Object n(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj2)) {
                Object obj4 = objArr[i11 ^ 1];
                Objects.requireNonNull(obj4);
                return obj4;
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a10 = n.a(obj2.hashCode());
                while (true) {
                    int i12 = a10 & length;
                    int i13 = bArr[i12] & 255;
                    if (i13 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i13])) {
                        return objArr[i13 ^ 1];
                    }
                    a10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a11 = n.a(obj2.hashCode());
                while (true) {
                    int i14 = a11 & length2;
                    int i15 = sArr[i14] & 65535;
                    if (i15 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    a11 = i14 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a12 = n.a(obj2.hashCode());
                while (true) {
                    int i16 = a12 & length3;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i17])) {
                        return objArr[i17 ^ 1];
                    }
                    a12 = i16 + 1;
                }
            }
        }
    }

    @Override // y5.r
    s<Map.Entry<K, V>> d() {
        return new a(this, this.f33222f, 0, this.f33223g);
    }

    @Override // y5.r
    s<K> e() {
        return new b(this, new c(this.f33222f, 0, this.f33223g));
    }

    @Override // y5.r
    o<V> f() {
        return new c(this.f33222f, 1, this.f33223g);
    }

    @Override // y5.r, java.util.Map
    public V get(Object obj) {
        V v10 = (V) n(this.f33221e, this.f33222f, this.f33223g, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // y5.r
    boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f33223g;
    }
}
