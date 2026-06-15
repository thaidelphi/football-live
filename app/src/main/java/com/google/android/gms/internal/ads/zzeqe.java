package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeqe implements zzerw {
    private static String zza;
    private final zzgba zzb;
    private final Context zzc;

    public zzeqe(zzgba zzgbaVar, Context context) {
        this.zzb = zzgbaVar;
        this.zzc = context;
    }

    public static /* synthetic */ zzeqf zzc(zzeqe zzeqeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfp)).booleanValue()) {
                return new zzeqf(com.google.android.gms.ads.internal.zzv.zzB().zzf(zzeqeVar.zzc));
            }
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.zzv.zzB().zzf(zzeqeVar.zzc);
            }
            return new zzeqf(zza);
        }
        return new zzeqf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzerw
    public final b6.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqe.zzc(zzeqe.this);
            }
        });
    }
}
