package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.redexgen.X.AF;
import com.facebook.ads.redexgen.X.AbstractC0783Fq;
import com.facebook.ads.redexgen.X.C04542c;
import com.facebook.ads.redexgen.X.C04652n;
import com.facebook.ads.redexgen.X.C04712t;
import com.facebook.ads.redexgen.X.C0735Du;
import com.facebook.ads.redexgen.X.C0820Hb;
import com.facebook.ads.redexgen.X.C1900k1;
import com.facebook.ads.redexgen.X.CP;
import com.facebook.ads.redexgen.X.D3;
import com.facebook.ads.redexgen.X.DB;
import com.facebook.ads.redexgen.X.DO;
import com.facebook.ads.redexgen.X.DP;
import com.facebook.ads.redexgen.X.DQ;
import com.facebook.ads.redexgen.X.DR;
import com.facebook.ads.redexgen.X.E2;
import com.facebook.ads.redexgen.X.View$OnClickListenerC0715Da;
import com.facebook.ads.redexgen.X.View$OnClickListenerC1689gW;
import java.util.Arrays;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class FullScreenAdToolbar extends DQ {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public DO A00;
    public DP A01;
    public DP A02;
    public C0735Du A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final AF A07;
    public final DR A08;
    public final E2 A09;
    public final C0820Hb A0A;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 22);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (CP.A02 * 10.0f);
        A0H = (int) (CP.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (CP.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1900k1 c1900k1, DR dr, AF af, int i10, int i11, boolean z10) {
        super(c1900k1);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z10;
        this.A08 = dr;
        this.A07 = af;
        setGravity(16);
        this.A09 = new E2(c1900k1, i10, z10);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new View$OnClickListenerC0715Da(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c1900k1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C0820Hb(c1900k1);
            D3.A0E(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i11 != -1) {
                A0D(c1900k1, i11);
                return;
            }
            return;
        }
        if (i11 != -1) {
            A0D(c1900k1, i11);
        }
        this.A06 = new RelativeLayout(c1900k1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C0820Hb(c1900k1);
        D3.A0E(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A06() {
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A07() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A08() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A09(float f10, int i10) {
        this.A09.A03(f10, i10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A0A(C04542c c04542c, boolean z10) {
        boolean z11 = this.A04;
        int A05 = c04542c.A05(z11);
        this.A0A.A02(c04542c.A0B(z11), A05);
        boolean z12 = this.A05;
        String A02 = A02(8, 9, 52);
        if (!z12) {
            if (this.A00 != null) {
                this.A00.setIconColors(A05);
                this.A00.setContentDescription(A02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(A05);
            this.A03.setContentDescription(A02);
        }
        this.A09.A04(c04542c, z11, z10);
        if (z11) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            D3.A0Q(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        D3.A0K(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final boolean A0B() {
        return this.A09.A05();
    }

    public final void A0C(C04652n c04652n, String str, int i10) {
        this.A09.setInitialUnskippableSeconds(i10);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c04652n, str, this.A07, this.A08);
            }
        } else if (this.A00 == null) {
        } else {
            this.A00.setAdDetails(c04652n, str, this.A07, this.A08);
        }
    }

    public final void A0D(C1900k1 c1900k1, int i10) {
        if (this.A00 != null) {
            D3.A0H(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new DO(c1900k1, i10);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
            return;
        }
        this.A03 = new C0735Du(c1900k1);
        layoutParams.setMargins(A0F, A0F, A0G, A0F);
        addView(this.A03, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public int getToolbarHeight() {
        return DQ.A00;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public DP getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setAdReportingVisible(boolean z10) {
        A04(!this.A05 ? this.A00 : this.A03, z10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setCTAClickListener(View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        this.A0A.setOnClickListener(AbstractC0783Fq.A03(view$OnClickListenerC1689gW, A02(17, 7, 47)));
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setFullscreen(boolean z10) {
        this.A04 = z10;
    }

    public void setOnlyPageDetails(C04652n c04652n) {
        if (c04652n != null) {
            this.A0A.setPageDetails(c04652n);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setPageDetails(C04652n c04652n, String str, int i10, C04712t c04712t) {
        this.A09.setInitialUnskippableSeconds(i10);
        this.A0A.setPageDetails(c04652n);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c04652n, str, this.A07, this.A08);
            }
        } else if (this.A00 == null) {
        } else {
            this.A00.setAdDetails(c04652n, str, this.A07, this.A08);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setPageDetailsVisible(boolean z10) {
        this.A06.removeAllViews();
        if (z10) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgress(float f10) {
        this.A09.setProgress(f10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressImage(DB db) {
        this.A09.setProgressImage(db);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressImmediate(float f10) {
        this.A09.setProgressImmediate(f10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressSpinnerInvisible(boolean z10) {
        this.A09.setProgressSpinnerInvisible(z10);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            D3.A0O(view, 0, -16777216, A0E);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setToolbarActionMode(int i10) {
        this.A09.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setToolbarListener(DP dp) {
        this.A02 = dp;
    }
}
