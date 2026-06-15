package androidx.work;

import java.util.concurrent.Executor;
/* compiled from: DirectExecutor.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public enum f implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        kotlin.jvm.internal.n.f(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
