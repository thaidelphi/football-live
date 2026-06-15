package com.google.android.gms.internal.ads;

import androidx.collection.h;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdha {
    zzbfz zza;
    zzbfw zzb;
    zzbgm zzc;
    zzbgj zzd;
    zzblh zze;
    final h zzf = new h();
    final h zzg = new h();

    public final zzdha zza(zzbfw zzbfwVar) {
        this.zzb = zzbfwVar;
        return this;
    }

    public final zzdha zzb(zzbfz zzbfzVar) {
        this.zza = zzbfzVar;
        return this;
    }

    public final zzdha zzc(String str, zzbgf zzbgfVar, zzbgc zzbgcVar) {
        this.zzf.put(str, zzbgfVar);
        if (zzbgcVar != null) {
            this.zzg.put(str, zzbgcVar);
        }
        return this;
    }

    public final zzdha zzd(zzblh zzblhVar) {
        this.zze = zzblhVar;
        return this;
    }

    public final zzdha zze(zzbgj zzbgjVar) {
        this.zzd = zzbgjVar;
        return this;
    }

    public final zzdha zzf(zzbgm zzbgmVar) {
        this.zzc = zzbgmVar;
        return this;
    }

    public final zzdhc zzg() {
        return new zzdhc(this);
    }
}
