package com.appnext.nativeads.designed_native_ads;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppnextDesignedNativeAdData {
    private String fF;
    private String fG;
    private long fH;

    public AppnextDesignedNativeAdData(String str, String str2, long j10) {
        this.fF = str;
        this.fG = str2;
        this.fH = j10;
    }

    public long getAdClickedTime() {
        return this.fH;
    }

    public String getAdPackageName() {
        return this.fF;
    }

    public String getAdTitle() {
        return this.fG;
    }
}
