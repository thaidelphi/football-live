package i9;

import i9.r0;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: ThreadSafeHeap.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class q0<T extends r0 & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f26690b = AtomicIntegerFieldUpdater.newUpdater(q0.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    private T[] f26691a;

    private final T[] f() {
        T[] tArr = this.f26691a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new r0[4];
            this.f26691a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            kotlin.jvm.internal.n.e(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((r0[]) copyOf);
            this.f26691a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void j(int i10) {
        f26690b.set(this, i10);
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f26691a;
            kotlin.jvm.internal.n.c(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                kotlin.jvm.internal.n.c(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.n.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            kotlin.jvm.internal.n.c(t12);
            T t13 = tArr[i11];
            kotlin.jvm.internal.n.c(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f26691a;
            kotlin.jvm.internal.n.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            kotlin.jvm.internal.n.c(t10);
            T t11 = tArr[i10];
            kotlin.jvm.internal.n.c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f26691a;
        kotlin.jvm.internal.n.c(tArr);
        T t10 = tArr[i11];
        kotlin.jvm.internal.n.c(t10);
        T t11 = tArr[i10];
        kotlin.jvm.internal.n.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.f(i10);
        t11.f(i11);
    }

    public final void a(T t10) {
        if (d9.s0.a()) {
            if (!(t10.b() == null)) {
                throw new AssertionError();
            }
        }
        t10.c(this);
        T[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.f(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f26691a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f26690b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            z10 = true;
            if (t10.b() == null) {
                z10 = false;
            } else {
                int g10 = t10.g();
                if (d9.s0.a()) {
                    if (!(g10 >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(g10);
            }
        }
        return z10;
    }

    public final T h(int i10) {
        if (d9.s0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f26691a;
        kotlin.jvm.internal.n.c(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                kotlin.jvm.internal.n.c(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.n.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        kotlin.jvm.internal.n.c(t12);
        if (d9.s0.a()) {
            if (!(t12.b() == this)) {
                throw new AssertionError();
            }
        }
        t12.c(null);
        t12.f(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T h10;
        synchronized (this) {
            h10 = c() > 0 ? h(0) : null;
        }
        return h10;
    }
}
