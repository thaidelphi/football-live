package com.facebook.ads.redexgen.X;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.facebook.ads.redexgen.X.16  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass16 extends C9H {
    public static byte[] A05;
    public static String[] A06 = {"w4KX5wki0eOcHNxb6DLYHja1O4zAsp3C", "G8sK4wpUm6gDs4fpfHcn", "RmT0gVvbjZ0sIHv5unzCwSebE3y", "VnpIDpEwsBj2tcdExDnl", "qIoKZcn9m5PV3cAbAA39zUUmv0A0cSWb", "rMXFM4nDHDbbcscKiDSXlkr0QP", "ILXkhLfoXouD33ttJCp", "Crw9C7vA3esUT1Svowt"};
    public static final Pattern A07;
    public float A00;
    public float A01;
    public Map<String, XO> A02;
    public final XJ A03;
    public final boolean A04;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {21, 37, 50, 55, 37, 81, 105, 38, 36, 55, 36, 50, 37, 81, 105, 38, 36, 55, 37, 81, 105, 38, 36, 86, 55, 35, 80, 37, 81, 105, 38, 36, 22, 83, 44, 1, 9, 4, 7, 15, 29, 13, 82, 34, 11, 22, 9, 5, 16, 94, 3, 59, 57, 32, 32, 57, 62, 55, 112, 119, 3, 36, 41, 60, 53, 106, 119, 112, 60, 57, 62, 53, 112, 50, 53, 54, 63, 34, 53, 112, 119, 22, 63, 34, 61, 49, 36, 106, 119, 112, 60, 57, 62, 53, 106, 112, 17, 41, 43, 50, 50, 43, 44, 37, 98, 38, 43, 35, 46, 45, 37, 55, 39, 98, 46, 43, 44, 39, 98, 32, 39, 36, 45, 48, 39, 98, 33, 45, 47, 50, 46, 39, 54, 39, 98, 36, 45, 48, 47, 35, 54, 120, 98, 7, 63, 61, 36, 36, 61, 58, 51, 116, 48, 61, 53, 56, 59, 51, 33, 49, 116, 56, 61, 58, 49, 116, 35, 61, 32, 60, 116, 50, 49, 35, 49, 38, 116, 55, 59, 56, 33, 57, 58, 39, 116, 32, 60, 53, 58, 116, 50, 59, 38, 57, 53, 32, 110, 116, 37, 29, 31, 6, 6, 31, 24, 17, 86, 31, 24, 0, 23, 26, 31, 18, 86, 2, 31, 27, 31, 24, 17, 76, 86, 62, 30, 12, 41, 8, 14, 2, 9, 8, 31, Byte.MAX_VALUE, 88, 85, 64, 73, 22, 19, 40, 45, 40, 41, 49, 40, 102, 39, 42, 47, 33, 40, 43, 35, 40, 50, 124, 102, 95, 65, 114, 97, 106, 112, 119, 89, 100, 108, 92, 77, 86, 79, 75, 31, 118, 81, 89, 80, 98, 43, 38, 68, 80, 35, 4, 9, 28, 21, 3, 45, 75, 70, 36, 48, 67, 100, 105, 124, 117, 99, 77, 48, 113, 98, 117, 48, 126, Byte.MAX_VALUE, 100, 48, 99, 101, 96, 96, Byte.MAX_VALUE, 98, 100, 117, 116, 80, 93, 63, 32, 43, 88, Byte.MAX_VALUE, 114, 103, 110, 120, 86, 83, 65, 43, 31, 1, 51, 18, 14, 3, 27, 16, 7, 17, 26, 13, 17, 28, 4, 15, 24, 14, 4, -31, -125};
        String[] strArr = A06;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A06[5] = "PiMgTbnQ9edBvvt6lVNDxHF5QmkmMIU";
        A05 = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
        if (r10 != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
        r10 = r13.A02.get(r8[r15.A03].trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0190, code lost:
        if (r10 != (-1)) goto L24;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0D(java.lang.String r14, com.facebook.ads.redexgen.X.XJ r15, java.util.List<java.util.List<com.facebook.ads.redexgen.X.C1053Qh>> r16, java.util.List<java.lang.Long> r17) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass16.A0D(java.lang.String, com.facebook.ads.redexgen.X.XJ, java.util.List, java.util.List):void");
    }

    static {
        A09();
        A07 = Pattern.compile(A07(1, 31, 46));
    }

    public AnonymousClass16() {
        this(null);
    }

    public AnonymousClass16(List<byte[]> list) {
        super(A07(223, 10, 78));
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String A0q = AbstractC1672gE.A0q(list.get(0));
            String formatLine = A07(43, 7, 71);
            AbstractC1589es.A07(A0q.startsWith(formatLine));
            this.A03 = (XJ) AbstractC1589es.A01(XJ.A00(A0q));
            A0A(new C1648fq(list.get(1)));
            return;
        }
        this.A04 = false;
        this.A03 = null;
    }

    public static float A00(int i10) {
        switch (i10) {
            case 0:
                return 0.05f;
            case 1:
                return 0.5f;
            case 2:
                return 0.95f;
            default:
                return -3.4028235E38f;
        }
    }

    public static int A01(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 0:
            default:
                AbstractC1633fb.A07(A07(223, 10, 78), A07(239, 19, 101) + i10);
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                String[] strArr = A06;
                if (strArr[6].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[6] = "meUzX1SUOdYVJpkx005";
                strArr2[7] = "dgD45xlYZVaApp0HKGN";
                return 0;
        }
    }

    public static int A02(int i10) {
        switch (i10) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 0:
            default:
                AbstractC1633fb.A07(A07(223, 10, 78), A07(239, 19, 101) + i10);
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static int A03(long j10, List<Long> sortedCueTimesUs, List<List<C1053Qh>> list) {
        ArrayList arrayList;
        int i10 = 0;
        int insertionIndex = sortedCueTimesUs.size();
        int i11 = insertionIndex - 1;
        while (true) {
            if (i11 < 0) {
                break;
            }
            int insertionIndex2 = (sortedCueTimesUs.get(i11).longValue() > j10 ? 1 : (sortedCueTimesUs.get(i11).longValue() == j10 ? 0 : -1));
            if (insertionIndex2 == 0) {
                return i11;
            }
            int insertionIndex3 = (sortedCueTimesUs.get(i11).longValue() > j10 ? 1 : (sortedCueTimesUs.get(i11).longValue() == j10 ? 0 : -1));
            if (insertionIndex3 < 0) {
                i10 = i11 + 1;
                break;
            }
            i11--;
        }
        sortedCueTimesUs.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList = new ArrayList();
        } else {
            int insertionIndex4 = i10 - 1;
            arrayList = new ArrayList(list.get(insertionIndex4));
        }
        list.add(i10, arrayList);
        return i10;
    }

    public static long A04(String str) {
        Matcher matcher = A07.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) AbstractC1672gE.A0f(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) AbstractC1672gE.A0f(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) AbstractC1672gE.A0f(matcher.group(3))) * 1000000) + (Long.parseLong((String) AbstractC1672gE.A0f(matcher.group(4))) * 10000);
    }

    public static Layout.Alignment A05(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                AbstractC1633fb.A07(A07(223, 10, 78), A07(239, 19, 101) + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        if (r9 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        r7.A08(r11.A00 / r14, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
        if (r9 != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.C1053Qh A06(java.lang.String r10, com.facebook.ads.redexgen.X.XO r11, com.facebook.ads.redexgen.X.XL r12, float r13, float r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass16.A06(java.lang.String, com.facebook.ads.redexgen.X.XO, com.facebook.ads.redexgen.X.XL, float, float):com.facebook.ads.redexgen.X.Qh");
    }

    public static Map<String, XO> A08(C1648fq c1648fq) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        XK xk = null;
        while (true) {
            String A0T = c1648fq.A0T();
            if (A06[5].length() == 30) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "SmO4FOLXvzQajx3WVuO";
            strArr[7] = "bJ8R3IY99nhxdy3Y24A";
            if (A0T == null || (c1648fq.A07() != 0 && c1648fq.A0B() == 91)) {
                break;
            } else if (A0T.startsWith(A07(43, 7, 71))) {
                xk = XK.A00(A0T);
            } else if (A0T.startsWith(A07(233, 6, 15))) {
                if (xk == null) {
                    String currentLine = A07(50, 46, 115) + A0T;
                    AbstractC1633fb.A07(A07(223, 10, 78), currentLine);
                } else {
                    XO A04 = XO.A04(A0T, xk);
                    if (A04 != null) {
                        linkedHashMap.put(A04.A05, A04);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void A0A(C1648fq c1648fq) {
        while (true) {
            String A0T = c1648fq.A0T();
            if (A0T != null) {
                if (A07(266, 13, 28).equalsIgnoreCase(A0T)) {
                    A0B(c1648fq);
                } else {
                    String[] strArr = A06;
                    String currentLine = strArr[0];
                    if (currentLine.charAt(15) != strArr[4].charAt(15)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A06;
                    strArr2[6] = "FmD6kSuNAfqLCiPo1vf";
                    strArr2[7] = "I4ScjdcloSmskf1ICqM";
                    if (A07(319, 12, 40).equalsIgnoreCase(A0T)) {
                        this.A02 = A08(c1648fq);
                    } else if (A07(279, 11, 83).equalsIgnoreCase(A0T)) {
                        AbstractC1633fb.A06(A07(223, 10, 78), A07(290, 29, 51));
                    } else if (A07(258, 8, 39).equalsIgnoreCase(A0T)) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r4.equals(A07(337, 8, 65)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B(com.facebook.ads.redexgen.X.C1648fq r8) {
        /*
            r7 = this;
        L0:
            java.lang.String r3 = r8.A0T()
            if (r3 == 0) goto L7b
            int r0 = r8.A07()
            if (r0 == 0) goto L14
            int r1 = r8.A0B()
            r0 = 91
            if (r1 == r0) goto L7b
        L14:
            r2 = 33
            r1 = 1
            r0 = 74
            java.lang.String r0 = A07(r2, r1, r0)
            java.lang.String[] r5 = r3.split(r0)
            int r1 = r5.length
            r0 = 2
            if (r1 == r0) goto L26
            goto L0
        L26:
            r6 = 0
            r0 = r5[r6]
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = com.facebook.ads.redexgen.X.AbstractC1756hb.A01(r0)
            int r0 = r4.hashCode()
            r3 = 1
            switch(r0) {
                case 1879649548: goto L50;
                case 1879649549: goto L3e;
                default: goto L39;
            }
        L39:
            r6 = -1
        L3a:
            switch(r6) {
                case 0: goto L6e;
                case 1: goto L61;
                default: goto L3d;
            }
        L3d:
            goto L0
        L3e:
            r2 = 345(0x159, float:4.83E-43)
            r1 = 8
            r0 = 94
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            r6 = 1
            goto L3a
        L50:
            r2 = 337(0x151, float:4.72E-43)
            r1 = 8
            r0 = 65
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L39
            goto L3a
        L61:
            r0 = r5[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r7.A00 = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L6e:
            r0 = r5[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r7.A01 = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass16.A0B(com.facebook.ads.redexgen.X.fq):void");
    }

    private void A0C(C1648fq c1648fq, List<List<C1053Qh>> list, List<Long> list2) {
        XJ xj = this.A04 ? this.A03 : null;
        while (true) {
            String A0T = c1648fq.A0T();
            if (A0T != null) {
                if (A0T.startsWith(A07(43, 7, 71))) {
                    xj = XJ.A00(A0T);
                } else if (A0T.startsWith(A07(34, 9, 75))) {
                    if (xj == null) {
                        AbstractC1633fb.A07(A07(223, 10, 78), A07(96, 47, 97) + A0T);
                    } else {
                        A0D(A0T, xj, list, list2);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9H
    public final InterfaceC1213Wv A0g(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1648fq c1648fq = new C1648fq(bArr, i10);
        if (!this.A04) {
            A0A(c1648fq);
        }
        A0C(c1648fq, arrayList, arrayList2);
        return new TF(arrayList, arrayList2);
    }
}
