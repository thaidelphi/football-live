package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdqf {
    private final zzdqk zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdqf(zzdqk zzdqkVar, Executor executor) {
        this.zza = zzdqkVar;
        this.zzc = zzdqkVar.zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdqk zzb(zzdqf zzdqfVar) {
        return zzdqfVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzdqf zzdqfVar) {
        return zzdqfVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzdqf zzdqfVar) {
        return zzdqfVar.zzb;
    }

    public final zzdqe zza() {
        zzdqe zzdqeVar = new zzdqe(this);
        zzdqe.zza(zzdqeVar);
        return zzdqeVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlz)).booleanValue()) {
            zzdqe zza = zza();
            zza.zzb("action", "pecr");
            zza.zzj();
        }
    }
}
