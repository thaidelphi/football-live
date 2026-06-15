package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfpn extends zzfpl {
    private static zzfpn zzd;

    private zzfpn(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfpn zzi(Context context) {
        zzfpn zzfpnVar;
        synchronized (zzfpn.class) {
            if (zzd == null) {
                zzd = new zzfpn(context);
            }
            zzfpnVar = zzd;
        }
        return zzfpnVar;
    }

    public final zzfpi zzh(long j10, boolean z10) throws IOException {
        synchronized (zzfpn.class) {
            if (this.zzc.zzd()) {
                return zzb(null, null, j10, z10);
            }
            return new zzfpi();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfpn.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }
}
