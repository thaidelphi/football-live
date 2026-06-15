package com.appnext.nativeads.designed_native_ads;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DesignNativeAdsRequest extends com.appnext.core.c {
    private String fP = "";
    private String mSpecificCategories = "";
    private String fQ = "";

    public String getCategories() {
        return this.fP;
    }

    public String getPostBack() {
        return this.fQ;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    public DesignNativeAdsRequest setCategories(String str) {
        this.fP = str;
        return this;
    }

    public DesignNativeAdsRequest setPostBack(String str) {
        this.fQ = str;
        return this;
    }

    public DesignNativeAdsRequest setSpecificCategories(String str) {
        this.mSpecificCategories = str;
        return this;
    }
}
