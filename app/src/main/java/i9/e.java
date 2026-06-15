package i9;

import i9.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class e<N extends e<N>> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26652a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26653b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public e(N n10) {
        this._prev = n10;
    }

    private final N c() {
        N g10 = g();
        while (g10 != null && g10.h()) {
            g10 = (N) f26653b.get(g10);
        }
        return g10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [i9.e] */
    private final N d() {
        ?? e8;
        if (!d9.s0.a() || (!i())) {
            N e10 = e();
            kotlin.jvm.internal.n.c(e10);
            while (e10.h() && (e8 = e10.e()) != 0) {
                e10 = e8;
            }
            return e10;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f26652a.get(this);
    }

    public final void b() {
        f26653b.lazySet(this, null);
    }

    public final N e() {
        Object f10 = f();
        if (f10 == d.a()) {
            return null;
        }
        return (N) f10;
    }

    public final N g() {
        return (N) f26653b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.b.a(f26652a, this, null, d.a());
    }

    public final void k() {
        Object obj;
        if (d9.s0.a()) {
            if (!(h() || i())) {
                throw new AssertionError();
            }
        }
        if (i()) {
            return;
        }
        while (true) {
            N c10 = c();
            N d10 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26653b;
            do {
                obj = atomicReferenceFieldUpdater.get(d10);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, d10, obj, ((e) obj) == null ? null : c10));
            if (c10 != null) {
                f26652a.set(c10, d10);
            }
            if (!d10.h() || d10.i()) {
                if (c10 == null || !c10.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n10) {
        return androidx.concurrent.futures.b.a(f26652a, this, null, n10);
    }
}
