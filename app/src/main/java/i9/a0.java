package i9;

import d9.k2;
import java.util.List;
/* compiled from: MainDispatchers.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f26642a = true;

    private static final b0 a(Throwable th, String str) {
        if (f26642a) {
            return new b0(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new i8.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ b0 b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(k2 k2Var) {
        return k2Var.K0() instanceof b0;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final k2 e(y yVar, List<? extends y> list) {
        try {
            return yVar.b(list);
        } catch (Throwable th) {
            return a(th, yVar.a());
        }
    }
}
