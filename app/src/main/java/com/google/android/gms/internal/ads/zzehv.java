package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzehv extends com.google.android.gms.ads.internal.client.zzbs {
    final zzfan zza;
    final zzdha zzb;
    private final Context zzc;
    private final zzcfq zzd;
    private com.google.android.gms.ads.internal.client.zzbk zze;

    public zzehv(zzcfq zzcfqVar, Context context, String str) {
        zzfan zzfanVar = new zzfan();
        this.zza = zzfanVar;
        this.zzb = new zzdha();
        this.zzd = zzcfqVar;
        zzfanVar.zzt(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final com.google.android.gms.ads.internal.client.zzbq zze() {
        zzdhc zzg = this.zzb.zzg();
        this.zza.zzE(zzg.zzi());
        this.zza.zzF(zzg.zzh());
        zzfan zzfanVar = this.zza;
        if (zzfanVar.zzh() == null) {
            zzfanVar.zzs(com.google.android.gms.ads.internal.client.zzr.zzc());
        }
        return new zzehw(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(zzbfw zzbfwVar) {
        this.zzb.zza(zzbfwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbfz zzbfzVar) {
        this.zzb.zzb(zzbfzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(String str, zzbgf zzbgfVar, zzbgc zzbgcVar) {
        this.zzb.zzc(str, zzbgfVar, zzbgcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(zzblh zzblhVar) {
        this.zzb.zzd(zzblhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbgj zzbgjVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zze(zzbgjVar);
        this.zza.zzs(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbgm zzbgmVar) {
        this.zzb.zzf(zzbgmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zze = zzbkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzbky zzbkyVar) {
        this.zza.zzw(zzbkyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzben zzbenVar) {
        this.zza.zzD(zzbenVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zza.zzV(zzcpVar);
    }
}
