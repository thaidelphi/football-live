package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdsh implements zzgal {
    final /* synthetic */ zzdsj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsh(zzdsj zzdsjVar) {
        this.zza = zzdsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        long j10;
        zzbyu zzbyuVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdsj zzdsjVar = this.zza;
            long b10 = com.google.android.gms.ads.internal.zzv.zzC().b();
            j10 = this.zza.zzd;
            zzdsjVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (b10 - j10));
            zzbyuVar = this.zza.zze;
            zzbyuVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        long j10;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdsj zzdsjVar = this.zza;
            long b10 = com.google.android.gms.ads.internal.zzv.zzC().b();
            j10 = this.zza.zzd;
            zzdsjVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (b10 - j10));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsg
                @Override // java.lang.Runnable
                public final void run() {
                    zzdsj.zzo(zzdsh.this.zza, str);
                }
            });
        }
    }
}
