package com.facebook.ads.redexgen.X;

import com.google.android.gms.ads.AdSize;
import com.ironsource.b9;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Zh  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1276Zh implements PC {
    public static byte[] A0B;
    public static String[] A0C = {"jdifV9NSKFgBfA6xcTjJSx5M3mBsLS", "7Bo6McMdkVA9mEt", "7M2kCs67bICZmC1", "qEXS6zSKBwG", "g7ygpaxuI", "CO", "a4Ab6jnOeckgnUlTzJxrHjzr1qc1VJkR", "QIAJLi3L177ELmNvbWpUTg2BA3j6dB9W"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final Q5 A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0C;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[7] = "j5ANPDpq4yvrn6dumAYzk3L0Hj2UFh8o";
            strArr2[6] = "myAPgYEonp6qT7f5Rpmd70fXQeyiyhdZ";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 35);
            i13++;
        }
    }

    public static void A03() {
        A0B = new byte[]{-94, -27, -29, -16, -16, -15, -10, -94, -28, -25, -94, -18, -25, -11, -11, -94, -10, -22, -29, -16, -94, -85, -69, -36, -35, -40, -20, -29, -21, -61, -26, -40, -37, -70, -26, -27, -21, -23, -26, -29, -29, -16, 1, -10, -12, 3, -81, -15, 4, -11, -11, -12, 1, -81, 2, -8, 9, -12, -81, 1, -12, -16, -14, -9, -12, -13, -81, 6, -8, 3, -9, -81, -5, -12, 2, 2, -81, 3, -9, -16, -3, -81, -60, -65, -65, -4, 2, -81, -2, -11, -81, -15, 4, -11, -11, -12, 1, -12, -13, -81, -4, -12, -13, -8, -16, -81, -13, -16, 3, -16, -67, -77, -78, -76, -68, -109, -58, -73, -73, -74, -61, -107, -58, -61, -78, -59, -70, -64, -65, -98, -60, -98, -79, -94, -94, -95, -82, -126, -85, -82, -116, -88, -99, -75, -98, -99, -97, -89, 125, -94, -80, -95, -82, -114, -95, -98, -79, -94, -94, -95, -82, -119, -81, -80, -61, -76, -76, -77, -64, -108, -67, -64, -98, -70, -81, -57, -80, -81, -79, -71, -101, -63, -33, -45, -22, -76, -25, -40, -40, -41, -28, -65, -27, -107, -111, -106, 106, -99, -114, -114, -115, -102, 117, -101};
    }

    static {
        A03();
    }

    public C1276Zh() {
        this(new Q5(true, 65536), b9.b.f16554d, b9.b.f16554d, 2500, 5000, -1, false, 0, false);
    }

    public C1276Zh(Q5 q52, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        int i16;
        String A02 = A02(163, 19, 43);
        String A022 = A02(21, 1, 88);
        A04(i12, 0, A02, A022);
        String A023 = A02(131, 32, 25);
        A04(i13, 0, A023, A022);
        String A024 = A02(193, 11, 5);
        A04(i10, i12, A024, A02);
        A04(i10, i13, A024, A023);
        A04(i11, i10, A02(182, 11, 79), A024);
        A04(i15, 0, A02(111, 20, 46), A022);
        this.A08 = q52;
        this.A07 = AbstractC1672gE.A0O(i10);
        this.A06 = AbstractC1672gE.A0O(i11);
        this.A05 = AbstractC1672gE.A0O(i12);
        this.A04 = AbstractC1672gE.A0O(i13);
        this.A02 = i14;
        if (this.A02 != -1) {
            i16 = this.A02;
        } else {
            i16 = 13107200;
        }
        this.A00 = i16;
        this.A09 = z10;
        this.A03 = AbstractC1672gE.A0O(i15);
        this.A0A = z11;
    }

    public static int A00(int i10) {
        switch (i10) {
            case AdSize.AUTO_HEIGHT /* -2 */:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 131072;
            case 5:
                return 131072;
            case 6:
                return 131072;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A01(com.facebook.ads.redexgen.X.InterfaceC1259Yq[] r4, com.facebook.ads.redexgen.X.QD[] r5) {
        /*
            r3 = this;
            r2 = 0
            r1 = 0
        L2:
            int r0 = r4.length
            if (r1 >= r0) goto L17
            r0 = r5[r1]
            if (r0 == 0) goto L14
            r0 = r4[r1]
            int r0 = r0.A9D()
            int r0 = A00(r0)
            int r2 = r2 + r0
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            int r0 = java.lang.Math.max(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1276Zh.A01(com.facebook.ads.redexgen.X.Yq[], com.facebook.ads.redexgen.X.QD[]):int");
    }

    public static void A04(int i10, int i11, String str, String str2) {
        AbstractC1589es.A09(i10 >= i11, str + A02(0, 21, 95) + str2);
    }

    private void A05(boolean z10) {
        int i10;
        if (this.A02 == -1) {
            i10 = 13107200;
        } else {
            i10 = this.A02;
        }
        this.A00 = i10;
        this.A01 = false;
        if (z10) {
            this.A08.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final Q5 A6l() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final long A6q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final void AEm() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final void AFF() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final void AFN(InterfaceC1259Yq[] interfaceC1259YqArr, C1063Qs c1063Qs, QD[] qdArr) {
        int i10;
        if (this.A02 == -1) {
            i10 = A01(interfaceC1259YqArr, qdArr);
        } else {
            i10 = this.A02;
        }
        this.A00 = i10;
        this.A08.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final boolean AHt() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final boolean AJ1(long j10, long j11, float f10, boolean z10) {
        boolean z11 = true;
        boolean z12 = this.A08.A00() >= this.A00;
        long j12 = this.A07;
        if (f10 > 1.0f) {
            j12 = Math.min(AbstractC1672gE.A0Q(j12, f10), this.A06);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.A09 && z12) {
                z11 = false;
            }
            this.A01 = z11;
            if (!this.A01 && j11 < 500000) {
                AbstractC1633fb.A07(A02(22, 18, 84), A02(40, 71, 108));
            }
        } else if (j11 >= this.A06 || z12) {
            this.A01 = false;
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final boolean AJ4(long j10, float f10, boolean z10, boolean z11, long j11) {
        long A0R = AbstractC1672gE.A0R(j10, f10);
        long j12 = z10 ? this.A04 : this.A05;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || A0R >= j12 || (!this.A09 && this.A08.A00() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.PC
    public final void onPrepared() {
        A05(false);
    }
}
