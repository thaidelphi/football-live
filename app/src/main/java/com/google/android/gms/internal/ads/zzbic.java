package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbic implements zzgal {
    final /* synthetic */ zzcdq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbic(zzcdq zzcdqVar) {
        this.zza = zzcdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zza.zzD() != null ? this.zza.zzD().zzax : null;
        zzcdq zzcdqVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbw(zzcdqVar.getContext(), zzcdqVar.zzm().afmaVersion, str, null, zzvVar).zzb();
    }
}
