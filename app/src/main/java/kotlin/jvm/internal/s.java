package kotlin.jvm.internal;
/* compiled from: PackageReference.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class s implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f27379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f27380b;

    public s(Class<?> jClass, String moduleName) {
        n.f(jClass, "jClass");
        n.f(moduleName, "moduleName");
        this.f27379a = jClass;
        this.f27380b = moduleName;
    }

    @Override // kotlin.jvm.internal.e
    public Class<?> a() {
        return this.f27379a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && n.a(a(), ((s) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
