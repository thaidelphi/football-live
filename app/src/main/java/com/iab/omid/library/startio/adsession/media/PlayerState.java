package com.iab.omid.library.startio.adsession.media;

import com.appnext.ads.fullscreen.RewardedVideo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(RewardedVideo.VIDEO_MODE_NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");
    
    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }
}
