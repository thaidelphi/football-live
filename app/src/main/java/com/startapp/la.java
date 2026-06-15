package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class la implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoListener f22261a;

    public la(VideoListener videoListener, Context context) {
        this.f22261a = videoListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22261a.onVideoCompleted();
        } catch (Throwable th) {
            o9.a((Object) this.f22261a, th);
        }
    }
}
