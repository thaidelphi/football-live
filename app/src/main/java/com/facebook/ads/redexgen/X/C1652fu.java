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
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.fu  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1652fu extends AbstractC0786Ft {
    public static byte[] A0r;
    public static String[] A0s = {"fr3Y9tf6ePgTPq", "pEcG", "X6n0DjY1D3c56kEYNT7NkudbHULcUpi8", "xLfqb7j3EStc", "2nglUwJ7J1gVDM", "1eQzmRPEbuFcZFemJlVYaDXjMdIAS51D", "mnsD3rfSZRPYnMaeA3V0PZWjFbonJuRI", "JvQjcWyuZKXxmxTpCuNSfYxSgxmPRmOD"};
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public static final int A0y;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Handler A09;
    public View A0A;
    public InputMethodManager A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public RelativeLayout A0E;
    public TextView A0F;
    public AbstractC2058md A0G;
    public BY A0H;
    public C0753Em A0I;
    public C0754En A0J;
    public C1728h9 A0K;
    public View$OnClickListenerC1689gW A0L;
    public C0790Fx A0M;
    public GT A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final Handler A0e;
    public final View A0f;
    public final AbstractC04471v A0g;
    public final AF A0h;
    public final FP A0i;
    public final InterfaceC0769Fc A0j;
    public final C0770Fd A0k;
    public final C1355b5 A0l;
    public final Runnable A0m;
    public final Runnable A0n;
    public final Set<String> A0o;
    public final boolean A0p;
    public final boolean A0q;

    public static String A0J(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0r, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0s;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "BAn7g4Tg6kNh";
            strArr2[1] = "sSvO";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 34);
            i13++;
        }
    }

    public static void A0Z() {
        A0r = new byte[]{8, 92, 83, 86, 92, 84, 96, 76, 80, 74, 77, 92, 90, 119, 112, 110, 107, 106, 65, 115, 123, 106, 118, 113, 122, 96, 102, 112, 103, 118, 121, 124, 118, 126, 74, 115, 124, 121, 97, 112, 103, 112, 113, 79, 81, 86, 92, 87, 79, 64, 89, 94, 104, 84, 67, 86, 104, 85, 66, 67, 67, 88, 89, 78, 87, 80, 102, 78, 92, 91, 102, 80, 87, 74, 77, 88, 85, 85, 102, 91, 76, 77, 77, 86, 87, 121};
    }

    static {
        A0Z();
        A0w = (int) (CP.A02 * 26.0f);
        A0t = (int) (CP.A02 * 4.0f);
        A0y = (int) (CP.A02 * 8.0f);
        A0u = (int) (CP.A02 * 24.0f);
        A0v = AnonymousClass43.A02(-1, 77);
        A0x = (int) (CP.A02 * 12.0f);
    }

    public C1652fu(C0790Fx c0790Fx) {
        super(c0790Fx, true);
        this.A0b = false;
        this.A02 = -1;
        this.A0c = false;
        this.A03 = 0;
        this.A0O = false;
        this.A0W = false;
        this.A0Y = false;
        this.A0Z = false;
        this.A0a = false;
        this.A0X = false;
        this.A0d = false;
        this.A0S = false;
        this.A0U = false;
        this.A0T = false;
        this.A0R = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0V = false;
        this.A0n = new GJ(this);
        this.A0Q = false;
        this.A0o = new HashSet();
        this.A0e = new Handler(Looper.getMainLooper());
        this.A0m = new Runnable() { // from class: com.facebook.ads.redexgen.X.GE
            @Override // java.lang.Runnable
            public final void run() {
                C1652fu.this.A1D();
            }
        };
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0B = (InputMethodManager) c0790Fx.A05().getSystemService(A0J(13, 12, 60));
        this.A0M = c0790Fx;
        this.A0G = this.A0M.A04();
        this.A0h = new AF(c0790Fx.A04().A1g(), c0790Fx.A06());
        this.A0l = this.A0M.A0D();
        if (this.A0l != null) {
            D3.A0I(this.A0l);
        }
        this.A0f = this.A0M.A03();
        this.A0g = C04481w.A01(c0790Fx.A05(), c0790Fx.A06(), c0790Fx.A04().A1g(), C5.A00(c0790Fx.A04().A1b().A0H().A05()), new HashMap(), false, true, this.A0G.A1c());
        this.A0i = new C1657fz(this);
        AbstractC0779Fm.A00(c0790Fx.A05(), this, c0790Fx.A04().A1b().A0F().A08());
        setupLayoutConfiguration(false);
        A0U();
        A0Q();
        this.A0H = new C1656fy(this);
        postDelayed(this.A0H, 1000L);
        A0Y();
        this.A0j = new C1653fv(this);
        C1433cL c1433cL = this.A0M.A02() instanceof C1433cL ? (C1433cL) this.A0M.A02() : null;
        this.A0k = new C0770Fd(c0790Fx, this.A0G, c1433cL, this.A0M.A0C(), this.A0j, this.A0F, this.A0N, this.A0l, this.A0f);
        if (c1433cL != null && C06419m.A1I(getAdContextWrapper())) {
            FE.A00(c1433cL.getVideoImplView(), C06419m.A1J(getAdContextWrapper()), new GK(this));
        } else if (c1433cL == null && this.A0A != null && C06419m.A1G(getAdContextWrapper())) {
            FE.A00(this.A0A, C06419m.A1H(getAdContextWrapper()), new GL(this));
        }
        this.A0E = null;
        this.A0L = null;
        this.A0p = c0790Fx.A04().A1K();
        this.A0q = c0790Fx.A04().A1R();
        getAdContextWrapper().A0F().ABZ(this.A0p, this.A0q, c0790Fx.A04().A1m());
    }

    public C1652fu(C0790Fx c0790Fx, boolean z10) {
        this(c0790Fx);
        String[] split;
        this.A0b = z10;
        AbstractC2058md A04 = c0790Fx.A04();
        this.A0c = this.A0b && A04.A1S();
        if (this.A0b) {
            this.A02 = A04.A0W();
            if (this.A02 == 0) {
                A1D();
            } else if (this.A02 > 0 && this.A02 <= 10000) {
                this.A0e.postDelayed(this.A0m, this.A02);
            }
            String A0t2 = A04.A0t();
            if (!TextUtils.isEmpty(A0t2)) {
                for (String stringToCheck : A0t2.split(A0J(0, 1, 10))) {
                    this.A0o.add(stringToCheck);
                }
            }
        }
    }

    public static /* synthetic */ int A03(C1652fu c1652fu) {
        int i10 = c1652fu.A01;
        c1652fu.A01 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A05(C1652fu c1652fu) {
        int i10 = c1652fu.A08;
        c1652fu.A08 = i10 + 1;
        return i10;
    }

    private void A0K() {
        D3.A0H(this.A0D);
        this.A0D = new LinearLayout(this.A0M.A05());
        D3.A0P(this.A0D, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0O ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0D.setLayoutParams(layoutParams);
        addView(this.A0D, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0L */
    public void A1D() {
        A0f(((N9) this.A0g).A0G().toString());
        A0i(true);
    }

    private void A0M() {
        ExecutorC0712Cx.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.GD
            @Override // java.lang.Runnable
            public final void run() {
                C1652fu.this.A1C();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A1D() && this.A0Q) {
            this.A0Q = false;
            A0g(A0J(25, 18, 55));
        }
    }

    private void A0O() {
        if (this.A0G.A1D() && this.A0Q) {
            this.A0Q = false;
            Map<String, String> A05 = new FB().A03(null).A02(null).A05();
            A05.put(A0J(1, 12, 29), A0J(25, 18, 55));
            getAdEventManager().AAq(this.A0G.A1g(), A05);
        }
    }

    private void A0P() {
        DQ A0B;
        if (this.A0M.A04().A1Q() && (A0B = this.A0M.A0B()) != null) {
            A0B.setProgressSpinnerInvisible(false);
        }
    }

    private void A0Q() {
        D3.A0H(this.A0C);
        this.A0C = new LinearLayout(this.A0M.A05());
        this.A0C.setOrientation(1);
        D3.A0I(this.A0C);
        A0W();
        this.A0C.setBackgroundColor(-1);
        addView(this.A0C);
    }

    private void A0R() {
        if (this.A0f != null) {
            D3.A0H(this.A0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0786Ft.A08, AbstractC0786Ft.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC0786Ft.A07, this.A07, AbstractC0786Ft.A07, AbstractC0786Ft.A07);
            addView(this.A0f, layoutParams);
        }
    }

    private void A0S() {
        if (this.A0l != null) {
            D3.A0H(this.A0l);
            this.A0l.setPadding(A0x, A0x, A0x, A0x);
            this.A0l.A06(-1, A0v, false);
            this.A0l.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0w);
            layoutParams.addRule(12);
            addView(this.A0l, layoutParams);
        }
    }

    private void A0T() {
        DQ A0B = this.A0M.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A0P || A0B.A0B()) ? false : true);
    }

    private void A0U() {
        this.A0A = this.A0M.A02();
        if (this.A0G.A1D()) {
            this.A0A.setOnClickListener(new GM(this));
        }
        D3.A0H(this.A0A);
        D3.A0I(this.A0A);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A0A, 1, layoutParams);
        this.A0F = new TextView(this.A0M.A05());
        D3.A0I(this.A0F);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(getColors().A06(true));
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.setMargins(A0y, A0y / 2, A0y, this.A0l == null ? A0y : A0w);
        addView(this.A0F, layoutParams2);
        D3.A0I(this.A0F);
        this.A0N = new GT(this.A0M.A05(), getCtaButton(), this.A0M.A04(), this.A0M.A06(), this.A0M.A0C(), this.A0M.A0E(), this.A0M.A09(), getColors(), this.A0i);
        this.A0N.setAutoClickTime(this.A0M.A04(), this.A0M.A0B());
        D3.A0E(1001, this.A0N);
        addView(this.A0N);
        A0X();
        A0K();
        if (C06419m.A16(this.A0M.A05())) {
            this.A0D.setOnClickListener(new GN(this));
            if (this.A0M.A0B() != null) {
                this.A0M.A0B().setCTAClickListener(new GO(this));
            }
        }
    }

    private void A0V() {
        this.A0X = true;
        this.A0N.setVisibility(8);
        D3.A0R(this);
        removeCallbacks(this.A0H);
        D3.A0Z(this.A0N);
        D3.A0Z(this.A0l, this.A0f, this.A0k, this.A0F, this.A0I, this.A0M.A0B(), this.A0C, this.A0J);
        if (Build.VERSION.SDK_INT >= 35) {
            ViewParent parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
        if (this.A0A instanceof C1433cL) {
            C1433cL c1433cL = (C1433cL) this.A0A;
            Iterator<IQ> it = c1433cL.getPlugins().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IQ next = it.next();
                if (next instanceof IX) {
                    c1433cL.A0i(next);
                    break;
                }
            }
        }
        addView(new G9(this.A0M.A05(), this.A0G, this.A0M.A0C()).A08(getRegularCtaForEndCard()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (A1G()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0s;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "lVu96jIJ4wtN";
            strArr2[1] = "vEsO";
            this.A0C.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0C;
        String[] strArr3 = A0s;
        if (strArr3[4].length() != strArr3[0].length()) {
            linearLayout.setTranslationY(0.0f);
            this.A0C.setLayoutParams(layoutParams);
            return;
        }
        String[] strArr4 = A0s;
        strArr4[6] = "ao8FhOByUXKbyI2dbjVU10hQSvAA73UK";
        strArr4[5] = "1fPkz4yBU6BXLdgQ7SVXdDzzX5ZOz4LN";
        linearLayout.setTranslationY(0.0f);
        this.A0C.setLayoutParams(layoutParams);
    }

    private void A0X() {
        C04542c adColors;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0O ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0F.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0N.setLayoutParams(layoutParams);
        if (this.A0c && this.A0L != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0O ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0u, 0, A0u, A0u);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                adColors = this.A0M.A04().A1a().A01();
            } else {
                adColors = this.A0M.A04().A1a().A00();
            }
            this.A0L.setUpButtonColors(adColors);
            if (this.A0O) {
                this.A0L.setPadding(A0u, 0, A0u, 0);
            }
            View$OnClickListenerC1689gW view$OnClickListenerC1689gW = this.A0L;
            String[] strArr = A0s;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[6] = "AuovlskRS4ra5LnKaHVdb744ygVoFjY2";
            strArr2[5] = "ls1L1tiwYnJTmONbQbVaT3PDhb5OoAVQ";
            view$OnClickListenerC1689gW.setLayoutParams(layoutParams2);
        }
        this.A0N.A02();
    }

    private void A0Y() {
        if (!this.A0X) {
            A0S();
            A0R();
        }
        A0T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(String str) {
        C1728h9 c1728h9;
        C04542c A00;
        C04542c A002;
        if (this.A0c) {
            D3.A0H(this.A0E);
            D3.A0H(this.A0L);
        }
        D3.A0H(this.A0K);
        C1664g6 c1664g6 = new C1664g6(this);
        if (this.A0M.A05().A0E() == null) {
            this.A0M.A05().A0F().A9l();
        }
        if (!AbstractC06429n.A02(this.A0M.A05()) && this.A0M.A05().A0E() != null) {
            c1728h9 = new C1728h9(this.A0M.A05(), this.A0M.A05().A0E(), c1664g6);
        } else {
            c1728h9 = new C1728h9(this.A0M.A05(), c1664g6);
        }
        this.A0K = c1728h9;
        if (this.A0b) {
            this.A0K.setInterceptRedirectRequest(new InterfaceC0761Eu() { // from class: com.facebook.ads.redexgen.X.g9
                @Override // com.facebook.ads.redexgen.X.InterfaceC0761Eu
                public final boolean AAU(String str2) {
                    return C1652fu.this.A1H(str2);
                }
            });
        }
        if (this.A0G.A1J()) {
            this.A0K.addJavascriptInterface(new C0781Fo(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.GA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1652fu.this.A1E(view);
                }
            }, this.A0K, new InterfaceC0780Fn() { // from class: com.facebook.ads.redexgen.X.g8
                @Override // com.facebook.ads.redexgen.X.InterfaceC0780Fn
                public final void ACd() {
                    C1652fu.this.A1A();
                }
            }), C0781Fo.A01());
        }
        this.A0K.setOnTouchListener(new GG(this));
        setUpBrowserControls(this.A0K);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        if (this.A0c || this.A0G.A1J()) {
            C1900k1 A05 = this.A0M.A05();
            String A0e = this.A0M.A04().A0e();
            if (this.A0M.A00() == 1) {
                A00 = this.A0M.A04().A1a().A01();
            } else {
                A00 = this.A0M.A04().A1a().A00();
            }
            this.A0L = new View$OnClickListenerC1689gW(A05, A0e, A00, this.A0M.A04().A1b().A0H().A06(), this.A0M.A06(), this.A0M.A0C(), this.A0M.A0E(), this.A0M.A09(), this.A0M.A04().A1c());
            this.A0L.setCta(this.A0M.A04().A1b().A0H(), this.A0M.A04().A1g(), new HashMap());
        }
        if (!this.A0c || this.A0L == null) {
            this.A0C.addView(this.A0K, layoutParams);
        } else {
            this.A0E = new RelativeLayout(getContext());
            this.A0E.addView(this.A0K, new RelativeLayout.LayoutParams(-1, -1));
            D3.A0I(this.A0L);
            this.A0L.setRoundedCornersEnabled(A00());
            this.A0L.setViewShowsOverMedia(A0A());
            if (getContext().getResources().getConfiguration().orientation == 1) {
                A002 = this.A0M.A04().A1a().A01();
            } else {
                A002 = this.A0M.A04().A1a().A00();
            }
            this.A0L.setUpButtonColors(A002);
            if (this.A0O) {
                this.A0L.setPadding(A0u, 0, A0u, 0);
            }
            this.A0L.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.GB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1652fu.this.A1F(view);
                }
            });
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0O ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0u, 0, A0u, A0u);
            this.A0E.addView(this.A0L, layoutParams2);
            this.A0C.addView(this.A0E, layoutParams);
        }
        this.A0K.loadUrl(str);
    }

    private void A0g(String str) {
        Map<String, String> A05 = new FB().A03(null).A02(null).A05();
        A05.put(A0J(1, 12, 29), str);
        this.A0h.A04(AE.A0J, A05);
        this.A0M.A0C().A4Z(this.A0G.A0e());
        getAdEventManager().AB3(this.A0G.A1g(), A05);
        if (C06419m.A2L(this.A0M.A05())) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC2097nG.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC2097nG.A05, Boolean.TRUE.toString());
            hashMap.put(AbstractC2097nG.A06, Boolean.TRUE.toString());
            getAdEventManager().ABC(this.A0G.A1g(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        if (this.A0G.A1Y() > 0) {
            if (this.A0G.A1n() && this.A0R) {
                return;
            }
            this.A0R = true;
            A0g(str);
        } else if (this.A0G.A1C()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(boolean z10) {
        if (!z10 && A0m()) {
            return;
        }
        this.A0P = z10;
        if (this.A0b && z10) {
            this.A0e.removeCallbacks(this.A0m);
        }
        ObjectAnimator browserTransAnim = null;
        if (!z10) {
            this.A09.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A08 = 0;
            this.A0S = false;
            this.A0T = false;
            this.A0U = false;
            this.A0R = false;
            A0k(!A0m(), 0);
            A0P();
        }
        if (!this.A0V) {
            postDelayed(new C1658g0(this, z10), 250L);
        }
        String A0J = A0J(85, 1, 34);
        if (z10) {
            browserTransAnim = ObjectAnimator.ofFloat(this.A0N, A0J, this.A0N.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0C;
        float y10 = this.A0C.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0J, y10, i10);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0A, A0J, this.A0A.getY(), 0.0f);
        ofFloat2.setDuration(500L);
        int height = this.A0A.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i11).setDuration(500L);
        duration.addUpdateListener(new GH(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, duration);
        if (browserTransAnim != null) {
            browserTransAnim.setDuration(500L);
            String[] strArr = A0s;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "mPKPZPxIo82o2decuruwdSCyMcOv6Ead";
            strArr2[7] = "qDzceeJQflYxul6669uVFcgsbJgsLatz";
            animatorSet.playTogether(browserTransAnim);
        }
        animatorSet.addListener(new GI(this, z10));
        if (this.A0q && (this.A0A instanceof C1433cL)) {
            ((C1433cL) this.A0A).A0e(animatorSet, z10);
        }
        animatorSet.start();
    }

    private void A0j(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        D3.A0H(this.A0A);
        if (this.A0A == null) {
            this.A0A = this.A0M.A02();
            D3.A0I(this.A0A);
        }
        boolean z11 = this.A0P;
        String[] strArr = A0s;
        if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[2] = "vsQMzuL85pElT0uyLkCOYkbLp6FYZ6Kp";
        strArr2[7] = "Jg0wEDfumSgIDDBadFZcUW5HjHx0Xq4t";
        if (z11) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (C06419m.A1G(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A0A instanceof C1433cL)) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0Q();
        }
        this.A0A.setTranslationY(0.0f);
        addView(this.A0A, 1, layoutParams);
        A0K();
        A0X();
    }

    private void A0k(boolean z10, int i10) {
        if (this.A0I != null && this.A0p) {
            this.A0I.setCloseButtonVisibility(z10 ? 0 : 4);
            C1900k1 adContextWrapper = getAdContextWrapper();
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "GBT9VwLYKrAlXj";
            strArr2[0] = "vffPPOX2qjrj4g";
            adContextWrapper.A0F().ABX(!z10, i10);
        }
    }

    private boolean A0l() {
        return this.A0G.A1b().A0F().A0B() && this.A0a && !this.A0d && !this.A0Y;
    }

    private boolean A0m() {
        return this.A0p && this.A0Z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A0z() {
        if (this.A0b) {
            this.A0e.removeCallbacks(this.A0m);
        }
        A0O();
        super.A0z();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A10() {
        DQ A0B = this.A0M.A0B();
        if (A0B != null) {
            A0B.setPageDetailsVisible((A1G() || A0B.A0B()) ? false : true);
        }
        this.A0a = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A11() {
        if (this.A0M.A0B() != null) {
            this.A0M.A0B().setPageDetailsVisible(false);
        }
        this.A0a = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A12() {
        this.A0Y = false;
        this.A0Z = false;
        A0k(true, 3);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A13() {
        this.A0Y = this.A0G.A1b().A0F().A04() > 0;
        this.A0Z = true;
        A0k(false, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A14(com.facebook.ads.redexgen.X.C2T r6, java.lang.String r7, double r8, android.os.Bundle r10) {
        /*
            r5 = this;
            super.A14(r6, r7, r8, r10)
            com.facebook.ads.redexgen.X.GT r4 = r5.A0N
            com.facebook.ads.redexgen.X.md r0 = r5.A0G
            com.facebook.ads.redexgen.X.2T r0 = r0.A1b()
            com.facebook.ads.redexgen.X.2d r3 = r0.A0H()
            com.facebook.ads.redexgen.X.md r0 = r5.A0G
            java.lang.String r2 = r0.A1g()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.facebook.ads.redexgen.X.FP r0 = r5.A0i
            r4.setCta(r3, r2, r1, r0)
            com.facebook.ads.redexgen.X.2a r0 = r6.A0G()
            java.lang.String r1 = r0.A0E()
            if (r1 == 0) goto L33
            java.lang.String r0 = r1.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L65
        L33:
            android.widget.LinearLayout r1 = r5.A0D
            r0 = 8
            com.facebook.ads.redexgen.X.D3.A0L(r1, r0)
            com.facebook.ads.redexgen.X.Fx r0 = r5.A0M
            com.facebook.ads.redexgen.X.k1 r0 = r0.A05()
            boolean r0 = com.facebook.ads.redexgen.X.C06419m.A16(r0)
            if (r0 == 0) goto L4c
            android.widget.LinearLayout r1 = r5.A0D
            r0 = 0
            r1.setClickable(r0)
        L4c:
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L59
            int r0 = r5.A06
            double r1 = (double) r0
            double r1 = r1 / r8
            int r0 = (int) r1
            r5.A03 = r0
        L59:
            boolean r0 = r5.A0O
            if (r0 == 0) goto L62
            int r0 = r5.A04
        L5f:
            r5.A03 = r0
            return
        L62:
            int r0 = r5.A03
            goto L5f
        L65:
            android.widget.TextView r0 = r5.A0F
            r0.setText(r1)
            com.facebook.ads.redexgen.X.Fx r0 = r5.A0M
            com.facebook.ads.redexgen.X.k1 r0 = r0.A05()
            boolean r0 = com.facebook.ads.redexgen.X.C06419m.A16(r0)
            if (r0 == 0) goto L4c
            android.widget.LinearLayout r4 = r5.A0D
            r3 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1652fu.A0s
            r0 = 2
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L9d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1652fu.A0s
            java.lang.String r1 = "eomTAZA5kOTO"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "I37n"
            r0 = 1
            r2[r0] = r1
            r4.setClickable(r3)
            goto L4c
        L9d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1652fu.A14(com.facebook.ads.redexgen.X.2T, java.lang.String, double, android.os.Bundle):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final void A15(C0897Ka c0897Ka) {
        super.A15(c0897Ka);
        if (this.A0G.A1b().A0I().A04() && !A1G()) {
            A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A16() {
        return !A1G();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A17() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A18(String str) {
        this.A0N.A03(str);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public final boolean A19(boolean z10) {
        if (A1G()) {
            getAdContextWrapper().A0F().ABW();
            A0i(false);
            return true;
        } else if (A0l()) {
            getAdContextWrapper().A0F().ABa();
            this.A0k.A07(this);
            return true;
        } else if (this.A0G.A1b().A0I().A04()) {
            getAdContextWrapper().A0F().ABb();
            if (this.A0A instanceof C1433cL) {
                C1433cL simpleVideoView = (C1433cL) this.A0A;
                simpleVideoView.A0j(true);
            }
            A0V();
            return true;
        } else {
            getAdContextWrapper().A0F().ABY();
            return false;
        }
    }

    public final /* synthetic */ void A1A() {
        this.A0M.A05().A0F().ABd();
    }

    public final /* synthetic */ void A1B() {
        if (this.A0L != null) {
            this.A0M.A05().A0F().ABc();
            this.A0L.A0A(A0J(49, 14, 21));
        }
    }

    public final /* synthetic */ void A1C() {
        if (this.A0L != null) {
            this.A0M.A05().A0F().ABg();
            this.A0L.A0A(A0J(63, 22, 27));
        }
    }

    public final /* synthetic */ void A1E(View view) {
        A0M();
    }

    public final /* synthetic */ void A1F(View view) {
        ExecutorC0712Cx.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.GC
            @Override // java.lang.Runnable
            public final void run() {
                C1652fu.this.A1B();
            }
        });
    }

    public final boolean A1G() {
        return this.A0P;
    }

    public final /* synthetic */ boolean A1H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.A0o.isEmpty()) {
            return true;
        }
        for (String str2 : this.A0o) {
            if (!str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public int getCloseButtonStyle() {
        if (A1G()) {
            return A0m() ? 2 : 3;
        } else if (this.A0G.A1b().A0F().A02() >= 0 && (this.A0Y || this.A0a)) {
            return 8;
        } else {
            if (this.A0Y) {
                return 2;
            }
            if (this.A0G.A1b().A0F().A0B()) {
                return 1;
            }
            if (this.A0a) {
                return 4;
            }
            if (this.A0G.A1b().A0I().A04()) {
                return 1;
            }
            return super.getCloseButtonStyle();
        }
    }

    private View$OnClickListenerC1689gW getRegularCtaForEndCard() {
        View$OnClickListenerC1689gW view$OnClickListenerC1689gW = new View$OnClickListenerC1689gW(getAdContextWrapper(), this.A0M.A04().A0e(), this.A0G.A1a().A01(), getAdEventManager(), this.A0M.A0C(), (JL) null, this.A0M.A09(), this.A0G.A1c());
        view$OnClickListenerC1689gW.setViewShowsOverMedia(true);
        D3.A0I(view$OnClickListenerC1689gW);
        view$OnClickListenerC1689gW.setText(this.A0G.A1b().A0H().A04());
        D3.A0E(1001, view$OnClickListenerC1689gW);
        view$OnClickListenerC1689gW.setCta(this.A0G.A1b().A0H(), this.A0G.A1g(), new HashMap(), null);
        return view$OnClickListenerC1689gW;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0j(A1G());
        A0Y();
        setupLayoutConfiguration(A1G());
        A0W();
        if (this.A0X && Build.VERSION.SDK_INT >= 35) {
            ViewParent parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0786Ft
    public void setChainedWatchAndBrowseSkippableStatus(boolean z10) {
        this.A0Z = !z10;
        A0k(z10, 4);
    }

    public void setChildChainedAd(boolean z10) {
        this.A0V = z10;
    }

    private void setUpBrowserControls(C1728h9 c1728h9) {
        D3.A0H(this.A0I);
        this.A0I = new C0753Em(this.A0M.A05(), c1728h9, true, this.A0q);
        if (this.A0p) {
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "M6ycP1RHJpeE8b";
            strArr2[0] = "ycEZieyXOIyeai";
            A0k(false, 1);
        }
        c1728h9.setBrowserNavigationListener(this.A0I.getBrowserNavigationListener());
        D3.A0I(this.A0I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0I.setListener(new C1665g7(this));
        this.A0I.setOnTouchListener(new GF(this));
        this.A0C.addView(this.A0I, layoutParams);
        D3.A0H(this.A0J);
        this.A0J = new C0754En(this.A0M.A05(), null, 16842872);
        this.A0C.addView(this.A0J, new LinearLayout.LayoutParams(-1, A0t));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0O = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0M.A0B() != null ? this.A0M.A0B().getToolbarHeight() : 0;
        this.A0P = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0J(43, 6, 26));
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
