package i9;

import i8.o;
/* compiled from: FastServiceLoader.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f26689a;

    static {
        Object b10;
        try {
            o.a aVar = i8.o.f26626b;
            b10 = i8.o.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            o.a aVar2 = i8.o.f26626b;
            b10 = i8.o.b(i8.p.a(th));
        }
        f26689a = i8.o.g(b10);
    }

    public static final boolean a() {
        return f26689a;
    }
}
