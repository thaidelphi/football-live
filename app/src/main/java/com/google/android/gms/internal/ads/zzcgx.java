package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcgx implements zzdfb {
    private final zzcha zza;
    private zzexp zzb;
    private zzews zzc;
    private zzczy zzd;
    private zzcto zze;
    private zzdex zzf;
    private zzcnb zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcgx(zzcha zzchaVar, zzcie zzcieVar) {
        this.zza = zzchaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public final /* synthetic */ zzctk zza(zzews zzewsVar) {
        this.zzc = zzewsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public final /* synthetic */ zzctk zzb(zzexp zzexpVar) {
        this.zzb = zzexpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final /* bridge */ /* synthetic */ zzdfb zzc(zzcnb zzcnbVar) {
        this.zzg = zzcnbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final /* bridge */ /* synthetic */ zzdfb zzd(zzdex zzdexVar) {
        this.zzf = zzdexVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final /* bridge */ /* synthetic */ zzdfb zze(zzczy zzczyVar) {
        this.zzd = zzczyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfb
    public final /* bridge */ /* synthetic */ zzdfb zzf(zzcto zzctoVar) {
        this.zze = zzctoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    /* renamed from: zzg */
    public final zzdfc zzh() {
        zzhds.zzc(this.zzd, zzczy.class);
        zzhds.zzc(this.zze, zzcto.class);
        zzhds.zzc(this.zzf, zzdex.class);
        zzhds.zzc(this.zzg, zzcnb.class);
        return new zzcgy(this.zza, this.zzg, this.zzf, new zzcqr(), new zzfbu(), new zzcsq(), new zzdqu(), this.zzd, this.zze, zzefg.zza(), null, this.zzb, this.zzc, null);
    }
}
