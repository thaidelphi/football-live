package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* renamed from: com.facebook.ads.redexgen.X.Nj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0981Nj implements InterfaceC2171oh {
    public static boolean A08;
    public static byte[] A09;
    public static String[] A0A = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC2160oW A00;
    public C2145oH A01;
    public final InterfaceC2175ol A03;
    public final InterfaceC2161oX A04;
    public final C0980Ni A05;
    public final InterfaceC2159oV A06;
    public final LinkedHashMap<Integer, Runnable> A07 = new LinkedHashMap<>();
    public final InterfaceC2160oW A02 = new C0982Nk(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-28, 85, 84, 56, 75, 77, 79, 89, 90, 75, 88, -10, -11, -36, -11, -7, -20, -18, -16, -6, -5, -20, -7};
    }

    static {
        A04();
        A08 = false;
    }

    public C0981Nj(C0980Ni c0980Ni, InterfaceC2175ol interfaceC2175ol, InterfaceC2161oX interfaceC2161oX, InterfaceC2159oV interfaceC2159oV) {
        this.A05 = c0980Ni;
        this.A03 = interfaceC2175ol;
        this.A04 = interfaceC2161oX;
        this.A06 = interfaceC2159oV;
    }

    public static C0981Nj A01() {
        return new C0981Nj(new C0980Ni(), new C0984Nm(), null, null);
    }

    private void A05(AbstractC2164oa abstractC2164oa, InterfaceC2169of interfaceC2169of, InterfaceC0979Nh interfaceC0979Nh) {
        this.A01 = C2145oH.A00(this.A05, abstractC2164oa, interfaceC2169of, interfaceC0979Nh);
        if (0 != 0) {
            this.A01.A01(null);
        }
        this.A01.A02(this.A02);
        String[] strArr = A0A;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A0A[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(InterfaceC2144oG interfaceC2144oG, C2172oi c2172oi) {
        C2145oH c2145oH = this.A01;
        if (c2145oH != null && interfaceC2144oG != null) {
            if (this.A05.A00 && c2172oi != null) {
                c2145oH.A04(interfaceC2144oG, c2172oi);
            } else {
                c2145oH.A03(interfaceC2144oG);
            }
            if (0 != 0) {
                throw new NullPointerException(A02(11, 12, 29));
            }
        }
    }

    private void A07(InterfaceC2144oG interfaceC2144oG, C2172oi c2172oi, C2166oc c2166oc, InterfaceC2158oU interfaceC2158oU) {
        C2145oH c2145oH = this.A01;
        if (c2145oH != null && interfaceC2144oG != null && c2166oc != null) {
            if (this.A05.A00 && c2172oi != null) {
                c2166oc.A02 = interfaceC2144oG.hashCode() + A02(0, 1, 27) + c2166oc.A08 + c2172oi;
                c2145oH.A05(interfaceC2144oG, c2172oi, c2166oc);
            } else {
                c2145oH.A06(interfaceC2144oG, c2166oc);
            }
            if (0 != 0 && interfaceC2158oU != null) {
                throw new NullPointerException(A02(1, 10, 124));
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? C0978Ng.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oc != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2166oc<?, ?> c2166oc) {
        A07(view != null ? C0978Ng.A00(view) : null, null, c2166oc, null);
    }

    public final void A0A(AbstractC2164oa abstractC2164oa, View view) {
        if (abstractC2164oa != null && view != null) {
            A05(abstractC2164oa, new C0983Nl(view, this.A03), new C2R(null));
        }
    }
}
