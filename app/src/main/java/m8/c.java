package m8;

import java.io.Serializable;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import m8.g;
import t8.p;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final g f27791a;

    /* renamed from: b  reason: collision with root package name */
    private final g.b f27792b;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    static final class a extends o implements p<String, g.b, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27793a = new a();

        a() {
            super(2);
        }

        @Override // t8.p
        /* renamed from: a */
        public final String invoke(String acc, g.b element) {
            n.f(acc, "acc");
            n.f(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        n.f(left, "left");
        n.f(element, "element");
        this.f27791a = left;
        this.f27792b = element;
    }

    private final boolean c(g.b bVar) {
        return n.a(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f27792b)) {
            g gVar = cVar.f27791a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                n.d(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
        }
        return false;
    }

    private final int e() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f27791a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // m8.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> operation) {
        n.f(operation, "operation");
        return operation.invoke((Object) this.f27791a.fold(r10, operation), this.f27792b);
    }

    @Override // m8.g
    public <E extends g.b> E get(g.c<E> key) {
        n.f(key, "key");
        c cVar = this;
        while (true) {
            E e8 = (E) cVar.f27792b.get(key);
            if (e8 != null) {
                return e8;
            }
            g gVar = cVar.f27791a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                return (E) gVar.get(key);
            }
        }
    }

    public int hashCode() {
        return this.f27791a.hashCode() + this.f27792b.hashCode();
    }

    @Override // m8.g
    public g minusKey(g.c<?> key) {
        n.f(key, "key");
        if (this.f27792b.get(key) != null) {
            return this.f27791a;
        }
        g minusKey = this.f27791a.minusKey(key);
        return minusKey == this.f27791a ? this : minusKey == h.f27797a ? this.f27792b : new c(minusKey, this.f27792b);
    }

    @Override // m8.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f27793a)) + ']';
    }
}
