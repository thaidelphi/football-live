package b3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: ExecutionModule.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
abstract class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
