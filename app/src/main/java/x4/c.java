package x4;

import a5.p0;
import android.os.SystemClock;
import e4.k0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import n3.m1;
/* compiled from: BaseTrackSelection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c implements s {

    /* renamed from: a  reason: collision with root package name */
    protected final k0 f32582a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f32583b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f32584c;

    /* renamed from: d  reason: collision with root package name */
    private final int f32585d;

    /* renamed from: e  reason: collision with root package name */
    private final m1[] f32586e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f32587f;

    /* renamed from: g  reason: collision with root package name */
    private int f32588g;

    public c(k0 k0Var, int... iArr) {
        this(k0Var, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int w(m1 m1Var, m1 m1Var2) {
        return m1Var2.f28181h - m1Var.f28181h;
    }

    @Override // x4.v
    public final int b(m1 m1Var) {
        for (int i10 = 0; i10 < this.f32583b; i10++) {
            if (this.f32586e[i10] == m1Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // x4.s
    public boolean c(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean d10 = d(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f32583b && !d10) {
            d10 = (i11 == i10 || d(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (d10) {
            long[] jArr = this.f32587f;
            jArr[i10] = Math.max(jArr[i10], p0.b(elapsedRealtime, j10, Long.MAX_VALUE));
            return true;
        }
        return false;
    }

    @Override // x4.s
    public boolean d(int i10, long j10) {
        return this.f32587f[i10] > j10;
    }

    @Override // x4.s
    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f32582a == cVar.f32582a && Arrays.equals(this.f32584c, cVar.f32584c);
    }

    @Override // x4.v
    public final m1 f(int i10) {
        return this.f32586e[i10];
    }

    @Override // x4.v
    public final int g(int i10) {
        return this.f32584c[i10];
    }

    @Override // x4.s
    public /* synthetic */ boolean h(long j10, g4.f fVar, List list) {
        return r.d(this, j10, fVar, list);
    }

    public int hashCode() {
        if (this.f32588g == 0) {
            this.f32588g = (System.identityHashCode(this.f32582a) * 31) + Arrays.hashCode(this.f32584c);
        }
        return this.f32588g;
    }

    @Override // x4.s
    public void i(float f10) {
    }

    @Override // x4.s
    public /* synthetic */ void k() {
        r.a(this);
    }

    @Override // x4.v
    public final int l(int i10) {
        for (int i11 = 0; i11 < this.f32583b; i11++) {
            if (this.f32584c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // x4.v
    public final int length() {
        return this.f32584c.length;
    }

    @Override // x4.v
    public final k0 n() {
        return this.f32582a;
    }

    @Override // x4.s
    public /* synthetic */ void o(boolean z10) {
        r.b(this, z10);
    }

    @Override // x4.s
    public void p() {
    }

    @Override // x4.s
    public int q(long j10, List<? extends g4.n> list) {
        return list.size();
    }

    @Override // x4.s
    public final int r() {
        return this.f32584c[a()];
    }

    @Override // x4.s
    public final m1 s() {
        return this.f32586e[a()];
    }

    @Override // x4.s
    public /* synthetic */ void u() {
        r.c(this);
    }

    public c(k0 k0Var, int[] iArr, int i10) {
        int i11 = 0;
        a5.a.f(iArr.length > 0);
        this.f32585d = i10;
        this.f32582a = (k0) a5.a.e(k0Var);
        int length = iArr.length;
        this.f32583b = length;
        this.f32586e = new m1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f32586e[i12] = k0Var.b(iArr[i12]);
        }
        Arrays.sort(this.f32586e, new Comparator() { // from class: x4.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w10;
                w10 = c.w((m1) obj, (m1) obj2);
                return w10;
            }
        });
        this.f32584c = new int[this.f32583b];
        while (true) {
            int i13 = this.f32583b;
            if (i11 < i13) {
                this.f32584c[i11] = k0Var.c(this.f32586e[i11]);
                i11++;
            } else {
                this.f32587f = new long[i13];
                return;
            }
        }
    }
}
