package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzckd implements zzcjt {
    private final zzdte zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckd(zzdte zzdteVar) {
        this.zza = zzdteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjt
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjg)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
