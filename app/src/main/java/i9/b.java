package i9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: Atomic.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class b<T> extends d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f26643a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f26641a;

    private final Object c(Object obj) {
        if (d9.s0.a()) {
            if (!(obj != a.f26641a)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26643a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f26641a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i9.d0
    public final Object a(Object obj) {
        Object obj2 = f26643a.get(this);
        if (obj2 == a.f26641a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object d(T t10);
}
