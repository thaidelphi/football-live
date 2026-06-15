package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwq {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwq(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxb zzbxbVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i10, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaD)).booleanValue()) {
            return;
        }
        if (j10 - this.zza.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzaE)).booleanValue()) {
            this.zza.zzH(-1);
            this.zza.zzI(j10);
            return;
        }
        this.zza.zzH(i10);
        this.zza.zzI(j10);
    }
}
