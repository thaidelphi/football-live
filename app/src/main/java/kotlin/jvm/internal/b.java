package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ArrayIterator.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class b<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T[] f27365a;

    /* renamed from: b  reason: collision with root package name */
    private int f27366b;

    public b(T[] array) {
        n.f(array, "array");
        this.f27365a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27366b < this.f27365a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f27365a;
            int i10 = this.f27366b;
            this.f27366b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f27366b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
