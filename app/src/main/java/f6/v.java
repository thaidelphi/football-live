package f6;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: EventBus.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class v implements n6.d, n6.c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<n6.b<Object>, Executor>> f25478a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<n6.a<?>> f25479b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f25480c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor) {
        this.f25480c = executor;
    }

    private synchronized Set<Map.Entry<n6.b<Object>, Executor>> e(n6.a<?> aVar) {
        ConcurrentHashMap<n6.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f25478a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, n6.a aVar) {
        ((n6.b) entry.getKey()).a(aVar);
    }

    @Override // n6.d
    public <T> void a(Class<T> cls, n6.b<? super T> bVar) {
        b(cls, this.f25480c, bVar);
    }

    @Override // n6.d
    public synchronized <T> void b(Class<T> cls, Executor executor, n6.b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        d0.b(executor);
        if (!this.f25478a.containsKey(cls)) {
            this.f25478a.put(cls, new ConcurrentHashMap<>());
        }
        this.f25478a.get(cls).put(bVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Queue<n6.a<?>> queue;
        synchronized (this) {
            queue = this.f25479b;
            if (queue != null) {
                this.f25479b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (n6.a<?> aVar : queue) {
                g(aVar);
            }
        }
    }

    public void g(final n6.a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            Queue<n6.a<?>> queue = this.f25479b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<n6.b<Object>, Executor> entry : e(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: f6.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        v.f(entry, aVar);
                    }
                });
            }
        }
    }
}
