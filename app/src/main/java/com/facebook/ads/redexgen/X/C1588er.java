package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
/* renamed from: com.facebook.ads.redexgen.X.er  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1588er extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ PM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588er(PM pm, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = pm;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (BQ.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A05();
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}
