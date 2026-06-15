package f6;

import java.lang.annotation.Annotation;
/* compiled from: Qualified.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Annotation> f25430a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f25431b;

    /* compiled from: Qualified.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private @interface a {
    }

    public e0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f25430a = cls;
        this.f25431b = cls2;
    }

    public static <T> e0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new e0<>(cls, cls2);
    }

    public static <T> e0<T> b(Class<T> cls) {
        return new e0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f25431b.equals(e0Var.f25431b)) {
            return this.f25430a.equals(e0Var.f25430a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f25431b.hashCode() * 31) + this.f25430a.hashCode();
    }

    public String toString() {
        if (this.f25430a == a.class) {
            return this.f25431b.getName();
        }
        return "@" + this.f25430a.getName() + " " + this.f25431b.getName();
    }
}
