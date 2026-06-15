package kotlin.jvm.internal;
/* compiled from: TypeIntrinsics.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class e0 {
    public static Object a(Object obj, int i10) {
        if (obj != null && !c(obj, i10)) {
            f(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).getArity();
        }
        if (obj instanceof t8.a) {
            return 0;
        }
        if (obj instanceof t8.l) {
            return 1;
        }
        if (obj instanceof t8.p) {
            return 2;
        }
        if (obj instanceof t8.q) {
            return 3;
        }
        if (obj instanceof t8.r) {
            return 4;
        }
        if (obj instanceof t8.s) {
            return 5;
        }
        if (obj instanceof t8.t) {
            return 6;
        }
        if (obj instanceof t8.u) {
            return 7;
        }
        if (obj instanceof t8.v) {
            return 8;
        }
        if (obj instanceof t8.w) {
            return 9;
        }
        if (obj instanceof t8.b) {
            return 10;
        }
        if (obj instanceof t8.c) {
            return 11;
        }
        if (obj instanceof t8.d) {
            return 12;
        }
        if (obj instanceof t8.e) {
            return 13;
        }
        if (obj instanceof t8.f) {
            return 14;
        }
        if (obj instanceof t8.g) {
            return 15;
        }
        if (obj instanceof t8.h) {
            return 16;
        }
        if (obj instanceof t8.i) {
            return 17;
        }
        if (obj instanceof t8.j) {
            return 18;
        }
        if (obj instanceof t8.k) {
            return 19;
        }
        if (obj instanceof t8.m) {
            return 20;
        }
        if (obj instanceof t8.n) {
            return 21;
        }
        return obj instanceof t8.o ? 22 : -1;
    }

    public static boolean c(Object obj, int i10) {
        return (obj instanceof i8.c) && b(obj) == i10;
    }

    private static <T extends Throwable> T d(T t10) {
        return (T) n.m(t10, e0.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        g(name + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
