package w1;

import java.security.MessageDigest;
/* compiled from: Option.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final b<Object> f31965e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final T f31966a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T> f31967b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31968c;

    /* renamed from: d  reason: collision with root package name */
    private volatile byte[] f31969d;

    /* compiled from: Option.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // w1.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    private g(String str, T t10, b<T> bVar) {
        this.f31968c = s2.j.b(str);
        this.f31966a = t10;
        this.f31967b = (b) s2.j.d(bVar);
    }

    public static <T> g<T> a(String str, T t10, b<T> bVar) {
        return new g<>(str, t10, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f31965e;
    }

    private byte[] d() {
        if (this.f31969d == null) {
            this.f31969d = this.f31968c.getBytes(f.f31964a);
        }
        return this.f31969d;
    }

    public static <T> g<T> e(String str) {
        return new g<>(str, null, b());
    }

    public static <T> g<T> f(String str, T t10) {
        return new g<>(str, t10, b());
    }

    public T c() {
        return this.f31966a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f31968c.equals(((g) obj).f31968c);
        }
        return false;
    }

    public void g(T t10, MessageDigest messageDigest) {
        this.f31967b.a(d(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f31968c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f31968c + "'}";
    }
}
