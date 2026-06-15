package i8;

import java.io.Serializable;
/* compiled from: Result.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o<T> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f26626b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Object f26627a;

    /* compiled from: Result.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class b implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f26628a;

        public b(Throwable exception) {
            kotlin.jvm.internal.n.f(exception, "exception");
            this.f26628a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.n.a(this.f26628a, ((b) obj).f26628a);
        }

        public int hashCode() {
            return this.f26628a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f26628a + ')';
        }
    }

    private /* synthetic */ o(Object obj) {
        this.f26627a = obj;
    }

    public static final /* synthetic */ o a(Object obj) {
        return new o(obj);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof o) && kotlin.jvm.internal.n.a(obj, ((o) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f26628a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f26627a, obj);
    }

    public int hashCode() {
        return e(this.f26627a);
    }

    public final /* synthetic */ Object i() {
        return this.f26627a;
    }

    public String toString() {
        return h(this.f26627a);
    }
}
