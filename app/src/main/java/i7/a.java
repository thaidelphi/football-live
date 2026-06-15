package i7;
/* compiled from: VersionUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f26611a = a();

    private static int a() {
        String[] split = System.getProperty("java.version").split("[._]");
        int parseInt = Integer.parseInt(split[0]);
        return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
    }

    public static int b() {
        return f26611a;
    }

    public static boolean c() {
        return f26611a >= 9;
    }
}
