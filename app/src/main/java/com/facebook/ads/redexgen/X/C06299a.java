package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.9a  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C06299a implements InterfaceC1135Tn {
    public static byte[] A04;
    public static String[] A05 = {"xHILsbM1", "r9UR5mr64LX6eV4yUDAPzib1Gta", "ZQbIEf", "HuBz2", "SUFRTEuidhxn3hImQljJKV", "gaKc2fXcJsaSfjwMpUKSyAgqbWjrPPEf", "i1SnwhgXOAnC9omDSsrvwHYzb4OR8iqS", "p33njeS322l"};
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C06299a A00(long j10, long j11, UY uy, C1648fq c1648fq) {
        int A0I;
        long j12 = j11;
        c1648fq.A0g(10);
        int A0C = c1648fq.A0C();
        if (A0C <= 0) {
            return null;
        }
        int i10 = uy.A03;
        long A0U = AbstractC1672gE.A0U(A0C, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int A0M = c1648fq.A0M();
        int A0M2 = c1648fq.A0M();
        if (A05[0].length() != 12) {
            A05[7] = "yOI5KAPdn3q";
            int A0M3 = c1648fq.A0M();
            c1648fq.A0g(2);
            long j13 = j12 + uy.A02;
            long[] jArr = new long[A0M];
            long[] jArr2 = new long[A0M];
            for (int i11 = 0; i11 < A0M; i11++) {
                jArr[i11] = (i11 * A0U) / A0M;
                jArr2[i11] = Math.max(j12, j13);
                switch (A0M3) {
                    case 1:
                        A0I = c1648fq.A0I();
                        break;
                    case 2:
                        A0I = c1648fq.A0M();
                        break;
                    case 3:
                        A0I = c1648fq.A0K();
                        break;
                    case 4:
                        A0I = c1648fq.A0L();
                        break;
                    default:
                        return null;
                }
                j12 += A0I * A0M2;
            }
            if (j10 != -1 && j10 != j12) {
                AbstractC1633fb.A07(A01(27, 10, 75), A01(2, 25, 59) + j10 + A01(0, 2, 25) + j12);
            }
            return new C06299a(jArr, jArr2, A0U, j12);
        }
        throw new RuntimeException();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 93);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-94, -106, -18, -38, -22, -31, -72, -4, -7, 12, -7, -72, 11, 1, 18, -3, -72, 5, 1, 11, 5, -7, 12, -5, 0, -46, -72, -2, 10, 26, 17, -5, 13, 13, 19, 13, 26};
    }

    static {
        A02();
    }

    public C06299a(long[] jArr, long[] jArr2, long j10, long j11) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1135Tn
    public final long A7Z() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final long A7j() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final C1153Ui A8r(long j10) {
        int A0L = AbstractC1672gE.A0L(this.A03, j10, true, true);
        C1154Uk c1154Uk = new C1154Uk(this.A03[A0L], this.A02[A0L]);
        int tableIndex = (c1154Uk.A01 > j10 ? 1 : (c1154Uk.A01 == j10 ? 0 : -1));
        if (tableIndex < 0) {
            int length = this.A03.length - 1;
            if (A05[3].length() == 20) {
                throw new RuntimeException();
            }
            A05[1] = "H8upqA";
            if (A0L != length) {
                int tableIndex2 = A0L + 1;
                long j11 = this.A03[tableIndex2];
                int tableIndex3 = A0L + 1;
                C1154Uk nextSeekPoint = new C1154Uk(j11, this.A02[tableIndex3]);
                return new C1153Ui(c1154Uk, nextSeekPoint);
            }
        }
        return new C1153Ui(c1154Uk);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1135Tn
    public final long A97(long j10) {
        return this.A03[AbstractC1672gE.A0L(this.A02, j10, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.Uj
    public final boolean AAY() {
        return true;
    }
}
