package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Qs  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1063Qs implements InterfaceC0973Nb {
    public static byte[] A03;
    public static String[] A04 = {"L9um34xlRa9mvVYBTWzS", "rK95Ijm", "EQF49yv5pvsSo0ik", "xrSVDtvcpmqA", "bvDffTtUPWHKboBJ92HWJYx0EVSkllwH", "ktf3DTCeYabiBEqmGIqH", "aoIefHJ2PsCNPYphTIQQSD86nk1U0LOE", "ljetUHKC5nTD7EudM4NvK"};
    public static final InterfaceC0972Na<C1063Qs> A05;
    public static final C1063Qs A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final OI<C1246Yc> A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-45, -5, -14, -6, -17, -10, -14, -21, -90, -17, -22, -21, -12, -6, -17, -23, -25, -14, -90, -38, -8, -25, -23, -15, -51, -8, -11, -5, -10, -7, -90, -25, -22, -22, -21, -22, -90, -6, -11, -90, -11, -12, -21, -90, -38, -8, -25, -23, -15, -51, -8, -11, -5, -10, -57, -8, -8, -25, -1, -76, -49, -19, -36, -34, -26, -62, -19, -22, -16, -21, -68, -19, -19, -36, -12};
    }

    static {
        A03();
        A06 = new C1063Qs(new C1246Yc[0]);
        A07 = AbstractC1672gE.A0h(0);
        A05 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Qt
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                return C1063Qs.A00(bundle);
            }
        };
    }

    public C1063Qs(C1246Yc... c1246YcArr) {
        this.A02 = OI.A07(c1246YcArr);
        this.A01 = c1246YcArr.length;
        A02();
    }

    public static /* synthetic */ C1063Qs A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C1063Qs(new C1246Yc[0]);
        }
        return new C1063Qs((C1246Yc[]) C1595ey.A01(C1246Yc.A07, parcelableArrayList).toArray(new C1246Yc[0]));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r7 = this;
            r6 = 0
        L1:
            com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.Yc> r0 = r7.A02
            int r0 = r0.size()
            if (r6 >= r0) goto L70
            int r5 = r6 + 1
        Lb:
            com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.Yc> r0 = r7.A02
            int r0 = r0.size()
            if (r5 >= r0) goto L6d
            com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.Yc> r0 = r7.A02
            java.lang.Object r4 = r0.get(r6)
            com.facebook.ads.redexgen.X.Yc r4 = (com.facebook.ads.redexgen.X.C1246Yc) r4
            com.facebook.ads.redexgen.X.OI<com.facebook.ads.redexgen.X.Yc> r0 = r7.A02
            java.lang.Object r3 = r0.get(r5)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1063Qs.A04
            r0 = 4
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L3a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1063Qs.A04
            java.lang.String r1 = "WnevRkLW3jj27czqc70RUkasUo3krR"
            r0 = 2
            r2[r0] = r1
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L6a
            r2 = 0
            r1 = 60
            r0 = 69
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r0)
            r2 = 60
            r1 = 15
            r0 = 58
            java.lang.String r3 = A01(r2, r1, r0)
            r2 = 0
            r1 = 0
            r0 = 60
            java.lang.String r0 = A01(r2, r1, r0)
            com.facebook.ads.redexgen.X.AbstractC1633fb.A08(r3, r0, r4)
        L6a:
            int r5 = r5 + 1
            goto Lb
        L6d:
            int r6 = r6 + 1
            goto L1
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1063Qs.A02():void");
    }

    public final int A04(C1246Yc c1246Yc) {
        int index = this.A02.indexOf(c1246Yc);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C1246Yc A05(int i10) {
        return this.A02.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A04;
        if (strArr[5].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[2] = "rxfaVCRNs0Pz6VF6Nycvm";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1063Qs c1063Qs = (C1063Qs) obj;
        return this.A01 == c1063Qs.A01 && this.A02.equals(c1063Qs.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        return this.A00;
    }
}
