package com.appnext.core;

import android.text.TextUtils;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class Configuration implements Serializable {
    public Boolean backButtonCanClose;
    public Boolean mute;
    private String categories = "";
    private String mSpecificCategories = "";
    public String postback = "";
    public int maxVideoLength = 0;
    public int minVideoLength = 0;
    public String orientation = Ad.ORIENTATION_DEFAULT;
    public String language = "";

    private static String s(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, "UTF-8"))) {
                return URLEncoder.encode(str, "UTF-8");
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return "";
    }

    protected abstract SettingsManager g();

    public String getCategories() {
        return this.categories;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public boolean getMute() {
        Boolean bool = this.mute;
        return bool == null ? Boolean.parseBoolean(g().t("mute")) : bool.booleanValue();
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getPostback() {
        return this.postback;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    @Deprecated
    public boolean isBackButtonCanClose() {
        Boolean bool = this.backButtonCanClose;
        return bool == null ? Boolean.parseBoolean(g().t("can_close")) : bool.booleanValue();
    }

    public void setCategories(String str) {
        this.categories = s(str);
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMaxVideoLength(int i10) {
        if (i10 >= 0) {
            if (i10 > 0 && getMinVideoLength() > 0 && i10 < getMinVideoLength()) {
                throw new IllegalArgumentException("Max Length cannot be lower than min length");
            }
            this.maxVideoLength = i10;
            return;
        }
        throw new IllegalArgumentException("Max Length must be higher than 0");
    }

    public void setMinVideoLength(int i10) {
        if (i10 >= 0) {
            if (i10 > 0 && getMaxVideoLength() > 0 && i10 > getMaxVideoLength()) {
                throw new IllegalArgumentException("Min Length cannot be higher than max length");
            }
            this.minVideoLength = i10;
            return;
        }
        throw new IllegalArgumentException("Min Length must be higher than 0");
    }

    public void setMute(boolean z10) {
        this.mute = Boolean.valueOf(z10);
    }

    public void setOrientation(String str) {
        if (str != null) {
            if (!str.equals(Ad.ORIENTATION_AUTO) && !str.equals(Ad.ORIENTATION_DEFAULT) && !str.equals("landscape") && !str.equals("portrait")) {
                throw new IllegalArgumentException("Wrong orientation type");
            }
            this.orientation = str;
            return;
        }
        throw new IllegalArgumentException("orientation type");
    }

    public void setPostback(String str) {
        this.postback = s(str);
    }

    public void setSpecificCategories(String str) {
        this.mSpecificCategories = s(str);
    }
}
