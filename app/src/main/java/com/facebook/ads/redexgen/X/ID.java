package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class ID {
    public static byte[] A07;
    public final C1433cL A02;
    public final C0939Lr A04;
    public final String A05;
    public final Map<String, String> A06;
    public final AbstractC1412c0 A03 = new C0903Kg(this);
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public ID(C1433cL c1433cL, String str, Map<String, String> extraParams) {
        this.A05 = str;
        this.A02 = c1433cL;
        this.A06 = extraParams;
        this.A04 = new C0939Lr(this.A05);
        this.A02.getEventBus().A05(this.A03);
    }

    public static /* synthetic */ int A00(ID id) {
        int i10 = id.A01;
        id.A01 = i10 + 1;
        return i10;
    }

    public final Map<String, String> A05() {
        String A01 = C0939Lr.A01(this.A04.A03());
        HashMap hashMap = new HashMap();
        if (this.A06 != null) {
            hashMap.putAll(this.A06);
        }
        if (A01 == null) {
            A01 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A01);
        hashMap.put(A02(11, 11, 126), String.valueOf(this.A01));
        int i10 = this.A00 + 1;
        this.A00 = i10;
        hashMap.put(A02(0, 11, 8), String.valueOf(i10));
        return hashMap;
    }

    public final void A06() {
        this.A02.getEventBus().A06(this.A03);
    }
}
