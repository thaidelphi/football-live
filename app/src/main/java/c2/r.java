package c2;

import c2.n;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r {

    /* renamed from: e  reason: collision with root package name */
    private static final c f5388e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final n<Object, Object> f5389f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<b<?, ?>> f5390a;

    /* renamed from: b  reason: collision with root package name */
    private final c f5391b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b<?, ?>> f5392c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.core.util.f<List<Throwable>> f5393d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // c2.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // c2.n
        public n.a<Object> b(Object obj, int i10, int i11, w1.h hVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Model> f5394a;

        /* renamed from: b  reason: collision with root package name */
        final Class<Data> f5395b;

        /* renamed from: c  reason: collision with root package name */
        final o<? extends Model, ? extends Data> f5396c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f5394a = cls;
            this.f5395b = cls2;
            this.f5396c = oVar;
        }

        public boolean a(Class<?> cls) {
            return this.f5394a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f5395b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class c {
        c() {
        }

        public <Model, Data> q<Model, Data> a(List<n<Model, Data>> list, androidx.core.util.f<List<Throwable>> fVar) {
            return new q<>(list, fVar);
        }
    }

    public r(androidx.core.util.f<List<Throwable>> fVar) {
        this(fVar, f5388e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar, boolean z10) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f5390a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        return (n) s2.j.d(bVar.f5396c.b(this));
    }

    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f5389f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized <Model, Data> n<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b<?, ?> bVar : this.f5390a) {
                if (this.f5392c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f5392c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f5392c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f5391b.a(arrayList, this.f5393d);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f();
            } else {
                throw new i.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f5392c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model> List<n<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f5390a) {
                if (!this.f5392c.contains(bVar) && bVar.a(cls)) {
                    this.f5392c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f5392c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f5392c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f5390a) {
            if (!arrayList.contains(bVar.f5395b) && bVar.a(cls)) {
                arrayList.add(bVar.f5395b);
            }
        }
        return arrayList;
    }

    r(androidx.core.util.f<List<Throwable>> fVar, c cVar) {
        this.f5390a = new ArrayList();
        this.f5392c = new HashSet();
        this.f5393d = fVar;
        this.f5391b = cVar;
    }
}
