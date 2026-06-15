package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import com.google.android.gms.common.api.Api;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.5u  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C05475u extends QB {
    public static byte[] A07;
    public static String[] A08 = {"LqCbrqKoogw4i3AokI7uysxMQ3EVQNeY", "cxpYrz", "yb1MlFRAgeb8dvVXgrQxSmTINcARtRK8", "CtUAao", "3kcgNrOCoR8dMQop68Il0eATRp", "2NIzo0pmq9", "lnTLj1nIBGHe6Pp48Pww51J4zPtRdqks", "Ql60CxMfJIyc4wcRspoWZ9exltfD1Wyk"};
    public static final AbstractC2115nY<Integer> A09;
    public static final AbstractC2115nY<Integer> A0A;
    public C1280Zm A00;
    public C05485v A01;
    public C1473cz A02;
    public final Context A03;
    public final InterfaceC1480d6 A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("D25277746")
    private <T extends AbstractC1475d1<T>> Pair<C1479d5, Integer> A0A(int i10, C1482d8 c1482d8, int[][][] iArr, InterfaceC1474d0<T> interfaceC1474d0, Comparator<List<T>> comparator) {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        int A02 = c1482d8.A02();
        int i11 = 0;
        loop0: while (i11 < A02) {
            if (i10 == c1482d8.A03(i11)) {
                C1063Qs A072 = c1482d8.A07(i11);
                for (int i12 = 0; i12 < A072.A01; i12++) {
                    C1246Yc A05 = A072.A05(i12);
                    List<T> A55 = interfaceC1474d0.A55(i11, A05, iArr[i11][i12]);
                    boolean[] zArr = new boolean[A05.A01];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i13 = 0; i13 < A05.A01; i13++) {
                        T t10 = A55.get(i13);
                        int A082 = t10.A08();
                        if (!zArr[i13] && A082 != 0) {
                            if (A082 == 1) {
                                arrayList = OI.A04(t10);
                                arrayList3.add(t10);
                                String[] strArr = A08;
                                if (strArr[7].charAt(4) == strArr[6].charAt(4)) {
                                    break loop0;
                                }
                                String[] strArr2 = A08;
                                strArr2[4] = "i67v2jm9nRiAqBavKyP9IpkRU6";
                                strArr2[5] = "aFISvYAoif";
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(t10);
                                for (int i14 = i13 + 1; i14 < A05.A01; i14++) {
                                    T t11 = A55.get(i14);
                                    if (t11.A08() == 2 && t10.A09(t11)) {
                                        arrayList.add(t11);
                                        zArr[i14] = true;
                                    }
                                }
                            }
                            arrayList4.add(arrayList);
                        }
                    }
                    if (this.A01.A0A && !arrayList3.isEmpty() && arrayList3.size() == A05.A01) {
                        arrayList4.clear();
                        arrayList4.add(arrayList3);
                    }
                    arrayList2.addAll(arrayList4);
                }
            }
            i11++;
            String[] strArr3 = A08;
            if (strArr3[7].charAt(4) == strArr3[6].charAt(4)) {
                throw new RuntimeException();
            }
            A08[0] = "FdGVIgFFkOgRgnAqOymurWih4o8qim2Z";
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((AbstractC1475d1) list.get(i15)).A01;
        }
        AbstractC1475d1 abstractC1475d1 = (AbstractC1475d1) list.get(0);
        return Pair.create(new C1479d5(abstractC1475d1.A03, iArr2), Integer.valueOf(abstractC1475d1.A00));
    }

    public static String A0J(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A07 = new byte[]{-103, -80, -28, -45, -40, -34, -113, -46, -41, -48, -35, -35, -44, -37, -113, -46, -34, -28, -35, -29, -113, -46, -34, -35, -30, -29, -31, -48, -40, -35, -29, -30, -113, -46, -48, -35, -35, -34, -29, -113, -47, -44, -113, -48, -33, -33, -37, -40, -44, -45, -113, -26, -40, -29, -41, -34, -28, -29, -113, -31, -44, -43, -44, -31, -44, -35, -46, -44, -113, -29, -34, -113, -78, -34, -35, -29, -44, -25, -29, -99, -113, -79, -28, -40, -37, -45, -113, -29, -41, -44, -113, -29, -31, -48, -46, -38, -113, -30, -44, -37, -44, -46, -29, -34, -31, -113, -40, -35, -30, -29, -48, -35, -46, -44, -113, -26, -40, -29, -41, -113, -34, -35, -44, -113, -34, -43, -113, -29, -41, -44, -113, -35, -34, -35, -100, -45, -44, -33, -31, -44, -46, -48, -29, -44, -45, -113, -46, -34, -35, -30, -29, -31, -28, -46, -29, -34, -31, -30, -113, -29, -41, -48, -29, -113, -29, -48, -38, -44, -113, -48, -113, -78, -34, -35, -29, -44, -25, -29, -113, -48, -31, -42, -28, -36, -44, -35, -29, -99, -4, 29, 30, 25, 45, 36, 44, 12, 42, 25, 27, 35, 11, 29, 36, 29, 27, 44, 39, 42, 8, 28, 11, 16, 22, -42, 8, 10, -38, 15, 35, 18, 23, 29, -35, 15, 17, -30, -23, -3, -20, -15, -9, -73, -19, -23, -21, -69, 36, 56, 39, 44, 50, -14, 40, 36, 38, -10, -16, 45, 50, 38, 41, 34, 24, 42, 29, 24, 25, 35, -29, 21, 42, -28, -27, 1, -12, -17, -16, -6, -70, -20, 1, -18, -13, -26, -31, -30, -20, -84, -31, -20, -23, -33, -10, -86, -13, -26, -16, -26, -20, -21, -29, -42, -47, -46, -36, -100, -43, -46, -29, -48, 30, 17, 12, 13, 23, -41, 32, -43, 30, 22, 12, -42, 23, 22, -38, -42, 30, 24, -31};
    }

    static {
        A0M();
        A09 = AbstractC2115nY.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.cq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C05475u.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC2115nY.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.cr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C05475u.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public C05475u() {
        this(C05485v.A0J, new QX());
    }

    @Deprecated
    public C05475u(YN yn, InterfaceC1480d6 interfaceC1480d6) {
        this(yn, interfaceC1480d6, null);
    }

    public C05475u(YN yn, InterfaceC1480d6 interfaceC1480d6, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = interfaceC1480d6;
        if (yn instanceof C05485v) {
            this.A01 = (C05485v) yn;
        } else {
            C05485v defaultParameters = context == null ? C05485v.A0J : C05485v.A02(context);
            this.A01 = defaultParameters.A0P().A0z(yn).A0u();
        }
        this.A00 = C1280Zm.A07;
        this.A06 = context != null && AbstractC1672gE.A18(context);
        if (!this.A06 && context != null && AbstractC1672gE.A02 >= 32) {
            this.A02 = C1473cz.A00(context);
        }
        if (this.A01.A08 && context == null) {
            AbstractC1633fb.A07(A0J(188, 20, 85), A0J(1, 187, 12));
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_CONSTRUCTOR"}, value = "Backward Compatible Constructor")
    public C05475u(InterfaceC1480d6 interfaceC1480d6) {
        this(C05485v.A0J, interfaceC1480d6);
    }

    public static int A00(int i10, int i11) {
        if (i10 != 0 && i10 == i11) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return Integer.bitCount(i10 & i11);
    }

    public static int A02(ZM zm, String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            boolean equals = str.equals(zm.A0V);
            if (A08[0].charAt(4) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[4] = "cACIJk9XtnNN8EmdsDI9RcJvFx";
            strArr[5] = "MXLaNkQDni";
            if (equals) {
                return 4;
            }
        }
        String A0K = A0K(str);
        String A0K2 = A0K(zm.A0V);
        if (A0K2 == null || A0K == null) {
            return (z10 && A0K2 == null) ? 1 : 0;
        } else if (A0K2.startsWith(A0K) || A0K.startsWith(A0K2)) {
            return 3;
        } else {
            String A0J = A0J(0, 1, 9);
            String str2 = AbstractC1672gE.A1P(A0K2, A0J)[0];
            String formatLanguage = AbstractC1672gE.A1P(A0K, A0J)[0];
            if (!str2.equals(formatLanguage)) {
                return 0;
            }
            return 2;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(com.facebook.ads.redexgen.X.C1246Yc r8, int r9, int r10, boolean r11) {
        /*
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r0) goto L7
            if (r10 != r0) goto L8
        L7:
            return r0
        L8:
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C05475u.A08
            r0 = 0
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 70
            if (r1 == r0) goto L5a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05475u.A08
            java.lang.String r1 = "a6yG4ogbJdpmjRTtpErm7dJcs9AkgJV4"
            r0 = 2
            r2[r0] = r1
            r0 = 0
        L21:
            int r1 = r8.A01
            if (r0 >= r1) goto L59
            com.facebook.ads.redexgen.X.ZM r7 = r8.A08(r0)
            int r1 = r7.A0L
            if (r1 <= 0) goto L56
            int r1 = r7.A0A
            if (r1 <= 0) goto L56
            int r2 = r7.A0L
            int r1 = r7.A0A
            android.graphics.Point r6 = A09(r11, r9, r10, r2, r1)
            int r5 = r7.A0L
            int r1 = r7.A0A
            int r5 = r5 * r1
            int r2 = r7.A0L
            int r1 = r6.x
            float r1 = (float) r1
            r3 = 1065017672(0x3f7ae148, float:0.98)
            float r1 = r1 * r3
            int r1 = (int) r1
            if (r2 < r1) goto L56
            int r2 = r7.A0A
            int r1 = r6.y
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = (int) r1
            if (r2 < r1) goto L56
            if (r5 >= r4) goto L56
            r4 = r5
        L56:
            int r0 = r0 + 1
            goto L21
        L59:
            return r4
        L5a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05475u.A03(com.facebook.ads.redexgen.X.Yc, int, int, boolean):int");
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            int intValue = num2.intValue();
            if (A08[2].charAt(13) != 'V') {
                String[] strArr = A08;
                strArr[7] = "9BoauBJAamPhbZfD5PQKIOVoPAVoFQLK";
                strArr[6] = "71lGvsq7LM2qoHaQgXlyvEPyZxsgeUCX";
                return intValue == -1 ? 0 : -1;
            }
            throw new RuntimeException();
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A07(String str) {
        char c10;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(A0J(272, 18, 26))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662735862:
                if (str.equals(A0J(253, 10, 81))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals(A0J(290, 10, 10))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals(A0J(263, 9, 40))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals(A0J(300, 19, 69))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @MetaExoPlayerCustomization("Made public in D13395849")
    public static Point A09(boolean z10, int tempViewportWidth, int i10, int i11, int i12) {
        if (z10) {
            String[] strArr = A08;
            if (strArr[7].charAt(4) == strArr[6].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "DT8M2fi89IXVa33ZEQKhbLKGxyMm1aFc";
            strArr2[6] = "KEDCP8jM4ZStajC7x5EL5SpfXtIbJpQU";
            if ((i11 > i12) != (tempViewportWidth > i10)) {
                tempViewportWidth = i10;
                i10 = tempViewportWidth;
            }
        }
        if (i11 * i10 >= i12 * tempViewportWidth) {
            return new Point(tempViewportWidth, AbstractC1672gE.A05(tempViewportWidth * i12, i11));
        }
        return new Point(AbstractC1672gE.A05(i10 * i11, i12), i10);
    }

    private final Pair<C1479d5, Integer> A0B(C1482d8 c1482d8, int[][][] iArr, final C05485v c05485v, final String str) throws EK {
        return A0A(3, c1482d8, iArr, new InterfaceC1474d0() { // from class: com.facebook.ads.redexgen.X.QO
            @Override // com.facebook.ads.redexgen.X.InterfaceC1474d0
            public final List A55(int i10, C1246Yc c1246Yc, int[] iArr2) {
                OI A02;
                A02 = QG.A02(i10, c1246Yc, C05485v.this, iArr2, str);
                return A02;
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.cu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QG.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C1479d5, Integer> A0C(C1482d8 c1482d8, int[][][] iArr, int[] iArr2, final C05485v c05485v) throws EK {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= c1482d8.A02()) {
                break;
            }
            if (2 == c1482d8.A03(i10)) {
                C1063Qs A072 = c1482d8.A07(i10);
                int i11 = A08[0].charAt(4);
                if (i11 == 70) {
                    throw new RuntimeException();
                }
                A08[2] = "Ji9lSHI5BRdJBJwuY79E2hBRxefYQ1Xw";
                if (A072.A01 > 0) {
                    z10 = true;
                    break;
                }
            }
            i10++;
        }
        return A0A(1, c1482d8, iArr, new InterfaceC1474d0() { // from class: com.facebook.ads.redexgen.X.QP
            @Override // com.facebook.ads.redexgen.X.InterfaceC1474d0
            public final List A55(int i12, C1246Yc c1246Yc, int[] iArr3) {
                return C05475u.this.A0e(c05485v, z10, i12, c1246Yc, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.ct
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QN.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C1479d5, Integer> A0D(C1482d8 c1482d8, int[][][] iArr, final int[] iArr2, final C05485v c05485v, final String str) throws EK {
        return A0A(2, c1482d8, iArr, new InterfaceC1474d0() { // from class: com.facebook.ads.redexgen.X.QU
            @Override // com.facebook.ads.redexgen.X.InterfaceC1474d0
            public final List A55(int i10, C1246Yc c1246Yc, int[] iArr3) {
                OI A06;
                A06 = QF.A06(i10, c1246Yc, C05485v.this, iArr3, str, iArr2[i10]);
                return A06;
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.cs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A05((List) obj, (List) obj2);
            }
        });
    }

    private final C1479d5 A0E(int i10, C1063Qs c1063Qs, int[][] iArr, C05485v c05485v) throws EK {
        C1246Yc c1246Yc = null;
        int i11 = 0;
        C1470cw c1470cw = null;
        for (int trackIndex = 0; trackIndex < c1063Qs.A01; trackIndex++) {
            C1246Yc trackGroup = c1063Qs.A05(trackIndex);
            int[] iArr2 = iArr[trackIndex];
            for (int groupIndex = 0; groupIndex < trackGroup.A01; groupIndex++) {
                int selectedTrackIndex = iArr2[groupIndex];
                if (A0S(selectedTrackIndex, c05485v.A0B)) {
                    C1470cw c1470cw2 = new C1470cw(trackGroup.A08(groupIndex), iArr2[groupIndex]);
                    if (c1470cw == null || c1470cw2.compareTo(c1470cw) > 0) {
                        c1246Yc = trackGroup;
                        i11 = groupIndex;
                        c1470cw = c1470cw2;
                    }
                }
            }
        }
        if (c1246Yc == null) {
            return null;
        }
        return new C1479d5(c1246Yc, i11);
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 3, 81))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z10;
        synchronized (this.A05) {
            z10 = this.A01.A08 && !this.A06 && AbstractC1672gE.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z10) {
            A01();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0N(com.facebook.ads.redexgen.X.C1063Qs r6, com.facebook.ads.redexgen.X.YN r7, java.util.Map<java.lang.Integer, com.facebook.ads.redexgen.X.YW> r8) {
        /*
            r4 = 0
        L1:
            int r0 = r6.A01
            if (r4 >= r0) goto L86
            com.facebook.ads.redexgen.X.Yc r1 = r6.A05(r4)
            com.facebook.ads.redexgen.X.lm<com.facebook.ads.redexgen.X.Yc, com.facebook.ads.redexgen.X.YW> r0 = r7.A0G
            java.lang.Object r3 = r0.get(r1)
            com.facebook.ads.redexgen.X.YW r3 = (com.facebook.ads.redexgen.X.YW) r3
            if (r3 != 0) goto L16
        L13:
            int r4 = r4 + 1
            goto L1
        L16:
            int r0 = r3.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r8.get(r0)
            com.facebook.ads.redexgen.X.YW r0 = (com.facebook.ads.redexgen.X.YW) r0
            if (r0 == 0) goto L4f
            com.facebook.ads.redexgen.X.OI<java.lang.Integer> r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            com.facebook.ads.redexgen.X.OI<java.lang.Integer> r0 = r3.A01
            boolean r5 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05475u.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L80
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05475u.A08
            java.lang.String r1 = "6DZxblripWrmJUjQw4n6mkRMGsh5iKOd"
            r0 = 2
            r2[r0] = r1
            if (r5 != 0) goto L13
        L4f:
            int r5 = r3.A01()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05475u.A08
            r0 = 7
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C05475u.A08
            java.lang.String r1 = "ySdGkUfuHk5jcZM4NruCqvalemA2UQEM"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "wVMYBaidRq4djSlWUtUc0Encd7j3K960"
            r0 = 6
            r2[r0] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8.put(r0, r3)
            goto L13
        L7a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L80:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05475u.A0N(com.facebook.ads.redexgen.X.Qs, com.facebook.ads.redexgen.X.YN, java.util.Map):void");
    }

    public static void A0P(C1482d8 c1482d8, YN yn, C1479d5[] c1479d5Arr) {
        C1479d5 c1479d5;
        int A02 = c1482d8.A02();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < A02; i10++) {
            A0N(c1482d8.A07(i10), yn, hashMap);
            String[] strArr = A08;
            String str = strArr[1];
            String str2 = strArr[3];
            int length = str.length();
            int rendererCount = str2.length();
            if (length != rendererCount) {
                throw new RuntimeException();
            }
            A08[2] = "Leiid58a93QHovECy288fljWPyzFzBDB";
        }
        A0N(c1482d8.A06(), yn, hashMap);
        for (int i11 = 0; i11 < A02; i11++) {
            int rendererCount2 = c1482d8.A03(i11);
            YW yw = (YW) hashMap.get(Integer.valueOf(rendererCount2));
            if (yw != null) {
                if (!yw.A01.isEmpty() && c1482d8.A07(i11).A04(yw.A00) != -1) {
                    c1479d5 = new C1479d5(yw.A00, AbstractC0985Nn.A0C(yw.A01));
                } else {
                    c1479d5 = null;
                }
                c1479d5Arr[i11] = c1479d5;
            }
        }
    }

    public static void A0Q(C1482d8 c1482d8, C05485v c05485v, C1479d5[] c1479d5Arr) {
        C1479d5 c1479d5;
        int A02 = c1482d8.A02();
        for (int i10 = 0; i10 < A02; i10++) {
            C1063Qs trackGroups = c1482d8.A07(i10);
            if (c05485v.A0S(i10, trackGroups)) {
                QH A0Q = c05485v.A0Q(i10, trackGroups);
                if (A0Q != null) {
                    int rendererCount = A0Q.A03.length;
                    if (rendererCount != 0) {
                        int rendererCount2 = A0Q.A00;
                        C1246Yc A05 = trackGroups.A05(rendererCount2);
                        int[] iArr = A0Q.A03;
                        int rendererIndex = A0Q.A02;
                        c1479d5 = new C1479d5(A05, iArr, rendererIndex);
                        c1479d5Arr[i10] = c1479d5;
                    }
                }
                c1479d5 = null;
                c1479d5Arr[i10] = c1479d5;
            }
        }
    }

    public static void A0R(C1482d8 c1482d8, int[][][] iArr, C1057Ql[] c1057QlArr, QD[] qdArr) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 1;
        int i13 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = c1482d8.A02();
            if (i13 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i14 = c1482d8.A03(i13);
            QD qd = qdArr[i13];
            if ((i14 == 1 || i14 == 2) && qd != null && A0W(iArr[i13], c1482d8.A07(i13), qd)) {
                if (i14 == 1) {
                    if (i10 != -1) {
                        i12 = 0;
                        break;
                    }
                    i10 = i13;
                } else if (i11 != -1) {
                    i12 = 0;
                    break;
                } else {
                    i11 = i13;
                }
            }
            i13++;
        }
        int tunnelingAudioRendererIndex2 = (i10 == -1 || i11 == -1) ? 0 : 1;
        if ((i12 & tunnelingAudioRendererIndex2) != 0) {
            C1057Ql c1057Ql = new C1057Ql(true);
            c1057QlArr[i10] = c1057Ql;
            c1057QlArr[i11] = c1057Ql;
        }
    }

    @MetaExoPlayerCustomization("Made public for customization on DashManifestHelper")
    public static boolean A0S(int i10, boolean z10) {
        int A03 = AbstractC1047Qb.A03(i10);
        return A03 == 4 || (z10 && A03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(ZM zm) {
        boolean z10;
        synchronized (this.A05) {
            z10 = !this.A01.A08 || this.A06 || zm.A06 <= 2 || (A0U(zm) && (AbstractC1672gE.A02 < 32 || this.A02 == null || !this.A02.A06())) || (AbstractC1672gE.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, zm));
        }
        return z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean A0U(ZM zm) {
        char c10;
        if (zm.A0W == null) {
            return false;
        }
        String str = zm.A0W;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A0J(236, 14, 96))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals(A0J(208, 9, 68))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (str.equals(A0J(217, 9, 75))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str.equals(A0J(226, 10, 37))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0W(int[][] iArr, C1063Qs c1063Qs, QD qd) {
        if (qd == null) {
            return false;
        }
        int A04 = c1063Qs.A04(qd.A9B());
        int trackFormatSupport = 0;
        while (true) {
            int length = qd.length();
            String[] strArr = A08;
            String str = strArr[7];
            String str2 = strArr[6];
            int trackGroupIndex = str.charAt(4);
            if (trackGroupIndex == str2.charAt(4)) {
                throw new RuntimeException();
            }
            A08[0] = "PrRxgmXVIQxuXSwc3dkPcYbwBOSIGAwY";
            if (trackFormatSupport < length) {
                int trackGroupIndex2 = AbstractC1047Qb.A05(iArr[A04][qd.A87(trackFormatSupport)]);
                if (trackGroupIndex2 != 32) {
                    return false;
                }
                trackFormatSupport++;
            } else {
                return true;
            }
        }
    }

    private final C1479d5[] A0X(C1482d8 c1482d8, int[][][] iArr, int[] iArr2, C05485v c05485v) throws EK {
        String str;
        int A02 = c1482d8.A02();
        C1479d5[] c1479d5Arr = new C1479d5[A02];
        Pair<C1479d5, Integer> A0C = A0C(c1482d8, iArr, iArr2, c05485v);
        if (A0C != null) {
            c1479d5Arr[((Integer) A0C.second).intValue()] = (C1479d5) A0C.first;
        }
        if (A0C == null) {
            str = null;
        } else {
            C1246Yc c1246Yc = ((C1479d5) A0C.first).A01;
            int rendererCount = ((C1479d5) A0C.first).A02[0];
            str = c1246Yc.A08(rendererCount).A0V;
        }
        Pair<C1479d5, Integer> A0D = A0D(c1482d8, iArr, iArr2, c05485v, str);
        if (A0D != null) {
            c1479d5Arr[((Integer) A0D.second).intValue()] = (C1479d5) A0D.first;
        }
        Pair<C1479d5, Integer> A0B = A0B(c1482d8, iArr, c05485v, str);
        if (A0B != null) {
            c1479d5Arr[((Integer) A0B.second).intValue()] = (C1479d5) A0B.first;
        }
        for (int i10 = 0; i10 < A02; i10++) {
            int A03 = c1482d8.A03(i10);
            if (A03 != 2 && A03 != 1 && A03 != 3) {
                c1479d5Arr[i10] = A0E(A03, c1482d8.A07(i10), iArr[i10], c05485v);
            }
        }
        return c1479d5Arr;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1490dG
    public final boolean A0Y() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.QB
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "final removed in D35162315")
    public final Pair<C1057Ql[], QD[]> A0d(C1482d8 c1482d8, int[][][] iArr, int[] iArr2, R5 r52, Timeline timeline) throws EK {
        C05485v c05485v;
        synchronized (this.A05) {
            try {
                c05485v = this.A01;
                if (c05485v.A08 && AbstractC1672gE.A02 >= 32 && this.A02 != null) {
                    this.A02.A03(this, (Looper) AbstractC1589es.A02(Looper.myLooper()));
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            }
        }
        int A02 = c1482d8.A02();
        C1479d5[] A0X = A0X(c1482d8, iArr, iArr2, c05485v);
        A0P(c1482d8, c05485v, A0X);
        A0Q(c1482d8, c05485v, A0X);
        for (int rendererCount = 0; rendererCount < A02; rendererCount++) {
            int A03 = c1482d8.A03(rendererCount);
            if (c05485v.A0R(rendererCount) || c05485v.A0H.contains(Integer.valueOf(A03))) {
                A0X[rendererCount] = null;
            }
        }
        QD[] A5R = this.A04.A5R(A0X, A00(), r52, timeline);
        C1057Ql[] c1057QlArr = new C1057Ql[A02];
        for (int i10 = 0; i10 < A02; i10++) {
            c1057QlArr[i10] = !(c05485v.A0R(i10) || c05485v.A0H.contains(Integer.valueOf(c1482d8.A03(i10)))) && (c1482d8.A03(i10) == -2 || A5R[i10] != null) ? C1057Ql.A01 : null;
        }
        if (c05485v.A0D) {
            A0R(c1482d8, iArr, c1057QlArr, A5R);
        }
        return Pair.create(c1057QlArr, A5R);
    }

    public final /* synthetic */ OI A0e(C05485v c05485v, boolean z10, int i10, C1246Yc c1246Yc, int[] iArr) {
        return QN.A03(i10, c1246Yc, c05485v, iArr, z10, new InterfaceC1791iE() { // from class: com.facebook.ads.redexgen.X.QW
            @Override // com.facebook.ads.redexgen.X.InterfaceC1791iE
            public final boolean A42(Object obj) {
                boolean A0T;
                A0T = C05475u.this.A0T((ZM) obj);
                return A0T;
            }
        });
    }
}
