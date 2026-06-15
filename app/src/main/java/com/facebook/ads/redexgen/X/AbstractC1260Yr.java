package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Yr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1260Yr implements InterfaceC0973Nb {
    public static byte[] A00;
    public static String[] A01 = {"JgJJF1CzU6a0egwyYWwluC4JPqRLSmrF", "GuwzQkpeHTpwVltJhBqGuMVs8hJPPx94", "rlq2rggQOHnUpuDV", "bqhuc4q3L2It1J22YQtHcY6WMOmrtX8R", "7WylJ8m1xbLSMtwB8kwW13R9Nxtl42lQ", "rodw3ZHLAe3CiUwE", "njYleDb7mIfMlMHhtO7R6Zvy13ONChMX", "W6vmgx6UG27xb4UDe7mRfh3M4CCceGH4"};
    public static final String A02;
    public static final InterfaceC0972Na<AbstractC1260Yr> A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{67, 120, 125, 120, 121, 97, 120, 54, 68, 119, 98, Byte.MAX_VALUE, 120, 113, 66, 111, 102, 115, 44, 54};
    }

    static {
        A07();
        A02 = AbstractC1672gE.A0h(0);
        A03 = new InterfaceC0972Na() { // from class: com.facebook.ads.redexgen.X.Ys
            @Override // com.facebook.ads.redexgen.X.InterfaceC0972Na
            public final InterfaceC0973Nb A6V(Bundle bundle) {
                AbstractC1260Yr A04;
                A04 = AbstractC1260Yr.A04(bundle);
                return A04;
            }
        };
    }

    public static AbstractC1260Yr A04(Bundle bundle) {
        int i10 = bundle.getInt(A02, -1);
        switch (i10) {
            case 0:
                return E3.A02.A6V(bundle);
            case 1:
                InterfaceC0972Na<C0740Dz> interfaceC0972Na = C0740Dz.A02;
                if (A01[6].charAt(20) != 'l') {
                    String[] strArr = A01;
                    strArr[5] = "WmbtHwVt7xYkE9W9";
                    strArr[2] = "SfG0k5wVWRyQey8o";
                    return interfaceC0972Na.A6V(bundle);
                }
                throw new RuntimeException();
            case 2:
                return C0738Dx.A04.A6V(bundle);
            case 3:
                return C0737Dw.A03.A6V(bundle);
            default:
                throw new IllegalArgumentException(A06(0, 20, 75) + i10);
        }
    }
}
