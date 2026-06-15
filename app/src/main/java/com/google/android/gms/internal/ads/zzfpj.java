package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfpj {
    private static zzfpj zzb;
    final zzfpk zza;

    private zzfpj(Context context) {
        this.zza = zzfpk.zzb(context);
    }

    public static final zzfpj zza(Context context) {
        zzfpj zzfpjVar;
        synchronized (zzfpj.class) {
            if (zzb == null) {
                zzb = new zzfpj(context);
            }
            zzfpjVar = zzb;
        }
        return zzfpjVar;
    }

    public final void zzb(boolean z10) throws IOException {
        synchronized (zzfpj.class) {
            this.zza.zzd("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final void zzc(boolean z10) throws IOException {
        synchronized (zzfpj.class) {
            this.zza.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
            if (!z10) {
                this.zza.zze("paidv2_creation_time");
                this.zza.zze("paidv2_id");
                this.zza.zze("vendor_scoped_gpid_v2_id");
                this.zza.zze("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzd() {
        boolean zzf;
        synchronized (zzfpj.class) {
            zzf = this.zza.zzf("paidv2_publisher_option", true);
        }
        return zzf;
    }

    public final boolean zze() {
        boolean zzf;
        synchronized (zzfpj.class) {
            zzf = this.zza.zzf("paidv2_user_option", true);
        }
        return zzf;
    }
}
