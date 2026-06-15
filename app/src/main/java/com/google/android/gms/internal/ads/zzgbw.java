package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzgbw {
    private final InputStream zza;

    private zzgbw(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgbw zzb(byte[] bArr) {
        return new zzgbw(new ByteArrayInputStream(bArr));
    }

    public final zzgrq zza() throws IOException {
        try {
            return zzgrq.zzg(this.zza, zzgvu.zza());
        } finally {
            this.zza.close();
        }
    }
}
