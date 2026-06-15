package i9;
/* compiled from: Scopes.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class g0<T> extends d9.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: d  reason: collision with root package name */
    public final m8.d<T> f26657d;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(m8.g gVar, m8.d<? super T> dVar) {
        super(gVar, true, true);
        this.f26657d = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d9.g2
    public void B(Object obj) {
        m8.d b10;
        b10 = n8.c.b(this.f26657d);
        l.c(b10, d9.f0.a(obj, this.f26657d), null, 2, null);
    }

    @Override // d9.a
    protected void P0(Object obj) {
        m8.d<T> dVar = this.f26657d;
        dVar.resumeWith(d9.f0.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        m8.d<T> dVar = this.f26657d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // d9.g2
    protected final boolean h0() {
        return true;
    }
}
