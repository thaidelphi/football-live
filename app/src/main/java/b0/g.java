package b0;

import d9.f1;
import d9.o0;
import d9.p0;
import d9.u2;
import j8.p;
import j8.q;
import java.io.File;
import java.util.List;
/* compiled from: DataStoreFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f4865a = new g();

    private g() {
    }

    public static /* synthetic */ f b(g gVar, k kVar, c0.b bVar, List list, o0 o0Var, t8.a aVar, int i10, Object obj) {
        c0.b bVar2 = (i10 & 2) != 0 ? null : bVar;
        if ((i10 & 4) != 0) {
            list = q.d();
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            f1 f1Var = f1.f24434a;
            o0Var = p0.a(f1.b().plus(u2.b(null, 1, null)));
        }
        return gVar.a(kVar, bVar2, list2, o0Var, aVar);
    }

    public final <T> f<T> a(k<T> serializer, c0.b<T> bVar, List<? extends d<T>> migrations, o0 scope, t8.a<? extends File> produceFile) {
        List b10;
        kotlin.jvm.internal.n.f(serializer, "serializer");
        kotlin.jvm.internal.n.f(migrations, "migrations");
        kotlin.jvm.internal.n.f(scope, "scope");
        kotlin.jvm.internal.n.f(produceFile, "produceFile");
        c0.a aVar = new c0.a();
        b10 = p.b(e.f4847a.b(migrations));
        return new m(produceFile, serializer, b10, aVar, scope);
    }
}
