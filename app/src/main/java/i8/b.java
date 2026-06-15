package i8;

import java.io.PrintWriter;
import java.io.StringWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Exceptions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class b {
    public static void a(Throwable th, Throwable exception) {
        kotlin.jvm.internal.n.f(th, "<this>");
        kotlin.jvm.internal.n.f(exception, "exception");
        if (th != exception) {
            o8.b.f29469a.a(th, exception);
        }
    }

    public static String b(Throwable th) {
        kotlin.jvm.internal.n.f(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.n.e(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
