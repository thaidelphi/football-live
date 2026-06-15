package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbct {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final ScheduledExecutorService zzc;

    public zzbct(Context context, ScheduledExecutorService scheduledExecutorService, zzbcv zzbcvVar, zzffn zzffnVar) {
        this.zzc = scheduledExecutorService;
    }

    public final b6.a zza() {
        return (zzgag) zzgap.zzo(zzgag.zzu(zzgap.zzh(null)), ((Long) zzbdl.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
        } else {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
