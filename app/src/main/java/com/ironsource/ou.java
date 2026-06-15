package com.ironsource;

import android.app.Activity;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.ironsource.yt;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ou implements yt.c, yt.d, yt.b {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<TestSuiteActivity> f19638a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f19639b;

    /* renamed from: c  reason: collision with root package name */
    private RelativeLayout f19640c;

    /* renamed from: d  reason: collision with root package name */
    private IronSourceBannerLayout f19641d;

    public ou(TestSuiteActivity activity, Handler handler) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(handler, "handler");
        this.f19638a = new WeakReference<>(activity);
        this.f19639b = handler;
    }

    private final RelativeLayout a(TestSuiteActivity testSuiteActivity) {
        RelativeLayout relativeLayout = new RelativeLayout(testSuiteActivity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ou this$0) {
        RelativeLayout container;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f19640c;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        TestSuiteActivity f10 = this$0.f();
        if (f10 != null && (container = f10.getContainer()) != null) {
            container.removeView(this$0.f19640c);
        }
        this$0.f19640c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ou this$0, TestSuiteActivity testSuiteActivity) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f19640c;
        if (relativeLayout != null) {
            relativeLayout.addView(this$0.f19641d);
        }
        testSuiteActivity.getContainer().addView(this$0.f19640c);
    }

    private final FrameLayout.LayoutParams b(double d10) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) (lu.f18358a.a() * d10);
        return layoutParams;
    }

    private final TestSuiteActivity f() {
        return this.f19638a.get();
    }

    @Override // com.ironsource.yt.b
    public void a(double d10) {
        if (this.f19640c == null) {
            IronSourceBannerLayout ironSourceBannerLayout = this.f19641d;
            if (ironSourceBannerLayout != null) {
                ironSourceBannerLayout.setLayoutParams(b(d10));
            }
            final TestSuiteActivity f10 = f();
            if (f10 != null) {
                this.f19640c = a(f10);
                this.f19639b.post(new Runnable() { // from class: com.ironsource.i00
                    @Override // java.lang.Runnable
                    public final void run() {
                        ou.a(ou.this, f10);
                    }
                });
            }
        }
    }

    @Override // com.ironsource.yt.c
    public void a(eu loadAdConfig) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        lu luVar = lu.f18358a;
        luVar.a(IronSource.AD_UNIT.INTERSTITIAL, loadAdConfig);
        luVar.g();
    }

    @Override // com.ironsource.yt.b
    public void a(eu loadAdConfig, String description, int i10, int i11) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.n.f(description, "description");
        b();
        lu luVar = lu.f18358a;
        luVar.a(IronSource.AD_UNIT.BANNER, loadAdConfig);
        TestSuiteActivity f10 = f();
        if (f10 != null) {
            IronSourceBannerLayout a10 = luVar.a(f10, luVar.a(description, i10, i11));
            this.f19641d = a10;
            luVar.b(a10);
        }
    }

    @Override // com.ironsource.yt.d
    public boolean a() {
        return lu.f18358a.f();
    }

    @Override // com.ironsource.yt.b
    public void b() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f19641d;
        if (ironSourceBannerLayout != null) {
            lu.f18358a.a(ironSourceBannerLayout);
        }
        this.f19639b.post(new Runnable() { // from class: com.ironsource.h00
            @Override // java.lang.Runnable
            public final void run() {
                ou.a(ou.this);
            }
        });
        this.f19641d = null;
    }

    @Override // com.ironsource.yt.d
    public void b(eu loadAdConfig) {
        kotlin.jvm.internal.n.f(loadAdConfig, "loadAdConfig");
        lu luVar = lu.f18358a;
        luVar.a(IronSource.AD_UNIT.REWARDED_VIDEO, loadAdConfig);
        luVar.h();
    }

    @Override // com.ironsource.yt.c
    public void c() {
        lu.f18358a.a((Activity) this.f19638a.get());
    }

    @Override // com.ironsource.yt.d
    public void d() {
        lu.f18358a.b((Activity) this.f19638a.get());
    }

    @Override // com.ironsource.yt.c
    public boolean e() {
        return lu.f18358a.e();
    }
}
