package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import b6.a;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbys;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzd {
    public static void zza(Context context) {
        int i10 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbdi.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                a zzb = new zzc(context).zzb();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Updating ad debug logging enablement.");
                zzbys.zza(zzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to determine debug setting.", e8);
            }
        }
    }
}
