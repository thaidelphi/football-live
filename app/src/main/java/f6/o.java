package f6;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import f6.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ComponentRuntime.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class o implements e, i6.a {

    /* renamed from: h  reason: collision with root package name */
    private static final q6.b<Set<Object>> f25454h = new q6.b() { // from class: f6.n
        @Override // q6.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Map<c<?>, q6.b<?>> f25455a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<e0<?>, q6.b<?>> f25456b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<e0<?>, y<?>> f25457c;

    /* renamed from: d  reason: collision with root package name */
    private final List<q6.b<ComponentRegistrar>> f25458d;

    /* renamed from: e  reason: collision with root package name */
    private final v f25459e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Boolean> f25460f;

    /* renamed from: g  reason: collision with root package name */
    private final j f25461g;

    /* compiled from: ComponentRuntime.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f25462a;

        /* renamed from: b  reason: collision with root package name */
        private final List<q6.b<ComponentRegistrar>> f25463b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<c<?>> f25464c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private j f25465d = j.f25446a;

        b(Executor executor) {
            this.f25462a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f25464c.add(cVar);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f25463b.add(new q6.b() { // from class: f6.p
                @Override // q6.b
                public final Object get() {
                    ComponentRegistrar f10;
                    f10 = o.b.f(ComponentRegistrar.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection<q6.b<ComponentRegistrar>> collection) {
            this.f25463b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f25462a, this.f25463b, this.f25464c, this.f25465d);
        }

        public b g(j jVar) {
            this.f25465d = jVar;
            return this;
        }
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List<c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<q6.b<ComponentRegistrar>> it = this.f25458d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f25461g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e8) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e8);
                }
            }
            if (this.f25455a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f25455a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final c<?> cVar : list) {
                this.f25455a.put(cVar, new x(new q6.b() { // from class: f6.m
                    @Override // q6.b
                    public final Object get() {
                        Object p10;
                        p10 = o.this.p(cVar);
                        return p10;
                    }
                }));
            }
            arrayList.addAll(u(list));
            arrayList.addAll(v());
            t();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        s();
    }

    private void m(Map<c<?>, q6.b<?>> map, boolean z10) {
        for (Map.Entry<c<?>, q6.b<?>> entry : map.entrySet()) {
            c<?> key = entry.getKey();
            q6.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z10)) {
                value.get();
            }
        }
        this.f25459e.d();
    }

    private static <T> List<T> o(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            arrayList.add(t10);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(c cVar) {
        return cVar.h().a(new f0(cVar, this));
    }

    private void s() {
        Boolean bool = this.f25460f.get();
        if (bool != null) {
            m(this.f25455a, bool.booleanValue());
        }
    }

    private void t() {
        for (c<?> cVar : this.f25455a.keySet()) {
            for (r rVar : cVar.g()) {
                if (rVar.f() && !this.f25457c.containsKey(rVar.b())) {
                    this.f25457c.put(rVar.b(), y.b(Collections.emptySet()));
                } else if (this.f25456b.containsKey(rVar.b())) {
                    continue;
                } else if (!rVar.e()) {
                    if (!rVar.f()) {
                        this.f25456b.put(rVar.b(), c0.c());
                    }
                } else {
                    throw new z(String.format("Unsatisfied dependency for component %s: %s", cVar, rVar.b()));
                }
            }
        }
    }

    private List<Runnable> u(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c<?> cVar : list) {
            if (cVar.p()) {
                final q6.b<?> bVar = this.f25455a.get(cVar);
                for (e0<? super Object> e0Var : cVar.j()) {
                    if (!this.f25456b.containsKey(e0Var)) {
                        this.f25456b.put(e0Var, bVar);
                    } else {
                        final c0 c0Var = (c0) this.f25456b.get(e0Var);
                        arrayList.add(new Runnable() { // from class: f6.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0.this.f(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> v() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<c<?>, q6.b<?>> entry : this.f25455a.entrySet()) {
            c<?> key = entry.getKey();
            if (!key.p()) {
                q6.b<?> value = entry.getValue();
                for (e0<? super Object> e0Var : key.j()) {
                    if (!hashMap.containsKey(e0Var)) {
                        hashMap.put(e0Var, new HashSet());
                    }
                    ((Set) hashMap.get(e0Var)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f25457c.containsKey(entry2.getKey())) {
                this.f25457c.put((e0) entry2.getKey(), y.b((Collection) entry2.getValue()));
            } else {
                final y<?> yVar = this.f25457c.get(entry2.getKey());
                for (final q6.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: f6.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // f6.e
    public /* synthetic */ Object a(Class cls) {
        return d.b(this, cls);
    }

    @Override // f6.e
    public /* synthetic */ Set b(Class cls) {
        return d.e(this, cls);
    }

    @Override // f6.e
    public synchronized <T> q6.b<Set<T>> c(e0<T> e0Var) {
        y<?> yVar = this.f25457c.get(e0Var);
        if (yVar != null) {
            return yVar;
        }
        return (q6.b<Set<T>>) f25454h;
    }

    @Override // f6.e
    public /* synthetic */ Object d(e0 e0Var) {
        return d.a(this, e0Var);
    }

    @Override // f6.e
    public /* synthetic */ q6.b e(Class cls) {
        return d.c(this, cls);
    }

    @Override // f6.e
    public synchronized <T> q6.b<T> f(e0<T> e0Var) {
        d0.c(e0Var, "Null interface requested.");
        return (q6.b<T>) this.f25456b.get(e0Var);
    }

    @Override // f6.e
    public /* synthetic */ Set g(e0 e0Var) {
        return d.d(this, e0Var);
    }

    public void n(boolean z10) {
        HashMap hashMap;
        if (this.f25460f.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f25455a);
            }
            m(hashMap, z10);
        }
    }

    private o(Executor executor, Iterable<q6.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, j jVar) {
        this.f25455a = new HashMap();
        this.f25456b = new HashMap();
        this.f25457c = new HashMap();
        this.f25460f = new AtomicReference<>();
        v vVar = new v(executor);
        this.f25459e = vVar;
        this.f25461g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(vVar, v.class, n6.d.class, n6.c.class));
        arrayList.add(c.s(this, i6.a.class, new Class[0]));
        for (c<?> cVar : collection) {
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        this.f25458d = o(iterable);
        l(arrayList);
    }
}
