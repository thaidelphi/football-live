package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.dp  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1524dp {
    public static byte[] A0W;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final C1523dn A0H;
    public final Cdo A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Map<String, String> A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0W = new byte[]{-89, -101};
    }

    public C1524dp() {
        this(A00(0, 0, 119), -1L, false, -1, -1, -1, -1, false, false, -1, -1L, new Cdo(), -1L, false, -1, -1, -1L, -1L, -1, null, -1, null, null, C1523dn.A03, -1, false, A00(0, 0, 119), A00(0, 0, 119), A00(0, 0, 119), null, -1L, -1L);
    }

    public C1524dp(C1524dp c1524dp) {
        this(c1524dp, c1524dp.A0N);
    }

    public C1524dp(C1524dp c1524dp, String str) {
        this(c1524dp.A0M, c1524dp.A0A, c1524dp.A0T, c1524dp.A08, c1524dp.A07, c1524dp.A00, c1524dp.A09, c1524dp.A0V, c1524dp.A0S, c1524dp.A05, c1524dp.A0C, c1524dp.A0I, c1524dp.A0F, c1524dp.A0U, c1524dp.A06, c1524dp.A02, c1524dp.A0E, c1524dp.A0B, c1524dp.A01, c1524dp.A0Q, c1524dp.A04, c1524dp.A0K, c1524dp.A0J, c1524dp.A0H, c1524dp.A03, c1524dp.A0R, c1524dp.A0O, c1524dp.A0L, c1524dp.A0P, str, -1L, -1L);
    }

    public C1524dp(String str, long j10, boolean z10, int i10, int i11, int i12, int i13, boolean z11, boolean z12, int i14, long j11, Cdo cdo, long j12, boolean z13, int i15, int i16, long j13, long j14, int i17, Map<String, String> map, int i18, String str2, String str3, C1523dn c1523dn, int i19, boolean z14, String str4, String str5, String str6, String str7, long j15, long j16) {
        this.A0Q = new HashMap();
        this.A0M = str;
        this.A0A = j10;
        this.A0T = z10;
        this.A08 = i10;
        this.A07 = i11;
        this.A00 = i12;
        this.A09 = i13;
        this.A0V = z11;
        this.A0S = z12;
        this.A05 = i14;
        this.A0C = j11;
        this.A0I = cdo;
        this.A0F = j12;
        this.A0U = z13;
        this.A06 = i15;
        this.A02 = i16;
        this.A0E = j13;
        this.A0B = j14;
        this.A01 = i17;
        this.A04 = i18;
        this.A0J = str3;
        this.A0K = str2;
        if (map != null) {
            this.A0Q.putAll(map);
        }
        this.A0H = c1523dn;
        this.A03 = i19;
        this.A0R = z14;
        this.A0O = str4;
        this.A0L = str5;
        this.A0P = str6;
        this.A0N = str7;
        this.A0G = j15;
        this.A0D = j16;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(this.A0M);
        String A00 = A00(0, 2, 20);
        return append.append(A00).append(this.A0A).append(A00).append(this.A0T).append(A00).append(this.A08).append(A00).append(this.A07).append(A00).append(this.A00).append(A00).append(this.A09).append(A00).append(this.A0V).append(A00).append(this.A0S).append(A00).append(this.A05).append(A00).append(this.A0E).append(A00).append(this.A0B).append(A00).append(this.A01).append(A00).append(this.A04).append(A00).append(this.A06).append(A00).append(this.A02).append(A00).append(this.A03).append(A00).append(this.A0R).append(A00).append(this.A0O).toString();
    }
}
