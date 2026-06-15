package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.ColorInfo;
import com.google.android.exoplayer2.DrmInitData;
import com.google.android.exoplayer2.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ZM implements InterfaceC0973Nb {
    public static byte[] A0Z;
    public static String[] A0a = {"IhGyJJpIdzXpTFbZZ", "SJPXPkbq3kDt05pDs", "2UTcMrpXiEorK", "RLA8igv7oYs9DSC3tg9b3oMVOt", "inFtX", "N61GXI4Rl1nCA", "mLYWszSA8kxwzVA0oCZFYAxgyxpFQOwi", "RFN2MzIQPtfzv"};
    public static final InterfaceC0972Na<ZM> A0b;
    public static final ZM A0c;
    public static final String A0d;
    public static final String A0e;
    public static final String A0f;
    public static final String A0g;
    public static final String A0h;
    public static final String A0i;
    public static final String A0j;
    public static final String A0k;
    public static final String A0l;
    public static final String A0m;
    public static final String A0n;
    public static final String A0o;
    public static final String A0p;
    public static final String A0q;
    public static final String A0r;
    public static final String A0s;
    public static final String A0t;
    public static final String A0u;
    public static final String A0v;
    public static final String A0w;
    public static final String A0x;
    public static final String A0y;
    public static final String A0z;
    public static final String A10;
    public static final String A11;
    public static final String A12;
    public static final String A13;
    public static final String A14;
    public static final String A15;
    public static final String A16;
    public static final String A17;
    public static final String A18;
    public static final String A19;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final long A0M;
    public final ColorInfo A0N;
    public final DrmInitData A0O;
    public final Metadata A0P;
    public final Object A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final List<byte[]> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <T> T A02(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Z, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0Z = new byte[]{85, 73, 94, 82, -115, -64, -23, -20, -25, -37, -18, -94, 110, 58, -46, -95, -107, -48, 121};
    }

    static {
        A05();
        A0c = new P5().A14();
        A0q = AbstractC1672gE.A0h(0);
        A0s = AbstractC1672gE.A0h(1);
        A0t = AbstractC1672gE.A0h(2);
        A14 = AbstractC1672gE.A0h(3);
        A10 = AbstractC1672gE.A0h(4);
        A0e = AbstractC1672gE.A0h(5);
        A0x = AbstractC1672gE.A0h(6);
        A0g = AbstractC1672gE.A0h(7);
        A0v = AbstractC1672gE.A0h(8);
        A0i = AbstractC1672gE.A0h(9);
        A12 = AbstractC1672gE.A0h(10);
        A0u = AbstractC1672gE.A0h(11);
        A0r = AbstractC1672gE.A0h(12);
        A0k = AbstractC1672gE.A0h(13);
        A16 = AbstractC1672gE.A0h(14);
        A19 = AbstractC1672gE.A0h(15);
        A0p = AbstractC1672gE.A0h(16);
        A0o = AbstractC1672gE.A0h(17);
        A11 = AbstractC1672gE.A0h(18);
        A0y = AbstractC1672gE.A0h(19);
        A0z = AbstractC1672gE.A0h(20);
        A15 = AbstractC1672gE.A0h(21);
        A0h = AbstractC1672gE.A0h(22);
        A0f = AbstractC1672gE.A0h(23);
        A13 = AbstractC1672gE.A0h(24);
        A0w = AbstractC1672gE.A0h(25);
        A0l = AbstractC1672gE.A0h(26);
        A0m = AbstractC1672gE.A0h(27);
        A0d = AbstractC1672gE.A0h(28);
        A0j = AbstractC1672gE.A0h(29);
        A17 = AbstractC1672gE.A0h(30);
        A18 = AbstractC1672gE.A0h(31);
        A0n = AbstractC1672gE.A0h(32);
        A0b = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.ZN
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                ZM A00;
                A00 = ZM.A00(bundle);
                return A00;
            }
        };
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Language is not normalized")
    public ZM(P5 p52) {
        this.A0T = P5.A0P(p52);
        this.A0U = P5.A0S(p52);
        if (C0962Mq.A03(EnumC0959Mn.A0k)) {
            this.A0V = AbstractC1672gE.A0k(P5.A0T(p52));
        } else {
            this.A0V = P5.A0T(p52);
        }
        this.A0H = P5.A0G(p52);
        this.A0E = P5.A0H(p52);
        this.A04 = P5.A0I(p52);
        this.A0D = P5.A0J(p52);
        this.A05 = this.A0D != -1 ? this.A0D : this.A04;
        this.A0R = P5.A0U(p52);
        this.A0P = P5.A0N(p52);
        this.A0Q = P5.A0O(p52);
        this.A0S = P5.A0Q(p52);
        this.A0W = P5.A0R(p52);
        this.A0B = P5.A02(p52);
        this.A0X = P5.A0V(p52) == null ? Collections.emptyList() : P5.A0V(p52);
        this.A0O = P5.A0M(p52);
        this.A0M = P5.A0K(p52);
        this.A0L = P5.A03(p52);
        this.A0A = P5.A04(p52);
        this.A01 = P5.A00(p52);
        this.A0F = P5.A05(p52) == -1 ? 0 : P5.A05(p52);
        this.A02 = P5.A01(p52) == -1.0f ? 1.0f : P5.A01(p52);
        this.A0Y = P5.A0W(p52);
        this.A0I = P5.A06(p52);
        this.A0N = P5.A0L(p52);
        this.A06 = P5.A07(p52);
        this.A0G = P5.A08(p52);
        this.A0C = P5.A09(p52);
        this.A08 = P5.A0A(p52) == -1 ? 0 : P5.A0A(p52);
        this.A09 = P5.A0B(p52) != -1 ? P5.A0B(p52) : 0;
        this.A03 = P5.A0C(p52);
        this.A0J = P5.A0D(p52);
        this.A0K = P5.A0E(p52);
        if (P5.A0F(p52) == 0 && this.A0O != null) {
            this.A07 = 1;
        } else {
            this.A07 = P5.A0F(p52);
        }
    }

    public static ZM A00(Bundle bundle) {
        P5 p52 = new P5();
        C1595ey.A02(bundle);
        p52.A0y((String) A02(bundle.getString(A0q), A0c.A0T)).A0z((String) A02(bundle.getString(A0s), A0c.A0U)).A10((String) A02(bundle.getString(A0t), A0c.A0V)).A0n(bundle.getInt(A14, A0c.A0H)).A0k(bundle.getInt(A10, A0c.A0E)).A0a(bundle.getInt(A0e, A0c.A04)).A0j(bundle.getInt(A0x, A0c.A0D)).A0w((String) A02(bundle.getString(A0g), A0c.A0R)).A0v((Metadata) A02((Metadata) bundle.getParcelable(A0v), A0c.A0P)).A0x((String) A02(bundle.getString(A0i), A0c.A0S)).A11((String) A02(bundle.getString(A12), A0c.A0W)).A0h(bundle.getInt(A0u, A0c.A0B));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(A03(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        p52.A12(arrayList).A0u((DrmInitData) bundle.getParcelable(A0k)).A0s(bundle.getLong(A16, A0c.A0M)).A0r(bundle.getInt(A19, A0c.A0L)).A0f(bundle.getInt(A0p, A0c.A0A)).A0X(bundle.getFloat(A0o, A0c.A01)).A0l(bundle.getInt(A11, A0c.A0F)).A0Y(bundle.getFloat(A0y, A0c.A02)).A13(bundle.getByteArray(A0z)).A0o(bundle.getInt(A15, A0c.A0I));
        Bundle bundle2 = bundle.getBundle(A0h);
        if (bundle2 != null) {
            p52.A0t(ColorInfo.A08.A6V(bundle2));
        }
        p52.A0b(bundle.getInt(A0f, A0c.A06)).A0m(bundle.getInt(A13, A0c.A0G)).A0i(bundle.getInt(A0w, A0c.A0C)).A0d(bundle.getInt(A0l, A0c.A08)).A0e(bundle.getInt(A0m, A0c.A09)).A0Z(bundle.getInt(A0d, A0c.A03)).A0p(bundle.getInt(A17, A0c.A0J)).A0q(bundle.getInt(A18, A0c.A0K)).A0c(bundle.getInt(A0j, A0c.A07));
        return p52.A14();
    }

    public static String A03(int i10) {
        return A0r + A04(18, 1, 25) + Integer.toString(i10, 36);
    }

    public final int A06() {
        if (this.A0L == -1 || this.A0A == -1) {
            return -1;
        }
        return this.A0A * this.A0L;
    }

    public final P5 A07() {
        return new P5(this);
    }

    public final ZM A08(int i10) {
        return A07().A0c(i10).A14();
    }

    @Deprecated
    public final ZM A09(DrmInitData drmInitData) {
        return A07().A0u(drmInitData).A14();
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0A(com.facebook.ads.redexgen.X.ZM r5) {
        /*
            r4 = this;
            java.util.List<byte[]> r0 = r4.A0X
            int r1 = r0.size()
            java.util.List<byte[]> r0 = r5.A0X
            int r0 = r0.size()
            r3 = 0
            if (r1 == r0) goto L10
            return r3
        L10:
            r2 = 0
        L11:
            java.util.List<byte[]> r0 = r4.A0X
            int r0 = r0.size()
            if (r2 >= r0) goto L33
            java.util.List<byte[]> r0 = r4.A0X
            java.lang.Object r1 = r0.get(r2)
            byte[] r1 = (byte[]) r1
            java.util.List<byte[]> r0 = r5.A0X
            java.lang.Object r0 = r0.get(r2)
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L30
            return r3
        L30:
            int r2 = r2 + 1
            goto L11
        L33:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZM.A0A(com.facebook.ads.redexgen.X.ZM):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZM zm = (ZM) obj;
        if ((this.A00 == 0 || zm.A00 == 0 || this.A00 == zm.A00) && this.A0H == zm.A0H && this.A0E == zm.A0E && this.A04 == zm.A04 && this.A0D == zm.A0D && this.A0B == zm.A0B && this.A0M == zm.A0M && this.A0L == zm.A0L && this.A0A == zm.A0A && this.A0F == zm.A0F && this.A0I == zm.A0I && this.A06 == zm.A06 && this.A0G == zm.A0G && this.A0C == zm.A0C && this.A08 == zm.A08 && this.A09 == zm.A09 && this.A03 == zm.A03 && this.A0J == zm.A0J && this.A0K == zm.A0K && this.A07 == zm.A07 && Float.compare(this.A01, zm.A01) == 0 && Float.compare(this.A02, zm.A02) == 0 && AbstractC1672gE.A1E(this.A0T, zm.A0T) && AbstractC1672gE.A1E(this.A0U, zm.A0U) && AbstractC1672gE.A1E(this.A0R, zm.A0R) && AbstractC1672gE.A1E(this.A0S, zm.A0S)) {
            boolean A1E = AbstractC1672gE.A1E(this.A0W, zm.A0W);
            if (A0a[3].length() != 6) {
                A0a[4] = "nG6HCFSp8c766cr1voUDj";
                if (A1E && AbstractC1672gE.A1E(this.A0V, zm.A0V) && Arrays.equals(this.A0Y, zm.A0Y) && AbstractC1672gE.A1E(this.A0P, zm.A0P)) {
                    ColorInfo colorInfo = this.A0N;
                    ColorInfo colorInfo2 = zm.A0N;
                    String[] strArr = A0a;
                    if (strArr[1].length() == strArr[0].length()) {
                        A0a[2] = "HTpgcJ44puf5X";
                        if (AbstractC1672gE.A1E(colorInfo, colorInfo2) && AbstractC1672gE.A1E(this.A0O, zm.A0O) && A0A(zm)) {
                            boolean A1E2 = AbstractC1672gE.A1E(this.A0Q, zm.A0Q);
                            String[] strArr2 = A0a;
                            if (strArr2[1].length() != strArr2[0].length()) {
                                throw new RuntimeException();
                            }
                            A0a[2] = "h5nQYT3Rl4hjq";
                            if (A1E2) {
                                return true;
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result;
        if (this.A00 == 0) {
            int i10 = 17 * 31;
            if (this.A0T == null) {
                result = 0;
            } else {
                String str = this.A0T;
                if (A0a[6].charAt(14) != 'X') {
                    String[] strArr = A0a;
                    strArr[7] = "zmW8E8Ny1kxg0";
                    strArr[5] = "VIitTNc94RYS1";
                    result = str.hashCode();
                } else {
                    result = str.hashCode();
                }
            }
            int i11 = i10 + result;
            if (A0a[2].length() != 13) {
                throw new RuntimeException();
            }
            A0a[4] = "8AIBPZBfP8ojcV7rqooUELhh3jRU";
            int result2 = i11 * 31;
            int result3 = (result2 + (this.A0U != null ? this.A0U.hashCode() : 0)) * 31;
            int result4 = this.A0V == null ? 0 : this.A0V.hashCode();
            int result5 = this.A0E;
            int result6 = this.A0D;
            int result7 = (((((((((((result3 + result4) * 31) + this.A0H) * 31) + result5) * 31) + this.A04) * 31) + result6) * 31) + (this.A0R == null ? 0 : this.A0R.hashCode())) * 31;
            int result8 = this.A0P == null ? 0 : this.A0P.hashCode();
            int result9 = (((result7 + result8) * 31) + (this.A0Q == null ? 0 : this.A0Q.hashCode())) * 31;
            int result10 = this.A0S == null ? 0 : this.A0S.hashCode();
            int result11 = (result9 + result10) * 31;
            int hashCode = this.A0W != null ? this.A0W.hashCode() : 0;
            int result12 = this.A0B;
            int result13 = (((((result11 + hashCode) * 31) + result12) * 31) + ((int) this.A0M)) * 31;
            int result14 = this.A0L;
            int result15 = Float.floatToIntBits(this.A01);
            int result16 = Float.floatToIntBits(this.A02);
            int result17 = this.A06;
            int result18 = this.A0C;
            int result19 = this.A09;
            int result20 = this.A0J;
            int result21 = this.A07;
            this.A00 = ((((((((((((((((((((((((((((result13 + result14) * 31) + this.A0A) * 31) + result15) * 31) + this.A0F) * 31) + result16) * 31) + this.A0I) * 31) + result17) * 31) + this.A0G) * 31) + result18) * 31) + this.A08) * 31) + result19) * 31) + this.A03) * 31) + result20) * 31) + this.A0K) * 31) + result21;
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A04(5, 7, 121)).append(this.A0T);
        String A04 = A04(0, 2, 40);
        return append.append(A04).append(this.A0U).append(A04).append(this.A0S).append(A04).append(this.A0W).append(A04).append(this.A0R).append(A04).append(this.A05).append(A04).append(this.A0V).append(A04(2, 3, 49)).append(this.A0L).append(A04).append(this.A0A).append(A04).append(this.A01).append(A04(14, 4, 116)).append(this.A06).append(A04).append(this.A0G).append(A04(12, 2, 16)).toString();
    }
}
