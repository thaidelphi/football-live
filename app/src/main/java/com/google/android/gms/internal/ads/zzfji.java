package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfji {
    private final String zza;
    private final String zzb;

    private zzfji(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfji zza(String str, String str2) {
        zzfkq.zzb(str, "Name is null or empty");
        zzfkq.zzb(str2, "Version is null or empty");
        return new zzfji(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
