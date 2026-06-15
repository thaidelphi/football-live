package com.google.android.gms.internal.consent_sdk;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzai implements zzat {
    private final zzaf zza;
    private final zzdn zzb;
    private final zzdn zzc;
    private final zzdn zzd;
    private final zzdn zze;
    private final zzdn zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzai(zzaf zzafVar, zzbm zzbmVar, zzaj zzajVar) {
        zzdn zzdnVar;
        zzdn zzdnVar2;
        zzap zzapVar;
        zzar zzarVar;
        zzdn zzdnVar3;
        zzdn zzdnVar4;
        zzdn zzdnVar5;
        zzap zzapVar2;
        zzdn zzdnVar6;
        zzdn zzdnVar7;
        zzdn zzdnVar8;
        this.zza = zzafVar;
        zzdnVar = zzafVar.zzb;
        zzdn zzb = zzdj.zzb(new zzbu(zzdnVar));
        this.zzb = zzb;
        zzdk zzb2 = zzdl.zzb(zzbmVar);
        this.zzc = zzb2;
        zzdi zzdiVar = new zzdi();
        this.zzd = zzdiVar;
        zzdnVar2 = zzafVar.zzb;
        zzapVar = zzao.zza;
        zzarVar = zzaq.zza;
        zzdnVar3 = zzafVar.zzh;
        zzdnVar4 = zzafVar.zzi;
        zzdnVar5 = zzafVar.zzc;
        zzby zzbyVar = new zzby(zzdnVar2, zzb, zzapVar, zzarVar, zzdnVar3, zzdnVar4, zzdiVar, zzdnVar5);
        this.zze = zzbyVar;
        zzapVar2 = zzao.zza;
        zzbs zzbsVar = new zzbs(zzb, zzapVar2, zzbyVar);
        this.zzf = zzbsVar;
        zzdnVar6 = zzafVar.zzb;
        zzdnVar7 = zzafVar.zzd;
        zzdnVar8 = zzafVar.zzc;
        zzdi.zzb(zzdiVar, zzdj.zzb(new zzaz(zzdnVar6, zzdnVar7, zzb, zzdnVar8, zzb2, zzbsVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzat
    public final zzay zza() {
        return (zzay) this.zzd.zza();
    }
}
