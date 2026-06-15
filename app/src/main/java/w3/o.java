package w3;

import n3.m1;
import w3.a0;
/* compiled from: Id3Reader.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class o implements j {

    /* renamed from: b  reason: collision with root package name */
    private s3.t f32204b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32205c;

    /* renamed from: e  reason: collision with root package name */
    private int f32207e;

    /* renamed from: f  reason: collision with root package name */
    private int f32208f;

    /* renamed from: a  reason: collision with root package name */
    private final a5.c0 f32203a = new a5.c0(10);

    /* renamed from: d  reason: collision with root package name */
    private long f32206d = -9223372036854775807L;

    @Override // w3.j
    public void a(a5.c0 c0Var) {
        a5.a.h(this.f32204b);
        if (this.f32205c) {
            int a10 = c0Var.a();
            int i10 = this.f32208f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(c0Var.d(), c0Var.e(), this.f32203a.d(), this.f32208f, min);
                if (this.f32208f + min == 10) {
                    this.f32203a.K(0);
                    if (73 == this.f32203a.z() && 68 == this.f32203a.z() && 51 == this.f32203a.z()) {
                        this.f32203a.L(3);
                        this.f32207e = this.f32203a.y() + 10;
                    } else {
                        a5.t.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f32205c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f32207e - this.f32208f);
            this.f32204b.d(c0Var, min2);
            this.f32208f += min2;
        }
    }

    @Override // w3.j
    public void c() {
        this.f32205c = false;
        this.f32206d = -9223372036854775807L;
    }

    @Override // w3.j
    public void d(s3.k kVar, a0.d dVar) {
        dVar.a();
        s3.t f10 = kVar.f(dVar.c(), 5);
        this.f32204b = f10;
        f10.a(new m1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // w3.j
    public void e() {
        int i10;
        a5.a.h(this.f32204b);
        if (this.f32205c && (i10 = this.f32207e) != 0 && this.f32208f == i10) {
            long j10 = this.f32206d;
            if (j10 != -9223372036854775807L) {
                this.f32204b.e(j10, 1, i10, 0, null);
            }
            this.f32205c = false;
        }
    }

    @Override // w3.j
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f32205c = true;
        if (j10 != -9223372036854775807L) {
            this.f32206d = j10;
        }
        this.f32207e = 0;
        this.f32208f = 0;
    }
}
