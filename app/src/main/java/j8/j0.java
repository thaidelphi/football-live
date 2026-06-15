package j8;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class j0 extends i0 {
    public static <K, V> Map<K, V> f() {
        b0 b0Var = b0.f27084a;
        kotlin.jvm.internal.n.d(b0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return b0Var;
    }

    public static <K, V> Map<K, V> g(i8.n<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.n.f(pairs, "pairs");
        return pairs.length > 0 ? u(pairs, new LinkedHashMap(g0.c(pairs.length))) : g0.f();
    }

    public static <K, V> Map<K, V> h(Map<? extends K, ? extends V> map, K k10) {
        kotlin.jvm.internal.n.f(map, "<this>");
        Map v10 = g0.v(map);
        v10.remove(k10);
        return j(v10);
    }

    public static <K, V> Map<K, V> i(i8.n<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.n.f(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.c(pairs.length));
        o(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> j(Map<K, ? extends V> map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : i0.e(map);
        }
        return g0.f();
    }

    public static <K, V> Map<K, V> k(Map<? extends K, ? extends V> map, i8.n<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.n.f(map, "<this>");
        kotlin.jvm.internal.n.f(pair, "pair");
        if (map.isEmpty()) {
            return g0.d(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.n.f(map, "<this>");
        kotlin.jvm.internal.n.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void m(Map<? super K, ? super V> map, a9.f<? extends i8.n<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.n.f(map, "<this>");
        kotlin.jvm.internal.n.f(pairs, "pairs");
        for (i8.n<? extends K, ? extends V> nVar : pairs) {
            map.put((K) nVar.a(), (V) nVar.b());
        }
    }

    public static final <K, V> void n(Map<? super K, ? super V> map, Iterable<? extends i8.n<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.n.f(map, "<this>");
        kotlin.jvm.internal.n.f(pairs, "pairs");
        for (i8.n<? extends K, ? extends V> nVar : pairs) {
            map.put((K) nVar.a(), (V) nVar.b());
        }
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, i8.n<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.n.f(map, "<this>");
        kotlin.jvm.internal.n.f(pairs, "pairs");
        for (i8.n<? extends K, ? extends V> nVar : pairs) {
            map.put((K) nVar.a(), (V) nVar.b());
        }
    }

    public static <K, V> Map<K, V> p(a9.f<? extends i8.n<? extends K, ? extends V>> fVar) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        return j(q(fVar, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(a9.f<? extends i8.n<? extends K, ? extends V>> fVar, M destination) {
        kotlin.jvm.internal.n.f(fVar, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        m(destination, fVar);
        return destination;
    }

    public static <K, V> Map<K, V> r(Iterable<? extends i8.n<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return s(iterable, new LinkedHashMap(g0.c(collection.size())));
                }
                return g0.d(iterable instanceof List ? (i8.n<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
            }
            return g0.f();
        }
        return j(s(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M s(Iterable<? extends i8.n<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.n.f(iterable, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        n(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return g0.v(map);
            }
            return i0.e(map);
        }
        return g0.f();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M u(i8.n<? extends K, ? extends V>[] nVarArr, M destination) {
        kotlin.jvm.internal.n.f(nVarArr, "<this>");
        kotlin.jvm.internal.n.f(destination, "destination");
        o(destination, nVarArr);
        return destination;
    }

    public static <K, V> Map<K, V> v(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.n.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
