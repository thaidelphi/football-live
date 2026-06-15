package e4;

import e4.t;
import n3.l3;
import n3.u1;
import z4.s0;
/* compiled from: WrappingMediaSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class n0 extends e<Void> {

    /* renamed from: l  reason: collision with root package name */
    private static final Void f25118l = null;

    /* renamed from: k  reason: collision with root package name */
    protected final t f25119k;

    /* JADX INFO: Access modifiers changed from: protected */
    public n0(t tVar) {
        this.f25119k = tVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.e, e4.a
    public final void B(s0 s0Var) {
        super.B(s0Var);
        U();
    }

    protected abstract t.b L(t.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.e
    /* renamed from: M */
    public final t.b F(Void r12, t.b bVar) {
        return L(bVar);
    }

    protected long N(long j10) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.e
    /* renamed from: O */
    public final long G(Void r12, long j10) {
        return N(j10);
    }

    protected int P(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.e
    /* renamed from: Q */
    public final int H(Void r12, int i10) {
        return P(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.e
    /* renamed from: R */
    public final void J(Void r12, t tVar, l3 l3Var) {
        S(l3Var);
    }

    protected abstract void S(l3 l3Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T() {
        K(f25118l, this.f25119k);
    }

    protected void U() {
        T();
    }

    @Override // e4.t
    public u1 a() {
        return this.f25119k.a();
    }

    @Override // e4.a, e4.t
    public boolean l() {
        return this.f25119k.l();
    }

    @Override // e4.a, e4.t
    public l3 o() {
        return this.f25119k.o();
    }
}
