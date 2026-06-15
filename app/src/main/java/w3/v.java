package w3;

import a5.l0;
import a5.p0;
import w3.a0;
/* compiled from: SectionReader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f32262a;

    /* renamed from: b  reason: collision with root package name */
    private final a5.c0 f32263b = new a5.c0(32);

    /* renamed from: c  reason: collision with root package name */
    private int f32264c;

    /* renamed from: d  reason: collision with root package name */
    private int f32265d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32266e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32267f;

    public v(u uVar) {
        this.f32262a = uVar;
    }

    @Override // w3.a0
    public void a(a5.c0 c0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int e8 = z10 ? c0Var.e() + c0Var.z() : -1;
        if (this.f32267f) {
            if (!z10) {
                return;
            }
            this.f32267f = false;
            c0Var.K(e8);
            this.f32265d = 0;
        }
        while (c0Var.a() > 0) {
            int i11 = this.f32265d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int z11 = c0Var.z();
                    c0Var.K(c0Var.e() - 1);
                    if (z11 == 255) {
                        this.f32267f = true;
                        return;
                    }
                }
                int min = Math.min(c0Var.a(), 3 - this.f32265d);
                c0Var.j(this.f32263b.d(), this.f32265d, min);
                int i12 = this.f32265d + min;
                this.f32265d = i12;
                if (i12 == 3) {
                    this.f32263b.K(0);
                    this.f32263b.J(3);
                    this.f32263b.L(1);
                    int z12 = this.f32263b.z();
                    int z13 = this.f32263b.z();
                    this.f32266e = (z12 & 128) != 0;
                    this.f32264c = (((z12 & 15) << 8) | z13) + 3;
                    int b10 = this.f32263b.b();
                    int i13 = this.f32264c;
                    if (b10 < i13) {
                        this.f32263b.c(Math.min(4098, Math.max(i13, this.f32263b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c0Var.a(), this.f32264c - this.f32265d);
                c0Var.j(this.f32263b.d(), this.f32265d, min2);
                int i14 = this.f32265d + min2;
                this.f32265d = i14;
                int i15 = this.f32264c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f32266e) {
                        if (p0.t(this.f32263b.d(), 0, this.f32264c, -1) != 0) {
                            this.f32267f = true;
                            return;
                        }
                        this.f32263b.J(this.f32264c - 4);
                    } else {
                        this.f32263b.J(i15);
                    }
                    this.f32263b.K(0);
                    this.f32262a.a(this.f32263b);
                    this.f32265d = 0;
                }
            }
        }
    }

    @Override // w3.a0
    public void b(l0 l0Var, s3.k kVar, a0.d dVar) {
        this.f32262a.b(l0Var, kVar, dVar);
        this.f32267f = true;
    }

    @Override // w3.a0
    public void c() {
        this.f32267f = true;
    }
}
