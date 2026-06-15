package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfpo {
    private static zzfpo zzb;
    final zzfpk zza;

    private zzfpo(Context context) {
        this.zza = zzfpk.zzb(context);
        zzfpj.zza(context);
    }

    public static final zzfpo zza(Context context) {
        zzfpo zzfpoVar;
        synchronized (zzfpo.class) {
            if (zzb == null) {
                zzb = new zzfpo(context);
            }
            zzfpoVar = zzb;
        }
        return zzfpoVar;
    }

    public final void zzb(zzfpi zzfpiVar) throws IOException {
        synchronized (zzfpo.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
