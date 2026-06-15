package u3;

import a5.c0;
import a5.p0;
import c4.b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import n3.m1;
import p3.i0;
import s3.i;
import s3.j;
import s3.k;
import s3.m;
import s3.n;
import s3.o;
import s3.p;
import s3.t;
import u3.f;
/* compiled from: Mp3Extractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e implements i {

    /* renamed from: u  reason: collision with root package name */
    public static final m f31346u = t3.d.f30956a;

    /* renamed from: v  reason: collision with root package name */
    private static final b.a f31347v = new b.a() { // from class: u3.d
        @Override // c4.b.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            boolean m7;
            m7 = e.m(i10, i11, i12, i13, i14);
            return m7;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final int f31348a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31349b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f31350c;

    /* renamed from: d  reason: collision with root package name */
    private final i0.a f31351d;

    /* renamed from: e  reason: collision with root package name */
    private final n f31352e;

    /* renamed from: f  reason: collision with root package name */
    private final o f31353f;

    /* renamed from: g  reason: collision with root package name */
    private final t f31354g;

    /* renamed from: h  reason: collision with root package name */
    private k f31355h;

    /* renamed from: i  reason: collision with root package name */
    private t f31356i;

    /* renamed from: j  reason: collision with root package name */
    private t f31357j;

    /* renamed from: k  reason: collision with root package name */
    private int f31358k;

    /* renamed from: l  reason: collision with root package name */
    private Metadata f31359l;

    /* renamed from: m  reason: collision with root package name */
    private long f31360m;

    /* renamed from: n  reason: collision with root package name */
    private long f31361n;

    /* renamed from: o  reason: collision with root package name */
    private long f31362o;

    /* renamed from: p  reason: collision with root package name */
    private int f31363p;

    /* renamed from: q  reason: collision with root package name */
    private f f31364q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f31365r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f31366s;

    /* renamed from: t  reason: collision with root package name */
    private long f31367t;

    public e() {
        this(0);
    }

    private void f() {
        a5.a.h(this.f31356i);
        p0.j(this.f31355h);
    }

    private f g(j jVar) throws IOException {
        long j10;
        long j11;
        long d10;
        long b10;
        f o10 = o(jVar);
        c n10 = n(this.f31359l, jVar.getPosition());
        if (this.f31365r) {
            return new f.a();
        }
        if ((this.f31348a & 4) != 0) {
            if (n10 != null) {
                d10 = n10.d();
                b10 = n10.b();
            } else if (o10 != null) {
                d10 = o10.d();
                b10 = o10.b();
            } else {
                j10 = j(this.f31359l);
                j11 = -1;
                o10 = new b(j10, jVar.getPosition(), j11);
            }
            j11 = b10;
            j10 = d10;
            o10 = new b(j10, jVar.getPosition(), j11);
        } else if (n10 != null) {
            o10 = n10;
        } else if (o10 == null) {
            o10 = null;
        }
        if (o10 == null || !(o10.c() || (this.f31348a & 1) == 0)) {
            return i(jVar, (this.f31348a & 2) != 0);
        }
        return o10;
    }

    private long h(long j10) {
        return this.f31360m + ((j10 * 1000000) / this.f31351d.f29703d);
    }

    private f i(j jVar, boolean z10) throws IOException {
        jVar.n(this.f31350c.d(), 0, 4);
        this.f31350c.K(0);
        this.f31351d.a(this.f31350c.n());
        return new a(jVar.a(), jVar.getPosition(), this.f31351d, z10);
    }

    private static long j(Metadata metadata) {
        if (metadata != null) {
            int e8 = metadata.e();
            for (int i10 = 0; i10 < e8; i10++) {
                Metadata.Entry d10 = metadata.d(i10);
                if (d10 instanceof TextInformationFrame) {
                    TextInformationFrame textInformationFrame = (TextInformationFrame) d10;
                    if (textInformationFrame.f10597a.equals("TLEN")) {
                        return p0.C0(Long.parseLong(textInformationFrame.f10609c));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private static int k(c0 c0Var, int i10) {
        if (c0Var.f() >= i10 + 4) {
            c0Var.K(i10);
            int n10 = c0Var.n();
            if (n10 == 1483304551 || n10 == 1231971951) {
                return n10;
            }
        }
        if (c0Var.f() >= 40) {
            c0Var.K(36);
            return c0Var.n() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private static boolean l(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean m(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c n(Metadata metadata, long j10) {
        if (metadata != null) {
            int e8 = metadata.e();
            for (int i10 = 0; i10 < e8; i10++) {
                Metadata.Entry d10 = metadata.d(i10);
                if (d10 instanceof MlltFrame) {
                    return c.e(j10, (MlltFrame) d10, j(metadata));
                }
            }
            return null;
        }
        return null;
    }

    private f o(j jVar) throws IOException {
        c0 c0Var = new c0(this.f31351d.f29702c);
        jVar.n(c0Var.d(), 0, this.f31351d.f29702c);
        i0.a aVar = this.f31351d;
        int i10 = 21;
        if ((aVar.f29700a & 1) != 0) {
            if (aVar.f29704e != 1) {
                i10 = 36;
            }
        } else if (aVar.f29704e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int k10 = k(c0Var, i11);
        if (k10 != 1483304551 && k10 != 1231971951) {
            if (k10 == 1447187017) {
                g e8 = g.e(jVar.a(), jVar.getPosition(), this.f31351d, c0Var);
                jVar.j(this.f31351d.f29702c);
                return e8;
            }
            jVar.e();
            return null;
        }
        h e10 = h.e(jVar.a(), jVar.getPosition(), this.f31351d, c0Var);
        if (e10 != null && !this.f31352e.a()) {
            jVar.e();
            jVar.h(i11 + 141);
            jVar.n(this.f31350c.d(), 0, 3);
            this.f31350c.K(0);
            this.f31352e.d(this.f31350c.C());
        }
        jVar.j(this.f31351d.f29702c);
        return (e10 == null || e10.c() || k10 != 1231971951) ? e10 : i(jVar, false);
    }

    private boolean p(j jVar) throws IOException {
        f fVar = this.f31364q;
        if (fVar != null) {
            long b10 = fVar.b();
            if (b10 != -1 && jVar.g() > b10 - 4) {
                return true;
            }
        }
        try {
            return !jVar.c(this.f31350c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int q(j jVar) throws IOException {
        if (this.f31358k == 0) {
            try {
                s(jVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f31364q == null) {
            f g10 = g(jVar);
            this.f31364q = g10;
            this.f31355h.o(g10);
            this.f31357j.a(new m1.b().e0(this.f31351d.f29701b).W(CodedOutputStream.DEFAULT_BUFFER_SIZE).H(this.f31351d.f29704e).f0(this.f31351d.f29703d).N(this.f31352e.f30716a).O(this.f31352e.f30717b).X((this.f31348a & 8) != 0 ? null : this.f31359l).E());
            this.f31362o = jVar.getPosition();
        } else if (this.f31362o != 0) {
            long position = jVar.getPosition();
            long j10 = this.f31362o;
            if (position < j10) {
                jVar.j((int) (j10 - position));
            }
        }
        return r(jVar);
    }

    private int r(j jVar) throws IOException {
        i0.a aVar;
        if (this.f31363p == 0) {
            jVar.e();
            if (p(jVar)) {
                return -1;
            }
            this.f31350c.K(0);
            int n10 = this.f31350c.n();
            if (l(n10, this.f31358k) && i0.j(n10) != -1) {
                this.f31351d.a(n10);
                if (this.f31360m == -9223372036854775807L) {
                    this.f31360m = this.f31364q.a(jVar.getPosition());
                    if (this.f31349b != -9223372036854775807L) {
                        this.f31360m += this.f31349b - this.f31364q.a(0L);
                    }
                }
                this.f31363p = this.f31351d.f29702c;
                f fVar = this.f31364q;
                if (fVar instanceof b) {
                    b bVar = (b) fVar;
                    bVar.f(h(this.f31361n + aVar.f29706g), jVar.getPosition() + this.f31351d.f29702c);
                    if (this.f31366s && bVar.e(this.f31367t)) {
                        this.f31366s = false;
                        this.f31357j = this.f31356i;
                    }
                }
            } else {
                jVar.j(1);
                this.f31358k = 0;
                return 0;
            }
        }
        int b10 = this.f31357j.b(jVar, this.f31363p, true);
        if (b10 == -1) {
            return -1;
        }
        int i10 = this.f31363p - b10;
        this.f31363p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f31357j.e(h(this.f31361n), 1, this.f31351d.f29702c, 0, null);
        this.f31361n += this.f31351d.f29706g;
        this.f31363p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r13 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        r12.j(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        r12.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
        r11.f31358k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean s(s3.j r12, boolean r13) throws java.io.IOException {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.e()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L42
            int r1 = r11.f31348a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 == 0) goto L25
            r1 = r2
            goto L27
        L25:
            c4.b$a r1 = u3.e.f31347v
        L27:
            s3.o r5 = r11.f31353f
            com.google.android.exoplayer2.metadata.Metadata r1 = r5.a(r12, r1)
            r11.f31359l = r1
            if (r1 == 0) goto L36
            s3.n r5 = r11.f31352e
            r5.c(r1)
        L36:
            long r5 = r12.g()
            int r1 = (int) r5
            if (r13 != 0) goto L40
            r12.j(r1)
        L40:
            r5 = r4
            goto L44
        L42:
            r1 = r4
            r5 = r1
        L44:
            r6 = r5
            r7 = r6
        L46:
            boolean r8 = r11.p(r12)
            if (r8 == 0) goto L55
            if (r6 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            a5.c0 r8 = r11.f31350c
            r8.K(r4)
            a5.c0 r8 = r11.f31350c
            int r8 = r8.n()
            if (r5 == 0) goto L69
            long r9 = (long) r5
            boolean r9 = l(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = p3.i0.j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L77
            return r4
        L77:
            java.lang.String r12 = "Searched too many bytes."
            n3.h2 r12 = n3.h2.a(r12, r2)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.e()
            int r6 = r1 + r5
            r12.h(r6)
            goto L8c
        L89:
            r12.j(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L46
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            p3.i0$a r5 = r11.f31351d
            r5.a(r8)
            r5 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r6 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r1 = r1 + r7
            r12.j(r1)
            goto La8
        La5:
            r12.e()
        La8:
            r11.f31358k = r5
            return r3
        Lab:
            int r9 = r9 + (-4)
            r12.h(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.s(s3.j, boolean):boolean");
    }

    @Override // s3.i
    public int a(j jVar, p pVar) throws IOException {
        f();
        int q10 = q(jVar);
        if (q10 == -1 && (this.f31364q instanceof b)) {
            long h10 = h(this.f31361n);
            if (this.f31364q.d() != h10) {
                ((b) this.f31364q).g(h10);
                this.f31355h.o(this.f31364q);
            }
        }
        return q10;
    }

    @Override // s3.i
    public void b(k kVar) {
        this.f31355h = kVar;
        t f10 = kVar.f(0, 1);
        this.f31356i = f10;
        this.f31357j = f10;
        this.f31355h.q();
    }

    @Override // s3.i
    public boolean c(j jVar) throws IOException {
        return s(jVar, true);
    }

    @Override // s3.i
    public void d(long j10, long j11) {
        this.f31358k = 0;
        this.f31360m = -9223372036854775807L;
        this.f31361n = 0L;
        this.f31363p = 0;
        this.f31367t = j11;
        f fVar = this.f31364q;
        if (!(fVar instanceof b) || ((b) fVar).e(j11)) {
            return;
        }
        this.f31366s = true;
        this.f31357j = this.f31354g;
    }

    @Override // s3.i
    public void release() {
    }

    public e(int i10) {
        this(i10, -9223372036854775807L);
    }

    public e(int i10, long j10) {
        this.f31348a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f31349b = j10;
        this.f31350c = new c0(10);
        this.f31351d = new i0.a();
        this.f31352e = new n();
        this.f31360m = -9223372036854775807L;
        this.f31353f = new o();
        s3.h hVar = new s3.h();
        this.f31354g = hVar;
        this.f31357j = hVar;
    }
}
