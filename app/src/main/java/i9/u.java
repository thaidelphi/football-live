package i9;
/* compiled from: LockFreeLinkedList.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f26704a = new k0("CONDITION_FALSE");

    public static final Object a() {
        return f26704a;
    }

    public static final v b(Object obj) {
        v vVar;
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var == null || (vVar = e0Var.f26654a) == null) {
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (v) obj;
        }
        return vVar;
    }
}
