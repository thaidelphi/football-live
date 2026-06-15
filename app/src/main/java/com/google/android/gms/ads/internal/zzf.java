package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import b6.a;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbxz;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzdqe;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzffb;
import com.google.android.gms.internal.ads.zzffc;
import com.google.android.gms.internal.ads.zzffq;
import com.google.android.gms.internal.ads.zzfzw;
import com.google.android.gms.internal.ads.zzgap;
import com.google.android.gms.internal.ads.zzgba;
import com.unity3d.services.core.di.ServiceProvider;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzf {

    /* renamed from: a  reason: collision with root package name */
    private Context f11528a;

    /* renamed from: b  reason: collision with root package name */
    private long f11529b = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(zzdqf zzdqfVar, String str, long j10) {
        if (zzdqfVar != null) {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzmA)).booleanValue()) {
                zzdqe zza = zzdqfVar.zza();
                zza.zzb("action", "lat_init");
                zza.zzb(str, Long.toString(j10));
                zza.zzj();
            }
        }
    }

    public static /* synthetic */ a zza(zzf zzfVar, Long l10, zzdqf zzdqfVar, zzffq zzffqVar, zzffc zzffcVar, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzv.zzp().zzi().zzs(jSONObject.getString("appSettingsJson"));
            if (l10 != null) {
                b(zzdqfVar, "cld_s", zzv.zzC().b() - l10.longValue());
            }
        }
        zzffcVar.zzg(optBoolean);
        zzffqVar.zzc(zzffcVar.zzm());
        return zzgap.zzh(null);
    }

    final void a(Context context, VersionInfoParcel versionInfoParcel, boolean z10, zzbxz zzbxzVar, String str, String str2, Runnable runnable, final zzffq zzffqVar, final zzdqf zzdqfVar, final Long l10) {
        PackageInfo f10;
        if (zzv.zzC().b() - this.f11529b < ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.f11529b = zzv.zzC().b();
        if (zzbxzVar != null && !TextUtils.isEmpty(zzbxzVar.zzc())) {
            if (zzv.zzC().a() - zzbxzVar.zza() <= ((Long) zzbd.zzc().zzb(zzbbm.zzek)).longValue() && zzbxzVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f11528a = applicationContext;
            final zzffc zza = zzffb.zza(context, 4);
            zza.zzi();
            zzbnf zza2 = zzv.zzg().zza(this.f11528a, versionInfoParcel, zzffqVar);
            zzbmz zzbmzVar = zzbnc.zza;
            zzbmv zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbmzVar, zzbmzVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                zzbbd zzbbdVar = zzbbm.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbd.zza().zza()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                try {
                    ApplicationInfo applicationInfo = this.f11528a.getApplicationInfo();
                    if (applicationInfo != null && (f10 = Wrappers.a(context).f(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", f10.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                a zzb = zza3.zzb(jSONObject);
                zzfzw zzfzwVar = new zzfzw() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final a zza(Object obj) {
                        return zzf.zza(zzf.this, l10, zzdqfVar, zzffqVar, zza, (JSONObject) obj);
                    }
                };
                zzgba zzgbaVar = zzbyp.zzg;
                a zzn = zzgap.zzn(zzb, zzfzwVar, zzgbaVar);
                if (runnable != null) {
                    zzb.addListener(runnable, zzgbaVar);
                }
                if (l10 != null) {
                    zzb.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzf zzfVar = zzf.this;
                            zzf.b(zzdqfVar, "cld_r", zzv.zzC().b() - l10.longValue());
                        }
                    }, zzgbaVar);
                }
                if (((Boolean) zzbd.zzc().zzb(zzbbm.zzhF)).booleanValue()) {
                    zzbys.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                } else {
                    zzbys.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                }
            } catch (Exception e8) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", e8);
                zza.zzh(e8);
                zza.zzg(false);
                zzffqVar.zzc(zza.zzm());
            }
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzffq zzffqVar, zzdqf zzdqfVar, Long l10) {
        a(context, versionInfoParcel, true, null, str, null, runnable, zzffqVar, zzdqfVar, l10);
    }

    public final void zze(Context context, VersionInfoParcel versionInfoParcel, String str, zzbxz zzbxzVar, zzffq zzffqVar) {
        a(context, versionInfoParcel, false, zzbxzVar, zzbxzVar != null ? zzbxzVar.zzb() : null, str, null, zzffqVar, null, null);
    }
}
