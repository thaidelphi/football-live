package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: com.facebook.ads.redexgen.X.hg  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1761hg extends FH {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (CP.A02 * 36.0f);
    public static final int A05 = (int) (CP.A02 * 4.0f);
    public static final int A03 = (int) (CP.A02 * 8.0f);
    public static final int A04 = (int) (CP.A02 * 4.0f);

    public C1761hg(C1900k1 c1900k1, int i10, C04542c c04542c, boolean z10, String str, A7 a72, DR dr, JL jl, C0710Cv c0710Cv, C04592h c04592h) {
        super(c1900k1, null, i10, c04542c, z10, str, a72, dr, jl, c0710Cv, c04592h, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A02(-16448251, 13, true);
        this.A00 = A02(-10131605, 12, false);
        this.A06.addView(A01(i10), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A01(int i10) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, FH.A0B);
        linearLayout.addView(this.A00, FH.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i10, i10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A02(int i10, int i11, boolean z10) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i10);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        D3.A0W(textView, z10, i11);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public final void A0D(int i10) {
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public final void A0N() {
        super.A0N();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.FH
    public void setInfo(C04522a c04522a, C04552d c04552d, String str, String str2, CZ cz, FP fp) {
        super.setInfo(c04522a, c04552d, str, str2, cz, fp);
        this.A01.setText(c04522a.A0F());
        this.A00.setText(c04522a.A0E());
        if (TextUtils.isEmpty(c04552d.A04())) {
            D3.A0F(this.A08);
        }
    }
}
