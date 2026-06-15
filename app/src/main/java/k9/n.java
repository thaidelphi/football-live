package k9;

import d9.s0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.a0;
/* compiled from: WorkQueue.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f27351b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27352c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27353d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f27354e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<h> f27355a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f27339b.b() == 1) {
            f27354e.incrementAndGet(this);
        }
        int i10 = f27352c.get(this) & 127;
        while (this.f27355a.get(i10) != null) {
            Thread.yield();
        }
        this.f27355a.lazySet(i10, hVar);
        f27352c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            if (hVar.f27339b.b() == 1) {
                int decrementAndGet = f27354e.decrementAndGet(this);
                if (s0.a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final int d() {
        return f27352c.get(this) - f27353d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f27353d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f27352c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f27355a.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    private final h k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f27351b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f27339b.b() == 1) == z10) {
                }
            }
            int i10 = f27353d.get(this);
            int i11 = f27352c.get(this);
            while (i10 != i11) {
                if (z10 && f27354e.get(this) == 0) {
                    return null;
                }
                i11--;
                h m7 = m(i11, z10);
                if (m7 != null) {
                    return m7;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f27353d.get(this);
        int i12 = f27352c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f27354e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h m7 = m(i11, z10);
            if (m7 != null) {
                return m7;
            }
            i11 = i13;
        }
        return null;
    }

    private final h m(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = this.f27355a.get(i11);
        if (hVar != null) {
            if ((hVar.f27339b.b() == 1) == z10 && this.f27355a.compareAndSet(i11, hVar, null)) {
                if (z10) {
                    f27354e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, k9.h, java.lang.Object] */
    private final long o(int i10, a0<h> a0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f27351b;
            r12 = (h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f27339b.b() == 1 ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long a10 = l.f27347f.a() - r12.f27338a;
            long j10 = l.f27343b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, r12, null));
        a0Var.f27364a = r12;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f27351b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f27351b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f27351b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f27351b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long n(int i10, a0<h> a0Var) {
        T t10;
        if (i10 == 3) {
            t10 = i();
        } else {
            t10 = l(i10);
        }
        if (t10 != 0) {
            a0Var.f27364a = t10;
            return -1L;
        }
        return o(i10, a0Var);
    }
}
