package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfba implements zzgal {
    final /* synthetic */ zzfbb zza;
    final /* synthetic */ int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfba(zzfbb zzfbbVar, int i10) {
        this.zzb = i10;
        this.zza = zzfbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i10 = this.zzb;
        this.zza.zzb((String) obj, i10);
    }
}
