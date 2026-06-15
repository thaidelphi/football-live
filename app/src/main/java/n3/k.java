package n3;

import com.google.android.gms.ads.AdSize;
import com.ironsource.b9;
/* compiled from: DefaultLoadControl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class k implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final z4.q f28102a;

    /* renamed from: b  reason: collision with root package name */
    private final long f28103b;

    /* renamed from: c  reason: collision with root package name */
    private final long f28104c;

    /* renamed from: d  reason: collision with root package name */
    private final long f28105d;

    /* renamed from: e  reason: collision with root package name */
    private final long f28106e;

    /* renamed from: f  reason: collision with root package name */
    private final int f28107f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f28108g;

    /* renamed from: h  reason: collision with root package name */
    private final long f28109h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f28110i;

    /* renamed from: j  reason: collision with root package name */
    private int f28111j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f28112k;

    public k() {
        this(new z4.q(true, 65536), b9.b.f16554d, b9.b.f16554d, 2500, 5000, -1, false, 0, false);
    }

    private static void i(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        a5.a.b(z10, str + " cannot be less than " + str2);
    }

    private static int k(int i10) {
        switch (i10) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void l(boolean z10) {
        int i10 = this.f28107f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f28111j = i10;
        this.f28112k = false;
        if (z10) {
            this.f28102a.g();
        }
    }

    @Override // n3.s1
    public boolean a() {
        return this.f28110i;
    }

    @Override // n3.s1
    public long b() {
        return this.f28109h;
    }

    @Override // n3.s1
    public boolean c(long j10, float f10, boolean z10, long j11) {
        long d02 = a5.p0.d0(j10, f10);
        long j12 = z10 ? this.f28106e : this.f28105d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || d02 >= j12 || (!this.f28108g && this.f28102a.f() >= this.f28111j);
    }

    @Override // n3.s1
    public z4.b d() {
        return this.f28102a;
    }

    @Override // n3.s1
    public void e() {
        l(true);
    }

    @Override // n3.s1
    public void f(y2[] y2VarArr, e4.m0 m0Var, x4.s[] sVarArr) {
        int i10 = this.f28107f;
        if (i10 == -1) {
            i10 = j(y2VarArr, sVarArr);
        }
        this.f28111j = i10;
        this.f28102a.h(i10);
    }

    @Override // n3.s1
    public void g() {
        l(true);
    }

    @Override // n3.s1
    public boolean h(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f28102a.f() >= this.f28111j;
        long j12 = this.f28103b;
        if (f10 > 1.0f) {
            j12 = Math.min(a5.p0.Y(j12, f10), this.f28104c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f28108g && z11) {
                z10 = false;
            }
            this.f28112k = z10;
            if (!z10 && j11 < 500000) {
                a5.t.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f28104c || z11) {
            this.f28112k = false;
        }
        return this.f28112k;
    }

    protected int j(y2[] y2VarArr, x4.s[] sVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < y2VarArr.length; i11++) {
            if (sVarArr[i11] != null) {
                i10 += k(y2VarArr[i11].f());
            }
        }
        return Math.max(13107200, i10);
    }

    @Override // n3.s1
    public void onPrepared() {
        l(false);
    }

    protected k(z4.q qVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        i(i12, 0, "bufferForPlaybackMs", "0");
        i(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        i(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(i11, i10, "maxBufferMs", "minBufferMs");
        i(i15, 0, "backBufferDurationMs", "0");
        this.f28102a = qVar;
        this.f28103b = a5.p0.C0(i10);
        this.f28104c = a5.p0.C0(i11);
        this.f28105d = a5.p0.C0(i12);
        this.f28106e = a5.p0.C0(i13);
        this.f28107f = i14;
        this.f28111j = i14 == -1 ? 13107200 : i14;
        this.f28108g = z10;
        this.f28109h = a5.p0.C0(i15);
        this.f28110i = z11;
    }
}
