package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffl implements zzgal {
    final /* synthetic */ zzffn zza;
    final /* synthetic */ zzffc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzffl(zzffn zzffnVar, zzffc zzffcVar) {
        this.zza = zzffnVar;
        this.zzb = zzffcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        zzffc zzffcVar = this.zzb;
        zzffcVar.zzh(th);
        zzffcVar.zzg(false);
        this.zza.zza(zzffcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zzb(Object obj) {
    }
}
