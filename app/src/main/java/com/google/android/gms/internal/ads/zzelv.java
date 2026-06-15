package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzelv implements zzerv {
    private final Integer zza;

    private zzelv(Integer num) {
        this.zza = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzelv zzc(VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjW)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            int i10 = 0;
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                    i10 = SdkExtensions.getExtensionVersion(1000000);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjZ)).booleanValue()) {
                        if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjY)).intValue() && i11 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                            i10 = SdkExtensions.getExtensionVersion(31);
                        }
                    }
                }
            } catch (Exception e8) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e8, "AdUtil.getAdServicesExtensionVersion");
            }
            return new zzelv(Integer.valueOf(i10));
        }
        return new zzelv(null);
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcth zzcthVar = (zzcth) obj;
        if (num != null) {
            zzcthVar.zza.putInt("aos", num.intValue());
        }
    }
}
