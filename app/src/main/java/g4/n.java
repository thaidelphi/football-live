package g4;

import n3.m1;
/* compiled from: MediaChunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class n extends f {

    /* renamed from: j  reason: collision with root package name */
    public final long f25786j;

    public n(z4.l lVar, z4.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12) {
        super(lVar, pVar, 1, m1Var, i10, obj, j10, j11);
        a5.a.e(m1Var);
        this.f25786j = j12;
    }

    public long g() {
        long j10 = this.f25786j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean h();
}
