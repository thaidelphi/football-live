package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Dn  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0728Dn extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0E;
    public boolean A00;
    public final C2063mi A01;
    public final C1900k1 A02;
    public final A7 A03;
    public final AF A04;
    public final C0710Cv A05;
    public final C1761hg A06;
    public final AbstractC0722Dh A07;
    public final JK A08;
    public final JL A09;
    public final String A0A;
    public final WeakReference<InterfaceC0727Dm> A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0728Dn(C1900k1 c1900k1, A7 a72, C05987t c05987t, WeakReference<InterfaceC0727Dm> weakReference, int i10, int i11, int i12, int i13, C2063mi c2063mi, String str) {
        super(c1900k1);
        this.A05 = new C0710Cv();
        this.A02 = c1900k1;
        this.A03 = a72;
        this.A01 = c2063mi;
        this.A0B = weakReference;
        this.A0A = str;
        AbstractC2058md A0C2 = this.A01.A0C();
        if (A0C2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        D3.A0K(this, -1);
        this.A04 = new AF(this.A01.A7E(), this.A03);
        this.A08 = A06();
        this.A09 = A07(i10, i13, i11, i12);
        LinearLayout linearLayout = new LinearLayout(c1900k1);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A07 = A04(c05987t);
        if (this.A07 != null) {
            linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A06 = A02(A0C2);
        linearLayout.addView(this.A06, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] - i12) - 99);
            if (A0D[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0D[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0C = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0E = (int) (CP.A02 * 40.0f);
    }

    private C1761hg A02(AbstractC2058md abstractC2058md) {
        C04542c A00;
        C2T A1b = abstractC2058md.A1b();
        C0934Lm c0934Lm = new C0934Lm(this);
        if (getOrientation() == 1) {
            A00 = abstractC2058md.A1a().A01();
        } else {
            C2P A1a = abstractC2058md.A1a();
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0D[7] = "bY8FFe1Y";
            A00 = A1a.A00();
        }
        C1761hg c1761hg = new C1761hg(this.A02, A0E, A00, A1b.A0H().A06(), A09(32, 31, 110), this.A03, c0934Lm, this.A09, this.A05, abstractC2058md.A1c());
        c1761hg.setInfo(A1b.A0G(), A1b.A0H(), this.A01.A7E(), abstractC2058md.A1e().A01(), null, null);
        if (C06419m.A1K(this.A02)) {
            c1761hg.A0N();
        }
        return c1761hg;
    }

    private AbstractC0722Dh A04(C05987t c05987t) {
        View$OnClickListenerC0725Dk view$OnClickListenerC0725Dk = new View$OnClickListenerC0725Dk(this);
        String A0b = this.A01.A0b();
        if (A0H(c05987t, this.A01) && A0b != null) {
            C1751hW c1751hW = new C1751hW(this.A02, this.A03, c05987t, this.A04, view$OnClickListenerC0725Dk);
            String A7E = this.A01.A7E();
            String videoUrl = this.A01.A0E() != null ? this.A01.A0E().getUrl() : null;
            C1751hW videoView = c1751hW.A0F(A7E, A0b, videoUrl, this.A01.A0O(), this.A01.A0N());
            if (C06419m.A1O(this.A02)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        AU A0E2 = this.A01.A0E();
        if (A0E2 != null) {
            C1759he A0F = new C1759he(this.A02, view$OnClickListenerC0725Dk).A0F(A0E2.getUrl());
            if (C06419m.A1M(this.A02)) {
                setViewAsCTA(A0F);
            }
            return A0F;
        }
        return null;
    }

    private C1750hV A06() {
        return new C1750hV(this);
    }

    private JL A07(int i10, int i11, int i12, int i13) {
        JL jl = new JL(this, i10, i11, true, new WeakReference(this.A08), this.A02);
        jl.A0W(i12);
        jl.A0X(i13);
        return jl;
    }

    private void A0C() {
        String A0J = this.A01.A0J();
        if (!TextUtils.isEmpty(A0J)) {
            C2 c22 = new C2();
            C1900k1 c1900k1 = this.A02;
            Uri A00 = C5.A00(A0J);
            String adChoicesLinkUrl = this.A01.A7E();
            C2.A0M(c22, c1900k1, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A04.A04(AE.A0A, null);
        if (!AbstractC04853h.A00(this.A02.A02()).A0O(this.A02, false)) {
            A0C();
            return;
        }
        EH A01 = EI.A01(this.A02, this.A03, this.A01.A7E(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        D3.A0R(this);
        addView(A01, new FrameLayout.LayoutParams(-1, -1));
        A01.A0K();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A09.A0U();
        } else {
            this.A09.A0V();
        }
    }

    public static boolean A0H(C05987t c05987t, C2063mi c2063mi) {
        String A0b = c2063mi.A0b();
        if (TextUtils.isEmpty(A0b)) {
            return false;
        }
        String videoUrl = c05987t.A0S(A0b);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A07 != null) {
            this.A07.A0A();
        }
        if (this.A09 != null) {
            this.A09.A0V();
        }
        D3.A0H(this);
    }

    public final void A0J() {
        if (this.A07 != null) {
            AbstractC0722Dh abstractC0722Dh = this.A07;
            if (A0D[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC0722Dh.A0B();
        }
    }

    private int getOrientation() {
        Activity activity = this.A02.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public JL getViewabilityChecker() {
        return this.A09;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A05.A06(this.A02, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new View$OnClickListenerC0726Dl(this));
    }
}
