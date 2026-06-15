package y5;

import com.google.android.gms.common.api.Api;
import com.ironsource.cc;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import y5.p0;
/* compiled from: Maps.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a<K, V> extends r0<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // y5.r0
        /* renamed from: b */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private static abstract class b implements x5.d<Map.Entry<?, ?>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33279a = new a("KEY", 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f33280b = new C0392b("VALUE", 1);

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ b[] f33281c = a();

        /* compiled from: Maps.java */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // x5.d
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: Maps.java */
        /* renamed from: y5.y$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        enum C0392b extends b {
            C0392b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // x5.d
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
        }

        private static /* synthetic */ b[] a() {
            return new b[]{f33279a, f33280b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33281c.clone();
        }

        /* synthetic */ b(String str, int i10, x xVar) {
            this(str, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class c<K, V> extends p0.d<Map.Entry<K, V>> {
        abstract Map<K, V> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // y5.p0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) x5.g.i(collection));
            } catch (UnsupportedOperationException unused) {
                return p0.j(this, collection.iterator());
            }
        }

        @Override // y5.p0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) x5.g.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = p0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g10.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(g10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class d<K, V> extends p0.d<K> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f33282a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Map<K, V> map) {
            this.f33282a = (Map) x5.g.i(map);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map<K, V> a() {
            return this.f33282a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f33283a;

        e(Map<K, V> map) {
            this.f33283a = (Map) x5.g.i(map);
        }

        final Map<K, V> a() {
            return this.f33283a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return y.k(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (x5.f.a(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) x5.g.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = p0.f();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) x5.g.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = p0.f();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f33284a;

        /* renamed from: b  reason: collision with root package name */
        private transient Collection<V> f33285b;

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f33284a;
            if (set == null) {
                Set<Map.Entry<K, V>> a10 = a();
                this.f33284a = a10;
                return a10;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f33285b;
            if (collection == null) {
                Collection<V> b10 = b();
                this.f33285b = b10;
                return b10;
            }
            return collection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        h.b(i10, "expectedSize");
        return i10 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Map<?, ?> map, Object obj) {
        return u.d(k(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new p(k10, v10);
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Map<?, ?> map, Object obj) {
        x5.g.i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V g(Map<?, V> map, Object obj) {
        x5.g.i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V h(Map<?, V> map, Object obj) {
        x5.g.i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(Map<?, ?> map) {
        StringBuilder b10 = i.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            z10 = false;
            b10.append(entry.getKey());
            b10.append(cc.T);
            b10.append(entry.getValue());
        }
        b10.append('}');
        return b10.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> x5.d<Map.Entry<?, V>, V> j() {
        return b.f33280b;
    }

    static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
