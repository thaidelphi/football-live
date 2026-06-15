package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class W0 {
    public static String[] A02 = {"", "x6sQOPKcKrQATs1e", "4", "nFmEZNjWaB0a2IvFYrUZsxH0HRcIIjns", "KdBqiPPuwTbWvCYwQhXPEgpWDeH", "", "URGp4hdCrsvY44ewIJdlcJbH7089xYie", "vybRPLtlTpN7zYOCBleuQhDw65w5f0Px"};
    public int A00;
    public final C1648fq A01 = new C1648fq(8);

    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A00(com.facebook.ads.redexgen.X.WJ r6) throws java.io.IOException {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.fq r0 = r5.A01
            byte[] r0 = r0.A0l()
            r1 = 0
            r2 = 1
            r6.AG1(r0, r1, r2)
            com.facebook.ads.redexgen.X.fq r0 = r5.A01
            byte[] r0 = r0.A0l()
            r0 = r0[r1]
            r4 = r0 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L1a
            r0 = -9223372036854775808
            return r0
        L1a:
            r1 = 128(0x80, float:1.794E-43)
            r3 = 0
        L1d:
            r0 = r4 & r1
            if (r0 != 0) goto L26
            int r1 = r1 >> 1
            int r3 = r3 + 1
            goto L1d
        L26:
            int r0 = ~r1
            r4 = r4 & r0
            com.facebook.ads.redexgen.X.fq r0 = r5.A01
            byte[] r0 = r0.A0l()
            r6.AG1(r0, r2, r3)
            r2 = 0
        L32:
            if (r2 >= r3) goto L46
            int r4 = r4 << 8
            com.facebook.ads.redexgen.X.fq r0 = r5.A01
            byte[] r1 = r0.A0l()
            int r0 = r2 + 1
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r0
            int r2 = r2 + 1
            goto L32
        L46:
            int r1 = r5.A00
            int r0 = r3 + 1
            int r1 = r1 + r0
            r5.A00 = r1
            long r0 = (long) r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W0.A00(com.facebook.ads.redexgen.X.WJ):long");
    }

    public final boolean A01(WJ wj) throws IOException {
        long A8E = wj.A8E();
        long j10 = 1024;
        if (A8E != -1 && A8E <= 1024) {
            j10 = A8E;
        }
        int i10 = (int) j10;
        boolean z10 = false;
        wj.AG1(this.A01.A0l(), 0, 4);
        long tag = this.A01.A0Q();
        this.A00 = 4;
        while (tag != 440786851) {
            int i11 = this.A00 + 1;
            this.A00 = i11;
            if (i11 == i10) {
                return false;
            }
            wj.AG1(this.A01.A0l(), 0, 1);
            tag = ((tag << 8) & (-256)) | (this.A01.A0l()[0] & 255);
        }
        long headerStart = A00(wj);
        long inputLength = this.A00;
        if (headerStart != Long.MIN_VALUE) {
            if (A8E != -1 && inputLength + headerStart >= A8E) {
                return false;
            }
            while (this.A00 < inputLength + headerStart) {
                if (A00(wj) == Long.MIN_VALUE) {
                    return z10;
                }
                long A00 = A00(wj);
                if (A00 < 0 || A00 > 2147483647L) {
                    return false;
                }
                if (A00 != 0) {
                    int i12 = (int) A00;
                    String[] strArr = A02;
                    if (strArr[3].charAt(28) == strArr[6].charAt(28)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[3] = "qrC6yzEziiSPgV4ghxfhfUqRXLL1eowI";
                    strArr2[6] = "vK5NU4VGpe446g90Il0q7V20wV4rPa1C";
                    wj.A3x(i12);
                    this.A00 += i12;
                }
                z10 = false;
            }
            return ((long) this.A00) == inputLength + headerStart;
        }
        return false;
    }
}
