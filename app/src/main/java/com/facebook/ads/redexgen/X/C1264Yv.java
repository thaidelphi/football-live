package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Yv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1264Yv implements InterfaceC0973Nb {
    public static byte[] A03;
    public static String[] A04 = {"2CZGfQM4NhUTxD5pXTfzjs0Op9nNL", "9ZGcHr0wqtfUkFixqdWyLKwsL", "fWHJzWpZQxOIbFXRnW0HpFVm8Vs2vB2q", "kSGMSKwZmKi10WQLtPQBX4vrGdm", "rirTP2ExswnuyvczFLF4baUHTOq", "ZKXz0EO7F5WlR0MIonczSXdniPvxHMYV", "FmQfN11j", "rokn5erDdgDdRRF1BArBF2NFzB75q11U"};
    public static final InterfaceC0972Na<C1264Yv> A05;
    public static final C1264Yv A06;
    public static final String A07;
    public static final String A08;
    public final float A00;
    public final float A01;
    public final int A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{99, 95, 82, 74, 81, 82, 80, 88, 99, 82, 65, 82, 94, 86, 71, 86, 65, 64, 27, 64, 67, 86, 86, 87, 14, 22, 29, 1, 85, 31, 19, 67, 90, 71, 80, 91, 14, 22, 29, 1, 85, 26};
    }

    static {
        A02();
        A06 = new C1264Yv(1.0f);
        A08 = AbstractC1672gE.A0h(0);
        A07 = AbstractC1672gE.A0h(1);
        A05 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yw
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                return C1264Yv.A00(bundle);
            }
        };
    }

    public C1264Yv(float f10) {
        this(f10, 1.0f);
    }

    public C1264Yv(float f10, float f11) {
        AbstractC1589es.A07(f10 > 0.0f);
        AbstractC1589es.A07(f11 > 0.0f);
        this.A01 = f10;
        this.A00 = f11;
        this.A02 = Math.round(1000.0f * f10);
    }

    public static /* synthetic */ C1264Yv A00(Bundle bundle) {
        float f10 = bundle.getFloat(A08, 1.0f);
        float pitch = bundle.getFloat(A07, 1.0f);
        return new C1264Yv(f10, pitch);
    }

    public final long A03(long j10) {
        return this.A02 * j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (A04[1].length() != 25) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[5] = "uDHsKYLziYYXqMOO2wSdvPrUTVGVVGFc";
        strArr[2] = "EhrNeVfCC2PBsMHsxIDbmhmSAAkKy3f4";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1264Yv c1264Yv = (C1264Yv) obj;
        return this.A01 == c1264Yv.A01 && this.A00 == c1264Yv.A00;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        return (((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return AbstractC1672gE.A0n(A01(0, 42, 81), Float.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
