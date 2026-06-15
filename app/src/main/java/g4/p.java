package g4;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import n3.m1;
import s3.t;
/* compiled from: SingleSampleMediaChunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class p extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f25788o;

    /* renamed from: p  reason: collision with root package name */
    private final m1 f25789p;

    /* renamed from: q  reason: collision with root package name */
    private long f25790q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f25791r;

    public p(z4.l lVar, z4.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12, int i11, m1 m1Var2) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f25788o = i11;
        this.f25789p = m1Var2;
    }

    @Override // z4.j0.e
    public void a() throws IOException {
        c j10 = j();
        j10.b(0L);
        t f10 = j10.f(0, this.f25788o);
        f10.a(this.f25789p);
        try {
            long l10 = this.f25743i.l(this.f25736b.e(this.f25790q));
            if (l10 != -1) {
                l10 += this.f25790q;
            }
            s3.e eVar = new s3.e(this.f25743i, this.f25790q, l10);
            for (int i10 = 0; i10 != -1; i10 = f10.b(eVar, Api.BaseClientBuilder.API_PRIORITY_OTHER, true)) {
                this.f25790q += i10;
            }
            f10.e(this.f25741g, 1, (int) this.f25790q, 0, null);
            z4.o.a(this.f25743i);
            this.f25791r = true;
        } catch (Throwable th) {
            z4.o.a(this.f25743i);
            throw th;
        }
    }

    @Override // z4.j0.e
    public void b() {
    }

    @Override // g4.n
    public boolean h() {
        return this.f25791r;
    }
}
