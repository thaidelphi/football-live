package a9;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Sequences.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class d<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f577a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f578b;

    /* renamed from: c  reason: collision with root package name */
    private final t8.l<T, Boolean> f579c;

    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f580a;

        /* renamed from: b  reason: collision with root package name */
        private int f581b = -1;

        /* renamed from: c  reason: collision with root package name */
        private T f582c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d<T> f583d;

        a(d<T> dVar) {
            this.f583d = dVar;
            this.f580a = ((d) dVar).f577a.iterator();
        }

        private final void a() {
            while (this.f580a.hasNext()) {
                T next = this.f580a.next();
                if (((Boolean) ((d) this.f583d).f579c.invoke(next)).booleanValue() == ((d) this.f583d).f578b) {
                    this.f582c = next;
                    this.f581b = 1;
                    return;
                }
            }
            this.f581b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f581b == -1) {
                a();
            }
            return this.f581b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f581b == -1) {
                a();
            }
            if (this.f581b != 0) {
                T t10 = this.f582c;
                this.f582c = null;
                this.f581b = -1;
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
    public d(f<? extends T> sequence, boolean z10, t8.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.n.f(sequence, "sequence");
        kotlin.jvm.internal.n.f(predicate, "predicate");
        this.f577a = sequence;
        this.f578b = z10;
        this.f579c = predicate;
    }

    @Override // a9.f
    public Iterator<T> iterator() {
        return new a(this);
    }
}
