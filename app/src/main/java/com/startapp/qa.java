package com.startapp;

import android.widget.VideoView;
import com.startapp.sdk.ads.video.VideoMode;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class qa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f22441a;

    public qa(VideoMode videoMode) {
        this.f22441a = videoMode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoView videoView;
        VideoMode videoMode = this.f22441a;
        if (videoMode.P == null || (videoView = videoMode.Q) == null) {
            return;
        }
        videoMode.E++;
        videoView.setVisibility(0);
        VideoMode videoMode2 = this.f22441a;
        videoMode2.f22757i0 = false;
        videoMode2.a("videoApi.setVideoCurrentPosition", 0);
        videoMode2.a("videoApi.setSkipTimer", 0);
        this.f22441a.E();
    }
}
