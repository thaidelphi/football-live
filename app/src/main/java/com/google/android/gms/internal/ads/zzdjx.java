package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzdjx implements zzgal {
    final /* synthetic */ zzbyu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdjx(zzdjy zzdjyVar, zzbyu zzbyuVar) {
        this.zza = zzbyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcdq zzcdqVar = (zzcdq) obj;
        if (zzcdqVar != null) {
            final zzbyu zzbyuVar = this.zza;
            zzcdqVar.zzag("/video", new zzcbj(new Consumer() { // from class: com.google.android.gms.internal.ads.zzdjw
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaUrl", (String) obj2);
                    zzbyu.this.zzc(bundle);
                }
            }));
            zzcdqVar.zzaa();
            return;
        }
        this.zza.zzd(new zzeez(1, "Missing webview from video view future."));
    }
}
