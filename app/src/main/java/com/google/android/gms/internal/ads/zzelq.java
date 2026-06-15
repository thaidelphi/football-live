package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzelq implements zzerw {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcrb zze;
    private final zzfbw zzf;
    private final zzfap zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi();
    private final zzdpz zzi;
    private final zzcro zzj;

    public zzelq(Context context, String str, String str2, zzcrb zzcrbVar, zzfbw zzfbwVar, zzfap zzfapVar, zzdpz zzdpzVar, zzcro zzcroVar, long j10) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcrbVar;
        this.zzf = zzfbwVar;
        this.zzg = zzfapVar;
        this.zzi = zzdpzVar;
        this.zzj = zzcroVar;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        Bundle bundle = new Bundle();
        this.zzi.zzb().put("seq_num", this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzck)).booleanValue()) {
            this.zzi.zzc("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a() - this.zzd));
            zzdpz zzdpzVar = this.zzi;
            com.google.android.gms.ads.internal.zzv.zzq();
            zzdpzVar.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzH(this.zza) ? "1" : "0");
        }
        this.zze.zzk(this.zzg.zzd);
        bundle.putAll(this.zzf.zzb());
        return zzgap.zzh(new zzelr(this.zza, bundle, this.zzb, this.zzc, this.zzh, this.zzg.zzf, this.zzj));
    }
}
