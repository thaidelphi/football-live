package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzesx implements zzerv {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfpi zzc;

    public zzesx(AdvertisingIdClient.Info info, String str, zzfpi zzfpiVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzg.put("pdid", str);
                    zzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzg.put("rdid", this.zza.getId());
            zzg.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            zzg.put("idtype", "adid");
            zzfpi zzfpiVar = this.zzc;
            if (zzfpiVar.zzc()) {
                zzg.put("paidv1_id_android_3p", zzfpiVar.zzb());
                zzg.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e8);
        }
    }
}
