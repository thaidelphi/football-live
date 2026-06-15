package y5;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import y5.f;
import y5.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMapBasedMultimap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class d<K, V> extends y5.f<K, V> implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    private transient Map<K, Collection<V>> f33171d;

    /* renamed from: e  reason: collision with root package name */
    private transient int f33172e;

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends d<K, V>.c<V> {
        a(d dVar) {
            super();
        }

        @Override // y5.d.c
        V a(K k10, V v10) {
            return v10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class b extends y.f<K, Collection<V>> {

        /* renamed from: c  reason: collision with root package name */
        final transient Map<K, Collection<V>> f33173c;

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a extends y.c<K, Collection<V>> {
            a() {
            }

            @Override // y5.y.c
            Map<K, Collection<V>> a() {
                return b.this;
            }

            @Override // y5.y.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return y5.i.c(b.this.f33173c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0387b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    d.this.t(entry.getKey());
                    return true;
                }
                return false;
            }
        }

        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: y5.d$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class C0387b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f33176a;

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f33177b;

            C0387b() {
                this.f33176a = b.this.f33173c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f33176a.next();
                this.f33177b = next.getValue();
                return b.this.e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33176a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                x5.g.o(this.f33177b != null, "no calls to next() since the last call to remove()");
                this.f33176a.remove();
                d.m(d.this, this.f33177b.size());
                this.f33177b.clear();
                this.f33177b = null;
            }
        }

        b(Map<K, Collection<V>> map) {
            this.f33173c = map;
        }

        @Override // y5.y.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) y.g(this.f33173c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.v(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f33173c == d.this.f33171d) {
                d.this.clear();
            } else {
                u.c(new C0387b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return y.f(this.f33173c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f33173c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> o10 = d.this.o();
            o10.addAll(remove);
            d.m(d.this, remove.size());
            remove.clear();
            return o10;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return y.d(key, d.this.v(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f33173c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f33173c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.f();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f33173c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f33173c.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private abstract class c<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f33179a;

        /* renamed from: b  reason: collision with root package name */
        K f33180b = null;

        /* renamed from: c  reason: collision with root package name */
        Collection<V> f33181c = null;

        /* renamed from: d  reason: collision with root package name */
        Iterator<V> f33182d = u.f();

        c() {
            this.f33179a = (Iterator<Map.Entry<K, V>>) d.this.f33171d.entrySet().iterator();
        }

        abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33179a.hasNext() || this.f33182d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f33182d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f33179a.next();
                this.f33180b = next.getKey();
                Collection<V> value = next.getValue();
                this.f33181c = value;
                this.f33182d = value.iterator();
            }
            return a(f0.a(this.f33180b), this.f33182d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f33182d.remove();
            Collection<V> collection = this.f33181c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f33179a.remove();
            }
            d.k(d.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* renamed from: y5.d$d  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class C0388d extends y.d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractMapBasedMultimap.java */
        /* renamed from: y5.d$d$a */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class a implements Iterator<K> {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f33185a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Iterator f33186b;

            a(Iterator it) {
                this.f33186b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f33186b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f33186b.next();
                this.f33185a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                x5.g.o(this.f33185a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f33185a.getValue();
                this.f33186b.remove();
                d.m(d.this, value.size());
                value.clear();
                this.f33185a = null;
            }
        }

        C0388d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = a().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.m(d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = h().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return h().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = h().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return h().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = h().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return h().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // y5.d.h
        /* renamed from: i */
        public NavigableSet<K> f() {
            return new f(h());
        }

        @Override // y5.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // y5.d.h, y5.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: k */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (it.hasNext()) {
                Map.Entry<K, Collection<V>> next = it.next();
                Collection<V> o10 = d.this.o();
                o10.addAll(next.getValue());
                it.remove();
                return y.d(next.getKey(), d.this.u(o10));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = h().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return h().lowerKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // y5.d.h
        /* renamed from: m */
        public NavigableMap<K, Collection<V>> h() {
            return (NavigableMap) super.h();
        }

        @Override // y5.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // y5.d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(h().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(h().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(h().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class f extends d<K, V>.i implements NavigableSet<K> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // y5.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: c */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return b().ceilingKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // y5.d.i
        /* renamed from: d */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(b().descendingMap());
        }

        @Override // y5.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // y5.d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return b().floorKey(k10);
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) u.m(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) u.m(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(b().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(b().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(b().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class g extends d<K, V>.k implements RandomAccess {
        g(d dVar, K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: e  reason: collision with root package name */
        SortedSet<K> f33190e;

        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return h().comparator();
        }

        SortedSet<K> f() {
            return new i(h());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return h().firstKey();
        }

        @Override // y5.d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f33190e;
            if (sortedSet == null) {
                SortedSet<K> f10 = f();
                this.f33190e = f10;
                return f10;
            }
            return sortedSet;
        }

        SortedMap<K, Collection<V>> h() {
            return (SortedMap) this.f33173c;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(h().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(h().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(h().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class i extends d<K, V>.C0388d implements SortedSet<K> {
        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(b().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Map<K, Collection<V>> map) {
        x5.g.d(map.isEmpty());
        this.f33171d = map;
    }

    static /* synthetic */ int j(d dVar) {
        int i10 = dVar.f33172e;
        dVar.f33172e = i10 + 1;
        return i10;
    }

    static /* synthetic */ int k(d dVar) {
        int i10 = dVar.f33172e;
        dVar.f33172e = i10 - 1;
        return i10;
    }

    static /* synthetic */ int l(d dVar, int i10) {
        int i11 = dVar.f33172e + i10;
        dVar.f33172e = i11;
        return i11;
    }

    static /* synthetic */ int m(d dVar, int i10) {
        int i11 = dVar.f33172e - i10;
        dVar.f33172e = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> s(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Object obj) {
        Collection collection = (Collection) y.h(this.f33171d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f33172e -= size;
        }
    }

    @Override // y5.z
    public void clear() {
        for (Collection<V> collection : this.f33171d.values()) {
            collection.clear();
        }
        this.f33171d.clear();
        this.f33172e = 0;
    }

    @Override // y5.f
    Collection<V> e() {
        return new f.a();
    }

    @Override // y5.f
    Iterator<V> g() {
        return new a(this);
    }

    abstract Collection<V> o();

    Collection<V> p(K k10) {
        return o();
    }

    @Override // y5.z
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f33171d.get(k10);
        if (collection == null) {
            Collection<V> p10 = p(k10);
            if (p10.add(v10)) {
                this.f33172e++;
                this.f33171d.put(k10, p10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v10)) {
            this.f33172e++;
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> q() {
        Map<K, Collection<V>> map = this.f33171d;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.f33171d);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.f33171d);
        }
        return new b(this.f33171d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> r() {
        Map<K, Collection<V>> map = this.f33171d;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f33171d);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f33171d);
        }
        return new C0388d(this.f33171d);
    }

    @Override // y5.z
    public int size() {
        return this.f33172e;
    }

    abstract <E> Collection<E> u(Collection<E> collection);

    abstract Collection<V> v(K k10, Collection<V> collection);

    @Override // y5.f, y5.z
    public Collection<V> values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> w(K k10, List<V> list, d<K, V>.j jVar) {
        if (list instanceof RandomAccess) {
            return new g(this, k10, list, jVar);
        }
        return new k(k10, list, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class j extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final K f33193a;

        /* renamed from: b  reason: collision with root package name */
        Collection<V> f33194b;

        /* renamed from: c  reason: collision with root package name */
        final d<K, V>.j f33195c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<V> f33196d;

        j(K k10, Collection<V> collection, d<K, V>.j jVar) {
            this.f33193a = k10;
            this.f33194b = collection;
            this.f33195c = jVar;
            this.f33196d = jVar == null ? null : jVar.c();
        }

        void a() {
            d<K, V>.j jVar = this.f33195c;
            if (jVar == null) {
                d.this.f33171d.put(this.f33193a, this.f33194b);
            } else {
                jVar.a();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            e();
            boolean isEmpty = this.f33194b.isEmpty();
            boolean add = this.f33194b.add(v10);
            if (add) {
                d.j(d.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f33194b.addAll(collection);
            if (addAll) {
                d.l(d.this, this.f33194b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        d<K, V>.j b() {
            return this.f33195c;
        }

        Collection<V> c() {
            return this.f33194b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f33194b.clear();
            d.m(d.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.f33194b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            e();
            return this.f33194b.containsAll(collection);
        }

        K d() {
            return this.f33193a;
        }

        void e() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f33195c;
            if (jVar != null) {
                jVar.e();
                if (this.f33195c.c() != this.f33196d) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f33194b.isEmpty() || (collection = (Collection) d.this.f33171d.get(this.f33193a)) == null) {
            } else {
                this.f33194b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.f33194b.equals(obj);
        }

        void f() {
            d<K, V>.j jVar = this.f33195c;
            if (jVar != null) {
                jVar.f();
            } else if (this.f33194b.isEmpty()) {
                d.this.f33171d.remove(this.f33193a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.f33194b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean remove = this.f33194b.remove(obj);
            if (remove) {
                d.k(d.this);
                f();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f33194b.removeAll(collection);
            if (removeAll) {
                d.l(d.this, this.f33194b.size() - size);
                f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            x5.g.i(collection);
            int size = size();
            boolean retainAll = this.f33194b.retainAll(collection);
            if (retainAll) {
                d.l(d.this, this.f33194b.size() - size);
                f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.f33194b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.f33194b.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f33198a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f33199b;

            a() {
                Collection<V> collection = j.this.f33194b;
                this.f33199b = collection;
                this.f33198a = d.s(collection);
            }

            Iterator<V> a() {
                b();
                return this.f33198a;
            }

            void b() {
                j.this.e();
                if (j.this.f33194b != this.f33199b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f33198a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f33198a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f33198a.remove();
                d.k(d.this);
                j.this.f();
            }

            a(Iterator<V> it) {
                this.f33199b = j.this.f33194b;
                this.f33198a = it;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractMapBasedMultimap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class k extends d<K, V>.j implements List<V> {

        /* compiled from: AbstractMapBasedMultimap.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        private class a extends d<K, V>.j.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                c().add(v10);
                d.j(d.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                c().set(v10);
            }

            public a(int i10) {
                super(k.this.g().listIterator(i10));
            }
        }

        k(K k10, List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            e();
            boolean isEmpty = c().isEmpty();
            g().add(i10, v10);
            d.j(d.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i10, collection);
            if (addAll) {
                d.l(d.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        List<V> g() {
            return (List) c();
        }

        @Override // java.util.List
        public V get(int i10) {
            e();
            return g().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i10) {
            e();
            V remove = g().remove(i10);
            d.k(d.this);
            f();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            e();
            return g().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            e();
            return d.this.w(d(), g().subList(i10, i11), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            e();
            return new a(i10);
        }
    }
}
