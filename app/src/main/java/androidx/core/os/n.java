package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static long f2685a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2686b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2687c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2688d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2689e;

    /* compiled from: TraceCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 18 || i10 >= 29) {
            return;
        }
        try {
            f2685a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f2686b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f2687c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f2688d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f2689e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e8) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e8);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            a.a(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            a.b();
        }
    }
}
