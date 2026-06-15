package d9;

import i8.o;
/* compiled from: DebugStrings.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class t0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(m8.d<?> dVar) {
        String b10;
        if (dVar instanceof i9.k) {
            return dVar.toString();
        }
        try {
            o.a aVar = i8.o.f26626b;
            b10 = i8.o.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            o.a aVar2 = i8.o.f26626b;
            b10 = i8.o.b(i8.p.a(th));
        }
        if (i8.o.d(b10) != null) {
            b10 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b10;
    }
}
