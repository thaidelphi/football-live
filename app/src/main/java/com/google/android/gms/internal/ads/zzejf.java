package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejf {
    private final zzdhc zza;
    private final zzeis zzb;
    private final zzcui zzc;

    public zzejf(zzdhc zzdhcVar, zzdqf zzdqfVar) {
        this.zza = zzdhcVar;
        final zzeis zzeisVar = new zzeis(zzdqfVar);
        this.zzb = zzeisVar;
        final zzblh zzg = zzdhcVar.zzg();
        this.zzc = new zzcui() { // from class: com.google.android.gms.internal.ads.zzeje
            @Override // com.google.android.gms.internal.ads.zzcui
            public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeis.this.zzdz(zzeVar);
                zzblh zzblhVar = zzg;
                if (zzblhVar != null) {
                    try {
                        zzblhVar.zzf(zzeVar);
                    } catch (RemoteException e8) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
                    }
                }
                if (zzblhVar != null) {
                    try {
                        zzblhVar.zze(zzeVar.zza);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
    }

    public final zzcui zza() {
        return this.zzc;
    }

    public final zzcvt zzb() {
        return this.zzb;
    }

    public final zzdex zzc() {
        return new zzdex(this.zza, this.zzb.zzg());
    }

    public final zzeis zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzb.zzj(zzbkVar);
    }
}
