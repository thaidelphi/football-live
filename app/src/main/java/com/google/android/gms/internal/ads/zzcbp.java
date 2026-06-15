package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcbp extends com.google.android.gms.ads.internal.util.zzb {
    final zzcal zza;
    final zzcbx zzb;
    private final String zzc;
    private final String[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbp(zzcal zzcalVar, zzcbx zzcbxVar, String str, String[] strArr) {
        this.zza = zzcalVar;
        this.zzb = zzcbxVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzv.zzz().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbo(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final b6.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzce)).booleanValue() && (this.zzb instanceof zzccg)) {
            return zzbyp.zzf.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcbn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(r0.zzb.zzw(r0.zzc, r0.zzd, zzcbp.this));
                    return valueOf;
                }
            });
        }
        return super.zzb();
    }

    public final String zze() {
        return this.zzc;
    }
}
