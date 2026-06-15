package com.appnext.ads.fullscreen;

import com.appnext.core.SettingsManager;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FullscreenConfig extends VideoConfig {
    public Boolean backButtonCanClose = Boolean.TRUE;
    public long closeDelay;
    public Boolean showClose;

    public FullscreenConfig() {
        this.closeDelay = 2000L;
        this.closeDelay = Integer.parseInt(c.h().t("show_close_time"));
    }

    @Override // com.appnext.ads.fullscreen.VideoConfig, com.appnext.core.Configuration
    protected final SettingsManager g() {
        return c.h();
    }

    @Override // com.appnext.core.Configuration
    public boolean isBackButtonCanClose() {
        Boolean bool = this.backButtonCanClose;
        return bool == null ? Boolean.parseBoolean(c.h().t("can_close")) : bool.booleanValue();
    }

    public boolean isShowClose() {
        Boolean bool = this.showClose;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setBackButtonCanClose(boolean z10) {
        this.backButtonCanClose = Boolean.valueOf(z10);
    }

    public void setShowClose(Boolean bool) {
        this.showClose = bool;
    }

    public void setShowClose(boolean z10, long j10) {
        this.showClose = Boolean.valueOf(z10);
        if (j10 < 100 || j10 > 7500) {
            return;
        }
        this.closeDelay = j10;
    }
}
