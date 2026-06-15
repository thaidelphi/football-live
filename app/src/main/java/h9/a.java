package h9;

import d9.s0;
import java.util.concurrent.CancellationException;
/* compiled from: FlowExceptions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient g9.f<?> f26267a;

    public a(g9.f<?> fVar) {
        super("Flow was aborted, no more elements needed");
        this.f26267a = fVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (s0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
