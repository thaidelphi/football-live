package com.appnext.ads.fullscreen;

import com.appnext.core.Configuration;
import com.appnext.core.SettingsManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class VideoConfig extends Configuration {
    public Boolean showCta;
    public String videoLength = "15";
    public int rollCaptionTime = -2;

    @Override // com.appnext.core.Configuration
    protected SettingsManager g() {
        return c.h();
    }

    public int getRollCaptionTime() {
        return this.rollCaptionTime;
    }

    public String getVideoLength() {
        return this.videoLength;
    }

    public boolean isShowCta() {
        Boolean bool = this.showCta;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setRollCaptionTime(int i10) {
        this.rollCaptionTime = i10;
    }

    public void setShowCta(boolean z10) {
        this.showCta = Boolean.valueOf(z10);
    }

    public void setVideoLength(String str) {
        if (!str.equals("15") && !str.equals("30")) {
            com.appnext.base.a.a("VideoConfig$setVideoLength", new Throwable("Wrong video length"));
        } else {
            this.videoLength = str;
        }
    }
}
