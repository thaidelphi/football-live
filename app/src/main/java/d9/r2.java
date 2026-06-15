package d9;

import i8.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class r2 extends f2 {

    /* renamed from: e  reason: collision with root package name */
    private final m8.d<i8.w> f24511e;

    /* JADX WARN: Multi-variable type inference failed */
    public r2(m8.d<? super i8.w> dVar) {
        this.f24511e = dVar;
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
        r(th);
        return i8.w.f26638a;
    }

    @Override // d9.d0
    public void r(Throwable th) {
        m8.d<i8.w> dVar = this.f24511e;
        o.a aVar = i8.o.f26626b;
        dVar.resumeWith(i8.o.b(i8.w.f26638a));
    }
}
