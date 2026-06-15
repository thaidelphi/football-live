package k9;

import d9.j0;
import d9.q1;
import i9.l0;
import i9.n0;
import java.util.concurrent.Executor;
/* compiled from: Dispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b extends q1 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final b f27329c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final j0 f27330d;

    static {
        int a10;
        int e8;
        m mVar = m.f27350b;
        a10 = y8.i.a(64, l0.a());
        e8 = n0.e("kotlinx.coroutines.io.parallelism", a10, 0, 0, 12, null);
        f27330d = mVar.J0(e8);
    }

    private b() {
    }

    @Override // d9.j0
    public void G0(m8.g gVar, Runnable runnable) {
        f27330d.G0(gVar, runnable);
    }

    @Override // d9.j0
    public void H0(m8.g gVar, Runnable runnable) {
        f27330d.H0(gVar, runnable);
    }

    @Override // d9.q1
    public Executor K0() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        G0(m8.h.f27797a, runnable);
    }

    @Override // d9.j0
    public String toString() {
        return "Dispatchers.IO";
    }
}
