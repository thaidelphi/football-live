package d9;

import java.util.concurrent.locks.LockSupport;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g<T> extends a<T> {

    /* renamed from: d  reason: collision with root package name */
    private final Thread f24439d;

    /* renamed from: e  reason: collision with root package name */
    private final k1 f24440e;

    public g(m8.g gVar, Thread thread, k1 k1Var) {
        super(gVar, true, true);
        this.f24439d = thread;
        this.f24440e = k1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d9.g2
    public void B(Object obj) {
        if (kotlin.jvm.internal.n.a(Thread.currentThread(), this.f24439d)) {
            return;
        }
        Thread thread = this.f24439d;
        c.a();
        LockSupport.unpark(thread);
    }

    public final T T0() {
        c.a();
        try {
            k1 k1Var = this.f24440e;
            if (k1Var != null) {
                k1.Q0(k1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                k1 k1Var2 = this.f24440e;
                long T0 = k1Var2 != null ? k1Var2.T0() : Long.MAX_VALUE;
                if (!b()) {
                    c.a();
                    LockSupport.parkNanos(this, T0);
                } else {
                    k1 k1Var3 = this.f24440e;
                    if (k1Var3 != null) {
                        k1.L0(k1Var3, false, 1, null);
                    }
                    c.a();
                    T t10 = (T) h2.h(d0());
                    b0 b0Var = t10 instanceof b0 ? (b0) t10 : null;
                    if (b0Var == null) {
                        return t10;
                    }
                    throw b0Var.f24413a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            G(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            c.a();
            throw th;
        }
    }

    @Override // d9.g2
    protected boolean h0() {
        return true;
    }
}
