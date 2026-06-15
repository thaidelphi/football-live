package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nJ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC2100nJ<K0, V0> {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{97, 116, 108, 97, 95, 112, 97, 96, 71, 97, 117, 111};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nJ != com.google.common.collect.MultimapBuilder<K0, V0> */
    public AbstractC2100nJ() {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nJ != com.google.common.collect.MultimapBuilder<K0, V0> */
    public /* synthetic */ AbstractC2100nJ(O0 o02) {
        this();
    }

    public static AbstractC2099nI<Object> A00(int expectedKeys) {
        AbstractC1949ko.A00(expectedKeys, A03(0, 12, 125));
        return new O0(expectedKeys);
    }

    public static <K0> AbstractC2099nI<K0> A01(Comparator<K0> comparator) {
        AbstractC1790iD.A04(comparator);
        return new C0997Nz(comparator);
    }

    public static AbstractC2099nI<Comparable> A02() {
        return A01(AbstractC2115nY.A03());
    }
}
