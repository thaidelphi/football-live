package y5;

import java.util.Iterator;
/* compiled from: TransformedIterator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class r0<F, T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    final Iterator<? extends F> f33271a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(Iterator<? extends F> it) {
        this.f33271a = (Iterator) x5.g.i(it);
    }

    abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33271a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f33271a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f33271a.remove();
    }
}
