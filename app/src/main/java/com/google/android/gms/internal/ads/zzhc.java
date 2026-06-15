package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzhc extends BroadcastReceiver implements Runnable {
    private final Handler zza;

    public zzhc(zzhe zzheVar, Handler handler, zzhd zzhdVar) {
        this.zza = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
