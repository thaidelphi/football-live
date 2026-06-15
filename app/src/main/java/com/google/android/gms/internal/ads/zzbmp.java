package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbmp implements zzbyy {
    final /* synthetic */ zzbmq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmp(zzbmq zzbmqVar) {
        this.zza = zzbmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzblm zzblmVar = (zzblm) obj;
        zzbyp.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmo
            @Override // java.lang.Runnable
            public final void run() {
                zzblm zzblmVar2 = zzblmVar;
                zzblmVar2.zzr("/result", zzbin.zzo);
                zzblmVar2.zzc();
            }
        });
    }
}
