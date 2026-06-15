package com.facebook.ads.redexgen.X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Kr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0914Kr extends AbstractC1603f6 {
    public static byte[] A0n;
    public static String[] A0o = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C04542c A0D;
    public C0753Em A0E;
    public C0754En A0F;
    public C1728h9 A0G;
    public GT A0H;
    public IP A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final AbstractC04471v A0U;
    public final C1900k1 A0V;
    public final AF A0W;
    public final FullScreenAdToolbar A0X;
    public final HI A0Y;
    public final C1438cQ A0Z;
    public final C1433cL A0a;
    public final C0898Kb A0b;
    public final AbstractC1415c3 A0c;
    public final AbstractC1413c1 A0d;
    public final AbstractC1409bx A0e;
    public final AbstractC1407bv A0f;
    public final AbstractC1405bt A0g;
    public final AbstractC1404bs A0h;
    public final C1379bT A0i;
    public final C1355b5 A0j;
    public final Runnable A0k;
    public final boolean A0l;
    public final boolean A0m;

    public static String A0K(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0n, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A0W() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -68, -63, -61, -56, -57, -78, -64, -72, -57, -69, -62, -73, -26, -28, -42, -29, -44, -35, -38, -44, -36, -48, -41, -38, -35, -27, -42, -29, -42, -43, -40, -54, -49, -59, -48, -40, 47};
        String[] strArr = A0o;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0o;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0n = bArr;
    }

    static {
        A0W();
        A0p = (int) (CP.A02 * 4.0f);
        A0q = (int) (CP.A02 * 8.0f);
        A0r = AnonymousClass43.A02(-1, 77);
        A0v = (int) (CP.A02 * 26.0f);
        A0w = (int) (CP.A02 * 12.0f);
        A0t = (int) (CP.A02 * 12.0f);
        A0u = (int) (CP.A02 * 44.0f);
        A0s = (int) (CP.A02 * 8.0f);
    }

    public C0914Kr(C1900k1 c1900k1, A7 a72, FullScreenAdToolbar fullScreenAdToolbar, AbstractC2058md abstractC2058md, C05987t c05987t, EC ec, int i10, DR dr, AF af, int i11, boolean z10, boolean z11, HI hi) {
        super(c1900k1, ec, a72, abstractC2058md, i10, z10, z11, dr);
        C04542c A00;
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0R = true;
        this.A0k = new HC(this);
        this.A0L = false;
        this.A0T = false;
        this.A01 = 0.0f;
        this.A0g = new L0(this);
        this.A0f = new C0921Ky(this);
        this.A0e = new C0918Kv(this);
        this.A0h = new C0917Ku(this);
        this.A0c = new C0916Kt(this);
        this.A0d = new C0915Ks(this);
        this.A0X = fullScreenAdToolbar;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c1900k1.getSystemService(A0K(12, 12, 28));
        this.A0U = C04481w.A01(c1900k1, a72, abstractC2058md.A1g(), C5.A00(abstractC2058md.A1b().A0H().A05()), new HashMap(), false, true, abstractC2058md.A1c());
        this.A0V = c1900k1;
        this.A0W = af;
        this.A0i = new C1379bT(this.A0V, this.A0W);
        this.A0j = new C1355b5(this.A0V, -1);
        this.A0Y = hi;
        if (i11 == 1) {
            A00 = super.A05.A1a().A01();
        } else {
            A00 = super.A05.A1a().A00();
        }
        this.A0D = A00;
        this.A0a = new C1433cL(this.A0V);
        this.A0a.getEventBus().A03(this.A0g, this.A0f, this.A0e, this.A0h, this.A0c, this.A0d);
        this.A0b = new C0898Kb(c1900k1, a72, this.A0a, abstractC2058md.A1g());
        A0T();
        this.A0a.setVideoURI(c05987t.A0S(super.A05.A1b().A0F().A09()));
        A0Q();
        A0N();
        A0M();
        AbstractC0779Fm.A00(this.A0V, this, abstractC2058md.A1b().A0F().A08());
        setupLayoutConfiguration(false);
        A0S();
        A0R();
        postDelayed(new C1564eT(this), 1000L);
        if (C06419m.A1s(this.A0V)) {
            this.A0V.A0B().AJs(this.A0a, super.A05.A1g(), true);
        }
        if (C06419m.A1t(this.A0V)) {
            this.A0Z = new C1438cQ(this.A0V, a72, this.A0a, super.A05.A1g(), this.A0b, null);
        } else {
            this.A0Z = null;
        }
        A0X(abstractC2058md.A1b());
        this.A0l = super.A05.A1K();
        this.A0m = super.A05.A1R();
        c1900k1.A0F().ABZ(this.A0l, this.A0m, true);
    }

    public static /* synthetic */ float A03(C0914Kr c0914Kr, float f10) {
        float f11 = c0914Kr.A01 + f10;
        c0914Kr.A01 = f11;
        return f11;
    }

    public static /* synthetic */ int A05(C0914Kr c0914Kr) {
        int i10 = c0914Kr.A02;
        c0914Kr.A02 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A07(C0914Kr c0914Kr) {
        int i10 = c0914Kr.A07;
        c0914Kr.A07 = i10 + 1;
        return i10;
    }

    private void A0L() {
        D3.A0H(this.A0B);
        this.A0B = new LinearLayout(this.A0V);
        D3.A0P(this.A0B, this.A0V);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0M() {
        this.A0j.A06(-1, A0r, false);
        this.A0j.setPadding(A0w, A0w, A0w, A0w);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0v);
        layoutParams.addRule(12);
        addView(this.A0j, layoutParams);
    }

    private void A0N() {
        this.A0i.setPadding(A0t, A0t, A0t, A0t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0u, A0u);
        layoutParams.setMargins(0, DQ.A00, A0s, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0a, videoViewParams);
        addView(this.A0i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        if (super.A05.A1D() && this.A0L) {
            this.A0L = false;
            A0g(A0K(24, 18, 58));
        }
    }

    private void A0P() {
        if (super.A05.A1D() && this.A0L) {
            this.A0L = false;
            Map<String, String> A05 = new FB().A03(null).A02(null).A05();
            A05.put(A0K(0, 12, 87), A0K(24, 18, 58));
            super.A07.AAq(super.A05.A1g(), A05);
        }
    }

    private void A0Q() {
        postDelayed(new C1569eY(this), C06419m.A0O(this.A0V));
    }

    private void A0R() {
        D3.A0H(this.A0A);
        this.A0A = new LinearLayout(this.A0V);
        this.A0A.setOrientation(1);
        D3.A0I(this.A0A);
        A0U();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0S() {
        View view = this.A0a;
        if (super.A05.A1D()) {
            view.setOnClickListener(new HE(this));
        }
        D3.A0H(view);
        D3.A0I(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new TextView(this.A0V);
        View mMediaView = this.A0C;
        D3.A0I(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A06(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0q, A0q / 2, A0q, A0v);
        View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        View mMediaView3 = this.A0C;
        D3.A0I(mMediaView3);
        this.A0H = new GT(this.A0V, null, super.A05, super.A07, super.A0A, super.A0C, super.A09, getColors(), new C1575ee(this));
        View mMediaView4 = this.A0H;
        D3.A0E(1001, mMediaView4);
        View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0V();
        A0L();
        if (C06419m.A16(this.A0V)) {
            this.A0B.setOnClickListener(new H6(this));
            View mMediaView6 = this.A0X;
            if (mMediaView6 != null) {
                this.A0X.setCTAClickListener(new H7(this));
            }
        }
    }

    private void A0T() {
        this.A0a.A0h(this.A0j);
        this.A0a.A0h(this.A0i);
        if (!TextUtils.isEmpty(super.A05.A1b().A0F().A08())) {
            KA ka = new KA(this.A0V);
            this.A0a.A0h(ka);
            ka.setImage(super.A05.A1b().A0F().A08());
        }
        this.A0a.A0h(new C0846Ib(this.A0V));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0A;
        String[] strArr = A0o;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0o[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0V() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0X(C2T c2t) {
        double A00 = AbstractC0783Fq.A00(c2t);
        String A0E = c2t.A0G().A0E();
        if (A0E == null || A0E.trim().length() == 0) {
            D3.A0L(this.A0B, 8);
            if (C06419m.A16(this.A0V)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(A0E);
            if (C06419m.A16(this.A0V)) {
                this.A0B.setClickable(true);
            }
        }
        if (A00 > 0.0d) {
            this.A03 = (int) (this.A06 / A00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0e(KX kx) {
        if (this.A0a.getState() == JI.A02 && C06419m.A1X(this.A0V)) {
            postDelayed(new C1566eV(this, kx), ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(String str) {
        C1728h9 c1728h9;
        D3.A0H(this.A0G);
        C1574ed c1574ed = new C1574ed(this);
        if (this.A0V.A0E() == null) {
            this.A0V.A0F().A9l();
        }
        boolean A02 = AbstractC06429n.A02(this.A0V);
        if (A0o[6].charAt(12) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0o;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (A02 || this.A0V.A0E() == null) {
            c1728h9 = new C1728h9(this.A0V, c1574ed);
        } else {
            c1728h9 = new C1728h9(this.A0V, this.A0V.A0E(), c1574ed);
        }
        this.A0G = c1728h9;
        this.A0G.setOnTouchListener(new H8(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0g(String str) {
        Map<String, String> A05 = new FB().A03(null).A02(null).A05();
        A05.put(A0K(0, 12, 87), str);
        this.A0W.A04(AE.A0J, A05);
        super.A0A.A4Z(super.A05.A0e());
        super.A07.AB3(super.A05.A1g(), A05);
        if (C06419m.A2L(this.A0V)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC2097nG.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC2097nG.A05, Boolean.TRUE.toString());
            hashMap.put(AbstractC2097nG.A06, Boolean.TRUE.toString());
            super.A07.ABC(super.A05.A1g(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        if (super.A05.A1Y() > 0) {
            if (super.A05.A1n()) {
                boolean z10 = this.A0M;
                if (A0o[1].charAt(27) != 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0o;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z10) {
                    return;
                }
            }
            this.A0M = true;
            A0g(str);
            return;
        }
        boolean A1C = super.A05.A1C();
        if (A0o[1].charAt(27) == 'i') {
            String[] strArr2 = A0o;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!A1C) {
                return;
            }
        } else if (!A1C) {
            return;
        }
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(boolean z10) {
        if (!z10 && this.A0l && !this.A0R) {
            return;
        }
        this.A0K = z10;
        ObjectAnimator objectAnimator = null;
        if (!z10) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String A0K = A0K(48, 1, 127);
        if (z10) {
            objectAnimator = ObjectAnimator.ofFloat(this.A0H, A0K, this.A0H.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float y10 = this.A0A.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0K, y10, i10);
        ofFloat.setDuration(500L);
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(this.A0a, A0K, this.A0a.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0a.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i11).setDuration(500L);
        duration.addUpdateListener(new HA(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.addListener(new HB(this, z10));
        if (this.A0m) {
            this.A0a.A0e(animatorSet, z10);
        }
        animatorSet.start();
    }

    private void A0j(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        D3.A0H(this.A0a);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0R();
        }
        this.A0a.setTranslationY(0.0f);
        addView(this.A0a, 1, layoutParams);
        A0L();
        A0V();
    }

    private void A0k(boolean z10, int i10) {
        this.A0V.A0F().ABX(!z10, i10);
        if (this.A0E == null) {
            return;
        }
        this.A0E.setCloseButtonVisibility(z10 ? 0 : 4);
    }

    private final boolean A0l() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final void A11() {
        A0P();
        if (C06419m.A1s(this.A0V)) {
            this.A0V.A0B().AJZ(this.A0a);
        }
        if (this.A0Z != null) {
            C1438cQ c1438cQ = this.A0Z;
            if (A0o[6].charAt(12) != 'v') {
                throw new RuntimeException();
            }
            A0o[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            c1438cQ.A05();
        }
        if (this.A0a != null) {
            this.A0a.getEventBus().A04(this.A0g, this.A0f, this.A0e, this.A0h, this.A0c, this.A0d);
            D3.A0F(this.A0a);
            this.A0a.A0Y();
        }
        this.A0b.A0p();
        D3.A0Z(this.A0a, this.A0j, this.A0i);
        super.A0C.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final void A14() {
        this.A0a.setVolume(super.A05.A1b().A0F().A0A() ? 0.0f : 1.0f);
        this.A0a.A0g(IP.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final void A15(boolean z10) {
        this.A0R = z10;
        A0k(z10, 4);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final void A16(boolean z10) {
        if (this.A0a.A0p()) {
            return;
        }
        this.A0I = this.A0a.getVideoStartReason();
        this.A0S = z10;
        this.A0a.A0k(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final void A17(boolean z10) {
        if (this.A0a.getState() != JI.A06) {
            IP ip = this.A0I;
            String[] strArr = A0o;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (ip != null) {
                if (!this.A0S || z10) {
                    this.A0a.A0g(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final boolean A18() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final boolean A19() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public final boolean A1A(String str) {
        if (!A0l()) {
            this.A0H.A03(str);
            return true;
        }
        return false;
    }

    public C04542c getColors() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public HG getFullScreenAdStyle() {
        return new HG(true, HG.A06, super.A05.A1a().A01(), View$OnClickListenerC1689gW.A09(super.A05), super.A05.A1a().A01().A08(true), super.A05.A1b().A0F().A08());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6
    public C0710Cv getTouchDataRecorder() {
        return super.A09;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1603f6, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0j(A0l());
        setupLayoutConfiguration(A0l());
        A0U();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A17(false);
        } else {
            A16(false);
        }
    }

    private void setUpBrowserControls(C1728h9 c1728h9) {
        D3.A0H(this.A0E);
        this.A0E = new C0753Em(this.A0V, c1728h9, true, this.A0m);
        if (this.A0l) {
            A0k(this.A0R, 1);
        }
        c1728h9.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        D3.A0I(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new C1573ec(this));
        this.A0E.setOnTouchListener(new H9(this));
        this.A0A.addView(this.A0E, layoutParams);
        D3.A0H(this.A0F);
        this.A0F = new C0754En(this.A0V, null, 16842872);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0p));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0V.getSystemService(A0K(42, 6, 42));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
