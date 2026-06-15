package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import k0.a;
/* compiled from: ViewModelProvider.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f3654a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3655b;

    /* renamed from: c  reason: collision with root package name */
    private final k0.a f3656c;

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3662a = a.f3663a;

        /* compiled from: ViewModelProvider.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f3663a = new a();

            private a() {
            }
        }

        <T extends k0> T a(Class<T> cls);

        <T extends k0> T b(Class<T> cls, k0.a aVar);
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements b {

        /* renamed from: c  reason: collision with root package name */
        private static c f3665c;

        /* renamed from: b  reason: collision with root package name */
        public static final a f3664b = new a(null);

        /* renamed from: d  reason: collision with root package name */
        public static final a.b<String> f3666d = a.C0066a.f3667a;

        /* compiled from: ViewModelProvider.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class a {

            /* compiled from: ViewModelProvider.kt */
            /* renamed from: androidx.lifecycle.l0$c$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            private static final class C0066a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0066a f3667a = new C0066a();

                private C0066a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final c a() {
                if (c.f3665c == null) {
                    c.f3665c = new c();
                }
                c cVar = c.f3665c;
                kotlin.jvm.internal.n.c(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.l0.b
        public <T extends k0> T a(Class<T> modelClass) {
            kotlin.jvm.internal.n.f(modelClass, "modelClass");
            try {
                T newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.n.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            }
        }

        @Override // androidx.lifecycle.l0.b
        public /* synthetic */ k0 b(Class cls, k0.a aVar) {
            return m0.b(this, cls, aVar);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {
        public void c(k0 viewModel) {
            kotlin.jvm.internal.n.f(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(o0 store, b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.n.f(store, "store");
        kotlin.jvm.internal.n.f(factory, "factory");
    }

    public l0(o0 store, b factory, k0.a defaultCreationExtras) {
        kotlin.jvm.internal.n.f(store, "store");
        kotlin.jvm.internal.n.f(factory, "factory");
        kotlin.jvm.internal.n.f(defaultCreationExtras, "defaultCreationExtras");
        this.f3654a = store;
        this.f3655b = factory;
        this.f3656c = defaultCreationExtras;
    }

    public <T extends k0> T a(Class<T> modelClass) {
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends k0> T b(String key, Class<T> modelClass) {
        T t10;
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(modelClass, "modelClass");
        T t11 = (T) this.f3654a.b(key);
        if (modelClass.isInstance(t11)) {
            b bVar = this.f3655b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                kotlin.jvm.internal.n.c(t11);
                dVar.c(t11);
            }
            kotlin.jvm.internal.n.d(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t11;
        }
        k0.d dVar2 = new k0.d(this.f3656c);
        dVar2.c(c.f3666d, key);
        try {
            t10 = (T) this.f3655b.b(modelClass, dVar2);
        } catch (AbstractMethodError unused) {
            t10 = (T) this.f3655b.a(modelClass);
        }
        this.f3654a.d(key, t10);
        return t10;
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends c {

        /* renamed from: g  reason: collision with root package name */
        private static a f3658g;

        /* renamed from: e  reason: collision with root package name */
        private final Application f3660e;

        /* renamed from: f  reason: collision with root package name */
        public static final C0064a f3657f = new C0064a(null);

        /* renamed from: h  reason: collision with root package name */
        public static final a.b<Application> f3659h = C0064a.C0065a.f3661a;

        /* compiled from: ViewModelProvider.kt */
        /* renamed from: androidx.lifecycle.l0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static final class C0064a {

            /* compiled from: ViewModelProvider.kt */
            /* renamed from: androidx.lifecycle.l0$a$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
            private static final class C0065a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0065a f3661a = new C0065a();

                private C0065a() {
                }
            }

            private C0064a() {
            }

            public /* synthetic */ C0064a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.n.f(application, "application");
                if (a.f3658g == null) {
                    a.f3658g = new a(application);
                }
                a aVar = a.f3658g;
                kotlin.jvm.internal.n.c(aVar);
                return aVar;
            }
        }

        private a(Application application, int i10) {
            this.f3660e = application;
        }

        private final <T extends k0> T g(Class<T> cls, Application application) {
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    kotlin.jvm.internal.n.e(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e8);
                } catch (InstantiationException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                }
            }
            return (T) super.a(cls);
        }

        @Override // androidx.lifecycle.l0.c, androidx.lifecycle.l0.b
        public <T extends k0> T a(Class<T> modelClass) {
            kotlin.jvm.internal.n.f(modelClass, "modelClass");
            Application application = this.f3660e;
            if (application != null) {
                return (T) g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.l0.c, androidx.lifecycle.l0.b
        public <T extends k0> T b(Class<T> modelClass, k0.a extras) {
            kotlin.jvm.internal.n.f(modelClass, "modelClass");
            kotlin.jvm.internal.n.f(extras, "extras");
            if (this.f3660e != null) {
                return (T) a(modelClass);
            }
            Application application = (Application) extras.a(f3659h);
            if (application != null) {
                return (T) g(modelClass, application);
            }
            if (!androidx.lifecycle.a.class.isAssignableFrom(modelClass)) {
                return (T) super.a(modelClass);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.n.f(application, "application");
        }
    }

    public /* synthetic */ l0(o0 o0Var, b bVar, k0.a aVar, int i10, kotlin.jvm.internal.h hVar) {
        this(o0Var, bVar, (i10 & 4) != 0 ? a.C0305a.f27116b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(p0 owner, b factory) {
        this(owner.getViewModelStore(), factory, n0.a(owner));
        kotlin.jvm.internal.n.f(owner, "owner");
        kotlin.jvm.internal.n.f(factory, "factory");
    }
}
