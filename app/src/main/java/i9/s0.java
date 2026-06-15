package i9;

import d9.v2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadContext.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final m8.g f26700a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f26701b;

    /* renamed from: c  reason: collision with root package name */
    private final v2<Object>[] f26702c;

    /* renamed from: d  reason: collision with root package name */
    private int f26703d;

    public s0(m8.g gVar, int i10) {
        this.f26700a = gVar;
        this.f26701b = new Object[i10];
        this.f26702c = new v2[i10];
    }

    public final void a(v2<?> v2Var, Object obj) {
        Object[] objArr = this.f26701b;
        int i10 = this.f26703d;
        objArr[i10] = obj;
        v2<Object>[] v2VarArr = this.f26702c;
        this.f26703d = i10 + 1;
        kotlin.jvm.internal.n.d(v2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v2VarArr[i10] = v2Var;
    }

    public final void b(m8.g gVar) {
        int length = this.f26702c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            v2<Object> v2Var = this.f26702c[length];
            kotlin.jvm.internal.n.c(v2Var);
            v2Var.D0(gVar, this.f26701b[length]);
            if (i10 < 0) {
                return;
            }
            length = i10;
        }
    }
}
