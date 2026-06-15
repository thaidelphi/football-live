package g7;

import d7.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: TypeToken.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final Class<? super T> f25823a;

    /* renamed from: b  reason: collision with root package name */
    final Type f25824b;

    /* renamed from: c  reason: collision with root package name */
    final int f25825c;

    protected a() {
        Type d10 = d(getClass());
        this.f25824b = d10;
        this.f25823a = (Class<? super T>) b.k(d10);
        this.f25825c = d10.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> c() {
        return this.f25823a;
    }

    public final Type e() {
        return this.f25824b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f25824b, ((a) obj).f25824b);
    }

    public final int hashCode() {
        return this.f25825c;
    }

    public final String toString() {
        return b.u(this.f25824b);
    }

    a(Type type) {
        Type b10 = b.b((Type) d7.a.b(type));
        this.f25824b = b10;
        this.f25823a = (Class<? super T>) b.k(b10);
        this.f25825c = b10.hashCode();
    }
}
