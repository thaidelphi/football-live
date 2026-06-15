package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzduj implements zzcxc, zzdcq, zzcvt {
    private final Context zza;
    private final zzdqf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduj(Context context, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzb = zzdqfVar;
    }

    private final void zzd(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeH)).booleanValue()) {
            zzbyp.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdui
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.zzf().zzd(context, zzduj.this.zzb);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeJ)).booleanValue()) {
            zzd(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeK)).booleanValue()) {
            zzd(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeL)).booleanValue()) {
            zzd(this.zza);
        }
    }
}
