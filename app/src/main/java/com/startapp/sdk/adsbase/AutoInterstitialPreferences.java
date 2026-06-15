package com.startapp.sdk.adsbase;

import com.ironsource.b9;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = -9010452850291284559L;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(AdsCommonMetaData.k().f());
        setSecondsBetweenAds(AdsCommonMetaData.k().g());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.activitiesBetweenAds = i10;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.secondsBetweenAds = i10;
        return this;
    }

    public String toString() {
        return "AutoInterstitialPreferences [activitiesBetweenAds=" + this.activitiesBetweenAds + ", secondsBetweenAds=" + this.secondsBetweenAds + b9.i.f16698e;
    }
}
