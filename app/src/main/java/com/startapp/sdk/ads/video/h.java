package com.startapp.sdk.ads.video;

import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.wa;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class h implements wa {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f22812a;

    public h(VideoMode videoMode) {
        this.f22812a = videoMode;
    }

    public final void a() {
        VideoMode videoMode = this.f22812a;
        if (!videoMode.f22757i0) {
            videoMode.a(VideoMode.VideoFinishedReason.COMPLETE);
        }
        NativeVideoPlayer nativeVideoPlayer = this.f22812a.P;
        if (nativeVideoPlayer != null) {
            nativeVideoPlayer.f22821h.stopPlayback();
        }
    }
}
