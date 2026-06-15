package a5;

import android.os.Trace;
/* compiled from: TraceUtil.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m0 {
    public static void a(String str) {
        if (p0.f482a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (p0.f482a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
