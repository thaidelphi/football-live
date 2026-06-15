package kotlin.jvm.internal;
/* compiled from: Reflection.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c0 f27367a;

    /* renamed from: b  reason: collision with root package name */
    private static final z8.c[] f27368b;

    static {
        c0 c0Var = null;
        try {
            c0Var = (c0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0Var == null) {
            c0Var = new c0();
        }
        f27367a = c0Var;
        f27368b = new z8.c[0];
    }

    public static z8.e a(k kVar) {
        return f27367a.a(kVar);
    }

    public static z8.c b(Class cls) {
        return f27367a.b(cls);
    }

    public static z8.d c(Class cls) {
        return f27367a.c(cls, "");
    }

    public static z8.g d(p pVar) {
        return f27367a.d(pVar);
    }

    public static z8.i e(t tVar) {
        return f27367a.e(tVar);
    }

    public static String f(j jVar) {
        return f27367a.f(jVar);
    }

    public static String g(o oVar) {
        return f27367a.g(oVar);
    }
}
