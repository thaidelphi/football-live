package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class PA implements InterfaceExecutorC1651ft {
    public final /* synthetic */ InterfaceC1600f3 A00;
    public final /* synthetic */ Executor A01;

    public PA(Executor executor, InterfaceC1600f3 interfaceC1600f3) {
        this.A01 = executor;
        this.A00 = interfaceC1600f3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceExecutorC1651ft
    public final void AGj() {
        this.A00.A2z(this.A01);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
