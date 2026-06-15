package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbie implements zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdq zzcdqVar = (zzcdq) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcdqVar.getContext()).edit();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                edit.remove(jSONArray.getString(i10));
            }
            edit.apply();
        } catch (JSONException e8) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "GMSG clear local storage keys handler");
        }
    }
}
