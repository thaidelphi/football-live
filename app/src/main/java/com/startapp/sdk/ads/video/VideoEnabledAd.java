package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.m4;
import com.startapp.o9;
import com.startapp.q9;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.w9;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class VideoEnabledAd extends InterstitialAd {
    private static final long serialVersionUID = -1663785294768983014L;
    private VideoAdDetails videoAdDetails;

    public VideoEnabledAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        this.videoAdDetails = null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public void a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new b(this.f22876a, this, adPreferences, adEventListener, this.placement).c();
    }

    @Override // com.startapp.sdk.adsbase.HtmlAd
    public final void c(String str) {
        super.c(str);
        String a10 = o9.a(str, "@videoJson@", "@videoJson@");
        if (a10 != null) {
            VideoAdDetails videoAdDetails = (VideoAdDetails) m4.a(VideoAdDetails.class, a10);
            this.videoAdDetails = videoAdDetails;
            if (videoAdDetails != null) {
                videoAdDetails.p();
            }
        }
    }

    @Override // com.startapp.sdk.ads.interstitials.InterstitialAd
    public final boolean u() {
        return this.videoAdDetails != null;
    }

    public final void v() {
        this.videoAdDetails = null;
    }

    public final VideoAdDetails w() {
        return this.videoAdDetails;
    }

    public final void a(q9 q9Var, VideoConfig videoConfig, w9 w9Var) {
        this.videoAdDetails = new VideoAdDetails(q9Var, videoConfig, w9Var);
        Integer num = q9Var.f22437q;
        if (num == null || q9Var.f22438r == null) {
            return;
        }
        if (num.intValue() > q9Var.f22438r.intValue()) {
            a(SplashConfig.Orientation.LANDSCAPE);
        } else {
            a(SplashConfig.Orientation.PORTRAIT);
        }
    }
}
