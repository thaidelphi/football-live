package d9;

import com.ironsource.b9;
/* compiled from: JobSupport.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class l2 extends i9.t implements u1 {
    @Override // d9.u1
    public l2 b() {
        return this;
    }

    @Override // d9.u1
    public boolean isActive() {
        return true;
    }

    public final String r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object j10 = j();
        kotlin.jvm.internal.n.d(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z10 = true;
        for (i9.v vVar = (i9.v) j10; !kotlin.jvm.internal.n.a(vVar, this); vVar = vVar.k()) {
            if (vVar instanceof f2) {
                f2 f2Var = (f2) vVar;
                if (z10) {
                    z10 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(f2Var);
            }
        }
        sb.append(b9.i.f16698e);
        String sb2 = sb.toString();
        kotlin.jvm.internal.n.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // i9.v
    public String toString() {
        return s0.c() ? r("Active") : super.toString();
    }
}
