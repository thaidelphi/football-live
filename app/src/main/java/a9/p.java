package a9;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sequences.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class p<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f610a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.l<T, Boolean> f611b;

    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f612a;

        /* renamed from: b  reason: collision with root package name */
        private int f613b = -1;

        /* renamed from: c  reason: collision with root package name */
        private T f614c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<T> f615d;

        a(p<T> pVar) {
            this.f615d = pVar;
            this.f612a = ((p) pVar).f610a.iterator();
        }

        private final void a() {
            if (this.f612a.hasNext()) {
                T next = this.f612a.next();
                if (((Boolean) ((p) this.f615d).f611b.invoke(next)).booleanValue()) {
                    this.f613b = 1;
                    this.f614c = next;
                    return;
                }
            }
            this.f613b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f613b == -1) {
                a();
            }
            return this.f613b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f613b == -1) {
                a();
            }
            if (this.f613b != 0) {
                T t10 = this.f614c;
                this.f614c = null;
                this.f613b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(f<? extends T> sequence, t8.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.n.f(sequence, "sequence");
        kotlin.jvm.internal.n.f(predicate, "predicate");
        this.f610a = sequence;
        this.f611b = predicate;
    }

    @Override // a9.f
    public Iterator<T> iterator() {
        return new a(this);
    }
}
