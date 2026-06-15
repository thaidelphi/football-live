package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.ga  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1693ga extends AbstractC04963s {
    public static byte[] A07;
    public static String[] A08 = {"YL1yLKFo15UZj59z8sTirpPX5rRsAE8", "O", "O6aHciR8nIcXgMvSQpLVacnv7HWgT320", "WCwGMxKVAM83NNo23MC3P4tNfApW0jy", "jLj4WTNtvai9N9Pzwov0sYarXBGRxB6J", "t8UiaIyNKCcrJZePb4XsdzT37H29Zzi", "ckjPU6sQ4thPoQS3sFeS4HnUH", ""};
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public final LinearLayout A00;
    public final RelativeLayout A01;
    public final AbstractC2058md A02;
    public final C1900k1 A03;
    public final A7 A04;
    public final C0710Cv A05;
    public final DR A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A03() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A03);
        C0772Ff c0772Ff = new C0772Ff(this.A03);
        new AsyncTaskC1695gc(c0772Ff, this.A03).A05(A0D, A0D).A07(this.A02.A1e().A01());
        c0772Ff.setFullCircleCorners(true);
        D3.A0K(c0772Ff, 0);
        D3.A0I(c0772Ff);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0D, A0D);
        layoutParams.setMargins(A0C, A0C, A0C, A0C);
        layoutParams.addRule(14);
        relativeLayout.addView(c0772Ff, layoutParams);
        TextView textView = new TextView(this.A03);
        D3.A0I(textView);
        textView.setTextColor(this.A02.A1a().A01().A07(true));
        textView.setText(this.A02.A1b().A0G().A0F());
        textView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, c0772Ff.getId());
        relativeLayout.addView(textView, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.A03);
        D3.A0I(linearLayout);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(A0C, 0, A0C, A0C);
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, textView.getId());
        relativeLayout.addView(linearLayout, layoutParams3);
        C0774Fh c0774Fh = new C0774Fh(this.A03, A0B, 5, A0A, -1);
        c0774Fh.setGravity(16);
        linearLayout.addView(c0774Fh, new LinearLayout.LayoutParams(-2, -1));
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(this.A02.A1a().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        D3.A0W(textView2, false, 14);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.leftMargin = A09;
        linearLayout.addView(textView2, layoutParams4);
        if (TextUtils.isEmpty(this.A02.A1b().A0G().A0B())) {
            String[] strArr = A08;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "pDxc6WlcrgExZnzDlKhHZoNjTSnAqRc0";
            strArr2[2] = "JfppCwNpdT1PFGKwLRSAK2lJbowaAIWW";
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            c0774Fh.setRating(Float.parseFloat(this.A02.A1b().A0G().A0B()));
            if (this.A02.A1b().A0G().A08() != null) {
                textView2.setText(A01(0, 1, 116) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A02.A1b().A0G().A08())) + A01(1, 1, 1));
            }
        }
        TextView textView3 = new TextView(this.A03);
        textView3.setTextColor(this.A02.A1a().A01().A07(true));
        textView3.setText(this.A02.A1b().A0G().A04());
        textView3.setGravity(17);
        textView3.setPadding(A0C, A0C, A0C, A0C);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, linearLayout.getId());
        relativeLayout.addView(textView3, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 4;
        layoutParams6.weight = 0.8f;
        this.A00.addView(relativeLayout, layoutParams6);
    }

    public static void A04() {
        A07 = new byte[]{29, 105};
    }

    static {
        A04();
        A0C = (int) (AbstractC04963s.A08 * 12.0f);
        A0D = (int) (AbstractC04963s.A08 * 84.0f);
        A0B = (int) (AbstractC04963s.A08 * 14.0f);
        A09 = (int) (AbstractC04963s.A08 * 8.0f);
        A0A = AnonymousClass43.A02(-1, 77);
    }

    public C1693ga(C1900k1 c1900k1, AbstractC2058md abstractC2058md, A7 a72, DR dr) {
        super(c1900k1);
        this.A05 = new C0710Cv();
        this.A03 = c1900k1;
        this.A02 = abstractC2058md;
        this.A04 = a72;
        this.A06 = dr;
        this.A05.A05();
        setRadius(20.0f);
        setMaxCardElevation(75.0f);
        this.A01 = new RelativeLayout(c1900k1);
        AbstractC0779Fm.A00(c1900k1, this.A01, abstractC2058md.A1b().A0F().A08());
        this.A00 = new LinearLayout(this.A03);
        this.A00.setOrientation(1);
        A03();
        A02();
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A02() {
        View$OnClickListenerC1689gW view$OnClickListenerC1689gW = new View$OnClickListenerC1689gW(this.A03, IV.A04.A03(), this.A02.A1a().A01(), this.A02.A1b().A0H().A06(), this.A04, this.A06, null, this.A05, this.A02.A1c());
        view$OnClickListenerC1689gW.setViewShowsOverMedia(true);
        D3.A0E(1001, view$OnClickListenerC1689gW);
        view$OnClickListenerC1689gW.setCta(this.A02.A1b().A0H(), this.A02.A1g(), new HashMap(), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        view$OnClickListenerC1689gW.setPadding(A0C, A0C, A0C, A0C);
        layoutParams.setMargins(A0C, A0C, A0C, A0C * 2);
        this.A00.addView(view$OnClickListenerC1689gW, layoutParams);
    }
}
