package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Dx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0738Dx extends AbstractC1260Yr {
    public static byte[] A02;
    public static String[] A03 = {"fetKLtnMCFDfNTa7bwmObcthDo9ngy", "PCLmUJy2ummTCnV", "VcuGkei5vuld", "K82HQX4MuyZYXl7RtFThppOgUf2xURat", "GIJiD0tbUpKlWEo4Ksax6W36ytXEgmkB", "fEKK3qZEhYyP4ktAyJk", "P4giTz2uHY1MhYc22pRWrb", "wQOIq3PUWFgl2b3jPpcViaGbsVCo6pcB"};
    public static final InterfaceC0972Na<C0738Dx> A04;
    public static final String A05;
    public static final String A06;
    public final float A00;
    public final int A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "ZCIykIhk3soNbWZ8AMDjEHj0GXLniP";
            strArr2[6] = "WCNLdM0woplDkVLZGfcH9s";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
            i13++;
        }
    }

    public static void A03() {
        A02 = new byte[]{37, 41, 48, 27, 60, 41, 58, 59, 104, 37, 61, 59, 60, 104, 42, 45, 104, 41, 104, 56, 39, 59, 33, 60, 33, 62, 45, 104, 33, 38, 60, 45, 47, 45, 58, 113, 118, 99, 112, 80, 99, 118, 107, 108, 101, 34, 107, 113, 34, 109, 119, 118, 34, 109, 100, 34, 112, 99, 108, 101, 103, 34, 89, 50, 46, 34, 111, 99, 122, 81, 118, 99, 112, 113, 95};
    }

    static {
        A03();
        A05 = AbstractC1672gE.A0h(1);
        A06 = AbstractC1672gE.A0h(2);
        A04 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Yl
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                C0738Dx A00;
                A00 = C0738Dx.A00(bundle);
                return A00;
            }
        };
    }

    public C0738Dx(int i10) {
        AbstractC1589es.A09(i10 > 0, A02(0, 35, 124));
        this.A01 = i10;
        this.A00 = -1.0f;
    }

    public C0738Dx(int i10, float f10) {
        boolean z10 = true;
        AbstractC1589es.A09(i10 > 0, A02(0, 35, 124));
        AbstractC1589es.A09((f10 < 0.0f || f10 > ((float) i10)) ? false : false, A02(35, 40, 54));
        this.A01 = i10;
        this.A00 = f10;
    }

    public static C0738Dx A00(Bundle bundle) {
        AbstractC1589es.A07(bundle.getInt(AbstractC1260Yr.A02, -1) == 2);
        int i10 = bundle.getInt(A05, 5);
        float starRating = bundle.getFloat(A06, -1.0f);
        int maxStars = (starRating > (-1.0f) ? 1 : (starRating == (-1.0f) ? 0 : -1));
        if (maxStars == 0) {
            return new C0738Dx(i10);
        }
        return new C0738Dx(i10, starRating);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0738Dx) {
            C0738Dx c0738Dx = (C0738Dx) obj;
            return this.A01 == c0738Dx.A01 && this.A00 == c0738Dx.A00;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1013Or.A00(Integer.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
