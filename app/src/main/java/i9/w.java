package i9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class w<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26713a = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_cur");
    private volatile Object _cur;

    public w(boolean z10) {
        this._cur = new x(8, z10);
    }

    public final boolean a(E e8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26713a;
        while (true) {
            x xVar = (x) atomicReferenceFieldUpdater.get(this);
            int a10 = xVar.a(e8);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                androidx.concurrent.futures.b.a(f26713a, this, xVar, xVar.i());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26713a;
        while (true) {
            x xVar = (x) atomicReferenceFieldUpdater.get(this);
            if (xVar.d()) {
                return;
            }
            androidx.concurrent.futures.b.a(f26713a, this, xVar, xVar.i());
        }
    }

    public final int c() {
        return ((x) f26713a.get(this)).f();
    }

    public final E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26713a;
        while (true) {
            x xVar = (x) atomicReferenceFieldUpdater.get(this);
            E e8 = (E) xVar.j();
            if (e8 != x.f26717h) {
                return e8;
            }
            androidx.concurrent.futures.b.a(f26713a, this, xVar, xVar.i());
        }
    }
}
