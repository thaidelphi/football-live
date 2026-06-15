package f9;

import d9.a2;
import d9.g2;
import i8.w;
import java.util.concurrent.CancellationException;
/* compiled from: ChannelCoroutine.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class e<E> extends d9.a<w> implements d<E> {

    /* renamed from: d  reason: collision with root package name */
    private final d<E> f25552d;

    public e(m8.g gVar, d<E> dVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f25552d = dVar;
    }

    @Override // d9.g2
    public void I(Throwable th) {
        CancellationException I0 = g2.I0(this, th, null, 1, null);
        this.f25552d.a(I0);
        G(I0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d<E> T0() {
        return this.f25552d;
    }

    @Override // d9.g2, d9.z1
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new a2(O(), null, this);
        }
        I(cancellationException);
    }

    @Override // f9.u
    public void c(t8.l<? super Throwable, w> lVar) {
        this.f25552d.c(lVar);
    }

    @Override // f9.t
    public Object e(m8.d<? super E> dVar) {
        return this.f25552d.e(dVar);
    }

    @Override // f9.u
    public Object i(E e8, m8.d<? super w> dVar) {
        return this.f25552d.i(e8, dVar);
    }

    @Override // f9.t
    public f<E> iterator() {
        return this.f25552d.iterator();
    }

    @Override // f9.u
    public Object l(E e8) {
        return this.f25552d.l(e8);
    }

    @Override // f9.t
    public Object m(m8.d<? super h<? extends E>> dVar) {
        Object m7 = this.f25552d.m(dVar);
        n8.d.c();
        return m7;
    }

    @Override // f9.t
    public l9.f<h<E>> n() {
        return this.f25552d.n();
    }

    @Override // f9.t
    public Object o() {
        return this.f25552d.o();
    }

    @Override // f9.u
    public boolean q(Throwable th) {
        return this.f25552d.q(th);
    }

    @Override // f9.u
    public boolean s() {
        return this.f25552d.s();
    }
}
