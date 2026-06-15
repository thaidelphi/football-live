package y5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMultimap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class f<K, V> implements z<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private transient Set<K> f33204a;

    /* renamed from: b  reason: collision with root package name */
    private transient Collection<V> f33205b;

    /* renamed from: c  reason: collision with root package name */
    private transient Map<K, Collection<V>> f33206c;

    /* compiled from: AbstractMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends AbstractCollection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    @Override // y5.z
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f33206c;
        if (map == null) {
            Map<K, Collection<V>> c10 = c();
            this.f33206c = c10;
            return c10;
        }
        return map;
    }

    public boolean b(Object obj) {
        for (Collection<V> collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> c();

    abstract Set<K> d();

    abstract Collection<V> e();

    public boolean equals(Object obj) {
        return c0.a(this, obj);
    }

    public Set<K> f() {
        Set<K> set = this.f33204a;
        if (set == null) {
            Set<K> d10 = d();
            this.f33204a = d10;
            return d10;
        }
        return set;
    }

    abstract Iterator<V> g();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override // y5.z
    public Collection<V> values() {
        Collection<V> collection = this.f33205b;
        if (collection == null) {
            Collection<V> e8 = e();
            this.f33205b = e8;
            return e8;
        }
        return collection;
    }
}
