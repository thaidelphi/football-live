package y5;

import java.util.NoSuchElementException;
/* compiled from: AbstractIndexedListIterator.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
abstract class a<E> extends t0<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f33156a;

    /* renamed from: b  reason: collision with root package name */
    private int f33157b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i10, int i11) {
        x5.g.k(i11, i10);
        this.f33156a = i10;
        this.f33157b = i11;
    }

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f33157b < this.f33156a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33157b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i10 = this.f33157b;
            this.f33157b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33157b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f33157b - 1;
            this.f33157b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33157b - 1;
    }
}
