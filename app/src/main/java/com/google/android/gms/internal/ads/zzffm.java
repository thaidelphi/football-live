package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzffm {
    public static void zza(b6.a aVar, zzffn zzffnVar, zzffc zzffcVar) {
        zzg(aVar, zzffnVar, zzffcVar, false);
    }

    public static void zzb(b6.a aVar, zzffn zzffnVar, zzffc zzffcVar) {
        zzg(aVar, zzffnVar, zzffcVar, true);
    }

    public static void zzc(b6.a aVar, zzffn zzffnVar, zzffc zzffcVar) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            zzgap.zzr(zzgag.zzu(aVar), new zzffl(zzffnVar, zzffcVar), zzbyp.zzg);
        }
    }

    public static void zzd(b6.a aVar, zzffc zzffcVar) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            zzgap.zzr(zzgag.zzu(aVar), new zzffj(zzffcVar), zzbyp.zzg);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zziK), str);
    }

    public static int zzf(zzfap zzfapVar) {
        int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(zzfapVar) - 1;
        return (zzf == 0 || zzf == 1) ? 7 : 23;
    }

    private static void zzg(b6.a aVar, zzffn zzffnVar, zzffc zzffcVar, boolean z10) {
        if (((Boolean) zzbdf.zzc.zze()).booleanValue()) {
            zzgap.zzr(zzgag.zzu(aVar), new zzffk(zzffnVar, zzffcVar, z10), zzbyp.zzg);
        }
    }
}
