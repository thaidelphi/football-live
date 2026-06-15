package l;

import java.util.HashMap;
import java.util.Map;
import l.b;
/* compiled from: FastSafeIterableMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f27385e = new HashMap<>();

    @Override // l.b
    protected b.c<K, V> b(K k10) {
        return this.f27385e.get(k10);
    }

    public boolean contains(K k10) {
        return this.f27385e.containsKey(k10);
    }

    @Override // l.b
    public V f(K k10, V v10) {
        b.c<K, V> b10 = b(k10);
        if (b10 != null) {
            return b10.f27391b;
        }
        this.f27385e.put(k10, e(k10, v10));
        return null;
    }

    @Override // l.b
    public V g(K k10) {
        V v10 = (V) super.g(k10);
        this.f27385e.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> h(K k10) {
        if (contains(k10)) {
            return this.f27385e.get(k10).f27393d;
        }
        return null;
    }
}
