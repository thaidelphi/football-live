package j8;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: AbstractIterator.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class b<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private q0 f27081a = q0.NotReady;

    /* renamed from: b  reason: collision with root package name */
    private T f27082b;

    /* compiled from: AbstractIterator.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27083a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27083a = iArr;
        }
    }

    private final boolean d() {
        this.f27081a = q0.Failed;
        a();
        return this.f27081a == q0.Ready;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.f27081a = q0.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(T t10) {
        this.f27082b = t10;
        this.f27081a = q0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        q0 q0Var = this.f27081a;
        if (q0Var != q0.Failed) {
            int i10 = a.f27083a[q0Var.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return d();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f27081a = q0.NotReady;
            return this.f27082b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
