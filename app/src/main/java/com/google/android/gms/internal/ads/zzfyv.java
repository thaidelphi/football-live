package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfyv {
    public static char zza(long j10) {
        char c10 = (char) j10;
        zzfsv.zzh(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static char zzb(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
