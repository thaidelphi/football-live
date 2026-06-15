package k8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.n;
/* compiled from: MapBuilder.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f<V> extends j8.d<V> {

    /* renamed from: a  reason: collision with root package name */
    private final c<?, V> f27300a;

    public f(c<?, V> backing) {
        n.f(backing, "backing");
        this.f27300a = backing;
    }

    @Override // j8.d
    public int a() {
        return this.f27300a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        n.f(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f27300a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27300a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f27300a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f27300a.L();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f27300a.J(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        n.f(elements, "elements");
        this.f27300a.j();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        n.f(elements, "elements");
        this.f27300a.j();
        return super.retainAll(elements);
    }
}
