package d9;

import m8.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoroutineContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c3 implements g.b, g.c<c3> {

    /* renamed from: a  reason: collision with root package name */
    public static final c3 f24421a = new c3();

    private c3() {
    }

    @Override // m8.g
    public <R> R fold(R r10, t8.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // m8.g.b, m8.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // m8.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // m8.g
    public m8.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // m8.g
    public m8.g plus(m8.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
