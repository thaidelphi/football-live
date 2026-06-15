package f9;
/* compiled from: Channel.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class h<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f25553b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    private static final c f25554c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f25555a;

    /* compiled from: Channel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f25556a;

        public a(Throwable th) {
            this.f25556a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.n.a(this.f25556a, ((a) obj).f25556a);
        }

        public int hashCode() {
            Throwable th = this.f25556a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // f9.h.c
        public String toString() {
            return "Closed(" + this.f25556a + ')';
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final <E> Object b() {
            return h.c(h.f25554c);
        }

        public final <E> Object c(E e8) {
            return h.c(e8);
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f25555a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof h) && kotlin.jvm.internal.n.a(obj, ((h) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f25556a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f25555a, obj);
    }

    public int hashCode() {
        return g(this.f25555a);
    }

    public final /* synthetic */ Object k() {
        return this.f25555a;
    }

    public String toString() {
        return j(this.f25555a);
    }
}
