package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.s5;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f18598a;

    /* renamed from: b  reason: collision with root package name */
    private ISBannerSize f18599b;

    /* renamed from: c  reason: collision with root package name */
    private String f18600c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f18601d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18602e;

    /* renamed from: f  reason: collision with root package name */
    private s5 f18603f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f18604a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f18605b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f18604a = view;
            this.f18605b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f18604a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f18604a);
            }
            ISDemandOnlyBannerLayout.this.f18598a = this.f18604a;
            ISDemandOnlyBannerLayout.this.addView(this.f18604a, 0, this.f18605b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f18602e = false;
        this.f18601d = activity;
        this.f18599b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f18603f = new s5();
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f18602e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f18602e = true;
        this.f18601d = null;
        this.f18599b = null;
        this.f18600c = null;
        this.f18598a = null;
        removeBannerListener();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }

    public Activity getActivity() {
        return this.f18601d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f18603f.a();
    }

    public View getBannerView() {
        return this.f18598a;
    }

    public s5 getListener() {
        return this.f18603f;
    }

    public String getPlacementName() {
        return this.f18600c;
    }

    public ISBannerSize getSize() {
        return this.f18599b;
    }

    public boolean isDestroyed() {
        return this.f18602e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f18603f.b((s5) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f18603f.b((s5) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f18600c = str;
    }
}
