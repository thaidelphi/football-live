package l3;
/* compiled from: TimeModule_EventClockFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c implements d3.b<l3.a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f27523a = new c();
    }

    public static c a() {
        return a.f27523a;
    }

    public static l3.a b() {
        return (l3.a) d3.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h8.a
    /* renamed from: c */
    public l3.a get() {
        return b();
    }
}
