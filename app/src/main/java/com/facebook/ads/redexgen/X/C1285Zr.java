package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Zr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1285Zr implements InterfaceC0973Nb {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;
    public final int[] A05;
    public final long[] A06;
    public final Uri[] A07;
    public static String[] A08 = {"5RRO1SDze3tky6cLdb65G29slmd9TZz5", "5c0T1acjGo3ewlB56tHjiHlYYIu", "7cjhsSVYkwZKYICP", "Wp0ScOf0ThjO4lTev1rnXqXJy9GD5rsT", "vO4hUZoX", "OFqRDWv8WYZkTqb1", "eH8ipb", "sREUdleD9XqicAZFDNtccFwydYCBd"};
    public static final String A0G = AbstractC1672gE.A0h(0);
    public static final String A0B = AbstractC1672gE.A0h(1);
    public static final String A0H = AbstractC1672gE.A0h(2);
    public static final String A0F = AbstractC1672gE.A0h(3);
    public static final String A0C = AbstractC1672gE.A0h(4);
    public static final String A0A = AbstractC1672gE.A0h(5);
    public static final String A0D = AbstractC1672gE.A0h(6);
    public static final String A0E = AbstractC1672gE.A0h(7);
    public static final InterfaceC0972Na<C1285Zr> A09 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Zs
        @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
        public final InterfaceC0973Nb A6V(Bundle bundle) {
            C1285Zr A00;
            A00 = C1285Zr.A00(bundle);
            return A00;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1285Zr A00(Bundle bundle) {
        long j10 = bundle.getLong(A0G);
        int i10 = bundle.getInt(A0B);
        int i11 = bundle.getInt(A0E);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0H);
        int[] intArray = bundle.getIntArray(A0F);
        long[] longArray = bundle.getLongArray(A0C);
        long j11 = bundle.getLong(A0A);
        boolean z10 = bundle.getBoolean(A0D);
        if (intArray == null) {
            intArray = new int[0];
            if (A08[6].length() != 6) {
                throw new RuntimeException();
            }
            A08[7] = "fFAYVknZwUB9kTFIqkD1N4pW4DGzn";
        }
        Uri[] uriArr = new Uri[0];
        if (parcelableArrayList != null) {
            uriArr = (Uri[]) parcelableArrayList.toArray(uriArr);
        }
        if (longArray == null) {
            longArray = new long[0];
        }
        return new C1285Zr(j10, i10, i11, intArray, uriArr, longArray, j11, z10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final C1285Zr A06(int i10) {
        int[] A02 = A02(this.A05, i10);
        long[] A03 = A03(this.A06, i10);
        return new C1285Zr(this.A03, i10, this.A01, A02, (Uri[]) Arrays.copyOf(this.A07, i10), A03, this.A02, this.A04);
    }

    public C1285Zr(long j10) {
        this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public C1285Zr(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        AbstractC1589es.A07(iArr.length == uriArr.length);
        this.A03 = j10;
        this.A00 = i10;
        this.A01 = i11;
        this.A05 = iArr;
        this.A07 = uriArr;
        this.A06 = jArr;
        this.A02 = j11;
        this.A04 = z10;
    }

    public static int[] A02(int[] iArr, int i10) {
        int length = iArr.length;
        int max = Math.max(i10, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        return copyOf;
    }

    public static long[] A03(long[] jArr, int i10) {
        int length = jArr.length;
        int max = Math.max(i10, length);
        long[] copyOf = Arrays.copyOf(jArr, max);
        Arrays.fill(copyOf, length, max, -9223372036854775807L);
        return copyOf;
    }

    public final int A04() {
        return A05(-1);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A05(int r6) {
        /*
            r5 = this;
            int r4 = r6 + 1
        L2:
            int[] r0 = r5.A05
            int r0 = r0.length
            if (r4 >= r0) goto L30
            boolean r0 = r5.A04
            if (r0 != 0) goto L30
            int[] r0 = r5.A05
            r3 = r0[r4]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1285Zr.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L34
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1285Zr.A08
            java.lang.String r1 = "oy0aabLPV2TUpAgC"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "dKPmQukuLwBHuA98"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L30
            int[] r0 = r5.A05
            r1 = r0[r4]
            r0 = 1
            if (r1 != r0) goto L31
        L30:
            return r4
        L31:
            int r4 = r4 + 1
            goto L2
        L34:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1285Zr.A05(int):int");
    }

    public final boolean A07() {
        if (this.A00 == -1) {
            return true;
        }
        int i10 = 0;
        while (true) {
            int i11 = this.A00;
            String[] strArr = A08;
            String str = strArr[5];
            String str2 = strArr[2];
            int length = str.length();
            int i12 = str2.length();
            if (length != i12) {
                throw new RuntimeException();
            }
            A08[0] = "eD8JFjczkT4NcgxULb6Tui01C9VWsN5O";
            if (i10 < i11) {
                int i13 = this.A05[i10];
                if (i13 == 0) {
                    break;
                }
                int i14 = this.A05[i10];
                if (i14 == 1) {
                    break;
                }
                i10++;
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean A08() {
        return this.A00 == -1 || A04() < this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1285Zr c1285Zr = (C1285Zr) obj;
        if (this.A03 == c1285Zr.A03 && this.A00 == c1285Zr.A00 && this.A01 == c1285Zr.A01 && Arrays.equals(this.A07, c1285Zr.A07) && Arrays.equals(this.A05, c1285Zr.A05) && Arrays.equals(this.A06, c1285Zr.A06) && this.A02 == c1285Zr.A02 && this.A04 == c1285Zr.A04) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i10 = result * 31;
        int result2 = this.A01;
        int result3 = (((i10 + result2) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result4 = Arrays.hashCode(this.A07);
        int result5 = Arrays.hashCode(this.A06);
        int result6 = (((((((result3 + result4) * 31) + Arrays.hashCode(this.A05)) * 31) + result5) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31;
        int result7 = this.A04 ? 1 : 0;
        return result6 + result7;
    }
}
