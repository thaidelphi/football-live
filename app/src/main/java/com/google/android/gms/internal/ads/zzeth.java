package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeth implements zzerv {
    final String zza;
    final int zzb;

    public zzeth(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbs.zzg(jSONObject, "pii");
            zzg.put("pvid", this.zza);
            zzg.put("pvid_s", this.zzb);
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e8);
        }
    }
}
