package v6;
/* compiled from: SystemClock.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f31891a;

    private b() {
    }

    public static b b() {
        if (f31891a == null) {
            f31891a = new b();
        }
        return f31891a;
    }

    @Override // v6.a
    public long a() {
        return System.currentTimeMillis();
    }
}
