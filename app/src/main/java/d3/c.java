package d3;
/* compiled from: InstanceFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class c<T> implements b<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final c<Object> f23963b = new c<>(null);

    /* renamed from: a  reason: collision with root package name */
    private final T f23964a;

    private c(T t10) {
        this.f23964a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // h8.a
    public T get() {
        return this.f23964a;
    }
}
