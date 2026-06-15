package d9;

import java.util.concurrent.CancellationException;
/* compiled from: NonCancellable.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class m2 extends m8.a implements z1 {

    /* renamed from: a  reason: collision with root package name */
    public static final m2 f24489a = new m2();

    private m2() {
        super(z1.f24533t0);
    }

    @Override // d9.z1
    public t E(v vVar) {
        return n2.f24492a;
    }

    @Override // d9.z1
    public g1 K(t8.l<? super Throwable, i8.w> lVar) {
        return n2.f24492a;
    }

    @Override // d9.z1
    public void a(CancellationException cancellationException) {
    }

    @Override // d9.z1
    public z1 getParent() {
        return null;
    }

    @Override // d9.z1
    public boolean isActive() {
        return true;
    }

    @Override // d9.z1
    public boolean isCancelled() {
        return false;
    }

    @Override // d9.z1
    public Object n0(m8.d<? super i8.w> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // d9.z1
    public boolean start() {
        return false;
    }

    @Override // d9.z1
    public CancellationException t() {
        throw new IllegalStateException("This job is always active");
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // d9.z1
    public g1 z0(boolean z10, boolean z11, t8.l<? super Throwable, i8.w> lVar) {
        return n2.f24492a;
    }
}
