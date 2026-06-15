package com.appnext.nativeads;

import com.appnext.core.AppnextAd;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAdData extends AppnextAd {
    private String selectedVideo;

    public NativeAdData(AppnextAd appnextAd) {
        super(appnextAd);
        this.selectedVideo = "";
        if (appnextAd instanceof NativeAdData) {
            this.selectedVideo = ((NativeAdData) appnextAd).getSelectedVideo();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(String str) {
        this.selectedVideo = str;
    }

    @Override // com.appnext.core.AppnextAd
    public String getAppURL() {
        return super.getAppURL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public String getButtonText() {
        return super.getButtonText();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public String getCampaignGoal() {
        return super.getCampaignGoal();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public String getCptList() {
        return super.getCptList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public String getImpressionURL() {
        return super.getImpressionURL();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public String getRevenueType() {
        return super.getRevenueType();
    }

    public String getSelectedVideo() {
        return this.selectedVideo;
    }

    @Override // com.appnext.core.AppnextAd
    public String getSessionID() {
        return super.getSessionID();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public String getWebview() {
        return super.getWebview();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public void setAppURL(String str) {
        super.setAppURL(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.AppnextAd
    public void setImpressionURL(String str) {
        super.setImpressionURL(str);
    }
}
