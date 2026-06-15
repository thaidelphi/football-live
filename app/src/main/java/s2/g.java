package s2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: LruCache.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, a<Y>> f30648a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    private final long f30649b;

    /* renamed from: c  reason: collision with root package name */
    private long f30650c;

    /* renamed from: d  reason: collision with root package name */
    private long f30651d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LruCache.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        final Y f30652a;

        /* renamed from: b  reason: collision with root package name */
        final int f30653b;

        a(Y y10, int i10) {
            this.f30652a = y10;
            this.f30653b = i10;
        }
    }

    public g(long j10) {
        this.f30649b = j10;
        this.f30650c = j10;
    }

    private void f() {
        m(this.f30650c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(T t10) {
        a<Y> aVar;
        aVar = this.f30648a.get(t10);
        return aVar != null ? aVar.f30652a : null;
    }

    public synchronized long h() {
        return this.f30650c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int i(Y y10) {
        return 1;
    }

    protected void j(T t10, Y y10) {
    }

    public synchronized Y k(T t10, Y y10) {
        int i10 = i(y10);
        long j10 = i10;
        if (j10 >= this.f30650c) {
            j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f30651d += j10;
        }
        a<Y> put = this.f30648a.put(t10, y10 == null ? null : new a<>(y10, i10));
        if (put != null) {
            this.f30651d -= put.f30653b;
            if (!put.f30652a.equals(y10)) {
                j(t10, put.f30652a);
            }
        }
        f();
        return put != null ? put.f30652a : null;
    }

    public synchronized Y l(T t10) {
        a<Y> remove = this.f30648a.remove(t10);
        if (remove == null) {
            return null;
        }
        this.f30651d -= remove.f30653b;
        return remove.f30652a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void m(long j10) {
        while (this.f30651d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f30648a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f30651d -= value.f30653b;
            T key = next.getKey();
            it.remove();
            j(key, value.f30652a);
        }
    }
}
