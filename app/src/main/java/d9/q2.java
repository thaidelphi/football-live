package d9;

import i8.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class q2<T> extends f2 {

    /* renamed from: e  reason: collision with root package name */
    private final o<T> f24509e;

    /* JADX WARN: Multi-variable type inference failed */
    public q2(o<? super T> oVar) {
        this.f24509e = oVar;
    }

    @Override // t8.l
    public /* bridge */ /* synthetic */ i8.w invoke(Throwable th) {
        r(th);
        return i8.w.f26638a;
    }

    @Override // d9.d0
    public void r(Throwable th) {
        Object d02 = s().d0();
        if (s0.a() && !(!(d02 instanceof u1))) {
            throw new AssertionError();
        }
        if (d02 instanceof b0) {
            o<T> oVar = this.f24509e;
            o.a aVar = i8.o.f26626b;
            oVar.resumeWith(i8.o.b(i8.p.a(((b0) d02).f24413a)));
            return;
        }
        o<T> oVar2 = this.f24509e;
        o.a aVar2 = i8.o.f26626b;
        oVar2.resumeWith(i8.o.b(h2.h(d02)));
    }
}
