package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfej {
    final /* synthetic */ zzfel zza;
    private final Object zzb;
    private final String zzc;
    private final b6.a zzd;
    private final List zze;
    private final b6.a zzf;

    private zzfej(zzfel zzfelVar, Object obj, String str, b6.a aVar, List list, b6.a aVar2) {
        this.zza = zzfelVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = aVar;
        this.zze = list;
        this.zzf = aVar2;
    }

    public final zzfdz zza() {
        zzfem zzfemVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfdz zzfdzVar = new zzfdz(obj, str, this.zzf);
        zzfemVar = this.zza.zzd;
        zzfemVar.zza(zzfdzVar);
        b6.a aVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeh
            @Override // java.lang.Runnable
            public final void run() {
                zzfem zzfemVar2;
                zzfemVar2 = zzfej.this.zza.zzd;
                zzfemVar2.zzc(zzfdzVar);
            }
        };
        zzgba zzgbaVar = zzbyp.zzg;
        aVar.addListener(runnable, zzgbaVar);
        zzgap.zzr(zzfdzVar, new zzfei(this, zzfdzVar), zzgbaVar);
        return zzfdzVar;
    }

    public final zzfej zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfej zzc(Class cls, zzfzw zzfzwVar) {
        zzgba zzgbaVar;
        zzgbaVar = this.zza.zzb;
        return new zzfej(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgap.zzf(this.zzf, cls, zzfzwVar, zzgbaVar));
    }

    public final zzfej zzd(final b6.a aVar) {
        return zzg(new zzfzw() { // from class: com.google.android.gms.internal.ads.zzfeg
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return b6.a.this;
            }
        }, zzbyp.zzg);
    }

    public final zzfej zze(final zzfdx zzfdxVar) {
        return zzf(new zzfzw() { // from class: com.google.android.gms.internal.ads.zzfef
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzgap.zzh(zzfdx.this.zza(obj));
            }
        });
    }

    public final zzfej zzf(zzfzw zzfzwVar) {
        zzgba zzgbaVar;
        zzgbaVar = this.zza.zzb;
        return zzg(zzfzwVar, zzgbaVar);
    }

    public final zzfej zzg(zzfzw zzfzwVar, Executor executor) {
        return new zzfej(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgap.zzn(this.zzf, zzfzwVar, executor));
    }

    public final zzfej zzh(String str) {
        return new zzfej(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfej zzi(long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfej(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgap.zzo(this.zzf, j10, timeUnit, scheduledExecutorService));
    }
}
