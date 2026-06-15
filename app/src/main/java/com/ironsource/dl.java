package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class dl extends bl implements w5 {

    /* renamed from: d  reason: collision with root package name */
    private final UUID f17060d;

    /* renamed from: e  reason: collision with root package name */
    private final w6 f17061e;

    /* renamed from: f  reason: collision with root package name */
    private final fi f17062f;

    /* renamed from: g  reason: collision with root package name */
    private LevelPlayAdSize f17063g;

    /* renamed from: h  reason: collision with root package name */
    private LevelPlayBannerAdViewListener f17064h;

    /* renamed from: i  reason: collision with root package name */
    private String f17065i;

    /* renamed from: j  reason: collision with root package name */
    private v5 f17066j;

    /* renamed from: k  reason: collision with root package name */
    private Boolean f17067k;

    /* renamed from: l  reason: collision with root package name */
    private Placement f17068l;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a extends hr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f17069a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f17070b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ dl f17071c;

        a(String str, String str2, dl dlVar) {
            this.f17069a = str;
            this.f17070b = str2;
            this.f17071c = dlVar;
        }

        @Override // com.ironsource.hr
        public void a() {
            String str = this.f17069a;
            if (str != null) {
                this.f17071c.a(str);
            }
            String str2 = this.f17070b;
            if (str2 != null) {
                this.f17071c.f17063g = LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str2);
            }
        }

        @Override // com.ironsource.hr
        public void a(Throwable t10) {
            kotlin.jvm.internal.n.f(t10, "t");
            if (t10 instanceof IllegalArgumentException) {
                throw t10;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dl(java.util.UUID r5, com.ironsource.w6 r6, android.util.AttributeSet r7) {
        /*
            r4 = this;
            java.lang.String r0 = "adId"
            kotlin.jvm.internal.n.f(r5, r0)
            java.lang.String r0 = "bannerContainer"
            kotlin.jvm.internal.n.f(r6, r0)
            com.ironsource.o1 r0 = new com.ironsource.o1
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER
            com.ironsource.e2$b r2 = com.ironsource.e2.b.MEDIATION
            r0.<init>(r1, r2)
            r4.<init>(r0)
            r4.f17060d = r5
            r4.f17061e = r6
            com.ironsource.mm$b r0 = com.ironsource.mm.f19249r
            com.ironsource.xf r0 = r0.d()
            com.ironsource.fi r0 = r0.o()
            r4.f17062f = r0
            com.unity3d.mediation.LevelPlayAdSize r0 = com.unity3d.mediation.LevelPlayAdSize.BANNER
            r4.f17063g = r0
            java.lang.String r0 = ""
            r4.f17065i = r0
            com.ironsource.o1 r0 = r4.a()
            com.ironsource.ac r0 = r0.e()
            com.ironsource.o r2 = new com.ironsource.o
            java.lang.String r3 = r4.b()
            r2.<init>(r1, r5, r3)
            r0.a(r2)
            if (r7 == 0) goto L50
            android.content.Context r5 = r6.getContext()
            java.lang.String r6 = "bannerContainer.context"
            kotlin.jvm.internal.n.e(r5, r6)
            r4.a(r5, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.dl.<init>(java.util.UUID, com.ironsource.w6, android.util.AttributeSet):void");
    }

    public /* synthetic */ dl(UUID uuid, w6 w6Var, AttributeSet attributeSet, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? lf.f18190a.a() : uuid, w6Var, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
        kotlin.jvm.internal.n.e(obtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
        a().d(new a(obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId), obtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize), this));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final dl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (!this$0.c()) {
            IronLog.INTERNAL.warning(o1.a(this$0.a(), "Banner not loaded", (String) null, 2, (Object) null));
        } else if (this$0.f17066j == null) {
            IronLog.INTERNAL.warning(o1.a(this$0.a(), "Banner already destroyed", (String) null, 2, (Object) null));
        } else {
            vl.a(this$0.a(), new Runnable() { // from class: com.ironsource.lx
                @Override // java.lang.Runnable
                public final void run() {
                    dl.b(dl.this);
                }
            }, 0L, 2, (Object) null);
            v5 v5Var = this$0.f17066j;
            if (v5Var != null) {
                v5Var.k();
            }
            this$0.f17066j = null;
            this$0.f17067k = null;
            this$0.f17064h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(dl this$0, LevelPlayAdError it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(it, "$it");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(dl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(dl this$0, LevelPlayAdInfo adInfo, LevelPlayAdError it) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        kotlin.jvm.internal.n.f(it, "$it");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(dl this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f17064h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(dl this$0, String placementName) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(placementName, "$placementName");
        if (this$0.c()) {
            return;
        }
        this$0.f17065i = placementName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(dl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f17061e.removeAllViews();
        ViewParent parent = this$0.f17061e.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.f17061e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(dl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(dl this$0, LevelPlayAdSize adSize) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adSize, "$adSize");
        if (this$0.c()) {
            return;
        }
        this$0.f17063g = adSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(dl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (this$0.c()) {
            IronLog.INTERNAL.warning(o1.a(this$0.a(), "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            v5 e8 = this$0.e();
            Boolean bool = this$0.f17067k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    e8.q();
                } else {
                    e8.p();
                }
            }
            e8.l();
            this$0.f17066j = e8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(dl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(dl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.a().e().f().b();
        v5 v5Var = this$0.f17066j;
        if (v5Var != null) {
            v5Var.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(dl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    private final v5 e() {
        Placement placement;
        this.f17068l = a().a(this.f17065i);
        Context context = this.f17061e.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f17060d;
        String b10 = b();
        Placement placement2 = this.f17068l;
        Placement placement3 = null;
        if (placement2 == null) {
            kotlin.jvm.internal.n.u("bannerPlacement");
            placement = null;
        } else {
            placement = placement2;
        }
        j6 j6Var = new j6(uuid, b10, placement, this.f17063g, null, null, this.f17062f.a(), 48, null);
        a(j6Var);
        ISBannerSize a10 = a().a(j6Var.g());
        ac e8 = a().e();
        o1 a11 = a();
        Placement placement4 = this.f17068l;
        if (placement4 == null) {
            kotlin.jvm.internal.n.u("bannerPlacement");
        } else {
            placement3 = placement4;
        }
        e8.a(new y6(a11, a10, placement3.getPlacementName()));
        return new v5(this, a(), j6Var, this.f17061e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(dl this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.a().e().f().c();
        v5 v5Var = this$0.f17066j;
        if (v5Var != null) {
            v5Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(dl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(dl this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInfo, "$adInfo");
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f17064h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    @Override // com.ironsource.w5
    public void a(final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            b(new Runnable() { // from class: com.ironsource.px
                @Override // java.lang.Runnable
                public final void run() {
                    dl.a(dl.this, levelPlayAdError);
                }
            });
        }
    }

    @Override // com.ironsource.w5
    public void a(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.sx
            @Override // java.lang.Runnable
            public final void run() {
                dl.f(dl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.w5
    public void a(final LevelPlayAdInfo adInfo, final LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            b(new Runnable() { // from class: com.ironsource.hx
                @Override // java.lang.Runnable
                public final void run() {
                    dl.a(dl.this, adInfo, levelPlayAdError);
                }
            });
        }
    }

    @Override // com.ironsource.w5
    public void a(final LevelPlayAdInfo adInfo, boolean z10) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.rx
            @Override // java.lang.Runnable
            public final void run() {
                dl.d(dl.this, adInfo);
            }
        });
    }

    public final void a(final LevelPlayAdSize adSize) {
        kotlin.jvm.internal.n.f(adSize, "adSize");
        a(new Runnable() { // from class: com.ironsource.ix
            @Override // java.lang.Runnable
            public final void run() {
                dl.b(dl.this, adSize);
            }
        });
    }

    public final void a(final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        a(new Runnable() { // from class: com.ironsource.jx
            @Override // java.lang.Runnable
            public final void run() {
                dl.a(dl.this, levelPlayBannerAdViewListener);
            }
        });
    }

    public final void b(final String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.kx
            @Override // java.lang.Runnable
            public final void run() {
                dl.a(dl.this, placementName);
            }
        });
    }

    @Override // com.ironsource.w5
    public void c(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.tx
            @Override // java.lang.Runnable
            public final void run() {
                dl.b(dl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.w5
    public void d(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.gx
            @Override // java.lang.Runnable
            public final void run() {
                dl.e(dl.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.bl
    public boolean d() {
        LevelPlayAdError levelPlayAdError;
        if (b().length() == 0) {
            String uuid = this.f17060d.toString();
            kotlin.jvm.internal.n.e(uuid, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(uuid, b(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified");
        } else if (a().g()) {
            el a10 = mm.f19249r.d().t().a();
            if (a10 != null && a10.a(b(), LevelPlay.AdFormat.BANNER)) {
                return true;
            }
            LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f17064h;
            if (levelPlayBannerAdViewListener != null) {
                String uuid2 = this.f17060d.toString();
                kotlin.jvm.internal.n.e(uuid2, "adId.toString()");
                levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(uuid2, b(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
            }
            return false;
        } else {
            String uuid3 = this.f17060d.toString();
            kotlin.jvm.internal.n.e(uuid3, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(uuid3, b(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback");
        }
        a(levelPlayAdError);
        return false;
    }

    @Override // com.ironsource.w5
    public void e(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.qx
            @Override // java.lang.Runnable
            public final void run() {
                dl.a(dl.this, adInfo);
            }
        });
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.ex
            @Override // java.lang.Runnable
            public final void run() {
                dl.a(dl.this);
            }
        });
    }

    public final UUID g() {
        return this.f17060d;
    }

    @Override // com.ironsource.w5
    public void g(final LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.fx
            @Override // java.lang.Runnable
            public final void run() {
                dl.c(dl.this, adInfo);
            }
        });
    }

    public final LevelPlayAdSize h() {
        return this.f17063g;
    }

    public final LevelPlayBannerAdViewListener i() {
        return this.f17064h;
    }

    public final String j() {
        return this.f17065i;
    }

    public final void k() {
        a(new Runnable() { // from class: com.ironsource.mx
            @Override // java.lang.Runnable
            public final void run() {
                dl.c(dl.this);
            }
        });
    }

    public final void l() {
        i8.w wVar;
        if (this.f17066j != null) {
            a(new Runnable() { // from class: com.ironsource.ox
                @Override // java.lang.Runnable
                public final void run() {
                    dl.d(dl.this);
                }
            });
            wVar = i8.w.f26638a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f17067k = Boolean.FALSE;
        }
    }

    public final void m() {
        i8.w wVar;
        if (this.f17066j != null) {
            a(new Runnable() { // from class: com.ironsource.nx
                @Override // java.lang.Runnable
                public final void run() {
                    dl.e(dl.this);
                }
            });
            wVar = i8.w.f26638a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f17067k = Boolean.TRUE;
        }
    }
}
