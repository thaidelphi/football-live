package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.t5;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f18485a;

    /* renamed from: b  reason: collision with root package name */
    private ISBannerSize f18486b;

    /* renamed from: c  reason: collision with root package name */
    private String f18487c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f18488d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18489e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18490f;

    /* renamed from: g  reason: collision with root package name */
    private a f18491g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onWindowFocusChanged(boolean z10);
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f18489e = false;
        this.f18490f = false;
        this.f18488d = activity;
        this.f18486b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public IronSourceBannerLayout(Context context) {
        super(context);
        this.f18489e = false;
        this.f18490f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f18489e = true;
        this.f18488d = null;
        this.f18486b = null;
        this.f18487c = null;
        this.f18485a = null;
        this.f18491g = null;
        removeBannerListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IronSourceBannerLayout b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f18488d, this.f18486b);
        ironSourceBannerLayout.setPlacementName(this.f18487c);
        return ironSourceBannerLayout;
    }

    public Activity getActivity() {
        return this.f18488d;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return t5.a().b();
    }

    public String getPlacementName() {
        return this.f18487c;
    }

    public ISBannerSize getSize() {
        return this.f18486b;
    }

    public a getWindowFocusChangedListener() {
        return this.f18491g;
    }

    public boolean isDestroyed() {
        return this.f18489e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f18491g;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z10);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        t5.a().a((LevelPlayBannerListener) null);
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f18486b = iSBannerSize;
    }

    @Deprecated
    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        t5.a().a(levelPlayBannerListener);
    }

    public void setPlacementName(String str) {
        this.f18487c = str;
    }

    public void setWindowFocusChangedListener(a aVar) {
        this.f18491g = aVar;
    }
}
