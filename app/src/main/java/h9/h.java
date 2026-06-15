package h9;
/* compiled from: ChannelFlow.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h<T> extends g<T, T> {
    public /* synthetic */ h(g9.e eVar, m8.g gVar, int i10, f9.a aVar, int i11, kotlin.jvm.internal.h hVar) {
        this(eVar, (i11 & 2) != 0 ? m8.h.f27797a : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? f9.a.SUSPEND : aVar);
    }

    @Override // h9.e
    protected e<T> g(m8.g gVar, int i10, f9.a aVar) {
        return new h(this.f26283d, gVar, i10, aVar);
    }

    @Override // h9.e
    public g9.e<T> h() {
        return (g9.e<T>) this.f26283d;
    }

    @Override // h9.g
    protected Object q(g9.f<? super T> fVar, m8.d<? super i8.w> dVar) {
        Object c10;
        Object collect = this.f26283d.collect(fVar, dVar);
        c10 = n8.d.c();
        return collect == c10 ? collect : i8.w.f26638a;
    }

    public h(g9.e<? extends T> eVar, m8.g gVar, int i10, f9.a aVar) {
        super(eVar, gVar, i10, aVar);
    }
}
