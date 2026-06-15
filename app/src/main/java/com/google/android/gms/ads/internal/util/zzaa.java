package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbak;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzeaf;
import java.io.InputStream;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class zzaa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    public CookieManager zza(Context context) {
        throw null;
    }

    public WebResourceResponse zzb(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public zzcdy zzc(zzcdq zzcdqVar, zzbak zzbakVar, boolean z10, zzeaf zzeafVar) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbar.zzq zzg(Context context, TelephonyManager telephonyManager) {
        return zzbar.zzq.ENUM_UNKNOWN;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public void zzl(Activity activity) {
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
