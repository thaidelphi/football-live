package kotlin.coroutines.jvm.internal;
/* compiled from: ContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class j extends a {
    public j(m8.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == m8.h.f27797a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // m8.d
    public m8.g getContext() {
        return m8.h.f27797a;
    }
}
