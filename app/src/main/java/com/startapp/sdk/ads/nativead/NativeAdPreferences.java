package com.startapp.sdk.ads.nativead;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAdPreferences extends AdPreferences {
    private static final long serialVersionUID = 4908967312868830516L;
    private int adsNumber;
    private boolean autoBitmapDownload;
    private NativeAdBitmapSize bitmapSize;
    private boolean isContentAd;
    private int moreImage;
    private int primaryImage;
    private boolean useSimpleToken;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum NativeAdBitmapSize {
        SIZE72X72(72, 72),
        SIZE100X100(100, 100),
        SIZE150X150(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED),
        SIZE340X340(340, 340);
        
        int height;
        int width;

        NativeAdBitmapSize(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public NativeAdPreferences() {
        this.adsNumber = 1;
        this.autoBitmapDownload = false;
        this.primaryImage = -1;
        this.moreImage = -1;
        this.isContentAd = false;
        this.useSimpleToken = true;
    }

    public int getAdsNumber() {
        return this.adsNumber;
    }

    public NativeAdBitmapSize getImageSize() {
        return this.bitmapSize;
    }

    public int getPrimaryImageSize() {
        return this.primaryImage;
    }

    public int getSecondaryImageSize() {
        return this.moreImage;
    }

    public boolean isAutoBitmapDownload() {
        return this.autoBitmapDownload;
    }

    public boolean isContentAd() {
        return this.isContentAd;
    }

    @Override // com.startapp.sdk.adsbase.model.AdPreferences
    public boolean isSimpleToken() {
        return this.useSimpleToken;
    }

    public NativeAdPreferences setAdsNumber(int i10) {
        if (i10 > 0) {
            this.adsNumber = i10;
            return this;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }

    public NativeAdPreferences setAutoBitmapDownload(boolean z10) {
        this.autoBitmapDownload = z10;
        return this;
    }

    public NativeAdPreferences setContentAd(boolean z10) {
        this.isContentAd = z10;
        return this;
    }

    public NativeAdPreferences setImageSize(NativeAdBitmapSize nativeAdBitmapSize) {
        this.bitmapSize = nativeAdBitmapSize;
        return this;
    }

    public NativeAdPreferences setPrimaryImageSize(int i10) {
        this.primaryImage = i10;
        return this;
    }

    public NativeAdPreferences setSecondaryImageSize(int i10) {
        this.moreImage = i10;
        return this;
    }

    @Override // com.startapp.sdk.adsbase.model.AdPreferences
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("\n===== NativeAdConfig =====\n");
        stringBuffer.append("    adsNumber: [" + getAdsNumber() + "]\n");
        stringBuffer.append("    autoBitmapDownload: [" + isAutoBitmapDownload() + "]\n");
        stringBuffer.append("    useSimpleToken: [" + isSimpleToken() + "]\n");
        stringBuffer.append("===== End NativeAdConfig =====");
        return stringBuffer.toString();
    }

    public NativeAdPreferences useSimpleToken(boolean z10) {
        this.useSimpleToken = z10;
        return this;
    }

    public NativeAdPreferences(NativeAdPreferences nativeAdPreferences) {
        super(nativeAdPreferences);
        this.adsNumber = 1;
        this.autoBitmapDownload = false;
        this.primaryImage = -1;
        this.moreImage = -1;
        this.isContentAd = false;
        this.useSimpleToken = true;
        this.adsNumber = nativeAdPreferences.adsNumber;
        this.autoBitmapDownload = nativeAdPreferences.autoBitmapDownload;
        this.bitmapSize = nativeAdPreferences.bitmapSize;
        this.primaryImage = nativeAdPreferences.primaryImage;
        this.moreImage = nativeAdPreferences.moreImage;
        this.isContentAd = nativeAdPreferences.isContentAd;
        this.useSimpleToken = nativeAdPreferences.useSimpleToken;
    }
}
