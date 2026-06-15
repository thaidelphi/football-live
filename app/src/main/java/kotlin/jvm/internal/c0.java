package kotlin.jvm.internal;
/* compiled from: ReflectionFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class c0 {
    public z8.e a(k kVar) {
        return kVar;
    }

    public z8.c b(Class cls) {
        return new f(cls);
    }

    public z8.d c(Class cls, String str) {
        return new s(cls, str);
    }

    public z8.g d(p pVar) {
        return pVar;
    }

    public z8.i e(t tVar) {
        return tVar;
    }

    public String f(j jVar) {
        String obj = jVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(o oVar) {
        return f(oVar);
    }
}
