package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.m6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2025m6 extends BY {
    public static byte[] A01;
    public final /* synthetic */ AbstractC2024m5 A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{7, 38, 48, 55, 49, 44, 58, 99, 52, 34, 48, 99, 45, 44, 55, 99, 32, 34, 47, 47, 38, 39, 109, 123, Byte.MAX_VALUE, 124, 72, 89, 84, 88, 83, 94, 88, 115, 88, 73, 74, 82, 79, 86, 86, 96, 122, 47, 107, 102, 107, 97, 40, 123, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, 39, 38, 47, 105, 96, 125, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, 33, 47, 91, 103, 102, 124, 47, 98, 110, 118, 47, 99, 106, 110, 107, 47, 123, 96, 47, 99, 106, 110, 100, 102, 97, 104, 47, 98, 106, 98, 96, 125, 118, 33, 47, 95, 99, 106, 110, 124, 106, 35, 47, 110, 99, 120, 110, 118, 124, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, 39, 38, 47, 120, 103, 106, 97, 47, 118, 96, 122, 47, 107, 96, 97, 40, 123, 47, 97, 106, 106, 107, 47, 123, 103, 102, 124, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, 47, 110, 97, 118, 47, 98, 96, 125, 106, 33, 56, 41, 48};
    }

    public C2025m6(AbstractC2024m5 abstractC2024m5) {
        this.A00 = abstractC2024m5;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        this.A00.A02.A0F().A3L();
        if (this.A00.A00.A6f() == C3D.A03) {
            return;
        }
        if (!BuildConfigApi.isDebug()) {
            this.A00.A02.A08().ABM(A01(188, 3, 107), AbstractC06048a.A0Y, new C06058b(A01(0, 23, 113)));
        }
        Log.e(A01(23, 17, 15), A01(40, 148, 61));
        this.A00.A08();
    }
}
