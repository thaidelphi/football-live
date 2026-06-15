package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Sq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1113Sq extends Thread {
    public final /* synthetic */ AbstractC1210Ws A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1113Sq(AbstractC1210Ws abstractC1210Ws, String str) {
        super(str);
        this.A00 = abstractC1210Ws;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0R();
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
