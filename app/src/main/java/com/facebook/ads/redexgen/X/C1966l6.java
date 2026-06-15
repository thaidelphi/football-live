package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.l6  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1966l6 implements C5P {
    public static byte[] A01;
    public final /* synthetic */ MG A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, 15, 15, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, 15, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C1966l6(MG mg) {
        this.A00 = mg;
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final void A4A(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        C6K A0F = MG.A0F(view);
        if (A0F != null) {
            if (A0F.A0c() || A0F.A0f()) {
                A0F.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + A0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final void A5m(int i10) {
        C6K A0F;
        View view = A77(i10);
        if (view != null && (A0F = MG.A0F(view)) != null) {
            if (!A0F.A0c() || A0F.A0f()) {
                A0F.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + A0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final View A77(int i10) {
        return this.A00.getChildAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final int A78() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final C6K A7B(View view) {
        return MG.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final int A9x(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final void AD3(View view) {
        C6K A0F = MG.A0F(view);
        if (A0F != null) {
            A0F.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final void ADo(View view) {
        C6K A0F = MG.A0F(view);
        if (A0F != null) {
            A0F.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final void AHW() {
        int A78 = A78();
        for (int i10 = 0; i10 < A78; i10++) {
            View A77 = A77(i10);
            this.A00.A1g(A77);
            A77.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final void AHc(int i10) {
        View childAt = this.A00.getChildAt(i10);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C5P
    public final void addView(View view, int i10) {
        this.A00.addView(view, i10);
        this.A00.A1f(view);
    }
}
