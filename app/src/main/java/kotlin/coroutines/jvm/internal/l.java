package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
/* compiled from: ContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class l extends d implements kotlin.jvm.internal.j<Object> {
    private final int arity;

    public l(int i10, m8.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() == null) {
            String f10 = b0.f(this);
            n.e(f10, "renderLambdaToString(this)");
            return f10;
        }
        return super.toString();
    }

    public l(int i10) {
        this(i10, null);
    }
}
