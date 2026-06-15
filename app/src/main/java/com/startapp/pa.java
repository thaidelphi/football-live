package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class pa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f22394a;

    public pa(VideoMode videoMode) {
        this.f22394a = videoMode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoMode videoMode = this.f22394a;
        if (videoMode.P == null) {
            return;
        }
        videoMode.U = !videoMode.U;
        videoMode.D();
        VideoMode videoMode2 = this.f22394a;
        videoMode2.a(videoMode2.U);
    }
}
