package m8;

import i8.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.n;
/* compiled from: SafeContinuationJvm.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class i<T> implements d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b  reason: collision with root package name */
    private static final a f27798b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f27799c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: a  reason: collision with root package name */
    private final d<T> f27800a;
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> delegate, Object obj) {
        n.f(delegate, "delegate");
        this.f27800a = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object c10;
        Object c11;
        Object c12;
        Object obj = this.result;
        n8.a aVar = n8.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f27799c;
            c11 = n8.d.c();
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, aVar, c11)) {
                c12 = n8.d.c();
                return c12;
            }
            obj = this.result;
        }
        if (obj == n8.a.RESUMED) {
            c10 = n8.d.c();
            return c10;
        } else if (obj instanceof o.b) {
            throw ((o.b) obj).f26628a;
        } else {
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d<T> dVar = this.f27800a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // m8.d
    public g getContext() {
        return this.f27800a.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // m8.d
    public void resumeWith(Object obj) {
        Object c10;
        Object c11;
        while (true) {
            Object obj2 = this.result;
            n8.a aVar = n8.a.UNDECIDED;
            if (obj2 != aVar) {
                c10 = n8.d.c();
                if (obj2 != c10) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<i<?>, Object> atomicReferenceFieldUpdater = f27799c;
                c11 = n8.d.c();
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c11, n8.a.RESUMED)) {
                    this.f27800a.resumeWith(obj);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f27799c, this, aVar, obj)) {
                return;
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f27800a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> delegate) {
        this(delegate, n8.a.UNDECIDED);
        n.f(delegate, "delegate");
    }
}
