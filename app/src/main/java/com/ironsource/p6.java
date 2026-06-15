package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.ai;
import com.ironsource.j3;
import com.ironsource.m3;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class p6 implements c6 {

    /* renamed from: a  reason: collision with root package name */
    private final rj f19681a;

    /* renamed from: b  reason: collision with root package name */
    private final vg f19682b;

    /* renamed from: c  reason: collision with root package name */
    private final w4 f19683c;

    /* renamed from: d  reason: collision with root package name */
    private final q3 f19684d;

    /* renamed from: e  reason: collision with root package name */
    private final mn f19685e;

    /* renamed from: f  reason: collision with root package name */
    private final uu f19686f;

    /* renamed from: g  reason: collision with root package name */
    private final ai f19687g;

    /* renamed from: h  reason: collision with root package name */
    private final ai.a f19688h;

    /* renamed from: i  reason: collision with root package name */
    private BannerAdInfo f19689i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<q6> f19690j;

    /* renamed from: k  reason: collision with root package name */
    private WeakReference<FrameLayout> f19691k;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            kotlin.jvm.internal.n.f(v10, "v");
            tg size = p6.this.d().getSize();
            ((FrameLayout) v10).addView(p6.this.d(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            kotlin.jvm.internal.n.f(v10, "v");
            ((FrameLayout) v10).removeAllViews();
        }
    }

    public p6(rj adInstance, vg container, w4 auctionDataReporter, q3 analytics, mn networkDestroyAPI, uu threadManager, ai sessionDepthService, ai.a sessionDepthServiceEditor) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(container, "container");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.n.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.f19681a = adInstance;
        this.f19682b = container;
        this.f19683c = auctionDataReporter;
        this.f19684d = analytics;
        this.f19685e = networkDestroyAPI;
        this.f19686f = threadManager;
        this.f19687g = sessionDepthService;
        this.f19688h = sessionDepthServiceEditor;
        String f10 = adInstance.f();
        kotlin.jvm.internal.n.e(f10, "adInstance.instanceId");
        String e8 = adInstance.e();
        kotlin.jvm.internal.n.e(e8, "adInstance.id");
        this.f19689i = new BannerAdInfo(f10, e8);
        this.f19690j = new WeakReference<>(null);
        this.f19691k = new WeakReference<>(null);
        ko koVar = new ko();
        adInstance.a(koVar);
        koVar.a(this);
    }

    public /* synthetic */ p6(rj rjVar, vg vgVar, w4 w4Var, q3 q3Var, mn mnVar, uu uuVar, ai aiVar, ai.a aVar, int i10, kotlin.jvm.internal.h hVar) {
        this(rjVar, vgVar, w4Var, q3Var, (i10 & 16) != 0 ? new nn() : mnVar, (i10 & 32) != 0 ? hg.f17676a : uuVar, (i10 & 64) != 0 ? mm.f19249r.d().k() : aiVar, (i10 & 128) != 0 ? mm.f19249r.a().e() : aVar);
    }

    private final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        j3.d.f17917a.b().a(this$0.f19684d);
        this$0.f19685e.a(this$0.f19681a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        q6 q6Var = this$0.f19690j.get();
        if (q6Var != null) {
            q6Var.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p6 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        q6 q6Var = this$0.f19690j.get();
        if (q6Var != null) {
            q6Var.onBannerAdShown();
        }
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        kotlin.jvm.internal.n.f(bannerAdInfo, "<set-?>");
        this.f19689i = bannerAdInfo;
    }

    public final void a(WeakReference<q6> weakReference) {
        kotlin.jvm.internal.n.f(weakReference, "<set-?>");
        this.f19690j = weakReference;
    }

    public final void b() {
        u10.a(this.f19686f, new Runnable() { // from class: com.ironsource.o00
            @Override // java.lang.Runnable
            public final void run() {
                p6.a(p6.this);
            }
        }, 0L, 2, null);
    }

    public final void b(WeakReference<FrameLayout> value) {
        kotlin.jvm.internal.n.f(value, "value");
        this.f19691k = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    public final BannerAdInfo c() {
        return this.f19689i;
    }

    public final vg d() {
        return this.f19682b;
    }

    public final WeakReference<q6> e() {
        return this.f19690j;
    }

    public final WeakReference<FrameLayout> f() {
        return this.f19691k;
    }

    protected final void finalize() {
        b();
    }

    @Override // com.ironsource.c6
    public void onBannerClick() {
        j3.a.f17895a.a().a(this.f19684d);
        this.f19686f.a(new Runnable() { // from class: com.ironsource.n00
            @Override // java.lang.Runnable
            public final void run() {
                p6.b(p6.this);
            }
        });
    }

    @Override // com.ironsource.c6
    public void onBannerShowSuccess() {
        ai aiVar = this.f19687g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        j3.a.f17895a.f(new m3.w(aiVar.a(ad_unit))).a(this.f19684d);
        this.f19688h.b(ad_unit);
        this.f19683c.c("onBannerShowSuccess");
        this.f19686f.a(new Runnable() { // from class: com.ironsource.m00
            @Override // java.lang.Runnable
            public final void run() {
                p6.c(p6.this);
            }
        });
    }
}
