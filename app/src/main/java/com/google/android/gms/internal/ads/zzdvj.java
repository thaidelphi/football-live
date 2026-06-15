package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdvj {
    private final ScheduledExecutorService zza;
    private final zzgba zzb;
    private final zzgba zzc;
    private final zzdwe zzd;
    private final zzhde zze;

    public zzdvj(ScheduledExecutorService scheduledExecutorService, zzgba zzgbaVar, zzgba zzgbaVar2, zzdwe zzdweVar, zzhde zzhdeVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgbaVar;
        this.zzc = zzgbaVar2;
        this.zzd = zzdweVar;
        this.zze = zzhdeVar;
    }

    public static /* synthetic */ zzdws zza(zzdvj zzdvjVar, zzbud zzbudVar) {
        return (zzdws) zzdvjVar.zzd.zza(zzbudVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfz)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ b6.a zzb(zzdvj zzdvjVar, final zzbud zzbudVar, int i10, Throwable th) {
        Bundle bundle;
        if (zzbudVar != null && (bundle = zzbudVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgap.zzn(((zzdxv) zzdvjVar.zze.zzb()).zzd(zzbudVar, i10), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdvg
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzgap.zzh(new zzdws((InputStream) obj, zzbud.this));
            }
        }, zzdvjVar.zzb);
    }

    public final b6.a zzc(final zzbud zzbudVar) {
        b6.a zza;
        String str = zzbudVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            zza = zzgap.zzg(new zzdwr(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhq)).booleanValue()) {
                zza = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdvj.zza(zzdvj.this, zzbudVar);
                    }
                });
            } else {
                zza = this.zzd.zza(zzbudVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        zzgag zzu = zzgag.zzu(zza);
        zzbbd zzbbdVar = zzbbm.zzfz;
        return (zzgag) zzgap.zzf((zzgag) zzgap.zzo(zzu, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbdVar)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdvi
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzdvj.zzb(zzdvj.this, zzbudVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
