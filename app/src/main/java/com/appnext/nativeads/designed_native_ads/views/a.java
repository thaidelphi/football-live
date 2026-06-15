package com.appnext.nativeads.designed_native_ads.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.appnext.base.Appnext;
import com.appnext.core.AppnextError;
import com.appnext.core.i;
import com.appnext.nativeads.R;
import com.appnext.nativeads.designed_native_ads.AppnextDesignedNativeAdData;
import com.appnext.nativeads.designed_native_ads.DesignNativeAdsRequest;
import com.appnext.nativeads.designed_native_ads.c;
import com.appnext.nativeads.designed_native_ads.interfaces.AppnextDesignedNativeAdViewCallbacks;
import com.appnext.nativeads.designed_native_ads.views.a.a;
import com.appnext.nativeads.designed_native_ads.views.models.AppnextSuggestedAppsImageSide;
import java.lang.ref.WeakReference;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a extends FrameLayout {
    private final float DEFAULT_TITLE_TEXT_SIZE;
    private int mAmountOfApps;
    private int mAppTitleTextColor;
    private int mBackgroundColor;
    private com.appnext.nativeads.designed_native_ads.views.a.a mDesignedNativeAdView;
    private AppnextDesignedNativeAdViewCallbacks mDesignedNativeAdViewCallbacks;
    private boolean mIsInitialized;
    private boolean mIsLocalDirectionExists;
    private boolean mIsPresentTitlesExists;
    private boolean mLocalDirection;
    private boolean mPresentTitles;
    private String mTitle;
    private float mTitleFontSize;
    private int mTitleTextColor;
    private int mTransparency;

    /* renamed from: com.appnext.nativeads.designed_native_ads.views.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class C0164a implements a.InterfaceC0165a {
        private WeakReference<AppnextDesignedNativeAdViewCallbacks> gi;

        public C0164a(AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
            this.gi = new WeakReference<>(appnextDesignedNativeAdViewCallbacks);
        }

        @Override // com.appnext.nativeads.designed_native_ads.views.a.a.InterfaceC0165a
        public final void onAdClicked(AppnextDesignedNativeAdData appnextDesignedNativeAdData) {
            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks;
            WeakReference<AppnextDesignedNativeAdViewCallbacks> weakReference = this.gi;
            if (weakReference == null || (appnextDesignedNativeAdViewCallbacks = weakReference.get()) == null) {
                return;
            }
            appnextDesignedNativeAdViewCallbacks.onAdClicked(appnextDesignedNativeAdData);
        }

        @Override // com.appnext.nativeads.designed_native_ads.views.a.a.InterfaceC0165a
        public final void onAdsLoadedSuccessfully() {
            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks;
            a.this.setVisibility(0);
            WeakReference<AppnextDesignedNativeAdViewCallbacks> weakReference = this.gi;
            if (weakReference == null || (appnextDesignedNativeAdViewCallbacks = weakReference.get()) == null) {
                return;
            }
            appnextDesignedNativeAdViewCallbacks.onAppnextAdsLoadedSuccessfully();
        }

        @Override // com.appnext.nativeads.designed_native_ads.views.a.a.InterfaceC0165a
        public final void onError(AppnextError appnextError) {
            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks;
            WeakReference<AppnextDesignedNativeAdViewCallbacks> weakReference = this.gi;
            if (weakReference == null || (appnextDesignedNativeAdViewCallbacks = weakReference.get()) == null) {
                return;
            }
            appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(appnextError);
        }
    }

    public a(Context context) {
        this(context, null, 0);
    }

    private void buildView() {
        try {
            FrameLayout.inflate(getContext(), getContentResource(), this);
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$buildView", th);
        }
    }

    private float convertDpToPx(float f10) {
        return f10 * getResources().getDisplayMetrics().density;
    }

    private void init(Context context, AttributeSet attributeSet) {
        Appnext.init(context);
        buildView();
        setBackgroundColor(Color.parseColor(c.aK().t("background_color")));
        setVisibility(8);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AppnextDesignedNativeAdView, 0, 0);
            try {
                this.mTitle = obtainStyledAttributes.getString(R.styleable.AppnextDesignedNativeAdView_title);
                this.mTitleTextColor = obtainStyledAttributes.getInteger(R.styleable.AppnextDesignedNativeAdView_titleColor, 0);
                setTitleTextSize(obtainStyledAttributes.getDimension(R.styleable.AppnextDesignedNativeAdView_titleTextSize, this.DEFAULT_TITLE_TEXT_SIZE) / context.getResources().getDisplayMetrics().scaledDensity);
                this.mAmountOfApps = obtainStyledAttributes.getInteger(R.styleable.AppnextDesignedNativeAdView_amountOfApps, -1);
                String string = obtainStyledAttributes.getString(R.styleable.AppnextDesignedNativeAdView_presentAppTitles);
                boolean z10 = true;
                boolean z11 = !TextUtils.isEmpty(string);
                this.mIsPresentTitlesExists = z11;
                if (z11) {
                    this.mPresentTitles = Boolean.parseBoolean(string);
                }
                String string2 = obtainStyledAttributes.getString(R.styleable.AppnextDesignedNativeAdView_localDirection);
                if (TextUtils.isEmpty(string2)) {
                    z10 = false;
                }
                this.mIsLocalDirectionExists = z10;
                if (z10) {
                    this.mLocalDirection = Boolean.parseBoolean(string2);
                }
                this.mAppTitleTextColor = obtainStyledAttributes.getColor(R.styleable.AppnextDesignedNativeAdView_appTitletColor, 0);
                this.mBackgroundColor = obtainStyledAttributes.getColor(R.styleable.AppnextDesignedNativeAdView_backgroundColor, 0);
                this.mTransparency = obtainStyledAttributes.getInteger(R.styleable.AppnextDesignedNativeAdView_transparency, -1);
            } finally {
                try {
                } finally {
                }
            }
        }
        this.mIsInitialized = false;
    }

    private void setSuggestedAppsBackgroundColor(int i10) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i10);
            gradientDrawable.setCornerRadius(30.0f);
            setBackground(gradientDrawable);
        } catch (Throwable th) {
            com.appnext.base.a.a("DesignedNativeAdView$setSuggestedAppsBackgroundColor", th);
        }
    }

    private void setViewSize() {
        int width = width();
        if (width > 0) {
            width = (int) convertDpToPx(width);
        }
        int height = height();
        if (height > 0) {
            height = (int) convertDpToPx(height);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        setLayoutParams(layoutParams);
    }

    protected abstract int designedNativeAdsContainerResource();

    protected abstract int getContentResource();

    protected abstract int height();

    /* JADX INFO: Access modifiers changed from: protected */
    public void loadDesignedNativeAds(final String str, final DesignNativeAdsRequest designNativeAdsRequest, int i10, AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide, final AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        try {
            if (!i.h(getContext())) {
                if (appnextDesignedNativeAdViewCallbacks != null) {
                    appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError(AppnextError.CONNECTION_ERROR));
                    return;
                }
                return;
            }
            if (i10 > 0 && i10 <= maxSuggestedAdsCount()) {
                this.mAmountOfApps = i10;
            }
            this.mDesignedNativeAdViewCallbacks = appnextDesignedNativeAdViewCallbacks;
            final ViewGroup viewGroup = (ViewGroup) findViewById(designedNativeAdsContainerResource());
            if (viewGroup != null) {
                com.appnext.nativeads.designed_native_ads.views.a.b bVar = new com.appnext.nativeads.designed_native_ads.views.a.b(getContext());
                this.mDesignedNativeAdView = bVar;
                bVar.setPrivacyIconSide(appnextSuggestedAppsImageSide);
                this.mDesignedNativeAdView.a(str, new a.b() { // from class: com.appnext.nativeads.designed_native_ads.views.a.1
                    @Override // com.appnext.nativeads.designed_native_ads.views.a.a.b
                    public final void aQ() {
                        try {
                            a.this.mIsInitialized = true;
                            if (a.this.mTitle != null) {
                                a aVar = a.this;
                                aVar.setTitle(aVar.mTitle);
                                a.this.mDesignedNativeAdView.setTitle(a.this.mTitle);
                            }
                            if (a.this.mTitleFontSize != 0.0f) {
                                a.this.mDesignedNativeAdView.setSuggestedTitleTextSize(a.this.mTitleFontSize);
                            }
                            if (a.this.mTitleTextColor != 0) {
                                a.this.mDesignedNativeAdView.setTitleTextColor(a.this.mTitleTextColor);
                            }
                            if (a.this.mAmountOfApps > 0) {
                                a.this.mDesignedNativeAdView.setAmountOfApps(a.this.mAmountOfApps);
                            } else if (a.this.mDesignedNativeAdView.getAmountOfApps() == 0) {
                                a aVar2 = a.this;
                                aVar2.mAmountOfApps = aVar2.maxSuggestedAdsCount();
                                a.this.mDesignedNativeAdView.setAmountOfApps(a.this.mAmountOfApps);
                            }
                            if (a.this.mIsPresentTitlesExists) {
                                a.this.mDesignedNativeAdView.setPresentTitles(a.this.mPresentTitles);
                            }
                            if (a.this.mIsLocalDirectionExists) {
                                a.this.mDesignedNativeAdView.setLocalDirection(a.this.mLocalDirection);
                            }
                            if (a.this.mAppTitleTextColor != 0) {
                                a.this.mDesignedNativeAdView.setIconAppTitleTextColor(a.this.mAppTitleTextColor);
                            }
                            if (a.this.mBackgroundColor != 0) {
                                a.this.mDesignedNativeAdView.setBackgroundColor(a.this.mBackgroundColor);
                            } else if (a.this.mDesignedNativeAdView.getBackgroundColor() == 0) {
                                a.this.mDesignedNativeAdView.setBackgroundColor(0);
                            }
                            if (a.this.mTransparency >= 0) {
                                a.this.mDesignedNativeAdView.setTransparency(a.this.mTransparency);
                            }
                            viewGroup.removeAllViews();
                            ((FrameLayout) viewGroup).addView(a.this.mDesignedNativeAdView);
                            com.appnext.nativeads.designed_native_ads.views.a.a aVar3 = a.this.mDesignedNativeAdView;
                            String str2 = str;
                            DesignNativeAdsRequest designNativeAdsRequest2 = designNativeAdsRequest;
                            a aVar4 = a.this;
                            aVar3.a(str2, designNativeAdsRequest2, new C0164a(aVar4.mDesignedNativeAdViewCallbacks));
                        } catch (Throwable th) {
                            com.appnext.base.a.a("AppnextDesignedNativeAdViewProxy$load", th);
                            AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks2 = appnextDesignedNativeAdViewCallbacks;
                            if (appnextDesignedNativeAdViewCallbacks2 != null) {
                                appnextDesignedNativeAdViewCallbacks2.onAppnextAdsError(new AppnextError("Internal error"));
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$load", th);
            if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError("Internal error"));
            }
        }
    }

    protected abstract int maxSuggestedAdsCount();

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setViewSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAppTitleColor(int i10) {
        try {
            this.mAppTitleTextColor = i10;
            com.appnext.nativeads.designed_native_ads.views.a.a aVar = this.mDesignedNativeAdView;
            if (aVar == null || !this.mIsInitialized) {
                return;
            }
            aVar.setIconAppTitleTextColor(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$setAppTitleColor", th);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.mBackgroundColor = i10;
            setSuggestedAppsBackgroundColor(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$setBackgroundColor", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLocalDirection(boolean z10) {
        try {
            this.mLocalDirection = z10;
            this.mIsLocalDirectionExists = true;
            com.appnext.nativeads.designed_native_ads.views.a.a aVar = this.mDesignedNativeAdView;
            if (aVar == null || !this.mIsInitialized) {
                return;
            }
            aVar.setLocalDirection(z10);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$setLocalDirection", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPresentAppTitles(boolean z10) {
        try {
            this.mPresentTitles = z10;
            this.mIsPresentTitlesExists = true;
            com.appnext.nativeads.designed_native_ads.views.a.a aVar = this.mDesignedNativeAdView;
            if (aVar == null || !this.mIsInitialized) {
                return;
            }
            aVar.setPresentTitles(z10);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$setPresentAppTitles", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTitle(String str) {
        TextView textView;
        this.mTitle = str;
        if (str == null || !this.mIsInitialized || (textView = (TextView) findViewById(R.id.suggested_apps_title)) == null) {
            return;
        }
        textView.setTextSize(0, this.mTitleFontSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTitleColor(int i10) {
        try {
            this.mTitleTextColor = i10;
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$setTitleColor", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTitleTextSize(float f10) {
        if (f10 < 11.0f || f10 > 18.0f) {
            f10 = (f10 < 11.0f || f10 <= 18.0f) ? 11.0f : 18.0f;
        }
        try {
            float applyDimension = TypedValue.applyDimension(2, f10, getResources().getDisplayMetrics());
            this.mTitleFontSize = applyDimension;
            com.appnext.nativeads.designed_native_ads.views.a.a aVar = this.mDesignedNativeAdView;
            if (aVar == null || !this.mIsInitialized) {
                return;
            }
            aVar.setSuggestedTitleTextSize(applyDimension);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$setTitleTextSize", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransparency(int i10) {
        try {
            this.mTransparency = i10;
            com.appnext.nativeads.designed_native_ads.views.a.a aVar = this.mDesignedNativeAdView;
            if (aVar == null || !this.mIsInitialized) {
                return;
            }
            aVar.setTransparency(i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$setTransparency", th);
        }
    }

    protected abstract int width();

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.DEFAULT_TITLE_TEXT_SIZE = TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics());
        this.mIsPresentTitlesExists = false;
        this.mIsLocalDirectionExists = false;
        init(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.DEFAULT_TITLE_TEXT_SIZE = TypedValue.applyDimension(2, 11.0f, getResources().getDisplayMetrics());
        this.mIsPresentTitlesExists = false;
        this.mIsLocalDirectionExists = false;
        try {
            init(context, attributeSet);
        } catch (Throwable th) {
            com.appnext.base.a.a("AppnextDesignedNativeAdViewProxy$AppnextDesignedNativeAdViewProxy", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void loadDesignedNativeAds(String str, DesignNativeAdsRequest designNativeAdsRequest, AppnextSuggestedAppsImageSide appnextSuggestedAppsImageSide, AppnextDesignedNativeAdViewCallbacks appnextDesignedNativeAdViewCallbacks) {
        try {
            loadDesignedNativeAds(str, designNativeAdsRequest, 0, appnextSuggestedAppsImageSide, appnextDesignedNativeAdViewCallbacks);
        } catch (Throwable th) {
            com.appnext.base.a.a("ANDesignedNativeAdsView$loadDesignedNativeAds", th);
            if (appnextDesignedNativeAdViewCallbacks != null) {
                appnextDesignedNativeAdViewCallbacks.onAppnextAdsError(new AppnextError("Internal error"));
            }
        }
    }
}
