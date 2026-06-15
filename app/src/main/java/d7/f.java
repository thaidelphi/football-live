package d7;

import com.ironsource.b9;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* compiled from: LinkedTreeMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<Comparable> f24366h = new a();

    /* renamed from: a  reason: collision with root package name */
    Comparator<? super K> f24367a;

    /* renamed from: b  reason: collision with root package name */
    e<K, V> f24368b;

    /* renamed from: c  reason: collision with root package name */
    int f24369c;

    /* renamed from: d  reason: collision with root package name */
    int f24370d;

    /* renamed from: e  reason: collision with root package name */
    final e<K, V> f24371e;

    /* renamed from: f  reason: collision with root package name */
    private f<K, V>.b f24372f;

    /* renamed from: g  reason: collision with root package name */
    private f<K, V>.c f24373g;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a extends f<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && f.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c10;
            if ((obj instanceof Map.Entry) && (c10 = f.this.c((Map.Entry) obj)) != null) {
                f.this.f(c10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f24369c;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a extends f<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f24387f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return f.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f.this.f24369c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f24378a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f24379b = null;

        /* renamed from: c  reason: collision with root package name */
        int f24380c;

        d() {
            this.f24378a = f.this.f24371e.f24385d;
            this.f24380c = f.this.f24370d;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f24378a;
            f fVar = f.this;
            if (eVar != fVar.f24371e) {
                if (fVar.f24370d == this.f24380c) {
                    this.f24378a = eVar.f24385d;
                    this.f24379b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24378a != f.this.f24371e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f24379b;
            if (eVar != null) {
                f.this.f(eVar, true);
                this.f24379b = null;
                this.f24380c = f.this.f24370d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public f() {
        this(f24366h);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f24383b;
            e<K, V> eVar3 = eVar.f24384c;
            int i10 = eVar2 != null ? eVar2.f24389h : 0;
            int i11 = eVar3 != null ? eVar3.f24389h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f24383b;
                e<K, V> eVar5 = eVar3.f24384c;
                int i13 = (eVar4 != null ? eVar4.f24389h : 0) - (eVar5 != null ? eVar5.f24389h : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    j(eVar3);
                    i(eVar);
                } else {
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f24383b;
                e<K, V> eVar7 = eVar2.f24384c;
                int i14 = (eVar6 != null ? eVar6.f24389h : 0) - (eVar7 != null ? eVar7.f24389h : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    i(eVar2);
                    j(eVar);
                } else {
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f24389h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f24389h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f24382a;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f24382a;
        eVar.f24382a = null;
        if (eVar2 != null) {
            eVar2.f24382a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f24383b == eVar) {
                eVar3.f24383b = eVar2;
                return;
            } else {
                eVar3.f24384c = eVar2;
                return;
            }
        }
        this.f24368b = eVar2;
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f24383b;
        e<K, V> eVar3 = eVar.f24384c;
        e<K, V> eVar4 = eVar3.f24383b;
        e<K, V> eVar5 = eVar3.f24384c;
        eVar.f24384c = eVar4;
        if (eVar4 != null) {
            eVar4.f24382a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f24383b = eVar;
        eVar.f24382a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f24389h : 0, eVar4 != null ? eVar4.f24389h : 0) + 1;
        eVar.f24389h = max;
        eVar3.f24389h = Math.max(max, eVar5 != null ? eVar5.f24389h : 0) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f24383b;
        e<K, V> eVar3 = eVar.f24384c;
        e<K, V> eVar4 = eVar2.f24383b;
        e<K, V> eVar5 = eVar2.f24384c;
        eVar.f24383b = eVar5;
        if (eVar5 != null) {
            eVar5.f24382a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f24384c = eVar;
        eVar.f24382a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f24389h : 0, eVar5 != null ? eVar5.f24389h : 0) + 1;
        eVar.f24389h = max;
        eVar2.f24389h = Math.max(max, eVar4 != null ? eVar4.f24389h : 0) + 1;
    }

    e<K, V> b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f24367a;
        e<K, V> eVar2 = this.f24368b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f24366h ? (Comparable) k10 : null;
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar2.f24387f);
                } else {
                    i10 = comparator.compare(k10, (K) eVar2.f24387f);
                }
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f24383b : eVar2.f24384c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (z10) {
            e<K, V> eVar4 = this.f24371e;
            if (eVar2 == null) {
                if (comparator == f24366h && !(k10 instanceof Comparable)) {
                    throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
                }
                eVar = new e<>(eVar2, k10, eVar4, eVar4.f24386e);
                this.f24368b = eVar;
            } else {
                eVar = new e<>(eVar2, k10, eVar4, eVar4.f24386e);
                if (i10 < 0) {
                    eVar2.f24383b = eVar;
                } else {
                    eVar2.f24384c = eVar;
                }
                e(eVar2, true);
            }
            this.f24369c++;
            this.f24370d++;
            return eVar;
        }
        return null;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d10 = d(entry.getKey());
        if (d10 != null && a(d10.f24388g, entry.getValue())) {
            return d10;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f24368b = null;
        this.f24369c = 0;
        this.f24370d++;
        e<K, V> eVar = this.f24371e;
        eVar.f24386e = eVar;
        eVar.f24385d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V>.b bVar = this.f24372f;
        if (bVar != null) {
            return bVar;
        }
        f<K, V>.b bVar2 = new b();
        this.f24372f = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f24386e;
            eVar2.f24385d = eVar.f24385d;
            eVar.f24385d.f24386e = eVar2;
        }
        e<K, V> eVar3 = eVar.f24383b;
        e<K, V> eVar4 = eVar.f24384c;
        e<K, V> eVar5 = eVar.f24382a;
        int i11 = 0;
        if (eVar3 != null && eVar4 != null) {
            e<K, V> b10 = eVar3.f24389h > eVar4.f24389h ? eVar3.b() : eVar4.a();
            f(b10, false);
            e<K, V> eVar6 = eVar.f24383b;
            if (eVar6 != null) {
                i10 = eVar6.f24389h;
                b10.f24383b = eVar6;
                eVar6.f24382a = b10;
                eVar.f24383b = null;
            } else {
                i10 = 0;
            }
            e<K, V> eVar7 = eVar.f24384c;
            if (eVar7 != null) {
                i11 = eVar7.f24389h;
                b10.f24384c = eVar7;
                eVar7.f24382a = b10;
                eVar.f24384c = null;
            }
            b10.f24389h = Math.max(i10, i11) + 1;
            h(eVar, b10);
            return;
        }
        if (eVar3 != null) {
            h(eVar, eVar3);
            eVar.f24383b = null;
        } else if (eVar4 != null) {
            h(eVar, eVar4);
            eVar.f24384c = null;
        } else {
            h(eVar, null);
        }
        e(eVar5, false);
        this.f24369c--;
        this.f24370d++;
    }

    e<K, V> g(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            return d10.f24388g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        f<K, V>.c cVar = this.f24373g;
        if (cVar != null) {
            return cVar;
        }
        f<K, V>.c cVar2 = new c();
        this.f24373g = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e<K, V> b10 = b(k10, true);
        V v11 = b10.f24388g;
        b10.f24388g = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g10 = g(obj);
        if (g10 != null) {
            return g10.f24388g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f24369c;
    }

    public f(Comparator<? super K> comparator) {
        this.f24369c = 0;
        this.f24370d = 0;
        this.f24371e = new e<>();
        this.f24367a = comparator == null ? f24366h : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f24382a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f24383b;

        /* renamed from: c  reason: collision with root package name */
        e<K, V> f24384c;

        /* renamed from: d  reason: collision with root package name */
        e<K, V> f24385d;

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f24386e;

        /* renamed from: f  reason: collision with root package name */
        final K f24387f;

        /* renamed from: g  reason: collision with root package name */
        V f24388g;

        /* renamed from: h  reason: collision with root package name */
        int f24389h;

        e() {
            this.f24387f = null;
            this.f24386e = this;
            this.f24385d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f24383b; eVar2 != null; eVar2 = eVar2.f24383b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f24384c; eVar2 != null; eVar2 = eVar2.f24384c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f24387f;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v10 = this.f24388g;
                if (v10 == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v10.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f24387f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f24388g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f24387f;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f24388g;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f24388g;
            this.f24388g = v10;
            return v11;
        }

        public String toString() {
            return this.f24387f + b9.i.f16692b + this.f24388g;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f24382a = eVar;
            this.f24387f = k10;
            this.f24389h = 1;
            this.f24385d = eVar2;
            this.f24386e = eVar3;
            eVar3.f24385d = this;
            eVar2.f24386e = this;
        }
    }
}
