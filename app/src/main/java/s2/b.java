package s2;
/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* renamed from: i  reason: collision with root package name */
    private int f30639i;

    @Override // androidx.collection.h, java.util.Map
    public void clear() {
        this.f30639i = 0;
        super.clear();
    }

    @Override // androidx.collection.h, java.util.Map
    public int hashCode() {
        if (this.f30639i == 0) {
            this.f30639i = super.hashCode();
        }
        return this.f30639i;
    }

    @Override // androidx.collection.h
    public void j(androidx.collection.h<? extends K, ? extends V> hVar) {
        this.f30639i = 0;
        super.j(hVar);
    }

    @Override // androidx.collection.h
    public V k(int i10) {
        this.f30639i = 0;
        return (V) super.k(i10);
    }

    @Override // androidx.collection.h
    public V l(int i10, V v10) {
        this.f30639i = 0;
        return (V) super.l(i10, v10);
    }

    @Override // androidx.collection.h, java.util.Map
    public V put(K k10, V v10) {
        this.f30639i = 0;
        return (V) super.put(k10, v10);
    }
}
