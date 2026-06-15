package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class I4 implements Runnable {
    public final /* synthetic */ C1451cd A00;

    public I4(C1451cd c1451cd) {
        this.A00 = c1451cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MG mg;
        int i10;
        Handler handler;
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0C() == 0) {
                return;
            }
            mg = this.A00.A05;
            i10 = this.A00.A01;
            mg.scrollBy(i10, 0);
            handler = this.A00.A04;
            handler.postDelayed(this, 16L);
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
