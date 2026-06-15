package com.google.android.gms.internal.ads;

import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfkx implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfla.zzc;
        if (handler != null) {
            handler2 = zzfla.zzc;
            runnable = zzfla.zzd;
            handler2.post(runnable);
            handler3 = zzfla.zzc;
            runnable2 = zzfla.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
