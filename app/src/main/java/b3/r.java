package b3;
/* compiled from: TransportImpl.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class r<T> implements z2.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o f5071a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5072b;

    /* renamed from: c  reason: collision with root package name */
    private final z2.b f5073c;

    /* renamed from: d  reason: collision with root package name */
    private final z2.e<T, byte[]> f5074d;

    /* renamed from: e  reason: collision with root package name */
    private final s f5075e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(o oVar, String str, z2.b bVar, z2.e<T, byte[]> eVar, s sVar) {
        this.f5071a = oVar;
        this.f5072b = str;
        this.f5073c = bVar;
        this.f5074d = eVar;
        this.f5075e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // z2.f
    public void a(z2.c<T> cVar) {
        d(cVar, new z2.h() { // from class: b3.q
            @Override // z2.h
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    public void d(z2.c<T> cVar, z2.h hVar) {
        this.f5075e.a(n.a().e(this.f5071a).c(cVar).f(this.f5072b).d(this.f5074d).b(this.f5073c).a(), hVar);
    }
}
