package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.ug;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzclv implements zzbmy {
    private final Context zza;
    private final zzaxh zzb;
    private final PowerManager zzc;

    public zzclv(Context context, zzaxh zzaxhVar) {
        this.zza = context;
        this.zzb = zzaxhVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    /* renamed from: zza */
    public final JSONObject zzb(zzcly zzclyVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzaxk zzaxkVar = zzclyVar.zzf;
        if (zzaxkVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z10 = zzaxkVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put(da.a.f16995d, zzclyVar.zzd).put(ImpressionData.IMPRESSION_DATA_KEY_AD_FORMAT, this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzclyVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzv.zzs().zze()).put("appVolume", com.google.android.gms.ads.internal.zzv.zzs().zza()).put(b9.i.P, com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            jSONObject3.put("windowVisibility", zzaxkVar.zzb).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", zzaxkVar.zzc.top).put("bottom", zzaxkVar.zzc.bottom).put("left", zzaxkVar.zzc.left).put("right", zzaxkVar.zzc.right)).put("adBox", new JSONObject().put("top", zzaxkVar.zzd.top).put("bottom", zzaxkVar.zzd.bottom).put("left", zzaxkVar.zzd.left).put("right", zzaxkVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzaxkVar.zze.top).put("bottom", zzaxkVar.zze.bottom).put("left", zzaxkVar.zze.left).put("right", zzaxkVar.zze.right)).put("globalVisibleBoxVisible", zzaxkVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzaxkVar.zzg.top).put("bottom", zzaxkVar.zzg.bottom).put("left", zzaxkVar.zzg.left).put("right", zzaxkVar.zzg.right)).put("localVisibleBoxVisible", zzaxkVar.zzh).put("hitBox", new JSONObject().put("top", zzaxkVar.zzi.top).put("bottom", zzaxkVar.zzi.bottom).put("left", zzaxkVar.zzi.left).put("right", zzaxkVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put(ug.f20996k, zzclyVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzby)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzaxkVar.zzk;
                if (list != null) {
                    for (Rect rect : list) {
                        jSONArray2.put(new JSONObject().put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzclyVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
