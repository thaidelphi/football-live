package h9;

import androidx.recyclerview.widget.RecyclerView;
import d9.z1;
import i9.g0;
import m8.g;
/* compiled from: SafeCollector.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class a extends kotlin.jvm.internal.o implements t8.p<Integer, g.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t<?> f26347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t<?> tVar) {
            super(2);
            this.f26347a = tVar;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f26347a.f26340b.get(key);
            if (key != z1.f24533t0) {
                return Integer.valueOf(bVar != bVar2 ? RecyclerView.UNDEFINED_DURATION : i10 + 1);
            }
            z1 z1Var = (z1) bVar2;
            kotlin.jvm.internal.n.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            z1 b10 = v.b((z1) bVar, z1Var);
            if (b10 == z1Var) {
                if (z1Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + z1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // t8.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(t<?> tVar, m8.g gVar) {
        if (((Number) gVar.fold(0, new a(tVar))).intValue() == tVar.f26341c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + tVar.f26340b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final z1 b(z1 z1Var, z1 z1Var2) {
        while (z1Var != null) {
            if (z1Var == z1Var2 || !(z1Var instanceof g0)) {
                return z1Var;
            }
            z1Var = z1Var.getParent();
        }
        return null;
    }
}
