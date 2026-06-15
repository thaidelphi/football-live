package a5;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
/* compiled from: Log.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    private static int f513b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f514c = true;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f512a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static a f515d = a.f516a;

    /* compiled from: Log.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f516a = new C0009a();

        /* compiled from: Log.java */
        /* renamed from: a5.t$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0009a implements a {
            C0009a() {
            }

            @Override // a5.t.a
            public void a(String str, String str2) {
                Log.w(str, str2);
            }

            @Override // a5.t.a
            public void b(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // a5.t.a
            public void c(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // a5.t.a
            public void d(String str, String str2) {
                Log.d(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void c(String str, String str2);

        void d(String str, String str2);
    }

    private static String a(String str, Throwable th) {
        String e8 = e(th);
        if (TextUtils.isEmpty(e8)) {
            return str;
        }
        return str + "\n  " + e8.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f512a) {
            if (f513b == 0) {
                f515d.d(str, str2);
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f512a) {
            if (f513b <= 3) {
                f515d.b(str, str2);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        synchronized (f512a) {
            if (th == null) {
                return null;
            }
            if (h(th)) {
                return "UnknownHostException (no network)";
            }
            if (!f514c) {
                return th.getMessage();
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void f(String str, String str2) {
        synchronized (f512a) {
            if (f513b <= 1) {
                f515d.c(str, str2);
            }
        }
    }

    public static void g(String str, String str2, Throwable th) {
        f(str, a(str2, th));
    }

    private static boolean h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f512a) {
            if (f513b <= 2) {
                f515d.a(str, str2);
            }
        }
    }

    public static void j(String str, String str2, Throwable th) {
        i(str, a(str2, th));
    }
}
