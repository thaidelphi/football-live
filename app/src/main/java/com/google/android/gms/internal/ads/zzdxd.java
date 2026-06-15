package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdxd {
    private final zzgba zza;
    private final zzdwi zzb;
    private final zzhde zzc;

    public zzdxd(zzgba zzgbaVar, zzdwi zzdwiVar, zzhde zzhdeVar) {
        this.zza = zzgbaVar;
        this.zzb = zzdwiVar;
        this.zzc = zzhdeVar;
    }

    private final b6.a zzg(final zzbud zzbudVar, zzdxc zzdxcVar, final zzdxc zzdxcVar2, final zzfzw zzfzwVar) {
        b6.a zzf;
        String str = zzbudVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            zzf = zzgap.zzg(new zzdwr(1));
        } else {
            zzf = zzgap.zzf(zzdxcVar.zza(zzbudVar), ExecutionException.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdxb
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    ExecutionException executionException = (ExecutionException) obj;
                    Throwable cause = executionException.getCause();
                    Throwable th = executionException;
                    if (cause != null) {
                        th = executionException.getCause();
                    }
                    return zzgap.zzg(th);
                }
            }, this.zza);
        }
        return (zzgag) zzgap.zzf((zzgag) zzgap.zzn((zzgag) zzgap.zzn(zzgag.zzu(zzf), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdwz
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzgap.zzh(((zzdws) obj).zzb());
            }
        }, this.zza), zzfzwVar, this.zza), zzdwr.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdxa
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                b6.a zzn;
                zzdxd zzdxdVar = zzdxd.this;
                zzdwr zzdwrVar = (zzdwr) obj;
                zzn = zzgap.zzn(zzdxcVar2.zza(zzbudVar), zzfzwVar, zzdxdVar.zza);
                return zzn;
            }
        }, this.zza);
    }

    public final b6.a zze(final zzbud zzbudVar) {
        zzfzw zzfzwVar = new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdww
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                String str = new String(zzfyl.zzb((InputStream) obj), StandardCharsets.UTF_8);
                zzbud zzbudVar2 = zzbud.this;
                zzbudVar2.zzj = str;
                return zzgap.zzh(zzbudVar2);
            }
        };
        final zzdwi zzdwiVar = this.zzb;
        Objects.requireNonNull(zzdwiVar);
        return zzg(zzbudVar, new zzdxc() { // from class: com.google.android.gms.internal.ads.zzdwx
            @Override // com.google.android.gms.internal.ads.zzdxc
            public final b6.a zza(zzbud zzbudVar2) {
                return zzdwi.this.zza(zzbudVar2);
            }
        }, new zzdxc() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // com.google.android.gms.internal.ads.zzdxc
            public final b6.a zza(zzbud zzbudVar2) {
                b6.a zzb;
                zzb = ((zzdxv) zzdxd.this.zzc.zzb()).zzb(zzbudVar2, Binder.getCallingUid());
                return zzb;
            }
        }, zzfzwVar);
    }

    public final b6.a zzf(zzbud zzbudVar) {
        return zzg(zzbudVar, new zzdxc() { // from class: com.google.android.gms.internal.ads.zzdwu
            @Override // com.google.android.gms.internal.ads.zzdxc
            public final b6.a zza(zzbud zzbudVar2) {
                b6.a zzd;
                zzd = zzdxd.this.zzb.zzd(zzbudVar2.zzh);
                return zzd;
            }
        }, new zzdxc() { // from class: com.google.android.gms.internal.ads.zzdwv
            @Override // com.google.android.gms.internal.ads.zzdxc
            public final b6.a zza(zzbud zzbudVar2) {
                b6.a zzj;
                zzj = ((zzdxv) zzdxd.this.zzc.zzb()).zzj(zzbudVar2.zzh);
                return zzj;
            }
        }, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdwt
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzgap.zzh(null);
            }
        });
    }
}
