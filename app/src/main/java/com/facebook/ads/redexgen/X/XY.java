package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class XY {
    public static byte[] A0D;
    public static String[] A0E = {"qQ2af1nC3sp6i564q4", "KwZkkXtnaEwcARXIpM5CxbFZIgt", "vRpFBJuaF8FNOVFokj0ryhPld5UVLrxW", "P9g", "IGGl8CPeRG6iOLlkYAjFy2Y8l0ATtgV9", "t0LSlopIzwWz8L4SMrD7DSrPXTUyZlLl", "Vnd4MO5DVUvnKgMnCBClQoUlnThJBpL0", "1xuauaF35bVXmGZPKfSXJhL7VnKUmz"};
    public List<XY> A00;
    public final long A01;
    public final long A02;
    public final XY A03;
    public final C1223Xf A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final HashMap<String, Integer> A0A;
    public final HashMap<String, Integer> A0B;
    public final String[] A0C;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0D = new byte[]{112, 96, 48, 61, 34, 30, 22, 7, 18, 23, 18, 7, 18, 126};
    }

    static {
        A04();
    }

    public XY(String str, String str2, long j10, long j11, C1223Xf c1223Xf, String[] strArr, String str3, String str4, XY xy) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = c1223Xf;
        this.A0C = strArr;
        this.A09 = str2 != null;
        this.A02 = j10;
        this.A01 = j11;
        this.A06 = (String) AbstractC1589es.A01(str3);
        this.A03 = xy;
        this.A0B = new HashMap<>();
        this.A0A = new HashMap<>();
    }

    public static SpannableStringBuilder A00(String str, Map<String, C1446cY> map) {
        if (!map.containsKey(str)) {
            C1446cY c1446cY = new C1446cY();
            c1446cY.A0G(new SpannableStringBuilder());
            map.put(str, c1446cY);
        }
        C1446cY regionOutput = map.get(str);
        return (SpannableStringBuilder) AbstractC1589es.A01(regionOutput.A0I());
    }

    public static XY A01(String str) {
        return new XY(null, AbstractC1218Xa.A04(str), -9223372036854775807L, -9223372036854775807L, null, null, A03(0, 0, 64), null, null);
    }

    public static XY A02(String str, long j10, long j11, C1223Xf c1223Xf, String[] strArr, String str2, String str3, XY xy) {
        return new XY(str, null, j10, j11, c1223Xf, strArr, str2, str3, xy);
    }

    private void A05(long j10, String str, List<Pair<String, String>> regionImageList) {
        if (!A03(0, 0, 64).equals(this.A06)) {
            str = this.A06;
        }
        if (A0B(j10)) {
            String A03 = A03(2, 3, 120);
            String resolvedRegionId = this.A07;
            if (A03.equals(resolvedRegionId)) {
                String resolvedRegionId2 = this.A05;
                if (resolvedRegionId2 != null) {
                    regionImageList.add(new Pair<>(str, this.A05));
                    return;
                }
            }
        }
        for (int i10 = 0; i10 < A0C(); i10++) {
            A0D(i10).A05(j10, str, regionImageList);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x00b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(long r19, java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.C1223Xf> r21, java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.XZ> r22, java.lang.String r23, java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.C1446cY> r24) {
        /*
            r18 = this;
            r7 = r23
            r5 = r18
            r5 = r5
            r1 = r19
            boolean r0 = r5.A0B(r1)
            if (r0 != 0) goto Le
            return
        Le:
            r4 = 0
            r3 = 0
            r0 = 64
            java.lang.String r3 = A03(r4, r3, r0)
            java.lang.String r0 = r5.A06
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld9
        L1e:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.A0A
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L28:
            boolean r0 = r11.hasNext()
            r8 = r22
            r13 = r21
            r6 = r24
            if (r0 == 0) goto Lab
            java.lang.Object r3 = r11.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r9 = r3.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.A0B
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto La9
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.A0B
            java.lang.Object r0 = r0.get(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r15 = r0.intValue()
        L54:
            java.lang.Object r10 = r3.getValue()
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.XY.A0E
            r0 = 5
            r3 = r4[r0]
            r0 = 2
            r4 = r4[r0]
            r0 = 26
            char r3 = r3.charAt(r0)
            char r0 = r4.charAt(r0)
            if (r3 == r0) goto L74
        L6e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L74:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.XY.A0E
            java.lang.String r3 = "xyFoCu3m66uMaquczQy2LaakrWL"
            r0 = 1
            r4[r0] = r3
            java.lang.String r3 = "RwT"
            r0 = 3
            r4[r0] = r3
            int r0 = r10.intValue()
            if (r15 == r0) goto L28
            java.lang.Object r3 = r6.get(r9)
            com.facebook.ads.redexgen.X.cY r3 = (com.facebook.ads.redexgen.X.C1446cY) r3
            java.lang.Object r14 = com.facebook.ads.redexgen.X.AbstractC1589es.A01(r3)
            com.facebook.ads.redexgen.X.cY r14 = (com.facebook.ads.redexgen.X.C1446cY) r14
            java.lang.Object r3 = r8.get(r7)
            com.facebook.ads.redexgen.X.XZ r3 = (com.facebook.ads.redexgen.X.XZ) r3
            java.lang.Object r3 = com.facebook.ads.redexgen.X.AbstractC1589es.A01(r3)
            com.facebook.ads.redexgen.X.XZ r3 = (com.facebook.ads.redexgen.X.XZ) r3
            int r3 = r3.A08
            r12 = r5
            r16 = r0
            r17 = r3
            r12.A09(r13, r14, r15, r16, r17)
            goto L28
        La9:
            r15 = 0
            goto L54
        Lab:
            r9 = 0
        Lac:
            int r0 = r5.A0C()
            if (r9 >= r0) goto Ldd
            com.facebook.ads.redexgen.X.XY r10 = r5.A0D(r9)
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.XY.A0E
            r0 = 4
            r3 = r3[r0]
            r0 = 8
            char r3 = r3.charAt(r0)
            r0 = 82
            if (r3 == r0) goto Lc6
            goto L6e
        Lc6:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.XY.A0E
            java.lang.String r3 = "6QYhv5bOOrSTAVWTSg"
            r0 = 0
            r4[r0] = r3
            r13 = r13
            r14 = r8
            r15 = r7
            r16 = r6
            r11 = r1
            r10.A06(r11, r13, r14, r15, r16)
            int r9 = r9 + 1
            goto Lac
        Ld9:
            java.lang.String r7 = r5.A06
            goto L1e
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XY.A06(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(long r13, boolean r15, java.lang.String r16, java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.C1446cY> r17) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XY.A07(long, boolean, java.lang.String, java.util.Map):void");
    }

    public static void A08(SpannableStringBuilder spannableStringBuilder) {
        XR[] xrArr;
        for (XR xr : (XR[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), XR.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(xr), spannableStringBuilder.getSpanEnd(xr), (CharSequence) A03(0, 0, 64));
        }
        for (int spacesToDelete = 0; spacesToDelete < spannableStringBuilder.length(); spacesToDelete++) {
            char charAt = spannableStringBuilder.charAt(spacesToDelete);
            String[] strArr = A0E;
            String str = strArr[5];
            String str2 = strArr[2];
            int i10 = str.charAt(26);
            if (i10 != str2.charAt(26)) {
                throw new RuntimeException();
            }
            A0E[6] = "tC17RDg6Hvof5kf7j25CQSuyUNpVd2Tb";
            if (charAt == ' ') {
                int i11 = spacesToDelete + 1;
                while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                    i11++;
                }
                int i12 = i11 - (spacesToDelete + 1);
                if (i12 > 0) {
                    spannableStringBuilder.delete(spacesToDelete, spacesToDelete + i12);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
            if (spannableStringBuilder.charAt(i13) == '\n' && spannableStringBuilder.charAt(i13 + 1) == ' ') {
                int i14 = i13 + 1;
                spannableStringBuilder.delete(i14, i13 + 2);
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
            if (spannableStringBuilder.charAt(i15) == ' ' && spannableStringBuilder.charAt(i15 + 1) == '\n') {
                spannableStringBuilder.delete(i15, i15 + 1);
            }
        }
        int length = spannableStringBuilder.length();
        if (A0E[6].charAt(16) != 'm') {
            A0E[6] = "TXpkebIqq2bhCZS8RwWkB9p2jCQ6zTDP";
            if (length <= 0) {
                return;
            }
        } else if (length <= 0) {
            return;
        }
        if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void A09(Map<String, C1223Xf> map, C1446cY c1446cY, int i10, int i11, int i12) {
        C1223Xf A02 = AbstractC1218Xa.A02(this.A04, this.A0C, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c1446cY.A0I();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            c1446cY.A0G(spannableStringBuilder);
        }
        if (A02 != null) {
            AbstractC1218Xa.A06(spannableStringBuilder, i10, i11, A02, this.A03, map, i12);
            if (A03(13, 1, 34).equals(this.A07)) {
                if (A02.A04() != Float.MAX_VALUE) {
                    c1446cY.A05((A02.A04() * (-90.0f)) / 100.0f);
                }
                if (A02.A0C() != null) {
                    c1446cY.A0F(A02.A0C());
                }
                if (A02.A0B() != null) {
                    Layout.Alignment A0B = A02.A0B();
                    if (A0E[0].length() != 18) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0E;
                    strArr[1] = "emVkUyppSgRxUoPafouBPBPzudl";
                    strArr[3] = "H1b";
                    c1446cY.A0E(A0B);
                }
            }
        }
    }

    private void A0A(TreeSet<Long> out, boolean z10) {
        boolean equals = A03(13, 1, 34).equals(this.A07);
        boolean isPNode = A03(2, 3, 120).equals(this.A07);
        if (z10 || equals || (isPNode && this.A05 != null)) {
            if (this.A02 != -9223372036854775807L) {
                out.add(Long.valueOf(this.A02));
            }
            int i10 = (this.A01 > (-9223372036854775807L) ? 1 : (this.A01 == (-9223372036854775807L) ? 0 : -1));
            if (A0E[0].length() != 18) {
                throw new RuntimeException();
            }
            A0E[7] = "uJ110GDpm3v4QqcwcuG81IUTvh8SAb";
            if (i10 != 0) {
                out.add(Long.valueOf(this.A01));
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.A00.size(); i11++) {
            XY xy = this.A00.get(i11);
            boolean isPNode2 = z10 || equals;
            xy.A0A(out, isPNode2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2 != (-9223372036854775807L)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0B(long r8) {
        /*
            r7 = this;
            long r1 = r7.A02
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L30
            long r2 = r7.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.XY.A0E
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 18
            if (r1 == r0) goto L20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L20:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.XY.A0E
            java.lang.String r1 = "0O4PsdT19rUrsW8cFFDkquioTyi"
            r0 = 1
            r4[r0] = r1
            java.lang.String r1 = "Odq"
            r0 = 3
            r4[r0] = r1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L54
        L30:
            long r1 = r7.A02
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L3c
            long r1 = r7.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L54
        L3c:
            long r1 = r7.A02
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L48
            long r1 = r7.A01
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L54
        L48:
            long r1 = r7.A02
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L56
            long r1 = r7.A01
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L56
        L54:
            r0 = 1
        L55:
            return r0
        L56:
            r0 = 0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XY.A0B(long):boolean");
    }

    public final int A0C() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.size();
    }

    public final XY A0D(int i10) {
        if (this.A00 != null) {
            return this.A00.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<C1053Qh> A0E(long j10, Map<String, C1223Xf> map, Map<String, XZ> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        A05(j10, this.A06, arrayList);
        TreeMap treeMap = new TreeMap();
        A07(j10, false, this.A06, treeMap);
        A06(j10, map, map2, this.A06, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> regionImagePair : arrayList) {
            String str = map3.get(regionImagePair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                XZ xz = (XZ) AbstractC1589es.A01(map2.get(regionImagePair.first));
                arrayList2.add(new C1446cY().A0D(decodeByteArray).A04(xz.A02).A0A(0).A07(xz.A01, 0).A09(xz.A05).A06(xz.A04).A03(xz.A00).A0B(xz.A08).A0H());
            }
        }
        Set entrySet = treeMap.entrySet();
        if (A0E[6].charAt(16) != 'm') {
            String[] strArr = A0E;
            strArr[1] = "PJ2Eb4vxaDmikAtNVNRsk3kawRO";
            strArr[3] = "Jbu";
            Iterator it = entrySet.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String[] strArr2 = A0E;
                if (strArr2[1].length() == strArr2[3].length()) {
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    XZ xz2 = (XZ) AbstractC1589es.A01(map2.get(entry.getKey()));
                    C1446cY c1446cY = (C1446cY) entry.getValue();
                    A08((SpannableStringBuilder) AbstractC1589es.A01(c1446cY.A0I()));
                    c1446cY.A07(xz2.A01, xz2.A06);
                    c1446cY.A09(xz2.A05);
                    c1446cY.A04(xz2.A02);
                    c1446cY.A06(xz2.A04);
                    c1446cY.A08(xz2.A03, xz2.A07);
                    c1446cY.A0B(xz2.A08);
                    arrayList2.add(c1446cY.A0H());
                } else {
                    String[] strArr3 = A0E;
                    strArr3[5] = "JBi8F8oP2NpxvnjSRoMaykPtlvURiSyj";
                    strArr3[2] = "wel2TOL6fBeZ5lmdXIxjLoGqEUURBQum";
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    XZ xz22 = (XZ) AbstractC1589es.A01(map2.get(entry2.getKey()));
                    C1446cY c1446cY2 = (C1446cY) entry2.getValue();
                    A08((SpannableStringBuilder) AbstractC1589es.A01(c1446cY2.A0I()));
                    c1446cY2.A07(xz22.A01, xz22.A06);
                    c1446cY2.A09(xz22.A05);
                    c1446cY2.A04(xz22.A02);
                    c1446cY2.A06(xz22.A04);
                    c1446cY2.A08(xz22.A03, xz22.A07);
                    c1446cY2.A0B(xz22.A08);
                    arrayList2.add(c1446cY2.A0H());
                }
            }
            return arrayList2;
        }
        throw new RuntimeException();
    }

    public final void A0F(XY xy) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(xy);
    }

    public final long[] A0G() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0A(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i10 = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public final String[] A0H() {
        return this.A0C;
    }
}
