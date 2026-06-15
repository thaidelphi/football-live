package t0;
/* compiled from: SneakyThrow.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {
    public static void a(Exception exc) {
        b(exc);
    }

    private static <E extends Throwable> void b(Throwable th) throws Throwable {
        throw th;
    }
}
