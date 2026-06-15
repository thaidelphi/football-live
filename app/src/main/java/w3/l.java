package w3;

import a5.p0;
import java.util.Arrays;
import java.util.Collections;
import n3.m1;
import w3.a0;
/* compiled from: H263Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l implements j {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f32101l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final c0 f32102a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.c0 f32103b;

    /* renamed from: e  reason: collision with root package name */
    private final r f32106e;

    /* renamed from: f  reason: collision with root package name */
    private b f32107f;

    /* renamed from: g  reason: collision with root package name */
    private long f32108g;

    /* renamed from: h  reason: collision with root package name */
    private String f32109h;

    /* renamed from: i  reason: collision with root package name */
    private s3.t f32110i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f32111j;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f32104c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f32105d = new a(128);

    /* renamed from: k  reason: collision with root package name */
    private long f32112k = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H263Reader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f32113f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f32114a;

        /* renamed from: b  reason: collision with root package name */
        private int f32115b;

        /* renamed from: c  reason: collision with root package name */
        public int f32116c;

        /* renamed from: d  reason: collision with root package name */
        public int f32117d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f32118e;

        public a(int i10) {
            this.f32118e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f32114a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f32118e;
                int length = bArr2.length;
                int i13 = this.f32116c;
                if (length < i13 + i12) {
                    this.f32118e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f32118e, this.f32116c, i12);
                this.f32116c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f32115b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f32116c -= i11;
                                this.f32114a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            a5.t.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f32117d = this.f32116c;
                            this.f32115b = 4;
                        }
                    } else if (i10 > 31) {
                        a5.t.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f32115b = 3;
                    }
                } else if (i10 != 181) {
                    a5.t.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f32115b = 2;
                }
            } else if (i10 == 176) {
                this.f32115b = 1;
                this.f32114a = true;
            }
            byte[] bArr = f32113f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f32114a = false;
            this.f32116c = 0;
            this.f32115b = 0;
        }
    }

    /* compiled from: H263Reader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final s3.t f32119a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f32120b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32121c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f32122d;

        /* renamed from: e  reason: collision with root package name */
        private int f32123e;

        /* renamed from: f  reason: collision with root package name */
        private int f32124f;

        /* renamed from: g  reason: collision with root package name */
        private long f32125g;

        /* renamed from: h  reason: collision with root package name */
        private long f32126h;

        public b(s3.t tVar) {
            this.f32119a = tVar;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f32121c) {
                int i12 = this.f32124f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.f32122d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f32121c = false;
                    return;
                }
                this.f32124f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f32123e == 182 && z10 && this.f32120b) {
                long j11 = this.f32126h;
                if (j11 != -9223372036854775807L) {
                    this.f32119a.e(j11, this.f32122d ? 1 : 0, (int) (j10 - this.f32125g), i10, null);
                }
            }
            if (this.f32123e != 179) {
                this.f32125g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f32123e = i10;
            this.f32122d = false;
            this.f32120b = i10 == 182 || i10 == 179;
            this.f32121c = i10 == 182;
            this.f32124f = 0;
            this.f32126h = j10;
        }

        public void d() {
            this.f32120b = false;
            this.f32121c = false;
            this.f32122d = false;
            this.f32123e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(c0 c0Var) {
        this.f32102a = c0Var;
        if (c0Var != null) {
            this.f32106e = new r(178, 128);
            this.f32103b = new a5.c0();
            return;
        }
        this.f32106e = null;
        this.f32103b = null;
    }

    private static m1 b(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f32118e, aVar.f32116c);
        a5.b0 b0Var = new a5.b0(copyOf);
        b0Var.r(i10);
        b0Var.r(4);
        b0Var.p();
        b0Var.q(8);
        if (b0Var.g()) {
            b0Var.q(4);
            b0Var.q(3);
        }
        int h10 = b0Var.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = b0Var.h(8);
            int h12 = b0Var.h(8);
            if (h12 == 0) {
                a5.t.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = h11 / h12;
            }
        } else {
            float[] fArr = f32101l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                a5.t.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (b0Var.g()) {
            b0Var.q(2);
            b0Var.q(1);
            if (b0Var.g()) {
                b0Var.q(15);
                b0Var.p();
                b0Var.q(15);
                b0Var.p();
                b0Var.q(15);
                b0Var.p();
                b0Var.q(3);
                b0Var.q(11);
                b0Var.p();
                b0Var.q(15);
                b0Var.p();
            }
        }
        if (b0Var.h(2) != 0) {
            a5.t.i("H263Reader", "Unhandled video object layer shape");
        }
        b0Var.p();
        int h13 = b0Var.h(16);
        b0Var.p();
        if (b0Var.g()) {
            if (h13 == 0) {
                a5.t.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                b0Var.q(i11);
            }
        }
        b0Var.p();
        int h14 = b0Var.h(13);
        b0Var.p();
        int h15 = b0Var.h(13);
        b0Var.p();
        b0Var.p();
        return new m1.b().S(str).e0("video/mp4v-es").j0(h14).Q(h15).a0(f10).T(Collections.singletonList(copyOf)).E();
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        a5.a.h(this.f32107f);
        a5.a.h(this.f32110i);
        int e8 = c0Var.e();
        int f10 = c0Var.f();
        byte[] d10 = c0Var.d();
        this.f32108g += c0Var.a();
        this.f32110i.d(c0Var, c0Var.a());
        while (true) {
            int c10 = a5.y.c(d10, e8, f10, this.f32104c);
            if (c10 == f10) {
                break;
            }
            int i10 = c10 + 3;
            int i11 = c0Var.d()[i10] & 255;
            int i12 = c10 - e8;
            int i13 = 0;
            if (!this.f32111j) {
                if (i12 > 0) {
                    this.f32105d.a(d10, e8, c10);
                }
                if (this.f32105d.b(i11, i12 < 0 ? -i12 : 0)) {
                    s3.t tVar = this.f32110i;
                    a aVar = this.f32105d;
                    tVar.a(b(aVar, aVar.f32117d, (String) a5.a.e(this.f32109h)));
                    this.f32111j = true;
                }
            }
            this.f32107f.a(d10, e8, c10);
            r rVar = this.f32106e;
            if (rVar != null) {
                if (i12 > 0) {
                    rVar.a(d10, e8, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f32106e.b(i13)) {
                    r rVar2 = this.f32106e;
                    ((a5.c0) p0.j(this.f32103b)).I(this.f32106e.f32245d, a5.y.q(rVar2.f32245d, rVar2.f32246e));
                    ((c0) p0.j(this.f32102a)).a(this.f32112k, this.f32103b);
                }
                if (i11 == 178 && c0Var.d()[c10 + 2] == 1) {
                    this.f32106e.e(i11);
                }
            }
            int i14 = f10 - c10;
            this.f32107f.b(this.f32108g - i14, i14, this.f32111j);
            this.f32107f.c(i11, this.f32112k);
            e8 = i10;
        }
        if (!this.f32111j) {
            this.f32105d.a(d10, e8, f10);
        }
        this.f32107f.a(d10, e8, f10);
        r rVar3 = this.f32106e;
        if (rVar3 != null) {
            rVar3.a(d10, e8, f10);
        }
    }

    @Override // w3.j
    public void c() {
        a5.y.a(this.f32104c);
        this.f32105d.c();
        b bVar = this.f32107f;
        if (bVar != null) {
            bVar.d();
        }
        r rVar = this.f32106e;
        if (rVar != null) {
            rVar.d();
        }
        this.f32108g = 0L;
        this.f32112k = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32109h = dVar.b();
        s3.t f10 = kVar.f(dVar.c(), 2);
        this.f32110i = f10;
        this.f32107f = new b(f10);
        c0 c0Var = this.f32102a;
        if (c0Var != null) {
            c0Var.b(kVar, dVar);
        }
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32112k = j10;
        }
    }
}
