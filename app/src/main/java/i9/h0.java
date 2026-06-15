package i9;

import d9.o2;
import i9.h0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class h0<S extends h0<S>> extends e<S> implements o2 {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f26658d = AtomicIntegerFieldUpdater.newUpdater(h0.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    public final long f26659c;
    private volatile int cleanedAndPointers;

    public h0(long j10, S s10, int i10) {
        super(s10);
        this.f26659c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // i9.e
    public boolean h() {
        return f26658d.get(this) == n() && !i();
    }

    public final boolean m() {
        return f26658d.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th, m8.g gVar);

    public final void p() {
        if (f26658d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f26658d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != n() || i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
