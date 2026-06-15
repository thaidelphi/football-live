package a9;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SequencesJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<f<T>> f575a;

    public a(f<? extends T> sequence) {
        kotlin.jvm.internal.n.f(sequence, "sequence");
        this.f575a = new AtomicReference<>(sequence);
    }

    @Override // a9.f
    public Iterator<T> iterator() {
        f<T> andSet = this.f575a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
