package m8;

import kotlin.jvm.internal.n;
import m8.g;
import m8.g.b;
import t8.l;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: a  reason: collision with root package name */
    private final l<g.b, E> f27789a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c<?> f27790b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [t8.l<m8.g$b, E extends B>, java.lang.Object, t8.l<? super m8.g$b, ? extends E extends B>] */
    public b(g.c<B> baseKey, l<? super g.b, ? extends E> safeCast) {
        n.f(baseKey, "baseKey");
        n.f(safeCast, "safeCast");
        this.f27789a = safeCast;
        this.f27790b = baseKey instanceof b ? (g.c<B>) ((b) baseKey).f27790b : baseKey;
    }

    public final boolean a(g.c<?> key) {
        n.f(key, "key");
        return key == this || this.f27790b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lm8/g$b;)TE; */
    public final g.b b(g.b element) {
        n.f(element, "element");
        return (g.b) this.f27789a.invoke(element);
    }
}
