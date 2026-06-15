package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
/* renamed from: com.facebook.ads.redexgen.X.nD  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2094nD extends BY {
    public final /* synthetic */ C2A A00;

    public C2094nD(C2A c2a) {
        this.A00 = c2a;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        AnonymousClass29 anonymousClass29;
        CountDownLatch countDownLatch;
        this.A00.A07();
        anonymousClass29 = this.A00.A02;
        anonymousClass29.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
