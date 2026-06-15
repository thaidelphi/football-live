package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* renamed from: com.facebook.ads.redexgen.X.Vs  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1185Vs implements UK {
    public static byte[] A0F;
    public static String[] A0G = {"WLnpqGwmHzJm", "j8mDpLZRt4jb0btoE3PowdlhKiYjooMv", "LvKPX1ruzLtbKAGXr", "saGT", "wAR", "aUAlrYknYHDWmbpnmJ0ialHsJrvjxoz3", "rxYfuj", "TLYsWmYAWPG3QVmpl"};
    public static final UO A0H;
    public static final int A0I;
    public static final byte[] A0J;
    public static final byte[] A0K;
    public static final int[] A0L;
    public static final int[] A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public UL A07;
    public Uj A08;
    public InterfaceC1157Uo A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final byte[] A0E;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{70, 0, 20, 7, 11, 3, 70, 18, 31, 22, 3, 70, 114, 112, 16, 28, 3, 91, 105, 107, 11, 7, 24, 103, 29, 8, 64, 71, 107, 113, 104, 96, 36, 106, 107, 112, 36, 98, 109, 106, 96, 36, 69, 73, 86, 36, 108, 97, 101, 96, 97, 118, 42, 32, 5, 5, 12, 14, 8, 5, 73, 40, 36, 59, 73, 39, 0, 24, 15, 2, 7, 10, 78, 30, 15, 10, 10, 7, 0, 9, 78, 12, 7, 26, 29, 78, 8, 1, 28, 78, 8, 28, 15, 3, 11, 78, 6, 11, 15, 10, 11, 28, 78, 7, 11, 7, 18, 80, 68, 85, 88, 94, 30, 2, 86, 65, 65, 11, 31, 14, 3, 5, 69, 11, 7, 24, 71, 29, 8};
    }

    static {
        A08();
        A0H = new UO() { // from class: com.facebook.ads.redexgen.X.Vu
            @Override // com.facebook.ads.redexgen.X.UO
            public final UK[] A5D() {
                return C1185Vs.A0F();
            }

            @Override // com.facebook.ads.redexgen.X.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A0L = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0M = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0J = AbstractC1672gE.A1G(A05(12, 6, 86));
        A0K = AbstractC1672gE.A1G(A05(18, 9, 77));
        A0I = A0M[8];
    }

    public C1185Vs() {
        this(0);
    }

    public C1185Vs(int i10) {
        this.A0D = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.A0E = new byte[1];
        this.A02 = -1;
    }

    private int A00(int i10) throws Q6 {
        String A05;
        if (A0B(i10)) {
            return this.A0C ? A0M[i10] : A0L[i10];
        }
        StringBuilder append = new StringBuilder().append(A05(53, 12, 110));
        if (this.A0C) {
            A05 = A05(105, 2, 87);
        } else {
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[7] = "8dm40L0Xxtb1614WY";
            strArr2[2] = "fsDKX5xha6jCJ8wPN";
            A05 = A05(103, 2, 78);
        }
        throw Q6.A01(append.append(A05).append(A05(0, 12, 97)).append(i10).toString(), null);
    }

    public static int A01(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private int A02(WJ wj) throws IOException {
        wj.AHr();
        wj.AG1(this.A0E, 0, 1);
        byte b10 = this.A0E[0];
        if ((b10 & 131) <= 0) {
            return A00((b10 >> 3) & 15);
        }
        throw Q6.A01(A05(65, 38, 105) + ((int) b10), null);
    }

    @RequiresNonNull({"trackOutput"})
    private int A03(WJ wj) throws IOException {
        if (this.A00 == 0) {
            try {
                this.A01 = A02(wj);
                this.A00 = this.A01;
                if (this.A02 == -1) {
                    this.A05 = wj.A8d();
                    this.A02 = this.A01;
                }
                if (this.A02 == this.A01) {
                    int i10 = this.A03 + 1;
                    String[] strArr = A0G;
                    if (strArr[7].length() != strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0G[4] = "DrG5s2EXS07EKtERz1su";
                    this.A03 = i10;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int AHv = this.A09.AHv(wj, this.A00, true);
        if (AHv == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AHv;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A09.AI0(this.A06 + this.A04, 1, this.A01, 0, null);
        this.A04 += 20000;
        return 0;
    }

    private WV A04(long j10, boolean z10) {
        return new WV(j10, this.A05, A01(this.A02, 20000L), this.A02, z10);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A06() {
        AbstractC1589es.A02(this.A09);
    }

    @RequiresNonNull({"trackOutput"})
    private void A07() {
        String mimeType;
        if (!this.A0A) {
            this.A0A = true;
            if (this.A0C) {
                mimeType = A05(117, 12, 109);
            } else {
                String[] strArr = A0G;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[1] = "xYlTR7AHoq9Btbkfj7cnPkAPY8waGihj";
                strArr2[5] = "8zgGBAOeTIqisba15obpkgdWIAQY52mi";
                mimeType = A05(107, 10, 54);
            }
            this.A09.A6U(new P5().A11(mimeType).A0h(A0I).A0b(1).A0m(this.A0C ? 16000 : 8000).A14());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    private void A09(long j10, int i10) {
        if (this.A0B) {
            return;
        }
        if ((this.A0D & 1) == 0 || j10 == -1 || (this.A02 != -1 && this.A02 != this.A01)) {
            this.A08 = new C1191Vy(-9223372036854775807L);
            this.A07.AID(this.A08);
            this.A0B = true;
        } else if (this.A03 < 20 && i10 != -1) {
        } else {
            int i11 = this.A0D & 2;
            if (A0G[4].length() == 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[7] = "Yj3RbeqTURvS4mmIQ";
            strArr[2] = "9kw349pbOT2Mbg8Sw";
            this.A08 = A04(j10, i11 != 0);
            this.A07.AID(this.A08);
            this.A0B = true;
        }
    }

    private boolean A0A(int i10) {
        return !this.A0C && (i10 < 12 || i10 > 14);
    }

    private boolean A0B(int i10) {
        if (i10 >= 0 && i10 <= 15) {
            boolean A0C = A0C(i10);
            String[] strArr = A0G;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "eJjdpXlyupLRxhI1";
            if (A0C || A0A(i10)) {
                return true;
            }
        }
        return false;
    }

    private boolean A0C(int i10) {
        return this.A0C && (i10 < 10 || i10 > 13);
    }

    private boolean A0D(WJ wj) throws IOException {
        if (A0E(wj, A0J)) {
            this.A0C = false;
            wj.AJ9(A0J.length);
            return true;
        } else if (A0E(wj, A0K)) {
            this.A0C = true;
            int length = A0K.length;
            if (A0G[4].length() != 6) {
                String[] strArr = A0G;
                strArr[3] = "tExa";
                strArr[0] = "s7rENZw3HAf4";
                wj.AJ9(length);
                return true;
            }
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    public static boolean A0E(WJ wj, byte[] bArr) throws IOException {
        wj.AHr();
        byte[] bArr2 = new byte[bArr.length];
        wj.AG1(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public static /* synthetic */ UK[] A0F() {
        return new UK[]{new C1185Vs()};
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AA0(UL ul) {
        this.A07 = ul;
        this.A09 = ul.AJX(0, 1);
        ul.A6E();
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final int AGT(WJ wj, C1152Ug c1152Ug) throws IOException {
        A06();
        if (wj.A8d() != 0 || A0D(wj)) {
            A07();
            int A03 = A03(wj);
            A09(wj.A8E(), A03);
            return A03;
        }
        throw Q6.A01(A05(27, 26, 3), null);
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final void AIC(long j10, long j11) {
        this.A04 = 0L;
        this.A01 = 0;
        this.A00 = 0;
        if (j10 != 0 && (this.A08 instanceof WV)) {
            this.A06 = ((WV) this.A08).A02(j10);
        } else {
            this.A06 = 0L;
        }
    }

    @Override // com.facebook.ads.redexgen.X.UK
    public final boolean AJB(WJ wj) throws IOException {
        return A0D(wj);
    }
}
