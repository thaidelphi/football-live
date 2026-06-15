package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzetz implements zzerw {
    final ScheduledExecutorService zza;

    public zzetz(zzbsh zzbshVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return zzgap.zzm(zzgap.zzo(zzgap.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzel)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                return new zzeua((Bundle) obj);
            }
        }, zzbyp.zza);
    }
}
