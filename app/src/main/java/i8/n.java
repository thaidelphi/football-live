package i8;

import java.io.Serializable;
/* compiled from: Tuples.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final A f26624a;

    /* renamed from: b  reason: collision with root package name */
    private final B f26625b;

    public n(A a10, B b10) {
        this.f26624a = a10;
        this.f26625b = b10;
    }

    public final A a() {
        return this.f26624a;
    }

    public final B b() {
        return this.f26625b;
    }

    public final A c() {
        return this.f26624a;
    }

    public final B d() {
        return this.f26625b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.n.a(this.f26624a, nVar.f26624a) && kotlin.jvm.internal.n.a(this.f26625b, nVar.f26625b);
        }
        return false;
    }

    public int hashCode() {
        A a10 = this.f26624a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f26625b;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f26624a + ", " + this.f26625b + ')';
    }
}
