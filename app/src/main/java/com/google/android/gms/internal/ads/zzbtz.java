package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.ironsource.b9;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbtz extends zzbtx {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbmv zzd;
    private final VersionInfoParcel zze;

    public zzbtz(Context context, zzbmv zzbmvVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbmvVar;
    }

    public static /* synthetic */ Void zzb(zzbtz zzbtzVar, JSONObject jSONObject) {
        zzbbd zzbbdVar = zzbbm.zza;
        com.google.android.gms.ads.internal.client.zzbd.zzb();
        SharedPreferences zza = zzbbf.zza(zzbtzVar.zzb);
        if (zza == null) {
            return null;
        }
        SharedPreferences.Editor edit = zza.edit();
        com.google.android.gms.ads.internal.client.zzbd.zza();
        int i10 = zzbdc.zza;
        com.google.android.gms.ads.internal.client.zzbd.zza().zze(edit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzbd.zzb();
        edit.commit();
        SharedPreferences sharedPreferences = zzbtzVar.zzc;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzv.zzC().a()).apply();
            return null;
        }
        return null;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbdm.zzb.zze()).booleanValue()) {
                jSONObject.put(b9.h.V, context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbdm.zzc.zze());
            jSONObject.put("cl", "726272644");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.f12026a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.f12026a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final b6.a zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzv.zzC().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbdm.zzd.zze()).longValue()) {
            return zzgap.zzh(null);
        }
        return zzgap.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbty
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzbtz.zzb(zzbtz.this, (JSONObject) obj);
                return null;
            }
        }, zzbyp.zzg);
    }
}
