package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfde {
    private final zzfcx zza;
    private final b6.a zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfde(final zzfcc zzfccVar, final zzfcw zzfcwVar, final zzfcx zzfcxVar) {
        this.zza = zzfcxVar;
        this.zzb = zzgap.zzf(zzgap.zzn(zzfcwVar.zza(zzfcxVar), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzfdc
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzfde.zzb(zzfde.this, zzfcwVar, zzfccVar, zzfcxVar, (zzfcl) obj);
            }
        }, zzfcxVar.zzb()), Exception.class, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzfdd
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                return zzfde.zza(zzfde.this, zzfcwVar, (Exception) obj);
            }
        }, zzfcxVar.zzb());
    }

    public static /* synthetic */ b6.a zza(zzfde zzfdeVar, zzfcw zzfcwVar, Exception exc) {
        synchronized (zzfdeVar) {
            zzfdeVar.zzd = true;
            throw exc;
        }
    }

    public static /* synthetic */ b6.a zzb(zzfde zzfdeVar, zzfcw zzfcwVar, zzfcc zzfccVar, zzfcx zzfcxVar, zzfcl zzfclVar) {
        b6.a zzh;
        synchronized (zzfdeVar) {
            zzfdeVar.zzd = true;
            zzfcwVar.zzb(zzfclVar);
            if (!zzfdeVar.zzc) {
                zzfccVar.zzd(zzfcxVar.zza(), zzfclVar);
                zzh = zzgap.zzh(null);
            } else {
                zzh = zzgap.zzh(new zzfcv(zzfclVar, zzfcxVar));
            }
        }
        return zzh;
    }

    public final synchronized b6.a zzc(zzfcx zzfcxVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfcxVar.zza() != null && this.zza.zza().equals(zzfcxVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    public final synchronized void zzd(zzgal zzgalVar) {
        zzgap.zzr(zzgap.zzn(this.zzb, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzfdb
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                zzfcv zzfcvVar = (zzfcv) obj;
                return zzgap.zzi();
            }
        }, this.zza.zzb()), zzgalVar, this.zza.zzb());
    }
}
