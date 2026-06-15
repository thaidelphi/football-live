package e4;

import android.net.Uri;
import n3.l3;
import n3.u1;
/* compiled from: SinglePeriodTimeline.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h0 extends l3 {

    /* renamed from: p  reason: collision with root package name */
    private static final Object f25050p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static final u1 f25051q = new u1.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* renamed from: c  reason: collision with root package name */
    private final long f25052c;

    /* renamed from: d  reason: collision with root package name */
    private final long f25053d;

    /* renamed from: e  reason: collision with root package name */
    private final long f25054e;

    /* renamed from: f  reason: collision with root package name */
    private final long f25055f;

    /* renamed from: g  reason: collision with root package name */
    private final long f25056g;

    /* renamed from: h  reason: collision with root package name */
    private final long f25057h;

    /* renamed from: i  reason: collision with root package name */
    private final long f25058i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f25059j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f25060k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f25061l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f25062m;

    /* renamed from: n  reason: collision with root package name */
    private final u1 f25063n;

    /* renamed from: o  reason: collision with root package name */
    private final u1.g f25064o;

    public h0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, u1Var, z12 ? u1Var.f28375d : null);
    }

    @Override // n3.l3
    public int f(Object obj) {
        return f25050p.equals(obj) ? 0 : -1;
    }

    @Override // n3.l3
    public l3.b k(int i10, l3.b bVar, boolean z10) {
        a5.a.c(i10, 0, 1);
        return bVar.v(null, z10 ? f25050p : null, 0, this.f25055f, -this.f25057h);
    }

    @Override // n3.l3
    public int m() {
        return 1;
    }

    @Override // n3.l3
    public Object q(int i10) {
        a5.a.c(i10, 0, 1);
        return f25050p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 > r5) goto L9;
     */
    @Override // n3.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n3.l3.d s(int r25, n3.l3.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            a5.a.c(r3, r1, r2)
            long r1 = r0.f25058i
            boolean r14 = r0.f25060k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f25061l
            if (r5 != 0) goto L2e
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r5 = r0.f25056g
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = n3.l3.d.f28142r
            n3.u1 r5 = r0.f25063n
            java.lang.Object r6 = r0.f25062m
            long r7 = r0.f25052c
            long r9 = r0.f25053d
            long r11 = r0.f25054e
            boolean r13 = r0.f25059j
            n3.u1$g r15 = r0.f25064o
            long r1 = r0.f25056g
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f25057h
            r22 = r1
            r3 = r26
            n3.l3$d r1 = r3.i(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.h0.s(int, n3.l3$d, long):n3.l3$d");
    }

    @Override // n3.l3
    public int t() {
        return 1;
    }

    public h0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, u1 u1Var, u1.g gVar) {
        this.f25052c = j10;
        this.f25053d = j11;
        this.f25054e = j12;
        this.f25055f = j13;
        this.f25056g = j14;
        this.f25057h = j15;
        this.f25058i = j16;
        this.f25059j = z10;
        this.f25060k = z11;
        this.f25061l = z12;
        this.f25062m = obj;
        this.f25063n = (u1) a5.a.e(u1Var);
        this.f25064o = gVar;
    }
}
