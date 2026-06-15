package com.startapp;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ta implements va {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f23386a;

    public ta(VideoMode videoMode) {
        this.f23386a = videoMode;
    }

    public final void a(int i10) {
        VideoMode videoMode;
        NativeVideoPlayer nativeVideoPlayer;
        NativeVideoPlayer nativeVideoPlayer2 = this.f23386a.P;
        boolean z10 = false;
        int duration = nativeVideoPlayer2 != null ? nativeVideoPlayer2.f22821h.getDuration() : 0;
        VideoMode videoMode2 = this.f23386a;
        if (videoMode2.f22751c0 && duration > 0 && videoMode2.B()) {
            VideoMode videoMode3 = this.f23386a;
            videoMode3.f22750b0 = i10;
            int currentPosition = (videoMode3.P.f22821h.getCurrentPosition() * 100) / duration;
            ProgressBar progressBar = this.f23386a.T;
            if (progressBar != null && progressBar.isShown()) {
                VideoMode videoMode4 = this.f23386a;
                if (!videoMode4.f22752d0 && videoMode4.A()) {
                    this.f23386a.F();
                    return;
                }
                int i11 = this.f23386a.f22750b0;
                if (i11 == 100 || i11 - currentPosition > AdsCommonMetaData.f22889h.G().i()) {
                    VideoMode videoMode5 = this.f23386a;
                    NativeVideoPlayer nativeVideoPlayer3 = videoMode5.P;
                    if (nativeVideoPlayer3 != null) {
                        nativeVideoPlayer3.f22821h.start();
                        videoMode5.f22015x.setBackgroundColor(33554431);
                    }
                    videoMode5.G();
                    return;
                }
                return;
            }
            int i12 = this.f23386a.f22750b0;
            if (i12 >= 100 || i12 - currentPosition > AdsCommonMetaData.f22889h.G().j() || (nativeVideoPlayer = (videoMode = this.f23386a).P) == null) {
                return;
            }
            nativeVideoPlayer.f22821h.pause();
            ProgressBar progressBar2 = videoMode.T;
            if (progressBar2 != null && progressBar2.isShown()) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            videoMode.f22761m0.postDelayed(new na(videoMode), AdsCommonMetaData.f22889h.G().h());
        }
    }
}
