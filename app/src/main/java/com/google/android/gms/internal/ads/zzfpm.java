package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfpm extends zzfpl {
    private static zzfpm zzd;

    private zzfpm(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfpm zzj(Context context) {
        zzfpm zzfpmVar;
        synchronized (zzfpm.class) {
            if (zzd == null) {
                zzd = new zzfpm(context);
            }
            zzfpmVar = zzd;
        }
        return zzfpmVar;
    }

    public final zzfpi zzh(long j10, boolean z10) throws IOException {
        zzfpi zzb;
        synchronized (zzfpm.class) {
            zzb = zzb(null, null, j10, z10);
        }
        return zzb;
    }

    public final zzfpi zzi(String str, String str2, long j10, boolean z10) throws IOException {
        zzfpi zzb;
        synchronized (zzfpm.class) {
            zzb = zzb(str, str2, j10, z10);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfpm.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfpm.class) {
            zzf(true);
        }
    }
}
