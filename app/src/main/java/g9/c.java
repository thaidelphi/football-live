package g9;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c<T> extends h9.e<T> {

    /* renamed from: d  reason: collision with root package name */
    private final t8.p<f9.r<? super T>, m8.d<? super i8.w>, Object> f25870d;

    public /* synthetic */ c(t8.p pVar, m8.g gVar, int i10, f9.a aVar, int i11, kotlin.jvm.internal.h hVar) {
        this(pVar, (i11 & 2) != 0 ? m8.h.f27797a : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? f9.a.SUSPEND : aVar);
    }

    static /* synthetic */ <T> Object n(c<T> cVar, f9.r<? super T> rVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object invoke = ((c) cVar).f25870d.invoke(rVar, dVar);
        c10 = n8.d.c();
        return invoke == c10 ? invoke : i8.w.f26638a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h9.e
    public Object f(f9.r<? super T> rVar, m8.d<? super i8.w> dVar) {
        return n(this, rVar, dVar);
    }

    @Override // h9.e
    protected h9.e<T> g(m8.g gVar, int i10, f9.a aVar) {
        return new c(this.f25870d, gVar, i10, aVar);
    }

    @Override // h9.e
    public String toString() {
        return "block[" + this.f25870d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(t8.p<? super f9.r<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar, m8.g gVar, int i10, f9.a aVar) {
        super(gVar, i10, aVar);
        this.f25870d = pVar;
    }
}
