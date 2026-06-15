package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class P3 {
    public static String[] A01 = {"YwrNdni1f5xaVIfDCBpdk2mDwbnjmL5w", "bqxPCkfc5PVgpmbXl7zfXSakktvu1UwV", "4cKYSH1h", "1LFJybDCj8pbtvDfpsT5sKrTzd1Kzm53", "IpCHvfG5zVXZdgwzcHJYlkFhjl9eb4Oa", "cah6qasTEsrkSIoL5nfwPcZe4cvMPweF", "8eD3p690du5bFEhlC6yHc6M0A1FYyZTF", "sj3suw5zEhU1fNKtejpxSkfArn2xg2JB"};
    public final SparseBooleanArray A00;

    public P3(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }

    public final int A00() {
        return this.A00.size();
    }

    public final int A01(int i10) {
        AbstractC1589es.A00(i10, 0, A00());
        return this.A00.keyAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P3) {
            P3 p32 = (P3) obj;
            if (AbstractC1672gE.A02 < 24) {
                if (A00() != p32.A00()) {
                    return false;
                }
                for (int i10 = 0; i10 < A00(); i10++) {
                    if (A01(i10) != p32.A01(i10)) {
                        return false;
                    }
                }
                return true;
            }
            return this.A00.equals(p32.A00);
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0029 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = com.facebook.ads.redexgen.X.AbstractC1672gE.A02
            r0 = 24
            if (r1 >= r0) goto L3c
            int r3 = r4.A00()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.P3.A01
            r0 = 4
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L36
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.P3.A01
            java.lang.String r1 = "hxMrUk5s"
            r0 = 2
            r2[r0] = r1
            r0 = 0
        L25:
            int r1 = r4.A00()
            if (r0 >= r1) goto L35
            int r3 = r3 * 31
            int r1 = r4.A01(r0)
            int r3 = r3 + r1
            int r0 = r0 + 1
            goto L25
        L35:
            return r3
        L36:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3c:
            android.util.SparseBooleanArray r0 = r4.A00
            int r0 = r0.hashCode()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.P3.hashCode():int");
    }
}
