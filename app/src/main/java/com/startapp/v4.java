package com.startapp;

import android.view.MotionEvent;
import com.startapp.sdk.ads.list3d.List3DView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class v4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List3DView f23469a;

    public v4(List3DView list3DView) {
        this.f23469a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23469a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
        this.f23469a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
    }
}
