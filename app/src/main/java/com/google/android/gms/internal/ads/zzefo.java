package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzefo extends zzegp {
    private final zzdcn zza;

    public zzefo(zzcud zzcudVar, zzdcc zzdccVar, zzcux zzcuxVar, zzcvm zzcvmVar, zzcvr zzcvrVar, zzcus zzcusVar, zzczb zzczbVar, zzdcz zzdczVar, zzcwl zzcwlVar, zzdcn zzdcnVar, zzcyx zzcyxVar) {
        super(zzcudVar, zzdccVar, zzcuxVar, zzcvmVar, zzcvrVar, zzczbVar, zzcwlVar, zzdczVar, zzcyxVar, zzcusVar);
        this.zza = zzdcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegp, com.google.android.gms.internal.ads.zzboj
    public final void zzs(zzbvb zzbvbVar) {
        this.zza.zza(zzbvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzegp, com.google.android.gms.internal.ads.zzboj
    public final void zzt(zzbvf zzbvfVar) throws RemoteException {
        this.zza.zza(new zzbvb(zzbvfVar.zzf(), zzbvfVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzegp, com.google.android.gms.internal.ads.zzboj
    public final void zzu() throws RemoteException {
        this.zza.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzegp, com.google.android.gms.internal.ads.zzboj
    public final void zzv() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzegp, com.google.android.gms.internal.ads.zzboj
    public final void zzw() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzegp, com.google.android.gms.internal.ads.zzboj
    public final void zzz() {
        this.zza.zzc();
    }
}
