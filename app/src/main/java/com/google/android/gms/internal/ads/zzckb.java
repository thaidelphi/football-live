package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.c;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzckb implements zzcjs {
    private final zzebe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckb(zzebe zzebeVar) {
        this.zza = zzebeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkp)).booleanValue()) {
            zzgag zzgagVar = (zzgag) zzgap.zzf(zzgag.zzu(this.zza.zza(true)), Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzcka
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkq)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
                    }
                    return zzgap.zzh(new c(zzfvv.zzn()));
                }
            }, zzbyp.zza);
        }
    }
}
