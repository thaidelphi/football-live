package q4;

import a5.c0;
import a5.p0;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import n4.b;
import n4.g;
import n4.h;
import n4.j;
/* compiled from: PgsDecoder.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final c0 f30126o;

    /* renamed from: p  reason: collision with root package name */
    private final c0 f30127p;

    /* renamed from: q  reason: collision with root package name */
    private final C0346a f30128q;

    /* renamed from: r  reason: collision with root package name */
    private Inflater f30129r;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PgsDecoder.java */
    /* renamed from: q4.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0346a {

        /* renamed from: a  reason: collision with root package name */
        private final c0 f30130a = new c0();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f30131b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f30132c;

        /* renamed from: d  reason: collision with root package name */
        private int f30133d;

        /* renamed from: e  reason: collision with root package name */
        private int f30134e;

        /* renamed from: f  reason: collision with root package name */
        private int f30135f;

        /* renamed from: g  reason: collision with root package name */
        private int f30136g;

        /* renamed from: h  reason: collision with root package name */
        private int f30137h;

        /* renamed from: i  reason: collision with root package name */
        private int f30138i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(c0 c0Var, int i10) {
            int C;
            if (i10 < 4) {
                return;
            }
            c0Var.L(3);
            int i11 = i10 - 4;
            if ((c0Var.z() & 128) != 0) {
                if (i11 < 7 || (C = c0Var.C()) < 4) {
                    return;
                }
                this.f30137h = c0Var.F();
                this.f30138i = c0Var.F();
                this.f30130a.G(C - 4);
                i11 -= 7;
            }
            int e8 = this.f30130a.e();
            int f10 = this.f30130a.f();
            if (e8 >= f10 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, f10 - e8);
            c0Var.j(this.f30130a.d(), e8, min);
            this.f30130a.K(e8 + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(c0 c0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f30133d = c0Var.F();
            this.f30134e = c0Var.F();
            c0Var.L(11);
            this.f30135f = c0Var.F();
            this.f30136g = c0Var.F();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(c0 c0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            c0Var.L(2);
            Arrays.fill(this.f30131b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int z10 = c0Var.z();
                int z11 = c0Var.z();
                int z12 = c0Var.z();
                int z13 = c0Var.z();
                int z14 = c0Var.z();
                double d10 = z11;
                double d11 = z12 - 128;
                int i13 = i12;
                double d12 = z13 - 128;
                this.f30131b[z10] = p0.q((int) (d10 + (d12 * 1.772d)), 0, 255) | (p0.q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (z14 << 24) | (p0.q((int) ((1.402d * d11) + d10), 0, 255) << 16);
                i12 = i13 + 1;
            }
            this.f30132c = true;
        }

        public n4.b d() {
            int i10;
            if (this.f30133d == 0 || this.f30134e == 0 || this.f30137h == 0 || this.f30138i == 0 || this.f30130a.f() == 0 || this.f30130a.e() != this.f30130a.f() || !this.f30132c) {
                return null;
            }
            this.f30130a.K(0);
            int i11 = this.f30137h * this.f30138i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int z10 = this.f30130a.z();
                if (z10 != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f30131b[z10];
                } else {
                    int z11 = this.f30130a.z();
                    if (z11 != 0) {
                        i10 = ((z11 & 64) == 0 ? z11 & 63 : ((z11 & 63) << 8) | this.f30130a.z()) + i12;
                        Arrays.fill(iArr, i12, i10, (z11 & 128) == 0 ? 0 : this.f30131b[this.f30130a.z()]);
                    }
                }
                i12 = i10;
            }
            return new b.C0322b().f(Bitmap.createBitmap(iArr, this.f30137h, this.f30138i, Bitmap.Config.ARGB_8888)).k(this.f30135f / this.f30133d).l(0).h(this.f30136g / this.f30134e, 0).i(0).n(this.f30137h / this.f30133d).g(this.f30138i / this.f30134e).a();
        }

        public void h() {
            this.f30133d = 0;
            this.f30134e = 0;
            this.f30135f = 0;
            this.f30136g = 0;
            this.f30137h = 0;
            this.f30138i = 0;
            this.f30130a.G(0);
            this.f30132c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f30126o = new c0();
        this.f30127p = new c0();
        this.f30128q = new C0346a();
    }

    private void B(c0 c0Var) {
        if (c0Var.a() <= 0 || c0Var.h() != 120) {
            return;
        }
        if (this.f30129r == null) {
            this.f30129r = new Inflater();
        }
        if (p0.r0(c0Var, this.f30127p, this.f30129r)) {
            c0Var.I(this.f30127p.d(), this.f30127p.f());
        }
    }

    private static n4.b C(c0 c0Var, C0346a c0346a) {
        int f10 = c0Var.f();
        int z10 = c0Var.z();
        int F = c0Var.F();
        int e8 = c0Var.e() + F;
        n4.b bVar = null;
        if (e8 > f10) {
            c0Var.K(f10);
            return null;
        }
        if (z10 != 128) {
            switch (z10) {
                case 20:
                    c0346a.g(c0Var, F);
                    break;
                case 21:
                    c0346a.e(c0Var, F);
                    break;
                case 22:
                    c0346a.f(c0Var, F);
                    break;
            }
        } else {
            bVar = c0346a.d();
            c0346a.h();
        }
        c0Var.K(e8);
        return bVar;
    }

    @Override // n4.g
    protected h z(byte[] bArr, int i10, boolean z10) throws j {
        this.f30126o.I(bArr, i10);
        B(this.f30126o);
        this.f30128q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f30126o.a() >= 3) {
            n4.b C = C(this.f30126o, this.f30128q);
            if (C != null) {
                arrayList.add(C);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
