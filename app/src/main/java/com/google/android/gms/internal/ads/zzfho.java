package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfho implements zzgal {
    final /* synthetic */ zzffc zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzfhp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfho(zzfhp zzfhpVar, zzffc zzffcVar, zzffn zzffnVar) {
        this.zza = zzffcVar;
        this.zzb = zzffnVar;
        this.zzc = zzfhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzffq zzffqVar;
        this.zza.zzg(false);
        zzffn zzffnVar = this.zzb;
        if (zzffnVar == null) {
            zzfhp zzfhpVar = this.zzc;
            zzffc zzffcVar = this.zza;
            zzffqVar = zzfhpVar.zzf;
            zzffqVar.zzc(zzffcVar.zzm());
            return;
        }
        zzffnVar.zza(this.zza);
        zzffnVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffq zzffqVar;
        this.zza.zzg(((com.google.android.gms.ads.internal.util.client.zzt) obj) == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        zzffn zzffnVar = this.zzb;
        if (zzffnVar == null) {
            zzfhp zzfhpVar = this.zzc;
            zzffc zzffcVar = this.zza;
            zzffqVar = zzfhpVar.zzf;
            zzffqVar.zzc(zzffcVar.zzm());
            return;
        }
        zzffnVar.zza(this.zza);
        zzffnVar.zzh();
    }
}
