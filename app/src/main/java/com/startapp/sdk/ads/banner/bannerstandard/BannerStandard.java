package com.startapp.sdk.ads.banner.bannerstandard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.ironsource.cc;
import com.startapp.d2;
import com.startapp.d8;
import com.startapp.e;
import com.startapp.eb;
import com.startapp.f;
import com.startapp.j6;
import com.startapp.j9;
import com.startapp.k0;
import com.startapp.l0;
import com.startapp.l3;
import com.startapp.m0;
import com.startapp.m5;
import com.startapp.n5;
import com.startapp.n9;
import com.startapp.o0;
import com.startapp.o9;
import com.startapp.p4;
import com.startapp.q5;
import com.startapp.r5;
import com.startapp.s7;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.mraid.bridge.a;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.v5;
import com.startapp.w5;
import com.startapp.y;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {
    public static final /* synthetic */ int N = 0;
    public BannerListener A;
    public boolean B;
    public AdInformationObject C;
    public RelativeLayout D;
    public RelativeLayout E;
    public CloseableLayout F;
    public s7 G;
    public j6 H;
    public MraidBannerController I;
    public ViewGroup J;
    public final s7.b K;
    public final Runnable L;
    public final Runnable M;

    /* renamed from: q  reason: collision with root package name */
    public BannerStandardAd f22570q;

    /* renamed from: r  reason: collision with root package name */
    public long f22571r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f22572s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f22573t;
    public WebView twoPartWebView;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f22574u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f22575v;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f22576w;
    public WebView webView;

    /* renamed from: x  reason: collision with root package name */
    public long f22577x;

    /* renamed from: y  reason: collision with root package name */
    public BannerOptions f22578y;

    /* renamed from: z  reason: collision with root package name */
    public final o0 f22579z;

    /* renamed from: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$4  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class AnonymousClass4 implements View.OnTouchListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            BannerStandard.this.f22572s = true;
            return false;
        }
    }

    /* renamed from: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$5  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class AnonymousClass5 implements View.OnLongClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class MraidBannerController extends a implements m5 {
        private MraidState mraidState;
        private boolean mraidVisibility;
        private final q5 nativeFeatureManager;
        private final r5 orientationProperties;
        private v5 resizeProperties;
        private MraidBannerController twoPart;
        private eb viewabilityTracker;
        private final WebView webView;

        public MraidBannerController(WebView webView, a.InterfaceC0252a interfaceC0252a) {
            super(interfaceC0252a);
            this.webView = webView;
            this.nativeFeatureManager = new q5(BannerStandard.this.getContext());
            this.orientationProperties = new r5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVisibilityTracker() {
            if (this.viewabilityTracker == null) {
                this.viewabilityTracker = new eb(this.webView, BannerMetaData.f22541b.a(), new eb.a() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.MraidBannerController.1
                    @Override // com.startapp.eb.a
                    public boolean onUpdate(boolean z10) {
                        s7 s7Var;
                        MraidBannerController.this.fireViewableChangeEvent(z10);
                        if (!z10 || (s7Var = BannerStandard.this.G) == null) {
                            return true;
                        }
                        s7Var.b();
                        return true;
                    }
                });
            }
            MraidBannerController mraidBannerController = this.twoPart;
            if (mraidBannerController != null) {
                mraidBannerController.addVisibilityTracker();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z10) {
            if (this.mraidVisibility == z10) {
                return;
            }
            this.mraidVisibility = z10;
            o9.a(this.webView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z10));
        }

        private void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                float f10 = i10;
                float f11 = i11;
                o9.a(webView, true, "mraid.setScreenSize", Integer.valueOf(Math.round(f10 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(f11 / context.getResources().getDisplayMetrics().density)));
                Point point = BannerStandard.this.f22579z.f22339a;
                n5.b(context, i12, i13, point.x, point.y, webView);
                o9.a(webView, true, "mraid.setMaxSize", Integer.valueOf(Math.round(f10 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(f11 / context.getResources().getDisplayMetrics().density)));
                Point point2 = BannerStandard.this.f22579z.f22339a;
                n5.a(context, i12, i13, point2.x, point2.y, webView);
            } catch (Throwable th) {
                l3.a(th);
            }
        }

        public void cancelViewabilityTracking() {
            eb ebVar = this.viewabilityTracker;
            if (ebVar != null) {
                ebVar.f21916a.removeCallbacksAndMessages(null);
                this.viewabilityTracker = null;
            }
            MraidBannerController mraidBannerController = this.twoPart;
            if (mraidBannerController != null) {
                mraidBannerController.cancelViewabilityTracking();
            }
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void close() {
            BannerStandard.a(BannerStandard.this);
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void expand(String str) {
            BannerStandard bannerStandard = BannerStandard.this;
            int i10 = BannerStandard.N;
            bannerStandard.a();
            boolean z10 = !TextUtils.isEmpty(str);
            if (z10) {
                BannerStandard bannerStandard2 = BannerStandard.this;
                bannerStandard2.f22572s = false;
                if (bannerStandard2.twoPartWebView == null) {
                    bannerStandard2.twoPartWebView = com.startapp.sdk.components.a.a(bannerStandard2.getContext()).f23225a.a().c();
                }
                MraidBannerController mraidBannerController = bannerStandard2.I;
                if (mraidBannerController != null) {
                    mraidBannerController.initTwoPart(bannerStandard2.twoPartWebView);
                }
                bannerStandard2.twoPartWebView.setId(159868226);
                WebView webView = bannerStandard2.twoPartWebView;
                webView.setBackgroundColor(0);
                webView.setHorizontalScrollBarEnabled(false);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setVerticalScrollBarEnabled(false);
                webView.setOnTouchListener(new AnonymousClass4());
                webView.setOnLongClickListener(new AnonymousClass5());
                webView.setLongClickable(false);
                bannerStandard2.twoPartWebView.loadUrl(str);
            }
            if (getState() == MraidState.DEFAULT) {
                BannerStandard bannerStandard3 = BannerStandard.this;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (z10) {
                    CloseableLayout closeableLayout = bannerStandard3.F;
                    if (closeableLayout != null) {
                        closeableLayout.addView(bannerStandard3.twoPartWebView, layoutParams);
                    }
                } else {
                    RelativeLayout relativeLayout = bannerStandard3.E;
                    if (relativeLayout != null) {
                        relativeLayout.removeView(bannerStandard3.webView);
                        bannerStandard3.E.setVisibility(4);
                    }
                    CloseableLayout closeableLayout2 = bannerStandard3.F;
                    if (closeableLayout2 != null) {
                        closeableLayout2.addView(bannerStandard3.webView, layoutParams);
                    }
                }
                if (bannerStandard3.J == null) {
                    bannerStandard3.J = bannerStandard3.o();
                }
                bannerStandard3.J.addView(bannerStandard3.F, new FrameLayout.LayoutParams(-1, -1));
            } else if (getState() == MraidState.RESIZED && z10) {
                BannerStandard bannerStandard4 = BannerStandard.this;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                CloseableLayout closeableLayout3 = bannerStandard4.F;
                if (closeableLayout3 != null) {
                    closeableLayout3.removeView(bannerStandard4.webView);
                }
                RelativeLayout relativeLayout2 = bannerStandard4.E;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(bannerStandard4.webView, layoutParams2);
                    bannerStandard4.E.setVisibility(4);
                }
                bannerStandard4.F.addView(bannerStandard4.twoPartWebView, layoutParams2);
            }
            BannerStandard bannerStandard5 = BannerStandard.this;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            CloseableLayout closeableLayout4 = bannerStandard5.F;
            if (closeableLayout4 != null) {
                closeableLayout4.setLayoutParams(layoutParams3);
            }
            setState(MraidState.EXPANDED);
        }

        public v5 getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public void init() {
            this.webView.setWebViewClient(new w5(this, this));
        }

        public void initTwoPart(WebView webView) {
            if (this.twoPart == null) {
                MraidBannerController mraidBannerController = new MraidBannerController(webView, this.openListener);
                this.twoPart = mraidBannerController;
                mraidBannerController.init();
                this.twoPart.onMraidDetected();
            }
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a
        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f22415b.contains(str);
        }

        @Override // com.startapp.m5
        public void onMraidDetected() {
            if (this.mraidState != null) {
                return;
            }
            this.mraidState = MraidState.LOADING;
            addVisibilityTracker();
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
        @Override // com.startapp.m5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPageFinished(java.lang.String r21) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.MraidBannerController.onPageFinished(java.lang.String):void");
        }

        public void release() {
            cancelViewabilityTracking();
            MraidBannerController mraidBannerController = this.twoPart;
            if (mraidBannerController != null) {
                mraidBannerController.release();
                this.twoPart = null;
            }
        }

        public boolean releaseTwoPart() {
            MraidBannerController mraidBannerController = this.twoPart;
            if (mraidBannerController != null) {
                mraidBannerController.release();
                this.twoPart = null;
                return true;
            }
            return false;
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void resize() {
            CloseableLayout closeableLayout;
            BannerStandard bannerStandard = BannerStandard.this;
            MraidBannerController mraidBannerController = bannerStandard.I;
            if (mraidBannerController == null) {
                return;
            }
            v5 resizeProperties = mraidBannerController.getResizeProperties();
            if (resizeProperties == null) {
                n5.a(bannerStandard.webView, "requires: setResizeProperties first", "resize");
                return;
            }
            bannerStandard.a();
            if (bannerStandard.I.getState() == MraidState.LOADING || bannerStandard.I.getState() == MraidState.HIDDEN) {
                return;
            }
            if (bannerStandard.I.getState() == MraidState.EXPANDED) {
                n5.a(bannerStandard.webView, "Not allowed to resize from an already expanded ad", "resize");
                return;
            }
            int i10 = resizeProperties.f23470a;
            int i11 = resizeProperties.f23471b;
            int i12 = resizeProperties.f23472c;
            int i13 = resizeProperties.f23473d;
            int[] iArr = new int[2];
            bannerStandard.webView.getLocationOnScreen(iArr);
            Context context = bannerStandard.getContext();
            int b10 = j9.b(context, iArr[0]) + i12;
            int round = Math.round(iArr[1] / context.getResources().getDisplayMetrics().density) + i13;
            Rect rect = new Rect(b10, round, i10 + b10, i11 + round);
            ViewGroup o10 = bannerStandard.o();
            int round2 = Math.round(o10.getWidth() / context.getResources().getDisplayMetrics().density);
            int round3 = Math.round(o10.getHeight() / context.getResources().getDisplayMetrics().density);
            int[] iArr2 = new int[2];
            o10.getLocationOnScreen(iArr2);
            int round4 = Math.round(iArr2[0] / context.getResources().getDisplayMetrics().density);
            int round5 = Math.round(iArr2[1] / context.getResources().getDisplayMetrics().density);
            if (!resizeProperties.f23475f) {
                if (rect.width() <= round2 && rect.height() <= round3) {
                    rect.offsetTo(Math.max(round4, Math.min(rect.left, (round4 + round2) - rect.width())), Math.max(round5, Math.min(rect.top, (round5 + round3) - rect.height())));
                } else {
                    n5.a(bannerStandard.webView, "Not enough room for the ad", "resize");
                    return;
                }
            }
            Rect rect2 = new Rect();
            try {
                CloseableLayout.ClosePosition a10 = CloseableLayout.ClosePosition.a(resizeProperties.f23474e);
                CloseableLayout closeableLayout2 = bannerStandard.F;
                if (closeableLayout2 != null) {
                    int i14 = closeableLayout2.f22585e;
                    Gravity.apply(a10.a(), i14, i14, rect, rect2);
                }
                if (!new Rect(round4, round5, round2 + round4, round3 + round5).contains(rect2)) {
                    n5.a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                } else if (!rect.contains(rect2)) {
                    n5.a(bannerStandard.webView, "The close region to appear within the max allowed size", "resize");
                } else {
                    bannerStandard.F.setCloseVisible(false);
                    bannerStandard.F.setClosePosition(a10);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
                    layoutParams.leftMargin = rect.left - round4;
                    layoutParams.topMargin = rect.top - round5;
                    if (bannerStandard.I.getState() == MraidState.DEFAULT) {
                        RelativeLayout relativeLayout = bannerStandard.E;
                        if (relativeLayout != null) {
                            relativeLayout.removeView(bannerStandard.webView);
                            bannerStandard.E.setVisibility(4);
                        }
                        bannerStandard.F.addView(bannerStandard.webView, new FrameLayout.LayoutParams(-1, -1));
                        if (bannerStandard.J == null) {
                            bannerStandard.J = bannerStandard.o();
                        }
                        bannerStandard.J.addView(bannerStandard.F, layoutParams);
                    } else if (bannerStandard.I.getState() == MraidState.RESIZED && (closeableLayout = bannerStandard.F) != null) {
                        closeableLayout.setLayoutParams(layoutParams);
                    }
                    bannerStandard.F.setClosePosition(a10);
                    bannerStandard.I.setState(MraidState.RESIZED);
                }
            } catch (Exception e8) {
                n5.a(bannerStandard.webView, e8.getMessage() != null ? e8.getMessage() : "", "resize");
            }
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard bannerStandard = BannerStandard.this;
                boolean parseBoolean = Boolean.parseBoolean(str);
                CloseableLayout closeableLayout = bannerStandard.F;
                if (closeableLayout == null || parseBoolean == (!closeableLayout.f22583c.isVisible())) {
                    return;
                }
                bannerStandard.F.setCloseVisible(!parseBoolean);
            }
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            r5 r5Var = this.orientationProperties;
            if (r5Var.f22466a == parseBoolean) {
                int i10 = r5Var.f22467b;
                int indexOf = r5.f22465c.indexOf(str);
                if (indexOf == -1) {
                    indexOf = 2;
                }
                if (i10 == indexOf) {
                    return;
                }
            }
            r5 r5Var2 = this.orientationProperties;
            r5Var2.f22466a = parseBoolean;
            int indexOf2 = r5.f22465c.indexOf(str);
            r5Var2.f22467b = indexOf2 != -1 ? indexOf2 : 2;
            applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void setResizeProperties(Map<String, String> map) {
            boolean z10;
            try {
                int parseInt = Integer.parseInt(map.get("width"));
                int parseInt2 = Integer.parseInt(map.get("height"));
                int parseInt3 = Integer.parseInt(map.get("offsetX"));
                int parseInt4 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                String str2 = map.get("customClosePosition");
                if (str != null && !Boolean.parseBoolean(str)) {
                    z10 = false;
                    this.resizeProperties = new v5(parseInt, parseInt2, parseInt3, parseInt4, str2, z10);
                }
                z10 = true;
                this.resizeProperties = new v5(parseInt, parseInt2, parseInt3, parseInt4, str2, z10);
            } catch (Exception unused) {
                n5.a(this.webView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState) {
            this.mraidState = mraidState;
            if (mraidState != null) {
                o9.a(this.webView, true, "mraid.fireStateChangeEvent", mraidState.name().toLowerCase());
            }
        }

        @Override // com.startapp.sdk.adsbase.mraid.bridge.a, com.startapp.l5
        public void useCustomClose(String str) {
            BannerStandard bannerStandard = BannerStandard.this;
            boolean parseBoolean = Boolean.parseBoolean(str);
            CloseableLayout closeableLayout = bannerStandard.F;
            if (closeableLayout == null || parseBoolean == (!closeableLayout.f22583c.isVisible())) {
                return;
            }
            bannerStandard.F.setCloseVisible(!parseBoolean);
        }
    }

    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    public final void a(String str) {
        setErrorMessage(str);
        if (this.A == null || this.B) {
            return;
        }
        this.B = true;
        l0.a(getContext(), this.A, this, null);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final int b() {
        return Math.max(this.f22578y.i() - ((int) this.f22577x), 0);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final int c() {
        return this.f22530i;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public String d() {
        return "StartApp Banner";
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final int e() {
        return this.f22578y.i();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final View f() {
        RelativeLayout relativeLayout = this.E;
        return relativeLayout != null ? relativeLayout : this;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public String getBidToken() {
        BannerStandardAd bannerStandardAd = this.f22570q;
        if (bannerStandardAd != null) {
            return bannerStandardAd.getBidToken();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getHeightInDp() {
        return 50;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getWidthInDp() {
        return 300;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    @SuppressLint({"AddJavascriptInterface"})
    public final void h() {
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.F = closeableLayout;
            closeableLayout.setOnCloseListener(new CloseableLayout.a() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.6
                @Override // com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout.a
                public void onClose() {
                    BannerStandard.a(BannerStandard.this);
                }
            });
            this.webView = com.startapp.sdk.components.a.a(context).f23225a.a().c();
            this.f22578y = new BannerOptions();
            BannerStandardAd bannerStandardAd = this.f22570q;
            if (bannerStandardAd == null) {
                this.f22570q = new BannerStandardAd(context, bannerStandardAd == null ? 0 : bannerStandardAd.v());
            }
            if (getId() == -1) {
                setId(this.f22530i);
            }
            this.webView.setId(159868225);
            WebView webView = this.webView;
            webView.setBackgroundColor(0);
            webView.setHorizontalScrollBarEnabled(false);
            boolean z10 = true;
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(false);
            webView.setOnTouchListener(new AnonymousClass4());
            webView.setOnLongClickListener(new AnonymousClass5());
            webView.setLongClickable(false);
            this.f22578y = BannerMetaData.f22541b.b();
            setMinimumWidth(j9.a(getContext(), this.f22579z.f22339a.x));
            setMinimumHeight(j9.a(getContext(), this.f22579z.f22339a.y));
            WebView webView2 = this.webView;
            Context context2 = getContext();
            Runnable runnable = new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.7
                @Override // java.lang.Runnable
                public void run() {
                }
            };
            TrackingParams trackingParams = new TrackingParams(getAdPreferences().getAdTag());
            boolean[] zArr = this.f22570q.inAppBrowserEnabled;
            if (zArr != null && zArr.length > 0) {
                z10 = zArr[0];
            }
            p4 p4Var = new p4(context2, runnable, trackingParams);
            p4Var.f22388b = z10;
            webView2.addJavascriptInterface(p4Var, "startappwall");
            this.E = new RelativeLayout(getContext());
            WebView webView3 = this.webView;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(j9.a(getContext(), this.f22579z.f22339a.x), j9.a(getContext(), this.f22579z.f22339a.y));
            layoutParams.addRule(13);
            this.E.addView(webView3, layoutParams);
            com.startapp.sdk.adsbase.a.a(this.M);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            addView(this.E, layoutParams2);
            if (this.f22574u) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.8
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        y.a(BannerStandard.this.getViewTreeObserver(), this);
                        BannerStandard bannerStandard = BannerStandard.this;
                        if (bannerStandard.f22571r == 0) {
                            synchronized (bannerStandard.f22537p) {
                                if (!bannerStandard.f22536o.hasMessages(1)) {
                                    bannerStandard.f22536o.sendEmptyMessage(1);
                                }
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            l3.a(th);
            hideBanner();
            a("BannerStandard.init - webview failed");
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.f22575v = false;
        com.startapp.sdk.adsbase.a.a(this.M);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // com.startapp.sdk.ads.banner.BannerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r4 = this;
            com.startapp.j6 r0 = r4.H
            r1 = 0
            r4.H = r1
            if (r0 == 0) goto L14
            com.iab.omid.library.startio.adsession.AdSession r0 = r0.f22140a     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            r0.finish()     // Catch: java.lang.Throwable -> L10
        Le:
            r0 = 1
            goto L15
        L10:
            r0 = move-exception
            com.startapp.l3.a(r0)
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L2b
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$9 r1 = new com.startapp.sdk.ads.banner.bannerstandard.BannerStandard$9
            r1.<init>()
            r2 = 4000(0xfa0, double:1.9763E-320)
            r0.postDelayed(r1, r2)
            goto L70
        L2b:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r4.f22570q
            if (r0 == 0) goto L70
            android.graphics.Point r0 = r4.f22527f
            if (r0 == 0) goto L34
            goto L38
        L34:
            android.graphics.Point r0 = r4.m()
        L38:
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r1 = r4.f22570q
            int r2 = r0.x
            int r0 = r0.y
            r1.a(r2, r0)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r4.f22570q
            com.startapp.sdk.adsbase.Ad$AdState r1 = com.startapp.sdk.adsbase.Ad.AdState.UN_INITIALIZED
            r0.setState(r1)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r4.f22570q
            int r1 = r4.n()
            r0.b(r1)
            com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd r0 = r4.f22570q
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r4.getAdPreferences()
            java.lang.String r2 = r1.getPlacementId()
            if (r2 != 0) goto L64
            java.lang.String r2 = com.startapp.sdk.adsbase.a.a(r4)
            r1.setPlacementId(r2)
        L64:
            boolean r2 = r4.f22522a
            boolean r2 = com.startapp.y.a(r4, r2)
            r1.setHardwareAccelerated(r2)
            r0.load(r1, r4)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.j():void");
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final void k() {
        s7 s7Var = this.G;
        if (s7Var != null) {
            if (s7Var.f22511j.get() != 0) {
                super.k();
            }
        }
    }

    public final void l() {
        if (this.C == null && this.D == null) {
            this.D = new RelativeLayout(getContext());
            AdInformationObject adInformationObject = new AdInformationObject(getContext(), AdInformationObject.Size.SMALL, AdPreferences.Placement.INAPP_BANNER, this.f22570q.getAdInfoOverride(), this.f22570q.getConsentData(), this.f22570q.getRequestUrl(), this.f22570q.getDParam());
            this.C = adInformationObject;
            adInformationObject.a(this.D);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.D.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.D);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.D, layoutParams);
    }

    public void loadHtml() {
        String k10;
        BannerStandardAd bannerStandardAd = this.f22570q;
        if (bannerStandardAd == null || (k10 = bannerStandardAd.k()) == null) {
            return;
        }
        if (getAdPreferences().getAdTag() != null && getAdPreferences().getAdTag().length() > 0) {
            k10 = k10.replaceAll("startapp_adtag_placeholder", getAdPreferences().getAdTag());
        }
        String str = k10;
        if (CacheMetaData.d()) {
            this.f22576w.postDelayed(new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.10
                @Override // java.lang.Runnable
                public void run() {
                    BannerStandard bannerStandard = BannerStandard.this;
                    int i10 = BannerStandard.N;
                    bannerStandard.i();
                }
            }, this.f22578y.i());
        }
        this.f22577x = System.currentTimeMillis();
        MraidBannerController mraidBannerController = this.I;
        if (mraidBannerController != null) {
            mraidBannerController.release();
            this.I = null;
        }
        MraidBannerController mraidBannerController2 = new MraidBannerController(this.webView, new a.InterfaceC0252a() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.11
            @Override // com.startapp.sdk.adsbase.mraid.bridge.a.InterfaceC0252a
            public boolean onClickEvent(String str2) {
                return BannerStandard.this.onMraidClickEvent(str2);
            }
        });
        this.I = mraidBannerController2;
        mraidBannerController2.init();
        getContext();
        WebView webView = this.webView;
        WeakHashMap weakHashMap = o9.f22359a;
        try {
            webView.loadDataWithBaseURL(MetaData.f23158k.q(), str, "text/html", cc.N, null);
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:33:0x0097, B:35:0x009d, B:37:0x00a3, B:39:0x00a9, B:41:0x00c3, B:42:0x00c5, B:44:0x00cb, B:46:0x00e5, B:47:0x00e7, B:49:0x00ef, B:53:0x00fd, B:55:0x010b, B:56:0x010d, B:58:0x011b, B:59:0x011e, B:61:0x0138, B:62:0x013a, B:64:0x0154), top: B:75:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:33:0x0097, B:35:0x009d, B:37:0x00a3, B:39:0x00a9, B:41:0x00c3, B:42:0x00c5, B:44:0x00cb, B:46:0x00e5, B:47:0x00e7, B:49:0x00ef, B:53:0x00fd, B:55:0x010b, B:56:0x010d, B:58:0x011b, B:59:0x011e, B:61:0x0138, B:62:0x013a, B:64:0x0154), top: B:75:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0094 -> B:32:0x0095). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Point m() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.m():android.graphics.Point");
    }

    public int n() {
        return 0;
    }

    public final ViewGroup o() {
        View rootView;
        ViewGroup viewGroup = this.J;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.E;
        View view = null;
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(16908290);
        if (relativeLayout != null && (rootView = relativeLayout.getRootView()) != null && (view = rootView.findViewById(16908290)) == null) {
            view = rootView;
        }
        if (findViewById == null) {
            findViewById = view;
        }
        if (findViewById instanceof ViewGroup) {
            return (ViewGroup) findViewById;
        }
        return this.E;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebView webView = this.webView;
        if (webView != null) {
            y.d(webView);
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            y.d(webView2);
        }
        MraidBannerController mraidBannerController = this.I;
        if (mraidBannerController != null) {
            mraidBannerController.addVisibilityTracker();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WebView webView = this.webView;
        if (webView != null) {
            y.c(webView);
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            y.c(webView2);
        }
        s7 s7Var = this.G;
        if (s7Var != null) {
            s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        MraidBannerController mraidBannerController = this.I;
        if (mraidBannerController != null) {
            mraidBannerController.cancelViewabilityTracking();
        }
        this.f22576w.removeCallbacksAndMessages(null);
        j6 j6Var = this.H;
        this.H = null;
        if (j6Var != null) {
            try {
                AdSession adSession = j6Var.f22140a;
                if (adSession != null) {
                    adSession.finish();
                }
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        WebView webView3 = this.webView;
        WeakHashMap weakHashMap = o9.f22359a;
        new Handler(Looper.getMainLooper()).postDelayed(new n9(webView3), 1000L);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(Ad ad) {
        if (ad != null) {
            a(ad.getErrorMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143 A[Catch: all -> 0x0179, TryCatch #0 {all -> 0x0179, blocks: (B:30:0x0094, B:32:0x00ac, B:33:0x00d0, B:35:0x00d4, B:43:0x00e5, B:45:0x00ec, B:47:0x00f5, B:49:0x00f8, B:50:0x00fa, B:53:0x011c, B:55:0x011f, B:57:0x0123, B:58:0x013c, B:60:0x0143, B:61:0x0149, B:64:0x015f, B:66:0x0162, B:72:0x016d, B:38:0x00da, B:39:0x00dd), top: B:108:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMraidClickEvent(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.onMraidClickEvent(java.lang.String):boolean");
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        this.f22572s = false;
        removeView(this.D);
        BannerStandardAd bannerStandardAd = this.f22570q;
        if (bannerStandardAd != null && bannerStandardAd.k() != null && this.f22570q.k().compareTo("") != 0) {
            this.f22573t = com.ironsource.mediationsdk.metadata.a.f18924g.equals(o9.a(this.f22570q.k(), "@jsTag@", "@jsTag@"));
            loadHtml();
            try {
                if (a(Integer.parseInt(o9.a(this.f22570q.k(), "@width@", "@width@")), Integer.parseInt(o9.a(this.f22570q.k(), "@height@", "@height@")))) {
                    this.f22571r = SystemClock.uptimeMillis();
                    l();
                    if (isFirstLoad() || AdaptMetaData.f23001a.a().a()) {
                        setFirstLoad(false);
                        f.f21919d.a(new e(AdPreferences.Placement.INAPP_BANNER, getAdPreferences().getAdTag()));
                    }
                    if (this.f22575v) {
                        com.startapp.sdk.adsbase.a.a(this.L);
                    }
                    if (this.A == null || this.B) {
                        return;
                    }
                    this.B = true;
                    Context context = getContext();
                    BannerListener bannerListener = this.A;
                    String[] strArr = this.f22570q.trackingUrls;
                    k0 k0Var = null;
                    d2.a("onLoad", com.startapp.sdk.adsbase.a.a(strArr.length <= 0 ? null : strArr[0], (String) null), null, bannerListener != null);
                    if (bannerListener != null) {
                        k0Var = new k0(bannerListener, this, context);
                    }
                    com.startapp.sdk.adsbase.a.a(k0Var);
                    return;
                }
                a("Banner cannot be displayed (not enough room)");
                return;
            } catch (NumberFormatException unused) {
                a("Error Casting width & height from HTML");
                return;
            } catch (Throwable th) {
                l3.a(th);
                a(th.getMessage());
                return;
            }
        }
        a("No Banner received");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        double ceil = Math.ceil(i10 / displayMetrics.density);
        double ceil2 = Math.ceil(i11 / displayMetrics.density);
        Point point = this.f22579z.f22339a;
        if (ceil >= point.x && ceil2 >= point.y) {
            if (!this.f22575v || this.f22571r <= 0) {
                return;
            }
            com.startapp.sdk.adsbase.a.a(this.L);
            return;
        }
        com.startapp.sdk.adsbase.a.a(this.M);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            WebView webView = this.webView;
            if (webView != null) {
                y.d(webView);
            }
            WebView webView2 = this.twoPartWebView;
            if (webView2 != null) {
                y.d(webView2);
                return;
            }
            return;
        }
        WebView webView3 = this.webView;
        if (webView3 != null) {
            y.c(webView3);
        }
        WebView webView4 = this.twoPartWebView;
        if (webView4 != null) {
            y.c(webView4);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void setBannerListener(BannerListener bannerListener) {
        this.A = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void showBanner() {
        try {
            com.startapp.sdk.components.a.a(getContext()).f23244t.a().a(com.ironsource.mediationsdk.metadata.a.f18931n);
        } catch (Throwable unused) {
        }
        this.f22575v = true;
        com.startapp.sdk.adsbase.a.a(this.L);
    }

    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    public final boolean a(int i10, int i11) {
        Point m7 = m();
        if (m7.x >= i10 && m7.y >= i11) {
            this.f22579z.a(i10, i11);
            int a10 = j9.a(getContext(), this.f22579z.f22339a.x);
            int a11 = j9.a(getContext(), this.f22579z.f22339a.y);
            this.E.setMinimumWidth(a10);
            this.E.setMinimumHeight(a11);
            ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(a10, a11);
            } else {
                layoutParams.width = a10;
                layoutParams.height = a11;
            }
            this.webView.setLayoutParams(layoutParams);
            return true;
        }
        Point point = new Point(0, 0);
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(point.x, point.y);
        } else {
            layoutParams2.width = point.x;
            layoutParams2.height = point.y;
        }
        this.webView.setLayoutParams(layoutParams2);
        return false;
    }

    @Deprecated
    public BannerStandard(Context context, boolean z10) {
        this(context, z10, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences) {
        this(context, z10, adPreferences, null);
    }

    public BannerStandard(Context context, boolean z10, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
        super(context);
        this.f22572s = true;
        this.f22573t = false;
        this.f22574u = true;
        this.f22575v = true;
        this.f22576w = new Handler(Looper.getMainLooper());
        this.f22579z = new o0(getWidthInDp(), getHeightInDp());
        this.B = false;
        this.C = null;
        this.D = null;
        this.K = new s7.b() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.1
            @Override // com.startapp.s7.b
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                int i10 = BannerStandard.N;
                Context context2 = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.A;
                d2.a("onImpression", str, null, bannerListener != null);
                com.startapp.sdk.adsbase.a.a(bannerListener != null ? new m0(bannerListener, bannerStandard, context2) : null);
                bannerStandard.f22577x = System.currentTimeMillis() - bannerStandard.f22577x;
                bannerStandard.k();
            }
        };
        this.L = new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.2
            @Override // java.lang.Runnable
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f22570q != null) {
                    d8 a10 = com.startapp.sdk.components.a.a(bannerStandard.getContext()).f23235k.a();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int n10 = bannerStandard.n();
                    String adId = bannerStandard.f22570q.getAdId();
                    if (adId != null) {
                        a10.f21892a.put(new d8.a(placement, n10), adId);
                    }
                }
            }
        };
        this.M = new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.3
            @Override // java.lang.Runnable
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            this.f22574u = z10;
            this.f22570q = bannerStandardAd;
            setAdPreferences(adPreferences);
            g();
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22572s = true;
        this.f22573t = false;
        this.f22574u = true;
        this.f22575v = true;
        this.f22576w = new Handler(Looper.getMainLooper());
        this.f22579z = new o0(getWidthInDp(), getHeightInDp());
        this.B = false;
        this.C = null;
        this.D = null;
        this.K = new s7.b() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.1
            @Override // com.startapp.s7.b
            public void onSent(String str) {
                BannerStandard bannerStandard = BannerStandard.this;
                int i102 = BannerStandard.N;
                Context context2 = bannerStandard.getContext();
                BannerListener bannerListener = bannerStandard.A;
                d2.a("onImpression", str, null, bannerListener != null);
                com.startapp.sdk.adsbase.a.a(bannerListener != null ? new m0(bannerListener, bannerStandard, context2) : null);
                bannerStandard.f22577x = System.currentTimeMillis() - bannerStandard.f22577x;
                bannerStandard.k();
            }
        };
        this.L = new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.2
            @Override // java.lang.Runnable
            public void run() {
                BannerStandard bannerStandard = BannerStandard.this;
                RelativeLayout relativeLayout = bannerStandard.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                if (bannerStandard.f22570q != null) {
                    d8 a10 = com.startapp.sdk.components.a.a(bannerStandard.getContext()).f23235k.a();
                    AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                    int n10 = bannerStandard.n();
                    String adId = bannerStandard.f22570q.getAdId();
                    if (adId != null) {
                        a10.f21892a.put(new d8.a(placement, n10), adId);
                    }
                }
            }
        };
        this.M = new Runnable() { // from class: com.startapp.sdk.ads.banner.bannerstandard.BannerStandard.3
            @Override // java.lang.Runnable
            public void run() {
                RelativeLayout relativeLayout = BannerStandard.this.E;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(4);
                }
            }
        };
        try {
            g();
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    public final void a(WebView webView) {
        j6 j6Var = this.H;
        if (j6Var == null) {
            j6Var = new j6(webView);
            this.H = j6Var;
        }
        if (j6Var.f22140a != null) {
            try {
                RelativeLayout relativeLayout = this.D;
                if (relativeLayout != null) {
                    j6Var.a(relativeLayout, FriendlyObstructionPurpose.OTHER);
                }
                CloseableLayout closeableLayout = this.F;
                if (closeableLayout != null) {
                    j6Var.a(closeableLayout, FriendlyObstructionPurpose.CLOSE_AD);
                }
            } catch (RuntimeException unused) {
            }
            AdSession adSession = j6Var.f22140a;
            if (adSession != null) {
                adSession.registerAdView(webView);
            }
            AdSession adSession2 = j6Var.f22140a;
            if (adSession2 != null) {
                adSession2.start();
            }
            if (j6Var.f22141b != null && j6Var.f22144e.compareAndSet(false, true)) {
                j6Var.f22141b.loaded();
            }
            if (j6Var.f22141b == null || !j6Var.f22143d.compareAndSet(false, true)) {
                return;
            }
            j6Var.f22141b.impressionOccurred();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public final void a(int i10) {
        this.f22530i = i10;
    }

    public static void a(BannerStandard bannerStandard) {
        MraidBannerController mraidBannerController = bannerStandard.I;
        if (mraidBannerController == null || mraidBannerController.getState() == MraidState.LOADING) {
            return;
        }
        MraidState state = bannerStandard.I.getState();
        MraidState mraidState = MraidState.HIDDEN;
        if (state == mraidState) {
            return;
        }
        if (bannerStandard.I.getState() != MraidState.RESIZED && bannerStandard.I.getState() != MraidState.EXPANDED) {
            if (bannerStandard.I.getState() == MraidState.DEFAULT) {
                com.startapp.sdk.adsbase.a.a(bannerStandard.M);
                bannerStandard.I.setState(mraidState);
            }
        } else {
            if (bannerStandard.I.releaseTwoPart()) {
                CloseableLayout closeableLayout = bannerStandard.F;
                if (closeableLayout != null) {
                    closeableLayout.removeView(bannerStandard.twoPartWebView);
                }
                bannerStandard.twoPartWebView.stopLoading();
                bannerStandard.twoPartWebView = null;
            } else {
                CloseableLayout closeableLayout2 = bannerStandard.F;
                if (closeableLayout2 != null) {
                    closeableLayout2.removeView(bannerStandard.webView);
                }
                WebView webView = bannerStandard.webView;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(j9.a(bannerStandard.getContext(), bannerStandard.f22579z.f22339a.x), j9.a(bannerStandard.getContext(), bannerStandard.f22579z.f22339a.y));
                layoutParams.addRule(13);
                bannerStandard.E.addView(webView, layoutParams);
                com.startapp.sdk.adsbase.a.a(bannerStandard.L);
            }
            CloseableLayout closeableLayout3 = bannerStandard.F;
            if (closeableLayout3 != null && closeableLayout3.getParent() != null && (closeableLayout3.getParent() instanceof ViewGroup)) {
                ((ViewGroup) closeableLayout3.getParent()).removeView(closeableLayout3);
            }
            bannerStandard.I.setState(MraidState.DEFAULT);
        }
        bannerStandard.k();
    }
}
