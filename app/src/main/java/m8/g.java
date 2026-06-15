package m8;

import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import m8.e;
import t8.p;
/* compiled from: CoroutineContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface g {

    /* compiled from: CoroutineContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        /* renamed from: m8.g$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class C0316a extends o implements p<g, b, g> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0316a f27796a = new C0316a();

            C0316a() {
                super(2);
            }

            @Override // t8.p
            /* renamed from: a */
            public final g invoke(g acc, b element) {
                m8.c cVar;
                n.f(acc, "acc");
                n.f(element, "element");
                g minusKey = acc.minusKey(element.getKey());
                h hVar = h.f27797a;
                if (minusKey == hVar) {
                    return element;
                }
                e.b bVar = e.f27794v0;
                e eVar = (e) minusKey.get(bVar);
                if (eVar == null) {
                    cVar = new m8.c(minusKey, element);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar);
                    if (minusKey2 == hVar) {
                        return new m8.c(element, eVar);
                    }
                    cVar = new m8.c(new m8.c(minusKey2, element), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g context) {
            n.f(context, "context");
            return context == h.f27797a ? gVar : (g) context.fold(gVar, C0316a.f27796a);
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> operation) {
                n.f(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                n.f(key, "key");
                if (n.a(bVar.getKey(), key)) {
                    n.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> key) {
                n.f(key, "key");
                return n.a(bVar.getKey(), key) ? h.f27797a : bVar;
            }

            public static g d(b bVar, g context) {
                n.f(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // m8.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
