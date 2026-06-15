package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbx {
    private final OutputStream zza;

    private zzgbx(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgbx zzb(OutputStream outputStream) {
        return new zzgbx(outputStream);
    }

    public final void zza(zzgrq zzgrqVar) throws IOException {
        try {
            zzgrqVar.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
