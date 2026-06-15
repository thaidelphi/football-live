package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdht {
    private final zzdqf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdht(zzdqf zzdqfVar) {
        this.zza = zzdqfVar;
    }

    public final void zza(View view, zzezu zzezuVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmL)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzac.zza(view) ? "0" : "1";
        zzdqe zza = this.zza.zza();
        zza.zzb("action", "hcp");
        zza.zzb("hcp", str);
        zza.zzc(zzezuVar);
        zza.zzj();
    }
}
