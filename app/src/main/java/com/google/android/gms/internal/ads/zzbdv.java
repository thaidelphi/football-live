package com.google.android.gms.internal.ads;

import com.appnext.actionssdk.h;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbdv {
    public static final zzbcw zza = zzbcw.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbcw zzb = zzbcw.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbcw zzc = new zzbcw("gads:public_beta:traffic_multiplier", h.VERSION_NAME, 4);
    public static final zzbcw zzd = new zzbcw("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbcw zze;
    public static final zzbcw zzf;

    static {
        zzbcw.zzd("gads:sdk_crash_report_enabled", false);
        zze = zzbcw.zzd("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbcw.zza("gads:trapped_exception_sample_rate", 0.01d);
    }
}
