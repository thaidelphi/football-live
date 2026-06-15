package o8;

import kotlin.jvm.internal.n;
/* compiled from: PlatformImplementations.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29469a;

    static {
        a aVar;
        Object newInstance;
        try {
            newInstance = q8.a.class.newInstance();
            n.e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                } catch (ClassNotFoundException unused) {
                    Object newInstance2 = p8.a.class.newInstance();
                    n.e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        try {
                            if (newInstance2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                            }
                            aVar = (a) newInstance2;
                        } catch (ClassCastException e8) {
                            ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                            ClassLoader classLoader2 = a.class.getClassLoader();
                            if (n.a(classLoader, classLoader2)) {
                                throw e8;
                            }
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e8);
                        }
                    } catch (ClassNotFoundException unused2) {
                        aVar = new a();
                    }
                }
            } catch (ClassCastException e10) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = a.class.getClassLoader();
                if (n.a(classLoader3, classLoader4)) {
                    throw e10;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e10);
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            n.e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance3;
                } catch (ClassCastException e11) {
                    ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader6 = a.class.getClassLoader();
                    if (n.a(classLoader5, classLoader6)) {
                        throw e11;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e11);
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                n.e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance4;
                } catch (ClassCastException e12) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (n.a(classLoader7, classLoader8)) {
                        throw e12;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e12);
                }
            }
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        aVar = (a) newInstance;
        f29469a = aVar;
    }
}
