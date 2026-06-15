package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzedo implements zzebi {
    private final zzdnv zza;

    public zzedo(zzdnv zzdnvVar) {
        this.zza = zzdnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebi
    public final zzebj zza(String str, JSONObject jSONObject) throws zzfaw {
        return new zzebj(this.zza.zzc(str, jSONObject), new zzecx(), str);
    }
}
