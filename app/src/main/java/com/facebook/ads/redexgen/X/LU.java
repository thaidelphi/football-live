package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class LU extends AbstractC1646fo {
    public E0 A00;
    public GV A01;
    public C0823He A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public C1492dI A07;
    public final C1900k1 A08;
    public final AbstractC1415c3 A09;
    public final AbstractC1409bx A0A;
    public final AbstractC1407bv A0B;
    public final AbstractC1405bt A0C;
    public final AbstractC1396bk A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C0790Fx A0I;
    public static String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (CP.A02 * 0.0f);
    public static final int A0M = (int) (CP.A02 * 9.0f);
    public static final int A0K = (int) (CP.A02 * 9.0f);

    public LU(C0790Fx c0790Fx, boolean z10, String str, C1492dI c1492dI) {
        super(c0790Fx, z10);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new LZ(this);
        this.A09 = new LY(this);
        this.A0B = new LX(this);
        this.A0A = new LW(this);
        this.A0C = new LV(this);
        this.A0I = c0790Fx;
        this.A07 = c1492dI;
        this.A0E = str;
        this.A08 = c0790Fx.A05();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        D3.A0K(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0D() != null && this.A02 != null) {
            C1355b5 A0D = this.A0I.A0D();
            C1433cL simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            A0D.AAk(simpleVideoView);
            if (C06419m.A2C(getContext())) {
                this.A0I.A0D().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0D() != null) {
            this.A0I.A0D().A05();
            if (this.A02 != null) {
                this.A0I.A0D().AJa(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r3 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A02() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.GV r0 = r4.A01
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r4.A1F()
            if (r0 == 0) goto L25
            boolean r3 = r4.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.LU.A0J
            r0 = 4
            r1 = r1[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            r0 = 83
            if (r1 == r0) goto L35
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LU.A0J
            java.lang.String r1 = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS"
            r0 = 4
            r2[r0] = r1
            if (r3 != 0) goto L2f
        L25:
            boolean r0 = r4.A1F()
            if (r0 != 0) goto L34
            boolean r0 = r4.A04
            if (r0 == 0) goto L34
        L2f:
            com.facebook.ads.redexgen.X.GV r0 = r4.A01
            r0.ACH()
        L34:
            return
        L35:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LU.A02():void");
    }

    private void A03(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        D3.A0I(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A17() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1646fo
    public final void A1B() {
        if (A1F() && this.A02 != null) {
            C0823He c0823He = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c0823He.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1646fo
    public final void A1C() {
        if (A1F()) {
            A1D();
            if (this.A02 != null) {
                this.A02.A05(IP.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1646fo
    public final void A1D() {
        float volume = this.A07.A0P().getVolume();
        if (!A1F() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1646fo
    public final boolean A1E() {
        return A1F() && this.A02 != null && this.A02.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1646fo
    public final boolean A1F() {
        return this.A03;
    }

    public final void A1G(Map<String, String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A1F()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C0823He getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i10 = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z10 = radius == 1;
        if (z10) {
            i10 = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f10 = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f11 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f10, 0.0f, f11, height - radius4);
        if (z10) {
            i10 = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i10, i10, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C04552d c04552d, Map<String, String> extraData) {
        getCtaButton().setCta(c04552d, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new AsyncTaskC1695gc(this.A00, this.A08).A04().A06(new C1679gL(this, null)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z10) {
        this.A03 = z10;
    }

    public void setOnAssetsLoadedListener(GV gv) {
        this.A01 = gv;
    }

    public void setUpImageView(C1900k1 c1900k1) {
        this.A00 = new E0(c1900k1);
        if (C06419m.A1G(c1900k1)) {
            FE.A00(this.A00, C06419m.A1H(c1900k1), new FX(this));
        }
        A04(this.A00);
    }

    public void setUpMediaContainer(C1900k1 c1900k1) {
        this.A06 = new RelativeLayout(c1900k1);
        A04(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A03(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1900k1 c1900k1) {
        this.A02 = new C0823He(c1900k1, new AF(this.A0E, getAdEventManager()));
        if (C06419m.A1I(c1900k1)) {
            FE.A00(this.A02, C06419m.A1J(c1900k1), new FY(this));
        }
        C0823He c0823He = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A04(c0823He);
    }

    private void setUpView(C1900k1 c1900k1) {
        setUpImageView(c1900k1);
        setUpVideoView(c1900k1);
        setUpMediaContainer(c1900k1);
    }

    public void setVideoPlaceholderUrl(String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        C0823He c0823He = this.A02;
        String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c0823He != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
