package h9;

import m8.g;
/* compiled from: SafeCollector.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l implements m8.g {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f26326a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ m8.g f26327b;

    public l(Throwable th, m8.g gVar) {
        this.f26326a = th;
        this.f26327b = gVar;
    }

    @Override // m8.g
    public <R> R fold(R r10, t8.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f26327b.fold(r10, pVar);
    }

    @Override // m8.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) this.f26327b.get(cVar);
    }

    @Override // m8.g
    public m8.g minusKey(g.c<?> cVar) {
        return this.f26327b.minusKey(cVar);
    }

    @Override // m8.g
    public m8.g plus(m8.g gVar) {
        return this.f26327b.plus(gVar);
    }
}
