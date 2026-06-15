package com.facebook.ads.redexgen.X;

import android.text.Layout;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Xf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1223Xf {
    public static byte[] A0J;
    public static String[] A0K = {"OqR42QNDz09gx", "DtiHbQaUkm0", "JgpCwHNymRJ", "dh5rxWpj3tPCY04cXvRSuC3eR8iATcwk", "PYnflpjfPumnvKXDI3zE0fUnK5FKpak4", "W36ieGod6cPpkKyFfSA0rNFOIJ6rQSY8", "CYEaoHN3CVzFU", "ruRyuhAYMSIGmjbWJNtvzawnHNUnse4j"};
    public float A00;
    public int A02;
    public int A04;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public XU A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public int A07 = -1;
    public int A0B = -1;
    public int A03 = -1;
    public int A06 = -1;
    public int A05 = -1;
    public int A09 = -1;
    public int A08 = -1;
    public int A0A = -1;
    public float A01 = Float.MAX_VALUE;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 123);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0J = new byte[]{89, 122, 120, 112, 124, 105, 116, 110, 117, Byte.MAX_VALUE, 59, 120, 116, 119, 116, 105, 59, 115, 122, 104, 59, 117, 116, 111, 59, 121, 126, 126, 117, 59, Byte.MAX_VALUE, 126, 125, 114, 117, 126, Byte.MAX_VALUE, 53, 43, 2, 3, 25, 77, 14, 2, 1, 2, 31, 77, 5, 12, 30, 77, 3, 2, 25, 77, 15, 8, 8, 3, 77, 9, 8, 11, 4, 3, 8, 9, 67};
    }

    static {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r4 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        r5.A0F = r6.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
        if (r4 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.facebook.ads.redexgen.X.C1223Xf A00(com.facebook.ads.redexgen.X.C1223Xf r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1223Xf.A00(com.facebook.ads.redexgen.X.Xf, boolean):com.facebook.ads.redexgen.X.Xf");
    }

    public final float A03() {
        return this.A00;
    }

    public final float A04() {
        return this.A01;
    }

    public final int A05() {
        if (this.A0H) {
            return this.A02;
        }
        throw new IllegalStateException(A01(0, 38, 96));
    }

    public final int A06() {
        if (this.A0I) {
            return this.A04;
        }
        throw new IllegalStateException(A01(38, 32, 22));
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A08;
    }

    public final int A09() {
        return this.A09;
    }

    public final int A0A() {
        if (this.A03 == -1) {
            int i10 = this.A06;
            String[] strArr = A0K;
            if (strArr[4].charAt(13) != strArr[5].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[4] = "gTQ1s3dLsfyBRKnbIhTLZ9CvwCro6Qqx";
            strArr2[5] = "0Q3a2bvGDieSUKABFc67zGQyHnxCWCNj";
            if (i10 == -1) {
                return -1;
            }
        }
        int i11 = this.A03;
        String[] strArr3 = A0K;
        if (strArr3[1].length() != strArr3[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0K;
        strArr4[6] = "4EwytS8GlInOe";
        strArr4[0] = "gBmD7Ox9dAROs";
        return (i11 == 1 ? 1 : 0) | (this.A06 == 1 ? 2 : 0);
    }

    public final Layout.Alignment A0B() {
        return this.A0C;
    }

    public final Layout.Alignment A0C() {
        return this.A0D;
    }

    public final XU A0D() {
        return this.A0E;
    }

    public final C1223Xf A0E(float f10) {
        this.A00 = f10;
        return this;
    }

    public final C1223Xf A0F(float f10) {
        this.A01 = f10;
        return this;
    }

    public final C1223Xf A0G(int i10) {
        this.A02 = i10;
        this.A0H = true;
        return this;
    }

    public final C1223Xf A0H(int i10) {
        this.A04 = i10;
        this.A0I = true;
        return this;
    }

    public final C1223Xf A0I(int i10) {
        this.A05 = i10;
        return this;
    }

    public final C1223Xf A0J(int i10) {
        this.A08 = i10;
        return this;
    }

    public final C1223Xf A0K(int i10) {
        this.A09 = i10;
        return this;
    }

    public final C1223Xf A0L(Layout.Alignment alignment) {
        this.A0C = alignment;
        return this;
    }

    public final C1223Xf A0M(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C1223Xf A0N(XU xu) {
        this.A0E = xu;
        return this;
    }

    public final C1223Xf A0O(C1223Xf c1223Xf) {
        return A00(c1223Xf, true);
    }

    public final C1223Xf A0P(String str) {
        this.A0F = str;
        return this;
    }

    public final C1223Xf A0Q(String str) {
        this.A0G = str;
        return this;
    }

    public final C1223Xf A0R(boolean z10) {
        this.A03 = z10 ? 1 : 0;
        return this;
    }

    public final C1223Xf A0S(boolean z10) {
        this.A06 = z10 ? 1 : 0;
        return this;
    }

    public final C1223Xf A0T(boolean z10) {
        this.A07 = z10 ? 1 : 0;
        return this;
    }

    public final C1223Xf A0U(boolean z10) {
        this.A0A = z10 ? 1 : 0;
        return this;
    }

    public final C1223Xf A0V(boolean z10) {
        this.A0B = z10 ? 1 : 0;
        return this;
    }

    public final String A0W() {
        return this.A0F;
    }

    public final String A0X() {
        return this.A0G;
    }

    public final boolean A0Y() {
        return this.A0A == 1;
    }

    public final boolean A0Z() {
        return this.A0H;
    }

    public final boolean A0a() {
        return this.A0I;
    }

    public final boolean A0b() {
        return this.A07 == 1;
    }

    public final boolean A0c() {
        return this.A0B == 1;
    }
}
