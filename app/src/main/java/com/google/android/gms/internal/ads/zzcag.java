package com.google.android.gms.internal.ads;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcag implements Runnable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcag(zzcai zzcaiVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
