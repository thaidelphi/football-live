package d9;

import java.util.concurrent.Executor;
/* compiled from: Executors.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class r1 {
    public static final Executor a(j0 j0Var) {
        Executor K0;
        q1 q1Var = j0Var instanceof q1 ? (q1) j0Var : null;
        return (q1Var == null || (K0 = q1Var.K0()) == null) ? new e1(j0Var) : K0;
    }
}
