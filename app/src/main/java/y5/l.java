package y5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: ForwardingMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class l<K, V> extends m implements Map<K, V> {
    protected abstract Map<K, V> b();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(Object obj) {
        return y.b(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(Object obj) {
        return y.c(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return p0.d(entrySet());
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().values();
    }
}
