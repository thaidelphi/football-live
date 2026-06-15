package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchs implements zzdef {
    private final zzcha zza;
    private zzexp zzb;
    private zzews zzc;
    private zzczy zzd;
    private zzcto zze;
    private zzehb zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchs(zzcha zzchaVar, zzcie zzcieVar) {
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

    @Override // com.google.android.gms.internal.ads.zzdef
    public final /* bridge */ /* synthetic */ zzdef zzc(zzehb zzehbVar) {
        this.zzf = zzehbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final /* bridge */ /* synthetic */ zzdef zzd(zzczy zzczyVar) {
        this.zzd = zzczyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final /* bridge */ /* synthetic */ zzdef zze(zzcto zzctoVar) {
        this.zze = zzctoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    /* renamed from: zzf */
    public final zzdeg zzh() {
        zzhds.zzc(this.zzd, zzczy.class);
        zzhds.zzc(this.zze, zzcto.class);
        zzhds.zzc(this.zzf, zzehb.class);
        return new zzcht(this.zza, new zzcqr(), new zzfbu(), new zzcsq(), new zzdqu(), this.zzd, this.zze, zzefg.zza(), this.zzf, null, this.zzb, this.zzc, null);
    }
}
