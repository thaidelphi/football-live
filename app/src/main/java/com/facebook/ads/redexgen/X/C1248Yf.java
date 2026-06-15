package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Yf  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1248Yf implements InterfaceC0973Nb {
    public static byte[] A0H;
    public static String[] A0I = {"SAapicflT3iI", "Cg8o3isv82DGavEyExCpZHKfeIP6Bt9", "0iLCFfdzsihKbVTTPxmDwgsUAu4XGhZg", "ki99bQoAzPnnQ3ScvR9EgP8VBWVgkmKf", "bdAF2dkAxAJYvSOQZeKzDLIY90b61U8b", "nGiQbFjvO2SYqXYUHTdzFIzWO4B7dxoL", "PT0dbs14ZL5XU7ucZcbIZE", "BcuxomgrL001XI6Ss1cXVg5hNCOjYGVW"};
    public static final InterfaceC0972Na<C1248Yf> A0J;
    public static final Object A0K;
    public static final ZE A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public ZG A08;
    public Object A0A;
    @Deprecated
    public Object A0B;
    public boolean A0D;
    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public ZE A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1248Yf A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(A0W);
        ZE A6V = bundle2 != null ? ZE.A08.A6V(bundle2) : ZE.A09;
        long j10 = bundle.getLong(A0Y, -9223372036854775807L);
        long j11 = bundle.getLong(A0Z, -9223372036854775807L);
        long j12 = bundle.getLong(A0P, -9223372036854775807L);
        boolean z10 = bundle.getBoolean(A0T, false);
        boolean z11 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        ZG A6V2 = bundle3 != null ? ZG.A06.A6V(bundle3) : null;
        boolean z12 = bundle.getBoolean(A0S, false);
        long j13 = bundle.getLong(A0N, 0L);
        long j14 = bundle.getLong(A0O, -9223372036854775807L);
        int i10 = bundle.getInt(A0Q, 0);
        int i11 = bundle.getInt(A0U, 0);
        long j15 = bundle.getLong(A0X, 0L);
        C1248Yf c1248Yf = new C1248Yf();
        c1248Yf.A07(A0M, A6V, null, j10, j11, j12, z10, z11, A6V2, j13, j14, i10, i11, j15);
        c1248Yf.A0F = z12;
        return c1248Yf;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{33, 45, 47, 108, 37, 45, 45, 37, 46, 39, 108, 35, 44, 38, 48, 45, 43, 38, 108, 39, 58, 45, 50, 46, 35, 59, 39, 48, 112, 108, 22, 43, 47, 39, 46, 43, 44, 39};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new PH().A03(A02(0, 38, 119)).A00(Uri.EMPTY).A05();
        A0W = AbstractC1672gE.A0h(1);
        A0Y = AbstractC1672gE.A0h(2);
        A0Z = AbstractC1672gE.A0h(3);
        A0P = AbstractC1672gE.A0h(4);
        A0T = AbstractC1672gE.A0h(5);
        A0R = AbstractC1672gE.A0h(6);
        A0V = AbstractC1672gE.A0h(7);
        A0S = AbstractC1672gE.A0h(8);
        A0N = AbstractC1672gE.A0h(9);
        A0O = AbstractC1672gE.A0h(10);
        A0Q = AbstractC1672gE.A0h(11);
        A0U = AbstractC1672gE.A0h(12);
        A0X = AbstractC1672gE.A0h(13);
        A0J = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yg
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                C1248Yf A00;
                A00 = C1248Yf.A00(bundle);
                return A00;
            }
        };
    }

    public final long A04() {
        return AbstractC1672gE.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return AbstractC1672gE.A0P(this.A03);
    }

    public final C1248Yf A07(Object obj, ZE ze, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, ZG zg, long j13, long j14, int i10, int i11, long j15) {
        this.A0C = obj;
        this.A09 = ze != null ? ze : A0L;
        this.A0B = (ze == null || ze.A03 == null) ? null : ze.A03.A03;
        if (A0I[0].length() != 12) {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[5] = "wFH17o3iyIsYs5AJy0JntWwUIx6qz1SD";
        strArr[4] = "3Bf6zvB9WBBYjRVrpgxhF14nZQ8gfffp";
        this.A0A = obj2;
        this.A06 = j10;
        this.A07 = j11;
        this.A04 = j12;
        this.A0G = z10;
        this.A0D = z11;
        this.A0E = zg != null;
        this.A08 = zg;
        this.A02 = j13;
        this.A03 = j14;
        this.A00 = i10;
        this.A01 = i11;
        this.A05 = j15;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C1248Yf c1248Yf = (C1248Yf) obj;
        if (AbstractC1672gE.A1E(this.A0C, c1248Yf.A0C) && AbstractC1672gE.A1E(this.A09, c1248Yf.A09) && AbstractC1672gE.A1E(this.A0A, c1248Yf.A0A) && AbstractC1672gE.A1E(this.A08, c1248Yf.A08) && this.A06 == c1248Yf.A06 && this.A07 == c1248Yf.A07 && this.A04 == c1248Yf.A04 && this.A0G == c1248Yf.A0G && this.A0D == c1248Yf.A0D && this.A0F == c1248Yf.A0F) {
            int i10 = (this.A02 > c1248Yf.A02 ? 1 : (this.A02 == c1248Yf.A02 ? 0 : -1));
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[1].length()) {
                A0I[7] = "tltv1tYAY2jsV3HhUhtKnQZCs9NcUXGU";
                if (i10 == 0) {
                    long j10 = this.A03;
                    long j11 = c1248Yf.A03;
                    String[] strArr2 = A0I;
                    if (strArr2[2].charAt(1) == strArr2[3].charAt(1)) {
                        A0I[0] = "MSl7E3EydAPD";
                        if (j10 == j11 && this.A00 == c1248Yf.A00 && this.A01 == c1248Yf.A01 && this.A05 == c1248Yf.A05) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A0C.hashCode();
        int result2 = ((((7 * 31) + result) * 31) + this.A09.hashCode()) * 31;
        int result3 = this.A0A == null ? 0 : this.A0A.hashCode();
        int result4 = (result2 + result3) * 31;
        int hashCode = this.A08 != null ? this.A08.hashCode() : 0;
        int result5 = (int) (this.A06 ^ (this.A06 >>> 32));
        int result6 = (int) (this.A04 ^ (this.A04 >>> 32));
        int result7 = (((((((result4 + hashCode) * 31) + result5) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + result6) * 31;
        int result8 = this.A0D ? 1 : 0;
        int result9 = (int) (this.A02 ^ (this.A02 >>> 32));
        int result10 = (((((((((result7 + (this.A0G ? 1 : 0)) * 31) + result8) * 31) + (this.A0F ? 1 : 0)) * 31) + result9) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result11 = this.A00;
        int result12 = (int) (this.A05 ^ (this.A05 >>> 32));
        return ((((result10 + result11) * 31) + this.A01) * 31) + result12;
    }
}
