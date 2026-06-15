package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.cc;
/* compiled from: SparseArrayCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f1966e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f1967a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f1968b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f1969c;

    /* renamed from: d  reason: collision with root package name */
    private int f1970d;

    public i() {
        this(10);
    }

    private void f() {
        int i10 = this.f1970d;
        int[] iArr = this.f1968b;
        Object[] objArr = this.f1969c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1966e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1967a = false;
        this.f1970d = i11;
    }

    public void c(int i10, E e8) {
        int i11 = this.f1970d;
        if (i11 != 0 && i10 <= this.f1968b[i11 - 1]) {
            k(i10, e8);
            return;
        }
        if (this.f1967a && i11 >= this.f1968b.length) {
            f();
        }
        int i12 = this.f1970d;
        if (i12 >= this.f1968b.length) {
            int e10 = d.e(i12 + 1);
            int[] iArr = new int[e10];
            Object[] objArr = new Object[e10];
            int[] iArr2 = this.f1968b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1969c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1968b = iArr;
            this.f1969c = objArr;
        }
        this.f1968b[i12] = i10;
        this.f1969c[i12] = e8;
        this.f1970d = i12 + 1;
    }

    public void d() {
        int i10 = this.f1970d;
        Object[] objArr = this.f1969c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1970d = 0;
        this.f1967a = false;
    }

    /* renamed from: e */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f1968b = (int[]) this.f1968b.clone();
            iVar.f1969c = (Object[]) this.f1969c.clone();
            return iVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public E g(int i10) {
        return h(i10, null);
    }

    public E h(int i10, E e8) {
        int a10 = d.a(this.f1968b, this.f1970d, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f1969c;
            if (objArr[a10] != f1966e) {
                return (E) objArr[a10];
            }
        }
        return e8;
    }

    public int i(E e8) {
        if (this.f1967a) {
            f();
        }
        for (int i10 = 0; i10 < this.f1970d; i10++) {
            if (this.f1969c[i10] == e8) {
                return i10;
            }
        }
        return -1;
    }

    public int j(int i10) {
        if (this.f1967a) {
            f();
        }
        return this.f1968b[i10];
    }

    public void k(int i10, E e8) {
        int a10 = d.a(this.f1968b, this.f1970d, i10);
        if (a10 >= 0) {
            this.f1969c[a10] = e8;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f1970d;
        if (i11 < i12) {
            Object[] objArr = this.f1969c;
            if (objArr[i11] == f1966e) {
                this.f1968b[i11] = i10;
                objArr[i11] = e8;
                return;
            }
        }
        if (this.f1967a && i12 >= this.f1968b.length) {
            f();
            i11 = ~d.a(this.f1968b, this.f1970d, i10);
        }
        int i13 = this.f1970d;
        if (i13 >= this.f1968b.length) {
            int e10 = d.e(i13 + 1);
            int[] iArr = new int[e10];
            Object[] objArr2 = new Object[e10];
            int[] iArr2 = this.f1968b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1969c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1968b = iArr;
            this.f1969c = objArr2;
        }
        int i14 = this.f1970d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f1968b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f1969c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f1970d - i11);
        }
        this.f1968b[i11] = i10;
        this.f1969c[i11] = e8;
        this.f1970d++;
    }

    public int l() {
        if (this.f1967a) {
            f();
        }
        return this.f1970d;
    }

    public E m(int i10) {
        if (this.f1967a) {
            f();
        }
        return (E) this.f1969c[i10];
    }

    public String toString() {
        if (l() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f1970d * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f1970d; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(j(i10));
            sb.append(cc.T);
            E m7 = m(i10);
            if (m7 != this) {
                sb.append(m7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public i(int i10) {
        this.f1967a = false;
        if (i10 == 0) {
            this.f1968b = d.f1936a;
            this.f1969c = d.f1938c;
            return;
        }
        int e8 = d.e(i10);
        this.f1968b = new int[e8];
        this.f1969c = new Object[e8];
    }
}
