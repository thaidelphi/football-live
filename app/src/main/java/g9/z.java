package g9;
/* compiled from: Builders.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class z<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final t8.p<f<? super T>, m8.d<? super i8.w>, Object> f26099a;

    /* JADX WARN: Multi-variable type inference failed */
    public z(t8.p<? super f<? super T>, ? super m8.d<? super i8.w>, ? extends Object> pVar) {
        this.f26099a = pVar;
    }

    @Override // g9.a
    public Object b(f<? super T> fVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object invoke = this.f26099a.invoke(fVar, dVar);
        c10 = n8.d.c();
        return invoke == c10 ? invoke : i8.w.f26638a;
    }
}
