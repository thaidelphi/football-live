package z1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z1.m;
/* compiled from: GroupedLinkedMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class h<K extends m, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f33425a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<K, a<K, V>> f33426b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GroupedLinkedMap.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f33427a;

        /* renamed from: b  reason: collision with root package name */
        private List<V> f33428b;

        /* renamed from: c  reason: collision with root package name */
        a<K, V> f33429c;

        /* renamed from: d  reason: collision with root package name */
        a<K, V> f33430d;

        a() {
            this(null);
        }

        public void a(V v10) {
            if (this.f33428b == null) {
                this.f33428b = new ArrayList();
            }
            this.f33428b.add(v10);
        }

        public V b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f33428b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f33428b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k10) {
            this.f33430d = this;
            this.f33429c = this;
            this.f33427a = k10;
        }
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f33425a;
        aVar.f33430d = aVar2;
        aVar.f33429c = aVar2.f33429c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f33425a;
        aVar.f33430d = aVar2.f33430d;
        aVar.f33429c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f33430d;
        aVar2.f33429c = aVar.f33429c;
        aVar.f33429c.f33430d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f33429c.f33430d = aVar;
        aVar.f33430d.f33429c = aVar;
    }

    public V a(K k10) {
        a<K, V> aVar = this.f33426b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f33426b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f33426b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f33426b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a aVar = this.f33425a.f33430d; !aVar.equals(this.f33425a); aVar = aVar.f33430d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f33426b.remove(aVar.f33427a);
            ((m) aVar.f33427a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z10 = false;
        for (a aVar = this.f33425a.f33429c; !aVar.equals(this.f33425a); aVar = aVar.f33429c) {
            z10 = true;
            sb.append('{');
            sb.append(aVar.f33427a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
        }
        if (z10) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
