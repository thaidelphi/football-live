package d9;
/* compiled from: CompletionState.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f24417a;

    /* renamed from: b  reason: collision with root package name */
    public final t8.l<Throwable, i8.w> f24418b;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Object obj, t8.l<? super Throwable, i8.w> lVar) {
        this.f24417a = obj;
        this.f24418b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return kotlin.jvm.internal.n.a(this.f24417a, c0Var.f24417a) && kotlin.jvm.internal.n.a(this.f24418b, c0Var.f24418b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f24417a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f24418b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f24417a + ", onCancellation=" + this.f24418b + ')';
    }
}
