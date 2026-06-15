package f6;

import java.util.Set;
/* compiled from: ComponentContainer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final /* synthetic */ class d {
    public static Object a(e eVar, e0 e0Var) {
        q6.b f10 = eVar.f(e0Var);
        if (f10 == null) {
            return null;
        }
        return f10.get();
    }

    public static Object b(e eVar, Class cls) {
        return eVar.d(e0.b(cls));
    }

    public static q6.b c(e eVar, Class cls) {
        return eVar.f(e0.b(cls));
    }

    public static Set d(e eVar, e0 e0Var) {
        return (Set) eVar.c(e0Var).get();
    }

    public static Set e(e eVar, Class cls) {
        return eVar.g(e0.b(cls));
    }
}
