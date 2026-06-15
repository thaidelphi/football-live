package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzbrh {
    private final zzcdq zza;
    private final String zzb;

    public zzbrh(zzcdq zzcdqVar, String str) {
        this.zza = zzcdqVar;
        this.zzb = str;
    }

    public final void zzg(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e8) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching default position.", e8);
        }
    }

    public final void zzh(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcdq zzcdqVar = this.zza;
            if (zzcdqVar != null) {
                zzcdqVar.zze("onError", put);
            }
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching error event.", e8);
        }
    }

    public final void zzi(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching ready Event.", e8);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e8) {
            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while obtaining screen information.", e8);
        }
    }

    public final void zzk(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e8) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching size change.", e8);
        }
    }

    public final void zzl(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e8) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching state change.", e8);
        }
    }
}
