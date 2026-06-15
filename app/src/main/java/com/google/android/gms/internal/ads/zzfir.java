package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfir extends zzfin {
    public zzfir(ClientApi clientApi, Context context, int i10, zzbod zzbodVar, com.google.android.gms.ads.internal.client.zzfq zzfqVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfhv zzfhvVar, Clock clock) {
        super(clientApi, context, i10, zzbodVar, zzfqVar, zzceVar, scheduledExecutorService, zzfhvVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfin
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zza(Object obj) {
        try {
            return ((zzbvi) obj).zzc();
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the rewarded ad.", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfin
    protected final b6.a zzb(Context context) {
        zzgbj zze = zzgbj.zze();
        zzbvi zzp = this.zza.zzp(ObjectWrapper.u0(context), this.zze.zza, this.zzd, this.zzc);
        zzfiq zzfiqVar = new zzfiq(this, zze, zzp);
        if (zzp != null) {
            try {
                zzp.zzf(this.zze.zzc, zzfiqVar);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load rewarded ad.");
                zze.zzd(new zzfhr(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfhr(1, "Failed to create a rewarded ad."));
        }
        return zze;
    }
}
