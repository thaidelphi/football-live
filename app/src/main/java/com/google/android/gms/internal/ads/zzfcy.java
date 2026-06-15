package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfcy {
    private final zzfcc zza;
    private final zzfcw zzb;
    private final zzfby zzc;
    private zzfde zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfcy(zzfcc zzfccVar, zzfby zzfbyVar, zzfcw zzfcwVar) {
        this.zza = zzfccVar;
        this.zzc = zzfbyVar;
        this.zzb = zzfcwVar;
        zzfbyVar.zzb(new zzfct(this));
    }

    public static /* synthetic */ void zzc(zzfcy zzfcyVar) {
        synchronized (zzfcyVar) {
            zzfcyVar.zzf = 1;
            zzfcyVar.zzh();
        }
    }

    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzgf)).booleanValue() && !com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfcx zzfcxVar = (zzfcx) this.zzd.pollFirst();
                if (zzfcxVar == null || (zzfcxVar.zza() != null && this.zza.zze(zzfcxVar.zza()))) {
                    zzfde zzfdeVar = new zzfde(this.zza, this.zzb, zzfcxVar);
                    this.zze = zzfdeVar;
                    zzfdeVar.zzd(new zzfcu(this, zzfcxVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized b6.a zza(zzfcx zzfcxVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzc(zzfcxVar);
    }

    public final synchronized void zzf(zzfcx zzfcxVar) {
        this.zzd.add(zzfcxVar);
    }
}
