package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzayb {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzaya zzayaVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i11 = this.zza;
            this.zza = i11 + 1;
            zzayaVar.zzg(i11);
            zzayaVar.zzk();
            this.zzc.add(zzayaVar);
        }
    }

    public final boolean zzb(zzaya zzayaVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzaya zzayaVar2 = (zzaya) it.next();
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                    if (!zzayaVar.equals(zzayaVar2) && zzayaVar2.zzc().equals(zzayaVar.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL() && !zzayaVar.equals(zzayaVar2) && zzayaVar2.zzd().equals(zzayaVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzc(zzaya zzayaVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzayaVar);
        }
    }
}
