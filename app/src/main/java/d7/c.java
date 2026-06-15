package d7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* compiled from: ConstructorConstructor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, b7.f<?>> f24339a;

    /* renamed from: b  reason: collision with root package name */
    private final f7.b f24340b = f7.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a<T> implements d7.g<T> {
        a() {
        }

        @Override // d7.g
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b<T> implements d7.g<T> {
        b() {
        }

        @Override // d7.g
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: d7.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class C0264c<T> implements d7.g<T> {
        C0264c() {
        }

        @Override // d7.g
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d<T> implements d7.g<T> {
        d() {
        }

        @Override // d7.g
        public T a() {
            return (T) new d7.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e<T> implements d7.g<T> {

        /* renamed from: a  reason: collision with root package name */
        private final d7.k f24345a = d7.k.b();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f24346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Type f24347c;

        e(Class cls, Type type) {
            this.f24346b = cls;
            this.f24347c = type;
        }

        @Override // d7.g
        public T a() {
            try {
                return (T) this.f24345a.c(this.f24346b);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f24347c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e8);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class f<T> implements d7.g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b7.f f24349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f24350b;

        f(b7.f fVar, Type type) {
            this.f24349a = fVar;
            this.f24350b = type;
        }

        @Override // d7.g
        public T a() {
            return (T) this.f24349a.a(this.f24350b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class g<T> implements d7.g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b7.f f24352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f24353b;

        g(b7.f fVar, Type type) {
            this.f24352a = fVar;
            this.f24353b = type;
        }

        @Override // d7.g
        public T a() {
            return (T) this.f24352a.a(this.f24353b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class h<T> implements d7.g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f24355a;

        h(Constructor constructor) {
            this.f24355a = constructor;
        }

        @Override // d7.g
        public T a() {
            try {
                return (T) this.f24355a.newInstance(null);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Failed to invoke " + this.f24355a + " with no args", e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke " + this.f24355a + " with no args", e11.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class i<T> implements d7.g<T> {
        i() {
        }

        @Override // d7.g
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class j<T> implements d7.g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f24358a;

        j(Type type) {
            this.f24358a = type;
        }

        @Override // d7.g
        public T a() {
            Type type = this.f24358a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new b7.k("Invalid EnumSet type: " + this.f24358a.toString());
            }
            throw new b7.k("Invalid EnumSet type: " + this.f24358a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class k<T> implements d7.g<T> {
        k() {
        }

        @Override // d7.g
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class l<T> implements d7.g<T> {
        l() {
        }

        @Override // d7.g
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class m<T> implements d7.g<T> {
        m() {
        }

        @Override // d7.g
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class n<T> implements d7.g<T> {
        n() {
        }

        @Override // d7.g
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, b7.f<?>> map) {
        this.f24339a = map;
    }

    private <T> d7.g<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f24340b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> d7.g<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l();
            }
            return new m();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(g7.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) {
                return new C0264c();
            }
            return new d();
        } else {
            return null;
        }
    }

    private <T> d7.g<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> d7.g<T> a(g7.a<T> aVar) {
        Type e8 = aVar.e();
        Class<? super T> c10 = aVar.c();
        b7.f<?> fVar = this.f24339a.get(e8);
        if (fVar != null) {
            return new f(fVar, e8);
        }
        b7.f<?> fVar2 = this.f24339a.get(c10);
        if (fVar2 != null) {
            return new g(fVar2, e8);
        }
        d7.g<T> b10 = b(c10);
        if (b10 != null) {
            return b10;
        }
        d7.g<T> c11 = c(e8, c10);
        return c11 != null ? c11 : d(e8, c10);
    }

    public String toString() {
        return this.f24339a.toString();
    }
}
