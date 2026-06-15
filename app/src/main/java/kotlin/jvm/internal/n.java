package kotlin.jvm.internal;

import java.util.Arrays;
/* compiled from: Intrinsics.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class n {
    private n() {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) l(new IllegalStateException(str + " must not be null")));
    }

    public static void c(Object obj) {
        if (obj == null) {
            o();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) l(new NullPointerException(str + " must not be null")));
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static int g(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int h(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    private static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = n.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void j() {
        r();
    }

    public static void k(int i10, String str) {
        r();
    }

    private static <T extends Throwable> T l(T t10) {
        return (T) m(t10, n.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T m(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String n(String str, Object obj) {
        return str + obj;
    }

    public static void o() {
        throw ((NullPointerException) l(new NullPointerException()));
    }

    public static void p(String str) {
        throw ((NullPointerException) l(new NullPointerException(str)));
    }

    private static void q(String str) {
        throw ((NullPointerException) l(new NullPointerException(i(str))));
    }

    public static void r() {
        s("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void s(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void t(String str) {
        throw ((i8.v) l(new i8.v(str)));
    }

    public static void u(String str) {
        t("lateinit property " + str + " has not been initialized");
    }
}
