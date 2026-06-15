package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final /* synthetic */ class SN implements Executor {
    public final /* synthetic */ Handler A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
