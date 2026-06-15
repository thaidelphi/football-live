package w3;

import a5.d0;
import a5.p0;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;
import n3.m1;
import w3.a0;
/* compiled from: H265Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    private final w f32176a;

    /* renamed from: b  reason: collision with root package name */
    private String f32177b;

    /* renamed from: c  reason: collision with root package name */
    private s3.t f32178c;

    /* renamed from: d  reason: collision with root package name */
    private a f32179d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32180e;

    /* renamed from: l  reason: collision with root package name */
    private long f32187l;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f32181f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final r f32182g = new r(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final r f32183h = new r(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final r f32184i = new r(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final r f32185j = new r(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final r f32186k = new r(40, 128);

    /* renamed from: m  reason: collision with root package name */
    private long f32188m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final a5.c0 f32189n = new a5.c0();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: H265Reader.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final s3.t f32190a;

        /* renamed from: b  reason: collision with root package name */
        private long f32191b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32192c;

        /* renamed from: d  reason: collision with root package name */
        private int f32193d;

        /* renamed from: e  reason: collision with root package name */
        private long f32194e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f32195f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f32196g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f32197h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f32198i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f32199j;

        /* renamed from: k  reason: collision with root package name */
        private long f32200k;

        /* renamed from: l  reason: collision with root package name */
        private long f32201l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f32202m;

        public a(s3.t tVar) {
            this.f32190a = tVar;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f32201l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f32202m;
            this.f32190a.e(j10, z10 ? 1 : 0, (int) (this.f32191b - this.f32200k), i10, null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f32199j && this.f32196g) {
                this.f32202m = this.f32192c;
                this.f32199j = false;
            } else if (this.f32197h || this.f32196g) {
                if (z10 && this.f32198i) {
                    d(i10 + ((int) (j10 - this.f32191b)));
                }
                this.f32200k = this.f32191b;
                this.f32201l = this.f32194e;
                this.f32202m = this.f32192c;
                this.f32198i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f32195f) {
                int i12 = this.f32193d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f32196g = (bArr[i13] & 128) != 0;
                    this.f32195f = false;
                    return;
                }
                this.f32193d = i12 + (i11 - i10);
            }
        }

        public void f() {
            this.f32195f = false;
            this.f32196g = false;
            this.f32197h = false;
            this.f32198i = false;
            this.f32199j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11 = false;
            this.f32196g = false;
            this.f32197h = false;
            this.f32194e = j11;
            this.f32193d = 0;
            this.f32191b = j10;
            if (!c(i11)) {
                if (this.f32198i && !this.f32199j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f32198i = false;
                }
                if (b(i11)) {
                    this.f32197h = !this.f32199j;
                    this.f32199j = true;
                }
            }
            boolean z12 = i11 >= 16 && i11 <= 21;
            this.f32192c = z12;
            if (z12 || i11 <= 9) {
                z11 = true;
            }
            this.f32195f = z11;
        }
    }

    public n(w wVar) {
        this.f32176a = wVar;
    }

    private void b() {
        a5.a.h(this.f32178c);
        p0.j(this.f32179d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f32179d.a(j10, i10, this.f32180e);
        if (!this.f32180e) {
            this.f32182g.b(i11);
            this.f32183h.b(i11);
            this.f32184i.b(i11);
            if (this.f32182g.c() && this.f32183h.c() && this.f32184i.c()) {
                this.f32178c.a(i(this.f32177b, this.f32182g, this.f32183h, this.f32184i));
                this.f32180e = true;
            }
        }
        if (this.f32185j.b(i11)) {
            r rVar = this.f32185j;
            this.f32189n.I(this.f32185j.f32245d, a5.y.q(rVar.f32245d, rVar.f32246e));
            this.f32189n.L(5);
            this.f32176a.a(j11, this.f32189n);
        }
        if (this.f32186k.b(i11)) {
            r rVar2 = this.f32186k;
            this.f32189n.I(this.f32186k.f32245d, a5.y.q(rVar2.f32245d, rVar2.f32246e));
            this.f32189n.L(5);
            this.f32176a.a(j11, this.f32189n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f32179d.e(bArr, i10, i11);
        if (!this.f32180e) {
            this.f32182g.a(bArr, i10, i11);
            this.f32183h.a(bArr, i10, i11);
            this.f32184i.a(bArr, i10, i11);
        }
        this.f32185j.a(bArr, i10, i11);
        this.f32186k.a(bArr, i10, i11);
    }

    private static m1 i(String str, r rVar, r rVar2, r rVar3) {
        int i10 = rVar.f32246e;
        byte[] bArr = new byte[rVar2.f32246e + i10 + rVar3.f32246e];
        System.arraycopy(rVar.f32245d, 0, bArr, 0, i10);
        System.arraycopy(rVar2.f32245d, 0, bArr, rVar.f32246e, rVar2.f32246e);
        System.arraycopy(rVar3.f32245d, 0, bArr, rVar.f32246e + rVar2.f32246e, rVar3.f32246e);
        d0 d0Var = new d0(rVar2.f32245d, 0, rVar2.f32246e);
        d0Var.l(44);
        int e8 = d0Var.e(3);
        d0Var.k();
        int e10 = d0Var.e(2);
        boolean d10 = d0Var.d();
        int e11 = d0Var.e(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (d0Var.d()) {
                i11 |= 1 << i12;
            }
        }
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = d0Var.e(8);
        }
        int e12 = d0Var.e(8);
        int i14 = 0;
        for (int i15 = 0; i15 < e8; i15++) {
            if (d0Var.d()) {
                i14 += 89;
            }
            if (d0Var.d()) {
                i14 += 8;
            }
        }
        d0Var.l(i14);
        if (e8 > 0) {
            d0Var.l((8 - e8) * 2);
        }
        d0Var.h();
        int h10 = d0Var.h();
        if (h10 == 3) {
            d0Var.k();
        }
        int h11 = d0Var.h();
        int h12 = d0Var.h();
        if (d0Var.d()) {
            int h13 = d0Var.h();
            int h14 = d0Var.h();
            int h15 = d0Var.h();
            int h16 = d0Var.h();
            h11 -= ((h10 == 1 || h10 == 2) ? 2 : 1) * (h13 + h14);
            h12 -= (h10 == 1 ? 2 : 1) * (h15 + h16);
        }
        d0Var.h();
        d0Var.h();
        int h17 = d0Var.h();
        for (int i16 = d0Var.d() ? 0 : e8; i16 <= e8; i16++) {
            d0Var.h();
            d0Var.h();
            d0Var.h();
        }
        d0Var.h();
        d0Var.h();
        d0Var.h();
        d0Var.h();
        d0Var.h();
        d0Var.h();
        if (d0Var.d() && d0Var.d()) {
            j(d0Var);
        }
        d0Var.l(2);
        if (d0Var.d()) {
            d0Var.l(8);
            d0Var.h();
            d0Var.h();
            d0Var.k();
        }
        k(d0Var);
        if (d0Var.d()) {
            for (int i17 = 0; i17 < d0Var.h(); i17++) {
                d0Var.l(h17 + 4 + 1);
            }
        }
        d0Var.l(2);
        float f10 = 1.0f;
        if (d0Var.d()) {
            if (d0Var.d()) {
                int e13 = d0Var.e(8);
                if (e13 == 255) {
                    int e14 = d0Var.e(16);
                    int e15 = d0Var.e(16);
                    if (e14 != 0 && e15 != 0) {
                        f10 = e14 / e15;
                    }
                } else {
                    float[] fArr = a5.y.f527b;
                    if (e13 < fArr.length) {
                        f10 = fArr[e13];
                    } else {
                        a5.t.i("H265Reader", "Unexpected aspect_ratio_idc value: " + e13);
                    }
                }
            }
            if (d0Var.d()) {
                d0Var.k();
            }
            if (d0Var.d()) {
                d0Var.l(4);
                if (d0Var.d()) {
                    d0Var.l(24);
                }
            }
            if (d0Var.d()) {
                d0Var.h();
                d0Var.h();
            }
            d0Var.k();
            if (d0Var.d()) {
                h12 *= 2;
            }
        }
        return new m1.b().S(str).e0(MimeTypes.VIDEO_H265).I(a5.e.c(e10, d10, e11, i11, iArr, e12)).j0(h11).Q(h12).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    private static void j(d0 d0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!d0Var.d()) {
                    d0Var.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        d0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        d0Var.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void k(d0 d0Var) {
        int h10 = d0Var.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = d0Var.d();
            }
            if (z10) {
                d0Var.k();
                d0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (d0Var.d()) {
                        d0Var.k();
                    }
                }
            } else {
                int h11 = d0Var.h();
                int h12 = d0Var.h();
                int i13 = h11 + h12;
                for (int i14 = 0; i14 < h11; i14++) {
                    d0Var.h();
                    d0Var.k();
                }
                for (int i15 = 0; i15 < h12; i15++) {
                    d0Var.h();
                    d0Var.k();
                }
                i10 = i13;
            }
        }
    }

    private void l(long j10, int i10, int i11, long j11) {
        this.f32179d.g(j10, i10, i11, j11, this.f32180e);
        if (!this.f32180e) {
            this.f32182g.e(i11);
            this.f32183h.e(i11);
            this.f32184i.e(i11);
        }
        this.f32185j.e(i11);
        this.f32186k.e(i11);
    }

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        b();
        while (c0Var.a() > 0) {
            int e8 = c0Var.e();
            int f10 = c0Var.f();
            byte[] d10 = c0Var.d();
            this.f32187l += c0Var.a();
            this.f32178c.d(c0Var, c0Var.a());
            while (e8 < f10) {
                int c10 = a5.y.c(d10, e8, f10, this.f32181f);
                if (c10 == f10) {
                    h(d10, e8, f10);
                    return;
                }
                int e10 = a5.y.e(d10, c10);
                int i10 = c10 - e8;
                if (i10 > 0) {
                    h(d10, e8, c10);
                }
                int i11 = f10 - c10;
                long j10 = this.f32187l - i11;
                g(j10, i11, i10 < 0 ? -i10 : 0, this.f32188m);
                l(j10, i11, e10, this.f32188m);
                e8 = c10 + 3;
            }
        }
    }

    @Override // w3.j
    public void c() {
        this.f32187l = 0L;
        this.f32188m = -9223372036854775807L;
        a5.y.a(this.f32181f);
        this.f32182g.d();
        this.f32183h.d();
        this.f32184i.d();
        this.f32185j.d();
        this.f32186k.d();
        a aVar = this.f32179d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        this.f32177b = dVar.b();
        s3.t f10 = kVar.f(dVar.c(), 2);
        this.f32178c = f10;
        this.f32179d = new a(f10);
        this.f32176a.b(kVar, dVar);
    }

    @Override // w3.j
    public void e() {
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f32188m = j10;
        }
    }
}
