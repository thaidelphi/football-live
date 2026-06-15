package s3;

import java.io.IOException;
import s3.t;
/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f30731a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f30732b;

    /* renamed from: c  reason: collision with root package name */
    private int f30733c;

    /* renamed from: d  reason: collision with root package name */
    private long f30734d;

    /* renamed from: e  reason: collision with root package name */
    private int f30735e;

    /* renamed from: f  reason: collision with root package name */
    private int f30736f;

    /* renamed from: g  reason: collision with root package name */
    private int f30737g;

    public void a(t tVar, t.a aVar) {
        if (this.f30733c > 0) {
            tVar.e(this.f30734d, this.f30735e, this.f30736f, this.f30737g, aVar);
            this.f30733c = 0;
        }
    }

    public void b() {
        this.f30732b = false;
        this.f30733c = 0;
    }

    public void c(t tVar, long j10, int i10, int i11, int i12, t.a aVar) {
        a5.a.g(this.f30737g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f30732b) {
            int i13 = this.f30733c;
            int i14 = i13 + 1;
            this.f30733c = i14;
            if (i13 == 0) {
                this.f30734d = j10;
                this.f30735e = i10;
                this.f30736f = 0;
            }
            this.f30736f += i11;
            this.f30737g = i12;
            if (i14 >= 16) {
                a(tVar, aVar);
            }
        }
    }

    public void d(j jVar) throws IOException {
        if (this.f30732b) {
            return;
        }
        jVar.n(this.f30731a, 0, 10);
        jVar.e();
        if (p3.b.i(this.f30731a) == 0) {
            return;
        }
        this.f30732b = true;
    }
}
