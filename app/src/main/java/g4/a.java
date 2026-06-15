package g4;

import n3.m1;
/* compiled from: BaseMediaChunk.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends n {

    /* renamed from: k  reason: collision with root package name */
    public final long f25707k;

    /* renamed from: l  reason: collision with root package name */
    public final long f25708l;

    /* renamed from: m  reason: collision with root package name */
    private c f25709m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f25710n;

    public a(z4.l lVar, z4.p pVar, m1 m1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(lVar, pVar, m1Var, i10, obj, j10, j11, j14);
        this.f25707k = j12;
        this.f25708l = j13;
    }

    public final int i(int i10) {
        return ((int[]) a5.a.h(this.f25710n))[i10];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c j() {
        return (c) a5.a.h(this.f25709m);
    }

    public void k(c cVar) {
        this.f25709m = cVar;
        this.f25710n = cVar.a();
    }
}
