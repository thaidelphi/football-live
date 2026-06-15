package com.applovin.mediation.nativeAds;

import android.view.View;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final View f9909a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9910b;

        /* renamed from: c  reason: collision with root package name */
        private int f9911c;

        /* renamed from: d  reason: collision with root package name */
        private int f9912d;

        /* renamed from: e  reason: collision with root package name */
        private int f9913e;

        /* renamed from: f  reason: collision with root package name */
        private int f9914f;

        /* renamed from: g  reason: collision with root package name */
        private int f9915g;

        /* renamed from: h  reason: collision with root package name */
        private int f9916h;

        /* renamed from: i  reason: collision with root package name */
        private int f9917i;

        /* renamed from: j  reason: collision with root package name */
        private int f9918j;

        /* renamed from: k  reason: collision with root package name */
        private int f9919k;

        /* renamed from: l  reason: collision with root package name */
        private int f9920l;

        /* renamed from: m  reason: collision with root package name */
        private int f9921m;

        /* renamed from: n  reason: collision with root package name */
        private String f9922n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f9909a, this.f9910b, this.f9911c, this.f9912d, this.f9913e, this.f9914f, this.f9915g, this.f9918j, this.f9916h, this.f9917i, this.f9919k, this.f9920l, this.f9921m, this.f9922n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f9912d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f9913e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f9921m = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f9915g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f9914f = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.f9920l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f9919k = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f9917i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f9916h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f9918j = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.f9922n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f9911c = i10;
            return this;
        }

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f9911c = -1;
            this.f9912d = -1;
            this.f9913e = -1;
            this.f9914f = -1;
            this.f9915g = -1;
            this.f9916h = -1;
            this.f9917i = -1;
            this.f9918j = -1;
            this.f9919k = -1;
            this.f9920l = -1;
            this.f9921m = -1;
            this.f9910b = i10;
            this.f9909a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
