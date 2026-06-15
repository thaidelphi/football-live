package i9;

import java.util.ArrayList;
import java.util.List;
/* compiled from: InlineList.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class q<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i10, kotlin.jvm.internal.h hVar) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e8) {
        if (!d9.s0.a() || (!(e8 instanceof List))) {
            if (obj == null) {
                return a(e8);
            }
            if (obj instanceof ArrayList) {
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ((ArrayList) obj).add(e8);
                return a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e8);
            return a(arrayList);
        }
        throw new AssertionError();
    }
}
