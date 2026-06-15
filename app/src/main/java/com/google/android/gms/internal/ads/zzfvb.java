package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfvb extends zzfup {
    final /* synthetic */ zzfve zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvb(zzfve zzfveVar, int i10) {
        this.zza = zzfveVar;
        this.zzb = zzfve.zzg(zzfveVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int zzw;
        int i10 = this.zzc;
        if (i10 == -1 || i10 >= this.zza.size() || !zzfss.zza(this.zzb, zzfve.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfup, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfup, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzfve.zzj(this.zza, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfup, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfve zzfveVar = this.zza;
        Object zzj = zzfve.zzj(zzfveVar, i10);
        zzfve.zzn(zzfveVar, this.zzc, obj);
        return zzj;
    }
}
