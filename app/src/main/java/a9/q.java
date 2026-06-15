package a9;

import java.util.Iterator;
/* compiled from: Sequences.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class q<T, R> implements f<R> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f616a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.l<T, R> f617b;

    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Iterator<R> {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q<T, R> f619b;

        a(q<T, R> qVar) {
            this.f619b = qVar;
            this.f618a = ((q) qVar).f616a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f618a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((q) this.f619b).f617b.invoke(this.f618a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(f<? extends T> sequence, t8.l<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.n.f(sequence, "sequence");
        kotlin.jvm.internal.n.f(transformer, "transformer");
        this.f616a = sequence;
        this.f617b = transformer;
    }

    @Override // a9.f
    public Iterator<R> iterator() {
        return new a(this);
    }
}
