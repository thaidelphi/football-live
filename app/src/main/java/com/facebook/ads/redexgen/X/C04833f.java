package com.facebook.ads.redexgen.X;

import java.io.Serializable;
/* renamed from: com.facebook.ads.redexgen.X.3f  reason: invalid class name and case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C04833f implements Serializable {
    public C04823e A00;
    public C04823e A01;

    public C04833f() {
        this(0.5d, 0.5d);
    }

    public C04833f(double d10) {
        this(d10, 0.5d);
    }

    public C04833f(double d10, double d11) {
        this.A00 = new C04823e(d10);
        this.A01 = new C04823e(d11);
        A02();
    }

    public final C04823e A00() {
        return this.A00;
    }

    public final C04823e A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d10, double d11) {
        this.A00.A09(d10, d11);
    }

    public final void A05(double d10, double d11) {
        this.A01.A09(d10, d11);
    }
}
