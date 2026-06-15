package f6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: Component.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f25412a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<e0<? super T>> f25413b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<r> f25414c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25415d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25416e;

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f25417f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f25418g;

    public static <T> b<T> c(e0<T> e0Var) {
        return new b<>(e0Var, new e0[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(e0<T> e0Var, e0<? super T>... e0VarArr) {
        return new b<>(e0Var, e0VarArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> c<T> l(final T t10, Class<T> cls) {
        return m(cls).f(new h() { // from class: f6.a
            @Override // f6.h
            public final Object a(e eVar) {
                Object q10;
                q10 = c.q(t10, eVar);
                return q10;
            }
        }).d();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).f(new h() { // from class: f6.b
            @Override // f6.h
            public final Object a(e eVar) {
                Object r10;
                r10 = c.r(t10, eVar);
                return r10;
            }
        }).d();
    }

    public Set<r> g() {
        return this.f25414c;
    }

    public h<T> h() {
        return this.f25417f;
    }

    public String i() {
        return this.f25412a;
    }

    public Set<e0<? super T>> j() {
        return this.f25413b;
    }

    public Set<Class<?>> k() {
        return this.f25418g;
    }

    public boolean n() {
        return this.f25415d == 1;
    }

    public boolean o() {
        return this.f25415d == 2;
    }

    public boolean p() {
        return this.f25416e == 0;
    }

    public c<T> t(h<T> hVar) {
        return new c<>(this.f25412a, this.f25413b, this.f25414c, this.f25415d, this.f25416e, hVar, this.f25418g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f25413b.toArray()) + ">{" + this.f25415d + ", type=" + this.f25416e + ", deps=" + Arrays.toString(this.f25414c.toArray()) + "}";
    }

    /* compiled from: Component.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f25419a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<e0<? super T>> f25420b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<r> f25421c;

        /* renamed from: d  reason: collision with root package name */
        private int f25422d;

        /* renamed from: e  reason: collision with root package name */
        private int f25423e;

        /* renamed from: f  reason: collision with root package name */
        private h<T> f25424f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<Class<?>> f25425g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f25423e = 1;
            return this;
        }

        private b<T> i(int i10) {
            d0.d(this.f25422d == 0, "Instantiation type has already been set.");
            this.f25422d = i10;
            return this;
        }

        private void j(e0<?> e0Var) {
            d0.a(!this.f25420b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            d0.c(rVar, "Null dependency");
            j(rVar.b());
            this.f25421c.add(rVar);
            return this;
        }

        public b<T> c() {
            return i(1);
        }

        public c<T> d() {
            d0.d(this.f25424f != null, "Missing required property: factory.");
            return new c<>(this.f25419a, new HashSet(this.f25420b), new HashSet(this.f25421c), this.f25422d, this.f25423e, this.f25424f, this.f25425g);
        }

        public b<T> e() {
            return i(2);
        }

        public b<T> f(h<T> hVar) {
            this.f25424f = (h) d0.c(hVar, "Null factory");
            return this;
        }

        public b<T> h(String str) {
            this.f25419a = str;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f25419a = null;
            HashSet hashSet = new HashSet();
            this.f25420b = hashSet;
            this.f25421c = new HashSet();
            this.f25422d = 0;
            this.f25423e = 0;
            this.f25425g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.f25420b.add(e0.b(cls2));
            }
        }

        @SafeVarargs
        private b(e0<T> e0Var, e0<? super T>... e0VarArr) {
            this.f25419a = null;
            HashSet hashSet = new HashSet();
            this.f25420b = hashSet;
            this.f25421c = new HashSet();
            this.f25422d = 0;
            this.f25423e = 0;
            this.f25425g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0<? super T> e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.f25420b, e0VarArr);
        }
    }

    private c(String str, Set<e0<? super T>> set, Set<r> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f25412a = str;
        this.f25413b = Collections.unmodifiableSet(set);
        this.f25414c = Collections.unmodifiableSet(set2);
        this.f25415d = i10;
        this.f25416e = i11;
        this.f25417f = hVar;
        this.f25418g = Collections.unmodifiableSet(set3);
    }
}
