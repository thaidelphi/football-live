package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class G9 {
    public static byte[] A0H;
    public static String[] A0I = {"pFRbUbIPvfwTsTWtR68DyqtfsQzo0Y9e", "Jmt0yS7cxIqywVTLVazlNOZqViG4fijG", "7JVXgwFSulrh0z9RNSntkrow2", "W96LwBzZpPkBapcy7gGTKWs8B4GUDBcq", "br88nFbBZbLJ3vTh4p9wwCNTIA57FmIY", "mzQptMR0Z3d1fPQPbwNf4EthVYWzR3DW", "IPE7BiI9pZn923UUuncSvZhUL3wMHGrT", "br6hrssh6VRKiVV1vNUkmhf3WWjX02F0"};
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final C2P A0C;
    public final C04522a A0D;
    public final C04562e A0E;
    public final C1900k1 A0F;
    public final DR A0G;
    public int A03 = 16;
    public int A02 = 12;
    public int A01 = 10;
    public int A04 = 20;
    public int A05 = 40;
    public int A06 = 52;
    public int A00 = 10;
    public int A07 = 8;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A0I[2].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[3] = "XwNXbwlUcFi7qEktIehGuIyqazGrk614";
            strArr[1] = "hx9Csixc74t4pIrSAOrr1o5nquGlqFF4";
            copyOfRange[i13] = (byte) (i14 ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{109, 118, 126, 126, 126, 126, 126, 126, 126, 4, 97, 97, 23, 23, 23, 23, 23, 23, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 53, 50, 47, 50, 47, 39, 42, 104, 32, 47, 40, 47, 53, 46, 25, 39, 37, 50, 47, 48, 47, 50, 63, 42, 50, 48, 41};
    }

    static {
        A03();
    }

    public G9(C1900k1 c1900k1, AbstractC2058md abstractC2058md, DR dr) {
        this.A0F = c1900k1;
        this.A0G = dr;
        this.A0D = abstractC2058md.A1b().A0G();
        this.A0E = abstractC2058md.A1b().A0I();
        this.A0C = abstractC2058md.A1a();
        this.A0A = abstractC2058md.A1p();
        this.A09 = abstractC2058md.A1o();
        this.A0B = I1.A00(c1900k1.getResources().getDisplayMetrics());
        A02();
    }

    private ImageView A00(final View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(DC.A01(DB.OTHER_SKIP), this.A04, this.A04, true);
        ImageView imageView = new ImageView(this.A0F);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A01(0, 9, 80)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A01, this.A01, this.A01, this.A01);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.G6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View$OnClickListenerC1689gW.this.A0A(G9.A01(63, 4, 71));
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        return imageView;
    }

    private void A02() {
        this.A03 *= this.A0B;
        this.A02 *= this.A0B;
        this.A01 *= this.A0B;
        this.A04 *= this.A0B;
        this.A05 *= this.A0B;
        this.A06 *= this.A0B;
        this.A00 *= this.A0B;
        this.A07 *= this.A0B;
    }

    private void A04(FrameLayout frameLayout) {
        View view = new View(this.A0F);
        view.setBackgroundColor(Color.parseColor(A01(9, 9, 57)));
        view.setAlpha(0.8f);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
        if (r2 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c8, code lost:
        if (r13.A09 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
        if (r15 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
        r1 = A00(r15);
        r9.addView(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d3, code lost:
        com.facebook.ads.redexgen.X.I1.A01(r13.A0F, r8, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d8, code lost:
        r9.addView(r8, r5);
        r14.addView(r9, new android.widget.FrameLayout.LayoutParams(-1, -2, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f4, code lost:
        if (r2 > 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(android.widget.FrameLayout r14, com.facebook.ads.redexgen.X.View$OnClickListenerC1689gW r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.G9.A05(android.widget.FrameLayout, com.facebook.ads.redexgen.X.gW):void");
    }

    private void A06(View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        view$OnClickListenerC1689gW.setCornerRadiusPx(this.A00);
        view$OnClickListenerC1689gW.setPadding(this.A04, this.A03, this.A04, this.A03);
        view$OnClickListenerC1689gW.setTextSize(14.0f);
        view$OnClickListenerC1689gW.setRoundedCornersEnabled(true);
        view$OnClickListenerC1689gW.A09();
        view$OnClickListenerC1689gW.setIncludeFontPadding(true);
        view$OnClickListenerC1689gW.setLayoutParams(layoutParams);
        view$OnClickListenerC1689gW.setTextColor(-16777216);
        view$OnClickListenerC1689gW.setId(View.generateViewId());
        if (view$OnClickListenerC1689gW.getParent() != null) {
            ((ViewGroup) view$OnClickListenerC1689gW.getParent()).removeView(view$OnClickListenerC1689gW);
        }
    }

    public final View A08(View$OnClickListenerC1689gW view$OnClickListenerC1689gW) {
        return A09(view$OnClickListenerC1689gW, null);
    }

    public final View A09(View$OnClickListenerC1689gW view$OnClickListenerC1689gW, ImageView imageView) {
        this.A08 = imageView != null;
        FrameLayout frameLayout = new FrameLayout(this.A0F);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C0778Fl c0778Fl = new C0778Fl(this.A0F, this.A0C.A01(), true, false, false);
        c0778Fl.A04(this.A0D.A0F(), this.A0D.A0D().toLowerCase(Locale.getDefault()), null, false, false);
        c0778Fl.setAlignment(17);
        c0778Fl.setTitleTextSize(28);
        c0778Fl.setDescriptionTextSize(13);
        c0778Fl.A02();
        c0778Fl.setPadding(this.A05, 0, this.A05, 0);
        LinearLayout linearLayout = new LinearLayout(this.A0F);
        linearLayout.setClickable(true);
        if (C06419m.A1B(this.A0F)) {
            linearLayout.setOnClickListener(new G7(this, view$OnClickListenerC1689gW));
        }
        linearLayout.setPadding(0, -this.A04, 0, 0);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        if (imageView != null) {
            if (imageView.getParent() != null) {
                ((ViewGroup) imageView.getParent()).removeView(imageView);
            }
            linearLayout.addView(imageView);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A07, 0, this.A07);
        linearLayout.addView(c0778Fl, layoutParams);
        if (view$OnClickListenerC1689gW != null) {
            A06(view$OnClickListenerC1689gW);
            linearLayout.addView(view$OnClickListenerC1689gW, layoutParams);
            if (TextUtils.isEmpty(view$OnClickListenerC1689gW.getText())) {
                D3.A0F(view$OnClickListenerC1689gW);
            }
        }
        linearLayout.setAlpha(1.0f);
        A04(frameLayout);
        frameLayout.addView(linearLayout);
        A05(frameLayout, view$OnClickListenerC1689gW);
        return frameLayout;
    }

    public final /* synthetic */ void A0A(View view) {
        this.A0G.A4Z(A01(18, 45, 88));
    }
}
