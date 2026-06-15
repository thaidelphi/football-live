package com.adcolony.sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyAdSize {

    /* renamed from: a  reason: collision with root package name */
    int f5659a;

    /* renamed from: b  reason: collision with root package name */
    int f5660b;
    public static final AdColonyAdSize MEDIUM_RECTANGLE = new AdColonyAdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    public static final AdColonyAdSize BANNER = new AdColonyAdSize(320, 50);
    public static final AdColonyAdSize LEADERBOARD = new AdColonyAdSize(728, 90);
    public static final AdColonyAdSize SKYSCRAPER = new AdColonyAdSize(160, 600);

    public AdColonyAdSize(int i10, int i11) {
        this.f5659a = i10;
        this.f5660b = i11;
    }

    public int getHeight() {
        return this.f5660b;
    }

    public int getWidth() {
        return this.f5659a;
    }
}
