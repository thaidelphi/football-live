package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Dz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0740Dz extends AbstractC1260Yr {
    public static byte[] A01;
    public static final InterfaceC0972Na<C0740Dz> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{32, 53, 34, 51, 53, 62, 36, 112, 61, 37, 35, 36, 112, 50, 53, 112, 57, 62, 112, 36, 56, 53, 112, 34, 49, 62, 55, 53, 112, 63, 54, 112, 11, 96, 124, 112, 97, 96, 96, 13};
    }

    static {
        A03();
        A03 = AbstractC1672gE.A0h(1);
        A02 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                C0740Dz A00;
                A00 = C0740Dz.A00(bundle);
                return A00;
            }
        };
    }

    public C0740Dz() {
        this.A00 = -1.0f;
    }

    public C0740Dz(float f10) {
        AbstractC1589es.A09(f10 >= 0.0f && f10 <= 100.0f, A02(0, 40, 4));
        this.A00 = f10;
    }

    public static C0740Dz A00(Bundle bundle) {
        AbstractC1589es.A07(bundle.getInt(AbstractC1260Yr.A02, -1) == 1);
        float f10 = bundle.getFloat(A03, -1.0f);
        return f10 == -1.0f ? new C0740Dz() : new C0740Dz(f10);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0740Dz) && this.A00 == ((C0740Dz) obj).A00;
    }

    public final int hashCode() {
        return AbstractC1013Or.A00(Float.valueOf(this.A00));
    }
}
