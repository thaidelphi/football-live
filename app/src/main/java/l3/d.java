package l3;
/* compiled from: TimeModule_UptimeClockFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements d3.b<l3.a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final d f27524a = new d();
    }

    public static d a() {
        return a.f27524a;
    }

    public static l3.a c() {
        return (l3.a) d3.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h8.a
    /* renamed from: b */
    public l3.a get() {
        return c();
    }
}
