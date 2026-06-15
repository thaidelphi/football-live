package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.oS  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class RunnableC2156oS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2155oR A01;
    public final /* synthetic */ Exception A02;

    public RunnableC2156oS(C2155oR c2155oR, int i10, Exception exc) {
        this.A01 = c2155oR;
        this.A00 = i10;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        L3 l32;
        Handler handler;
        Runnable runnable;
        boolean A08;
        if (BQ.A02(this)) {
            return;
        }
        try {
            try {
                z10 = this.A01.A01;
                if (z10) {
                    if (C0981Nj.A08) {
                        A08 = this.A01.A08();
                        if (A08) {
                            this.A01.A0C();
                            return;
                        }
                    }
                    C2155oR c2155oR = this.A01;
                    l32 = this.A01.A05;
                    c2155oR.A05(l32.AC0());
                    handler = this.A01.A04;
                    runnable = this.A01.A0A;
                    handler.postDelayed(runnable, this.A00);
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
