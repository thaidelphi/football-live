package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.He  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0823He extends FrameLayout {
    public static final int A08 = (int) (CP.A02 * 16.0f);
    public C0931Li A00;
    public C1438cQ A01;
    public C0898Kb A02;
    public C1379bT A03;
    public KA A04;
    public IX A05;
    public final C1900k1 A06;
    public final AF A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(A7 a72, String str, Map<String, String> map) {
        A02();
        this.A02 = new C0898Kb(this.A06, a72, this.A00, str, null, map);
        if (C06419m.A1t(this.A06)) {
            this.A01 = new C1438cQ(this.A06, a72, this.A00, str, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C0823He(C1900k1 c1900k1, AF af) {
        super(c1900k1);
        this.A07 = af;
        this.A06 = c1900k1;
        setUpView(c1900k1);
    }

    public final void A01() {
        this.A00.A0k(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A05();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(C9K c9k) {
        this.A00.getEventBus().A05(c9k);
    }

    public final void A05(IP ip) {
        this.A00.A0g(ip, 13);
    }

    public final boolean A06() {
        return this.A00.A0r();
    }

    public C1433cL getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1900k1 c1900k1) {
        this.A00.A0a();
        this.A04 = new KA(c1900k1);
        this.A00.A0h(this.A04);
        this.A03 = new C1379bT(c1900k1, this.A07);
        this.A00.A0h(new KO(c1900k1));
        this.A00.A0h(this.A03);
        this.A05 = new IX(c1900k1, true, this.A07);
        this.A00.A0h(this.A05);
        this.A00.A0h(new C1383bX(this.A05, EnumC0850If.A02, true, true));
        if (!this.A00.A0m()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C1900k1 c1900k1) {
        this.A00 = new C0931Li(c1900k1);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        D3.A0I(this.A00);
        addView(this.A00);
        setOnClickListener(new View$OnClickListenerC0822Hd(this));
    }

    private void setUpView(C1900k1 c1900k1) {
        setUpVideo(c1900k1);
        setUpPlugins(c1900k1);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f10) {
        this.A00.setVolume(f10);
        this.A03.A09();
    }
}
