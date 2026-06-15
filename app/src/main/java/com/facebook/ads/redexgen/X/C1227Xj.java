package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.facebook.ads.redexgen.X.Xj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1227Xj {
    public static byte[] A02;
    public static String[] A03 = {"dsJKxIPhnLL7tG5hphgnPR", "eYxaWiKxC1CpChZOhzGkUxq9HbI", "EkV5JnJXgKAhVW", "rMdsGuayVsLOHtT1X951xYEiF4NjxlSm", "b3c6BNhNC8skmEOaobvPBja1Cg7mRvkm", "t9SsVCc3B2JevdCYf2IfVWE2tTpzDIp", "D3mMXSL3tlVqwsXw8Pm", "mCEguhOof6xxi"};
    public static final Pattern A04;
    public static final Pattern A05;
    public final C1648fq A00 = new C1648fq();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{-116, -114, -107, -118, -60, -19, -41, -41, 0, 18, 2, -26, -15, 22, 30, 9, 20, 17, 12, -56, 14, 23, 22, 28, -43, 27, 17, 34, 13, -30, -56, -49, 52, 66, 63, 83, 81, 81, 32, 80, 80, 45, 62, 79, 80, 66, 79, -44, -90, -47, -48, -21, -28, -34, -40, -38, -78, -105, -99, -48, -45, -105, -46, -97, -98, -105, -47, -46, -9, -63, -63, -40, -45, -12, -55, -58, -46, -10, -61, -11, -57, -62, -40, -12, -55, -58, -46, -10, -60, -62, -63, 9, 17, 21, -2, 6, 21, -66, -62, -67, -49, -38, -38, 29, 28, 30, 38, 34, 45, 42, 48, 41, 31, -24, 30, 42, 39, 42, 45, 50, 63, 60, 52, 35, 47, 44, 47, 50, -19, -14, -16, -14, -3, -4, -24, -16, -12, -3, -4, 2, -69, -12, -17, -5, -9, -6, 7, -36, -27, -28, -22, -93, -23, -33, -16, -37, -54, -45, -46, -40, -111, -41, -40, -35, -48, -55, -5, 4, 3, 9, -62, 12, -6, -2, -4, -3, 9, -29, -18, -37, -26, -29, -35, 14, 21, 4, 17, -30, -22, 81, 84, 65, 88, 12, 79, 78, 82, 72, 83, 72, 78, 77, 68, 53, 72, 68, -3, 51, 63, 61, 50, 57, 62, 53, -3, 69, 64, 66, 57, 55, 56, 68, 60, 45, 64, 60, -11, 44, 45, 43, 55, 58, 41, 60, 49, 55, 54, 75, 68, 58, 59, 72, -30, -37, -47, -46, -33, -39, -42, -37, -46, 23, 60};
    }

    static {
        A07();
        A05 = Pattern.compile(A01(49, 19, 21));
        A04 = Pattern.compile(A01(68, 32, 57));
    }

    public static char A00(C1648fq c1648fq, int i10) {
        return (char) c1648fq.A0l()[i10];
    }

    public static String A02(C1648fq c1648fq) {
        int limit = c1648fq.A09();
        int A0A = c1648fq.A0A();
        char c10 = 0;
        while (limit < A0A && c10 == 0) {
            int i10 = limit + 1;
            int position = c1648fq.A0l()[limit];
            int limit2 = (char) position;
            c10 = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i10;
        }
        int position2 = c1648fq.A09();
        return c1648fq.A0W((limit - 1) - position2).trim();
    }

    public static String A03(C1648fq c1648fq, StringBuilder sb) {
        sb.setLength(0);
        int A09 = c1648fq.A09();
        int A0A = c1648fq.A0A();
        boolean z10 = false;
        while (A09 < A0A && !z10) {
            int position = c1648fq.A0l()[A09];
            char c10 = (char) position;
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && (c10 < '0' || c10 > '9'))) {
                String[] strArr = A03;
                String str = strArr[2];
                String str2 = strArr[1];
                int limit = str.length();
                int position2 = str2.length();
                if (limit == position2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[4] = "Vh15wAcBJ5awNMogLa7ya5lgHGEvzhGm";
                strArr2[3] = "I7Vba0Ch2uGY8uHZbKRjlO1gIbEJA64m";
                if (c10 != '#' && c10 != '-' && c10 != '.') {
                    String[] strArr3 = A03;
                    String str3 = strArr3[2];
                    String str4 = strArr3[1];
                    int limit2 = str3.length();
                    int position3 = str4.length();
                    if (limit2 != position3) {
                        A03[0] = "VZQzf231kw8V1N2gjYTC7U";
                        if (c10 != '_') {
                            z10 = true;
                        }
                    } else {
                        A03[6] = "5JAbk";
                        if (c10 != '_') {
                            z10 = true;
                        }
                    }
                }
            }
            A09++;
            sb.append(c10);
        }
        int position4 = c1648fq.A09();
        c1648fq.A0g(A09 - position4);
        return sb.toString();
    }

    public static String A04(C1648fq c1648fq, StringBuilder sb) {
        A0A(c1648fq);
        if (c1648fq.A07() == 0) {
            return null;
        }
        String A032 = A03(c1648fq, sb);
        String A01 = A01(0, 0, 10);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c1648fq.A0I());
        return identifier;
    }

    public static String A05(C1648fq c1648fq, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            if (!z10) {
                int A09 = c1648fq.A09();
                String A042 = A04(c1648fq, sb);
                if (A042 == null) {
                    return null;
                }
                boolean equals = A01(252, 1, 95).equals(A042);
                String[] strArr = A03;
                if (strArr[2].length() == strArr[1].length()) {
                    break;
                }
                String[] strArr2 = A03;
                strArr2[2] = "RiENs95LW29xQs";
                strArr2[1] = "98BY1tMXf9qss3p7P2Y9sQRSEcM";
                if (equals || A01(11, 1, 75).equals(A042)) {
                    c1648fq.A0f(A09);
                    String[] strArr3 = A03;
                    if (strArr3[2].length() == strArr3[1].length()) {
                        break;
                    }
                    A03[0] = "seKadn7BPsw689XAgHb6bG";
                    z10 = true;
                } else {
                    sb2.append(A042);
                }
            } else {
                String token = sb2.toString();
                String[] strArr4 = A03;
                if (strArr4[2].length() != strArr4[1].length()) {
                    A03[0] = "PJ9IZmVYrBrltLTNDzSXuq";
                    return token;
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A06(C1648fq c1648fq, StringBuilder sb) {
        A0A(c1648fq);
        if (c1648fq.A07() < 5) {
            return null;
        }
        String A0W = c1648fq.A0W(5);
        String cueSelector = A01(6, 5, 61);
        if (cueSelector.equals(A0W)) {
            int A09 = c1648fq.A09();
            String token = A04(c1648fq, sb);
            if (token == null) {
                return null;
            }
            String cueSelector2 = A01(251, 1, 60);
            if (cueSelector2.equals(token)) {
                c1648fq.A0f(A09);
                String cueSelector3 = A01(0, 0, 10);
                return cueSelector3;
            }
            String target = null;
            String cueSelector4 = A01(3, 1, 2);
            if (cueSelector4.equals(token)) {
                target = A02(c1648fq);
            }
            String token2 = A04(c1648fq, sb);
            String cueSelector5 = A01(4, 1, 59);
            if (cueSelector5.equals(token2)) {
                return target;
            }
            return null;
        }
        return null;
    }

    private void A08(C1231Xn c1231Xn, String str) {
        if (A01(0, 0, 10).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = A05.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c1231Xn.A0N((String) AbstractC1589es.A01(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] A1O = AbstractC1672gE.A1O(str, A01(47, 2, 24));
        String str2 = A1O[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c1231Xn.A0M(str2.substring(0, indexOf2));
            int voiceStartIndex = indexOf2 + 1;
            c1231Xn.A0L(str2.substring(voiceStartIndex));
        } else {
            c1231Xn.A0M(str2);
        }
        int voiceStartIndex2 = A1O.length;
        if (voiceStartIndex2 > 1) {
            int length = A1O.length;
            if (A03[6].length() == 26) {
                throw new RuntimeException();
            }
            A03[7] = "DE4gkVpytXw0E";
            c1231Xn.A0O((String[]) AbstractC1672gE.A1J(A1O, 1, length));
        }
    }

    public static void A09(C1648fq c1648fq) {
        String line;
        do {
            line = c1648fq.A0T();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(C1648fq c1648fq) {
        boolean skipping = true;
        while (c1648fq.A07() > 0 && skipping) {
            boolean skipping2 = A0E(c1648fq);
            if (!skipping2) {
                boolean skipping3 = A0D(c1648fq);
                if (!skipping3) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
        r8.A0E(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
        if (r5 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
        r0 = A01(237, 5, 118);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
        if (r0.equals(r3) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
        r0 = com.facebook.ads.redexgen.X.C1227Xj.A03[5];
        r1 = r0.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
        if (r1 == 24) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
        r2 = com.facebook.ads.redexgen.X.C1227Xj.A03;
        r2[2] = "2GynIgqiIEDsRS";
        r2[1] = "abFw2srtb6fHYJRwJQGI2AV9x9f";
        r8.A0E(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0138, code lost:
        if (r0.equals(r3) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013a, code lost:
        r0 = A01(128, 6, 41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0147, code lost:
        if (r3.startsWith(r0) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
        r8.A0H(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014e, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0161, code lost:
        if (r0.equals(r3) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0213, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0B(com.facebook.ads.redexgen.X.C1648fq r7, com.facebook.ads.redexgen.X.C1231Xn r8, java.lang.StringBuilder r9) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1227Xj.A0B(com.facebook.ads.redexgen.X.fq, com.facebook.ads.redexgen.X.Xn, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0C(String str, C1231Xn c1231Xn) {
        char c10;
        Matcher matcher = A04.matcher(AbstractC1756hb.A01(str));
        if (!matcher.matches()) {
            AbstractC1633fb.A07(A01(32, 15, 125), A01(12, 20, 72) + str + A01(1, 2, 7));
            return;
        }
        String str2 = (String) AbstractC1589es.A01(matcher.group(2));
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals(A01(0, 1, 7))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3240:
                if (str2.equals(A01(134, 2, 35))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3592:
                if (str2.equals(A01(187, 2, 18))) {
                    c10 = 0;
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
                c1231Xn.A0D(1);
                break;
            case 1:
                c1231Xn.A0D(2);
                break;
            case 2:
                c1231Xn.A0D(3);
                break;
            default:
                throw new IllegalStateException();
        }
        c1231Xn.A0A(Float.parseFloat((String) AbstractC1589es.A01(matcher.group(1))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0D(com.facebook.ads.redexgen.X.C1648fq r9) {
        /*
            int r1 = r9.A09()
            int r3 = r9.A0A()
            byte[] r8 = r9.A0l()
            int r0 = r1 + 2
            if (r0 > r3) goto Laf
            int r2 = r1 + 1
            r0 = r8[r1]
            r5 = 47
            if (r0 != r5) goto Laf
            int r1 = r2 + 1
            r0 = r8[r2]
            r4 = 42
            if (r0 != r4) goto Laf
        L20:
            int r0 = r1 + 1
            if (r0 >= r3) goto L60
            int r7 = r1 + 1
            r0 = r8[r1]
            char r6 = (char) r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1227Xj.A03
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 26
            if (r1 == r0) goto L8c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1227Xj.A03
            java.lang.String r1 = "InySU7HyHkZtinqWem4y3oF8qKSZptkm"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "9rITYseV6onPcQDc5rgMmOR6tqaZC7Ym"
            r0 = 3
            r2[r0] = r1
            if (r6 != r4) goto La0
            r6 = r8[r7]
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1227Xj.A03
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L73
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L60:
            int r0 = r9.A09()
            int r3 = r3 - r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1227Xj.A03
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 13
            if (r1 == r0) goto La3
            goto L8c
        L73:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1227Xj.A03
            java.lang.String r1 = "PHoPDNz6odAuL8Ungw6NIS"
            r0 = 0
            r2[r0] = r1
            char r0 = (char) r6
            if (r0 != r5) goto La0
            int r3 = r7 + 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1227Xj.A03
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 13
            if (r1 == r0) goto L92
        L8c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L92:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1227Xj.A03
            java.lang.String r1 = "IfEe7uD6oKRguQWJVmvx6dgg7t6qyFvm"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "gAgfrBFNHRp7NBff9DkLQ3D4ENn77jVm"
            r0 = 3
            r2[r0] = r1
            r1 = r3
            goto L20
        La0:
            r1 = r7
            goto L20
        La3:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1227Xj.A03
            java.lang.String r1 = "AHX5fonDzRqAb"
            r0 = 7
            r2[r0] = r1
            r9.A0g(r3)
            r0 = 1
            return r0
        Laf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1227Xj.A0D(com.facebook.ads.redexgen.X.fq):boolean");
    }

    public static boolean A0E(C1648fq c1648fq) {
        switch (A00(c1648fq, c1648fq.A09())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c1648fq.A0g(1);
                return true;
            default:
                return false;
        }
    }

    public final List<C1231Xn> A0F(C1648fq c1648fq) {
        String selector;
        this.A01.setLength(0);
        int A09 = c1648fq.A09();
        A09(c1648fq);
        C1648fq c1648fq2 = this.A00;
        byte[] A0l = c1648fq.A0l();
        int initialInputPosition = c1648fq.A09();
        c1648fq2.A0j(A0l, initialInputPosition);
        this.A00.A0f(A09);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector2 = A06(this.A00, this.A01);
            if (selector2 == null) {
                return arrayList;
            }
            if (!A01(251, 1, 60).equals(A04(this.A00, this.A01))) {
                return arrayList;
            }
            C1231Xn c1231Xn = new C1231Xn();
            A08(c1231Xn, selector2);
            String str = null;
            boolean z10 = false;
            while (true) {
                selector = A01(252, 1, 95);
                if (z10) {
                    break;
                }
                int A092 = this.A00.A09();
                str = A04(this.A00, this.A01);
                z10 = str == null || selector.equals(str);
                if (!z10) {
                    this.A00.A0f(A092);
                    A0B(this.A00, c1231Xn, this.A01);
                }
            }
            if (selector.equals(str)) {
                arrayList.add(c1231Xn);
            }
        }
    }
}
