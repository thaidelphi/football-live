package e9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import i8.o;
import i8.p;
import kotlin.jvm.internal.n;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f25203a;
    private static volatile Choreographer choreographer;

    static {
        Object b10;
        try {
            o.a aVar = o.f26626b;
            b10 = o.b(new d(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            o.a aVar2 = o.f26626b;
            b10 = o.b(p.a(th));
        }
        f25203a = o.f(b10) ? null : b10;
    }

    public static final Handler a(Looper looper, boolean z10) {
        int i10;
        if (!z10 || (i10 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i10 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            n.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
