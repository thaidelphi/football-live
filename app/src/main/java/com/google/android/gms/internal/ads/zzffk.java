package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffk implements zzgal {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzffc zzb;
    final /* synthetic */ boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffk(zzffn zzffnVar, zzffc zzffcVar, boolean z10) {
        this.zza = zzffnVar;
        this.zzb = zzffcVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzffc zzffcVar = this.zzb;
        if (zzffcVar.zzk()) {
            zzffn zzffnVar = this.zza;
            zzffcVar.zzh(th);
            zzffcVar.zzg(false);
            zzffnVar.zza(zzffcVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zzb(Object obj) {
        zzffc zzffcVar = this.zzb;
        zzffcVar.zzg(true);
        this.zza.zza(zzffcVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}
