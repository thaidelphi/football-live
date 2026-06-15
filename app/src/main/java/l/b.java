package l;

import com.ironsource.b9;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: SafeIterableMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f27386a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f27387b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f27388c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f27389d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f27393d;
        }

        @Override // l.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f27392c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: l.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class C0309b<K, V> extends e<K, V> {
        C0309b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f27392c;
        }

        @Override // l.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f27393d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f27390a;

        /* renamed from: b  reason: collision with root package name */
        final V f27391b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f27392c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f27393d;

        c(K k10, V v10) {
            this.f27390a = k10;
            this.f27391b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f27390a.equals(cVar.f27390a) && this.f27391b.equals(cVar.f27391b);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f27390a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f27391b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f27390a.hashCode() ^ this.f27391b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f27390a + b9.i.f16692b + this.f27391b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f27394a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f27395b = true;

        d() {
        }

        @Override // l.b.f
        void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f27394a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f27393d;
                this.f27394a = cVar3;
                this.f27395b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f27395b) {
                this.f27395b = false;
                this.f27394a = b.this.f27386a;
            } else {
                c<K, V> cVar = this.f27394a;
                this.f27394a = cVar != null ? cVar.f27392c : null;
            }
            return this.f27394a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f27395b) {
                return b.this.f27386a != null;
            }
            c<K, V> cVar = this.f27394a;
            return (cVar == null || cVar.f27392c == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f27397a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f27398b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f27397a = cVar2;
            this.f27398b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f27398b;
            c<K, V> cVar2 = this.f27397a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // l.b.f
        public void a(c<K, V> cVar) {
            if (this.f27397a == cVar && cVar == this.f27398b) {
                this.f27398b = null;
                this.f27397a = null;
            }
            c<K, V> cVar2 = this.f27397a;
            if (cVar2 == cVar) {
                this.f27397a = b(cVar2);
            }
            if (this.f27398b == cVar) {
                this.f27398b = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f27398b;
            this.f27398b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27398b != null;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f27386a;
    }

    protected c<K, V> b(K k10) {
        c<K, V> cVar = this.f27386a;
        while (cVar != null && !cVar.f27390a.equals(k10)) {
            cVar = cVar.f27392c;
        }
        return cVar;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f27388c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f27387b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0309b c0309b = new C0309b(this.f27387b, this.f27386a);
        this.f27388c.put(c0309b, Boolean.FALSE);
        return c0309b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<K, V> e(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f27389d++;
        c<K, V> cVar2 = this.f27387b;
        if (cVar2 == null) {
            this.f27386a = cVar;
            this.f27387b = cVar;
            return cVar;
        }
        cVar2.f27392c = cVar;
        cVar.f27393d = cVar2;
        this.f27387b = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public V f(K k10, V v10) {
        c<K, V> b10 = b(k10);
        if (b10 != null) {
            return b10.f27391b;
        }
        e(k10, v10);
        return null;
    }

    public V g(K k10) {
        c<K, V> b10 = b(k10);
        if (b10 == null) {
            return null;
        }
        this.f27389d--;
        if (!this.f27388c.isEmpty()) {
            for (f<K, V> fVar : this.f27388c.keySet()) {
                fVar.a(b10);
            }
        }
        c<K, V> cVar = b10.f27393d;
        if (cVar != null) {
            cVar.f27392c = b10.f27392c;
        } else {
            this.f27386a = b10.f27392c;
        }
        c<K, V> cVar2 = b10.f27392c;
        if (cVar2 != null) {
            cVar2.f27393d = cVar;
        } else {
            this.f27387b = cVar;
        }
        b10.f27392c = null;
        b10.f27393d = null;
        return b10.f27391b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f27386a, this.f27387b);
        this.f27388c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f27389d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b9.i.f16696d);
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(b9.i.f16698e);
        return sb.toString();
    }
}
