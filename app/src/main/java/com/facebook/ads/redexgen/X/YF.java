package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class YF {
    public static String[] A0D = {"", "wScUV", "mKyFJeWmOw5k811irpszoAjpVz7lJJVu", "Jyh6NUhlEMtFWekSXiCXV1fRS8tliN7F", "XUB8B2rrjkftBBGo2gfG2YIZJStOjKV6", "6Kv93mQhESN", "v7QuScM1ODiJM8WtWQIOGshI3ULpOoAP", "l9uo"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC1157Uo A0C;

    public YF(InterfaceC1157Uo interfaceC1157Uo) {
        this.A0C = interfaceC1157Uo;
    }

    private void A00(int i10) {
        if (this.A04 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.A0B;
        this.A0C.AI0(this.A04, z10 ? 1 : 0, (int) (this.A01 - this.A03), i10, null);
    }

    public static boolean A01(int i10) {
        return (32 <= i10 && i10 <= 35) || i10 == 39;
    }

    public static boolean A02(int i10) {
        return i10 < 32 || i10 == 40;
    }

    public final void A03() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A0A = false;
        this.A09 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r10 <= 21) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r10 <= 21) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(long r7, int r9, int r10, long r11, boolean r13) {
        /*
            r6 = this;
            r3 = 0
            r6.A06 = r3
            r6.A05 = r3
            r6.A02 = r11
            r6.A00 = r3
            r6.A01 = r7
            boolean r0 = A02(r10)
            r5 = 1
            if (r0 != 0) goto L42
            boolean r0 = r6.A0A
            if (r0 == 0) goto L21
            boolean r0 = r6.A09
            if (r0 != 0) goto L21
            if (r13 == 0) goto L1f
            r6.A00(r9)
        L1f:
            r6.A0A = r3
        L21:
            boolean r0 = A01(r10)
            if (r0 == 0) goto L42
            boolean r4 = r6.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.YF.A0D
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L78
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YF.A0D
            java.lang.String r1 = ""
            r0 = 0
            r2[r0] = r1
            r4 = r4 ^ r5
            r6.A05 = r4
            r6.A09 = r5
        L42:
            r0 = 16
            if (r10 < r0) goto L76
            r4 = 21
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.YF.A0D
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto L6c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YF.A0D
            java.lang.String r1 = "ZdEW"
            r0 = 7
            r2[r0] = r1
            if (r10 > r4) goto L76
        L5d:
            r0 = 1
        L5e:
            r6.A08 = r0
            boolean r0 = r6.A08
            if (r0 != 0) goto L68
            r0 = 9
            if (r10 > r0) goto L69
        L68:
            r3 = 1
        L69:
            r6.A07 = r3
            return
        L6c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.YF.A0D
            java.lang.String r1 = ""
            r0 = 0
            r2[r0] = r1
            if (r10 > r4) goto L76
            goto L5d
        L76:
            r0 = 0
            goto L5e
        L78:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YF.A04(long, int, int, long, boolean):void");
    }

    public final void A05(long j10, int i10, boolean z10) {
        if (this.A09 && this.A06) {
            this.A0B = this.A08;
            this.A09 = false;
            return;
        }
        boolean z11 = this.A05;
        if (A0D[1].length() == 15) {
            throw new RuntimeException();
        }
        A0D[5] = "9fxAr7PUcEV";
        if (!z11 && !this.A06) {
            return;
        }
        if (z10 && this.A0A) {
            A00(i10 + ((int) (j10 - this.A01)));
        }
        this.A03 = this.A01;
        this.A04 = this.A02;
        this.A0B = this.A08;
        this.A0A = true;
    }

    public final void A06(byte[] bArr, int i10, int i11) {
        if (this.A07) {
            int i12 = (i10 + 2) - this.A00;
            if (i12 < i11) {
                int headerOffset = bArr[i12];
                this.A06 = (headerOffset & 128) != 0;
                this.A07 = false;
                return;
            }
            this.A00 += i11 - i10;
        }
    }
}
