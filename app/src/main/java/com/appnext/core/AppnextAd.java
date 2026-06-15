package com.appnext.core;

import android.text.TextUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppnextAd extends j {
    private String advertiser_entity;
    private String advertiser_name;
    private String advertiser_website;
    private String androidPackage;
    private String appSize;
    private String bId;
    private String buttonText;
    private String campaignGoal;
    private String campaignId;
    private String campaignType;
    private String categories;
    private String cb;
    private String country;
    private String cpt_list;
    private String desc;
    private String ecpm;
    private String gdpr;
    private String idx;
    private String inn;
    private String market_url;
    private String pbaBId;
    private String pbaZId;
    private String pixelImp;
    private String revenueRate;
    private String revenueType;
    private String specificCategories;
    private String storeDownloads;
    private String storeRating;
    private String supportedVersion;
    private String title;
    private String token;
    private String urlApp;
    private String urlImg;
    private String urlImgWide;
    private String urlVideo;
    private String urlVideo30Sec;
    private String urlVideo30SecHigh;
    private String urlVideoHigh;
    private String webview;
    private String zId;

    protected AppnextAd() {
        this.desc = "";
        this.title = "";
        this.urlImg = "";
        this.urlImgWide = "";
        this.urlApp = "";
        this.bId = "";
        this.campaignId = "";
        this.cb = "";
        this.zId = "";
        this.androidPackage = "";
        this.pbaZId = "";
        this.pbaBId = "";
        this.revenueType = "";
        this.revenueRate = "";
        this.categories = "";
        this.specificCategories = "";
        this.idx = "";
        this.pixelImp = "";
        this.country = "";
        this.campaignType = "";
        this.supportedVersion = "";
        this.storeRating = "";
        this.storeDownloads = "";
        this.appSize = "";
        this.urlVideo = "";
        this.urlVideoHigh = "";
        this.urlVideo30Sec = "";
        this.urlVideo30SecHigh = "";
        this.campaignGoal = "";
        this.buttonText = "";
        this.ecpm = "";
        this.cpt_list = "";
        this.webview = "0";
        this.gdpr = "0";
        this.advertiser_name = "";
        this.advertiser_entity = "";
        this.advertiser_website = "";
        this.inn = "";
        this.token = "";
    }

    public String getAdDescription() {
        return this.desc;
    }

    public String getAdPackage() {
        return this.androidPackage;
    }

    public String getAdTitle() {
        return this.title;
    }

    public String getAdvertiserEntity() {
        return this.advertiser_entity;
    }

    public String getAdvertiserName() {
        return this.advertiser_name;
    }

    public String getAdvertiserWebsite() {
        return this.advertiser_website;
    }

    public String getAppSize() {
        return this.appSize;
    }

    public String getAppURL() {
        return this.urlApp;
    }

    public String getBannerID() {
        return this.bId;
    }

    protected String getBpub() {
        return this.pbaBId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getCampaignGoal() {
        return this.campaignGoal;
    }

    public String getCampaignID() {
        return this.campaignId;
    }

    public String getCampaignType() {
        return this.campaignType;
    }

    public String getCategories() {
        return this.categories;
    }

    protected String getCb() {
        return this.cb;
    }

    public String getCountry() {
        return this.country;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getCptList() {
        return this.cpt_list;
    }

    public AppnextAdCreativeType getCreativeType() {
        return (TextUtils.isEmpty(getVideoUrl()) && TextUtils.isEmpty(getVideoUrlHigh()) && TextUtils.isEmpty(getVideoUrl30Sec()) && TextUtils.isEmpty(getVideoUrlHigh30Sec())) ? AppnextAdCreativeType.STATIC : AppnextAdCreativeType.VIDEO;
    }

    public float getECPM() {
        return Float.parseFloat(getEcpm());
    }

    protected String getEcpm() {
        return this.ecpm;
    }

    protected String getEpub() {
        return this.pbaZId;
    }

    public String getINN() {
        return this.inn;
    }

    public String getIdx() {
        return this.idx;
    }

    public String getImageURL() {
        return this.urlImg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getImpressionURL() {
        return this.pixelImp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getMarketUrl() {
        return this.market_url;
    }

    public float getPPR() {
        return getECPM() / 1000.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getRevenueRate() {
        return this.revenueRate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getRevenueType() {
        return this.revenueType;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getSessionID() {
        return getSession();
    }

    public String getSpecificCategories() {
        return this.specificCategories;
    }

    public String getStoreDownloads() {
        return this.storeDownloads;
    }

    public String getStoreRating() {
        return this.storeRating;
    }

    public String getSupportedVersion() {
        return this.supportedVersion;
    }

    public String getToken() {
        return this.token;
    }

    public String getVideoUrl() {
        return this.urlVideo;
    }

    public String getVideoUrl30Sec() {
        return this.urlVideo30Sec;
    }

    public String getVideoUrlHigh() {
        return this.urlVideoHigh;
    }

    public String getVideoUrlHigh30Sec() {
        return this.urlVideo30SecHigh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getWebview() {
        return this.webview;
    }

    public String getWideImageURL() {
        return this.urlImgWide;
    }

    public String getZoneID() {
        return this.zId;
    }

    public boolean isGdpr() {
        return (TextUtils.isEmpty(this.gdpr) || this.gdpr.equals("0")) ? false : true;
    }

    protected void setAdDesc(String str) {
        this.desc = str;
    }

    protected void setAdPackage(String str) {
        this.androidPackage = str;
    }

    protected void setAdTitle(String str) {
        this.title = str;
    }

    protected void setAppSize(String str) {
        this.appSize = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAppURL(String str) {
        this.urlApp = str;
    }

    protected void setBannerID(String str) {
        this.bId = str;
    }

    protected void setBpub(String str) {
        this.pbaBId = str;
    }

    protected void setButtonText(String str) {
        this.buttonText = str;
    }

    protected void setCampaignGoal(String str) {
        this.campaignGoal = str;
    }

    protected void setCampaignID(String str) {
        this.campaignId = str;
    }

    protected void setCampaignType(String str) {
        this.campaignType = str;
    }

    protected void setCategories(String str) {
        this.categories = str;
    }

    protected void setCb(String str) {
        this.cb = str;
    }

    protected void setCounty(String str) {
        this.country = str;
    }

    protected void setCptList(String str) {
        this.cpt_list = str;
    }

    protected void setEcpm(String str) {
        this.ecpm = str;
    }

    protected void setEpub(String str) {
        this.pbaZId = str;
    }

    public void setGdpr(String str) {
        this.gdpr = str;
    }

    protected void setIdx(String str) {
        this.idx = str;
    }

    protected void setImageURL(String str) {
        this.urlImg = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setImpressionURL(String str) {
        this.pixelImp = str;
    }

    protected void setMarketUrl(String str) {
        this.market_url = str;
    }

    protected void setRevenueRate(String str) {
        this.revenueRate = str;
    }

    protected void setRevenueType(String str) {
        this.revenueType = str;
    }

    protected void setSpecificCategories(String str) {
        this.specificCategories = str;
    }

    protected void setStoreDownloads(String str) {
        this.storeDownloads = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setStoreRating(String str) {
        this.storeRating = str;
    }

    protected void setSupportedVersion(String str) {
        this.supportedVersion = str;
    }

    protected void setVideoUrl(String str) {
        this.urlVideo = str;
    }

    protected void setVideoUrl30Sec(String str) {
        this.urlVideo30Sec = str;
    }

    protected void setVideoUrlHigh(String str) {
        this.urlVideoHigh = str;
    }

    protected void setVideoUrlHigh30Sec(String str) {
        this.urlVideo30SecHigh = str;
    }

    protected void setWebview(String str) {
        this.webview = str;
    }

    protected void setWideImageURL(String str) {
        this.urlImgWide = str;
    }

    protected void setZoneID(String str) {
        this.zId = str;
    }

    public String toString() {
        return "AppnextAd{androidPackage='" + this.androidPackage + "'}";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AppnextAd(AppnextAd appnextAd) {
        this.desc = "";
        this.title = "";
        this.urlImg = "";
        this.urlImgWide = "";
        this.urlApp = "";
        this.bId = "";
        this.campaignId = "";
        this.cb = "";
        this.zId = "";
        this.androidPackage = "";
        this.pbaZId = "";
        this.pbaBId = "";
        this.revenueType = "";
        this.revenueRate = "";
        this.categories = "";
        this.specificCategories = "";
        this.idx = "";
        this.pixelImp = "";
        this.country = "";
        this.campaignType = "";
        this.supportedVersion = "";
        this.storeRating = "";
        this.storeDownloads = "";
        this.appSize = "";
        this.urlVideo = "";
        this.urlVideoHigh = "";
        this.urlVideo30Sec = "";
        this.urlVideo30SecHigh = "";
        this.campaignGoal = "";
        this.buttonText = "";
        this.ecpm = "";
        this.cpt_list = "";
        this.webview = "0";
        this.gdpr = "0";
        this.advertiser_name = "";
        this.advertiser_entity = "";
        this.advertiser_website = "";
        this.inn = "";
        this.token = "";
        if (appnextAd == null) {
            return;
        }
        this.desc = appnextAd.desc;
        this.title = appnextAd.title;
        this.urlImg = appnextAd.urlImg;
        this.urlImgWide = appnextAd.urlImgWide;
        this.urlApp = appnextAd.urlApp;
        this.bId = appnextAd.bId;
        this.campaignId = appnextAd.campaignId;
        this.cb = appnextAd.cb;
        this.zId = appnextAd.zId;
        this.androidPackage = appnextAd.androidPackage;
        this.pbaZId = appnextAd.pbaZId;
        this.pbaBId = appnextAd.pbaBId;
        this.revenueType = appnextAd.revenueType;
        this.revenueRate = appnextAd.revenueRate;
        this.categories = appnextAd.categories;
        this.specificCategories = appnextAd.specificCategories;
        this.idx = appnextAd.idx;
        this.pixelImp = appnextAd.pixelImp;
        this.country = appnextAd.country;
        this.campaignType = appnextAd.campaignType;
        this.supportedVersion = appnextAd.supportedVersion;
        this.storeRating = appnextAd.storeRating;
        this.storeDownloads = appnextAd.storeDownloads;
        this.appSize = appnextAd.appSize;
        this.urlVideo = appnextAd.urlVideo;
        this.urlVideoHigh = appnextAd.urlVideoHigh;
        this.urlVideo30Sec = appnextAd.urlVideo30Sec;
        this.urlVideo30SecHigh = appnextAd.urlVideo30SecHigh;
        this.campaignGoal = appnextAd.campaignGoal;
        this.buttonText = appnextAd.buttonText;
        this.ecpm = appnextAd.ecpm;
        this.cpt_list = appnextAd.cpt_list;
        this.webview = appnextAd.webview;
        this.gdpr = appnextAd.gdpr;
        this.market_url = appnextAd.market_url;
        this.advertiser_name = appnextAd.advertiser_name;
        this.advertiser_entity = appnextAd.advertiser_entity;
        this.advertiser_website = appnextAd.advertiser_website;
        this.inn = appnextAd.inn;
        this.token = appnextAd.token;
        setAdID(appnextAd.getAdID());
        setSession(appnextAd.getSession());
        setPlacementID(appnextAd.getPlacementID());
        setAdJSON(appnextAd.getAdJSON());
    }
}
