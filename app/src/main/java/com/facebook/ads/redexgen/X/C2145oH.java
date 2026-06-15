package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.facebook.ads.redexgen.X.oH  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2145oH {
    public static C2145oH A03 = null;
    public final C0980Ni A00;
    public final C2157oT A01;
    public final C2155oR A02;

    public C2145oH(C0980Ni c0980Ni, AbstractC2164oa abstractC2164oa, C2155oR c2155oR, C2157oT c2157oT) {
        this.A00 = c0980Ni;
        this.A01 = c2157oT;
        this.A02 = c2155oR;
        abstractC2164oa.A02(new C0977Nf(c2155oR));
    }

    public static C2145oH A00(C0980Ni c0980Ni, AbstractC2164oa abstractC2164oa, InterfaceC2169of interfaceC2169of, InterfaceC0979Nh interfaceC0979Nh) {
        C2145oH localsTestInstance = A03;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C2157oT c2157oT = new C2157oT(c0980Ni);
        return new C2145oH(c0980Ni, abstractC2164oa, new C2155oR(c0980Ni, interfaceC2169of, C1303a9.A00, interfaceC0979Nh, c2157oT, new Handler(Looper.getMainLooper())), c2157oT);
    }

    public final void A01(InterfaceC2163oZ interfaceC2163oZ) {
        this.A02.A0E(interfaceC2163oZ);
    }

    public final void A02(InterfaceC2160oW interfaceC2160oW) {
        this.A02.A0F(interfaceC2160oW);
    }

    public final void A03(InterfaceC2144oG interfaceC2144oG) {
        A04(interfaceC2144oG, null);
    }

    public final void A04(InterfaceC2144oG interfaceC2144oG, C2172oi c2172oi) {
        if (this.A00.A00 && c2172oi != null) {
            this.A01.A06(interfaceC2144oG, c2172oi);
        } else {
            this.A01.A05(interfaceC2144oG);
        }
    }

    public final void A05(InterfaceC2144oG interfaceC2144oG, C2172oi c2172oi, C2166oc c2166oc) {
        if (this.A00.A00 && c2172oi != null) {
            this.A01.A07(interfaceC2144oG, c2172oi, c2166oc);
        } else {
            this.A01.A08(interfaceC2144oG, c2166oc);
        }
    }

    public final void A06(InterfaceC2144oG interfaceC2144oG, C2166oc c2166oc) {
        A05(interfaceC2144oG, null, c2166oc);
    }
}
