package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzecy extends zzbuz implements zzcvp {
    private zzbva zza;
    private zzcvo zzb;
    private zzdcp zzc;

    @Override // com.google.android.gms.internal.ads.zzcvp
    public final synchronized void zza(zzcvo zzcvoVar) {
        this.zzb = zzcvoVar;
    }

    public final synchronized void zzc(zzbva zzbvaVar) {
        this.zza = zzbvaVar;
    }

    public final synchronized void zzd(zzdcp zzdcpVar) {
        this.zzc = zzdcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            ((zzegd) zzbvaVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            zzbvaVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzcvo zzcvoVar = this.zzb;
        if (zzcvoVar != null) {
            zzcvoVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            ((zzegd) zzbvaVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcvo zzcvoVar = this.zzb;
        if (zzcvoVar != null) {
            zzcvoVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            ((zzegd) zzbvaVar).zza.zzdp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzdcp zzdcpVar = this.zzc;
        if (zzdcpVar != null) {
            zzebj zzebjVar = ((zzegc) zzdcpVar).zzc;
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to initialize adapter ".concat(String.valueOf(zzebjVar.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdcp zzdcpVar = this.zzc;
        if (zzdcpVar != null) {
            Executor zzc = zzege.zzc(((zzegc) zzdcpVar).zzd);
            final zzebj zzebjVar = ((zzegc) zzdcpVar).zzc;
            final zzezu zzezuVar = ((zzegc) zzdcpVar).zzb;
            final zzfag zzfagVar = ((zzegc) zzdcpVar).zza;
            final zzegc zzegcVar = (zzegc) zzdcpVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegb
                @Override // java.lang.Runnable
                public final void run() {
                    zzege zzegeVar = zzegc.this.zzd;
                    zzege.zze(zzfagVar, zzezuVar, zzebjVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbvb zzbvbVar) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            ((zzegd) zzbvaVar).zzd.zza(zzbvbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            ((zzegd) zzbvaVar).zzd.zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            ((zzegd) zzbvaVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbva zzbvaVar = this.zza;
        if (zzbvaVar != null) {
            ((zzegd) zzbvaVar).zzd.zzc();
        }
    }
}
