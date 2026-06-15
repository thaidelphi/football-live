package d9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: Builders.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b1<T> extends i9.g0<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24414e = AtomicIntegerFieldUpdater.newUpdater(b1.class, "_decision");
    private volatile int _decision;

    public b1(m8.g gVar, m8.d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24414e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f24414e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean V0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f24414e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f24414e.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.g0, d9.g2
    public void B(Object obj) {
        P0(obj);
    }

    @Override // i9.g0, d9.a
    protected void P0(Object obj) {
        m8.d b10;
        if (U0()) {
            return;
        }
        b10 = n8.c.b(this.f26657d);
        i9.l.c(b10, f0.a(obj, this.f26657d), null, 2, null);
    }

    public final Object T0() {
        Object c10;
        if (V0()) {
            c10 = n8.d.c();
            return c10;
        }
        Object h10 = h2.h(d0());
        if (h10 instanceof b0) {
            throw ((b0) h10).f24413a;
        }
        return h10;
    }
}
