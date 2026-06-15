package g9;

import d9.z1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class y<T> implements j0<T>, e, h9.p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final z1 f26097a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j0<T> f26098b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(j0<? extends T> j0Var, z1 z1Var) {
        this.f26097a = z1Var;
        this.f26098b = j0Var;
    }

    @Override // h9.p
    public e<T> a(m8.g gVar, int i10, f9.a aVar) {
        return l0.d(this, gVar, i10, aVar);
    }

    @Override // g9.a0, g9.e
    public Object collect(f<? super T> fVar, m8.d<?> dVar) {
        return this.f26098b.collect(fVar, dVar);
    }

    @Override // g9.j0
    public T getValue() {
        return this.f26098b.getValue();
    }
}
