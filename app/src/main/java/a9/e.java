package a9;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final t8.a<T> f584a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.l<T, T> f585b;

    /* compiled from: Sequences.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private T f586a;

        /* renamed from: b  reason: collision with root package name */
        private int f587b = -2;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f588c;

        a(e<T> eVar) {
            this.f588c = eVar;
        }

        private final void a() {
            T t10;
            if (this.f587b == -2) {
                t10 = (T) ((e) this.f588c).f584a.invoke();
            } else {
                t8.l lVar = ((e) this.f588c).f585b;
                T t11 = this.f586a;
                kotlin.jvm.internal.n.c(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f586a = t10;
            this.f587b = t10 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f587b < 0) {
                a();
            }
            return this.f587b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f587b < 0) {
                a();
            }
            if (this.f587b != 0) {
                T t10 = this.f586a;
                kotlin.jvm.internal.n.d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f587b = -1;
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
    public e(t8.a<? extends T> getInitialValue, t8.l<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.n.f(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.n.f(getNextValue, "getNextValue");
        this.f584a = getInitialValue;
        this.f585b = getNextValue;
    }

    @Override // a9.f
    public Iterator<T> iterator() {
        return new a(this);
    }
}
