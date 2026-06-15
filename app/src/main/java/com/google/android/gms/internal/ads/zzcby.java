package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcby implements zzbio {
    private static final Integer zzb(Map map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt((String) map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = "Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str));
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj(str2);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbx zzcbxVar;
        zzcbp zza;
        zzcal zzcalVar = (zzcal) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcbq zzz = com.google.android.gms.ads.internal.zzv.zzz();
        if (map.containsKey("abort")) {
            if (zzz.zzd(zzcalVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcak zzcakVar = new zzcak((String) map.get("flags"));
        boolean z10 = zzcakVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        strArr2[i10] = jSONArray.getString(i10);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z10) {
                Iterator it = zzz.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zza = null;
                        break;
                    }
                    zzcbp zzcbpVar = (zzcbp) it.next();
                    if (zzcbpVar.zza == zzcalVar && str.equals(zzcbpVar.zze())) {
                        zza = zzcbpVar;
                        break;
                    }
                }
            } else {
                zza = zzz.zza(zzcalVar);
            }
            if (zza != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache task is already running.");
                return;
            } else if (zzcalVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb4 = zzb(map, "player");
                if (zzb4 == null) {
                    zzb4 = 0;
                }
                if (zzb != null) {
                    zzcalVar.zzA(zzb.intValue());
                }
                if (zzb2 != null) {
                    zzcalVar.zzy(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzcalVar.zzx(zzb3.intValue());
                }
                int intValue = zzb4.intValue();
                zzcbi zzcbiVar = zzcalVar.zzj().zzb;
                if (intValue > 0) {
                    int i11 = zzcakVar.zzg;
                    int zzu = zzcac.zzu();
                    if (zzu < i11) {
                        zzcbxVar = new zzccg(zzcalVar, zzcakVar);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzn)).booleanValue()) {
                            zzu = zzccd.zzi();
                        }
                        if (zzu < zzcakVar.zzb) {
                            zzcbxVar = new zzccd(zzcalVar, zzcakVar);
                        } else {
                            zzcbxVar = new zzccb(zzcalVar);
                        }
                    }
                } else {
                    zzcbxVar = new zzcca(zzcalVar);
                }
                new zzcbp(zzcalVar, zzcbxVar, str, strArr).zzb();
            }
        } else {
            zzcbp zza2 = zzz.zza(zzcalVar);
            if (zza2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache must specify a source.");
                return;
            }
            zzcbxVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzcbxVar.zzs(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzcbxVar.zzr(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzcbxVar.zzp(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzcbxVar.zzq(zzb8.intValue());
        }
    }
}
