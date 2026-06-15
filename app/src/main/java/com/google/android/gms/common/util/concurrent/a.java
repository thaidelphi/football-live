package com.google.android.gms.common.util.concurrent;

import android.os.Process;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f12765a;

    public a(Runnable runnable, int i10) {
        this.f12765a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f12765a.run();
    }
}
