package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzcib implements com.google.android.gms.ads.nonagon.signalgeneration.zzab {
    private final zzcha zza;
    private zzcto zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcib(zzcha zzchaVar, zzcie zzcieVar) {
        this.zza = zzchaVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zza(zzcto zzctoVar) {
        this.zzb = zzctoVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzab zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaz zzazVar) {
        this.zzc = zzazVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzab
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzc() {
        zzhds.zzc(this.zzb, zzcto.class);
        zzhds.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzaz.class);
        return new zzcic(this.zza, this.zzc, new zzcqr(), new zzcsq(), new zzdqu(), this.zzb, null, null, null);
    }
}
