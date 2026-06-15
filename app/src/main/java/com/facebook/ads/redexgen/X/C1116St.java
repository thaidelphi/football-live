package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.St  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1116St implements Y7 {
    public static byte[] A0F;
    public static String[] A0G = {"OZFg8cDT1zW4NUDidX36nqGGlM4Gnu8K", "YxwsvdVZLa6TH49sylSv7ddyfHOhxbVG", "D83U0UlzcukiYKzxrILuT6PxEk1Lj8TQ", "6glzZoJmYKjpH1HAyU6B58rMMHWcC73Y", "zcDH3nZTS1tEXdqR5YtV5eEoeeJlj5n2", "pu", "1k8sKmYKIPJVodvZ7PQYtw1", "wDdnZxbyn4n991ybTI4kGUW0UM0nFxQM"};
    public long A01;
    public InterfaceC1157Uo A02;
    public YE A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final YL A0A;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean[] A0E = new boolean[3];
    public final YG A09 = new YG(7, 128);
    public final YG A07 = new YG(8, 128);
    public final YG A08 = new YG(6, 128);
    public long A00 = -9223372036854775807L;
    public final C1648fq A0B = new C1648fq();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 36);
            if (A0G[5].length() == 12) {
                throw new RuntimeException();
            }
            A0G[5] = "q4FUMn0GqMumvCZylFodlo8";
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{90, 69, 72, 73, 67, 3, 77, 90, 79};
    }

    static {
        A02();
    }

    public C1116St(YL yl, boolean z10, boolean z11) {
        this.A0A = yl;
        this.A0C = z10;
        this.A0D = z11;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A01() {
        AbstractC1589es.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A03(long j10, int i10, int i11, long j11) {
        if (!this.A05 || this.A03.A06()) {
            this.A09.A04(i11);
            this.A07.A04(i11);
            if (!this.A05) {
                boolean A03 = this.A09.A03();
                if (A0G[6].length() != 23) {
                    throw new RuntimeException();
                }
                String[] strArr = A0G;
                strArr[1] = "udLg1q2ZrOTIf2qwyZfeBrXAEO90namO";
                strArr[3] = "UGUyldlipVmX2Icsyd88CJZiZqmsu6EW";
                if (A03 && this.A07.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A09.A01, this.A09.A00));
                    arrayList.add(Arrays.copyOf(this.A07.A01, this.A07.A00));
                    C1148Uc A09 = AbstractC1149Ud.A09(this.A09.A01, 3, this.A09.A00);
                    Ub A07 = AbstractC1149Ud.A07(this.A07.A01, 3, this.A07.A00);
                    this.A02.A6U(new P5().A0y(this.A04).A11(A00(0, 9, 8)).A0w(AbstractC1597f0.A01(A09.A08, A09.A01, A09.A04)).A0r(A09.A0A).A0f(A09.A03).A0Y(A09.A00).A12(arrayList).A14());
                    this.A05 = true;
                    this.A03.A04(A09);
                    this.A03.A03(A07);
                    this.A09.A00();
                    this.A07.A00();
                }
            } else if (this.A09.A03()) {
                this.A03.A04(AbstractC1149Ud.A09(this.A09.A01, 3, this.A09.A00));
                this.A09.A00();
            } else if (this.A07.A03()) {
                this.A03.A03(AbstractC1149Ud.A07(this.A07.A01, 3, this.A07.A00));
                this.A07.A00();
            }
        }
        if (this.A08.A04(i11)) {
            this.A0B.A0j(this.A08.A01, AbstractC1149Ud.A02(this.A08.A01, this.A08.A00));
            this.A0B.A0f(4);
            this.A0A.A02(j11, this.A0B);
        }
        boolean sampleIsKeyFrame = this.A03.A07(j10, i10, this.A05, this.A06);
        if (sampleIsKeyFrame) {
            this.A06 = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A04(long j10, int i10, long j11) {
        if (!this.A05 || this.A03.A06()) {
            this.A09.A01(i10);
            this.A07.A01(i10);
        }
        this.A08.A01(i10);
        this.A03.A02(j10, i10, j11);
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(byte[] bArr, int i10, int i11) {
        if (!this.A05 || this.A03.A06()) {
            this.A09.A02(bArr, i10, i11);
            this.A07.A02(bArr, i10, i11);
        }
        this.A08.A02(bArr, i10, i11);
        this.A03.A05(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A50(C1648fq c1648fq) {
        A01();
        int A09 = c1648fq.A09();
        int A0A = c1648fq.A0A();
        byte[] A0l = c1648fq.A0l();
        long j10 = this.A01;
        int offset = c1648fq.A07();
        this.A01 = j10 + offset;
        InterfaceC1157Uo interfaceC1157Uo = this.A02;
        int offset2 = c1648fq.A07();
        interfaceC1157Uo.AHx(c1648fq, offset2);
        while (true) {
            int A04 = AbstractC1149Ud.A04(A0l, A09, A0A, this.A0E);
            if (A04 == A0A) {
                A05(A0l, A09, A0A);
                return;
            }
            int lengthToNalUnit = AbstractC1149Ud.A01(A0l, A04);
            int i10 = A04 - A09;
            if (i10 > 0) {
                A05(A0l, A09, A04);
            }
            int i11 = A0A - A04;
            long j11 = this.A01 - i11;
            int offset3 = i10 < 0 ? -i10 : 0;
            A03(j11, i11, offset3, this.A00);
            A04(j11, lengthToNalUnit, this.A00);
            A09 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A04 = ys.A04();
        this.A02 = ul.AJX(ys.A03(), 2);
        this.A03 = new YE(this.A02, this.A0C, this.A0D);
        this.A0A.A03(ul, ys);
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AFy(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A00 = j10;
        }
        this.A06 |= (i10 & 2) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.Y7
    public final void AIB() {
        this.A01 = 0L;
        this.A06 = false;
        this.A00 = -9223372036854775807L;
        AbstractC1149Ud.A0H(this.A0E);
        this.A09.A00();
        this.A07.A00();
        this.A08.A00();
        if (this.A03 != null) {
            this.A03.A01();
        }
    }
}
