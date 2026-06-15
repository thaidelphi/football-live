package n4;

import java.util.List;
/* compiled from: SubtitleOutputBuffer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class m extends q3.h implements h {

    /* renamed from: d  reason: collision with root package name */
    private h f28648d;

    /* renamed from: e  reason: collision with root package name */
    private long f28649e;

    @Override // n4.h
    public int a(long j10) {
        return ((h) a5.a.e(this.f28648d)).a(j10 - this.f28649e);
    }

    @Override // n4.h
    public List<b> b(long j10) {
        return ((h) a5.a.e(this.f28648d)).b(j10 - this.f28649e);
    }

    @Override // n4.h
    public long c(int i10) {
        return ((h) a5.a.e(this.f28648d)).c(i10) + this.f28649e;
    }

    @Override // n4.h
    public int d() {
        return ((h) a5.a.e(this.f28648d)).d();
    }

    @Override // q3.a
    public void g() {
        super.g();
        this.f28648d = null;
    }

    public void q(long j10, h hVar, long j11) {
        this.f30099b = j10;
        this.f28648d = hVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f28649e = j10;
    }
}
