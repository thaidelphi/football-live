package com.startapp;

import android.os.Handler;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x2 implements w2 {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f23535a;

    public x2(Handler handler) {
        this.f23535a = handler;
    }

    @Override // com.startapp.w2
    public final void a(Runnable runnable, long j10) {
        this.f23535a.postDelayed(runnable, j10);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f23535a.post(runnable);
    }

    @Override // com.startapp.w2
    public final void a(Runnable runnable) {
        this.f23535a.removeCallbacks(runnable);
    }
}
