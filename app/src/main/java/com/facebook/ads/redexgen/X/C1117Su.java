package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
/* renamed from: com.facebook.ads.redexgen.X.Su  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1117Su implements Y7 {
    public static byte[] A0B;
    public static String[] A0C = {"UU4", "5kDq5zCM4dG6d991NXD0G9sJ0WOPqwsB", "p8XkjQAStLHUtKqrrAiwER6ksTNJUz4t", "DnJlNyrg4kuLhVn8G8l5X81joGPyP58J", "jIMRReNOGQp72Y08UAi", "Md1mOSXgUozSA6Q11b5qmTBd2J7pcDmW", "K81b8MFQIdYrhTyCLHBhed6wTbPrpXAS", "AlijsJ9SYvI1ijHaTPMhehKC4E8b4JSt"};
    public static final float[] A0D;
    public long A00;
    public long A01;
    public InterfaceC1157Uo A02;
    public YB A03;
    public String A04;
    public boolean A05;
    public final YA A06;
    public final YG A07;
    public final YV A08;
    public final C1648fq A09;
    public final boolean[] A0A;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{4, -18, -14, -17, 14, 33, 29, 32, 33, 46, -1, 36, 44, 23, 34, 31, 26, -42, 23, 41, 38, 27, 25, 42, -42, 40, 23, 42, 31, 37, -81, -44, -36, -57, -46, -49, -54, -122, -36, -43, -42, -59, -49, -44, -55, -40, -53, -45, -53, -44, -38, -59, -38, -49, -45, -53, -59, -40, -53, -39, -43, -46, -37, -38, -49, -43, -44, -11, 14, 8, 1, 14, 4, 12, 5, 4, -64, 22, 9, 4, 5, 15, -64, 15, 2, 10, 5, 3, 20, -64, 12, 1, 25, 5, 18, -64, 19, 8, 1, 16, 5, 58, 45, 40, 41, 51, -13, 49, 52, -8, 58, -15, 41, 55};
    }

    static {
        A02();
        A0D = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    }

    public C1117Su() {
        this(null);
    }

    public C1117Su(YV yv) {
        this.A08 = yv;
        this.A0A = new boolean[4];
        this.A06 = new YA(128);
        this.A00 = -9223372036854775807L;
        if (yv != null) {
            this.A07 = new YG(178, 128);
            this.A09 = new C1648fq();
            return;
        }
        this.A07 = null;
        this.A09 = null;
    }

    public static ZM A00(YA ya, int i10, String str) {
        float f10;
        byte[] copyOf = Arrays.copyOf(ya.A02, ya.A00);
        C1647fp c1647fp = new C1647fp(copyOf);
        c1647fp.A0A(i10);
        c1647fp.A0A(4);
        c1647fp.A07();
        c1647fp.A09(8);
        if (c1647fp.A0H()) {
            c1647fp.A09(4);
            c1647fp.A09(3);
        }
        int A04 = c1647fp.A04(4);
        String A01 = A01(10, 20, 90);
        String A012 = A01(0, 10, 96);
        if (A04 == 15) {
            int A042 = c1647fp.A04(8);
            int A043 = c1647fp.A04(8);
            if (A043 == 0) {
                AbstractC1633fb.A07(A012, A01);
                f10 = 1.0f;
            } else {
                f10 = A042 / A043;
            }
        } else if (A04 < A0D.length) {
            f10 = A0D[A04];
        } else {
            AbstractC1633fb.A07(A012, A01);
            f10 = 1.0f;
        }
        if (c1647fp.A0H()) {
            c1647fp.A09(2);
            c1647fp.A09(1);
            if (c1647fp.A0H()) {
                c1647fp.A09(15);
                String[] strArr = A0C;
                if (strArr[1].charAt(20) == strArr[3].charAt(20)) {
                    throw new RuntimeException();
                }
                A0C[2] = "xfKDXpL2Bcgn811sgO7YIyKvVTmQhFv5";
                c1647fp.A07();
                c1647fp.A09(15);
                c1647fp.A07();
                c1647fp.A09(15);
                c1647fp.A07();
                c1647fp.A09(3);
                c1647fp.A09(11);
                c1647fp.A07();
                c1647fp.A09(15);
                c1647fp.A07();
            }
        }
        if (c1647fp.A04(2) != 0) {
            AbstractC1633fb.A07(A012, A01(67, 34, 68));
        }
        c1647fp.A07();
        int A044 = c1647fp.A04(16);
        c1647fp.A07();
        if (c1647fp.A0H()) {
            if (A044 == 0) {
                AbstractC1633fb.A07(A012, A01(30, 37, 10));
            } else {
                int i11 = 0;
                for (int i12 = A044 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c1647fp.A09(i11);
            }
        }
        c1647fp.A07();
        int videoObjectLayerWidth = c1647fp.A04(13);
        c1647fp.A07();
        int videoObjectLayerHeight = c1647fp.A04(13);
        c1647fp.A07();
        c1647fp.A07();
        return new P5().A0y(str).A11(A01(101, 13, 104)).A0r(videoObjectLayerWidth).A0f(videoObjectLayerHeight).A0Y(f10).A12(Collections.singletonList(copyOf)).A14();
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A50(C1648fq c1648fq) {
        AbstractC1589es.A02(this.A03);
        AbstractC1589es.A02(this.A02);
        int startCodeValue = c1648fq.A09();
        int bytesAlreadyPassed = c1648fq.A0A();
        byte[] A0l = c1648fq.A0l();
        long j10 = this.A01;
        int offset = c1648fq.A07();
        this.A01 = j10 + offset;
        InterfaceC1157Uo interfaceC1157Uo = this.A02;
        int offset2 = c1648fq.A07();
        interfaceC1157Uo.AHx(c1648fq, offset2);
        while (true) {
            boolean[] zArr = this.A0A;
            int limit = A0C[0].length();
            if (limit == 30) {
                throw new RuntimeException();
            }
            A0C[2] = "CFtUxCmNoBWhFiIEntXm3PjzCTYd2fYp";
            int offset3 = AbstractC1149Ud.A04(A0l, startCodeValue, bytesAlreadyPassed, zArr);
            if (offset3 == bytesAlreadyPassed) {
                if (!this.A05) {
                    this.A06.A03(A0l, startCodeValue, bytesAlreadyPassed);
                }
                this.A03.A03(A0l, startCodeValue, bytesAlreadyPassed);
                if (this.A07 != null) {
                    this.A07.A02(A0l, startCodeValue, bytesAlreadyPassed);
                    return;
                }
                return;
            }
            byte[] dataArray = c1648fq.A0l();
            int limit2 = offset3 + 3;
            int i10 = dataArray[limit2] & 255;
            int startCodeOffset = offset3 - startCodeValue;
            if (!this.A05) {
                if (startCodeOffset > 0) {
                    this.A06.A03(A0l, startCodeValue, offset3);
                }
                if (this.A06.A04(i10, startCodeOffset < 0 ? -startCodeOffset : 0)) {
                    this.A02.A6U(A00(this.A06, this.A06.A01, (String) AbstractC1589es.A01(this.A04)));
                    this.A05 = true;
                }
            }
            this.A03.A03(A0l, startCodeValue, offset3);
            if (this.A07 != null) {
                int i11 = 0;
                if (startCodeOffset > 0) {
                    this.A07.A02(A0l, startCodeValue, offset3);
                } else {
                    i11 = -startCodeOffset;
                }
                if (this.A07.A04(i11)) {
                    byte[] dataArray2 = this.A07.A01;
                    int limit3 = this.A07.A00;
                    ((C1648fq) AbstractC1672gE.A0f(this.A09)).A0j(this.A07.A01, AbstractC1149Ud.A02(dataArray2, limit3));
                    ((YV) AbstractC1672gE.A0f(this.A08)).A02(this.A00, this.A09);
                }
                if (i10 == 178) {
                    byte[] dataArray3 = c1648fq.A0l();
                    int limit4 = offset3 + 2;
                    if (dataArray3[limit4] == 1) {
                        this.A07.A01(i10);
                    }
                }
            }
            int i12 = bytesAlreadyPassed - offset3;
            this.A03.A02(this.A01 - i12, i12, this.A05);
            this.A03.A01(i10, this.A00);
            startCodeValue = offset3 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A04 = ys.A04();
        this.A02 = ul.AJX(ys.A03(), 2);
        this.A03 = new YB(this.A02);
        if (this.A08 != null) {
            this.A08.A03(ul, ys);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A00 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        AbstractC1149Ud.A0H(this.A0A);
        this.A06.A02();
        if (this.A03 != null) {
            this.A03.A00();
        }
        if (this.A07 != null) {
            this.A07.A00();
        }
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
    }
}
