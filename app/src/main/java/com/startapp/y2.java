package com.startapp;

import android.os.HandlerThread;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class y2 extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23559a;

    public y2(String str) {
        super(str);
        this.f23559a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f23559a) {
            this.f23559a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f23559a) {
            super.start();
            try {
                this.f23559a.wait();
            } catch (InterruptedException e8) {
                throw new RuntimeException(e8);
            }
        }
    }
}
