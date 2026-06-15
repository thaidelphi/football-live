package a9;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sequences.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class o<T> implements f<T>, b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f606a;

    /* renamed from: b  reason: collision with root package name */
    private final int f607b;

    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private int f608a;

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<T> f609b;

        a(o<T> oVar) {
            this.f608a = ((o) oVar).f607b;
            this.f609b = ((o) oVar).f606a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f608a > 0 && this.f609b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f608a;
            if (i10 != 0) {
                this.f608a = i10 - 1;
                return this.f609b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(f<? extends T> sequence, int i10) {
        kotlin.jvm.internal.n.f(sequence, "sequence");
        this.f606a = sequence;
        this.f607b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // a9.b
    public f<T> a(int i10) {
        return i10 >= this.f607b ? this : new o(this.f606a, i10);
    }

    @Override // a9.f
    public Iterator<T> iterator() {
        return new a(this);
    }
}
