package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqj implements zzerw {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqj(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        String str;
        String str2;
        String str3;
        PackageManager.NameNotFoundException e8;
        String str4;
        InstallSourceInfo installSourceInfo;
        String str5 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        PackageInfo packageInfo2 = this.zzb;
        String str6 = packageInfo2 == null ? null : packageInfo2.versionName;
        try {
            Context context = this.zzc;
            zzfpe zzfpeVar = com.google.android.gms.ads.internal.util.zzs.zza;
            str = String.valueOf(Wrappers.a(context).d(str5));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzmF)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str5);
                } catch (PackageManager.NameNotFoundException e10) {
                    str2 = null;
                    e8 = e10;
                    str4 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str2 = null;
                        }
                        str4 = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e11) {
                        e8 = e11;
                        str4 = null;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e12) {
                        e8 = e12;
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str4;
                        return zzgap.zzh(new zzeqk(str5, valueOf, str6, str, str2, str3));
                    }
                    if (TextUtils.isEmpty(str4)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        str3 = null;
                        return zzgap.zzh(new zzeqk(str5, valueOf, str6, str, str2, str3));
                    }
                    str3 = str4;
                    return zzgap.zzh(new zzeqk(str5, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return zzgap.zzh(new zzeqk(str5, valueOf, str6, str, str2, str3));
    }
}
