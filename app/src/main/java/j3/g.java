package j3;
/* compiled from: EventStoreModule_DbNameFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements d3.b<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final g f26862a = new g();
    }

    public static g a() {
        return a.f26862a;
    }

    public static String b() {
        return (String) d3.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h8.a
    /* renamed from: c */
    public String get() {
        return b();
    }
}
