package com.google.android.gms.ads.internal.util.client;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzv {

    /* renamed from: a  reason: collision with root package name */
    private final zzx f11397a;

    public zzv() {
        this.f11397a = new zzn(1, 0, 1.0d, false);
    }

    private zzv(zzx zzxVar) {
        this.f11397a = zzxVar;
    }

    public static zzv zza(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new zzv(optJSONObject == null ? new zzn(1, 0, 1.0d, false) : new zzn(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final zzx zzb() {
        return this.f11397a;
    }
}
