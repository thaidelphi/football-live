package com.startapp;

import android.widget.ProgressBar;
import com.startapp.sdk.ads.video.VideoMode;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class na implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoMode f22337a;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                na.this.f22337a.G();
                VideoMode videoMode = na.this.f22337a;
                videoMode.a(new ab(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", videoMode.u()));
            } catch (Throwable th) {
                l3.a(th);
            }
        }
    }

    public na(VideoMode videoMode) {
        this.f22337a = videoMode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = this.f22337a.T;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            this.f22337a.f22761m0.postDelayed(new a(), AdsCommonMetaData.f22889h.G().d());
        } catch (Throwable th) {
            this.f22337a.G();
            l3.a(th);
        }
    }
}
