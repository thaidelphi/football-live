package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.a3  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1297a3 implements InterfaceC0920Kx {
    public static byte[] A02;
    public static final C1297a3 A03;
    public String A01 = A01(1, 7, 98);
    public int A00 = 5;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-33, 1, -6, -9, -6, -5, 3, -6};
    }

    static {
        A05();
        A03 = new C1297a3();
    }

    public static C1297a3 A00() {
        return A03;
    }

    private String A02(String str) {
        if (this.A01 != null) {
            return this.A01 + A01(0, 1, 123) + str;
        }
        return str;
    }

    public static String A03(String str, Throwable th) {
        return str + '\n' + A04(th);
    }

    public static String A04(Throwable th) {
        if (th == null) {
            return A01(0, 0, 21);
        }
        return Log.getStackTraceString(th);
    }

    private void A06(int i10, String str, String str2) {
        Log.println(i10, A02(str), str2);
    }

    private void A07(int i10, String str, String str2, Throwable th) {
        Log.println(i10, A02(str), A03(str2, th));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final void A9j(String str, String str2) {
        A06(4, str, str2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final void A9k(String str, String str2, Throwable th) {
        A07(4, str, str2, th);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final boolean AAN(int i10) {
        return this.A00 <= i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0920Kx
    public final void AIe(int i10) {
        this.A00 = i10;
    }
}
