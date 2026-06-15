package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejd {
    private final zzeji zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdx zzc;

    public zzejd(zzeji zzejiVar, String str) {
        this.zza = zzejiVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zzg() : null;
    }

    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzc;
        } catch (RemoteException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e8);
            return null;
        }
        return zzdxVar != null ? zzdxVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) throws RemoteException {
        this.zzc = null;
        zzejj zzejjVar = new zzejj(i10);
        zzejc zzejcVar = new zzejc(this);
        this.zza.zzb(zzmVar, this.zzb, zzejjVar, zzejcVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
