package g9;

import d9.z1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class x<T> implements a0<T>, e, h9.p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final z1 f26095a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a0<T> f26096b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(a0<? extends T> a0Var, z1 z1Var) {
        this.f26095a = z1Var;
        this.f26096b = a0Var;
    }

    @Override // h9.p
    public e<T> a(m8.g gVar, int i10, f9.a aVar) {
        return c0.e(this, gVar, i10, aVar);
    }

    @Override // g9.a0, g9.e
    public Object collect(f<? super T> fVar, m8.d<?> dVar) {
        return this.f26096b.collect(fVar, dVar);
    }
}
