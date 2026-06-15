package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class st extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private static st f20729b;

    /* renamed from: a  reason: collision with root package name */
    private a f20730a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    private class a extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        private Handler f20731a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.d());
        }

        Handler a() {
            return this.f20731a;
        }

        void b() {
            this.f20731a = new Handler(getLooper());
        }
    }

    private st() {
        a aVar = new a(getClass().getSimpleName());
        this.f20730a = aVar;
        aVar.start();
        this.f20730a.b();
    }

    public static synchronized st a() {
        st stVar;
        synchronized (st.class) {
            if (f20729b == null) {
                f20729b = new st();
            }
            stVar = f20729b;
        }
        return stVar;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f20730a;
        if (aVar == null) {
            return;
        }
        Handler a10 = aVar.a();
        if (a10 != null) {
            a10.post(runnable);
        }
    }
}
