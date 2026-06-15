package com.appnext.ads.fullscreen;

import com.appnext.core.SettingsManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RewardedConfig extends VideoConfig {
    private String mode = RewardedVideo.VIDEO_MODE_DEFAULT;
    private int multiTimerLength = 3;

    @Override // com.appnext.ads.fullscreen.VideoConfig, com.appnext.core.Configuration
    protected final SettingsManager g() {
        return f.o();
    }

    public String getMode() {
        return this.mode;
    }

    public int getMultiTimerLength() {
        return this.multiTimerLength;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setMultiTimerLength(int i10) {
        this.multiTimerLength = i10;
    }
}
