package d9;
/* compiled from: Yield.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f3 {
    public static final Object a(m8.d<? super i8.w> dVar) {
        m8.d b10;
        Object c10;
        Object c11;
        Object c12;
        m8.g context = dVar.getContext();
        d2.g(context);
        b10 = n8.c.b(dVar);
        i9.k kVar = b10 instanceof i9.k ? (i9.k) b10 : null;
        if (kVar == null) {
            c10 = i8.w.f26638a;
        } else {
            if (kVar.f26665d.I0(context)) {
                kVar.o(context, i8.w.f26638a);
            } else {
                e3 e3Var = new e3();
                m8.g plus = context.plus(e3Var);
                i8.w wVar = i8.w.f26638a;
                kVar.o(plus, wVar);
                if (e3Var.f24433a) {
                    c10 = i9.l.d(kVar) ? n8.d.c() : wVar;
                }
            }
            c10 = n8.d.c();
        }
        c11 = n8.d.c();
        if (c10 == c11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        c12 = n8.d.c();
        return c10 == c12 ? c10 : i8.w.f26638a;
    }
}
