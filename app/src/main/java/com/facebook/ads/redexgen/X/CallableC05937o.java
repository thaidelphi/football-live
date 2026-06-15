package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.facebook.ads.redexgen.X.7o  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class CallableC05937o implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C05987t A01;

    public CallableC05937o(C05987t c05987t, C05947p c05947p) {
        this.A01 = c05987t;
        new Handler(Looper.getMainLooper()).post(new C1903k4(this, c05987t, c05947p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C05947p c05947p) {
        AnonymousClass85 anonymousClass85;
        AnonymousClass85 anonymousClass852;
        long currentTimeMillis = System.currentTimeMillis();
        anonymousClass85 = this.A01.A04;
        J7 A01 = J7.A01(anonymousClass85.A02());
        Uri A00 = C5.A00(c05947p.A08);
        long j10 = c05947p.A00;
        if (j10 == -1) {
            anonymousClass852 = this.A01.A04;
            j10 = C06419m.A0R(anonymousClass852);
        }
        A01.A0I(A00, new C1902k3(this, c05947p, j10, currentTimeMillis), j10);
    }
}
