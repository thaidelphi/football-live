package y5;

import java.util.Collection;
import java.util.Map;
/* compiled from: Multimap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface z<K, V> {
    Map<K, Collection<V>> a();

    void clear();

    boolean put(K k10, V v10);

    int size();

    Collection<V> values();
}
