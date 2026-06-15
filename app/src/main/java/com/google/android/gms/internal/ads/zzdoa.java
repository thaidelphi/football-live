package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdoa {
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;
    private final Map zza = new ConcurrentHashMap();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdoa(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdny
            @Override // java.lang.Runnable
            public final void run() {
                r0.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdoa.this.zzh();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        JSONObject zzf;
        Map map;
        this.zzd = true;
        zzbxz zzg = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg();
        if (zzg != null && (zzf = zzg.zzf()) != null) {
            this.zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeg)).booleanValue() ? zzf.optJSONObject("common_settings") : null;
            this.zze = zzf.optJSONObject("ad_unit_patterns");
            JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("ad_unit_id");
                        String optString2 = optJSONObject.optString("format");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                        if (optString != null && optJSONObject2 != null && optString2 != null) {
                            if (this.zza.containsKey(optString2)) {
                                map = (Map) this.zza.get(optString2);
                            } else {
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                this.zza.put(optString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(optString, optJSONObject2);
                        }
                    }
                }
            }
        }
    }

    public final JSONObject zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeg)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzee)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzh();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzef)).booleanValue()) {
                zzg();
            }
        }
        Map map = (Map) this.zza.get(str2);
        if (map != null) {
            JSONObject jSONObject = (JSONObject) map.get(str);
            if (jSONObject != null) {
                return jSONObject;
            }
            String zza = zzdoc.zza(this.zze, str, str2);
            if (zza != null) {
                return (JSONObject) map.get(zza);
            }
            return null;
        }
        return null;
    }

    public final void zzf() {
        zzg();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnx
            @Override // java.lang.Runnable
            public final void run() {
                zzdoa.this.zzh();
            }
        });
    }
}
