package com.startapp.sdk.ads.banner;

import android.view.View;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface BannerListener {
    void onClick(View view);

    void onFailedToReceiveAd(View view);

    void onImpression(View view);

    void onReceiveAd(View view);
}
