package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzedg implements zzdeo {
    private final zzezu zza;
    private final zzbqc zzb;
    private final AdFormat zzc;
    private zzcux zzd = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedg(zzezu zzezuVar, zzbqc zzbqcVar, AdFormat adFormat) {
        this.zza = zzezuVar;
        this.zzb = zzbqcVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zza(boolean z10, Context context, zzcus zzcusVar) throws zzden {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(ObjectWrapper.u0(context));
            } else if (ordinal == 2) {
                zzs = this.zzb.zzt(ObjectWrapper.u0(context));
            } else {
                if (ordinal == 5) {
                    zzs = this.zzb.zzr(ObjectWrapper.u0(context));
                }
                throw new zzden("Adapter failed to show.");
            }
            if (zzs) {
                zzcux zzcuxVar = this.zzd;
                if (zzcuxVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzbE)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcuxVar.zza();
                return;
            }
            throw new zzden("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzden(th);
        }
    }

    public final void zzb(zzcux zzcuxVar) {
        this.zzd = zzcuxVar;
    }
}
