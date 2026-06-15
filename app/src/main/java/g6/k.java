package g6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: UiExecutor.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum k implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f25821b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f25821b.post(runnable);
    }
}
