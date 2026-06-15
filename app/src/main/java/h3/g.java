package h3;
/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements d3.b<i3.g> {

    /* renamed from: a  reason: collision with root package name */
    private final h8.a<l3.a> f26205a;

    public g(h8.a<l3.a> aVar) {
        this.f26205a = aVar;
    }

    public static i3.g a(l3.a aVar) {
        return (i3.g) d3.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(h8.a<l3.a> aVar) {
        return new g(aVar);
    }

    @Override // h8.a
    /* renamed from: c */
    public i3.g get() {
        return a(this.f26205a.get());
    }
}
