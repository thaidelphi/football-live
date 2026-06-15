package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Kj  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0906Kj extends AbstractC1548eD {
    public static byte[] A0U;
    public static String[] A0V = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public AE A01;
    public DQ A02;
    public AbstractC0786Ft A03;
    public HU A04;
    public I7 A05;
    public IP A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final View A0H;
    public final InterfaceC05636k A0I;
    public final HT A0J;
    public final C1438cQ A0K;
    public final C1433cL A0L;
    public final C0898Kb A0M;
    public final AbstractC1415c3 A0N;
    public final AbstractC1413c1 A0O;
    public final AbstractC1409bx A0P;
    public final AbstractC1407bv A0Q;
    public final AbstractC1405bt A0R;
    public final AbstractC1404bs A0S;
    public final C1355b5 A0T;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0U, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0U = new byte[]{23, 63, 41, 47, 63, 17, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 61, 42, 56, 46, 61, 43, 42, 43, 16, 57, 38, 43, 42, 32, 49, 41, 43, 50};
    }

    static {
        A0F();
    }

    public C0906Kj(C1900k1 c1900k1, EC ec, A7 a72, AbstractC2058md abstractC2058md, C05987t c05987t, DR dr) {
        super(c1900k1, ec, a72, abstractC2058md, c05987t, dr);
        this.A0I = new C1510da(this);
        this.A0R = new C0912Kp(this);
        this.A0Q = new C0911Ko(this);
        this.A0P = new C0910Kn(this);
        this.A0S = new C0909Km(this);
        this.A0N = new C0908Kl(this);
        this.A0O = new C0907Kk(this);
        boolean z10 = false;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0C = false;
        this.A0A = false;
        this.A00 = 0;
        this.A07 = false;
        this.A09 = false;
        this.A01 = AE.A0c;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A0J = new C1505dV(this);
        this.A0L = new C1433cL(super.A04);
        this.A0L.setFunnelLoggingHandler(super.A06);
        this.A0L.getEventBus().A03(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
        this.A0B = abstractC2058md.A1N();
        this.A0M = new C0898Kb(super.A04, super.A05, this.A0L, super.A02.A1g());
        if (C06419m.A1t(super.A04)) {
            this.A0K = new C1438cQ(super.A04, super.A05, this.A0L, super.A02.A1g(), this.A0M, null);
        } else {
            this.A0K = null;
        }
        this.A05 = new I7(super.A04, super.A0A, super.A02.A0s(), dr);
        if (!super.A02.A1P()) {
            this.A0H = new C1379bT(super.A04, super.A06);
        } else {
            this.A0H = new C1378bS(super.A04, super.A06);
        }
        int i10 = -1;
        i10 = (super.A02.A1G() || super.A02.A1P()) ? A02(super.A02) * 1000 : i10;
        if (!super.A02.A1P()) {
            this.A0T = new C1355b5(super.A04, i10);
        } else {
            this.A0T = new C1355b5(super.A04, i10, C1355b5.A0B);
        }
        if (this.A0B || super.A02.A1H()) {
            this.A0T.setVisibility(8);
        }
        A0E();
        this.A0L.setVideoURI(super.A03.A0S(super.A02.A1b().A0F().A09()));
        A0C();
        int A04 = super.A02.A1b().A0F().A04();
        if (C06419m.A2H(super.A04)) {
            this.A0C = A04 == 0;
        } else {
            this.A0C = A04 <= 0;
        }
        if (super.A02.A1b().A0P() && super.A02.A1b().A0F().A03() > 0) {
            z10 = true;
        }
        this.A08 = z10;
        D3.A0K(this, super.A02.A1a().A01().A08(true));
        if (C06419m.A2B(super.A04) || super.A02.A1G()) {
            super.A08.setProgressSpinnerInvisible(true);
        }
        if (super.A02.A1O()) {
            super.A04.A0F().ADm();
        }
    }

    private float A00() {
        float A04 = super.A02.A1b().A0F().A04();
        boolean isRV = super.A0A.A8b().equals(AdPlacementType.REWARDED_VIDEO.toString());
        if (A04 == -1.0f && isRV && super.A02.A1K()) {
            float videoDuration = this.A0L.getDuration();
            if (videoDuration <= 0.0f) {
                return 0.0f;
            }
            return videoDuration;
        } else if (!this.A0B) {
            float serverUnskippableSeconds = this.A0L.getDuration();
            return Math.min(1000.0f * A04, serverUnskippableSeconds);
        } else {
            return 1000.0f * A04;
        }
    }

    private int A01(int i10, int i11, int i12) {
        int i13 = 0;
        if (this.A0B) {
            int i14 = this.A00;
            if (A0V[4].charAt(26) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[0] = "";
            strArr[1] = "GEJnt8SXHB7Z";
            i13 = i12 * i14;
        }
        int completedVideoCycleDuration = i10 / 1000;
        return (i11 - i13) - completedVideoCycleDuration;
    }

    private int A02(AbstractC2058md abstractC2058md) {
        if (abstractC2058md.A0i().equals(A09(18, 14, 49))) {
            return abstractC2058md.A1b().A0F().A03();
        }
        if (abstractC2058md.A0i().equals(A09(6, 12, 112))) {
            return abstractC2058md.A1b().A0F().A04();
        }
        String[] strArr = A0V;
        if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[0] = "";
        strArr2[1] = "oU1GMCkqMMy1";
        return 0;
    }

    private AbstractC0786Ft A05(int i10) {
        C0789Fw A0J = new C0789Fw(super.A04, super.A05, super.A09, super.A02, this.A0L, super.A0B, super.A07).A0H(super.A08.getToolbarHeight()).A0N(super.A08).A0G(i10).A0I(this.A0H).A0O(this.A0T).A0M(this.A02).A0J(super.A06);
        if (super.A02.A1b().A0P() && C06419m.A1W(super.A04) && super.A02.A1b().A0J() != null) {
            A0J.A0L(getPackageInstallListener());
        }
        return AbstractC0787Fu.A00(A0J.A0Q(), null, true);
    }

    private void A0A() {
        if (!super.A02.A1b().A0I().A03()) {
            this.A02 = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 0, super.A02.A1V(), super.A02.A1M());
            this.A02.setFullscreen(true);
            this.A02.A0A(super.A02.A1a().A01(), View$OnClickListenerC1689gW.A09(super.A02));
            this.A02.setPageDetails(super.A02.A1e(), super.A02.A1g(), 0, super.A02.A1f());
            this.A02.setPageDetailsVisible(false);
            this.A02.setToolbarListener(new C1520dk(this));
            if (super.A02.A1p()) {
                this.A02.setOnClickListener(new HO(this));
            }
        }
    }

    private void A0B() {
        this.A0L.postDelayed(new C1518di(this), C06419m.A0N(super.A04));
    }

    private void A0C() {
        this.A0L.postDelayed(new C1517dh(this), C06419m.A0O(super.A04));
    }

    private void A0D() {
        this.A0C = true;
        super.A08.A07();
        if (this.A03 != null) {
            this.A03.A12();
        }
    }

    private void A0E() {
        this.A0L.A0h(this.A0T);
        if (this.A0H instanceof IQ) {
            this.A0L.A0h((IQ) this.A0H);
        }
        if (!TextUtils.isEmpty(super.A02.A1b().A0F().A08())) {
            KA ka = new KA(super.A04, super.A02.A1P());
            this.A0L.A0h(ka);
            ka.setImage(super.A02.A1b().A0F().A08());
        }
        if (!super.A02.A1P()) {
            IX ix = new IX(super.A04, true, super.A06);
            this.A0L.A0h(ix);
            this.A0L.A0h(new C1383bX(ix, EnumC0850If.A02, true));
        }
        this.A0L.A0h(new C0846Ib(super.A04));
    }

    private void A0G(AE ae) {
        new AF(super.A02.A1g(), super.A04.A0A()).A04(ae, null);
        super.A09.A4Z(super.A0A.A6b());
        this.A05.A05();
        if (this.A03 instanceof LS) {
            ((LS) this.A03).A1G();
        }
        this.A0G.postDelayed(new HQ(this), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(AE ae) {
        if (!this.A07) {
            this.A09 = true;
            this.A01 = ae;
            return;
        }
        A0G(ae);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(C0897Ka c0897Ka, boolean z10, boolean z11) {
        if (this.A04 != null) {
            if (z10) {
                super.A04.A0F().ADn();
            }
            super.A04.A0F().ADk();
            this.A04.AHe();
        } else if (this.A0D) {
        } else {
            if (!z10 && this.A08 && this.A0B) {
                this.A00++;
                this.A0L.A0g(IP.A02, 20);
                return;
            }
            if (!this.A0C) {
                A0D();
            }
            this.A0D = true;
            if (this.A03 != null) {
                this.A03.A15(c0897Ka);
            }
            super.A08.setToolbarActionMessage(A09(0, 0, 98));
            A0R(z10, z11);
            super.A08.setToolbarActionMode(getCloseButtonStyle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(KX kx) {
        if (this.A0L.getState() == JI.A02 && C06419m.A1X(super.A04)) {
            this.A0L.postDelayed(new C1513dd(this, kx), ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(KX kx) {
        float f10;
        int A00 = kx.A00();
        int totalSecondsForNextCta = super.A02.A1b().A0F().A02();
        int currentPosMs = super.A02.A1b().A0F().A05();
        int currentPosMs2 = A01(A00, totalSecondsForNextCta, currentPosMs);
        if (totalSecondsForNextCta >= 0 && currentPosMs2 <= 0 && !super.A01 && this.A03 != null && this.A03.A16()) {
            super.A01 = true;
            super.A08.setToolbarActionMode(8);
        }
        if (this.A08) {
            int totalSecondsForNextCta2 = super.A02.A1b().A0F().A03();
            int currentPosMs3 = super.A02.A1b().A0F().A05();
            int A01 = A01(A00, totalSecondsForNextCta2, currentPosMs3);
            AbstractC2058md abstractC2058md = super.A02;
            if (A0V[6].length() != 22) {
                String[] strArr = A0V;
                strArr[0] = "";
                strArr[1] = "CRWrhlQnYLwh";
                if (!View$OnClickListenerC1689gW.A09(abstractC2058md)) {
                    boolean A1O = super.A02.A1O();
                    String A09 = A09(0, 0, 98);
                    if (A1O || super.A02.A1M() || super.A02.A1G()) {
                        super.A08.setToolbarActionMessage(A09);
                    } else if (A01 > 0) {
                        super.A08.setToolbarActionMessage(super.A02.A1f().A02().replace(A09(0, 6, 50), String.valueOf(A01)));
                    } else {
                        super.A08.setToolbarActionMessage(A09);
                    }
                }
                if (A01 <= 0) {
                    A0R(false, false);
                }
            } else {
                throw new RuntimeException();
            }
        }
        float A002 = A00();
        float totalCurrentPosMs = A00;
        if (this.A0B) {
            int totalSecondsForNextCta3 = this.A0L.getDuration();
            int currentPosMs4 = this.A00;
            totalCurrentPosMs += totalSecondsForNextCta3 * currentPosMs4;
        }
        if (super.A02.A1K()) {
            int currentPosMs5 = (A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1));
            if (currentPosMs5 > 0) {
                f10 = totalCurrentPosMs / A002;
            } else {
                f10 = 1.0f;
            }
        } else {
            f10 = totalCurrentPosMs / A002;
        }
        boolean A1M = super.A02.A1M();
        if (A0V[5].charAt(8) != 102) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[7] = "BY5kACpHY7KFfLoLkWPFyXHXe8tQ4ZYS";
        strArr2[2] = "FXqF0wWRYQoNHbRw7kiC8WRpThpP8Fmr";
        if (!A1M) {
            float unskippableSeconds = 100.0f * f10;
            super.A08.setProgress(unskippableSeconds);
        } else {
            int i10 = 0;
            int currentPosMs6 = ((A002 - totalCurrentPosMs) > 0.0f ? 1 : ((A002 - totalCurrentPosMs) == 0.0f ? 0 : -1));
            if (currentPosMs6 > 0) {
                int currentPosMs7 = (int) (A002 - totalCurrentPosMs);
                i10 = currentPosMs7 / 1000;
            }
            DQ dq = super.A08;
            String[] strArr3 = A0V;
            String str = strArr3[7];
            String str2 = strArr3[2];
            int totalSecondsForNextCta4 = str.charAt(8);
            int currentPosMs8 = str2.charAt(8);
            if (totalSecondsForNextCta4 != currentPosMs8) {
                float unskippableSeconds2 = 100.0f * f10;
                dq.A09(unskippableSeconds2, i10);
            } else {
                A0V[3] = "ksHgyK5pJeiIhpnbSmOLRLGEWkwS8h7S";
                float unskippableSeconds3 = 100.0f * f10;
                dq.A09(unskippableSeconds3, i10);
            }
        }
        int currentPosMs9 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (currentPosMs9 >= 0 && !this.A0C) {
            A0D();
            DQ dq2 = super.A08;
            int currentPosMs10 = getCloseButtonStyle();
            dq2.setToolbarActionMode(currentPosMs10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(String str) {
        int i10 = 0;
        int i11 = 0;
        if (this.A0L != null) {
            i10 = this.A0L.getCurrentPositionInMillis();
            i11 = this.A0L.getDuration();
            this.A0L.A0d(3);
        }
        super.A04.A0F().A3Q(str);
        if (C06419m.A1Y(super.A04)) {
            A0N(new C0897Ka(i10, i11), false, true);
            return;
        }
        super.A09.A4Z(super.A0A.A7r());
        super.A09.A4Z(super.A0A.A7m());
    }

    private synchronized void A0R(boolean z10, boolean z11) {
        if (this.A04 != null) {
            this.A08 = false;
            return;
        }
        if (this.A08 && !z10 && !z11) {
            super.A09.A4Z(super.A0A.A6b());
            this.A05.A05();
            this.A08 = false;
            if (this.A03 != null) {
                this.A03.A10();
            }
            return;
        }
        this.A08 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1548eD
    public final DQ A0Z() {
        DQ c1767hn;
        if (!super.A02.A1P()) {
            c1767hn = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 1, super.A02.A1V(), super.A02.A1M());
        } else {
            c1767hn = new C1767hn(super.A04, super.A09, super.A06, 1);
            A0A();
            if (super.A02.A1p()) {
                c1767hn.setOnTouchListener(new HS(this));
            }
        }
        if (super.A02.A1p()) {
            c1767hn.setOnClickListener(new HN(this));
        }
        return c1767hn;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1548eD
    public final void A0b() {
        if (this.A03 != null) {
            super.A06.A04(AE.A0Y, null);
            this.A03.A18(A09(32, 4, 60));
            return;
        }
        super.A06.A04(AE.A0Z, null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1548eD
    public final void A0c() {
        D3.A0J(this.A03);
        this.A0L.setVisibility(4);
        if (!super.A02.A1L()) {
            A0g();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1548eD
    public final void A0e(C05576e c05576e) {
        c05576e.A0A(this.A0I);
        int orientation = c05576e.A05().getResources().getConfiguration().orientation;
        this.A03 = A05(orientation);
        addView(this.A03, AbstractC1548eD.A0E);
        addView(super.A08, new FrameLayout.LayoutParams(-1, super.A08.getToolbarHeight()));
        if (this.A02 != null) {
            addView(this.A02, new FrameLayout.LayoutParams(-1, this.A02.getToolbarHeight()));
            D3.A0F(this.A02);
        }
        D3.A0F(this.A03);
        D3.A0F(super.A08);
        if (super.A02.A1L() && (this.A03 instanceof LS)) {
            ((LS) this.A03).setVideoAdViewListener(this.A0J);
        }
        setUpFullscreenMode(this.A03 != null && this.A03.A17());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1548eD
    public final boolean A0f() {
        if (this.A03 != null) {
            boolean A19 = this.A03.A19(this.A08);
            String[] strArr = A0V;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0V[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (A19) {
                return true;
            }
        }
        return false;
    }

    public final void A0g() {
        this.A0L.setVisibility(0);
        D3.A0J(super.A08);
        this.A0L.setVolume(super.A02.A1b().A0F().A0A() ? 0.0f : 1.0f);
        if (super.A02.A1P()) {
            C1433cL c1433cL = this.A0L;
            if (A0V[3].charAt(17) == 'M') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[7] = "EZroGEyqYXPxT1OpX1Zo9PGFXXX4LGG2";
            strArr[2] = "A8BrNBzgYOoIkIhiYkC2R6mbpOJkqkYa";
            c1433cL.A0b(getResources().getConfiguration().orientation);
        }
        this.A0L.A0g(IP.A02, 20);
        if (this.A03 != null && this.A08) {
            this.A03.A11();
        }
        if (this.A03 != null && !this.A0C) {
            this.A03.A13();
        }
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEP(boolean z10) {
        this.A07 = false;
        if (this.A0L.getVisibility() != 0 || this.A0L.A0p()) {
            return;
        }
        this.A06 = this.A0L.getVideoStartReason();
        this.A0A = z10;
        this.A0L.A0k(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.DS
    public final void AEs(boolean z10) {
        this.A07 = true;
        if (this.A09) {
            this.A09 = false;
            A0G(this.A01);
        }
        if (this.A0L.getVisibility() != 0 || this.A0L.A0q() || this.A0D || this.A0L.getState() == JI.A06 || this.A06 == null) {
            return;
        }
        if (!this.A0A || z10) {
            this.A0L.A0g(this.A06, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A03 != null) {
            return this.A03.getCloseButtonStyle();
        }
        return 0;
    }

    private CZ getPackageInstallListener() {
        return new C1511db(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1548eD, com.facebook.ads.redexgen.X.DS
    public final void onDestroy() {
        super.onDestroy();
        if (C06419m.A1s(super.A04)) {
            super.A04.A0B().AJZ(this.A0L);
        }
        if (this.A03 != null) {
            this.A03.A0z();
        }
        if (this.A0L != null) {
            if (!this.A0D) {
                this.A0L.A0f(II.A05);
            }
            this.A0L.getEventBus().A04(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
            this.A0L.A0Y();
        }
        if (this.A0K != null) {
            this.A0K.A05();
        }
        C0898Kb c0898Kb = this.A0M;
        if (A0V[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0V[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c0898Kb.A0p();
        this.A0G.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(I7 i72) {
        this.A05 = i72;
    }

    public void setVideoLeadingPlayableAdListener(HU hu) {
        this.A04 = hu;
    }
}
