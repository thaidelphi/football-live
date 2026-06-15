package d7;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: UnsafeAllocator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class k {

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class a extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f24395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f24396b;

        a(Method method, Object obj) {
            this.f24395a = method;
            this.f24396b = obj;
        }

        @Override // d7.k
        public <T> T c(Class<T> cls) throws Exception {
            k.a(cls);
            return (T) this.f24395a.invoke(this.f24396b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class b extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f24397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f24398b;

        b(Method method, int i10) {
            this.f24397a = method;
            this.f24398b = i10;
        }

        @Override // d7.k
        public <T> T c(Class<T> cls) throws Exception {
            k.a(cls);
            return (T) this.f24397a.invoke(null, cls, Integer.valueOf(this.f24398b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class c extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f24399a;

        c(Method method) {
            this.f24399a = method;
        }

        @Override // d7.k
        public <T> T c(Class<T> cls) throws Exception {
            k.a(cls);
            return (T) this.f24399a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class d extends k {
        d() {
        }

        @Override // d7.k
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (Modifier.isAbstract(modifiers)) {
                throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
            }
            return;
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    public static k b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
