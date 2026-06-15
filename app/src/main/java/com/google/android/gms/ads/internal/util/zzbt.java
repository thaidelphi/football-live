package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzfpe;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzbt {

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f11447a = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f11448b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f11449c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f11450d = new Object();

    public final Handler zza() {
        return this.f11448b;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.f11450d) {
            if (this.f11449c != 0) {
                Preconditions.n(this.f11447a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.f11447a == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f11447a = handlerThread;
                handlerThread.start();
                this.f11448b = new zzfpe(this.f11447a.getLooper());
                zze.zza("Looper thread started.");
            } else {
                zze.zza("Resuming the looper thread");
                this.f11450d.notifyAll();
            }
            this.f11449c++;
            looper = this.f11447a.getLooper();
        }
        return looper;
    }
}
