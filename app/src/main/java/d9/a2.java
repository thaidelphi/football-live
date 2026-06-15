package d9;

import java.util.concurrent.CancellationException;
/* compiled from: Exceptions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a2 extends CancellationException implements h0<a2> {

    /* renamed from: a  reason: collision with root package name */
    public final transient z1 f24410a;

    public a2(String str, Throwable th, z1 z1Var) {
        super(str);
        this.f24410a = z1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // d9.h0
    /* renamed from: b */
    public a2 a() {
        if (s0.c()) {
            String message = getMessage();
            kotlin.jvm.internal.n.c(message);
            return new a2(message, this, this.f24410a);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a2) {
                a2 a2Var = (a2) obj;
                if (!kotlin.jvm.internal.n.a(a2Var.getMessage(), getMessage()) || !kotlin.jvm.internal.n.a(a2Var.f24410a, this.f24410a) || !kotlin.jvm.internal.n.a(a2Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (s0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.n.c(message);
        int hashCode = ((message.hashCode() * 31) + this.f24410a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f24410a;
    }
}
