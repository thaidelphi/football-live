package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.DrmInitData;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class WI {
    public static String[] A0A = {"6iG2pzuEQycoVFq725g4qJVnVpIWZtlR", "55l141mBLH5WkPDbxXMnALrHQI6q7lEr", "qJTDm2F9TSXG", "DtWX", "J", "d1C1KGlOvszMCpNlse9bACflAWEVGthH", "0mTI1KWBNfYIDi0cnokbmIS0fHm5LYjn", "iC8Ub00tDVOO7seA02PucuhNsAEH3abh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public WC A04;
    public WZ A05;
    public final InterfaceC1157Uo A06;
    public final C1194Wb A07 = new C1194Wb();
    public final C1648fq A09 = new C1648fq(1);
    public final C1648fq A08 = new C1648fq();

    public WI(InterfaceC1157Uo interfaceC1157Uo) {
        this.A06 = interfaceC1157Uo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1193Wa A00() {
        C1193Wa encryptionBox;
        int i10 = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i10);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1193Wa A00 = A00();
        if (A00 == null) {
            return;
        }
        C1648fq c1648fq = this.A07.A0H;
        if (A00.A00 != 0) {
            c1648fq.A0g(A00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c1648fq.A0g(c1648fq.A0M() * 6);
        }
    }

    public final int A04() {
        C1648fq c1648fq;
        int vectorSize;
        C1193Wa A00 = A00();
        if (A00 == null) {
            return 0;
        }
        if (A00.A00 != 0) {
            c1648fq = this.A07.A0H;
            vectorSize = A00.A00;
        } else {
            byte[] initVectorData = A00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c1648fq = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean A06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((A06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        InterfaceC1157Uo interfaceC1157Uo = this.A06;
        C1648fq initializationVectorData = this.A09;
        interfaceC1157Uo.AHx(initializationVectorData, 1);
        this.A06.AHx(c1648fq, vectorSize);
        if (!A06) {
            return vectorSize + 1;
        }
        C1648fq c1648fq2 = this.A07.A0H;
        int A0M = c1648fq2.A0M();
        c1648fq2.A0g(-2);
        int i10 = (A0M * 6) + 2;
        this.A06.AHx(c1648fq2, i10);
        return vectorSize + 1 + i10;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(long r5) {
        /*
            r4 = this;
            int r3 = r4.A01
        L2:
            com.facebook.ads.redexgen.X.Wb r0 = r4.A07
            int r0 = r0.A00
            if (r3 >= r0) goto L1f
            com.facebook.ads.redexgen.X.Wb r0 = r4.A07
            long r1 = r0.A00(r3)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1f
            com.facebook.ads.redexgen.X.Wb r0 = r4.A07
            boolean[] r0 = r0.A0G
            boolean r0 = r0[r3]
            if (r0 == 0) goto L1c
            r4.A03 = r3
        L1c:
            int r3 = r3 + 1
            goto L2
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WI.A06(long):void");
    }

    public final void A07(DrmInitData drmInitData) {
        C1193Wa encryptionBox = this.A05.A00(this.A07.A06.A02);
        String str = encryptionBox != null ? encryptionBox.A02 : null;
        InterfaceC1157Uo interfaceC1157Uo = this.A06;
        ZM zm = this.A05.A07;
        String[] strArr = A0A;
        String schemeType = strArr[0];
        if (schemeType.charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[6] = "lpqHmBvcUgjM3Ysqc1Ebun64n1SVP7eZ";
        strArr2[5] = "0GYMuHaUcEVaktTpZSAbFa1nNlov1DMX";
        interfaceC1157Uo.A6U(zm.A09(drmInitData.A01(str)));
    }

    public final void A08(WZ wz, WC wc) {
        this.A05 = (WZ) AbstractC1589es.A01(wz);
        this.A04 = (WC) AbstractC1589es.A01(wc);
        this.A06.A6U(wz.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 == this.A07.A0C[this.A02]) {
            this.A02++;
            this.A00 = 0;
            return false;
        }
        return true;
    }
}
