package com.startapp;

import com.startapp.sdk.ads.video.VideoMode;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class oa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f22364a;

    public oa(VideoMode videoMode) {
        this.f22364a = videoMode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22364a.a("videoApi.setCloseable", Boolean.TRUE);
    }
}
