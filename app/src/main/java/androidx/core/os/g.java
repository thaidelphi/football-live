package androidx.core.os;

import android.os.OutcomeReceiver;
import i8.o;
import i8.p;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: OutcomeReceiver.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    /* renamed from: a  reason: collision with root package name */
    private final m8.d<R> f2675a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(m8.d<? super R> continuation) {
        super(false);
        kotlin.jvm.internal.n.f(continuation, "continuation");
        this.f2675a = continuation;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E error) {
        kotlin.jvm.internal.n.f(error, "error");
        if (compareAndSet(false, true)) {
            m8.d<R> dVar = this.f2675a;
            o.a aVar = i8.o.f26626b;
            dVar.resumeWith(i8.o.b(p.a(error)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            m8.d<R> dVar = this.f2675a;
            o.a aVar = i8.o.f26626b;
            dVar.resumeWith(i8.o.b(r10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
