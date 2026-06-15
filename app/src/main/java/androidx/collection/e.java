package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.cc;
/* compiled from: LongSparseArray.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f1939e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f1940a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f1941b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f1942c;

    /* renamed from: d  reason: collision with root package name */
    private int f1943d;

    public e() {
        this(10);
    }

    private void f() {
        int i10 = this.f1943d;
        long[] jArr = this.f1941b;
        Object[] objArr = this.f1942c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1939e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1940a = false;
        this.f1943d = i11;
    }

    public void c(long j10, E e8) {
        int i10 = this.f1943d;
        if (i10 != 0 && j10 <= this.f1941b[i10 - 1]) {
            k(j10, e8);
            return;
        }
        if (this.f1940a && i10 >= this.f1941b.length) {
            f();
        }
        int i11 = this.f1943d;
        if (i11 >= this.f1941b.length) {
            int f10 = d.f(i11 + 1);
            long[] jArr = new long[f10];
            Object[] objArr = new Object[f10];
            long[] jArr2 = this.f1941b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1942c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1941b = jArr;
            this.f1942c = objArr;
        }
        this.f1941b[i11] = j10;
        this.f1942c[i11] = e8;
        this.f1943d = i11 + 1;
    }

    public void d() {
        int i10 = this.f1943d;
        Object[] objArr = this.f1942c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1943d = 0;
        this.f1940a = false;
    }

    /* renamed from: e */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f1941b = (long[]) this.f1941b.clone();
            eVar.f1942c = (Object[]) this.f1942c.clone();
            return eVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public E g(long j10) {
        return h(j10, null);
    }

    public E h(long j10, E e8) {
        int b10 = d.b(this.f1941b, this.f1943d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f1942c;
            if (objArr[b10] != f1939e) {
                return (E) objArr[b10];
            }
        }
        return e8;
    }

    public int i(long j10) {
        if (this.f1940a) {
            f();
        }
        return d.b(this.f1941b, this.f1943d, j10);
    }

    public long j(int i10) {
        if (this.f1940a) {
            f();
        }
        return this.f1941b[i10];
    }

    public void k(long j10, E e8) {
        int b10 = d.b(this.f1941b, this.f1943d, j10);
        if (b10 >= 0) {
            this.f1942c[b10] = e8;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f1943d;
        if (i10 < i11) {
            Object[] objArr = this.f1942c;
            if (objArr[i10] == f1939e) {
                this.f1941b[i10] = j10;
                objArr[i10] = e8;
                return;
            }
        }
        if (this.f1940a && i11 >= this.f1941b.length) {
            f();
            i10 = ~d.b(this.f1941b, this.f1943d, j10);
        }
        int i12 = this.f1943d;
        if (i12 >= this.f1941b.length) {
            int f10 = d.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f1941b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1942c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1941b = jArr;
            this.f1942c = objArr2;
        }
        int i13 = this.f1943d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f1941b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f1942c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f1943d - i10);
        }
        this.f1941b[i10] = j10;
        this.f1942c[i10] = e8;
        this.f1943d++;
    }

    public void l(long j10) {
        int b10 = d.b(this.f1941b, this.f1943d, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f1942c;
            Object obj = objArr[b10];
            Object obj2 = f1939e;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f1940a = true;
            }
        }
    }

    public void m(int i10) {
        Object[] objArr = this.f1942c;
        Object obj = objArr[i10];
        Object obj2 = f1939e;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f1940a = true;
        }
    }

    public int n() {
        if (this.f1940a) {
            f();
        }
        return this.f1943d;
    }

    public E o(int i10) {
        if (this.f1940a) {
            f();
        }
        return (E) this.f1942c[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1943d * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1943d; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(j(i10));
            sb.append(cc.T);
            E o10 = o(i10);
            if (o10 != this) {
                sb.append(o10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public e(int i10) {
        this.f1940a = false;
        if (i10 == 0) {
            this.f1941b = d.f1937b;
            this.f1942c = d.f1938c;
            return;
        }
        int f10 = d.f(i10);
        this.f1941b = new long[f10];
        this.f1942c = new Object[f10];
    }
}
