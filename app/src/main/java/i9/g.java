package i9;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Collection<d9.k0> f26656a;

    static {
        a9.f c10;
        List r10;
        c10 = a9.l.c(ServiceLoader.load(d9.k0.class, d9.k0.class.getClassLoader()).iterator());
        r10 = a9.n.r(c10);
        f26656a = r10;
    }

    public static final Collection<d9.k0> a() {
        return f26656a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
