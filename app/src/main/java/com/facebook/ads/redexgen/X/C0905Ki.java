package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Ki  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0905Ki extends AbstractC1762hh {
    public static byte[] A0F;
    public static String[] A0G = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC2058md A03;
    public C05987t A04;
    public C04331h A05;
    public C0771Fe A06;
    public C1492dI A07;
    public JK A08;
    public JL A09;
    public String A0A;
    public List<C0821Hc> A0B;
    public boolean A0C;
    public final C1900k1 A0D;
    public final C0710Cv A0E;

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, 18, 5, 23, 1, 18, 4, 5, 4, 54, 9, 4, 5, 15, 33, 4, 36, 1, 20, 1, 34, 21, 14, 4, 12, 5, 118, 110, 108, 117};
    }

    static {
        A0C();
        A0H = (int) (CP.A02 * 48.0f);
        A0I = (int) (CP.A02 * 8.0f);
        A0J = (int) (CP.A02 * 8.0f);
        A0L = (int) (CP.A02 * 56.0f);
        A0K = (int) (CP.A02 * 12.0f);
    }

    public C0905Ki(C1900k1 c1900k1, A7 a72, C05987t c05987t, DR dr, C0966Mu c0966Mu) {
        super(c1900k1, a72, dr, c0966Mu);
        this.A0E = new C0710Cv();
        this.A0C = false;
        super.A07 = true;
        super.A06 = new I7(c1900k1, new C1736hH(), super.A0A.A0s(), dr);
        this.A04 = c05987t;
        this.A0D = c1900k1;
    }

    public C0905Ki(C1900k1 c1900k1, A7 a72, C05987t c05987t, DR dr, C0968Mw c0968Mw) {
        super(c1900k1, a72, dr, c0968Mw);
        this.A0E = new C0710Cv();
        this.A0C = false;
        this.A04 = c05987t;
        this.A0D = c1900k1;
    }

    private AbstractC2058md A00(Intent intent) {
        if (super.A07) {
            return (AbstractC2058md) intent.getSerializableExtra(A0A(14, 25, 103));
        }
        return (AbstractC2058md) intent.getSerializableExtra(A0A(0, 14, 36));
    }

    private final void A0D() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0G[3].charAt(5) != 'n') {
                throw new RuntimeException();
            }
            A0G[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1S();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0E(int i10, Bundle bundle) {
        int extraSpacing;
        int i11;
        int height;
        this.A02 = new LinearLayout(getContext());
        if (i10 == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i12 = CP.A04.widthPixels;
        int i13 = CP.A04.heightPixels;
        if (i10 == 1) {
            extraSpacing = Math.min(i12 - (A0I * 4), i13 / 2);
            i11 = (i12 - extraSpacing) / 8;
            height = i11 * 4;
        } else {
            extraSpacing = i13 - ((A0L + A0H) + (A0I * 4));
            i11 = A0I;
            height = i11 * 2;
        }
        this.A08 = new C1478d4(this);
        this.A09 = new JL(this, 1, new WeakReference(this.A08), this.A0D);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new C04331h(this.A0D);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C1492dI(this.A05, i10, this.A0B, this.A09, bundle);
        int extraSpacing2 = i11;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new C1481d7(this.A0D, this.A0B, this.A03, super.A0C, this.A04, this.A09, this.A0E, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i10, this.A07, super.A0E));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i10 == 1) {
            A0G(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (C06419m.A1s(this.A0D)) {
            this.A0D.A0B().AJs(this.A05, super.A0A.A1g(), false);
        }
        A0Y(this.A02, false, i10);
    }

    private void A0F(AbstractC2058md abstractC2058md) {
        this.A03 = abstractC2058md;
        this.A0A = this.A03.A1g();
        this.A00 = this.A03.A0U();
        this.A01 = this.A03.A0V();
        List<C2T> A1i = this.A03.A1i();
        List<AdInfo> adInfoList = new ArrayList<>(A1i.size());
        this.A0B = adInfoList;
        for (int i10 = 0; i10 < A1i.size(); i10++) {
            List<C0821Hc> list = this.A0B;
            int i11 = A1i.size();
            list.add(new C0821Hc(i10, i11, A1i.get(i10)));
        }
    }

    private void A0G(C1492dI c1492dI) {
        new MK().A0G(this.A05);
        c1492dI.A0Y(new C1471cx(this));
        this.A06 = new C0771Fe(this.A0D, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0J);
        layoutParams.setMargins(0, A0K, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(String str) {
        if (this.A05 == null) {
            return;
        }
        C6K A1G = this.A05.A1G(this.A05.getLayoutManager().A23());
        if (A0G[2].charAt(16) == '1') {
            throw new RuntimeException();
        }
        A0G[2] = "PJpLO9ZPfAu4XWIQIVwsvf9AUacIaZ99";
        C1456ci c1456ci = (C1456ci) A1G;
        if (c1456ci != null && c1456ci.A0j() != null) {
            c1456ci.A0j().A0A(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1762hh
    public final void A0W() {
        A0J(A0A(39, 4, 2));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1762hh
    public final boolean A0e() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AAj(Intent intent, Bundle bundle, C05576e c05576e) {
        AbstractC2058md dataBundle = A00(intent);
        A0Z(c05576e);
        A0F(dataBundle);
        A0E(c05576e.A05().getResources().getConfiguration().orientation, bundle);
        c05576e.A0A(new C1461cn(this, c05576e));
        AbstractC2058md dataBundle2 = super.A0A;
        int unskippableSec = dataBundle2.A1b().A0F().A04();
        if (super.A07) {
            AbstractC2058md dataBundle3 = super.A0A;
            unskippableSec = dataBundle3.A1b().A0F().A03();
        }
        if (unskippableSec > 0) {
            A0X(unskippableSec);
        }
        AbstractC2058md dataBundle4 = super.A0A;
        if (dataBundle4.A1b().A0F().A02() >= 0) {
            super.A0E.setToolbarActionMode(8);
        }
        AbstractC2058md dataBundle5 = super.A0A;
        if (dataBundle5.A1p()) {
            super.A0E.setOnClickListener(new View$OnClickListenerC0824Hf(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1762hh, com.facebook.ads.redexgen.X.DS
    public final void AEP(boolean z10) {
        super.AEP(z10);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1762hh, com.facebook.ads.redexgen.X.DS
    public final void AEs(boolean z10) {
        super.AEs(z10);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AI1(Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1762hh
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1762hh, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AI1(bundle);
        A0D();
        A0E(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1762hh, com.facebook.ads.redexgen.X.DS
    public final void onDestroy() {
        super.onDestroy();
        if (C06419m.A1s(this.A0D)) {
            this.A0D.A0B().AJZ(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0C.AAr(this.A0A, new FB().A03(this.A09).A02(this.A0E).A05());
        }
        A0D();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0E.A06(this.A0D, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
