package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzddg {
    private final zzdeo zza;
    private final zzcdq zzb;

    public zzddg(zzdeo zzdeoVar, zzcdq zzcdqVar) {
        this.zza = zzdeoVar;
        this.zzb = zzcdqVar;
    }

    public final View zza() {
        zzcdq zzcdqVar = this.zzb;
        if (zzcdqVar == null) {
            return null;
        }
        return zzcdqVar.zzG();
    }

    public final View zzb() {
        zzcdq zzcdqVar = this.zzb;
        if (zzcdqVar != null) {
            return zzcdqVar.zzG();
        }
        return null;
    }

    public final zzcdq zzc() {
        return this.zzb;
    }

    public final zzdbw zzd(Executor executor) {
        final zzcdq zzcdqVar = this.zzb;
        return new zzdbw(new zzcyu() { // from class: com.google.android.gms.internal.ads.zzddf
            @Override // com.google.android.gms.internal.ads.zzcyu
            public final void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzL;
                zzcdq zzcdqVar2 = zzcdq.this;
                if (zzcdqVar2 == null || (zzL = zzcdqVar2.zzL()) == null) {
                    return;
                }
                zzL.zzb();
            }
        }, executor);
    }

    public final zzdeo zze() {
        return this.zza;
    }

    public Set zzf(zzcta zzctaVar) {
        return Collections.singleton(new zzdbw(zzctaVar, zzbyp.zzg));
    }

    public Set zzg(zzcta zzctaVar) {
        return Collections.singleton(new zzdbw(zzctaVar, zzbyp.zzg));
    }
}
