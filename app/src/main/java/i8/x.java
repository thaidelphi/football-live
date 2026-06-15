package i8;

import java.io.Serializable;
/* compiled from: Lazy.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class x<T> implements g<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private t8.a<? extends T> f26639a;

    /* renamed from: b  reason: collision with root package name */
    private Object f26640b;

    public x(t8.a<? extends T> initializer) {
        kotlin.jvm.internal.n.f(initializer, "initializer");
        this.f26639a = initializer;
        this.f26640b = u.f26637a;
    }

    public boolean a() {
        return this.f26640b != u.f26637a;
    }

    @Override // i8.g
    public T getValue() {
        if (this.f26640b == u.f26637a) {
            t8.a<? extends T> aVar = this.f26639a;
            kotlin.jvm.internal.n.c(aVar);
            this.f26640b = aVar.invoke();
            this.f26639a = null;
        }
        return (T) this.f26640b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
