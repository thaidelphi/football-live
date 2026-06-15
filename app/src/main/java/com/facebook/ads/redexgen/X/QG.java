package com.facebook.ads.redexgen.X;

import com.google.android.gms.common.api.Api;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class QG extends AbstractC1475d1<QG> implements Comparable<QG> {
    public static String[] A09 = {"oqngY", "qMEFLQnO0Q8REuu02rd1rF5q2V4d4OQA", "z6RfqXu7lNsIR9Wafks52Ys6qdiWwLfM", "JoaONmxYGX01kLvx0aLrRWmeQi7T1Jw5", "2dQ11Kp8eWyx9xXzUEbW2", "anhUGieJSAV3cH3WtE2DMzo", "glHOpQ4ugmKXesfyj90OHOt", "qWOiwF8Y0gw"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<QG> list, List<QG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public QG(int i10, C1246Yc c1246Yc, int i11, C05485v c05485v, int i12, String str) {
        super(i10, c1246Yc, i11);
        List<String> list;
        int A00;
        int i13 = 0;
        this.A08 = C05475u.A0S(i12, false);
        int i14 = super.A02.A0H & (~((YN) c05485v).A00);
        this.A06 = (i14 & 1) != 0;
        this.A07 = (i14 & 2) != 0;
        int i15 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int bestLanguageScore = 0;
        if (c05485v.A0K.isEmpty()) {
            list = C0958Mm.A03("");
        } else {
            list = c05485v.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C05475u.A02(super.A02, list.get(bestLanguageIndex), c05485v.A0P);
            if (A02 > 0) {
                i15 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i15;
        this.A01 = bestLanguageScore;
        A00 = C05475u.A00(super.A02.A0E, ((YN) c05485v).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C05475u.A02(super.A02, str, C05475u.A0K(str) == null);
        boolean z10 = this.A01 > 0 || (c05485v.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C05475u.A0S(i12, c05485v.A0B) && z10) {
            i13 = 1;
        }
        this.A04 = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(QG qg) {
        AbstractC1967l7 A06 = AbstractC1967l7.A01().A09(this.A08, qg.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(qg.A00), AbstractC2115nY.A03().A06()).A06(this.A01, qg.A01).A06(this.A02, qg.A02).A09(this.A06, qg.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(qg.A07), this.A01 == 0 ? AbstractC2115nY.A03() : AbstractC2115nY.A03().A06()).A06(this.A03, qg.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, qg.A05);
        }
        int A05 = A06.A05();
        String[] strArr = A09;
        if (strArr[1].charAt(30) != strArr[2].charAt(30)) {
            String[] strArr2 = A09;
            strArr2[1] = "SY8E7kgrm9e0g6qoJVPzg9XsttDzkb0f";
            strArr2[2] = "8zxpMcslFpolnzCvDOLMWnvDxrTTFQxe";
            return A05;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static OI<QG> A02(int i10, C1246Yc c1246Yc, C05485v c05485v, int[] iArr, String str) {
        C4T A01 = OI.A01();
        for (int i11 = 0; i11 < c1246Yc.A01; i11++) {
            A01.A04(new QG(i10, c1246Yc, i11, c05485v, iArr[i11], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1475d1
    /* renamed from: A03 */
    public final boolean A09(QG qg) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1475d1
    public final int A08() {
        return this.A04;
    }
}
