package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
/* compiled from: ContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class k extends j implements kotlin.jvm.internal.j<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final int f27363a;

    public k(int i10, m8.d<Object> dVar) {
        super(dVar);
        this.f27363a = i10;
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.f27363a;
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
}
