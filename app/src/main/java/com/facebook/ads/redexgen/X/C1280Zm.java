package com.facebook.ads.redexgen.X;

import android.os.Bundle;
/* renamed from: com.facebook.ads.redexgen.X.Zm  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1280Zm implements InterfaceC0973Nb {
    public NM A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public static String[] A06 = {"4RCZWuhO7OeWa7CNbgfPGwqrPXyQDTq9", "9VQnWHnLQUhJZv23f3", "RQeSOjz6UX", "uCH7Z0gINn9LT5Xd3nbgfB1sVL91p9Fx", "buRqoNnwLPmOLIdH", "cB6qD0tLwk3anyn8RWGpMGrrRUWqBOgq", "bjnvuzeY", "ihwg9d6F4nw4f9S31ZCM8cc59ZVjQ7b5"};
    public static final C1280Zm A07 = new NN().A05();
    public static final String A0A = AbstractC1672gE.A0h(0);
    public static final String A0B = AbstractC1672gE.A0h(1);
    public static final String A0D = AbstractC1672gE.A0h(2);
    public static final String A09 = AbstractC1672gE.A0h(3);
    public static final String A0C = AbstractC1672gE.A0h(4);
    public static final InterfaceC0972Na<C1280Zm> A08 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Zp
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            return C1280Zm.A00(bundle);
        }
    };

    public C1280Zm(int i10, int i11, int i12, int i13, int i14) {
        this.A02 = i10;
        this.A03 = i11;
        this.A05 = i12;
        this.A01 = i13;
        this.A04 = i14;
    }

    public static /* synthetic */ C1280Zm A00(Bundle bundle) {
        NN nn = new NN();
        if (bundle.containsKey(A0A)) {
            String str = A0A;
            if (A06[4].length() != 4) {
                A06[4] = "L3Z6nZQhTC4TxOQxR";
                nn.A01(bundle.getInt(str));
            }
            throw new RuntimeException();
        }
        if (bundle.containsKey(A0B)) {
            nn.A02(bundle.getInt(A0B));
        }
        if (bundle.containsKey(A0D)) {
            nn.A04(bundle.getInt(A0D));
        }
        if (bundle.containsKey(A09)) {
            int i10 = bundle.getInt(A09);
            if (A06[6].length() == 8) {
                A06[0] = "1dhS0N4NxiXwo6AxbaOOUoyFrFFLDsqy";
                nn.A00(i10);
            }
            throw new RuntimeException();
        }
        if (bundle.containsKey(A0C)) {
            nn.A03(bundle.getInt(A0C));
        }
        return nn.A05();
    }

    public final NM A01() {
        if (this.A00 == null) {
            this.A00 = new NM(this);
        }
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r3 == r7.A03) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r6.A05 != r7.A05) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        r4 = r6.A01;
        r3 = r7.A01;
        r2 = com.facebook.ads.redexgen.X.C1280Zm.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r2[2].length() == r2[1].length()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        com.facebook.ads.redexgen.X.C1280Zm.A06[4] = "Md";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r4 != r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r6.A04 != r7.A04) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        if (r3 == r7.A03) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 != r7) goto L4
            return r5
        L4:
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1280Zm.A06
            r0 = 0
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L1a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1280Zm.A06
            java.lang.String r1 = "4jdoehrgKVNPR2KDsgvS21Zz6"
            r0 = 4
            r2[r0] = r1
            if (r7 == 0) goto L2d
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r0 = r7.getClass()
            if (r1 == r0) goto L2e
        L2d:
            return r3
        L2e:
            com.facebook.ads.redexgen.X.Zm r7 = (com.facebook.ads.redexgen.X.C1280Zm) r7
            int r1 = r6.A02
            int r0 = r7.A02
            if (r1 != r0) goto L88
            int r3 = r6.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1280Zm.A06
            r0 = 0
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L77
            int r0 = r7.A03
            if (r3 != r0) goto L88
        L4b:
            int r1 = r6.A05
            int r0 = r7.A05
            if (r1 != r0) goto L88
            int r4 = r6.A01
            int r3 = r7.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1280Zm.A06
            r0 = 2
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L8a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1280Zm.A06
            java.lang.String r1 = "Md"
            r0 = 4
            r2[r0] = r1
            if (r4 != r3) goto L88
            int r1 = r6.A04
            int r0 = r7.A04
            if (r1 != r0) goto L88
        L76:
            return r5
        L77:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1280Zm.A06
            java.lang.String r1 = "k1XchWimtW"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "9lXhW6xAnyDb6kil5L"
            r0 = 1
            r2[r0] = r1
            int r0 = r7.A03
            if (r3 != r0) goto L88
            goto L4b
        L88:
            r5 = 0
            goto L76
        L8a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1280Zm.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = this.A05;
        int result3 = this.A04;
        return (((((((((17 * 31) + result) * 31) + this.A03) * 31) + result2) * 31) + this.A01) * 31) + result3;
    }
}
