package com.startapp.sdk.ads.video;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f22811a;

    public g(VideoMode videoMode) {
        this.f22811a = videoMode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoMode videoMode = this.f22811a;
        if (videoMode.P == null) {
            return;
        }
        ProgressBar progressBar = videoMode.T;
        if (progressBar != null && progressBar.isShown()) {
            videoMode.G();
        }
        videoMode.a(VideoMode.VideoFinishedReason.SKIPPED);
        videoMode.a(videoMode.f22758j0, new VideoTrackingParams(videoMode.a(videoMode.f22758j0), videoMode.E, videoMode.f22216q, videoMode.f22760l0), "skipped", videoMode.w().i().p());
    }
}
