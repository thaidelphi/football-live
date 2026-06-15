package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzatr implements zzfmr {
    final /* synthetic */ zzflq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatr(zzflq zzflqVar) {
        this.zza = zzflqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final void zza(int i10, long j10) {
        this.zza.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final void zzb(int i10, long j10, String str) {
        this.zza.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
