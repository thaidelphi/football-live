package d9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Timeout.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class y2<U, T extends U> extends i9.g0<T> implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f24532e;

    public y2(long j10, m8.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f24532e = j10;
    }

    @Override // d9.a, d9.g2
    public String q0() {
        return super.q0() + "(timeMillis=" + this.f24532e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        G(z2.a(this.f24532e, z0.b(getContext()), this));
    }
}
