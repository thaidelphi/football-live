package i8;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LazyJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class q<T> implements g<T>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final a f26629d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<q<?>, Object> f26630e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "b");

    /* renamed from: a  reason: collision with root package name */
    private volatile t8.a<? extends T> f26631a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f26632b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f26633c;

    /* compiled from: LazyJVM.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public q(t8.a<? extends T> initializer) {
        kotlin.jvm.internal.n.f(initializer, "initializer");
        this.f26631a = initializer;
        u uVar = u.f26637a;
        this.f26632b = uVar;
        this.f26633c = uVar;
    }

    public boolean a() {
        return this.f26632b != u.f26637a;
    }

    @Override // i8.g
    public T getValue() {
        T t10 = (T) this.f26632b;
        u uVar = u.f26637a;
        if (t10 != uVar) {
            return t10;
        }
        t8.a<? extends T> aVar = this.f26631a;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f26630e, this, uVar, invoke)) {
                this.f26631a = null;
                return invoke;
            }
        }
        return (T) this.f26632b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
