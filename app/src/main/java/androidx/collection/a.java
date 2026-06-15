package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: ArrayMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    g<K, V> f1919h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayMap.java */
    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0028a extends g<K, V> {
        C0028a() {
        }

        @Override // androidx.collection.g
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.g
        protected Object b(int i10, int i11) {
            return a.this.f1964b[(i10 << 1) + i11];
        }

        @Override // androidx.collection.g
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.g
        protected int d() {
            return a.this.f1965c;
        }

        @Override // androidx.collection.g
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // androidx.collection.g
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // androidx.collection.g
        protected void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // androidx.collection.g
        protected void h(int i10) {
            a.this.k(i10);
        }

        @Override // androidx.collection.g
        protected V i(int i10, V v10) {
            return a.this.l(i10, v10);
        }
    }

    public a() {
    }

    private g<K, V> n() {
        if (this.f1919h == null) {
            this.f1919h = new C0028a();
        }
        return this.f1919h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return g.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f1965c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return n().n();
    }

    public a(int i10) {
        super(i10);
    }

    public a(h hVar) {
        super(hVar);
    }
}
