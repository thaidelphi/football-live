package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class FH extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1900k1 A07;
    public final View$OnClickListenerC1689gW A08;
    public final C0772Ff A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0D(int i10);

    static {
        A01();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public FH(C1900k1 c1900k1, View$OnClickListenerC1689gW view$OnClickListenerC1689gW, int i10, C04542c c04542c, boolean z10, String str, A7 a72, DR dr, JL jl, C0710Cv c0710Cv, C04592h c04592h, boolean z11, String str2) {
        super(c1900k1);
        this.A02 = A00(0, 0, 37);
        D3.A0I(this);
        this.A07 = c1900k1;
        this.A04 = i10;
        this.A03 = z11;
        this.A02 = str2;
        this.A09 = new C0772Ff(c1900k1);
        D3.A0K(this.A09, 0);
        D3.A0I(this.A09);
        if (z11) {
            this.A00 = new LinearLayout(c1900k1);
            this.A01 = new TextView(c1900k1);
            D3.A0I(this.A01);
        }
        if (view$OnClickListenerC1689gW == null) {
            this.A08 = new View$OnClickListenerC1689gW(c1900k1, str, c04542c, z10, a72, dr, jl, c0710Cv, c04592h);
        } else {
            this.A08 = view$OnClickListenerC1689gW;
        }
        D3.A0E(1001, this.A08);
        this.A05 = AbstractC0783Fq.A03(this.A08, A00(0, 9, 52));
        this.A06 = new RelativeLayout(c1900k1);
        this.A06.setLayoutParams(A0B);
        D3.A0I(this.A06);
    }

    public void A0N() {
        this.A09.setOnClickListener(this.A05);
    }

    public final View$OnClickListenerC1689gW getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C04522a c04522a, C04552d c04552d, String str, String str2, CZ cz, FP fp) {
        this.A08.setCta(c04552d, str, new HashMap(), cz, fp);
        new AsyncTaskC1695gc(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i10) {
    }
}
