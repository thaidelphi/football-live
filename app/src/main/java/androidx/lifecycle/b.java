package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ClassesInfoCache.java */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class b {

    /* renamed from: c  reason: collision with root package name */
    static b f3600c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f3601a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f3602b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<i.a, List<C0061b>> f3603a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<C0061b, i.a> f3604b;

        a(Map<C0061b, i.a> map) {
            this.f3604b = map;
            for (Map.Entry<C0061b, i.a> entry : map.entrySet()) {
                i.a value = entry.getValue();
                List<C0061b> list = this.f3603a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3603a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<C0061b> list, p pVar, i.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(pVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(p pVar, i.a aVar, Object obj) {
            b(this.f3603a.get(aVar), pVar, aVar, obj);
            b(this.f3603a.get(i.a.ON_ANY), pVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0061b {

        /* renamed from: a  reason: collision with root package name */
        final int f3605a;

        /* renamed from: b  reason: collision with root package name */
        final Method f3606b;

        C0061b(int i10, Method method) {
            this.f3605a = i10;
            this.f3606b = method;
            method.setAccessible(true);
        }

        void a(p pVar, i.a aVar, Object obj) {
            try {
                int i10 = this.f3605a;
                if (i10 == 0) {
                    this.f3606b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f3606b.invoke(obj, pVar);
                } else if (i10 != 2) {
                } else {
                    this.f3606b.invoke(obj, pVar, aVar);
                }
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0061b) {
                C0061b c0061b = (C0061b) obj;
                return this.f3605a == c0061b.f3605a && this.f3606b.getName().equals(c0061b.f3606b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f3605a * 31) + this.f3606b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f3604b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0061b, i.a> entry : c(cls2).f3604b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (!p.class.isAssignableFrom(parameterTypes[0])) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i10 = 1;
                }
                i.a value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (i.a.class.isAssignableFrom(parameterTypes[1])) {
                        if (value != i.a.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0061b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f3601a.put(cls, aVar);
        this.f3602b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e8) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
        }
    }

    private void e(Map<C0061b, i.a> map, C0061b c0061b, i.a aVar, Class<?> cls) {
        i.a aVar2 = map.get(c0061b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0061b, aVar);
                return;
            }
            return;
        }
        Method method = c0061b.f3606b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f3601a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f3602b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((y) method.getAnnotation(y.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f3602b.put(cls, Boolean.FALSE);
        return false;
    }
}
