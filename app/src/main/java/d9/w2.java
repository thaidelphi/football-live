package d9;
/* compiled from: EventLoop.common.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class w2 {

    /* renamed from: a  reason: collision with root package name */
    public static final w2 f24526a = new w2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<k1> f24527b = i9.p0.a(new i9.k0("ThreadLocalEventLoop"));

    private w2() {
    }

    public final k1 a() {
        return f24527b.get();
    }

    public final k1 b() {
        ThreadLocal<k1> threadLocal = f24527b;
        k1 k1Var = threadLocal.get();
        if (k1Var == null) {
            k1 a10 = n1.a();
            threadLocal.set(a10);
            return a10;
        }
        return k1Var;
    }

    public final void c() {
        f24527b.set(null);
    }

    public final void d(k1 k1Var) {
        f24527b.set(k1Var);
    }
}
