package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.DrmInitData;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class WL {
    public static String[] A0C = {"Zrd6uyxy", "vFKQr45TOct89ZfhaUaYUg6BLrfY60", "4ECVfXAXq9cozf3fcV0vXQ5rCLuUsYEl", "QAiPwJTOIU4HP6qqKpIQL6D0qJyJ", "nZ8VN4SZo", "uZfngjyxWKdzRYPVpcJqM40vVCq1XNEL", "Zg4kEXUA6csoYy2RDICvr1Cjq2QrEj", "U"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public WC A04;
    public C1195Wc A05;
    public boolean A06;
    public final InterfaceC1157Uo A07;
    public final C1194Wb A08 = new C1194Wb();
    public final C1648fq A09 = new C1648fq();
    public final C1648fq A0B = new C1648fq(1);
    public final C1648fq A0A = new C1648fq();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final int A04(int i10, int i11) {
        C1648fq c1648fq;
        int length;
        C1193Wa A07 = A07();
        if (A07 == null) {
            return 0;
        }
        int i12 = A07.A00;
        String[] strArr = A0C;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[6] = "gt5i5jnF8aN0UoncZ6FpmGCIeV43ol";
        strArr2[1] = "CwvcK5zNSgmoxol92UAPtG1soOCl19";
        if (i12 != 0) {
            c1648fq = this.A08.A0H;
            length = A07.A00;
        } else {
            byte[] bArr = (byte[]) AbstractC1672gE.A0f(A07.A04);
            this.A0A.A0j(bArr, bArr.length);
            c1648fq = this.A0A;
            length = bArr.length;
        }
        boolean A06 = this.A08.A06(this.A01);
        boolean z10 = A06 || i11 != 0;
        this.A0B.A0l()[0] = (byte) ((z10 ? 128 : 0) | length);
        this.A0B.A0f(0);
        this.A07.AHy(this.A0B, 1, 1);
        this.A07.AHy(c1648fq, length, 1);
        if (z10) {
            if (!A06) {
                this.A09.A0d(8);
                byte[] A0l = this.A09.A0l();
                A0l[0] = 0;
                A0l[1] = 1;
                A0l[2] = (byte) ((i11 >> 8) & 255);
                A0l[3] = (byte) (i11 & 255);
                A0l[4] = (byte) ((i10 >> 24) & 255);
                A0l[5] = (byte) ((i10 >> 16) & 255);
                A0l[6] = (byte) ((i10 >> 8) & 255);
                A0l[7] = (byte) (i10 & 255);
                this.A07.AHy(this.A09, 8, 1);
                return length + 1 + 8;
            }
            C1648fq c1648fq2 = this.A08.A0H;
            int A0M = c1648fq2.A0M();
            c1648fq2.A0g(-2);
            int i13 = (A0M * 6) + 2;
            if (i11 != 0) {
                this.A09.A0d(i13);
                byte[] A0l2 = this.A09.A0l();
                c1648fq2.A0k(A0l2, 0, i13);
                int i14 = (((A0l2[2] & 255) << 8) | (A0l2[3] & 255)) + i11;
                A0l2[2] = (byte) ((i14 >> 8) & 255);
                A0l2[3] = (byte) (i14 & 255);
                c1648fq2 = this.A09;
            }
            this.A07.AHy(c1648fq2, i13, 1);
            return length + 1 + i13;
        }
        return length + 1;
    }

    public WL(InterfaceC1157Uo interfaceC1157Uo, C1195Wc c1195Wc, WC wc) {
        this.A07 = interfaceC1157Uo;
        this.A05 = c1195Wc;
        this.A04 = wc;
        A0C(c1195Wc, wc);
    }

    public final int A02() {
        int i10;
        if (!this.A06) {
            i10 = this.A05.A04[this.A01];
        } else {
            boolean[] zArr = this.A08.A0G;
            int flags = this.A01;
            i10 = zArr[flags] ? 1 : 0;
        }
        C1193Wa A07 = A07();
        String[] strArr = A0C;
        String str = strArr[6];
        String str2 = strArr[1];
        int length = str.length();
        int flags2 = str2.length();
        if (length != flags2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[6] = "6AJRHwsUS8RXngKZJc3qLIpgpJriJj";
        strArr2[1] = "k1Q7SD5DHXGIGC1tSYK8DbQBChI57F";
        if (A07 != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final int A03() {
        if (!this.A06) {
            return this.A05.A05[this.A01];
        }
        return this.A08.A0B[this.A01];
    }

    public final long A05() {
        if (!this.A06) {
            return this.A05.A06[this.A01];
        }
        return this.A08.A0E[this.A02];
    }

    public final long A06() {
        if (!this.A06) {
            return this.A05.A07[this.A01];
        }
        return this.A08.A00(this.A01);
    }

    public final C1193Wa A07() {
        C1193Wa A00;
        if (this.A06) {
            int i10 = ((WC) AbstractC1672gE.A0f(this.A08.A06)).A02;
            if (this.A08.A07 != null) {
                A00 = this.A08.A07;
            } else {
                A00 = this.A05.A03.A00(i10);
            }
            if (A00 == null || !A00.A03) {
                return null;
            }
            C1193Wa encryptionBox = A00;
            return encryptionBox;
        }
        return null;
    }

    public final void A08() {
        this.A08.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public final void A09() {
        C1193Wa A07 = A07();
        if (A07 == null) {
            return;
        }
        C1648fq c1648fq = this.A08.A0H;
        if (A07.A00 != 0) {
            c1648fq.A0g(A07.A00);
        }
        if (this.A08.A06(this.A01)) {
            int A0M = c1648fq.A0M() * 6;
            if (A0C[2].charAt(6) != 'A') {
                throw new RuntimeException();
            }
            A0C[7] = "m8P1DFOF";
            c1648fq.A0g(A0M);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(long r5) {
        /*
            r4 = this;
            int r3 = r4.A01
        L2:
            com.facebook.ads.redexgen.X.Wb r0 = r4.A08
            int r0 = r0.A00
            if (r3 >= r0) goto L1f
            com.facebook.ads.redexgen.X.Wb r0 = r4.A08
            long r1 = r0.A00(r3)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L1f
            com.facebook.ads.redexgen.X.Wb r0 = r4.A08
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WL.A0A(long):void");
    }

    public final void A0B(DrmInitData drmInitData) {
        C1193Wa encryptionBox = this.A05.A03.A00(((WC) AbstractC1672gE.A0f(this.A08.A06)).A02);
        this.A07.A6U(this.A05.A03.A07.A07().A0u(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)).A14());
    }

    public final void A0C(C1195Wc c1195Wc, WC wc) {
        this.A05 = c1195Wc;
        this.A04 = wc;
        this.A07.A6U(c1195Wc.A03.A07);
        A08();
    }

    public final boolean A0D() {
        this.A01++;
        if (this.A06) {
            this.A00++;
            if (this.A00 == this.A08.A0C[this.A02]) {
                this.A02++;
                this.A00 = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
