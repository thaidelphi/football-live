package d9;
/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l0 {
    public static final void a(m8.g gVar, Throwable th) {
        try {
            k0 k0Var = (k0) gVar.get(k0.f24473s0);
            if (k0Var != null) {
                k0Var.handleException(gVar, th);
            } else {
                i9.h.a(gVar, th);
            }
        } catch (Throwable th2) {
            i9.h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        i8.b.a(runtimeException, th);
        return runtimeException;
    }
}
