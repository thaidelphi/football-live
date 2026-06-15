package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.HashMap;
/* renamed from: com.facebook.ads.redexgen.X.Ft  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0786Ft extends RelativeLayout {
    public static final int A07 = (int) (CP.A02 * 16.0f);
    public static final int A08 = (int) (CP.A02 * 28.0f);
    public C04542c A00;
    public boolean A01;
    public final C1900k1 A02;
    public final A7 A03;
    public final View$OnClickListenerC1689gW A04;
    public final C0778Fl A05;
    public final C0790Fx A06;

    public abstract boolean A17();

    public AbstractC0786Ft(C0790Fx c0790Fx, boolean z10) {
        super(c0790Fx.A05());
        C04542c A00;
        this.A06 = c0790Fx;
        this.A02 = c0790Fx.A05();
        this.A03 = c0790Fx.A06();
        if (c0790Fx.A00() == 1) {
            A00 = c0790Fx.A04().A1a().A01();
        } else {
            A00 = c0790Fx.A04().A1a().A00();
        }
        this.A00 = A00;
        this.A01 = z10;
        this.A04 = new View$OnClickListenerC1689gW(c0790Fx.A05(), c0790Fx.A04(), this.A00, c0790Fx.A06(), c0790Fx.A0C(), c0790Fx.A0E(), c0790Fx.A09(), c0790Fx.A08());
        this.A04.setRoundedCornersEnabled(A00());
        this.A04.setViewShowsOverMedia(A0A());
        D3.A0E(1001, this.A04);
        this.A05 = new C0778Fl(this.A02, this.A00, this.A01, A01(), A02());
        D3.A0I(this.A05);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public boolean A0A() {
        return true;
    }

    public void A0J(C1406bu c1406bu) {
    }

    public void A0K(KX kx) {
    }

    public void A0z() {
    }

    public void A10() {
    }

    public void A11() {
    }

    public void A12() {
    }

    public void A13() {
    }

    public void A14(C2T c2t, String str, double d10, Bundle bundle) {
        this.A05.A04(c2t.A0G().A0E(), c2t.A0G().A04(), null, false, !A17() && d10 > 0.0d && d10 < 1.0d);
        this.A04.setCta(c2t.A0H(), str, new HashMap());
    }

    public void A15(C0897Ka c0897Ka) {
    }

    public boolean A16() {
        return true;
    }

    public boolean A18(String str) {
        getCtaButton().A0A(str);
        return true;
    }

    public boolean A19(boolean z10) {
        return false;
    }

    public C1900k1 getAdContextWrapper() {
        return this.A02;
    }

    public A7 getAdEventManager() {
        return this.A03;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C04542c getColors() {
        return this.A00;
    }

    public View$OnClickListenerC1689gW getCtaButton() {
        return this.A04;
    }

    public C0778Fl getTitleDescContainer() {
        return this.A05;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C04542c A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A06.A04().A1a().A01();
        } else {
            A00 = this.A06.A04().A1a().A00();
        }
        this.A00 = A00;
        this.A04.setViewShowsOverMedia(A0A());
        this.A04.setUpButtonColors(this.A00);
        this.A05.A03(this.A00, this.A01);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z10) {
    }
}
