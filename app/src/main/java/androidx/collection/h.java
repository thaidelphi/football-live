package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.cc;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: SimpleArrayMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h<K, V> {

    /* renamed from: d  reason: collision with root package name */
    static Object[] f1959d;

    /* renamed from: e  reason: collision with root package name */
    static int f1960e;

    /* renamed from: f  reason: collision with root package name */
    static Object[] f1961f;

    /* renamed from: g  reason: collision with root package name */
    static int f1962g;

    /* renamed from: a  reason: collision with root package name */
    int[] f1963a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f1964b;

    /* renamed from: c  reason: collision with root package name */
    int f1965c;

    public h() {
        this.f1963a = d.f1936a;
        this.f1964b = d.f1938c;
        this.f1965c = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (h.class) {
                Object[] objArr = f1961f;
                if (objArr != null) {
                    this.f1964b = objArr;
                    f1961f = (Object[]) objArr[0];
                    this.f1963a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1962g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f1959d;
                if (objArr2 != null) {
                    this.f1964b = objArr2;
                    f1959d = (Object[]) objArr2[0];
                    this.f1963a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1960e--;
                    return;
                }
            }
        }
        this.f1963a = new int[i10];
        this.f1964b = new Object[i10 << 1];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return d.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f1962g < 10) {
                    objArr[0] = f1961f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1961f = objArr;
                    f1962g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f1960e < 10) {
                    objArr[0] = f1959d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1959d = objArr;
                    f1960e++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f1965c;
        int[] iArr = this.f1963a;
        if (iArr.length < i10) {
            Object[] objArr = this.f1964b;
            a(i10);
            if (this.f1965c > 0) {
                System.arraycopy(iArr, 0, this.f1963a, 0, i11);
                System.arraycopy(objArr, 0, this.f1964b, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f1965c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f1965c;
        if (i10 > 0) {
            int[] iArr = this.f1963a;
            Object[] objArr = this.f1964b;
            this.f1963a = d.f1936a;
            this.f1964b = d.f1938c;
            this.f1965c = 0;
            d(iArr, objArr, i10);
        }
        if (this.f1965c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i10) {
        int i11 = this.f1965c;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b(this.f1963a, i11, i10);
        if (b10 >= 0 && !obj.equals(this.f1964b[b10 << 1])) {
            int i12 = b10 + 1;
            while (i12 < i11 && this.f1963a[i12] == i10) {
                if (obj.equals(this.f1964b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = b10 - 1; i13 >= 0 && this.f1963a[i13] == i10; i13--) {
                if (obj.equals(this.f1964b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return b10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1965c; i10++) {
                try {
                    K i11 = i(i10);
                    V m7 = m(i10);
                    Object obj2 = hVar.get(i11);
                    if (m7 == null) {
                        if (obj2 != null || !hVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!m7.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i12 = 0; i12 < this.f1965c; i12++) {
                try {
                    K i13 = i(i12);
                    V m10 = m(i12);
                    Object obj3 = map.get(i13);
                    if (m10 == null) {
                        if (obj3 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!m10.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i10 = this.f1965c;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b(this.f1963a, i10, 0);
        if (b10 >= 0 && this.f1964b[b10 << 1] != null) {
            int i11 = b10 + 1;
            while (i11 < i10 && this.f1963a[i11] == 0) {
                if (this.f1964b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = b10 - 1; i12 >= 0 && this.f1963a[i12] == 0; i12--) {
                if (this.f1964b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return b10;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        return f10 >= 0 ? (V) this.f1964b[(f10 << 1) + 1] : v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i10 = this.f1965c * 2;
        Object[] objArr = this.f1964b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f1963a;
        Object[] objArr = this.f1964b;
        int i10 = this.f1965c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public K i(int i10) {
        return (K) this.f1964b[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f1965c <= 0;
    }

    public void j(h<? extends K, ? extends V> hVar) {
        int i10 = hVar.f1965c;
        c(this.f1965c + i10);
        if (this.f1965c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(hVar.i(i11), hVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(hVar.f1963a, 0, this.f1963a, 0, i10);
            System.arraycopy(hVar.f1964b, 0, this.f1964b, 0, i10 << 1);
            this.f1965c = i10;
        }
    }

    public V k(int i10) {
        Object[] objArr = this.f1964b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f1965c;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f1963a, objArr, i12);
            this.f1963a = d.f1936a;
            this.f1964b = d.f1938c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f1963a;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f1965c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1963a, 0, i10);
                    System.arraycopy(objArr, 0, this.f1964b, 0, i11);
                }
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, this.f1963a, i10, i16);
                    System.arraycopy(objArr, i15 << 1, this.f1964b, i11, i16 << 1);
                }
            } else {
                if (i10 < i14) {
                    int i17 = i10 + 1;
                    int i18 = i14 - i10;
                    System.arraycopy(iArr, i17, iArr, i10, i18);
                    Object[] objArr2 = this.f1964b;
                    System.arraycopy(objArr2, i17 << 1, objArr2, i11, i18 << 1);
                }
                Object[] objArr3 = this.f1964b;
                int i19 = i14 << 1;
                objArr3[i19] = null;
                objArr3[i19 + 1] = null;
            }
            i13 = i14;
        }
        if (i12 == this.f1965c) {
            this.f1965c = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f1964b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V m(int i10) {
        return (V) this.f1964b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int e8;
        int i11 = this.f1965c;
        if (k10 == null) {
            e8 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            e8 = e(k10, hashCode);
        }
        if (e8 >= 0) {
            int i12 = (e8 << 1) + 1;
            Object[] objArr = this.f1964b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~e8;
        int[] iArr = this.f1963a;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f1964b;
            a(i14);
            if (i11 == this.f1965c) {
                int[] iArr2 = this.f1963a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f1964b, 0, objArr2.length);
                }
                d(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f1963a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f1964b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f1965c - i13) << 1);
        }
        int i16 = this.f1965c;
        if (i11 == i16) {
            int[] iArr4 = this.f1963a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f1964b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f1965c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return k(f10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return l(f10, v10);
        }
        return null;
    }

    public int size() {
        return this.f1965c;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1965c * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1965c; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            K i11 = i(i10);
            if (i11 != this) {
                sb.append(i11);
            } else {
                sb.append("(this Map)");
            }
            sb.append(cc.T);
            V m7 = m(i10);
            if (m7 != this) {
                sb.append(m7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 >= 0) {
            V m7 = m(f10);
            if (obj2 == m7 || (obj2 != null && obj2.equals(m7))) {
                k(f10);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 >= 0) {
            V m7 = m(f10);
            if (m7 == v10 || (v10 != null && v10.equals(m7))) {
                l(f10, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f1963a = d.f1936a;
            this.f1964b = d.f1938c;
        } else {
            a(i10);
        }
        this.f1965c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(h<K, V> hVar) {
        this();
        if (hVar != 0) {
            j(hVar);
        }
    }
}
