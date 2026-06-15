package y5;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractListMultimap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class c<K, V> extends d<K, V> implements v<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // y5.f, y5.z
    public Map<K, Collection<V>> a() {
        return super.a();
    }

    @Override // y5.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // y5.d, y5.z
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override // y5.d
    <E> Collection<E> u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // y5.d
    Collection<V> v(K k10, Collection<V> collection) {
        return w(k10, (List) collection, null);
    }
}
