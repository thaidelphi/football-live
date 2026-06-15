package i9;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class j extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient m8.g f26660a;

    public j(m8.g gVar) {
        this.f26660a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f26660a.toString();
    }
}
