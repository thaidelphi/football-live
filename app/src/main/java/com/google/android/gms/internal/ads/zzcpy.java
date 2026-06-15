package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcpy implements zzgal {
    final /* synthetic */ zzgal zza;
    final /* synthetic */ zzcqa zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpy(zzcqa zzcqaVar, zzgal zzgalVar) {
        this.zza = zzgalVar;
        this.zzb = zzcqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpu
            @Override // java.lang.Runnable
            public final void run() {
                zzcqa.this.zzd = false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqa.zzc(this.zzb, ((zzcpt) obj).zza, this.zza);
    }
}
