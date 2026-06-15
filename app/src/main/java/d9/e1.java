package d9;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Executors.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final j0 f24431a;

    public e1(j0 j0Var) {
        this.f24431a = j0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j0 j0Var = this.f24431a;
        m8.h hVar = m8.h.f27797a;
        if (j0Var.I0(hVar)) {
            this.f24431a.G0(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f24431a.toString();
    }
}
