package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbbm;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
@TargetApi(24)
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class zzu extends zzt {
    static final boolean a(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeV)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeX)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenHeightDp);
            int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzv.zzq();
            DisplayMetrics zzu = zzs.zzu((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i10 = zzu.heightPixels;
            int i11 = zzu.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzeT)).intValue();
            return (a(i10, zzy + dimensionPixelSize, round) && a(i11, zzy2, round)) ? false : true;
        }
        return false;
    }
}
