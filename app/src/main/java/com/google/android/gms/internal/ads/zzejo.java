package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzejo implements zzgal {
    final /* synthetic */ zzejh zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzffc zzc;
    final /* synthetic */ zzdfc zzd;
    final /* synthetic */ zzejp zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejo(zzejp zzejpVar, zzejh zzejhVar, zzffn zzffnVar, zzffc zzffcVar, zzdfc zzdfcVar) {
        this.zza = zzejhVar;
        this.zzb = zzffnVar;
        this.zzc = zzffcVar;
        this.zzd = zzdfcVar;
        this.zze = zzejpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzcfq zzcfqVar;
        zzffq zzffqVar;
        zzffn zzffnVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfH)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdz(zza);
        zzcfqVar = this.zze.zzb;
        zzcfqVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejn
            @Override // java.lang.Runnable
            public final void run() {
                zzejf zzejfVar;
                zzejfVar = zzejo.this.zze.zzd;
                zzejfVar.zza().zzdz(zza);
            }
        });
        zzfbm.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zzb) != null) {
            zzffnVar.zzc(zza);
            zzffc zzffcVar = this.zzc;
            zzffcVar.zzh(th);
            zzffcVar.zzg(false);
            zzffnVar.zza(zzffcVar);
            zzffnVar.zzh();
            return;
        }
        zzejp zzejpVar = this.zze;
        zzffc zzffcVar2 = this.zzc;
        zzffqVar = zzejpVar.zze;
        zzffcVar2.zza(zza);
        zzffcVar2.zzh(th);
        zzffcVar2.zzg(false);
        zzffqVar.zzc(zzffcVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejf zzejfVar;
        zzcfq zzcfqVar;
        zzffq zzffqVar;
        zzffn zzffnVar;
        zzcpl zzcplVar = (zzcpl) obj;
        synchronized (this.zze) {
            zzcyl zzn = zzcplVar.zzn();
            zzejfVar = this.zze.zzd;
            zzn.zza(zzejfVar.zzd());
            this.zza.zzb(zzcplVar);
            zzcfqVar = this.zze.zzb;
            zzcfqVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejm
                @Override // java.lang.Runnable
                public final void run() {
                    zzejf zzejfVar2;
                    zzejfVar2 = zzejo.this.zze.zzd;
                    zzejfVar2.zzb().zzs();
                }
            });
            if (((Boolean) zzbdf.zzc.zze()).booleanValue() && (zzffnVar = this.zzb) != null) {
                zzffnVar.zzg(zzcplVar.zzp().zzb);
                zzffnVar.zze(zzcplVar.zzl().zzg());
                zzffc zzffcVar = this.zzc;
                zzffcVar.zzg(true);
                zzffnVar.zza(zzffcVar);
                zzffnVar.zzh();
            } else {
                zzffqVar = this.zze.zze;
                zzffc zzffcVar2 = this.zzc;
                zzffcVar2.zzb(zzcplVar.zzp().zzb);
                zzffcVar2.zzd(zzcplVar.zzl().zzg());
                zzffcVar2.zzg(true);
                zzffqVar.zzc(zzffcVar2.zzm());
            }
        }
    }
}
