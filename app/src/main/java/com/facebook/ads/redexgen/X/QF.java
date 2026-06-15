package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class QF extends AbstractC1475d1<QF> {
    public static String[] A0H = {"v6KJHFJIwSxW5VkVURyarc4QqwiwICsW", "YqHoiDUZ8NWGt5PpM2LITj1dVPNsfOlI", "MP9q3LvInq1PRsoa4HNF83BC92cUuK86", "wQbclW7ApNS8xw7MRINJmgEuNFXyyCJy", "UIre8iEn6A8UlrOJV8LrROKKwXNvo3Ma", "rBd8Gmbnjc9Nipv5s", "PBkO2vxtIwTyXPWlGSE2UajCtTy2WCFi", "Jw9rUAhmRQ3mXCn0vVji8P2gXy9pale6"};
    public final int A00;
    public final int A01;
    public final int A02;
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C05485v A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public QF(int i10, C1246Yc c1246Yc, int i11, C05485v c05485v, int i12, String str, int i13, boolean z10) {
        super(i10, c1246Yc, i11);
        int requiredAdaptiveSupport;
        int A00;
        int A07;
        this.A09 = c05485v;
        if (c05485v.A07) {
            requiredAdaptiveSupport = 24;
        } else {
            requiredAdaptiveSupport = 16;
        }
        this.A0A = c05485v.A06 && (i13 & requiredAdaptiveSupport) != 0;
        this.A0C = z10 && (super.A02.A0L == -1 || super.A02.A0L <= ((YN) c05485v).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((YN) c05485v).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((YN) c05485v).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((YN) c05485v).A03)));
        this.A0D = z10 && (super.A02.A0L == -1 || super.A02.A0L >= ((YN) c05485v).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((YN) c05485v).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((YN) c05485v).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((YN) c05485v).A07)));
        this.A0E = C05475u.A0S(i12, false);
        int bestLanguageIndex = 0;
        int i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i15 = 0;
        while (true) {
            if (i15 >= c05485v.A0L.size()) {
                break;
            }
            int A02 = C05475u.A02(super.A02, c05485v.A0L.get(i15), false);
            if (A02 > 0) {
                i14 = i15;
                bestLanguageIndex = A02;
                break;
            }
            i15++;
        }
        this.A03 = i14;
        this.A04 = bestLanguageIndex;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        A00 = C05475u.A00(super.A02.A0E, ((YN) c05485v).A0D);
        this.A06 = A00;
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = C05475u.A02(super.A02, str, C05475u.A0K(str) == null);
        int i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i17 = 0;
        while (true) {
            if (i17 < c05485v.A0M.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c05485v.A0M.get(i17))) {
                    i16 = i17;
                    break;
                }
                i17++;
            } else {
                break;
            }
        }
        this.A05 = i16;
        this.A0G = AbstractC1047Qb.A02(i12) == 128;
        this.A0F = AbstractC1047Qb.A04(i12) == 64;
        A07 = C05475u.A07(super.A02.A0W);
        this.A01 = A07;
        this.A08 = A00(i12, requiredAdaptiveSupport);
    }

    private int A00(int i10, int i11) {
        if ((super.A02.A0E & 16384) == 0 && C05475u.A0S(i10, this.A09.A0B)) {
            if (this.A0C || this.A09.A0C) {
                if (C05475u.A0S(i10, false) && this.A0D && this.A0C && super.A02.A05 != -1 && !this.A09.A0N && !this.A09.A0O && (i10 & i11) != 0) {
                    return 2;
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(QF qf, QF qf2) {
        AbstractC1967l7 A09 = AbstractC1967l7.A01().A09(qf.A0E, qf2.A0E).A08(Integer.valueOf(qf.A03), Integer.valueOf(qf2.A03), AbstractC2115nY.A03().A06()).A06(qf.A04, qf2.A04).A06(qf.A06, qf2.A06).A09(qf.A0B, qf2.A0B).A06(qf.A07, qf2.A07).A09(qf.A0C, qf2.A0C).A09(qf.A0D, qf2.A0D).A08(Integer.valueOf(qf.A05), Integer.valueOf(qf2.A05), AbstractC2115nY.A03().A06()).A09(qf.A0G, qf2.A0G).A09(qf.A0F, qf2.A0F);
        if (qf.A0G && qf.A0F) {
            int i10 = qf.A01;
            if (A0H[4].length() == 27) {
                throw new RuntimeException();
            }
            A0H[1] = "WnfleLMmT1GOcOsW0qDOxckWrr441Hrs";
            A09 = A09.A06(i10, qf2.A01);
        }
        return A09.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<java.lang.Integer> */
    public static int A02(QF qf, QF qf2) {
        AbstractC2115nY abstractC2115nY;
        AbstractC2115nY A06;
        AbstractC2115nY abstractC2115nY2;
        AbstractC2115nY abstractC2115nY3;
        if (!qf.A0C || !qf.A0E) {
            abstractC2115nY = C05475u.A09;
            A06 = abstractC2115nY.A06();
        } else {
            A06 = C05475u.A09;
        }
        AbstractC1967l7 A01 = AbstractC1967l7.A01();
        Integer valueOf = Integer.valueOf(qf.A00);
        Integer valueOf2 = Integer.valueOf(qf2.A00);
        if (qf.A09.A0O) {
            abstractC2115nY3 = C05475u.A09;
            abstractC2115nY2 = abstractC2115nY3.A06();
        } else {
            abstractC2115nY2 = C05475u.A0A;
        }
        AbstractC1967l7 A08 = A01.A08(valueOf, valueOf2, abstractC2115nY2);
        String[] strArr = A0H;
        if (strArr[3].charAt(13) != strArr[0].charAt(13)) {
            A0H[6] = "6nkXgJ47E0Y7x1U4DSFgJgJf9oyN7uwC";
            return A08.A08(Integer.valueOf(qf.A02), Integer.valueOf(qf2.A02), A06).A08(Integer.valueOf(qf.A00), Integer.valueOf(qf2.A00), A06).A05();
        }
        throw new RuntimeException();
    }

    public static int A05(List<QF> list, List<QF> list2) {
        return AbstractC1967l7.A01().A08((QF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.d2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = QF.A01((QF) obj, (QF) obj2);
                return A01;
            }
        }), (QF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.d2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = QF.A01((QF) obj, (QF) obj2);
                return A01;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.d2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A01;
                A01 = QF.A01((QF) obj, (QF) obj2);
                return A01;
            }
        }).A06(list.size(), list2.size()).A08((QF) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.d3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = QF.A02((QF) obj, (QF) obj2);
                return A02;
            }
        }), (QF) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.d3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = QF.A02((QF) obj, (QF) obj2);
                return A02;
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.d3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A02;
                A02 = QF.A02((QF) obj, (QF) obj2);
                return A02;
            }
        }).A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo> */
    public static OI<QF> A06(int i10, C1246Yc c1246Yc, C05485v c05485v, int[] iArr, String str, int maxPixelsToRetainForViewport) {
        int A03;
        A03 = C05475u.A03(c1246Yc, ((YN) c05485v).A0F, ((YN) c05485v).A0E, c05485v.A0Q);
        C4T A01 = OI.A01();
        for (int i11 = 0; i11 < c1246Yc.A01; i11++) {
            int A06 = c1246Yc.A08(i11).A06();
            A01.A04(new QF(i10, c1246Yc, i11, c05485v, iArr[i11], str, maxPixelsToRetainForViewport, A03 == Integer.MAX_VALUE || (A06 != -1 && A06 <= A03)));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1475d1
    /* renamed from: A07 */
    public final boolean A09(QF qf) {
        if (this.A0A || AbstractC1672gE.A1E(super.A02.A0W, ((AbstractC1475d1) qf).A02.A0W)) {
            if (!this.A09.A05) {
                boolean z10 = this.A0G;
                String[] strArr = A0H;
                if (strArr[7].charAt(2) != strArr[2].charAt(2)) {
                    throw new RuntimeException();
                }
                A0H[4] = "jVM2Qvf4diEch6VN99nFo";
                if (z10 != qf.A0G || this.A0F != qf.A0F) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1475d1
    public final int A08() {
        return this.A08;
    }
}
