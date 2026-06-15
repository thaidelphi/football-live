package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzdqf;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zza {
    private static final boolean a(Context context, Uri uri, zzac zzacVar, zzaa zzaaVar) {
        int i10;
        try {
            i10 = com.google.android.gms.ads.internal.zzv.zzq().zzn(context, uri);
            if (zzacVar != null) {
                zzacVar.zzg();
            }
        } catch (ActivityNotFoundException e8) {
            String message = e8.getMessage();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(message);
            i10 = 6;
        }
        if (zzaaVar != null) {
            zzaaVar.zzb(i10);
        }
        return i10 == 5;
    }

    public static final boolean zza(Context context, Intent intent, zzac zzacVar, zzaa zzaaVar, boolean z10, zzdqf zzdqfVar, String str) {
        if (z10) {
            return a(context, intent.getData(), zzacVar, zzaaVar);
        }
        try {
            String uri = intent.toURI();
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + uri);
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzmV)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzX(context, intent, zzdqfVar, str);
            } else {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzT(context, intent);
            }
            if (zzacVar != null) {
                zzacVar.zzg();
            }
            if (zzaaVar != null) {
                zzaaVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e8) {
            String message = e8.getMessage();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(message);
            if (zzaaVar != null) {
                zzaaVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzac zzacVar, zzaa zzaaVar, zzdqf zzdqfVar, String str) {
        int i10 = 0;
        if (zzcVar == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbbm.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzacVar, zzaaVar, zzcVar.zzj, zzdqfVar, str);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzcVar.zzc)) {
            String str2 = zzcVar.zzb;
            intent2.setDataAndType(Uri.parse(str2), zzcVar.zzc);
        } else {
            intent2.setData(Uri.parse(zzcVar.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] split = zzcVar.zze.split("/", 2);
            if (split.length < 2) {
                String str3 = zzcVar.zze;
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(str3)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str4 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str4)) {
            try {
                i10 = Integer.parseInt(str4);
            } catch (NumberFormatException unused) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbbm.zzeE)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbbm.zzeD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzp(context, intent2);
            }
        }
        return zza(context, intent2, zzacVar, zzaaVar, zzcVar.zzj, zzdqfVar, str);
    }
}
