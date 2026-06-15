package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzekg implements zzerw {
    private final b6.a zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekg(b6.a aVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = aVar;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        b6.a zzn = zzgap.zzn(this.zza, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzgap.zzh(new zzekh((String) obj));
            }
        }, this.zzb);
        zzbbd zzbbdVar = zzbbm.zzmr;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue() > 0) {
            zzn = zzgap.zzo(zzn, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgap.zzf(zzn, Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzekf
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                if (((Throwable) obj) instanceof TimeoutException) {
                    return zzgap.zzh(new zzekh(Integer.toString(17)));
                }
                return zzgap.zzh(new zzekh(null));
            }
        }, this.zzb);
    }
}
