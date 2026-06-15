package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdwi extends zzdwc {
    private String zzg;
    private int zzh = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwi(Context context) {
        this.zzf = new zzbti(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdwc, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbtv zzdwaVar;
        zzbtv zzdwaVar2;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i10 = this.zzh;
                    if (i10 == 2) {
                        zzbtr zzp = this.zzf.zzp();
                        zzbud zzbudVar = this.zze;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmN)).booleanValue()) {
                            zzdwaVar2 = new zzdwb(this.zza, this.zze);
                        } else {
                            zzdwaVar2 = new zzdwa(this);
                        }
                        zzp.zze(zzbudVar, zzdwaVar2);
                    } else if (i10 == 3) {
                        zzbtr zzp2 = this.zzf.zzp();
                        String str = this.zzg;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmN)).booleanValue()) {
                            zzdwaVar = new zzdwb(this.zza, this.zze);
                        } else {
                            zzdwaVar = new zzdwa(this);
                        }
                        zzp2.zzh(str, zzdwaVar);
                    } else {
                        this.zza.zzd(new zzdwr(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdwr(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdwr(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwc, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdwr(1));
    }

    public final b6.a zza(zzbud zzbudVar) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                return zzgap.zzg(new zzdwr(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbudVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwi.this.zzb();
                    }
                }, zzbyp.zzg);
                return this.zza;
            }
        }
    }

    public final b6.a zzd(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                return zzgap.zzg(new zzdwr(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdwi.this.zzb();
                    }
                }, zzbyp.zzg);
                return this.zza;
            }
        }
    }
}
