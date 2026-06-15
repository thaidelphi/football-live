package m8;

import kotlin.jvm.internal.n;
import m8.g;
import t8.p;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> key) {
        n.f(key, "key");
        this.key = key;
    }

    @Override // m8.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // m8.g.b, m8.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // m8.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // m8.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // m8.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
