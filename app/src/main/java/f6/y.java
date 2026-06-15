package f6;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazySet.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class y<T> implements q6.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f25485b = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<q6.b<T>> f25484a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection<q6.b<T>> collection) {
        this.f25484a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y<?> b(Collection<q6.b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        for (q6.b<T> bVar : this.f25484a) {
            this.f25485b.add(bVar.get());
        }
        this.f25484a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(q6.b<T> bVar) {
        if (this.f25485b == null) {
            this.f25484a.add(bVar);
        } else {
            this.f25485b.add(bVar.get());
        }
    }

    @Override // q6.b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f25485b == null) {
            synchronized (this) {
                if (this.f25485b == null) {
                    this.f25485b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f25485b);
    }
}
