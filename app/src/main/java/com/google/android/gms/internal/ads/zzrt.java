package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzrt {
    public final zzrz zza;
    public final MediaFormat zzb;
    public final zzz zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zzrs zzf;

    private zzrt(zzrz zzrzVar, MediaFormat mediaFormat, zzz zzzVar, Surface surface, MediaCrypto mediaCrypto, zzrs zzrsVar) {
        this.zza = zzrzVar;
        this.zzb = mediaFormat;
        this.zzc = zzzVar;
        this.zzd = surface;
        this.zzf = zzrsVar;
    }

    public static zzrt zza(zzrz zzrzVar, MediaFormat mediaFormat, zzz zzzVar, MediaCrypto mediaCrypto, zzrs zzrsVar) {
        return new zzrt(zzrzVar, mediaFormat, zzzVar, null, null, zzrsVar);
    }

    public static zzrt zzb(zzrz zzrzVar, MediaFormat mediaFormat, zzz zzzVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzrt(zzrzVar, mediaFormat, zzzVar, surface, null, null);
    }
}
