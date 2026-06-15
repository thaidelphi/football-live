package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.hJ  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1738hJ implements DS {
    public static byte[] A0D;
    public int A00;
    public C1438cQ A01;
    public C0898Kb A02;
    public String A03;
    public final C1900k1 A04;
    public final A7 A05;
    public final DR A06;
    public final E7 A07;
    public final C1433cL A08;
    public final AbstractC1407bv A0C = new C0930Lh(this);
    public final AbstractC1409bx A0B = new C0929Lg(this);
    public final AbstractC1415c3 A09 = new C0928Lf(this);
    public final AbstractC1413c1 A0A = new C0927Le(this);

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, 61, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, 64, 64, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, 63, 32, 45, 44, 38, 28, 27, 5};
    }

    public C1738hJ(C1900k1 c1900k1, E7 e72, A7 a72, DR dr) {
        this.A04 = c1900k1;
        this.A05 = a72;
        this.A07 = e72;
        this.A08 = new C1433cL(c1900k1);
        this.A08.A0h(new KO(c1900k1));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = dr;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        dr.A3v(this.A08, layoutParams);
        DZ closeButton = new DZ(c1900k1);
        closeButton.setOnClickListener(new E5(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        dr.A3v(closeButton, params);
    }

    public final void A04(int i10) {
        this.A08.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AAj(Intent intent, Bundle bundle, C05576e c05576e) {
        String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C0819Ha c0819Ha = new C0819Ha(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * CP.A02);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c0819Ha.setOnClickListener(new E6(this));
            this.A06.A3v(c0819Ha, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 119), 0);
        this.A02 = new C0898Kb(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C06419m.A1t(this.A04)) {
            this.A01 = new C1438cQ(this.A04, this.A05, this.A08, this.A03, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0c(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0g(IP.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEP(boolean z10) {
        this.A06.A4a(A02(37, 21, 39), new C1411bz());
        this.A08.A0Z();
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEs(boolean z10) {
        this.A06.A4a(A02(37, 21, 39), new C1410by());
        if (!this.A08.A0q()) {
            this.A08.A0g(IP.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AI1(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void onDestroy() {
        this.A06.A4a(A02(37, 21, 39), new C1403br(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0j(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A06();
        }
        this.A08.A0d(1);
        this.A08.A0Y();
    }
}
