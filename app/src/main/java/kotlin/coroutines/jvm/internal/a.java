package kotlin.coroutines.jvm.internal;

import i8.o;
import i8.p;
import i8.w;
import java.io.Serializable;
import kotlin.jvm.internal.n;
/* compiled from: ContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class a implements m8.d<Object>, e, Serializable {
    private final m8.d<Object> completion;

    public a(m8.d<Object> dVar) {
        this.completion = dVar;
    }

    public m8.d<w> create(m8.d<?> completion) {
        n.f(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        m8.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final m8.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m8.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object c10;
        m8.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            m8.d dVar2 = aVar.completion;
            n.c(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                c10 = n8.d.c();
            } catch (Throwable th) {
                o.a aVar2 = o.f26626b;
                obj = o.b(p.a(th));
            }
            if (invokeSuspend == c10) {
                return;
            }
            o.a aVar3 = o.f26626b;
            obj = o.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public m8.d<w> create(Object obj, m8.d<?> completion) {
        n.f(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
