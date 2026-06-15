package i9;
/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h {
    public static final void a(m8.g gVar, Throwable th) {
        for (d9.k0 k0Var : g.a()) {
            try {
                k0Var.handleException(gVar, th);
            } catch (m unused) {
                return;
            } catch (Throwable th2) {
                g.b(d9.l0.b(th, th2));
            }
        }
        try {
            i8.b.a(th, new j(gVar));
        } catch (Throwable unused2) {
        }
        g.b(th);
    }
}
