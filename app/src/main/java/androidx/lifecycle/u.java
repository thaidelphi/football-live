package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: Lifecycling.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f3681a = new u();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f3682b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends f>>> f3683c = new HashMap();

    private u() {
    }

    private final f a(Constructor<? extends f> constructor, Object obj) {
        try {
            f newInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.n.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private final Constructor<? extends f> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            kotlin.jvm.internal.n.e(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                kotlin.jvm.internal.n.e(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.n.e(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.n.e(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(name);
            if (!(fullPackage.length() == 0)) {
                c10 = fullPackage + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            kotlin.jvm.internal.n.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static final String c(String className) {
        String p10;
        kotlin.jvm.internal.n.f(className, "className");
        StringBuilder sb = new StringBuilder();
        p10 = b9.o.p(className, ".", "_", false, 4, null);
        sb.append(p10);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f3682b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && o.class.isAssignableFrom(cls);
    }

    public static final m f(Object object) {
        kotlin.jvm.internal.n.f(object, "object");
        boolean z10 = object instanceof m;
        boolean z11 = object instanceof d;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((d) object, (m) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((d) object, null);
        }
        if (z10) {
            return (m) object;
        }
        Class<?> cls = object.getClass();
        u uVar = f3681a;
        if (uVar.d(cls) == 2) {
            List<Constructor<? extends f>> list = f3683c.get(cls);
            kotlin.jvm.internal.n.c(list);
            List<Constructor<? extends f>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(uVar.a(list2.get(0), object));
            }
            int size = list2.size();
            f[] fVarArr = new f[size];
            for (int i10 = 0; i10 < size; i10++) {
                fVarArr[i10] = f3681a.a(list2.get(i10), object);
            }
            return new CompositeGeneratedAdaptersObserver(fVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final int g(Class<?> cls) {
        List<Constructor<? extends f>> b10;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends f> b11 = b(cls);
        if (b11 != null) {
            Map<Class<?>, List<Constructor<? extends f>>> map = f3683c;
            b10 = j8.p.b(b11);
            map.put(cls, b10);
            return 2;
        } else if (b.f3600c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                kotlin.jvm.internal.n.e(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends f>> list = f3683c.get(superclass);
                kotlin.jvm.internal.n.c(list);
                arrayList = new ArrayList(list);
            }
            Class<?>[] interfaces = cls.getInterfaces();
            kotlin.jvm.internal.n.e(interfaces, "klass.interfaces");
            for (Class<?> intrface : interfaces) {
                if (e(intrface)) {
                    kotlin.jvm.internal.n.e(intrface, "intrface");
                    if (d(intrface) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends f>> list2 = f3683c.get(intrface);
                    kotlin.jvm.internal.n.c(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList != null) {
                f3683c.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
