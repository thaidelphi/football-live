package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Lx  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0945Lx extends C1972lC {
    public static String[] A08 = {"3Z4oVcBXIxTGfHDkJENHcNR3oKWZn0O4", "rFv82zPhlr6ageKpcxYW53i7WQEhI", "2tYR0SC80tVMegpE61nD", "NxUbiyfiYIyXyrFLuBvPtjT94e88s", "0hjSAQsR9gnR7LOOW", "3YJcpQnZmcsLDiaVOnEQeEpmcgGPkAOH", "Bqc2ZUTwiywYobMvaWapE1roD64Q2E5u", "7wlgBc9wtLyqXjV7RP"};
    public float A00;
    public int A01;
    public int A02;
    public C0946Ly A03;
    public int[] A04;
    public final C1900k1 A05;
    public final HV A06;
    public final HW A07;

    public C0945Lx(C1900k1 c1900k1, HW hw, HV hv) {
        super(c1900k1);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1900k1;
        this.A07 = hw;
        this.A06 = hv;
        this.A01 = -1;
        this.A03 = new C0946Ly(this, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass62
    public final void A1J(C6A c6a, C6H c6h, int i10, int widthMode) {
        int[] iArr;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A26() == 1) || (mode2 == 1073741824 && A26() == 0)) {
            super.A1J(c6a, c6h, i10, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArr = this.A06.A02(this.A01);
        } else {
            iArr = new int[]{0, 0};
            if (c6h.A03() >= 1) {
                int i11 = A0W() > 0 ? 1 : A0W();
                for (int heightMode = 0; heightMode < i11; heightMode++) {
                    View A1m = A1m(heightMode);
                    if (A1m == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1m, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A26() == 0) {
                        iArr[0] = iArr[0] + this.A04[0];
                        if (heightMode == 0) {
                            iArr[1] = this.A04[1] + A0g() + A0d();
                        }
                    } else {
                        iArr[1] = iArr[1] + this.A04[1];
                        if (heightMode == 0) {
                            iArr[0] = this.A04[0] + A0e() + A0f();
                        }
                    }
                }
                int i12 = this.A01;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "c7gaApi93PYPuTyj4vut3Dl9rZW6DyZw";
                strArr2[7] = "eCokdcVdwhThfuMVf9";
                if (i12 != -1) {
                    this.A06.A00(this.A01, iArr);
                }
            }
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        A13(iArr[0], iArr[1]);
    }

    @Override // com.facebook.ads.redexgen.X.C1972lC, com.facebook.ads.redexgen.X.AnonymousClass62
    public final void A1p(int i10) {
        A2B(i10, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.C1972lC, com.facebook.ads.redexgen.X.AnonymousClass62
    public final void A1x(MG mg, C6H c6h, int i10) {
        this.A03.A0A(i10);
        A1L(this.A03);
    }

    public final void A2G(double d10) {
        if (d10 <= 0.0d) {
            d10 = 1.0d;
        }
        this.A00 = (float) (50.0d / d10);
        this.A03 = new C0946Ly(this, this.A05);
    }

    public final void A2H(int i10) {
        this.A01 = i10;
    }

    public final void A2I(int i10) {
        this.A02 = i10;
    }
}
