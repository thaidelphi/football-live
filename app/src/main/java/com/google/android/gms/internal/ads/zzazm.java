package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzazm {
    private com.google.android.gms.ads.internal.client.zzbx zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzeh zzd;
    private final AppOpenAd.AppOpenAdLoadCallback zze;
    private final zzbnz zzf = new zzbnz();
    private final com.google.android.gms.ads.internal.client.zzq zzg = com.google.android.gms.ads.internal.client.zzq.zza;

    public zzazm(Context context, String str, com.google.android.gms.ads.internal.client.zzeh zzehVar, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzehVar;
        this.zze = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzbx zze = com.google.android.gms.ads.internal.client.zzbb.zza().zze(this.zzb, com.google.android.gms.ads.internal.client.zzr.zzb(), this.zzc, this.zzf);
            this.zza = zze;
            if (zze != null) {
                this.zzd.zzo(currentTimeMillis);
                this.zza.zzH(new zzayz(this.zze, this.zzc));
                this.zza.zzab(this.zzg.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
        }
    }
}
