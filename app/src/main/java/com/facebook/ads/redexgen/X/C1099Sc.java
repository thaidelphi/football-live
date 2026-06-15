package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Sc  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1099Sc implements YT {
    public static byte[] A0C;
    public static String[] A0D = {"9TAby0kNjHx9MW0oX2U5tR3UFfl4M6Fc", "9wvrVXbABOMWuYCjw7gUO392vyNUZwV5", "oIjlUv9NU41FuwHXUUl30vEJoeyVPwSF", "JlVHUpqpehe4aHwlXL0OVETXukPr4fcW", "GfpkmnHzyCQ55u0yEIPzZZ2ufTZGzuvl", "iXu", "GZ7JusZ2ldl0um7DtEFN5mFa9jg8Ap63", "v7caFSowC3UlJhstXeUgQGU5Rhf8cnDW"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C1662g4 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Y7 A0A;
    public final C1647fp A0B = new C1647fp(new byte[10]);
    public int A03 = 0;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A0D[2].charAt(3) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[4] = "GgX5caeaEGPD198FUZgXxTd6TFlI4FKd";
        strArr[6] = "GYCJgRx91u7iZEQsWB8T7bFfAdyad0o9";
        A0C = new byte[]{107, -72, -70, -67, -80, 107, -83, -60, -65, -80, -66, 88, -127, -121, Byte.MIN_VALUE, 118, 50, Byte.MIN_VALUE, 119, 121, 115, -122, 123, -120, 119, 50, -126, 115, 117, 125, 119, -122, 50, -126, 115, -117, 126, -127, 115, 118, 50, -123, 123, -116, 119, 76, 50, 95, 116, -126, 97, 116, 112, 115, 116, -127, 107, -124, 123, -114, -122, 123, 121, -118, 123, 122, 54, -119, -118, 119, -120, -118, 54, 121, -123, 122, 123, 54, -122, -120, 123, 124, Byte.MAX_VALUE, -114, 80, 54, -74, -49, -58, -39, -47, -58, -60, -43, -58, -59, -127, -44, -43, -62, -45, -43, -127, -54, -49, -59, -54, -60, -62, -43, -48, -45, -127, -45, -58, -62, -59, -54, -49, -56, -127, -58, -39, -43, -58, -49, -59, -58, -59, -127, -55, -58, -62, -59, -58, -45, -113, -88, -97, -78, -86, -97, -99, -82, -97, -98, 90, -83, -82, -101, -84, -82, 90, -93, -88, -98, -93, -99, -101, -82, -87, -84, 116, 90, -97, -78, -86, -97, -99, -82, -97, -98, 90};
    }

    static {
        A02();
    }

    public C1099Sc(Y7 y72) {
        this.A0A = y72;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void A01() {
        this.A0B.A08(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A09(4);
            this.A0B.A09(1);
            long pts = this.A0B.A04(15) << 15;
            long A04 = (this.A0B.A04(3) << 30) | pts;
            this.A0B.A09(1);
            long pts2 = this.A0B.A04(15);
            long j10 = A04 | pts2;
            this.A0B.A09(1);
            if (!this.A09 && this.A07) {
                this.A0B.A09(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A09(1);
                this.A0B.A09(1);
                this.A0B.A09(1);
                this.A05.A06((pts3 << 30) | (this.A0B.A04(15) << 15) | this.A0B.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A06(j10);
        }
    }

    private void A03(int i10) {
        this.A03 = i10;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A08(0);
        int A04 = this.A0B.A04(24);
        String A00 = A00(47, 9, 14);
        if (A04 != 1) {
            AbstractC1633fb.A07(A00, A00(56, 30, 21) + A04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A09(8);
        int A042 = this.A0B.A04(16);
        this.A0B.A09(5);
        this.A06 = this.A0B.A0H();
        this.A0B.A09(2);
        this.A08 = this.A0B.A0H();
        this.A07 = this.A0B.A0H();
        this.A0B.A09(6);
        int startCodePrefix = this.A0B.A04(8);
        this.A01 = startCodePrefix;
        if (A042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = A042 + 6;
            int packetLength = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength - startCodePrefix3;
            int startCodePrefix4 = this.A02;
            if (startCodePrefix4 < 0) {
                StringBuilder append = new StringBuilder().append(A00(11, 36, 17));
                int startCodePrefix5 = this.A02;
                AbstractC1633fb.A07(A00, append.append(startCodePrefix5).toString());
                this.A02 = -1;
            }
        }
        return true;
    }

    private boolean A05(C1648fq c1648fq, byte[] bArr, int i10) {
        int min = Math.min(c1648fq.A07(), i10 - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c1648fq.A0g(min);
        } else {
            int bytesToRead = this.A00;
            c1648fq.A0k(bArr, bytesToRead, min);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    @Override // com.facebook.ads.redexgen.X.YT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A51(com.facebook.ads.redexgen.X.C1648fq r8, int r9) throws com.facebook.ads.redexgen.X.Q6 {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1099Sc.A51(com.facebook.ads.redexgen.X.fq, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.YT
    public final void AA3(C1662g4 c1662g4, UL ul, YS ys) {
        this.A05 = c1662g4;
        this.A0A.A5S(ul, ys);
    }

    @Override // com.facebook.ads.redexgen.X.YT
    public final void AIB() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AIB();
    }
}
