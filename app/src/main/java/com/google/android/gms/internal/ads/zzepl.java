package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepl implements zzerw {
    private final Context zza;
    private final Intent zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepl(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmH)).booleanValue()) {
            boolean z10 = false;
            try {
                if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                    z10 = true;
                }
            } catch (Exception e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "HsdpMigrationSignal.isHsdpMigrationSupported");
            }
            return zzgap.zzh(new zzepm(Boolean.valueOf(z10)));
        }
        return zzgap.zzh(new zzepm(null));
    }
}
