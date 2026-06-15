package b6;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: ListenableFuture.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface a<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
