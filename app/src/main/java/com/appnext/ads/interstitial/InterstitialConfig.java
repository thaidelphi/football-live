package com.appnext.ads.interstitial;

import android.graphics.Color;
import com.appnext.core.Configuration;
import com.appnext.core.SettingsManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class InterstitialConfig extends Configuration {
    public Boolean autoPlay;
    public String creativeType = Interstitial.TYPE_MANAGED;
    public String skipText = "";
    public String buttonColor = "";
    protected boolean aM = false;

    @Override // com.appnext.core.Configuration
    protected final SettingsManager g() {
        return c.E();
    }

    public String getButtonColor() {
        return this.buttonColor;
    }

    public String getCreativeType() {
        return this.creativeType;
    }

    public String getSkipText() {
        return this.skipText;
    }

    public boolean isAutoPlay() {
        try {
            Boolean bool = this.autoPlay;
            return bool == null ? Boolean.parseBoolean(c.E().t("auto_play")) : bool.booleanValue();
        } catch (Throwable th) {
            com.appnext.base.a.a("InterstitialConfig$isAutoPlay", th);
            return false;
        }
    }

    public void setAutoPlay(boolean z10) {
        this.autoPlay = Boolean.valueOf(z10);
    }

    @Deprecated
    public void setBackButtonCanClose(boolean z10) {
        this.backButtonCanClose = Boolean.valueOf(z10);
    }

    public void setButtonColor(String str) {
        if (str == null) {
            this.buttonColor = "";
            return;
        }
        if (!str.startsWith("#")) {
            str = "#" + str;
        }
        Color.parseColor(str);
        this.buttonColor = str;
        this.aM = true;
    }

    public void setCreativeType(String str) {
        if (!str.equals(Interstitial.TYPE_MANAGED) && !str.equals("static") && !str.equals("video")) {
            com.appnext.base.a.a("InterstitialConfig$setCreativeType", new Throwable("Wrong creative type"));
        } else {
            this.creativeType = str;
        }
    }

    @Override // com.appnext.core.Configuration
    @Deprecated
    public void setOrientation(String str) {
    }

    public void setSkipText(String str) {
        if (str == null) {
            str = "";
        }
        this.skipText = str;
    }
}
