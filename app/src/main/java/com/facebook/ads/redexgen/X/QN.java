package com.facebook.ads.redexgen.X;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class QN extends AbstractC1475d1<QN> implements Comparable<QN> {
    public static String[] A0I = {"oAw7EOk8LxirhsuMH4obyEeoWZy5IFRn", "vcyRganIlaiMVhNuds7mGdI90mZVu3NA", "5YZeVHK79K0wQm9Vf", "asZs0y1pCjnB3FyLQ1", "OxHrpq7nJKQohiaCdR", "sbhzoPka74", "9rlCTY1eQKrv2gum0kQuDOznhW4nV4", "WhbW8DWUolPaZGRRoAmIfShF"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C05485v A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public QN(int i10, C1246Yc c1246Yc, int i11, C05485v c05485v, int i12, boolean z10, InterfaceC1791iE<ZM> interfaceC1791iE) {
        super(i10, c1246Yc, i11);
        int A00;
        this.A0A = c05485v;
        this.A0B = C05475u.A0K(super.A02.A0V);
        this.A0F = C05475u.A0S(i12, false);
        int i13 = 0;
        int i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i15 = 0;
        while (true) {
            if (i15 >= c05485v.A0I.size()) {
                break;
            }
            int A02 = C05475u.A02(super.A02, c05485v.A0I.get(i15), false);
            if (A02 > 0) {
                i14 = i15;
                i13 = A02;
                break;
            }
            i15++;
        }
        this.A04 = i14;
        this.A05 = i13;
        A00 = C05475u.A00(super.A02.A0E, ((YN) c05485v).A0B);
        this.A07 = A00;
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((YN) c05485v).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((YN) c05485v).A02) && interfaceC1791iE.A42(super.A02);
        String[] A1L = AbstractC1672gE.A1L();
        int i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i18 >= A1L.length) {
                break;
            }
            int A022 = C05475u.A02(super.A02, A1L[i18], false);
            if (A022 > 0) {
                i16 = i18;
                i17 = A022;
                break;
            }
            i18++;
        }
        this.A02 = i16;
        this.A03 = i17;
        int i19 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i20 = 0;
        while (true) {
            if (i20 < c05485v.A0J.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c05485v.A0J.get(i20))) {
                    i19 = i20;
                    break;
                }
                i20++;
            } else {
                break;
            }
        }
        this.A06 = i19;
        this.A0H = AbstractC1047Qb.A02(i12) == 128;
        this.A0G = AbstractC1047Qb.A04(i12) == 64;
        this.A09 = A00(i12, z10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<QN> list, List<QN> list2) {
        return ((QN) Collections.max(list)).compareTo((QN) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static OI<QN> A03(int i10, C1246Yc c1246Yc, C05485v c05485v, int[] iArr, boolean z10, InterfaceC1791iE<ZM> interfaceC1791iE) {
        C4T A01 = OI.A01();
        for (int i11 = 0; i11 < c1246Yc.A01; i11++) {
            A01.A04(new QN(i10, c1246Yc, i11, c05485v, iArr[i11], z10, interfaceC1791iE));
        }
        return A01.A05();
    }

    private int A00(int i10, boolean z10) {
        if (C05475u.A0S(i10, this.A0A.A0B)) {
            if (!this.A0E) {
                C05485v c05485v = this.A0A;
                if (A0I[7].length() == 1) {
                    throw new RuntimeException();
                }
                A0I[7] = "L8ddb";
                if (!c05485v.A09) {
                    return 0;
                }
            }
            if (C05475u.A0S(i10, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z10)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* renamed from: A01 */
    public final int compareTo(QN qn) {
        AbstractC2115nY abstractC2115nY;
        AbstractC2115nY A06;
        AbstractC2115nY abstractC2115nY2;
        AbstractC2115nY abstractC2115nY3;
        if (!this.A0E || !this.A0F) {
            abstractC2115nY = C05475u.A09;
            A06 = abstractC2115nY.A06();
        } else {
            A06 = C05475u.A09;
        }
        AbstractC1967l7 A08 = AbstractC1967l7.A01().A09(this.A0F, qn.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(qn.A04), AbstractC2115nY.A03().A06()).A06(this.A05, qn.A05).A06(this.A07, qn.A07).A09(this.A0D, qn.A0D).A09(this.A0C, qn.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(qn.A02), AbstractC2115nY.A03().A06()).A06(this.A03, qn.A03).A09(this.A0E, qn.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(qn.A06), AbstractC2115nY.A03().A06());
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(qn.A00);
        if (this.A0A.A0O) {
            abstractC2115nY3 = C05475u.A09;
            abstractC2115nY2 = abstractC2115nY3.A06();
        } else {
            abstractC2115nY2 = C05475u.A0A;
        }
        AbstractC1967l7 A082 = A08.A08(valueOf, valueOf2, abstractC2115nY2).A09(this.A0H, qn.A0H).A09(this.A0G, qn.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(qn.A01), A06).A08(Integer.valueOf(this.A08), Integer.valueOf(qn.A08), A06);
        Integer valueOf3 = Integer.valueOf(this.A00);
        Integer valueOf4 = Integer.valueOf(qn.A00);
        if (!AbstractC1672gE.A1E(this.A0B, qn.A0B)) {
            A06 = C05475u.A0A;
        }
        return A082.A08(valueOf3, valueOf4, A06).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r5.A02.A0G == ((com.facebook.ads.redexgen.X.AbstractC1475d1) r6).A02.A0G) goto L25;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1475d1
    /* renamed from: A04 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(com.facebook.ads.redexgen.X.QN r6) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.5v r0 = r5.A0A
            boolean r0 = r0.A00
            r4 = -1
            if (r0 != 0) goto L17
            com.facebook.ads.redexgen.X.ZM r0 = r5.A02
            int r0 = r0.A06
            if (r0 == r4) goto L86
            com.facebook.ads.redexgen.X.ZM r0 = r5.A02
            int r1 = r0.A06
            com.facebook.ads.redexgen.X.ZM r0 = r6.A02
            int r0 = r0.A06
            if (r1 != r0) goto L86
        L17:
            com.facebook.ads.redexgen.X.5v r0 = r5.A0A
            boolean r0 = r0.A02
            if (r0 != 0) goto L31
            com.facebook.ads.redexgen.X.ZM r0 = r5.A02
            java.lang.String r0 = r0.A0W
            if (r0 == 0) goto L86
            com.facebook.ads.redexgen.X.ZM r0 = r5.A02
            java.lang.String r1 = r0.A0W
            com.facebook.ads.redexgen.X.ZM r0 = r6.A02
            java.lang.String r0 = r0.A0W
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L86
        L31:
            com.facebook.ads.redexgen.X.5v r0 = r5.A0A
            boolean r0 = r0.A03
            if (r0 != 0) goto L5a
            com.facebook.ads.redexgen.X.ZM r0 = r5.A02
            int r3 = r0.A0G
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.QN.A0I
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.QN.A0I
            java.lang.String r1 = "mRXMNxFunMjm1MynMm1HvBx6RXkDa"
            r0 = 6
            r2[r0] = r1
            if (r3 == r4) goto L86
            com.facebook.ads.redexgen.X.ZM r0 = r5.A02
            int r1 = r0.A0G
            com.facebook.ads.redexgen.X.ZM r0 = r6.A02
            int r0 = r0.A0G
            if (r1 != r0) goto L86
        L5a:
            com.facebook.ads.redexgen.X.5v r0 = r5.A0A
            boolean r0 = r0.A01
            if (r0 != 0) goto L84
            boolean r1 = r5.A0H
            boolean r0 = r6.A0H
            if (r1 != r0) goto L86
            boolean r3 = r5.A0G
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.QN.A0I
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.QN.A0I
            java.lang.String r1 = "56qH6gxk7yd0c8ZnXu"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "AAQMuhNNXcozHmi4np"
            r0 = 4
            r2[r0] = r1
            boolean r0 = r6.A0G
            if (r3 != r0) goto L86
        L84:
            r0 = 1
        L85:
            return r0
        L86:
            r0 = 0
            goto L85
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.QN.A09(com.facebook.ads.redexgen.X.QN):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1475d1
    public final int A08() {
        return this.A09;
    }
}
