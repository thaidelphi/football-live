package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.eD  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1548eD extends FrameLayout implements DS {
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public boolean A01;
    public final AbstractC2058md A02;
    public final C05987t A03;
    public final C1900k1 A04;
    public final A7 A05;
    public final AF A06;
    public final C0710Cv A07;
    public final DQ A08;
    public final DR A09;
    public final EC A0A;
    public final JL A0B;
    public final View$OnSystemUiVisibilityChangeListenerC0705Cq A0C;
    public final JK A0D;

    public abstract DQ A0Z();

    public abstract void A0b();

    public abstract void A0c();

    public abstract void A0e(C05576e c05576e);

    public abstract boolean A0f();

    public AbstractC1548eD(C1900k1 c1900k1, EC ec, A7 a72, AbstractC2058md abstractC2058md, C05987t c05987t, DR dr) {
        super(c1900k1);
        this.A01 = false;
        this.A0D = new C1557eM(this);
        this.A07 = new C0710Cv();
        this.A00 = false;
        this.A04 = c1900k1;
        this.A0A = ec;
        this.A05 = a72;
        this.A02 = abstractC2058md;
        this.A03 = c05987t;
        this.A09 = dr;
        this.A06 = new AF(this.A02.A1g(), this.A05);
        this.A0B = new JL(this, 1, new WeakReference(this.A0D), this.A04);
        this.A0B.A0W(this.A02.A0U());
        this.A0B.A0X(this.A02.A0V());
        this.A08 = A0X();
        this.A0C = new View$OnSystemUiVisibilityChangeListenerC0705Cq(this);
        this.A0C.A05(EnumC0704Cp.A02);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private DQ A0X() {
        DQ A0Z = A0Z();
        A0Z.setFullscreen(true);
        int A04 = this.A02.A1b().A0F().A04();
        A0Z.setPageDetails(this.A02.A1e(), this.A02.A1g(), A04, this.A02.A1f());
        A0Z.A0A(this.A02.A1a().A01(), View$OnClickListenerC1689gW.A09(this.A02));
        if (this.A02.A1b().A0F().A02() == 0) {
            this.A01 = true;
            A0Z.setToolbarActionMode(8);
        } else if (A04 < 0 && this.A02.A1b().A0P()) {
            A0Z.setToolbarActionMode(4);
        }
        if (this.A02.A1b().A0F().A02() >= 0) {
            A0Z.setProgressSpinnerInvisible(true);
        }
        A0Z.setToolbarListener(new C1549eE(this));
        return A0Z;
    }

    private void A0Y() {
        if (this.A02.A1b().A0S()) {
            HM A0F = new HK(this.A04, this.A02.A1b().A0G(), this.A02.A1e()).A0A(this.A02.A1a().A01()).A0F();
            AH.A04(A0F, this.A06, AE.A0U);
            addView(A0F, A0E);
            A0F.A04(new C1550eF(this));
            return;
        }
        A0c();
    }

    public final void A0a() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public final void A0d(int i10, BY by) {
        new CH(i10, new C1556eL(this, i10, by)).A07();
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AAj(Intent intent, Bundle bundle, C05576e c05576e) {
        this.A09.A3v(this, A0E);
        A0e(c05576e);
        A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AI1(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public String getCurrentClientToken() {
        return this.A02.A1g();
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    public void onDestroy() {
        this.A0C.A03();
        if (!TextUtils.isEmpty(this.A02.A1g())) {
            this.A05.AAr(this.A02.A1g(), new FB().A03(this.A0B).A02(this.A07).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A07.A06(this.A04, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(DR dr) {
    }

    public void setUpFullscreenMode(boolean z10) {
        EnumC0704Cp enumC0704Cp;
        if (z10) {
            enumC0704Cp = EnumC0704Cp.A03;
        } else {
            enumC0704Cp = EnumC0704Cp.A02;
        }
        this.A0C.A05(enumC0704Cp);
    }
}
