package com.appnext.banners;

import java.io.Serializable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerAdRequest extends com.appnext.core.c implements Serializable {
    public static final String TYPE_ALL = "all";
    public static final String TYPE_STATIC = "static";
    public static final String TYPE_VIDEO = "video";
    public static final String VIDEO_LENGTH_LONG = "30";
    public static final String VIDEO_LENGTH_SHORT = "15";
    private boolean autoPlay;
    private int bx;
    private int by;
    private String categories;
    private boolean clickEnabled;
    private String creativeType;
    private String mSpecificCategories;
    private boolean mute;
    private String postback;
    private String videoLength;

    public BannerAdRequest() {
        this.categories = "";
        this.mSpecificCategories = "";
        this.postback = "";
        this.creativeType = TYPE_ALL;
        this.autoPlay = false;
        this.mute = true;
        this.videoLength = "15";
        this.bx = 0;
        this.by = 0;
        this.clickEnabled = true;
    }

    public String getCategories() {
        return this.categories;
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    public String getPostback() {
        return this.postback;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public int getVidMax() {
        return this.by;
    }

    public int getVidMin() {
        return this.bx;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public boolean isMute() {
        return this.mute;
    }

    public BannerAdRequest setAutoPlay(boolean z10) {
        this.autoPlay = z10;
        return this;
    }

    public BannerAdRequest setCategories(String str) {
        this.categories = str;
        return this;
    }

    public BannerAdRequest setClickEnabled(boolean z10) {
        this.clickEnabled = z10;
        return this;
    }

    public BannerAdRequest setCreativeType(String str) {
        this.creativeType = str;
        return this;
    }

    public BannerAdRequest setMute(boolean z10) {
        this.mute = z10;
        return this;
    }

    public BannerAdRequest setPostback(String str) {
        this.postback = str;
        return this;
    }

    public BannerAdRequest setSpecificCategories(String str) {
        this.mSpecificCategories = str;
        return this;
    }

    public BannerAdRequest setVidMax(int i10) {
        this.by = i10;
        return this;
    }

    public BannerAdRequest setVidMin(int i10) {
        this.bx = i10;
        return this;
    }

    public BannerAdRequest setVideoLength(String str) {
        this.videoLength = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BannerAdRequest(BannerAdRequest bannerAdRequest) {
        this.categories = "";
        this.mSpecificCategories = "";
        this.postback = "";
        this.creativeType = TYPE_ALL;
        this.autoPlay = false;
        this.mute = true;
        this.videoLength = "15";
        this.bx = 0;
        this.by = 0;
        this.clickEnabled = true;
        this.categories = bannerAdRequest.categories;
        this.mSpecificCategories = bannerAdRequest.mSpecificCategories;
        this.postback = bannerAdRequest.postback;
        this.creativeType = bannerAdRequest.creativeType;
        this.autoPlay = bannerAdRequest.autoPlay;
        this.mute = bannerAdRequest.mute;
        this.videoLength = bannerAdRequest.videoLength;
        this.bx = bannerAdRequest.bx;
        this.by = bannerAdRequest.by;
        this.clickEnabled = bannerAdRequest.clickEnabled;
    }
}
