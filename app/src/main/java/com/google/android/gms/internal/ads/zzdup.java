package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdup {
    private final zzgba zza;
    private final zzgba zzb;
    private final zzdvy zzc;
    private final zzhde zzd;

    public zzdup(zzgba zzgbaVar, zzgba zzgbaVar2, zzdvy zzdvyVar, zzhde zzhdeVar) {
        this.zza = zzgbaVar;
        this.zzb = zzgbaVar2;
        this.zzc = zzdvyVar;
        this.zzd = zzhdeVar;
    }

    public static /* synthetic */ zzdws zza(zzdup zzdupVar, zzbud zzbudVar) {
        return (zzdws) zzdupVar.zzc.zza(zzbudVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfz)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ b6.a zzb(zzdup zzdupVar, final zzbud zzbudVar, int i10, zzdwr zzdwrVar) {
        Bundle bundle;
        if (zzbudVar != null && (bundle = zzbudVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgap.zzn(((zzdxv) zzdupVar.zzd.zzb()).zzc(zzbudVar, i10), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdul
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzgap.zzh(new zzdws((InputStream) obj, zzbud.this));
            }
        }, zzdupVar.zzb);
    }

    public final b6.a zzc(final zzbud zzbudVar) {
        b6.a zzf;
        String str = zzbudVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            zzf = zzgap.zzg(new zzdwr(1));
        } else {
            zzf = zzgap.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdum
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdup.zza(zzdup.this, zzbudVar);
                }
            }), ExecutionException.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzdun
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
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgap.zzf(zzf, zzdwr.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzduo
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzdup.zzb(zzdup.this, zzbudVar, callingUid, (zzdwr) obj);
            }
        }, this.zzb);
    }
}
