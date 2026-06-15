package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.hn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1767hn extends DQ {
    public static byte[] A03;
    public C1900k1 A00;
    public DP A01;
    public final E4 A02;

    static {
        A05();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public C1767hn(C1900k1 c1900k1, DR dr, AF af, int i10) {
        super(c1900k1);
        this.A00 = c1900k1;
        setGravity(16);
        A04();
        this.A02 = new E4(this.A00, i10);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new View$OnClickListenerC0716Db(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A06() {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A07() {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A09(float f10, int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A0A(C04542c c04542c, boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public int getToolbarHeight() {
        return DQ.A01;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public DP getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setAdReportingVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setCTAClickListener(View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setFullscreen(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setPageDetails(C04652n c04652n, String str, int i10, C04712t c04712t) {
        this.A02.setInitialUnskippableSeconds(i10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setPageDetailsVisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgress(float f10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressImage(DB db) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressImmediate(float f10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setProgressSpinnerInvisible(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setToolbarActionMode(int i10) {
        this.A02.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public void setToolbarListener(DP dp) {
        this.A01 = dp;
    }
}
