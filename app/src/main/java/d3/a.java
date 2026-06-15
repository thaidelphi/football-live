package d3;
/* compiled from: DoubleCheck.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a<T> implements h8.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f23960c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile h8.a<T> f23961a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f23962b = f23960c;

    private a(h8.a<T> aVar) {
        this.f23961a = aVar;
    }

    public static <P extends h8.a<T>, T> h8.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f23960c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // h8.a
    public T get() {
        T t10 = (T) this.f23962b;
        Object obj = f23960c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f23962b;
                if (t10 == obj) {
                    t10 = this.f23961a.get();
                    this.f23962b = b(this.f23962b, t10);
                    this.f23961a = null;
                }
            }
        }
        return t10;
    }
}
