package d9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class x1 extends b2 {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f24528f = AtomicIntegerFieldUpdater.newUpdater(x1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e  reason: collision with root package name */
    private final t8.l<Throwable, i8.w> f24529e;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(t8.l<? super Throwable, i8.w> lVar) {
        this.f24529e = lVar;
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
        r(th);
        return i8.w.f26638a;
    }

    @Override // d9.d0
    public void r(Throwable th) {
        if (f24528f.compareAndSet(this, 0, 1)) {
            this.f24529e.invoke(th);
        }
    }
}
