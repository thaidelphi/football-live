package k8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: MapBuilder.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final c<K, V> f27298a;

    public d(c<K, V> backing) {
        n.f(backing, "backing");
        this.f27298a = backing;
    }

    @Override // j8.f
    public int a() {
        return this.f27298a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        n.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // k8.a
    public boolean c(Map.Entry<? extends K, ? extends V> element) {
        n.f(element, "element");
        return this.f27298a.m(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f27298a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        n.f(elements, "elements");
        return this.f27298a.l(elements);
    }

    @Override // k8.a
    public boolean d(Map.Entry element) {
        n.f(element, "element");
        return this.f27298a.F(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: e */
    public boolean add(Map.Entry<K, V> element) {
        n.f(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f27298a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f27298a.q();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        n.f(elements, "elements");
        this.f27298a.j();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        n.f(elements, "elements");
        this.f27298a.j();
        return super.retainAll(elements);
    }
}
