package kotlin.jvm.internal;

import java.io.Serializable;
/* compiled from: Lambda.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class o<R> implements j<R>, Serializable {
    private final int arity;

    public o(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String g10 = b0.g(this);
        n.e(g10, "renderLambdaToString(this)");
        return g10;
    }
}
