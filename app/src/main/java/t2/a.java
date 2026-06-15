package t2;

import android.util.Log;
import androidx.core.util.h;
import java.util.ArrayList;
import java.util.List;
/* compiled from: FactoryPools.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final g<Object> f30942a = new C0357a();

    /* compiled from: FactoryPools.java */
    /* renamed from: t2.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class C0357a implements g<Object> {
        C0357a() {
        }

        @Override // t2.a.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // t2.a.d
        /* renamed from: b */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // t2.a.g
        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class e<T> implements androidx.core.util.f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f30943a;

        /* renamed from: b  reason: collision with root package name */
        private final g<T> f30944b;

        /* renamed from: c  reason: collision with root package name */
        private final androidx.core.util.f<T> f30945c;

        e(androidx.core.util.f<T> fVar, d<T> dVar, g<T> gVar) {
            this.f30945c = fVar;
            this.f30943a = dVar;
            this.f30944b = gVar;
        }

        @Override // androidx.core.util.f
        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).d().b(true);
            }
            this.f30944b.a(t10);
            return this.f30945c.a(t10);
        }

        @Override // androidx.core.util.f
        public T b() {
            T b10 = this.f30945c.b();
            if (b10 == null) {
                b10 = this.f30943a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof f) {
                ((f) b10).d().b(false);
            }
            return b10;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface f {
        t2.c d();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface g<T> {
        void a(T t10);
    }

    private static <T extends f> androidx.core.util.f<T> a(androidx.core.util.f<T> fVar, d<T> dVar) {
        return b(fVar, dVar, c());
    }

    private static <T> androidx.core.util.f<T> b(androidx.core.util.f<T> fVar, d<T> dVar, g<T> gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) f30942a;
    }

    public static <T extends f> androidx.core.util.f<T> d(int i10, d<T> dVar) {
        return a(new h(i10), dVar);
    }

    public static <T> androidx.core.util.f<List<T>> e() {
        return f(20);
    }

    public static <T> androidx.core.util.f<List<T>> f(int i10) {
        return b(new h(i10), new b(), new c());
    }
}
