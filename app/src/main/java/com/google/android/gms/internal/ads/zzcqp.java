package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcqp {
    private final zzdvv zza;
    private final zzfap zzb;
    private final zzfet zzc;
    private final zzcjq zzd;
    private final zzefc zze;
    private final zzczm zzf;
    private zzfag zzg;
    private final zzdxd zzh;
    private final zzcti zzi;
    private final Executor zzj;
    private final zzdwo zzk;
    private final zzebl zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqp(zzdvv zzdvvVar, zzfap zzfapVar, zzfet zzfetVar, zzcjq zzcjqVar, zzefc zzefcVar, zzczm zzczmVar, zzfag zzfagVar, zzdxd zzdxdVar, zzcti zzctiVar, Executor executor, zzdwo zzdwoVar, zzebl zzeblVar) {
        this.zza = zzdvvVar;
        this.zzb = zzfapVar;
        this.zzc = zzfetVar;
        this.zzd = zzcjqVar;
        this.zze = zzefcVar;
        this.zzf = zzczmVar;
        this.zzg = zzfagVar;
        this.zzh = zzdxdVar;
        this.zzi = zzctiVar;
        this.zzj = executor;
        this.zzk = zzdwoVar;
        this.zzl = zzeblVar;
    }

    public static /* synthetic */ zzfag zzd(zzcqp zzcqpVar, zzfag zzfagVar) {
        zzcqpVar.zzd.zza(zzfagVar);
        return zzfagVar;
    }

    public static /* synthetic */ b6.a zze(zzcqp zzcqpVar, zzfcj zzfcjVar, zzbud zzbudVar) {
        zzbudVar.zzi = zzfcjVar;
        return zzcqpVar.zzh.zze(zzbudVar);
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfbq.zzb(th, this.zzl);
    }

    public final zzczm zzc() {
        return this.zzf;
    }

    public final b6.a zzf(final zzfcj zzfcjVar) {
        zzfdz zza = this.zzc.zzb(zzfen.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfzw() { // from class: com.google.android.gms.internal.ads.zzcql
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzcqp.zze(zzcqp.this, zzfcjVar, (zzbud) obj);
            }
        }).zza();
        zzgap.zzr(zza, new zzcqn(this), this.zzj);
        return zza;
    }

    public final b6.a zzg(zzbud zzbudVar) {
        zzfdz zza = this.zzc.zzb(zzfen.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbudVar)).zza();
        zzgap.zzr(zza, new zzcqo(this), this.zzj);
        return zza;
    }

    public final b6.a zzh(b6.a aVar) {
        zzfej zzf = this.zzc.zzb(zzfen.RENDERER, aVar).zze(new zzfdx() { // from class: com.google.android.gms.internal.ads.zzcqk
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final Object zza(Object obj) {
                zzfag zzfagVar = (zzfag) obj;
                zzcqp.zzd(zzcqp.this, zzfagVar);
                return zzfagVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfy)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfz)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final b6.a zzi() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfet zzfetVar = this.zzc;
        zzdvv zzdvvVar = this.zza;
        return zzfed.zzc(zzdvvVar.zzb(), zzfen.PRELOADED_LOADER, zzfetVar).zza();
    }

    public final b6.a zzj(b6.a aVar) {
        zzfag zzfagVar = this.zzg;
        if (zzfagVar != null) {
            zzfet zzfetVar = this.zzc;
            return zzfed.zzc(zzgap.zzh(zzfagVar), zzfen.SERVER_TRANSACTION, zzfetVar).zza();
        }
        com.google.android.gms.ads.internal.zzv.zzc().zzj();
        zzfej zzb = this.zzc.zzb(zzfen.SERVER_TRANSACTION, aVar);
        final zzdwo zzdwoVar = this.zzk;
        Objects.requireNonNull(zzdwoVar);
        return zzb.zzf(new zzfzw() { // from class: com.google.android.gms.internal.ads.zzcqm
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzdwo.this.zzc((zzbud) obj);
            }
        }).zza();
    }

    public final void zzk(zzfag zzfagVar) {
        this.zzg = zzfagVar;
    }
}
