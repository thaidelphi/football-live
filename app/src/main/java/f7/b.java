package f7;

import java.lang.reflect.AccessibleObject;
/* compiled from: ReflectionAccessor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final b f25486a;

    static {
        f25486a = i7.a.b() < 9 ? new a() : new c();
    }

    public static b a() {
        return f25486a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
