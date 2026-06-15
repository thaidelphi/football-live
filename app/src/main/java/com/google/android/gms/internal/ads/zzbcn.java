package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbcn {
    private f zza;
    private c zzb;
    private e zzc;
    private zzbcm zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhec.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final f zza() {
        c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.e(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzhec.zza(activity)) != null) {
            zzhed zzhedVar = new zzhed(this);
            this.zzc = zzhedVar;
            c.a(activity, zza, zzhedVar);
        }
    }

    public final void zzc(c cVar) {
        this.zzb = cVar;
        cVar.g(0L);
        zzbcm zzbcmVar = this.zzd;
        if (zzbcmVar != null) {
            zzbcmVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbcm zzbcmVar) {
        this.zzd = zzbcmVar;
    }

    public final void zzf(Activity activity) {
        e eVar = this.zzc;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
