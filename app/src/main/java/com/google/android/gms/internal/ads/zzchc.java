package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzchc implements zzcmr {
    private final zzcha zza;
    private zzexp zzb;
    private zzews zzc;
    private zzczy zzd;
    private zzcto zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchc(zzcha zzchaVar, zzcie zzcieVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final /* bridge */ /* synthetic */ zzcmr zzc(zzczy zzczyVar) {
        this.zzd = zzczyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final /* bridge */ /* synthetic */ zzcmr zzd(zzcto zzctoVar) {
        this.zze = zzctoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    /* renamed from: zze */
    public final zzcms zzh() {
        zzhds.zzc(this.zzd, zzczy.class);
        zzhds.zzc(this.zze, zzcto.class);
        return new zzchd(this.zza, new zzcqr(), new zzfbu(), new zzcsq(), new zzdqu(), this.zzd, this.zze, zzefg.zza(), null, this.zzb, this.zzc, null);
    }
}
