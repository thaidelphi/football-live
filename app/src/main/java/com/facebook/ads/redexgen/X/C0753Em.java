package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Em  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0753Em extends LinearLayout {
    public static byte[] A0F;
    public static String[] A0G = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0H;
    public static final int A0I;
    public static final Uri A0J;
    public static final View.OnTouchListener A0K;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public InterfaceC0752El A05;
    public C0759Es A06;
    public String A07;
    public final float A08;
    public final WebView A09;
    public final C1900k1 A0A;
    public final InterfaceC0763Ew A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0F = new byte[]{-23, 8, 10, 18, -114, -73, -70, -66, -80, -22, 19, 22, 27, 5, 22, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, -39, -42, -34, -38, -52, -39, -6, -5, 8, 14, 13, -45, -5, 5, -6, 7, 4, 23, 36, 26, 40, 37, 31, 26, -28, 31, 36, 42, 27, 36, 42, -28, 23, 25, 42, 31, 37, 36, -28, 12, -1, -5, 13, 18, 30, 28, -35, 16, 29, 19, 33, 30, 24, 19, -35, 18, 23, 33, 30, 28, 20, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    static {
        A0A();
        A0H = Color.rgb(224, 224, 224);
        A0J = C5.A00(A06(90, 23, 25));
        A0K = new View$OnTouchListenerC0747Eg();
        A0I = Color.argb(34, 0, 0, 0);
    }

    public C0753Em(C1900k1 c1900k1, WebView webView) {
        this(c1900k1, webView, false, false);
    }

    public C0753Em(C1900k1 c1900k1, WebView webView, boolean z10, boolean z11) {
        super(c1900k1);
        this.A08 = getResources().getDisplayMetrics().density;
        this.A0B = new C1731hC(this);
        this.A09 = webView;
        this.A0A = c1900k1;
        this.A0C = AbstractC06429n.A06(c1900k1);
        this.A0E = z10;
        this.A0D = z11;
        A08();
        if (z11) {
            A0C(false);
        }
    }

    private void A08() {
        int buttonSizePx;
        int i10 = (int) (this.A08 * 50.0f);
        D3.A0K(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A0A);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(DC.A01(DB.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0K);
        this.A01.setOnClickListener(new View$OnClickListenerC0748Eh(this));
        addView(this.A01, layoutParams);
        if (this.A0C && !C06419m.A2m(this.A0A)) {
            this.A00 = new ImageView(this.A0A);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            LinearLayout.LayoutParams backButtonParams = new LinearLayout.LayoutParams(i10, i10);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(DC.A01(DB.BACK_ARROW));
            this.A00.setOnTouchListener(A0K);
            this.A00.setOnClickListener(new View$OnClickListenerC0749Ei(this));
            addView(this.A00, backButtonParams);
        }
        this.A06 = new C0759Es(this.A0A);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0C || C06419m.A2m(this.A0A)) {
            buttonSizePx = 1056964608;
        } else {
            buttonSizePx = 1065353216;
        }
        layoutParams2.weight = buttonSizePx;
        this.A06.setGravity(17);
        if (C06419m.A2m(this.A0A) && !this.A0E) {
            this.A04 = new LinearLayout(this.A0A);
            this.A04.setOrientation(1);
            LinearLayout linearLayout = this.A04;
            int i11 = (int) (this.A08 * 2.0f);
            int buttonSizePx2 = (int) (this.A08 * 2.0f);
            linearLayout.setPadding(0, i11, 0, buttonSizePx2);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView = new ImageView(this.A0A);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(DC.A01(DB.HANDLER));
            int i12 = (int) (this.A08 * 4.0f);
            int buttonSizePx3 = (int) (this.A08 * 4.0f);
            imageView.setPadding(0, i12, 0, buttonSizePx3);
            this.A04.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A06, titleViewsParams);
        } else {
            addView(this.A06, layoutParams2);
        }
        if (this.A0C && !C06419m.A2m(this.A0A)) {
            this.A02 = new ImageView(this.A0A);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            LinearLayout.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(i10, i10);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(DC.A02(DB.BACK_ARROW));
            this.A02.setOnTouchListener(A0K);
            this.A02.setOnClickListener(new View$OnClickListenerC0750Ej(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A0A);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i10, i10);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0K);
        this.A03.setOnClickListener(new View$OnClickListenerC0751Ek(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
        if (A06(72, 18, 116).equals(r3.activityInfo.packageName) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
        r3 = com.facebook.ads.redexgen.X.DC.A01(com.facebook.ads.redexgen.X.DB.BROWSER_LAUNCH_CHROME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
        if (A06(72, 18, 116).equals(r3.activityInfo.packageName) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            r7 = this;
            r3 = 0
            com.facebook.ads.redexgen.X.k1 r0 = r7.A0A
            boolean r6 = com.facebook.ads.redexgen.X.C06419m.A0j(r0)
            r4 = 0
            if (r6 != 0) goto L36
            com.facebook.ads.redexgen.X.k1 r0 = r7.A0A
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            if (r5 == 0) goto L36
            r2 = 46
            r1 = 26
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r2 = A06(r2, r1, r0)
            android.net.Uri r0 = com.facebook.ads.redexgen.X.C0753Em.A0J
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r5 = r5.queryIntentActivities(r1, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L4f
            android.widget.ImageView r1 = r7.A03
            r0 = 8
            r1.setVisibility(r0)
        L36:
            com.facebook.ads.redexgen.X.k1 r0 = r7.A0A
            boolean r0 = com.facebook.ads.redexgen.X.C06419m.A2m(r0)
            if (r0 != 0) goto L40
            if (r6 == 0) goto L49
        L40:
            android.widget.ImageView r0 = r7.A03
            r0.setVisibility(r4)
            android.graphics.Bitmap r3 = r7.getExternalBrowserBitmap()
        L49:
            android.widget.ImageView r0 = r7.A03
            r0.setImageBitmap(r3)
            return
        L4f:
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto Ld1
            java.lang.Object r3 = r5.get(r4)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0753Em.A0G
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L74
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L74:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0753Em.A0G
            java.lang.String r1 = "Y9G9nX"
            r0 = 6
            r2[r0] = r1
            android.content.pm.ActivityInfo r0 = r3.activityInfo
            if (r0 == 0) goto Ld1
            java.lang.Object r3 = r5.get(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0753Em.A0G
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto Lba
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0753Em.A0G
            java.lang.String r1 = "hqSHhnICOqiHaN8u87jsv4Qx8TBqcflH"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "kBU630hheaj535sYoezwG0Sk33mkxVnX"
            r0 = 3
            r2[r0] = r1
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r0 = r3.activityInfo
            java.lang.String r3 = r0.packageName
            r2 = 72
            r1 = 18
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Ld1
        Lb2:
            com.facebook.ads.redexgen.X.DB r0 = com.facebook.ads.redexgen.X.DB.BROWSER_LAUNCH_CHROME
            android.graphics.Bitmap r3 = com.facebook.ads.redexgen.X.DC.A01(r0)
            goto L36
        Lba:
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r0 = r3.activityInfo
            java.lang.String r3 = r0.packageName
            r2 = 72
            r1 = 18
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Ld1
            goto Lb2
        Ld1:
            android.graphics.Bitmap r3 = r7.getExternalBrowserBitmap()
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0753Em.A09():void");
    }

    private void A0C(boolean z10) {
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.A00;
        if (A0G[1].charAt(15) == 'W') {
            throw new RuntimeException();
        }
        A0G[2] = "nknH3C2";
        if (imageView != null) {
            this.A00.setVisibility(i10);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (z10) {
            A0C(true);
        }
    }

    public InterfaceC0763Ew getBrowserNavigationListener() {
        return this.A0B;
    }

    private Bitmap getExternalBrowserBitmap() {
        if (this.A0D) {
            return DC.A01(DB.BROWSER_LAUNCH_NATIVE_V2);
        }
        return DC.A01(DB.BROWSER_LAUNCH_NATIVE);
    }

    public void setCloseButtonVisibility(int i10) {
        this.A01.setVisibility(i10);
    }

    public void setListener(InterfaceC0752El interfaceC0752El) {
        this.A05 = interfaceC0752El;
    }

    public void setTitle(String str) {
        this.A06.setTitle(str);
    }

    public void setUrl(String str) {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A06.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0H, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.A06.setSubtitle(this.A07);
        this.A03.setEnabled(true);
        this.A03.setColorFilter((ColorFilter) null);
    }
}
