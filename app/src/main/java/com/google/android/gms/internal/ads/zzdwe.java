package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdwe extends zzdwc {
    private final Context zzg;
    private final Executor zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwe(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbti(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdwc, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbtv zzdwaVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    zzbtr zzp = this.zzf.zzp();
                    zzbud zzbudVar = this.zze;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmN)).booleanValue()) {
                        zzdwaVar = new zzdwb(this.zza, this.zze);
                    } else {
                        zzdwaVar = new zzdwa(this);
                    }
                    zzp.zzf(zzbudVar, zzdwaVar);
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdwr(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzdwr(1));
                }
            }
        }
    }

    public final b6.a zza(zzbud zzbudVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbudVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwd
                @Override // java.lang.Runnable
                public final void run() {
                    zzdwe.this.zzb();
                }
            }, zzbyp.zzg);
            zzdwc.zzc(this.zzg, this.zza, this.zzh);
            return this.zza;
        }
    }
}
