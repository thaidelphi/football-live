package w3;

import a5.l0;
import a5.p0;
import java.io.IOException;
import s3.a;
/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class x extends s3.a {

    /* compiled from: TsBinarySearchSeeker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final l0 f32270a;

        /* renamed from: b  reason: collision with root package name */
        private final a5.c0 f32271b = new a5.c0();

        /* renamed from: c  reason: collision with root package name */
        private final int f32272c;

        /* renamed from: d  reason: collision with root package name */
        private final int f32273d;

        public a(int i10, l0 l0Var, int i11) {
            this.f32272c = i10;
            this.f32270a = l0Var;
            this.f32273d = i11;
        }

        private a.e c(a5.c0 c0Var, long j10, long j11) {
            int a10;
            int a11;
            int f10 = c0Var.f();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (c0Var.a() >= 188 && (a11 = (a10 = b0.a(c0Var.d(), c0Var.e(), f10)) + 188) <= f10) {
                long c10 = b0.c(c0Var, a10, this.f32272c);
                if (c10 != -9223372036854775807L) {
                    long b10 = this.f32270a.b(c10);
                    if (b10 > j10) {
                        if (j14 == -9223372036854775807L) {
                            return a.e.d(b10, j11);
                        }
                        return a.e.e(j11 + j13);
                    } else if (100000 + b10 > j10) {
                        return a.e.e(j11 + a10);
                    } else {
                        j13 = a10;
                        j14 = b10;
                    }
                }
                c0Var.K(a11);
                j12 = a11;
            }
            if (j14 != -9223372036854775807L) {
                return a.e.f(j14, j11 + j12);
            }
            return a.e.f30681d;
        }

        @Override // s3.a.f
        public a.e a(s3.j jVar, long j10) throws IOException {
            long position = jVar.getPosition();
            int min = (int) Math.min(this.f32273d, jVar.a() - position);
            this.f32271b.G(min);
            jVar.n(this.f32271b.d(), 0, min);
            return c(this.f32271b, j10, position);
        }

        @Override // s3.a.f
        public void b() {
            this.f32271b.H(p0.f487f);
        }
    }

    public x(l0 l0Var, long j10, long j11, int i10, int i11) {
        super(new a.b(), new a(i10, l0Var, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
