package com.appnext.ads.fullscreen;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class FullScreenVideo extends Video {
    private long closeDelay;
    private boolean showClose;

    /* JADX INFO: Access modifiers changed from: protected */
    public FullScreenVideo(Context context, FullScreenVideo fullScreenVideo) {
        super(context, fullScreenVideo);
        this.showClose = true;
        setShowClose(fullScreenVideo.isShowClose());
        setCloseDelay(fullScreenVideo.getCloseDelay());
        setBackButtonCanClose(fullScreenVideo.isBackButtonCanClose());
    }

    @Override // com.appnext.core.Ad
    public String getAUID() {
        return "700";
    }

    public long getCloseDelay() {
        return this.closeDelay;
    }

    public boolean isShowClose() {
        return this.showClose;
    }

    protected void setCloseDelay(long j10) {
        this.closeDelay = j10;
    }

    public void setShowClose(boolean z10) {
        this.showClose = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.ads.fullscreen.Video
    public c getConfig() {
        return c.h();
    }

    public void setShowClose(boolean z10, long j10) {
        this.showClose = z10;
        if (j10 < 100 || j10 > 7500) {
            return;
        }
        this.closeDelay = j10;
    }

    public FullScreenVideo(Context context, String str) {
        super(context, 1, str);
        this.showClose = true;
        this.closeDelay = Integer.parseInt(getConfig().t("show_close_time"));
    }

    public FullScreenVideo(Context context, String str, FullscreenConfig fullscreenConfig) {
        super(context, 1, str, fullscreenConfig);
        this.showClose = true;
        if (fullscreenConfig != null) {
            try {
                setBackButtonCanClose(fullscreenConfig.isBackButtonCanClose());
                if (fullscreenConfig.showClose != null) {
                    setShowClose(fullscreenConfig.isShowClose());
                }
                setCloseDelay(fullscreenConfig.closeDelay);
            } catch (Throwable th) {
                com.appnext.base.a.a("FullScreenVideo$FullScreenVideo", th);
            }
        }
    }
}
