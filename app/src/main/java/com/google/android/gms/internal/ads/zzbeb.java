package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbeb {
    public static final zzbcw zza = zzbcw.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbcw zzb;

    static {
        zzbcw.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbcw.zzd("gms:expose_token_for_gma:enabled", true);
        zzbcw.zzd("gads:referesh_rate_limit", false);
        zzb = zzbcw.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbcw.zzd("gads:token_anonymization:enabled", true);
        zzbcw.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
