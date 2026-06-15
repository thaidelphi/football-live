package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.b9;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbxd {
    static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            return Uri.parse(str.substring(0, i10) + str2 + b9.i.f16692b + str3 + b9.i.f16694c + str.substring(i10));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzv.zzo().zzp(context)) {
            return uri.toString();
        }
        String zzb = com.google.android.gms.ads.internal.zzv.zzo().zzb(context);
        if (zzb == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzas);
        String uri2 = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzar)).booleanValue() && uri2.contains(str)) {
            com.google.android.gms.ads.internal.zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
            return zzd(uri2, context).replace(str, zzb);
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaq)).booleanValue()) {
                return uri2;
            }
            String uri3 = zza(zzd(uri2, context), "fbs_aeid", zzb).toString();
            com.google.android.gms.ads.internal.zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
            return uri3;
        } else {
            return uri2;
        }
    }

    public static String zzc(String str, Context context, boolean z10, Map map) {
        String zzb;
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaz)).booleanValue() || z10) && com.google.android.gms.ads.internal.zzv.zzo().zzp(context) && !TextUtils.isEmpty(str) && (zzb = com.google.android.gms.ads.internal.zzv.zzo().zzb(context)) != null) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzas);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzar)).booleanValue() && str.contains(str2)) {
                if (com.google.android.gms.ads.internal.zzv.zzq().zzj(str)) {
                    com.google.android.gms.ads.internal.zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
                    return zzd(str, context).replace(str2, zzb);
                } else if (com.google.android.gms.ads.internal.zzv.zzq().zzk(str)) {
                    com.google.android.gms.ads.internal.zzv.zzo().zzk(context, zzb, (Map) map.get("_ai"));
                    return zzd(str, context).replace(str2, zzb);
                } else {
                    return str;
                }
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaq)).booleanValue()) {
                    return str;
                }
                if (com.google.android.gms.ads.internal.zzv.zzq().zzj(str)) {
                    com.google.android.gms.ads.internal.zzv.zzo().zzj(context, zzb, (Map) map.get("_ac"));
                    return zza(zzd(str, context), "fbs_aeid", zzb).toString();
                } else if (com.google.android.gms.ads.internal.zzv.zzq().zzk(str)) {
                    com.google.android.gms.ads.internal.zzv.zzo().zzk(context, zzb, (Map) map.get("_ai"));
                    return zza(zzd(str, context), "fbs_aeid", zzb).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    private static String zzd(String str, Context context) {
        String zze = com.google.android.gms.ads.internal.zzv.zzo().zze(context);
        String zzc = com.google.android.gms.ads.internal.zzv.zzo().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zze)) {
            str = zza(str, "gmp_app_id", zze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzc)) ? str : zza(str, "fbs_aiid", zzc).toString();
    }
}
