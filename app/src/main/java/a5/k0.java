package a5;

import java.util.Arrays;
/* compiled from: TimedValueQueue.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k0<V> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f455a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f456b;

    /* renamed from: c  reason: collision with root package name */
    private int f457c;

    /* renamed from: d  reason: collision with root package name */
    private int f458d;

    public k0() {
        this(10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f457c;
        int i11 = this.f458d;
        V[] vArr = this.f456b;
        int length = (i10 + i11) % vArr.length;
        this.f455a[length] = j10;
        vArr[length] = v10;
        this.f458d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f458d;
        if (i10 > 0) {
            if (j10 <= this.f455a[((this.f457c + i10) - 1) % this.f456b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f456b.length;
        if (this.f458d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f457c;
        int i12 = length - i11;
        System.arraycopy(this.f455a, i11, jArr, 0, i12);
        System.arraycopy(this.f456b, this.f457c, vArr, 0, i12);
        int i13 = this.f457c;
        if (i13 > 0) {
            System.arraycopy(this.f455a, 0, jArr, i12, i13);
            System.arraycopy(this.f456b, 0, vArr, i12, this.f457c);
        }
        this.f455a = jArr;
        this.f456b = vArr;
        this.f457c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V h(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f458d > 0) {
            long j12 = j10 - this.f455a[this.f457c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = k();
            j11 = j12;
        }
        return v10;
    }

    private V k() {
        a.f(this.f458d > 0);
        V[] vArr = this.f456b;
        int i10 = this.f457c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f457c = (i10 + 1) % vArr.length;
        this.f458d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f457c = 0;
        this.f458d = 0;
        Arrays.fill(this.f456b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f458d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f458d;
    }

    public k0(int i10) {
        this.f455a = new long[i10];
        this.f456b = (V[]) f(i10);
    }
}
