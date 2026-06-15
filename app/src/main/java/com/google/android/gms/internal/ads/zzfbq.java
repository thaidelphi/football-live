package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfbq {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzebk) {
            zzebk zzebkVar = (zzebk) th;
            return zzc(zzebkVar.zza(), zzebkVar.zzb());
        } else if (th instanceof zzduh) {
            if (th.getMessage() == null) {
                return zzd(((zzduh) th).zza(), null, null);
            }
            return zzd(((zzduh) th).zza(), th.getMessage(), null);
        } else if (th instanceof com.google.android.gms.ads.internal.util.zzba) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) th;
            return new com.google.android.gms.ads.internal.client.zze(zzbaVar.zza(), zzftm.zzc(zzbaVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return zzd(1, null, null);
        }
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzebl zzeblVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i10 = zza.zza;
        if ((i10 == 3 || i10 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzeblVar != null) {
            zza.zze = zzeblVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i10 != 0) {
            if (i10 == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzii)).intValue() > 0) {
                    return zzeVar;
                }
                i10 = 8;
            }
            return zzd(i10, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.internal.client.zze zzd(int r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zze r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbq.zzd(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
