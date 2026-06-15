package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;
/* compiled from: WorkManager.java */
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a0 {
    public static a0 j(Context context) {
        return e1.i.s(context);
    }

    public static void l(Context context, b bVar) {
        e1.i.l(context, bVar);
    }

    public final y a(r rVar) {
        return b(Collections.singletonList(rVar));
    }

    public abstract y b(List<r> list);

    public abstract s c(String str);

    public abstract s d(String str);

    public final s e(b0 b0Var) {
        return f(Collections.singletonList(b0Var));
    }

    public abstract s f(List<? extends b0> list);

    public abstract s g(String str, g gVar, u uVar);

    public s h(String str, h hVar, r rVar) {
        return i(str, hVar, Collections.singletonList(rVar));
    }

    public abstract s i(String str, h hVar, List<r> list);

    public abstract b6.a<List<z>> k(String str);
}
