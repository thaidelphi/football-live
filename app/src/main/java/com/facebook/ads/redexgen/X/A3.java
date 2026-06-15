package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class A3 {
    public double A00;
    public A9 A01;
    public AA A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final A3 A00(double d10) {
        this.A00 = d10;
        return this;
    }

    public final A3 A01(A9 a92) {
        this.A01 = a92;
        return this;
    }

    public final A3 A02(AA aa2) {
        this.A02 = aa2;
        return this;
    }

    public final A3 A03(String str) {
        this.A03 = str;
        return this;
    }

    public final A3 A04(String str) {
        this.A04 = str;
        return this;
    }

    public final A3 A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final A3 A06(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final A4 A07(AnonymousClass85 anonymousClass85) {
        return new A4(anonymousClass85, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
