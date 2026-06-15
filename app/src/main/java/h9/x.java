package h9;
/* compiled from: ChannelFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class x<T> implements m8.d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a  reason: collision with root package name */
    private final m8.d<T> f26349a;

    /* renamed from: b  reason: collision with root package name */
    private final m8.g f26350b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(m8.d<? super T> dVar, m8.g gVar) {
        this.f26349a = dVar;
        this.f26350b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        m8.d<T> dVar = this.f26349a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // m8.d
    public m8.g getContext() {
        return this.f26350b;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // m8.d
    public void resumeWith(Object obj) {
        this.f26349a.resumeWith(obj);
    }
}
