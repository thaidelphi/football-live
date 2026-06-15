package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* renamed from: com.facebook.ads.redexgen.X.3j  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04873j {
    public static byte[] A03;
    public AF A00;
    public final List<String> A02 = new ArrayList();
    public final List<String> A01 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-53, -45, -39, -30, -40, 27, 15, 28, 15, 21, 19, 13, 15, 18, 13, 30, 32, 19, 20, 19, 32, 19, 28, 17, 19, 33, -7, -6, -2, -13, -7, -8, -3, -23, -3, -17, -10, -17, -19, -2, -17, -18, 66, 67, 48, 65, 67, 0, -2, -16, -3, -22, -11, -6, 0, -3, -7, -16, 4, -36, -51, -34, -60, -58, -46, -60, -50, -60, -40, -54, -54, -50, -45, -52, -60, -39, -51, -50, -40};
    }

    public C04873j() {
    }

    public C04873j(AF af) {
        this.A00 = af;
    }

    public final Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(47, 12, 49), new JSONArray((Collection) this.A02).toString());
        hashMap.put(A00(26, 16, 48), new JSONArray((Collection) this.A01).toString());
        return hashMap;
    }

    public final void A03() {
        this.A02.clear();
        this.A01.clear();
    }

    public final void A04() {
        this.A02.add(A00(5, 21, 84));
        if (this.A00 != null) {
            this.A00.A04(AE.A0B, null);
        }
    }

    public final void A05() {
        this.A02.add(A00(42, 5, 117));
    }

    public final void A06() {
        this.A02.add(A00(59, 20, 11));
        if (this.A00 != null) {
            this.A00.A04(AE.A0C, null);
        }
    }

    public final void A07(int i10) {
        this.A01.add(String.valueOf(i10));
    }

    public final void A08(EnumC04863i enumC04863i) {
        this.A02.add(enumC04863i.A03() + A00(1, 4, 26));
        if (this.A00 != null) {
            this.A00.A04(AE.A09, null);
        }
    }

    public final void A09(EnumC04863i enumC04863i, int i10) {
        this.A02.add(enumC04863i.A03() + A00(0, 1, 18) + i10);
    }

    public final boolean A0A() {
        return (this.A02.isEmpty() && this.A01.isEmpty()) ? false : true;
    }
}
