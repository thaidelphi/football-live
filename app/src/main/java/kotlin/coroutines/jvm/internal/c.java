package kotlin.coroutines.jvm.internal;
/* compiled from: ContinuationImpl.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c implements m8.d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f27356a = new c();

    private c() {
    }

    @Override // m8.d
    public m8.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // m8.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
