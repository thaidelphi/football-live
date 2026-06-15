package c2;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ModelLoaderRegistry.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final r f5375a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5376b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelLoaderRegistry.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, C0108a<?>> f5377a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: c2.p$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class C0108a<Model> {

            /* renamed from: a  reason: collision with root package name */
            final List<n<Model, ?>> f5378a;

            public C0108a(List<n<Model, ?>> list) {
                this.f5378a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f5377a.clear();
        }

        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0108a<?> c0108a = this.f5377a.get(cls);
            if (c0108a == null) {
                return null;
            }
            return (List<n<Model, ?>>) c0108a.f5378a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f5377a.put(cls, new C0108a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(androidx.core.util.f<List<Throwable>> fVar) {
        this(new r(fVar));
    }

    private static <A> Class<A> b(A a10) {
        return (Class<A>) a10.getClass();
    }

    private synchronized <A> List<n<A, ?>> e(Class<A> cls) {
        List<n<A, ?>> b10;
        b10 = this.f5376b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f5375a.e(cls));
            this.f5376b.c(cls, b10);
        }
        return b10;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.f5375a.b(cls, cls2, oVar);
        this.f5376b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f5375a.g(cls);
    }

    public <A> List<n<A, ?>> d(A a10) {
        List<n<A, ?>> e8 = e(b(a10));
        if (!e8.isEmpty()) {
            int size = e8.size();
            List<n<A, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                n<A, ?> nVar = e8.get(i10);
                if (nVar.a(a10)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (emptyList.isEmpty()) {
                throw new i.c(a10, e8);
            }
            return emptyList;
        }
        throw new i.c(a10);
    }

    private p(r rVar) {
        this.f5376b = new a();
        this.f5375a = rVar;
    }
}
