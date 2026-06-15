package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadPoolExecutor;
/* renamed from: com.facebook.ads.redexgen.X.j7  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1844j7 extends BY {
    public final /* synthetic */ C1843j6 A00;

    public C1844j7(C1843j6 c1843j6) {
        this.A00 = c1843j6;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
