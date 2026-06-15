package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Wi  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1201Wi {
    public static byte[] A0B;
    public static String[] A0C = {"VuRa0hoG4TndZuLpWOztYVF", "tJtHOf0G5Eo1LqK", "MmD5sDI9HZPvDS2dmrMrvBz", "CxnyFwRSJ2own3tKkETgrns1qWjEMF6u", "T8ltN1RKsPXuJ0RYd32TVwm9eSvclJ11", "k2g", "qm04N", "WQ7j3YZDGFUlXz6OW6Sp2iBzL8ik0ATg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final C1648fq A0A = new C1648fq(255);

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{-33, -40, -35, -33, -38, -38, -39, -36, -34, -49, -50, -118, -52, -45, -34, -118, -35, -34, -36, -49, -53, -41, -118, -36, -49, -32, -45, -35, -45, -39, -40};
    }

    static {
        A01();
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(WJ wj) throws IOException {
        return A04(wj, -1L);
    }

    public final boolean A04(WJ wj, long j10) throws IOException {
        AbstractC1589es.A07(wj.A8d() == wj.A8Y());
        this.A0A.A0d(4);
        while (true) {
            if ((j10 == -1 || wj.A8d() + 4 < j10) && UM.A04(wj, this.A0A.A0l(), 0, 4, true)) {
                this.A0A.A0f(0);
                if (this.A0A.A0Q() == 1332176723) {
                    wj.AHr();
                    return true;
                }
                wj.AJ9(1);
            }
        }
        do {
            if (j10 != -1 && wj.A8d() >= j10) {
                break;
            }
        } while (wj.AJ6(1) != -1);
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x0090 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.redexgen.X.WJ r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            r8.A02()
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            r3 = 27
            r0.A0d(r3)
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            byte[] r0 = r0.A0l()
            r2 = 0
            boolean r0 = com.facebook.ads.redexgen.X.UM.A04(r9, r0, r2, r3, r10)
            if (r0 == 0) goto L24
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            long r6 = r0.A0Q()
            r4 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L25
        L24:
            return r2
        L25:
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            int r0 = r0.A0I()
            r8.A03 = r0
            int r0 = r8.A03
            if (r0 == 0) goto L42
            if (r10 == 0) goto L34
            return r2
        L34:
            r2 = 0
            r1 = 31
            r0 = 77
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.Q6 r0 = com.facebook.ads.redexgen.X.Q6.A00(r0)
            throw r0
        L42:
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            int r0 = r0.A0I()
            r8.A04 = r0
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            long r0 = r0.A0N()
            r8.A05 = r0
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            long r0 = r0.A0O()
            r8.A08 = r0
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            long r0 = r0.A0O()
            r8.A07 = r0
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            long r0 = r0.A0O()
            r8.A06 = r0
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            int r0 = r0.A0I()
            r8.A02 = r0
            int r0 = r8.A02
            int r0 = r0 + r3
            r8.A01 = r0
            com.facebook.ads.redexgen.X.fq r1 = r8.A0A
            int r0 = r8.A02
            r1.A0d(r0)
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            byte[] r1 = r0.A0l()
            int r0 = r8.A02
            boolean r0 = com.facebook.ads.redexgen.X.UM.A04(r9, r1, r2, r0, r10)
            if (r0 != 0) goto L8d
            return r2
        L8d:
            r2 = 0
        L8e:
            int r0 = r8.A02
            if (r2 >= r0) goto La8
            int[] r1 = r8.A09
            com.facebook.ads.redexgen.X.fq r0 = r8.A0A
            int r0 = r0.A0I()
            r1[r2] = r0
            int r1 = r8.A00
            int[] r0 = r8.A09
            r0 = r0[r2]
            int r1 = r1 + r0
            r8.A00 = r1
            int r2 = r2 + 1
            goto L8e
        La8:
            r3 = 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1201Wi.A0C
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 29
            if (r1 == r0) goto Lbe
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1201Wi.A0C
            java.lang.String r1 = "CqFQ65VHAZ8UrjOPC72rQF5pGH0gGM8O"
            r0 = 4
            r2[r0] = r1
            return r3
        Lbe:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1201Wi.A05(com.facebook.ads.redexgen.X.WJ, boolean):boolean");
    }
}
