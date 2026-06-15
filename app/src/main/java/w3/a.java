package w3;

import java.io.IOException;
import s3.q;
import w3.a0;
/* compiled from: Ac3Extractor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements s3.i {

    /* renamed from: d  reason: collision with root package name */
    public static final s3.m f31978d = t3.d.f30956a;

    /* renamed from: a  reason: collision with root package name */
    private final b f31979a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final a5.c0 f31980b = new a5.c0(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f31981c;

    @Override // s3.i
    public int a(s3.j jVar, s3.p pVar) throws IOException {
        int b10 = jVar.b(this.f31980b.d(), 0, 2786);
        if (b10 == -1) {
            return -1;
        }
        this.f31980b.K(0);
        this.f31980b.J(b10);
        if (!this.f31981c) {
            this.f31979a.f(0L, 4);
            this.f31981c = true;
        }
        this.f31979a.a(this.f31980b);
        return 0;
    }

    @Override // s3.i
    public void b(s3.k kVar) {
        this.f31979a.d(kVar, new a0.d(0, 1));
        kVar.q();
        kVar.o(new q.b(-9223372036854775807L));
    }

    @Override // s3.i
    public boolean c(s3.j jVar) throws IOException {
        a5.c0 c0Var = new a5.c0(10);
        int i10 = 0;
        while (true) {
            jVar.n(c0Var.d(), 0, 10);
            c0Var.K(0);
            if (c0Var.C() != 4801587) {
                break;
            }
            c0Var.L(3);
            int y10 = c0Var.y();
            i10 += y10 + 10;
            jVar.h(y10);
        }
        jVar.e();
        jVar.h(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            jVar.n(c0Var.d(), 0, 6);
            c0Var.K(0);
            if (c0Var.F() != 2935) {
                jVar.e();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                jVar.h(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int f10 = p3.b.f(c0Var.d());
                if (f10 == -1) {
                    return false;
                }
                jVar.h(f10 - 6);
            }
        }
    }

    @Override // s3.i
    public void d(long j10, long j11) {
        this.f31981c = false;
        this.f31979a.c();
    }

    @Override // s3.i
    public void release() {
    }
}
