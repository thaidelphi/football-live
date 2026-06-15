package i9;
/* compiled from: Scopes.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f implements d9.o0 {

    /* renamed from: a  reason: collision with root package name */
    private final m8.g f26655a;

    public f(m8.g gVar) {
        this.f26655a = gVar;
    }

    @Override // d9.o0
    public m8.g getCoroutineContext() {
        return this.f26655a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
