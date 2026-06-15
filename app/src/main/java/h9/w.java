package h9;
/* compiled from: SendingCollector.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class w<T> implements g9.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f9.u<T> f26348a;

    /* JADX WARN: Multi-variable type inference failed */
    public w(f9.u<? super T> uVar) {
        this.f26348a = uVar;
    }

    @Override // g9.f
    public Object emit(T t10, m8.d<? super i8.w> dVar) {
        Object c10;
        Object i10 = this.f26348a.i(t10, dVar);
        c10 = n8.d.c();
        return i10 == c10 ? i10 : i8.w.f26638a;
    }
}
