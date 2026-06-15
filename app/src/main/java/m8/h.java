package m8;

import java.io.Serializable;
import kotlin.jvm.internal.n;
import m8.g;
import t8.p;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final h f27797a = new h();

    private h() {
    }

    @Override // m8.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> operation) {
        n.f(operation, "operation");
        return r10;
    }

    @Override // m8.g
    public <E extends g.b> E get(g.c<E> key) {
        n.f(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // m8.g
    public g minusKey(g.c<?> key) {
        n.f(key, "key");
        return this;
    }

    @Override // m8.g
    public g plus(g context) {
        n.f(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
