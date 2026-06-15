package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Xa  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1218Xa {
    public static byte[] A00;
    public static String[] A01 = {"QkrKC5a9HGO1VS2Nr20Zvk3JFP", "uVKS0vBB3TT3VWssVvKEF4U9Nxg5TVLK", "SqlAoSUEvaweoiTgoiPcUXvWXEI6wTZm", "m8SPGRRUbAmmOaM0X88GQPymY3rDTEt1", "Ern8YSZyJZj7omHfxA7B45NpB8UqIAIv", "bUhGjQCUJl5tnps0a5GeYBzhyf73sWbL", "25bhM2Fj5xfDYZIZW4I933wnOnoSOL", "PPg7fQ"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static XY A01(XY xy, Map<String, C1223Xf> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(xy);
        while (!arrayDeque.isEmpty()) {
            XY xy2 = (XY) arrayDeque.pop();
            C1223Xf A02 = A02(xy2.A04, xy2.A0H(), map);
            if (A02 != null && A02.A09() == 3) {
                return xy2;
            }
            for (int A0C = xy2.A0C() - 1; A0C >= 0; A0C--) {
                arrayDeque.push(xy2.A0D(A0C));
            }
        }
        return null;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{100, 67, 64, 93, -84, -74, -106, -84, -74, 113, -119, -121, -114, -114, -121, -116, -123, 62, -112, -109, Byte.MIN_VALUE, -105, 114, -125, -106, -110, 62, -116, -115, -126, -125, 62, -107, -121, -110, -122, -115, -109, -110, 62, -125, -106, Byte.MAX_VALUE, -127, -110, -118, -105, 62, -115, -116, -125, 62, -110, -125, -106, -110, 62, -127, -122, -121, -118, -126, 76, 113, -111, -118, -119, 111, -126, -117, -127, -126, -113, 114, -111, -122, -119, -107, 90, 67, -106, -78, 106, 124, 70, 71, -105, 101};
    }

    static {
        A05();
    }

    public static XY A00(XY xy, Map<String, C1223Xf> map) {
        while (xy != null) {
            C1223Xf c1223Xf = xy.A04;
            if (A01[7].length() == 6) {
                String[] strArr = A01;
                strArr[5] = "FJhPyoeR10uaAtsz4U1qJC2AJPQIPAdg";
                strArr[1] = "25BN7Bc1Zle4H3smEMCWXAXgKioc8R88";
                C1223Xf style = A02(c1223Xf, xy.A0H(), map);
                if (style != null) {
                    int A09 = style.A09();
                    String[] strArr2 = A01;
                    if (strArr2[5].charAt(14) == strArr2[1].charAt(14)) {
                        String[] strArr3 = A01;
                        strArr3[2] = "0OWuISU5bxcKebsApSi9UxhskUElLSLu";
                        strArr3[4] = "a06iXSnhb0OksA3A9yAUG3JWvjPmssuJ";
                        if (A09 == 1) {
                            return xy;
                        }
                    }
                }
                xy = xy.A03;
            }
            throw new RuntimeException();
        }
        return null;
    }

    public static C1223Xf A02(C1223Xf c1223Xf, String[] strArr, Map<String, C1223Xf> map) {
        int i10 = 0;
        if (c1223Xf == null) {
            if (strArr == null) {
                return null;
            }
            int length = strArr.length;
            String[] strArr2 = A01;
            if (strArr2[5].charAt(14) != strArr2[1].charAt(14)) {
                throw new RuntimeException();
            }
            A01[6] = "Mp21XTMjNzlma0Wc8BYrjuLlaZyv5N";
            if (length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1223Xf c1223Xf2 = new C1223Xf();
                int length2 = strArr.length;
                while (i10 < length2) {
                    c1223Xf2.A0O(map.get(strArr[i10]));
                    i10++;
                }
                return c1223Xf2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return c1223Xf.A0O(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length3 = strArr.length;
                while (i10 < length3) {
                    c1223Xf.A0O(map.get(strArr[i10]));
                    i10++;
                }
                return c1223Xf;
            }
        }
        return c1223Xf;
    }

    public static String A04(String str) {
        String A03 = A03(1, 2, 34);
        String A032 = A03(0, 1, 70);
        String replaceAll = str.replaceAll(A03, A032);
        String out = A03(4, 5, 120);
        String replaceAll2 = replaceAll.replaceAll(out, A032);
        String A033 = A03(3, 1, 41);
        String replaceAll3 = replaceAll2.replaceAll(A032, A033);
        String out2 = A03(77, 11, 38);
        return replaceAll3.replaceAll(out2, A033);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
        if (r6 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        if (r6 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
        r2 = A01(r6, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
        if (r2.A0C() != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
        r0 = r2.A0D(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (r0.A08 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
        r0 = r2.A0D(0);
        r7 = (java.lang.String) com.facebook.ads.redexgen.X.AbstractC1672gE.A0f(r0.A08);
        r0 = A02(r2.A04, r2.A0H(), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0158, code lost:
        r1 = r0.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
        if (r1 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015e, code lost:
        r0 = A02(r6.A04, r6.A0H(), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
        if (r0 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016a, code lost:
        r1 = r0.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
        r8.setSpan(new com.facebook.ads.redexgen.X.C1048Qc(r7, r1), r9, r10, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0178, code lost:
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
        r5 = A03(63, 14, 9);
        r2 = com.facebook.ads.redexgen.X.AbstractC1218Xa.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
        if (r2[5].charAt(14) == r2[1].charAt(14)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
        com.facebook.ads.redexgen.X.AbstractC1218Xa.A01[6] = "sseZQ5ppnA83MfGWcvAkBEULvPjTHQ";
        com.facebook.ads.redexgen.X.AbstractC1633fb.A06(r5, A03(9, 54, 10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.text.Spannable r8, int r9, int r10, com.facebook.ads.redexgen.X.C1223Xf r11, com.facebook.ads.redexgen.X.XY r12, java.util.Map<java.lang.String, com.facebook.ads.redexgen.X.C1223Xf> r13, int r14) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1218Xa.A06(android.text.Spannable, int, int, com.facebook.ads.redexgen.X.Xf, com.facebook.ads.redexgen.X.XY, java.util.Map, int):void");
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
