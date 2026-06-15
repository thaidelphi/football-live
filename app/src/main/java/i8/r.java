package i8;

import java.io.Serializable;
/* compiled from: LazyJVM.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
final class r<T> implements g<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private t8.a<? extends T> f26634a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f26635b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f26636c;

    public r(t8.a<? extends T> initializer, Object obj) {
        kotlin.jvm.internal.n.f(initializer, "initializer");
        this.f26634a = initializer;
        this.f26635b = u.f26637a;
        this.f26636c = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f26635b != u.f26637a;
    }

    @Override // i8.g
    public T getValue() {
        T t10;
        T t11 = (T) this.f26635b;
        u uVar = u.f26637a;
        if (t11 != uVar) {
            return t11;
        }
        synchronized (this.f26636c) {
            t10 = (T) this.f26635b;
            if (t10 == uVar) {
                t8.a<? extends T> aVar = this.f26634a;
                kotlin.jvm.internal.n.c(aVar);
                t10 = aVar.invoke();
                this.f26635b = t10;
                this.f26634a = null;
            }
        }
        return t10;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ r(t8.a aVar, Object obj, int i10, kotlin.jvm.internal.h hVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
