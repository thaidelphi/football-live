package com.appnext.banners;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.appnext.core.callbacks.OnECPMLoaded;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class BaseBannerAdapter {
    private BannerListener bannerListener;
    private BannerSize bannerSize;
    protected Context context;
    private String language;
    private String placementId;
    protected ViewGroup rootView;

    private boolean isViewPartiallyVisible(View view) {
        try {
            ViewGroup viewGroup = this.rootView;
            if (viewGroup != null && viewGroup.getParent() != null) {
                Rect rect = new Rect();
                ((ViewGroup) this.rootView.getParent()).getHitRect(rect);
                return view.getLocalVisibleRect(rect);
            }
            return false;
        } catch (Throwable th) {
            com.appnext.base.a.a("BaseBannerAdapter$isViewPartiallyVisible", th);
            return false;
        }
    }

    public abstract void click();

    public void destroy() {
        this.context = null;
    }

    public BannerListener getBannerListener() {
        return this.bannerListener;
    }

    public BannerSize getBannerSize() {
        return this.bannerSize;
    }

    public abstract void getECPM(BannerAdRequest bannerAdRequest, OnECPMLoaded onECPMLoaded);

    public String getLanguage() {
        return this.language;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public int getVisiblePercent(View view) {
        if (!isViewPartiallyVisible(this.rootView) || this.rootView.getWindowVisibility() == 8 || this.rootView.getWindowVisibility() == 4) {
            return 0;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return (int) (((rect.width() * rect.height()) * 100.0d) / (view.getWidth() * view.getHeight()));
    }

    public abstract void impression();

    public void init(ViewGroup viewGroup) {
        this.rootView = viewGroup;
        this.context = viewGroup.getContext();
    }

    public boolean isClickEnabled() {
        return false;
    }

    public abstract void loadAd(BannerAdRequest bannerAdRequest);

    public void onScrollChanged(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        this.context.startActivity(intent);
    }

    public void parseAttributeSet(AttributeSet attributeSet) {
    }

    public void pause() {
    }

    public void play() {
    }

    public void setBannerListener(BannerListener bannerListener) {
        this.bannerListener = bannerListener;
    }

    public void setBannerSize(BannerSize bannerSize) {
        this.bannerSize = bannerSize;
    }

    public void setClickEnabled(boolean z10) {
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }
}
