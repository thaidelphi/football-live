package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.e7;
import com.applovin.impl.o4;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.R;
@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final n logger;
    protected final com.applovin.impl.sdk.j sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.j jVar, Context context) {
        super(context);
        setBackgroundColor(-16777216);
        this.sdk = jVar;
        this.logger = jVar.I();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        e7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri q02 = vastAd != null ? vastAd.q0() : null;
        if (mainImageUri == null && q02 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) jVar.a(o4.H2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(jVar, o4.f8179o0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }
}
