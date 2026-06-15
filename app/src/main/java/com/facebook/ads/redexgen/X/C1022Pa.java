package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Pa  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1022Pa {
    public static byte[] A0E;
    public static String[] A0F = {"K1cFtqvk4JWdFkB", "Ozphz5vH", "xTN64ZRgh1", "99O2iySzHHrdIRjI4gkuIzfLxszKvwXS", "00En2YYHTdTn9mG", "RZyqTmCXtNkcSOc8b9R3I8ppBcDmZpwC", "EM8PEvozxpK0IPSK0odQsfgZataeTbp", "3cP"};
    public C1024Pc A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C1022Pa A04;
    public C1063Qs A05 = C1063Qs.A06;
    public C1491dH A06;
    public final R7 A07;
    public final Object A08;
    public final InterfaceC1381bV[] A09;
    public final PZ A0A;
    public final AbstractC1490dG A0B;
    public final InterfaceC1054Qi[] A0C;
    public final boolean[] A0D;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{108, 68, 69, 72, 64, 113, 68, 83, 72, 78, 69, 105, 78, 77, 69, 68, 83, 124, 73, 94, 69, 67, 72, 12, 94, 73, 64, 73, 77, 95, 73, 12, 74, 77, 69, 64, 73, 72, 2};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C1022Pa(InterfaceC1054Qi[] interfaceC1054QiArr, long j10, AbstractC1490dG abstractC1490dG, InterfaceC1496dM interfaceC1496dM, InterfaceC1352az interfaceC1352az, C1024Pc c1024Pc, C1491dH c1491dH) {
        this.A0C = interfaceC1054QiArr;
        this.A03 = j10 - c1024Pc.A03;
        this.A0B = abstractC1490dG;
        this.A08 = AbstractC1589es.A01(c1024Pc.A04.A04);
        this.A00 = c1024Pc;
        this.A06 = c1491dH;
        this.A09 = new InterfaceC1381bV[interfaceC1054QiArr.length];
        this.A0D = new boolean[interfaceC1054QiArr.length];
        this.A0A = new ZA(this, interfaceC1352az);
        this.A07 = A00(c1024Pc.A04, this.A0A, interfaceC1496dM, c1024Pc.A03, c1024Pc.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static R7 A00(R5 r52, PZ pz, InterfaceC1496dM interfaceC1496dM, long j10, long j11) {
        R7 A5M = pz.A5M(r52, interfaceC1496dM, j10);
        if (j11 != -9223372036854775807L) {
            return new C06168m(A5M, true, 0L, j11);
        }
        return A5M;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r3 = this;
            boolean r0 = r3.A08()
            if (r0 != 0) goto L7
            return
        L7:
            r2 = 0
        L8:
            com.facebook.ads.redexgen.X.dH r0 = r3.A06
            int r0 = r0.A00
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.dH r0 = r3.A06
            boolean r1 = r0.A00(r2)
            com.facebook.ads.redexgen.X.dH r0 = r3.A06
            com.facebook.ads.redexgen.X.QD[] r0 = r0.A04
            r0 = r0[r2]
            if (r1 == 0) goto L21
            if (r0 == 0) goto L21
            r0.A5n()
        L21:
            int r2 = r2 + 1
            goto L8
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1022Pa.A02():void");
    }

    private void A03() {
        if (!A08()) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = this.A06.A00;
            if (A0F[1].length() != 8) {
                throw new RuntimeException();
            }
            A0F[1] = "4oUgqrr8";
            if (i10 < i11) {
                boolean rendererEnabled = this.A06.A00(i10);
                QD qd = this.A06.A04[i10];
                if (rendererEnabled && qd != null) {
                    qd.A6A();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(PZ pz, R7 r72) {
        try {
            if (r72 instanceof C06168m) {
                pz.AGs(((C06168m) r72).A05);
            } else {
                pz.AGs(r72);
            }
        } catch (RuntimeException e8) {
            AbstractC1633fb.A08(A01(0, 17, 49), A01(17, 22, 60), e8);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(com.facebook.ads.redexgen.X.InterfaceC1381bV[] r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.Qi[] r0 = r3.A0C
            int r0 = r0.length
            if (r2 >= r0) goto L23
            com.facebook.ads.redexgen.X.Qi[] r0 = r3.A0C
            r0 = r0[r2]
            int r1 = r0.A9D()
            r0 = -2
            if (r1 != r0) goto L20
            com.facebook.ads.redexgen.X.dH r0 = r3.A06
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L20
            com.facebook.ads.redexgen.X.R9 r0 = new com.facebook.ads.redexgen.X.R9
            r0.<init>()
            r4[r2] = r0
        L20:
            int r2 = r2 + 1
            goto L1
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1022Pa.A06(com.facebook.ads.redexgen.X.bV[]):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.X.InterfaceC1381bV[] r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.Qi[] r0 = r3.A0C
            int r0 = r0.length
            if (r2 >= r0) goto L17
            com.facebook.ads.redexgen.X.Qi[] r0 = r3.A0C
            r0 = r0[r2]
            int r1 = r0.A9D()
            r0 = -2
            if (r1 != r0) goto L14
            r0 = 0
            r4[r2] = r0
        L14:
            int r2 = r2 + 1
            goto L1
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1022Pa.A07(com.facebook.ads.redexgen.X.bV[]):void");
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long A6y = this.A01 ? this.A07.A6y() : Long.MIN_VALUE;
        return A6y == Long.MIN_VALUE ? this.A00.A00 : A6y;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8R();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j10) {
        return this.A07.A6w(j10);
    }

    public final long A0D(long j10) {
        return j10 - A0B();
    }

    public final long A0E(long j10) {
        return A0B() + j10;
    }

    public final long A0F(C1491dH c1491dH, long j10, boolean z10) {
        return A0G(c1491dH, j10, z10, new boolean[this.A0C.length]);
    }

    public final long A0G(C1491dH c1491dH, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = false;
            if (i10 >= c1491dH.A00) {
                break;
            }
            boolean[] zArr2 = this.A0D;
            if (!z10 && c1491dH.A01(this.A06, i10)) {
                z11 = true;
            }
            zArr2[i10] = z11;
            i10++;
        }
        A07(this.A09);
        A02();
        this.A06 = c1491dH;
        A03();
        long AIF = this.A07.AIF(c1491dH.A04, this.A0D, this.A09, zArr, j10);
        A06(this.A09);
        this.A01 = false;
        for (int i11 = 0; i11 < this.A09.length; i11++) {
            if (this.A09[i11] != null) {
                AbstractC1589es.A08(c1491dH.A00(i11));
                if (this.A0C[i11].A9D() != -2) {
                    this.A01 = true;
                }
            } else {
                AbstractC1589es.A08(c1491dH.A04[i11] == null);
            }
        }
        return AIF;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z10) {
        if (!z10) {
            return this.A03;
        }
        long j10 = this.A00.A03 + this.A03;
        if (A0F[6].length() != 31) {
            throw new RuntimeException();
        }
        A0F[7] = "9m";
        return j10;
    }

    public final C1022Pa A0I() {
        return this.A04;
    }

    public final C1063Qs A0J() {
        return this.A05;
    }

    public final C1491dH A0K() {
        return this.A06;
    }

    public final C1491dH A0L(float f10, Timeline timeline) throws EK {
        QD[] qdArr;
        C1491dH A0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (QD qd : A0b.A04) {
            if (qd != null) {
                qd.AEW(f10);
            }
        }
        return A0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f10, Timeline timeline) throws EK {
        this.A02 = true;
        this.A05 = this.A07.A9C();
        long A0F2 = A0F(A0L(f10, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - A0F2;
        this.A00 = this.A00.A00(A0F2);
    }

    public final void A0O(long j10) {
        AbstractC1589es.A08(A08());
        this.A07.A52(A0D(j10));
    }

    public final void A0P(long j10) {
        AbstractC1589es.A08(A08());
        if (this.A02) {
            this.A07.AGe(A0D(j10));
        }
    }

    public final void A0Q(C1022Pa c1022Pa) {
        if (c1022Pa == this.A04) {
            return;
        }
        A02();
        this.A04 = c1022Pa;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A6y() == Long.MIN_VALUE);
    }
}
