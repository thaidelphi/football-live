package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.hQ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1745hQ implements DP {
    public static String[] A01 = {"dAENZa04S5kpLZ1505OVGzU", "BCWAX", "x4EBtM5L1", "d5mzvX7vdf5oGTbdkf23a85QS6J33UuP", "T3xMk8xyeuXfnP2cHDF22zgmf4sSWk7a", "D6RnJQb1nSkQk7teZoJG77p", "lMrZ8D5HcAsH09zpnUIM78ubrFXrhoz6", "r7D6OIPJDO7XxyVdFUwVLtQI1zZlrgYr"};
    public final /* synthetic */ C1741hM A00;

    public C1745hQ(C1741hM c1741hM) {
        this.A00 = c1741hM;
    }

    @Override // com.facebook.ads.redexgen.X.DP
    public final void AC5(DQ dq) {
        boolean A0W;
        boolean z10;
        AF af;
        C04672p c04672p;
        DR dr;
        EC ec;
        C1900k1 c1900k1;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        C0770Fd c0770Fd;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0V;
            if (!atomicBoolean2.get()) {
                c0770Fd = this.A00.A0T;
                c0770Fd.A07(this.A00);
                return;
            }
        }
        C1741hM c1741hM = this.A00;
        if (A01[4].charAt(5) == '8') {
            A01[1] = "011C";
            z10 = c1741hM.A0X;
            if (z10) {
                atomicBoolean = this.A00.A0V;
                if (!atomicBoolean.get()) {
                    A0V = this.A00.A0V();
                    if (A0V) {
                        this.A00.A0a.setToolbarActionMode(0);
                        this.A00.A0L();
                        return;
                    }
                }
            }
            af = this.A00.A0N;
            af.A04(AE.A07, null);
            c04672p = this.A00.A0J;
            if (c04672p.A0P()) {
                c1900k1 = this.A00.A0L;
                c1900k1.A0F().ADd();
            }
            dr = this.A00.A0Q;
            C1741hM c1741hM2 = this.A00;
            if (A01[2].length() == 9) {
                A01[6] = "SsRiNY9tvP3hEWy4eyTF9NsffnrPtCfL";
                ec = c1741hM2.A0R;
                dr.A4Z(ec.A7m());
                return;
            }
        }
        throw new RuntimeException();
    }
}
