package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final /* synthetic */ class zzffb {
    public static zzffc zza(Context context, int i10) {
        boolean booleanValue;
        if (zzffq.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbdf.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbdf.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbdf.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbdf.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzffe(context, i10);
            }
        }
        return new zzfgj();
    }

    public static zzffc zzb(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzffc zza = zza(context, i10);
        if (zza instanceof zzffe) {
            zza.zzi();
            zza.zzn(i11);
            zza.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzmVar.zzm));
            if (zzffm.zze(zzmVar.zzp)) {
                zza.zze(zzmVar.zzp);
            }
        }
        return zza;
    }
}
