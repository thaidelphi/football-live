package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class HandlerExecutor implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f12759a;

    @KeepForSdk
    public HandlerExecutor(Looper looper) {
        this.f12759a = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12759a.post(runnable);
    }
}
