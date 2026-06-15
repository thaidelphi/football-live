package com.facebook.ads.redexgen.X;

import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* renamed from: com.facebook.ads.redexgen.X.Zd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1272Zd implements InterfaceC1453cf {
    public static byte[] A01;
    public static String[] A02 = {"C2oNjknnU7f0", "jamwzdSlwK1VU9u2UPn", "R5XcbmNqMJoFdKqssmR", "W7b6qf23Duc83Oe128GfM5mv1DxgoN8Y", "fTV0s6uNTGHyORXoaD3", "RFlveHiMlXMp", "PvM4dczZRLrPOakCL90n8efAwxIuVll9", "L6hM6Wtzh6wW7MGPsexTAJgQv27bcN2T"};
    public final /* synthetic */ C1270Zb A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "Fu6viaOBrSAOhEjkX6qfziNnimGyiClw";
            strArr2[6] = "bt6qonQCYxBAXULI4C8iqHb7bpxGx1TI";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 94);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-21, 30, 30, 15, 23, 26, 30, 15, 14, -54, 30, 25, -54, 13, 28, 15, 11, 30, 15, -54, 14, 15, 13, 25, 14, 15, 28, -54, 16, 25, 28, -54, 31, 24, 29, 31, 26, 26, 25, 28, 30, 15, 14, -54, 16, 25, 28, 23, 11, 30, -58, -43, -43, -47, -50, -56, -58, -39, -50, -44, -45, -108, -56, -54, -58, -110, -101, -107, -99, -41, -26, -26, -30, -33, -39, -41, -22, -33, -27, -28, -91, -39, -37, -41, -93, -83, -90, -82, 4, 19, 19, 15, 12, 6, 4, 23, 12, 18, 17, -46, 7, 25, 5, 22, 24, 5, 22, 16, 31, 31, 27, 24, 18, 16, 35, 24, 30, 29, -34, 31, 22, 34, -20, -5, -5, -9, -12, -18, -20, -1, -12, -6, -7, -70, -1, -1, -8, -9, -74, 3, -8, -9, -10, 5, 5, 1, -2, -8, -10, 9, -2, 4, 3, -60, 13, -62, 2, 5, -55, -62, -8, -6, -10, -62, -53, -59, -51, 52, 67, 67, 63, 60, 54, 52, 71, 60, 66, 65, 2, 75, 0, 64, 67, 7, 0, 73, 71, 71, 55, 70, 70, 66, 63, 57, 55, 74, 63, 69, 68, 5, 78, 3, 71, 75, 63, 57, 65, 74, 63, 67, 59, 3, 74, 78, 9, 61, -37, -22, -22, -26, -29, -35, -37, -18, -29, -23, -24, -87, -14, -89, -19, -17, -36, -20, -29, -22, 44, 29, 48, 44, -25, 46, 44, 44, 30, 15, 34, 30, -39, 34, -41, 29, 29, 11};
    }

    static {
        A01();
    }

    public C1272Zd(C1270Zb c1270Zb) {
        this.A00 = c1270Zb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1453cf
    public final TQ A5A(ZM zm) {
        char c10;
        String str = zm.A0W;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals(A00(88, 19, 69))) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -1248334819:
                if (str.equals(A00(107, 15, 81))) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -1026075066:
                if (str.equals(A00(167, 21, 117))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1004728940:
                if (str.equals(A00(236, 8, 90))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 691401887:
                if (str.equals(A00(188, 28, 120))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 822864842:
                if (str.equals(A00(244, 10, 76))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 930165504:
                if (str.equals(A00(142, 25, 55))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1566015601:
                if (str.equals(A00(50, 19, 7))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1566016562:
                if (str.equals(A00(69, 19, 24))) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1668750253:
                if (str.equals(A00(216, 20, 28))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1693976202:
                if (str.equals(A00(122, 20, 45))) {
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
                return new C9H() { // from class: com.facebook.ads.redexgen.X.11
                    public static byte[] A02;
                    public static String[] A03 = {"T9PRe", "zmTKMZoG7iX7oy1Nc1A", "Lfs9febFe2vV", "flgaV8jd2", "TuPgqZLWJtBUEOOYXH7L1f5bT08jUYp1", "6FT4W0AmbHQ15T88T1g", "DM2wuWQyrezwjkuwyPvj4JmDR3eUlx69", "tv77"};
                    public final C1227Xj A00;
                    public final C1648fq A01;

                    public static String A01(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 83);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A02 = new byte[]{-23, -56, 27, 28, 33, 20, 13, -56, 10, 20, 23, 11, 19, -56, 31, 9, 27, -56, 14, 23, 29, 22, 12, -56, 9, 14, 28, 13, 26, -56, 28, 16, 13, -56, 14, 17, 26, 27, 28, -56, 11, 29, 13, -42, 24, 25, 30, 15, -52, -51, -46, -59, -66, -63, -49, -52, -32, -34, -34, -82, -49, -51, -39, -50, -49, -36};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(53, 13, 23);
                        this.A01 = new C1648fq();
                        this.A00 = new C1227Xj();
                    }

                    public static int A00(C1648fq c1648fq) {
                        int currentInputPosition = -1;
                        int i10 = 0;
                        while (currentInputPosition == -1) {
                            i10 = c1648fq.A09();
                            int currentInputPosition2 = A03[5].length();
                            if (currentInputPosition2 != 19) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A03;
                            strArr[4] = "897ltLChZGwVJAWHvfSJ3xrGcLBnCvdy";
                            strArr[6] = "dyU8XL3oiKkhT59g12Hf6WmaJSZBVtZp";
                            String A0T = c1648fq.A0T();
                            if (A0T == null) {
                                currentInputPosition = 0;
                            } else if (A01(48, 5, 38).equals(A0T)) {
                                currentInputPosition = 2;
                            } else if (A0T.startsWith(A01(44, 4, 119))) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        c1648fq.A0f(i10);
                        return currentInputPosition;
                    }

                    public static void A03(C1648fq c1648fq) {
                        do {
                        } while (!TextUtils.isEmpty(c1648fq.A0T()));
                    }

                    @Override // com.facebook.ads.redexgen.X.C9H
                    public final InterfaceC1213Wv A0g(byte[] bArr, int i10, boolean z10) throws TP {
                        C1235Xr A08;
                        this.A01.A0j(bArr, i10);
                        ArrayList arrayList = new ArrayList();
                        try {
                            Y0.A04(this.A01);
                            do {
                            } while (!TextUtils.isEmpty(this.A01.A0T()));
                            ArrayList arrayList2 = new ArrayList();
                            while (true) {
                                int A00 = A00(this.A01);
                                if (A00 != 0) {
                                    if (A00 == 1) {
                                        A03(this.A01);
                                    } else if (A00 == 2) {
                                        if (arrayList2.isEmpty()) {
                                            this.A01.A0T();
                                            arrayList.addAll(this.A00.A0F(this.A01));
                                        } else {
                                            throw new TP(A01(0, 44, 85));
                                        }
                                    } else if (A00 == 3 && (A08 = AbstractC1243Xz.A08(this.A01, arrayList)) != null) {
                                        arrayList2.add(A08);
                                    }
                                } else {
                                    return new T9(arrayList2);
                                }
                            }
                        } catch (Q6 e8) {
                            throw new TP(e8);
                        }
                    }
                };
            case 1:
                return new AnonymousClass16(zm.A0X);
            case 2:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.12
                    public static byte[] A02;
                    public static String[] A03 = {"3qqRpIc7eYIJvwcUHGBBhNHBQscftOpG", "r99bEwqop96FdhTXGsAeWl7EmtJQ93zA", "l6Rtn7SWgWxZdRa2", "KbHb1UrnNB05JiV0mVK20gLIf1Vf3xrw", "QTXA6yeYuZ4uODkg2NYaiUxnsE2Rwd4o", "IstwiDJXedkTxZZrG2nkehqZk7gHU8ft", "MzFxyePgfM94w5wAeuVhNJkZQr3kN6kV", "DFKSIEjXqmdUeZs9"};
                    public final C1234Xq A00;
                    public final C1648fq A01;

                    public static String A01(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                        int i13 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            String[] strArr = A03;
                            if (strArr[3].charAt(3) != strArr[1].charAt(3)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[7] = "7DgaYEPzmH1eRvtV";
                            strArr2[2] = "8MICOCA274m9bWy4";
                            if (i13 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 26);
                            i13++;
                        }
                    }

                    public static void A02() {
                        A02 = new byte[]{-36, 1, -10, 2, 0, 3, -1, -8, 7, -8, -77, -32, 3, -57, -22, -8, -11, 9, 7, 7, -77, -25, 2, 3, -77, -33, -8, 9, -8, -1, -77, -11, 2, 11, -77, -5, -8, -12, -9, -8, 5, -77, -7, 2, 8, 1, -9, -63, -58, -21, -32, -20, -22, -19, -23, -30, -15, -30, -99, -13, -15, -15, -99, -32, -14, -30, -99, -33, -20, -11, -99, -27, -30, -34, -31, -30, -17, -99, -29, -20, -14, -21, -31, -85, -108, -73, 123, -98, -84, -87, -67, -69, -69, -117, -84, -86, -74, -85, -84, -71};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(84, 16, 45);
                        this.A01 = new C1648fq();
                        this.A00 = new C1234Xq();
                    }

                    public static C1053Qh A00(C1648fq c1648fq, int i10) throws TP {
                        C1446cY c1446cY = null;
                        CharSequence charSequence = null;
                        while (i10 > 0) {
                            if (i10 >= 8) {
                                int A0C = c1648fq.A0C();
                                int boxType = c1648fq.A0C();
                                int boxSize = A0C - 8;
                                String A0r = AbstractC1672gE.A0r(c1648fq.A0l(), c1648fq.A09(), boxSize);
                                c1648fq.A0g(boxSize);
                                i10 = (i10 - 8) - boxSize;
                                if (boxType == 1937011815) {
                                    c1446cY = AbstractC1243Xz.A0A(A0r);
                                } else if (boxType == 1885436268) {
                                    charSequence = AbstractC1243Xz.A07(null, A0r.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new TP(A01(48, 36, 99));
                            }
                        }
                        if (charSequence == null) {
                            charSequence = A01(0, 0, 26);
                        }
                        if (c1446cY != null) {
                            C1446cY A0G = c1446cY.A0G(charSequence);
                            String[] strArr = A03;
                            if (strArr[3].charAt(3) != strArr[1].charAt(3)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A03;
                            strArr2[6] = "cHQZwLGKzV7x8ErPdc4FlPiVSrXFEpE2";
                            strArr2[0] = "Nq3KjOzhrHflZ8qkhMRfzo8YnRYLvtO3";
                            return A0G.A0H();
                        }
                        return AbstractC1243Xz.A0B(charSequence);
                    }

                    @Override // com.facebook.ads.redexgen.X.C9H
                    public final InterfaceC1213Wv A0g(byte[] bArr, int i10, boolean z10) throws TP {
                        this.A01.A0j(bArr, i10);
                        ArrayList arrayList = new ArrayList();
                        while (this.A01.A07() > 0) {
                            if (this.A01.A07() >= 8) {
                                int A0C = this.A01.A0C();
                                int boxSize = this.A01.A0C();
                                if (boxSize == 1987343459) {
                                    arrayList.add(A00(this.A01, A0C - 8));
                                } else {
                                    C1648fq c1648fq = this.A01;
                                    String[] strArr = A03;
                                    String str2 = strArr[6];
                                    String str3 = strArr[0];
                                    int boxSize2 = str2.charAt(12);
                                    if (boxSize2 == str3.charAt(12)) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr2 = A03;
                                    strArr2[3] = "tt5boxMA6zOVe1q3iWRC6wVIWhKjFxUN";
                                    strArr2[1] = "JgpbcgdeK05SwxHapnLNuHT6PBEeZj3G";
                                    c1648fq.A0g(A0C - 8);
                                }
                            } else {
                                throw new TP(A01(0, 48, 121));
                            }
                        }
                        return new TB(arrayList);
                    }
                };
            case 3:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.14
                    public static byte[] A01;
                    public static String[] A02 = {"P8GZY6j8AF", "reAg56jhjo", "HupIFxrzaE8KLJ130mB81O9huHY0LT5g", "lUr4CuOjqfsgfkBRXM9CXBlkeQmQwG30", "dv6A5tg6autRVRcERoUyUPlgv", "2oxe4Bb2VYj5YxjSK2N", "GEIDstLnzhffpmb97xaLB2Lr1phmMGaz", "IdORLd"};
                    public static final Pattern A03;
                    public static final Pattern A04;
                    public static final XV A05;
                    public static final XW A06;
                    public static final Pattern A07;
                    public static final Pattern A08;
                    public static final Pattern A09;
                    public static final Pattern A0A;
                    public static final Pattern A0B;
                    public final XmlPullParserFactory A00;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
                        if (r3.equals(A0A(1679, 1, 24)) != false) goto L22;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x0142, code lost:
                        if (r3.equals(r4) != false) goto L46;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x0144, code lost:
                        r4 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
                        if (r3.equals(r4) != false) goto L46;
                     */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static long A01(java.lang.String r10, com.facebook.ads.redexgen.X.XW r11) throws com.facebook.ads.redexgen.X.TP {
                        /*
                            Method dump skipped, instructions count: 456
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass14.A01(java.lang.String, com.facebook.ads.redexgen.X.XW):long");
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static XV A03(XmlPullParser xmlPullParser, XV xv) throws TP {
                        String attributeValue = xmlPullParser.getAttributeValue(A0A(1472, 35, 34), A0A(1285, 14, 112));
                        if (attributeValue == null) {
                            return xv;
                        }
                        Matcher matcher = A07.matcher(attributeValue);
                        boolean matches = matcher.matches();
                        String A0A2 = A0A(166, 36, 0);
                        String A0A3 = A0A(892, 11, 120);
                        if (!matches) {
                            AbstractC1633fb.A07(A0A3, A0A2 + attributeValue);
                            return xv;
                        }
                        try {
                            int parseInt = Integer.parseInt((String) AbstractC1589es.A01(matcher.group(1)));
                            int parseInt2 = Integer.parseInt((String) AbstractC1589es.A01(matcher.group(2)));
                            if (parseInt == 0 || parseInt2 == 0) {
                                throw new TP(A0A(557, 24, 110) + parseInt + A0A(0, 1, 45) + parseInt2);
                            }
                            return new XV(parseInt, parseInt2);
                        } catch (NumberFormatException unused) {
                            AbstractC1633fb.A07(A0A3, A0A2 + attributeValue);
                            return xv;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x013f, code lost:
                        if (r6.equals(A0A(1613, 6, 21)) != false) goto L60;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
                        r1 = 4;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x0154, code lost:
                        if (r6.equals(A0A(1613, 6, 1)) != false) goto L60;
                     */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static com.facebook.ads.redexgen.X.XY A06(org.xmlpull.v1.XmlPullParser r21, com.facebook.ads.redexgen.X.XY r22, java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.XZ> r23, com.facebook.ads.redexgen.X.XW r24) throws com.facebook.ads.redexgen.X.TP {
                        /*
                            Method dump skipped, instructions count: 518
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass14.A06(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.XY, java.util.Map, com.facebook.ads.redexgen.X.XW):com.facebook.ads.redexgen.X.XY");
                    }

                    public static String A0A(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 38);
                        }
                        return new String(copyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static Map<String, C1223Xf> A0B(XmlPullParser xmlPullParser, Map<String, C1223Xf> map, XV xv, XX xx, Map<String, XZ> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
                        do {
                            xmlPullParser.next();
                            String A0A2 = A0A(1655, 5, 75);
                            if (AbstractC1678gK.A04(xmlPullParser, A0A2)) {
                                String A00 = AbstractC1678gK.A00(xmlPullParser, A0A2);
                                C1223Xf A092 = A09(xmlPullParser, new C1223Xf());
                                if (A00 != null) {
                                    String[] A0G = A0G(A00);
                                    for (String str2 : A0G) {
                                        A092.A0O(map.get(str2));
                                    }
                                }
                                String A0X = A092.A0X();
                                if (A0X != null) {
                                    map.put(A0X, A092);
                                }
                            } else if (AbstractC1678gK.A04(xmlPullParser, A0A(1613, 6, 21))) {
                                XZ A072 = A07(xmlPullParser, xv, xx);
                                if (A072 != null) {
                                    map2.put(A072.A09, A072);
                                }
                            } else if (AbstractC1678gK.A04(xmlPullParser, A0A(1553, 8, 18))) {
                                A0E(xmlPullParser, map3);
                            }
                        } while (!AbstractC1678gK.A03(xmlPullParser, A0A(1468, 4, 99)));
                        return map;
                    }

                    public static void A0C() {
                        byte[] bArr = {43, 126, 32, 85, 92, 75, 85, 121, 99, 122, 114, 120, 49, 98, 54, 117, 100, 115, 119, 98, 115, 54, 78, 123, 122, 70, 99, 122, 122, 70, 119, 100, 101, 115, 100, 80, 119, 117, 98, 121, 100, 111, 54, Byte.MAX_VALUE, 120, 101, 98, 119, 120, 117, 115, 59, 28, 20, 17, 24, 25, 93, 13, 28, 15, 14, 20, 19, 26, 93, 31, 28, 30, 22, 26, 15, 18, 8, 19, 25, 93, 11, 28, 17, 8, 24, 71, 93, 59, 28, 20, 17, 24, 25, 93, 13, 28, 15, 14, 20, 19, 26, 93, 30, 18, 17, 18, 15, 93, 11, 28, 17, 8, 24, 71, 93, 14, 41, 33, 36, 45, 44, 104, 56, 41, 58, 59, 33, 38, 47, 104, 46, 39, 38, 60, 27, 33, 50, 45, 104, 62, 41, 36, 61, 45, 114, 104, 13, 42, 34, 39, 46, 47, 107, 63, 36, 107, 59, 42, 57, 56, 46, 107, 56, 35, 46, 42, 57, 113, 107, 111, 65, 72, 73, 84, 79, 72, 65, 6, 75, 71, 74, 64, 73, 84, 75, 67, 66, 6, 69, 67, 74, 74, 6, 84, 67, 85, 73, 74, 83, 82, 79, 73, 72, 28, 6, 37, 11, 2, 3, 30, 5, 2, 11, 76, 1, 13, 0, 10, 3, 30, 1, 9, 8, 76, 24, 24, 31, 76, 9, 20, 24, 9, 2, 24, 86, 76, 84, 122, 115, 114, 111, 116, 115, 122, 61, 115, 114, 115, 48, 109, 116, 101, 120, 113, 61, 105, 105, 110, 61, 120, 101, 105, 120, 115, 105, 39, 61, 112, 94, 87, 86, 75, 80, 87, 94, 25, 75, 92, 94, 80, 86, 87, 25, 78, 80, 77, 81, 25, 84, 88, 85, 95, 86, 75, 84, 92, 93, 25, 92, 65, 77, 92, 87, 77, 3, 25, 101, 75, 66, 67, 94, 69, 66, 75, 12, 94, 73, 75, 69, 67, 66, 12, 91, 69, 88, 68, 12, 65, 77, 64, 74, 67, 94, 65, 73, 72, 12, 67, 94, 69, 75, 69, 66, 22, 12, 120, 86, 95, 94, 67, 88, 95, 86, 17, 67, 84, 86, 88, 94, 95, 17, 70, 88, 69, 89, 17, 92, 88, 66, 66, 88, 95, 86, 17, 69, 69, 66, 11, 84, 73, 69, 84, 95, 69, 11, 17, 30, 48, 57, 56, 37, 62, 57, 48, 119, 37, 50, 48, 62, 56, 57, 119, 32, 62, 35, 63, 119, 34, 57, 36, 34, 39, 39, 56, 37, 35, 50, 51, 119, 50, 47, 35, 50, 57, 35, 109, 119, 68, 106, 99, 98, Byte.MAX_VALUE, 100, 99, 106, 45, Byte.MAX_VALUE, 104, 106, 100, 98, 99, 45, 122, 100, 121, 101, 45, 120, 99, 126, 120, 125, 125, 98, Byte.MAX_VALUE, 121, 104, 105, 45, 98, Byte.MAX_VALUE, 100, 106, 100, 99, 55, 45, 105, 71, 78, 79, 82, 73, 78, 71, 0, 82, 69, 71, 73, 79, 78, 0, 87, 73, 84, 72, 79, 85, 84, 0, 65, 78, 0, 69, 88, 84, 69, 78, 84, 54, 24, 17, 16, 13, 22, 17, 24, 95, 13, 26, 24, 22, 16, 17, 95, 8, 22, 11, 23, 16, 10, 11, 95, 30, 17, 95, 16, 13, 22, 24, 22, 17, 87, 121, 112, 113, 108, 119, 112, 121, 62, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 62, 106, Byte.MAX_VALUE, 121, 36, 62, 1, 38, 62, 41, 36, 33, 44, 104, 43, 45, 36, 36, 104, 58, 45, 59, 39, 36, 61, 60, 33, 39, 38, 104, 93, 122, 98, 117, 120, 125, 112, 52, 113, 108, 100, 102, 113, 103, 103, 125, 123, 122, 52, 114, 123, 102, 52, 114, 123, 122, 96, 71, 125, 110, 113, 46, 52, 51, 94, 121, 97, 118, 123, 126, 115, 55, 121, 98, 122, 117, 114, 101, 55, 120, 113, 55, 114, 121, 99, 101, 126, 114, 100, 55, 113, 120, 101, 55, 113, 120, 121, 99, 68, 126, 109, 114, 45, 55, 124, 91, 67, 84, 89, 92, 81, 21, 64, 91, 92, 65, 21, 83, 90, 71, 21, 83, 90, 91, 65, 102, 92, 79, 80, 15, 21, 18, 64, 103, Byte.MAX_VALUE, 104, 101, 96, 109, 41, Byte.MAX_VALUE, 104, 101, 124, 108, 41, 111, 102, 123, 41, 122, 97, 108, 104, 123, 51, 41, 117, 89, 84, 94, 87, 74, 85, 93, 92, 24, 76, 81, 85, 93, 24, 93, 64, 72, 74, 93, 75, 75, 81, 87, 86, 2, 24, 30, 38, 63, 39, 58, 35, 63, 54, 115, 37, 50, 63, 38, 54, 32, 115, 58, 61, 115, 53, 60, 61, 39, 0, 58, 41, 54, 115, 50, 39, 39, 33, 58, 49, 38, 39, 54, 125, 115, 3, 58, 48, 56, 58, 61, 52, 115, 39, 59, 54, 115, 32, 54, 48, 60, 61, 55, 115, 37, 50, 63, 38, 54, 115, 53, 60, 33, 115, 37, 54, 33, 39, 58, 48, 50, 63, 115, 53, 60, 61, 39, 115, 32, 58, 41, 54, 115, 50, 61, 55, 115, 58, 52, 61, 60, 33, 58, 61, 52, 115, 39, 59, 54, 115, 53, 58, 33, 32, 39, 125, 108, 77, 2, 118, 118, 111, 110, 2, 81, 87, 64, 86, 75, 86, 78, 71, 81, 2, 68, 77, 87, 76, 70, 57, 31, 26, 26, 24, 15, 25, 25, 3, 4, 13, 74, 26, 11, 24, 25, 15, 24, 74, 15, 24, 24, 5, 24, 10, 42, 51, 50, 26, 59, 61, 49, 58, 59, 44, 43, 16, 31, 28, 18, 27, 94, 10, 17, 94, 26, 27, 29, 17, 26, 27, 94, 13, 17, 11, 12, 29, 27, 12, 55, 60, 33, 41, 60, 58, 45, 60, 61, 121, 60, 43, 43, 54, 43, 121, 46, 49, 60, 55, 121, 43, 60, 56, 61, 48, 55, 62, 121, 48, 55, 41, 44, 45, 119, 87, 120, 32, 12, 122, 122, 9, 98, Byte.MAX_VALUE, 107, 15, 120, 124, 123, 109, 9, 98, Byte.MAX_VALUE, 107, 15, 121, 123, 122, 34, 42, 46, 55, 63, 46, 119, 123, 118, 81, 39, 84, 34, 36, 82, 
                        48, 83, 107, 36, 83, 33, 48, 83, 107, 37, 48, 38, 42, 43, 14, 120, 11, 96, 125, 105, 13, 123, 120, 111, 106, 12, 126, 11, 96, 125, 105, 13, 123, 121, 111, 121, 120, 56, 44, 61, 44, 35, 44, 61, 35, 44, 54, 44, 36, 121, 116, 18, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 103, 101, 118, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 101, 118, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 101, 100, 115, 118, 100, 16, 98, 23, 124, 97, 117, 17, 103, 101, 48, 118, 100, 23, 124, 97, 117, 17, 23, 124, 97, 117, 17, 101, 100, 115, 118, 16, 98, 100, 23, 124, 97, 117, 17, 103, 101, 101, 115, 101, 115, 104, 17, 103, 19, 43, 100, 102, 111, 103, 19, 43, 100, 102, 107, 22, 96, 20, 44, 99, 20, 102, 119, 20, 44, 98, 119, 97, 109, 104, 96, 20, 44, 99, 20, 102, 119, 20, 44, 98, 119, 97, 109, 108, 51, 69, 49, 9, 70, 49, 67, 82, 49, 9, 71, 82, 68, 29, 21, 77, 69, 49, 9, 70, 49, 67, 82, 49, 9, 71, 82, 68, 29, 21, 73, 28, 27, 9, 24, 15, 102, 107, 107, 82, 81, 83, 91, 87, 66, 95, 69, 94, 84, 115, 95, 92, 95, 66, 13, 14, 12, 4, 8, 29, 0, 26, 1, 11, 38, 2, 14, 8, 10, 72, 75, 89, 79, 37, 38, 52, 34, 4, 40, 41, 51, 38, 46, 41, 34, 53, 15, 8, 11, 2, 31, 8, 43, 44, 46, 32, 39, 106, 103, 108, 113, 108, 97, 98, 106, 30, 14, 53, 51, 58, 58, 4, 51, 37, 57, 58, 35, 34, 63, 57, 56, 1, 7, 12, 22, 7, 16, 63, 51, 48, 51, 46, 85, 89, 88, 66, 87, 95, 88, 83, 68, 65, 68, 81, 68, 66, 67, 74, 79, 75, 79, 82, 67, 84, 24, 21, 15, 12, 16, 29, 5, 61, 16, 21, 27, 18, 119, 122, 101, 42, 59, 60, 9, 1, 105, 98, 104, 61, 32, 44, 61, 54, 44, 69, 6, 15, 14, 20, 38, 1, 13, 9, 12, 25, 109, 100, 101, Byte.MAX_VALUE, 88, 98, 113, 110, 43, 34, 35, 57, 30, 57, 52, 33, 40, 45, 36, 37, 63, 28, 46, 34, 44, 35, 63, 50, 38, 53, 57, 49, 6, 53, 32, 49, 25, 13, 30, 18, 26, 45, 30, 11, 26, 50, 10, 19, 11, 22, 15, 19, 22, 26, 13, 8, 28, 15, 3, 11, 60, 15, 26, 11, 35, 27, 2, 26, 7, 30, 2, 7, 11, 28, 78, 10, 1, 11, 29, 0, 73, 26, 78, 6, 15, 24, 11, 78, 92, 78, 30, 15, 28, 26, 29, 30, 45, 32, 36, 33, 108, 112, 112, 116, 62, 43, 43, 115, 115, 115, 42, 115, 55, 42, 107, 118, 99, 43, 106, 119, 43, 112, 112, 105, 104, 39, 116, 101, 118, 101, 105, 97, 112, 97, 118, 9, 4, 34, 38, 42, 44, 46, 7, 0, 8, 1, 28, 3, 15, 26, 7, 1, 0, 69, 88, 77, 64, 69, 79, 5, 8, 16, 6, 28, 29, 27, 18, 17, 3, 114, 119, 112, 123, 106, 118, 108, 113, 107, 121, 118, 120, 89, 81, 64, 85, 80, 85, 64, 85, 4, 26, 48, 40, 49, 41, 52, 15, 50, 42, 28, 49, 52, 58, 51, 125, 124, Byte.MAX_VALUE, 122, 125, 118, 103, 123, 97, 124, 102, 116, 123, 117, 116, 117, 126, 108, 109, 119, 108, 102, 103, 112, 110, 107, 108, 103, 7, 26, 1, 15, 1, 6, 28, 2, 10, 65, 86, 84, 90, 92, 93, 43, 48, 62, 49, 45, 71, 64, 87, 76, 85, 82, 69, 94, 119, 72, 84, 78, 83, 78, 72, 73, 22, 85, 78, 67, 71, 84, 101, 102, 119, 120, 42, 45, 56, 43, 45, 30, 25, 20, 1, 8, 93, 90, 87, 66, 71, 64, 73, 84, 82, 69, 97, 85, 70, 74, 66, 117, 70, 83, 66, 74, 91, 77, 121, 111, 97, Byte.MAX_VALUE, 42, 60, 44, 50, 67, 82, 79, 67, 48, 33, 60, 48, 5, 40, 45, 35, 42, 82, 67, 94, 82, 101, 73, 75, 68, 79, 72, 67, 71, 86, 75, 71, 112, 92, 93, 71, 82, 90, 93, 86, 65, 15, 30, 3, 15, 63, 30, 24, 20, 9, 26, 15, 18, 20, 21, 23, 6, 27, 23, 38, 14, 19, 11, 2, 16, 10, 16, 120, 101, 111, 103, 94, 109, 120, 105, 66, 66, 29, 6, 12, 13, 26, 4, 1, 6, 13, 67, 70, 93, 64, 93, 90, 83, 121, 91, 80, 81};
                        String[] strArr = A02;
                        if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A02;
                        strArr2[7] = "U7Ydty";
                        strArr2[4] = "i9OpsshPuIR8wYXgdP1INo5uv";
                        A01 = bArr;
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    @Override // com.facebook.ads.redexgen.X.C9H
                    public final InterfaceC1213Wv A0g(byte[] bArr, int i10, boolean z10) throws TP {
                        String A0A2 = A0A(0, 0, 83);
                        try {
                            XmlPullParser newPullParser = this.A00.newPullParser();
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            HashMap hashMap3 = new HashMap();
                            hashMap2.put(A0A2, new XZ(A0A2));
                            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
                            TD td = null;
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i11 = 0;
                            XW xw = A06;
                            XV xv = A05;
                            XX xx = null;
                            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                                XY xy = (XY) arrayDeque.peek();
                                if (i11 == 0) {
                                    String name = newPullParser.getName();
                                    String A0A3 = A0A(1761, 2, 16);
                                    if (eventType == 2) {
                                        if (A0A3.equals(name)) {
                                            xw = A04(newPullParser);
                                            xv = A03(newPullParser, A05);
                                            xx = A05(newPullParser);
                                        }
                                        boolean A0F = A0F(name);
                                        String A0A4 = A0A(892, 11, 120);
                                        if (!A0F) {
                                            AbstractC1633fb.A06(A0A4, A0A(531, 26, 56) + newPullParser.getName());
                                            i11++;
                                        } else if (A0A(1468, 4, 99).equals(name)) {
                                            A0B(newPullParser, hashMap, xv, xx, hashMap2, hashMap3);
                                        } else {
                                            try {
                                                XY A062 = A06(newPullParser, xy, hashMap2, xw);
                                                arrayDeque.push(A062);
                                                if (xy != null) {
                                                    xy.A0F(A062);
                                                }
                                            } catch (TP e8) {
                                                AbstractC1633fb.A0A(A0A4, A0A(868, 24, 76), e8);
                                                i11++;
                                            }
                                        }
                                    } else if (eventType == 4) {
                                        ((XY) AbstractC1589es.A01(xy)).A0F(XY.A01(newPullParser.getText()));
                                    } else if (A02[3].charAt(27) != 'k') {
                                        String[] strArr = A02;
                                        strArr[7] = "SD92fX";
                                        strArr[4] = "ozqaVBt0IZOaXUU7UIxPKisCf";
                                        if (eventType == 3) {
                                            if (newPullParser.getName().equals(A0A3)) {
                                                td = new TD((XY) AbstractC1589es.A01((XY) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                                            }
                                            arrayDeque.pop();
                                        }
                                    }
                                    newPullParser.next();
                                } else {
                                    if (eventType == 2) {
                                        i11++;
                                    } else {
                                        String[] strArr2 = A02;
                                        if (strArr2[7].length() != strArr2[4].length()) {
                                            String[] strArr3 = A02;
                                            strArr3[1] = "j7LpVLPfgU";
                                            strArr3[0] = "TeldLaMvv8";
                                            if (eventType == 3) {
                                                i11--;
                                            }
                                        }
                                    }
                                    newPullParser.next();
                                }
                                throw new RuntimeException();
                            }
                            if (td != null) {
                                return td;
                            }
                            throw new TP(A0A(845, 23, 4));
                        } catch (IOException e10) {
                            throw new IllegalStateException(A0A(926, 36, 127), e10);
                        } catch (XmlPullParserException e11) {
                            throw new TP(A0A(903, 23, 88), e11);
                        }
                    }

                    static {
                        A0C();
                        A08 = Pattern.compile(A0A(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, 85, 106));
                        A0A = Pattern.compile(A0A(com.ironsource.d9.f16966j, 37, 118));
                        A09 = Pattern.compile(A0A(965, 29, 116));
                        A04 = Pattern.compile(A0A(994, 20, 41));
                        A03 = Pattern.compile(A0A(1149, 29, 110));
                        A0B = Pattern.compile(A0A(1178, 31, 75));
                        A07 = Pattern.compile(A0A(1136, 13, 105));
                        A06 = new XW(30.0f, 1, 1);
                        A05 = new XV(32, 15);
                    }

                    {
                        A0A(892, 11, 120);
                        try {
                            this.A00 = XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (XmlPullParserException e8) {
                            throw new RuntimeException(A0A(6, 45, 48), e8);
                        }
                    }

                    public static float A00(String str2) {
                        Matcher matcher = A04.matcher(str2);
                        boolean matches = matcher.matches();
                        String A0A2 = A0A(892, 11, 120);
                        if (!matches) {
                            AbstractC1633fb.A07(A0A2, A0A(683, 25, 47) + str2);
                            return Float.MAX_VALUE;
                        }
                        try {
                            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC1589es.A01(matcher.group(1)))));
                        } catch (NumberFormatException e8) {
                            AbstractC1633fb.A0A(A0A2, A0A(143, 23, 109) + str2, e8);
                            return Float.MAX_VALUE;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    public static Layout.Alignment A02(String str2) {
                        char c11;
                        String A012 = AbstractC1756hb.A01(str2);
                        switch (A012.hashCode()) {
                            case -1364013995:
                                if (A012.equals(A0A(1299, 6, 68))) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 100571:
                                if (A012.equals(A0A(1352, 3, 42))) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3317767:
                                if (A012.equals(A0A(1537, 4, 81))) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 108511772:
                                if (A012.equals(A0A(1619, 5, 127))) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 109757538:
                                if (A012.equals(A0A(1650, 5, 127))) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                                return Layout.Alignment.ALIGN_NORMAL;
                            case 2:
                            case 3:
                                Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                String[] strArr = A02;
                                if (strArr[2].charAt(10) != strArr[6].charAt(10)) {
                                    A02[3] = "gEN5w1qCcbQvfcLdSJtX6vlIOg7nCrwF";
                                    return alignment;
                                }
                                throw new RuntimeException();
                            case 4:
                                return Layout.Alignment.ALIGN_CENTER;
                            default:
                                return null;
                        }
                    }

                    public static XW A04(XmlPullParser xmlPullParser) throws TP {
                        int i10 = 30;
                        String A0A2 = A0A(1399, 9, 114);
                        String frameRateMultiplierString = A0A(1472, 35, 34);
                        String attributeValue = xmlPullParser.getAttributeValue(frameRateMultiplierString, A0A2);
                        if (attributeValue != null) {
                            i10 = Integer.parseInt(attributeValue);
                        }
                        float f10 = 1.0f;
                        String attributeValue2 = xmlPullParser.getAttributeValue(frameRateMultiplierString, A0A(1408, 19, 89));
                        if (attributeValue2 != null) {
                            String[] parts = AbstractC1672gE.A1O(attributeValue2, A0A(0, 1, 45));
                            if (parts.length == 2) {
                                String str2 = parts[0];
                                String[] strArr = A02;
                                String frameRateString = strArr[7];
                                String str3 = strArr[4];
                                int length = frameRateString.length();
                                int frameRate = str3.length();
                                if (length == frameRate) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A02;
                                strArr2[7] = "siUsj8";
                                strArr2[4] = "oIe91khz6MrFpkSfZhK5pkWoX";
                                int frameRate2 = Integer.parseInt(str2);
                                float f11 = frameRate2;
                                int frameRate3 = Integer.parseInt(parts[1]);
                                f10 = f11 / frameRate3;
                            } else {
                                String frameRateString2 = A0A(1427, 40, 72);
                                throw new TP(frameRateString2);
                            }
                        }
                        int tickRate = A06.A01;
                        String attributeValue3 = xmlPullParser.getAttributeValue(frameRateMultiplierString, A0A(1667, 12, 1));
                        if (attributeValue3 != null) {
                            tickRate = Integer.parseInt(attributeValue3);
                        }
                        int i11 = A06.A02;
                        String attributeValue4 = xmlPullParser.getAttributeValue(frameRateMultiplierString, A0A(1753, 8, 42));
                        if (attributeValue4 != null) {
                            i11 = Integer.parseInt(attributeValue4);
                        }
                        return new XW(i10 * f10, tickRate, i11);
                    }

                    public static XX A05(XmlPullParser xmlPullParser) {
                        String A00 = AbstractC1678gK.A00(xmlPullParser, A0A(1355, 6, 126));
                        if (A00 == null) {
                            return null;
                        }
                        Matcher matcher = A0B.matcher(A00);
                        boolean matches = matcher.matches();
                        String A0A2 = A0A(892, 11, 120);
                        if (!matches) {
                            StringBuilder sb = new StringBuilder();
                            String ttsExtent = A0A(233, 31, 59);
                            AbstractC1633fb.A07(A0A2, sb.append(ttsExtent).append(A00).toString());
                            return null;
                        }
                        try {
                            String ttsExtent2 = matcher.group(1);
                            int parseInt = Integer.parseInt((String) AbstractC1589es.A01(ttsExtent2));
                            String ttsExtent3 = matcher.group(2);
                            return new XX(parseInt, Integer.parseInt((String) AbstractC1589es.A01(ttsExtent3)));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb2 = new StringBuilder();
                            String ttsExtent4 = A0A(j3.c.b.f17912c, 31, 74);
                            AbstractC1633fb.A07(A0A2, sb2.append(ttsExtent4).append(A00).toString());
                            return null;
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b7, code lost:
                        if (r0 != null) goto L35;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b9, code lost:
                        r9 = com.facebook.ads.redexgen.X.AbstractC1756hb.A01(r0);
                        r0 = r9.hashCode();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c1, code lost:
                        switch(r0) {
                            case -1364013995: goto L44;
                            case 92734940: goto L41;
                            default: goto L37;
                        };
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c4, code lost:
                        r0 = Float.NaN;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c5, code lost:
                        switch(r0) {
                            case 0: goto L40;
                            case 1: goto L39;
                            default: goto L47;
                        };
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c8, code lost:
                        r0 = r24.A01;
                        r24 = 1.0f / r0;
                        r25 = androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION;
                        r0 = com.facebook.ads.redexgen.X.AbstractC1678gK.A00(r23, A0A(1772, 11, 18));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e1, code lost:
                        if (r0 == null) goto L63;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e3, code lost:
                        r8 = com.facebook.ads.redexgen.X.AbstractC1756hb.A01(r0);
                        r0 = r8.hashCode();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:48:0x01eb, code lost:
                        switch(r0) {
                            case 3694: goto L60;
                            case 3553396: goto L57;
                            case 3553576: goto L55;
                            default: goto L51;
                        };
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ee, code lost:
                        r7 = 65535;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ef, code lost:
                        switch(r7) {
                            case 0: goto L54;
                            case 1: goto L54;
                            case 2: goto L53;
                            default: goto L63;
                        };
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f2, code lost:
                        r21 = r2;
                        r17 = r5;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:52:0x0203, code lost:
                        return new com.facebook.ads.redexgen.X.XZ(r16, r17, r4, 0, r20, r21, r3, 1, r24, r25);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x0204, code lost:
                        r25 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x0207, code lost:
                        r25 = 2;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:56:0x0217, code lost:
                        if (r8.equals(A0A(1686, 4, 120)) == false) goto L51;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:59:0x0227, code lost:
                        if (r8.equals(A0A(1682, 4, 43)) == false) goto L51;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:60:0x0229, code lost:
                        r7 = 1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:62:0x0238, code lost:
                        if (r8.equals(A0A(1680, 2, 9)) == false) goto L51;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:63:0x023a, code lost:
                        r7 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:64:0x023c, code lost:
                        r20 = 2;
                        r4 = r4 + r3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:65:0x0240, code lost:
                        r20 = 1;
                        r0 = r3 / 2.0f;
                        r4 = r4 + r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:67:0x0255, code lost:
                        if (r9.equals(A0A(com.ironsource.mediationsdk.utils.IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, 5, 91)) == false) goto L37;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:68:0x0257, code lost:
                        r0 = Float.MIN_VALUE;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:70:0x0267, code lost:
                        if (r9.equals(A0A(1299, 6, 68)) == false) goto L37;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:71:0x0269, code lost:
                        r0 = 0.0f;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:73:0x0284, code lost:
                        if (r0 != null) goto L35;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String[]] */
                    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r9v2 */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static com.facebook.ads.redexgen.X.XZ A07(org.xmlpull.v1.XmlPullParser r23, com.facebook.ads.redexgen.X.XV r24, com.facebook.ads.redexgen.X.XX r25) {
                        /*
                            Method dump skipped, instructions count: 826
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass14.A07(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.XV, com.facebook.ads.redexgen.X.XX):com.facebook.ads.redexgen.X.XZ");
                    }

                    public static C1223Xf A08(C1223Xf c1223Xf) {
                        return c1223Xf == null ? new C1223Xf() : c1223Xf;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:136:0x03fc, code lost:
                        if (r12.equals(A0A(1624, 4, 19)) != false) goto L171;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:137:0x03fe, code lost:
                        r13 = '\n';
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:139:0x0414, code lost:
                        if (r12.equals(A0A(1624, 4, 19)) != false) goto L171;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:200:0x002f, code lost:
                        continue;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
                        if (r7.equals(A0A(1593, 11, 36)) != false) goto L16;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c1, code lost:
                        if (r8.equals(r12) != false) goto L60;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static com.facebook.ads.redexgen.X.C1223Xf A09(org.xmlpull.v1.XmlPullParser r15, com.facebook.ads.redexgen.X.C1223Xf r16) {
                        /*
                            Method dump skipped, instructions count: 1366
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass14.A09(org.xmlpull.v1.XmlPullParser, com.facebook.ads.redexgen.X.Xf):com.facebook.ads.redexgen.X.Xf");
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
                        if (r9 != false) goto L24;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
                        r0 = 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
                        if (r9 != false) goto L24;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static void A0D(java.lang.String r9, com.facebook.ads.redexgen.X.C1223Xf r10) throws com.facebook.ads.redexgen.X.TP {
                        /*
                            Method dump skipped, instructions count: 404
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass14.A0D(java.lang.String, com.facebook.ads.redexgen.X.Xf):void");
                    }

                    public static void A0E(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
                        String encodedBitmapData;
                        do {
                            xmlPullParser.next();
                            if (AbstractC1678gK.A04(xmlPullParser, A0A(1509, 5, 109)) && (encodedBitmapData = AbstractC1678gK.A00(xmlPullParser, A0A(1507, 2, 70))) != null) {
                                String id = xmlPullParser.nextText();
                                map.put(encodedBitmapData, id);
                            }
                        } while (!AbstractC1678gK.A03(xmlPullParser, A0A(1553, 8, 18)));
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:38:0x013b, code lost:
                        if (r5.equals(A0A(1509, 5, 109)) == false) goto L38;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:40:0x0149, code lost:
                        if (r5.equals(A0A(1319, 4, 3)) != false) goto L49;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:41:0x014b, code lost:
                        r3 = r5.equals(A0A(1514, 11, 72));
                        r2 = com.facebook.ads.redexgen.X.AnonymousClass14.A02;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:42:0x016b, code lost:
                        if (r2[2].charAt(10) == r2[6].charAt(10)) goto L11;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x016d, code lost:
                        r2 = com.facebook.ads.redexgen.X.AnonymousClass14.A02;
                        r2[2] = "7O0IOsseQh6lkxvLI83590t9BAvjBS5v";
                        r2[6] = "FM0JqcQPZ7bZjX09PcPCkxkNHBWlt1ma";
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x0179, code lost:
                        if (r3 == false) goto L44;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x017d, code lost:
                        return false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x0189, code lost:
                        if (r5.equals(A0A(1509, 5, 109)) == false) goto L38;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static boolean A0F(java.lang.String r5) {
                        /*
                            Method dump skipped, instructions count: 402
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass14.A0F(java.lang.String):boolean");
                    }

                    public static String[] A0G(String str2) {
                        String trim = str2.trim();
                        return trim.isEmpty() ? new String[0] : AbstractC1672gE.A1O(trim, A0A(962, 3, 45));
                    }
                };
            case 4:
                return new C9H() { // from class: com.facebook.ads.redexgen.X.15
                    public static byte[] A02;
                    public static String[] A03 = {"r0lvJnOtFsJYK3x7gv5UYsJt", "VnF0k8U4ciJNxofgyTFSw3ccewRsZ47c", "fsuLcvRVsxZ2rTEanaVbOEJgUgKa", "QCGBAuDyIUZCTGV3FkvzsXKkZw9xaMeV", "OBeJQ0r261EMvG6aZEiLMqDObptxiaWl", "6bEtBbKNi7pz22WioFbPg3IQaruhrnje", "Qr6WKkyKIx3Is0W", "mwHS4icgD9kJKck1jhl6DgteGwyFGZ"};
                    public static final Pattern A04;
                    public static final Pattern A05;
                    public final StringBuilder A00;
                    public final ArrayList<String> A01;

                    public static String A03(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                        int i13 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            if (A03[6].length() != 15) {
                                throw new RuntimeException();
                            }
                            A03[0] = "zSIjhaz4vBPnq489uoCd6Qdj";
                            if (i13 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
                            i13++;
                        }
                    }

                    public static void A06() {
                        A02 = new byte[]{-73, -35, -19, -71, -75, -51, -53, -46, -46, -53, -48, -55, -126, -53, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -100, -126, 16, 40, 38, 45, 45, 38, 43, 36, -35, 38, 43, 51, 30, 41, 38, 33, -35, 49, 38, 42, 38, 43, 36, -9, -35, 16, 50, 31, 47, 38, 45, 1, 34, 32, 44, 33, 34, 47, -58, -33, -42, -23, -31, -42, -44, -27, -42, -43, -111, -42, -33, -43, 38, 61, -12, -14, -14, 9, 4, -14, 38, 46, -11, -13, 4, -13, 9, -14, 38, 46, -11, -13, 4, -14, 38, 46, -11, -13, -14, 9, 4, -10, -14, 38, 46, -11, -13, -13, 9, -13, 38, 61, -12, -9, -9, 8, 38, 61, -12, -14, -14, 9, 4, -14, 38, 46, -11, -13, 4, -13, 9, -14, 38, 46, -11, -13, 4, -14, 38, 46, -11, -13, -14, 9, 4, -10, -14, 38, 46, -11, -13, -13, 9, -13, 38, 61, -12, -50, -19, -50, -50, -96, -100, -79, -50, -17, -22, 9, -22, -22, -17, -4, -23, -65, -69, -57, -21, -22, 11, 32, 1, 6, 19, -42, 34, 33, 2, 7, 20, -40, 35, 43, 12, 17, 30, -29, 45, 75, 44, 49, 62, 4, 77, 72, 41, 46, 59, 2, 74, 43, 12, 17, 30, -26, 45, -17, -48, -43, -30, -85, -15, 39, 8, 13, 26, -28, 41, -8, -39, -34, -21, -74, -6};
                    }

                    static {
                        A06();
                        A05 = Pattern.compile(A03(80, 85, 114));
                        A04 = Pattern.compile(A03(165, 9, 26));
                    }

                    {
                        A03(53, 13, 101);
                        this.A00 = new StringBuilder();
                        this.A01 = new ArrayList<>();
                    }

                    public static float A00(int i10) {
                        switch (i10) {
                            case 0:
                                return 0.08f;
                            case 1:
                                return 0.5f;
                            case 2:
                                return 0.92f;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }

                    public static long A01(Matcher matcher, int i10) {
                        long j10;
                        String hours = matcher.group(i10 + 1);
                        if (hours != null) {
                            j10 = Long.parseLong(hours) * 60 * 60 * 1000;
                        } else {
                            j10 = 0;
                        }
                        long parseLong = j10 + (Long.parseLong((String) AbstractC1589es.A01(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) AbstractC1589es.A01(matcher.group(i10 + 3))) * 1000);
                        String hours2 = matcher.group(i10 + 4);
                        if (hours2 != null) {
                            parseLong += Long.parseLong(hours2);
                        }
                        return 1000 * parseLong;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    private C1053Qh A02(Spanned spanned, String str2) {
                        char c11;
                        char c12;
                        C1446cY A0G = new C1446cY().A0G(spanned);
                        if (str2 == null) {
                            return A0G.A0H();
                        }
                        int hashCode = str2.hashCode();
                        String A032 = A03(235, 6, 37);
                        String A033 = A03(229, 6, 84);
                        String A034 = A03(223, 6, 28);
                        String A035 = A03(217, 6, 88);
                        String A036 = A03(211, 6, 117);
                        String A037 = A03(j3.c.b.f17915f, 6, 120);
                        String A038 = A03(199, 6, 88);
                        String A039 = A03(193, 6, 78);
                        String A0310 = A03(187, 6, 77);
                        switch (hashCode) {
                            case -685620710:
                                if (str2.equals(A0310)) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620679:
                                if (str2.equals(A039)) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620648:
                                if (str2.equals(A038)) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620617:
                                if (str2.equals(A037)) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620586:
                                if (str2.equals(A036)) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620555:
                                if (str2.equals(A035)) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620524:
                                if (str2.equals(A034)) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620493:
                                if (str2.equals(A033)) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -685620462:
                                if (str2.equals(A032)) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                            case 2:
                                A0G.A0A(0);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                A0G.A0A(2);
                                break;
                            default:
                                A0G.A0A(1);
                                break;
                        }
                        switch (str2.hashCode()) {
                            case -685620710:
                                if (str2.equals(A0310)) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620679:
                                if (str2.equals(A039)) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620648:
                                if (str2.equals(A038)) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620617:
                                if (str2.equals(A037)) {
                                    c12 = 6;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620586:
                                if (str2.equals(A036)) {
                                    c12 = 7;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620555:
                                if (str2.equals(A035)) {
                                    c12 = '\b';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620524:
                                if (str2.equals(A034)) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620493:
                                if (str2.equals(A033)) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -685620462:
                                if (str2.equals(A032)) {
                                    c12 = 5;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                            case 1:
                            case 2:
                                A0G.A09(2);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                A0G.A09(0);
                                break;
                            default:
                                A0G.A09(1);
                                break;
                        }
                        return A0G.A04(A00(A0G.A01())).A07(A00(A0G.A00()), 0).A0H();
                    }

                    private String A04(String str2, ArrayList<String> arrayList) {
                        String trim = str2.trim();
                        int i10 = 0;
                        StringBuilder sb = new StringBuilder(trim);
                        Matcher matcher = A04.matcher(trim);
                        while (matcher.find()) {
                            String group = matcher.group();
                            arrayList.add(group);
                            int tagLength = matcher.start() - i10;
                            int start = group.length();
                            sb.replace(tagLength, tagLength + start, A03(0, 0, 81));
                            i10 += start;
                        }
                        return sb.toString();
                    }

                    private Charset A05(C1648fq c1648fq) {
                        Charset charset = c1648fq.A0Z();
                        return charset != null ? charset : AbstractC1758hd.A06;
                    }

                    @Override // com.facebook.ads.redexgen.X.C9H
                    public final InterfaceC1213Wv A0g(byte[] bArr, int i10, boolean z10) {
                        String A032 = A03(53, 13, 101);
                        ArrayList arrayList = new ArrayList();
                        C1634fc c1634fc = new C1634fc();
                        C1648fq c1648fq = new C1648fq(bArr, i10);
                        Charset A052 = A05(c1648fq);
                        while (true) {
                            String A0Y = c1648fq.A0Y(A052);
                            if (A0Y == null) {
                                break;
                            } else if (A0Y.length() != 0) {
                                try {
                                    Integer.parseInt(A0Y);
                                    String A0Y2 = c1648fq.A0Y(A052);
                                    if (A0Y2 == null) {
                                        AbstractC1633fb.A07(A032, A03(66, 14, 25));
                                        break;
                                    }
                                    Matcher matcher = A05.matcher(A0Y2);
                                    if (matcher.matches()) {
                                        c1634fc.A04(A01(matcher, 1));
                                        c1634fc.A04(A01(matcher, 6));
                                        this.A00.setLength(0);
                                        this.A01.clear();
                                        for (String A0Y3 = c1648fq.A0Y(A052); !TextUtils.isEmpty(A0Y3); A0Y3 = c1648fq.A0Y(A052)) {
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A03(0, 4, 35));
                                            }
                                            this.A00.append(A04(A0Y3, this.A01));
                                        }
                                        Spanned fromHtml = Html.fromHtml(this.A00.toString());
                                        String tag = null;
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= this.A01.size()) {
                                                break;
                                            }
                                            String alignmentTag = this.A01.get(i11);
                                            if (alignmentTag.matches(A03(174, 13, 54))) {
                                                tag = alignmentTag;
                                                break;
                                            }
                                            i11++;
                                        }
                                        arrayList.add(A02(fromHtml, tag));
                                        arrayList.add(C1053Qh.A0J);
                                    } else {
                                        AbstractC1633fb.A07(A032, A03(28, 25, 101) + A0Y2);
                                    }
                                } catch (NumberFormatException unused) {
                                    AbstractC1633fb.A07(A032, A03(4, 24, 10) + A0Y);
                                }
                            }
                        }
                        return new TE((C1053Qh[]) arrayList.toArray(new C1053Qh[0]), c1634fc.A05());
                    }
                };
            case 5:
                final List<byte[]> list = zm.A0X;
                return new C9H(list) { // from class: com.facebook.ads.redexgen.X.13
                    public static byte[] A07;
                    public static String[] A08 = {"4nF1dTtIX3QnzMxvvIR5aopWZNFG9yDN", "Y8RTti4nXUK0nEdE8bWaci3m0qNna248", "58YTL7XhNvjiCRHekJO1CYmqJdxHYEXu", "gDEv", "6rRwIeqgl0WcUS7bB4hYCkyvDII6nojb", "MyrFlppseoEGeBwaNCUBXPAkDL1HGVTr", "speOLcH8eSHVdHbPwc4PeGY", "3EYION9j3S6IQWmDu"};
                    public final float A00;
                    public final int A01;
                    public final int A02;
                    public final int A03;
                    public final C1648fq A04;
                    public final String A05;
                    public final boolean A06;

                    public static String A00(int i10, int i11, int i12) {
                        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
                        int i13 = 0;
                        while (true) {
                            int length = copyOfRange.length;
                            if (A08[0].charAt(11) != 'n') {
                                throw new RuntimeException();
                            }
                            A08[1] = "cVVetBd2EeYS1iwNAfZ2T43nKXQx9HbA";
                            if (i13 >= length) {
                                return new String(copyOfRange);
                            }
                            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 93);
                            i13++;
                        }
                    }

                    public static void A02() {
                        A07 = new byte[]{-44, -53, -23, -24, -53, 16, 25, 15, -53, -45, -2, -11, 73, 68, -11, 56, 74, 58, 41, 58, 77, 73, 3, 65, 58, 67, 60, 73, 61, -3, -2, -11, -3, -82, -77, 37, 67, 74, 75, 78, 69, 74, 67, -4, 79, 80, 85, 72, -4, 83, 69, 80, 68, -4, 79, 80, 61, 78, 80, -4, 4, 30, 48, 61, 52, 49, 0, 30, 33, 26, 15, 13, 32, 21, 26, 19, -52, 31, 32, 37, 24, -52, 17, 26, 16, -52, -44, 1, 37, -32, 20, -15, 18, 16, 28, 17, 18, 31, -58, -33, -42, -23, -31, -42, -44, -27, -42, -43, -111, -28, -26, -45, -27, -38, -27, -35, -42, -111, -41, -32, -29, -34, -46, -27, -97, 54, 36, 49, 54, -16, 54, 40, 53, 44, 41, 39, 25, 38, 29, 26};
                    }

                    static {
                        A02();
                    }

                    {
                        super(A00(87, 11, 80));
                        this.A04 = new C1648fq();
                        int size = list.size();
                        String A00 = A00(125, 10, 102);
                        if (size == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
                            byte[] bArr = list.get(0);
                            this.A03 = bArr[24];
                            this.A02 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                            this.A05 = A00(61, 5, 110).equals(AbstractC1672gE.A0r(bArr, 43, bArr.length - 43)) ? A00(135, 5, 87) : A00;
                            this.A01 = bArr[25] * 20;
                            this.A06 = (bArr[0] & 32) != 0;
                            if (this.A06) {
                                int requestedVerticalPlacement = ((bArr[10] & 255) << 8) | (bArr[11] & 255);
                                this.A00 = AbstractC1672gE.A00(requestedVerticalPlacement / this.A01, 0.0f, 0.95f);
                                return;
                            }
                            this.A00 = 0.85f;
                            return;
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A05 = A00;
                        this.A06 = false;
                        this.A00 = 0.85f;
                        this.A01 = -1;
                    }

                    public static String A01(C1648fq c1648fq) throws TP {
                        A07(c1648fq.A07() >= 2);
                        int bomSize = c1648fq.A0M();
                        if (bomSize == 0) {
                            return A00(0, 0, 52);
                        }
                        int A09 = c1648fq.A09();
                        Charset A0Z = c1648fq.A0Z();
                        int textLength = c1648fq.A09();
                        int bomSize2 = bomSize - (textLength - A09);
                        if (A0Z == null) {
                            A0Z = AbstractC1758hd.A06;
                        }
                        return c1648fq.A0X(bomSize2, A0Z);
                    }

                    public static void A03(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
                        if (i10 != i11) {
                            int colorArgb = i14 | 33;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i10 & 255) << 24) | (i10 >>> 8)), i12, i13, colorArgb);
                        }
                    }

                    public static void A04(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
                        if (i10 != i11) {
                            int i15 = i14 | 33;
                            int flags = i10 & 1;
                            boolean z10 = flags != 0;
                            int flags2 = i10 & 2;
                            boolean z11 = flags2 != 0;
                            if (z10) {
                                if (z11) {
                                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                                } else {
                                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                                }
                            } else if (z11) {
                                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
                            }
                            int flags3 = i10 & 4;
                            boolean z12 = flags3 != 0;
                            if (z12) {
                                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
                            }
                            if (!z12 && !z10 && !z11) {
                                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
                            }
                        }
                    }

                    public static void A05(SpannableStringBuilder spannableStringBuilder, String str2, int i10, int i11) {
                        if (str2 != A00(125, 10, 102)) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(str2), i10, i11, 16711713);
                        }
                    }

                    private void A06(C1648fq c1648fq, SpannableStringBuilder spannableStringBuilder) throws TP {
                        A07(c1648fq.A07() >= 12);
                        int fontFace = c1648fq.A0M();
                        int A0M = c1648fq.A0M();
                        c1648fq.A0g(2);
                        int A0I = c1648fq.A0I();
                        c1648fq.A0g(1);
                        int A0C = c1648fq.A0C();
                        int length = spannableStringBuilder.length();
                        String A00 = A00(33, 2, 40);
                        String A002 = A00(87, 11, 80);
                        if (A0M > length) {
                            StringBuilder append = new StringBuilder().append(A00(66, 21, 79)).append(A0M).append(A00(10, 23, 120));
                            int start = spannableStringBuilder.length();
                            AbstractC1633fb.A07(A002, append.append(start).append(A00).toString());
                            A0M = spannableStringBuilder.length();
                        }
                        if (fontFace < A0M) {
                            A04(spannableStringBuilder, A0I, this.A03, fontFace, A0M, 0);
                            A03(spannableStringBuilder, A0C, this.A02, fontFace, A0M, 0);
                            return;
                        }
                        AbstractC1633fb.A07(A002, A00(35, 26, 127) + fontFace + A00(0, 10, 78) + A0M + A00);
                    }

                    public static void A07(boolean z10) throws TP {
                        if (z10) {
                            return;
                        }
                        throw new TP(A00(98, 27, 20));
                    }

                    @Override // com.facebook.ads.redexgen.X.C9H
                    public final InterfaceC1213Wv A0g(byte[] bArr, int i10, boolean z10) throws TP {
                        this.A04.A0j(bArr, i10);
                        String A012 = A01(this.A04);
                        if (A012.isEmpty()) {
                            return TC.A01;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A012);
                        A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                        A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                        A05(spannableStringBuilder, this.A05, 0, spannableStringBuilder.length());
                        float f10 = this.A00;
                        while (this.A04.A07() >= 8) {
                            int A09 = this.A04.A09();
                            int A0C = this.A04.A0C();
                            int atomType = this.A04.A0C();
                            if (atomType == 1937013100) {
                                A07(this.A04.A07() >= 2);
                                int styleRecordCount = this.A04.A0M();
                                for (int atomType2 = 0; atomType2 < styleRecordCount; atomType2++) {
                                    A06(this.A04, spannableStringBuilder);
                                    if (A08[1].charAt(4) != 't') {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr = A08;
                                    strArr[7] = "p15WFq1xDBvfKK082";
                                    strArr[3] = "oZwp";
                                }
                                continue;
                            } else if (atomType == 1952608120 && this.A06) {
                                A07(this.A04.A07() >= 2);
                                float verticalPlacement = this.A04.A0M();
                                f10 = AbstractC1672gE.A00(verticalPlacement / this.A01, 0.0f, 0.95f);
                            }
                            this.A04.A0f(A09 + A0C);
                        }
                        return new TC(new C1446cY().A0G(spannableStringBuilder).A07(f10, 0).A09(0).A0H());
                    }
                };
            case 6:
            case 7:
                return new C1C(zm.A0W, zm.A03, -9223372036854775807L);
            case '\b':
                final int i10 = zm.A03;
                return new AbstractC06198p(i10, null) { // from class: com.facebook.ads.redexgen.X.1B
                    public static byte[] A0B;
                    public static String[] A0C = {"iVN3kqMWcyIx32t5TufqHa9BwnjjEP2N", "mRbbDhwaLbunbvjBvCoPW7zbBrAMtsiZ", "ar", "fhrC5Btj", "AyrLDH9l", "qpwCcVFHAiXy08jirliygoElzq0IG0LD", "S0dfHaeJvAb6qU9cu1VcjWW6d9AcZSIO", "t0n6bP7MeBJNg85UHRyj2DOEehvUrVrC"};
                    public int A00;
                    public X1 A02;
                    public X2 A03;
                    public List<C1053Qh> A04;
                    public List<C1053Qh> A05;
                    public final int A06;
                    public final boolean A09;
                    public final X1[] A0A;
                    public final C1648fq A08 = new C1648fq();
                    public final C1647fp A07 = new C1647fp();
                    public int A01 = -1;

                    public static String A00(int i11, int i12, int i13) {
                        byte[] copyOfRange = Arrays.copyOfRange(A0B, i11, i11 + i12);
                        for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                            copyOfRange[i14] = (byte) ((copyOfRange[i14] - i13) - 18);
                        }
                        return new String(copyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A03() {
                        this.A02.A0C(this.A07.A04(4), this.A07.A04(2), this.A07.A04(2), this.A07.A0H(), this.A07.A0H(), this.A07.A04(3), this.A07.A04(3));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A04() {
                        int A012 = X1.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int A013 = X1.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        this.A07.A09(2);
                        this.A02.A0B(A012, A013, X1.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A06() {
                        int A012 = X1.A01(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        int A04 = this.A07.A04(2);
                        int A00 = X1.A00(this.A07.A04(2), this.A07.A04(2), this.A07.A04(2));
                        if (this.A07.A0H()) {
                            A04 |= 4;
                        }
                        boolean A0H = this.A07.A0H();
                        int A042 = this.A07.A04(2);
                        int A043 = this.A07.A04(2);
                        int A044 = this.A07.A04(2);
                        this.A07.A09(8);
                        this.A02.A0D(A012, A00, A0H, A04, A042, A043, A044);
                    }

                    public static void A09() {
                        A0B = new byte[]{64, 72, -109, -123, -111, -107, -123, -114, -125, -123, 64, -114, -107, -115, -126, -123, -110, 64, -105, -38, -20, -23, -23, -36, -27, -21, -76, 89, 80, -89, -104, -107, -98, 80, -110, -100, -97, -109, -101, -125, -103, -86, -107, 80, -103, -93, 80, 96, -84, -66, 126, 114, -76, -57, -58, 114, -75, -57, -60, -60, -73, -64, -58, 114, -69, -64, -74, -73, -54, 114, -69, -59, 114, 89, 123, 119, 77, 70, 78, 90, 123, 121, -123, 122, 123, -120, 123, -83, -86, -86, -99, -90, -84, -92, -79, 88, -83, -90, -85, -83, -88, -88, -89, -86, -84, -99, -100, 88, 123, -121, -123, -123, 121, -122, 124, -105, 125, -112, -116, 105, 88, 123, -89, -91, -91, -103, -90, -100, 114, 88, -63, -13, -16, -16, -29, -20, -14, -22, -9, -98, -13, -20, -15, -13, -18, -18, -19, -16, -14, -29, -30, -98, -63, -51, -53, -53, -65, -52, -62, -35, -50, -81, -76, -98, -63, -19, -21, -21, -33, -20, -30, -72, -98, 94, -114, -112, 93, 125, 106, 123, 125, -123, Byte.MAX_VALUE, -114, 58, Byte.MAX_VALUE, -120, 126, Byte.MAX_VALUE, 126, 58, -118, -116, Byte.MAX_VALUE, -121, 123, -114, -113, -116, Byte.MAX_VALUE, -122, -109, 85, 58, -115, -125, -108, Byte.MAX_VALUE, 58, -125, -115, 58, -112, -71, -82, -70, -64, -71, -65, -80, -67, -80, -81, 107, -113, -97, -95, -114, -114, -86, -101, -116, -114, -106, -112, -97, -86, -113, -116, -97, -116, 107, -83, -80, -79, -70, -67, -80, 107, -113, -97, -95, -114, -114, -86, -101, -116, -114, -106, -112, -97, -86, -98, -97, -116, -99, -97, 93, -126, -118, 117, Byte.MIN_VALUE, 125, 120, 52, 87, 68, 52, 119, -125, -127, -127, 117, -126, 120, 78, 52, -102, -65, -57, -78, -67, -70, -75, 113, -108, -126, 113, -76, -64, -66, -66, -78, -65, -75, -117, 113, -38, -1, 7, -14, -3, -6, -11, -79, -40, -61, -79, -12, -7, -14, 3, -14, -12, 5, -10, 3, -53, -79, -71, -34, -26, -47, -36, -39, -44, -112, -73, -93, -112, -45, -40, -47, -30, -47, -45, -28, -43, -30, -86, -112, -100, -63, -55, -76, -65, -68, -73, 115, -75, -76, -58, -72, 115, -74, -62, -64, -64, -76, -63, -73, -115, 115, -61, -24, -16, -37, -26, -29, -34, -102, -33, -14, -18, -33, -24, -34, -33, -34, -102, -35, -23, -25, -25, -37, -24, -34, -76, -102, -93, -56, -48, -69, -58, -61, -66, 122, -65, -46, -50, -65, -56, -66, -65, -66, 122, -51, -65, -52, -48, -61, -67, -65, 122, -56, -49, -57, -68, -65, -52, -108, 122, -126, -108, -96, -92, -108, -99, -110, -108, 79, -99, -92, -100, -111, -108, -95, 79, -109, -104, -94, -110, -98, -99, -93, -104, -99, -92, -104, -93, -88, 93, 79, -97, -95, -108, -91, -104, -98, -92, -94, 108, -108, -122, -109, -105, -118, -124, -122, 111, -106, -114, -125, -122, -109, 65, -118, -108, 65, -113, -112, -113, 78, -101, -122, -109, -112, 65, 73};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A0E(int i11) {
                        X1 x12 = this.A0A[i11];
                        this.A07.A09(2);
                        boolean A0H = this.A07.A0H();
                        boolean A0H2 = this.A07.A0H();
                        boolean A0H3 = this.A07.A0H();
                        int A04 = this.A07.A04(3);
                        boolean A0H4 = this.A07.A0H();
                        int A042 = this.A07.A04(7);
                        int A043 = this.A07.A04(8);
                        int A044 = this.A07.A04(4);
                        int A045 = this.A07.A04(4);
                        this.A07.A09(2);
                        int A046 = this.A07.A04(6);
                        this.A07.A09(2);
                        x12.A0F(A0H, A0H2, A0H3, A04, A0H4, A042, A043, A045, A046, A044, this.A07.A04(3), this.A07.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        boolean z10 = true;
                        this.A06 = i10 == -1 ? 1 : i10;
                        this.A09 = (initializationData == null || !AbstractC1597f0.A06(initializationData)) ? false : false;
                        this.A0A = new X1[8];
                        for (int i11 = 0; i11 < 8; i11++) {
                            this.A0A[i11] = new X1();
                        }
                        this.A02 = this.A0A[0];
                    }

                    private List<C1053Qh> A01() {
                        Comparator comparator;
                        X0 A05;
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < 8; i11++) {
                            if (!this.A0A[i11].A0H() && this.A0A[i11].A0I() && (A05 = this.A0A[i11].A05()) != null) {
                                arrayList.add(A05);
                            }
                        }
                        comparator = X0.A02;
                        Collections.sort(arrayList, comparator);
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            arrayList2.add(((X0) arrayList.get(i12)).A01);
                        }
                        List<C1053Qh> unmodifiableList = Collections.unmodifiableList(arrayList2);
                        if (A0C[1].charAt(9) != 'b') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0C;
                        strArr[0] = "7BYlcvv0ertnjGSqFgy904DZ6XNs0JyK";
                        strArr[7] = "gkJllchrribjSTyO5Hrumu1AIAUAJpgo";
                        return unmodifiableList;
                    }

                    private void A02() {
                        if (this.A03 == null) {
                            return;
                        }
                        A07();
                        this.A03 = null;
                    }

                    private void A05() {
                        this.A07.A09(4);
                        int A04 = this.A07.A04(4);
                        this.A07.A09(2);
                        int column = this.A07.A04(6);
                        this.A02.A0A(A04, column);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:64:0x0199 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:73:0x015f A[SYNTHETIC] */
                    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"currentDtvCcPacket"})
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A07() {
                        /*
                            Method dump skipped, instructions count: 489
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1B.A07():void");
                    }

                    private void A08() {
                        for (int i11 = 0; i11 < 8; i11++) {
                            this.A0A[i11].A08();
                        }
                    }

                    private void A0A(int i11) {
                        switch (i11) {
                            case 0:
                            case 14:
                                return;
                            case 3:
                                this.A04 = A01();
                                return;
                            case 8:
                                this.A02.A06();
                                return;
                            case 12:
                                A08();
                                return;
                            case 13:
                                this.A02.A09('\n');
                                return;
                            default:
                                String A00 = A00(73, 13, 4);
                                if (i11 >= 17 && i11 <= 23) {
                                    AbstractC1633fb.A07(A00, A00(86, 44, 38) + i11);
                                    this.A07.A09(8);
                                    return;
                                }
                                if (A0C[1].charAt(9) == 'b') {
                                    String[] strArr = A0C;
                                    strArr[0] = "g9DyyDnNJd4LgnUwc0ZdizjQUZVeC3Bm";
                                    strArr[7] = "Xx8OfFNjRzXZgQQFbRADCkePMeeunK0f";
                                    if (i11 >= 24) {
                                        if (A0C[2].length() == 2) {
                                            String[] strArr2 = A0C;
                                            strArr2[6] = "ERsIJeA8OLio6gb05uvF41rqbNR5J5gR";
                                            strArr2[5] = "7cjpKb6XqD9Rd6vVaORkQkLiwwxC5YVu";
                                            if (i11 <= 31) {
                                                AbstractC1633fb.A07(A00, A00(130, 43, 108) + i11);
                                                this.A07.A09(16);
                                                return;
                                            }
                                        }
                                    }
                                    AbstractC1633fb.A07(A00, A00(267, 20, 2) + i11);
                                    return;
                                }
                                throw new RuntimeException();
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A0B(int r9) {
                        /*
                            Method dump skipped, instructions count: 580
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1B.A0B(int):void");
                    }

                    private void A0C(int i11) {
                        if (i11 <= 7) {
                            return;
                        }
                        if (i11 <= 15) {
                            this.A07.A09(8);
                        } else if (i11 <= 23) {
                            this.A07.A09(16);
                        } else if (i11 > 31) {
                        } else {
                            this.A07.A09(24);
                        }
                    }

                    private void A0D(int i11) {
                        if (i11 <= 135) {
                            this.A07.A09(32);
                        } else if (i11 <= 143) {
                            this.A07.A09(40);
                        } else if (i11 > 159) {
                        } else {
                            this.A07.A09(2);
                            int length = this.A07.A04(6);
                            this.A07.A09(length * 8);
                        }
                    }

                    private void A0F(int i11) {
                        if (i11 == 127) {
                            this.A02.A09((char) 9835);
                            return;
                        }
                        X1 x12 = this.A02;
                        int i12 = i11 & 255;
                        if (A0C[2].length() != 2) {
                            throw new RuntimeException();
                        }
                        A0C[2] = "3T";
                        x12.A09((char) i12);
                    }

                    private void A0G(int i11) {
                        this.A02.A09((char) (i11 & 255));
                    }

                    private void A0H(int i11) {
                        switch (i11) {
                            case 32:
                                this.A02.A09(' ');
                                return;
                            case 33:
                                this.A02.A09((char) 160);
                                return;
                            case 37:
                                this.A02.A09((char) 8230);
                                return;
                            case 42:
                                this.A02.A09((char) 352);
                                return;
                            case 44:
                                this.A02.A09((char) 338);
                                return;
                            case 48:
                                this.A02.A09((char) 9608);
                                return;
                            case 49:
                                this.A02.A09((char) 8216);
                                return;
                            case 50:
                                this.A02.A09((char) 8217);
                                return;
                            case 51:
                                this.A02.A09((char) 8220);
                                return;
                            case 52:
                                this.A02.A09((char) 8221);
                                return;
                            case 53:
                                this.A02.A09((char) 8226);
                                return;
                            case 57:
                                this.A02.A09((char) 8482);
                                return;
                            case 58:
                                this.A02.A09((char) 353);
                                return;
                            case 60:
                                this.A02.A09((char) 339);
                                return;
                            case 61:
                                this.A02.A09((char) 8480);
                                return;
                            case 63:
                                this.A02.A09((char) 376);
                                return;
                            case 118:
                                this.A02.A09((char) 8539);
                                return;
                            case 119:
                                this.A02.A09((char) 8540);
                                return;
                            case 120:
                                this.A02.A09((char) 8541);
                                return;
                            case 121:
                                this.A02.A09((char) 8542);
                                return;
                            case 122:
                                this.A02.A09((char) 9474);
                                return;
                            case 123:
                                this.A02.A09((char) 9488);
                                return;
                            case 124:
                                this.A02.A09((char) 9492);
                                return;
                            case 125:
                                this.A02.A09((char) 9472);
                                return;
                            case 126:
                                this.A02.A09((char) 9496);
                                return;
                            case 127:
                                this.A02.A09((char) 9484);
                                return;
                            default:
                                AbstractC1633fb.A07(A00(73, 13, 4), A00(307, 22, 127) + i11);
                                return;
                        }
                    }

                    private void A0I(int i11) {
                        if (i11 == 160) {
                            this.A02.A09((char) 13252);
                            return;
                        }
                        AbstractC1633fb.A07(A00(73, 13, 4), A00(329, 22, 94) + i11);
                        this.A02.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p
                    public final /* bridge */ /* synthetic */ C06228s A0W() throws TP {
                        return super.A5h();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p
                    public final /* bridge */ /* synthetic */ AbstractC06208q A0X() throws TP {
                        return super.A5j();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p
                    public final TI A0Z() {
                        this.A05 = this.A04;
                        return new TI((List) AbstractC1589es.A01(this.A04));
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p
                    public final /* bridge */ /* synthetic */ void A0a(C06228s c06228s) throws TP {
                        super.AGR(c06228s);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p
                    public final void A0b(C06228s c06228s) {
                        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1589es.A01(c06228s.A02);
                        this.A08.A0j(byteBuffer.array(), byteBuffer.limit());
                        while (this.A08.A07() >= 3) {
                            int A0I = this.A08.A0I() & 7;
                            int ccType = A0I & 3;
                            boolean z10 = (A0I & 4) == 4;
                            C1648fq c1648fq = this.A08;
                            String[] strArr = A0C;
                            if (strArr[6].charAt(30) == strArr[5].charAt(30)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0C;
                            strArr2[0] = "5raryeRP2BxsiNz4MSWHgBkL5LcMTceh";
                            strArr2[7] = "jGzTymZTrs8OIXqdG79RlKBveyGnP2Kn";
                            byte A0I2 = (byte) c1648fq.A0I();
                            byte A0I3 = (byte) this.A08.A0I();
                            if (ccType == 2 || ccType == 3) {
                                if (z10) {
                                    String A00 = A00(73, 13, 4);
                                    if (ccType == 3) {
                                        A02();
                                        int packetSize = (A0I2 & 192) >> 6;
                                        if (this.A01 != -1 && packetSize != (this.A01 + 1) % 4) {
                                            A08();
                                            AbstractC1633fb.A07(A00, A00(432, 40, 29) + this.A01 + A00(18, 9, 101) + packetSize);
                                        }
                                        this.A01 = packetSize;
                                        int i11 = A0I2 & 63;
                                        if (i11 == 0) {
                                            i11 = 64;
                                        }
                                        this.A03 = new X2(packetSize, i11);
                                        byte[] bArr = this.A03.A03;
                                        X2 x22 = this.A03;
                                        int i12 = x22.A00;
                                        x22.A00 = i12 + 1;
                                        bArr[i12] = A0I3;
                                    } else {
                                        AbstractC1589es.A07(ccType == 2);
                                        if (this.A03 == null) {
                                            AbstractC1633fb.A05(A00, A00(212, 55, 57));
                                        } else {
                                            byte[] bArr2 = this.A03.A03;
                                            X2 x23 = this.A03;
                                            int i13 = x23.A00;
                                            x23.A00 = i13 + 1;
                                            bArr2[i13] = A0I2;
                                            byte[] bArr3 = this.A03.A03;
                                            X2 x24 = this.A03;
                                            int i14 = x24.A00;
                                            x24.A00 = i14 + 1;
                                            bArr3[i14] = A0I3;
                                        }
                                    }
                                    if (this.A03.A00 == (this.A03.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p
                    public final boolean A0d() {
                        return this.A04 != this.A05;
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p, com.facebook.ads.redexgen.X.InterfaceC1108Sl
                    public final /* bridge */ /* synthetic */ void AGj() {
                        super.AGj();
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p, com.facebook.ads.redexgen.X.TQ
                    public final /* bridge */ /* synthetic */ void AIn(long j10) {
                        super.AIn(j10);
                    }

                    @Override // com.facebook.ads.redexgen.X.AbstractC06198p, com.facebook.ads.redexgen.X.InterfaceC1108Sl
                    public final void flush() {
                        super.flush();
                        this.A04 = null;
                        this.A05 = null;
                        this.A00 = 0;
                        this.A02 = this.A0A[this.A00];
                        A08();
                        this.A03 = null;
                    }
                };
            case '\t':
                final List<byte[]> list2 = zm.A0X;
                return new C9H(list2) { // from class: com.facebook.ads.redexgen.X.18
                    public static byte[] A01;
                    public final XE A00;

                    static {
                        A01();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    {
                        super(A00(0, 10, 86));
                        C1648fq c1648fq = new C1648fq(list2.get(0));
                        this.A00 = new XE(c1648fq.A0M(), c1648fq.A0M());
                    }

                    public static String A00(int i11, int i12, int i13) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i11, i11 + i12);
                        for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                            copyOfRange[i14] = (byte) ((copyOfRange[i14] ^ i13) ^ 11);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{25, 43, 63, 25, 56, 62, 50, 57, 56, 47};
                    }

                    @Override // com.facebook.ads.redexgen.X.C9H
                    public final InterfaceC1213Wv A0g(byte[] bArr, int i11, boolean z10) {
                        if (z10) {
                            this.A00.A0J();
                        }
                        return new TH(this.A00.A0I(bArr, i11));
                    }
                };
            case '\n':
                return new C9H() { // from class: com.facebook.ads.redexgen.X.17
                    public static byte[] A04;
                    public static String[] A05 = {"2xXW3T1XOjHQMlgy7N1U1rbXs5lnvGNX", "YFiSwYnHVL0vdi7Co4DtRHBtWSOtG", "NU5l", "OZTlSwSPbqme9mmkwE5YWBOGyB", "KtgAeAKgTJHgfJK4atPcJXr9TYzGENm6", "unO7gCHcQb3GvOk3iZQ274JLn6KdNSiD", "viAmB19OZjoDLpUnvBYb", "IP5KxX518fDu5LW5fhKD"};
                    public Inflater A00;
                    public final XH A01;
                    public final C1648fq A02;
                    public final C1648fq A03;

                    public static String A01(int i11, int i12, int i13) {
                        byte[] copyOfRange = Arrays.copyOfRange(A04, i11, i11 + i12);
                        for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                            byte b10 = (byte) ((copyOfRange[i14] ^ i13) ^ 125);
                            if (A05[3].length() == 29) {
                                throw new RuntimeException();
                            }
                            A05[3] = "AZ2Q9JrgDs";
                            copyOfRange[i14] = b10;
                        }
                        return new String(copyOfRange);
                    }

                    public static void A02() {
                        A04 = new byte[]{105, 94, 74, 125, 92, 90, 86, 93, 92, 75};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 68);
                        this.A02 = new C1648fq();
                        this.A03 = new C1648fq();
                        this.A01 = new XH();
                    }

                    public static C1053Qh A00(C1648fq c1648fq, XH xh) {
                        int limit = c1648fq.A0A();
                        int A0I = c1648fq.A0I();
                        int A0M = c1648fq.A0M();
                        int nextSectionPosition = c1648fq.A09() + A0M;
                        if (nextSectionPosition > limit) {
                            c1648fq.A0f(limit);
                            return null;
                        }
                        C1053Qh c1053Qh = null;
                        String[] strArr = A05;
                        String str2 = strArr[2];
                        String str3 = strArr[1];
                        int sectionType = str2.length();
                        if (sectionType != str3.length()) {
                            String[] strArr2 = A05;
                            strArr2[2] = "chK2";
                            strArr2[1] = "EdFMrvqzgo1IWKAcfpYmJVd0PiP8z";
                            switch (A0I) {
                                case 20:
                                    xh.A05(c1648fq, A0M);
                                    break;
                                case 21:
                                    xh.A03(c1648fq, A0M);
                                    break;
                                case 22:
                                    xh.A04(c1648fq, A0M);
                                    break;
                                case 128:
                                    c1053Qh = xh.A06();
                                    xh.A07();
                                    break;
                            }
                            c1648fq.A0f(nextSectionPosition);
                            return c1053Qh;
                        }
                        throw new RuntimeException();
                    }

                    private void A03(C1648fq c1648fq) {
                        if (c1648fq.A07() > 0 && c1648fq.A0B() == 120) {
                            if (this.A00 == null) {
                                this.A00 = new Inflater();
                            }
                            if (AbstractC1672gE.A1D(c1648fq, this.A03, this.A00)) {
                                c1648fq.A0j(this.A03.A0l(), this.A03.A0A());
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.X.C9H
                    public final InterfaceC1213Wv A0g(byte[] bArr, int i11, boolean z10) throws TP {
                        this.A02.A0j(bArr, i11);
                        A03(this.A02);
                        this.A01.A07();
                        ArrayList arrayList = new ArrayList();
                        while (this.A02.A07() >= 3) {
                            C1053Qh A00 = A00(this.A02, this.A01);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                        return new TG(Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new IllegalArgumentException(A00(0, 50, 76));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1453cf
    public final boolean AJS(ZM zm) {
        String str = zm.A0W;
        String mimeType = A00(236, 8, 90);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 76);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(122, 20, 45);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(167, 21, 117);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(216, 20, 28);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(188, 28, 120);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 7);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(142, 25, 55);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 24);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 69);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 81);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
