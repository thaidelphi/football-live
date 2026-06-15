package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Uf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1151Uf {
    public static String[] A04 = {"9bIfZdx2c", "BVtweHovTJ9AQD1c0xwVro5fb55rsC0A", "Qcz7YcPp33FT9AEheyvAIqgr5sxTCSSI", "joIE69uQy9cRyqfx7andC7YkXUHjq6Lt", "4yzJG2kJ6AjfdkDtCD", "WyO69cTYQekRyvfsqm71fCjZ6iJK55bc", "gXhu5isEPNWJ9cjXO06miAv1", "kZXVeDcpU0zUNcgkIcZwZmZ0cSykIX6b"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C1151Uf(byte[] bArr, int i10, int i11) {
        A08(bArr, i10, i11);
    }

    private int A00() {
        int i10 = 0;
        while (!A0A()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        int leadingZeros = i10 > 0 ? A05(i10) : 0;
        return i11 + leadingZeros;
    }

    private void A01() {
        boolean z10;
        if (this.A02 >= 0) {
            int i10 = this.A02;
            int i11 = this.A01;
            String[] strArr = A04;
            if (strArr[7].charAt(4) != strArr[1].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[5] = "ETZmGJHxpSVfyikvRimeyIsJKCGzi2Kh";
            strArr2[3] = "MgnSy3kjA4udySrYGwuUYQvZkBsICH9C";
            if (i10 < i11 || (this.A02 == this.A01 && this.A00 == 0)) {
                z10 = true;
                AbstractC1589es.A08(z10);
            }
        }
        z10 = false;
        AbstractC1589es.A08(z10);
    }

    private boolean A02(int i10) {
        return 2 <= i10 && i10 < this.A01 && this.A03[i10] == 3 && this.A03[i10 + (-2)] == 0 && this.A03[i10 + (-1)] == 0;
    }

    public final int A03() {
        int A00 = A00();
        int codeNum = A00 % 2;
        int i10 = codeNum == 0 ? -1 : 1;
        int codeNum2 = A00 + 1;
        return i10 * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i10) {
        int i11 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i10;
        while (true) {
            int returnValue2 = this.A00;
            if (returnValue2 <= 8) {
                break;
            }
            int returnValue3 = this.A00;
            this.A00 = returnValue3 - 8;
            byte[] bArr = this.A03;
            int returnValue4 = this.A02;
            int i12 = bArr[returnValue4] & 255;
            int returnValue5 = this.A00;
            i11 |= i12 << returnValue5;
            int i13 = this.A02;
            int returnValue6 = this.A02;
            if (!A02(returnValue6 + 1)) {
                r4 = 1;
            }
            this.A02 = i13 + r4;
        }
        byte[] bArr2 = this.A03;
        int returnValue7 = this.A02;
        int i14 = bArr2[returnValue7] & 255;
        int returnValue8 = this.A00;
        int i15 = i11 | (i14 >> (8 - returnValue8));
        int returnValue9 = (-1) >>> (32 - i10);
        int i16 = i15 & returnValue9;
        int returnValue10 = this.A00;
        if (returnValue10 == 8) {
            this.A00 = 0;
            int i17 = this.A02;
            int returnValue11 = this.A02;
            this.A02 = i17 + (A02(returnValue11 + 1) ? 2 : 1);
        }
        A01();
        return i16;
    }

    public final void A06() {
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == 8) {
            this.A00 = 0;
            int i11 = this.A02;
            boolean A02 = A02(this.A02 + 1);
            String[] strArr = A04;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A04[4] = "02GcfcelxQLTDn1x8c";
            this.A02 = i11 + (A02 ? 2 : 1);
        }
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0026 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(int r5) {
        /*
            r4 = this;
            int r3 = r4.A02
            int r2 = r5 / 8
            int r0 = r4.A02
            int r0 = r0 + r2
            r4.A02 = r0
            int r1 = r4.A00
            int r0 = r2 * 8
            int r5 = r5 - r0
            int r1 = r1 + r5
            r4.A00 = r1
            int r1 = r4.A00
            r0 = 7
            if (r1 <= r0) goto L22
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
            int r0 = r4.A00
            int r0 = r0 + (-8)
            r4.A00 = r0
        L22:
            int r1 = r3 + 1
        L24:
            int r0 = r4.A02
            if (r1 > r0) goto L39
            boolean r0 = r4.A02(r1)
            if (r0 == 0) goto L36
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
            int r1 = r1 + 2
        L36:
            int r1 = r1 + 1
            goto L24
        L39:
            r4.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1151Uf.A07(int):void");
    }

    public final void A08(byte[] bArr, int i10, int i11) {
        this.A03 = bArr;
        this.A02 = i10;
        this.A01 = i11;
        this.A00 = 0;
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0009 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09() {
        /*
            r8 = this;
            int r2 = r8.A02
            int r6 = r8.A00
            r7 = 0
        L5:
            int r1 = r8.A02
            int r0 = r8.A01
            if (r1 >= r0) goto L14
            boolean r0 = r8.A0A()
            if (r0 != 0) goto L14
            int r7 = r7 + 1
            goto L5
        L14:
            int r1 = r8.A02
            int r0 = r8.A01
            r5 = 0
            r4 = 1
            if (r1 != r0) goto L39
            r3 = 1
        L1d:
            r8.A02 = r2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1151Uf.A04
            r0 = 5
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 12
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L3b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L39:
            r3 = 0
            goto L1d
        L3b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1151Uf.A04
            java.lang.String r1 = "wMATEAAsR"
            r0 = 0
            r2[r0] = r1
            r8.A00 = r6
            if (r3 != 0) goto L50
            int r0 = r7 * 2
            int r0 = r0 + r4
            boolean r0 = r8.A0B(r0)
            if (r0 == 0) goto L50
            r5 = 1
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1151Uf.A09():boolean");
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0B(int r9) {
        /*
            r8 = this;
            int r1 = r8.A02
            int r0 = r9 / 8
            int r4 = r8.A02
            int r4 = r4 + r0
            int r3 = r8.A00
            int r3 = r3 + r9
            int r0 = r0 * 8
            int r3 = r3 - r0
            r0 = 7
            if (r3 <= r0) goto L14
            int r4 = r4 + 1
            int r3 = r3 + (-8)
        L14:
            int r5 = r1 + 1
        L16:
            r7 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1151Uf.A04
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 18
            if (r1 == r0) goto L2a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1151Uf.A04
            java.lang.String r1 = "nO6MJEEc7TlfyisncwbCK3WDubeNqcpA"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "qvcn1YcI6iaayqfaZwfFJFqY4sjpcop8"
            r0 = 3
            r2[r0] = r1
            if (r5 > r4) goto L67
            int r6 = r8.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1151Uf.A04
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L61
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1151Uf.A04
            java.lang.String r1 = "YDzFZervb"
            r0 = 0
            r2[r0] = r1
            if (r4 >= r6) goto L67
            boolean r0 = r8.A02(r5)
            if (r0 == 0) goto L5f
            int r4 = r4 + 1
            int r5 = r5 + 2
        L5f:
            int r5 = r5 + r7
            goto L16
        L61:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L67:
            int r0 = r8.A01
            if (r4 < r0) goto L71
            int r0 = r8.A01
            if (r4 != r0) goto L72
            if (r3 != 0) goto L72
        L71:
            return r7
        L72:
            r7 = 0
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1151Uf.A0B(int):boolean");
    }
}
