package com.facebook.ads.redexgen.X;

import android.app.Activity;
/* renamed from: com.facebook.ads.redexgen.X.Bw  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0685Bw {
    public static final C0685Bw A04 = new C0685Bw(new C1799iM(), new C1798iL());
    public final InterfaceC0684Bv A02;
    public final InterfaceC0708Ct A03;
    public boolean A01 = true;
    public long A00 = -1;

    public C0685Bw(InterfaceC0708Ct interfaceC0708Ct, InterfaceC0684Bv interfaceC0684Bv) {
        this.A03 = interfaceC0708Ct;
        this.A02 = interfaceC0684Bv;
    }

    public static C0685Bw A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A5d();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        Activity lastResumedActivity = this.A02.A8C();
        boolean z10 = true;
        if (lastResumedActivity != null) {
            return true;
        }
        synchronized (C0685Bw.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A5d() - this.A00 >= 1000) {
                z10 = false;
            }
            return z10;
        }
    }
}
