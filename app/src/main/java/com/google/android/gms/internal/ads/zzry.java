package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzry extends zzgy {
    public final int zza;

    public zzry(Throwable th, zzrz zzrzVar) {
        super("Decoder failed: ".concat(String.valueOf(zzrzVar == null ? null : zzrzVar.zza)), th);
        boolean z10 = th instanceof MediaCodec.CodecException;
        if (z10) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        int i10 = zzeh.zza;
        this.zza = z10 ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
