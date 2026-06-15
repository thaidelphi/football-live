package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u7;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private MaxAdViewImpl f9864a;

    /* renamed from: b  reason: collision with root package name */
    private View f9865b;

    /* renamed from: c  reason: collision with root package name */
    private int f9866c;

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i10, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f9865b = view;
        view.setBackgroundColor(0);
        addView(this.f9865b);
        this.f9865b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f9866c = getVisibility();
        this.f9864a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f9865b, appLovinSdk.a(), context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f9864a.logApiCall("destroy()");
        this.f9864a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f9864a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f9864a.getAdUnitId();
    }

    public String getPlacement() {
        this.f9864a.logApiCall("getPlacement()");
        return this.f9864a.getPlacement();
    }

    public void loadAd() {
        this.f9864a.logApiCall("loadAd()");
        this.f9864a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isInEditMode()) {
            return;
        }
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f9864a != null && u7.a(this.f9866c, i10)) {
            this.f9864a.onWindowVisibilityChanged(i10);
        }
        this.f9866c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f9864a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f9865b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f9864a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i10);
        }
        View view = this.f9865b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f9864a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f9864a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f9864a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f9864a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f9864a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f9864a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f9864a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f9864a.logApiCall("startAutoRefresh()");
        this.f9864a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f9864a.logApiCall("stopAutoRefresh()");
        this.f9864a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f9864a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, o.a(context), appLovinSdk, context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        MaxAdFormat a10;
        String a11 = o.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a12 = o.a(context, attributeSet, AppLovinAdView.NAMESPACE, ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT);
        if (StringUtils.isValidString(a12)) {
            a10 = MaxAdFormat.formatFromString(a12);
        } else {
            a10 = o.a(context);
        }
        MaxAdFormat maxAdFormat = a10;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a11 != null) {
            if (!TextUtils.isEmpty(a11)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(a11, maxAdFormat, attributeIntValue, AppLovinSdk.getInstance(context), context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }
}
