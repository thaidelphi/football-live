package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.dc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1512dc extends IOException {
    public final int A00;

    public C1512dc(int i10) {
        this.A00 = i10;
    }

    public C1512dc(String str, int i10) {
        super(str);
        this.A00 = i10;
    }

    public C1512dc(String str, Throwable th, int i10) {
        super(str, th);
        this.A00 = i10;
    }

    public C1512dc(Throwable th, int i10) {
        super(th);
        this.A00 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A06(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof com.facebook.ads.redexgen.X.C1512dc
            if (r0 == 0) goto L11
            r0 = r2
            com.facebook.ads.redexgen.X.dc r0 = (com.facebook.ads.redexgen.X.C1512dc) r0
            int r1 = r0.A00
            r0 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r0) goto L11
            r0 = 1
            return r0
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1512dc.A06(java.io.IOException):boolean");
    }
}
