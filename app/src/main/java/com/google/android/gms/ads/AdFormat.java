package com.google.android.gms.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f11063a;

    AdFormat(int i10) {
        this.f11063a = i10;
    }

    public static AdFormat getAdFormat(int i10) {
        AdFormat[] values;
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i10) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.f11063a;
    }
}
