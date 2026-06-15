package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgv {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zza(zzgv zzgvVar, int i10, int i11) {
        zzgvVar.zzb.set(i10, i11);
        zzgvVar.zza.setPattern(zzgvVar.zzb);
    }
}
