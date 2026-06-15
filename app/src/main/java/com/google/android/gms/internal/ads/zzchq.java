package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzchq implements zzdrq {
    private final Context zza;
    private final zzbjn zzb;
    private final zzcha zzc;
    private final zzchq zzd = this;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchq(zzcha zzchaVar, Context context, zzbjn zzbjnVar, zzcie zzcieVar) {
        this.zzc = zzchaVar;
        this.zza = context;
        this.zzb = zzbjnVar;
        zzhdk zza = zzhdl.zza(this);
        this.zze = zza;
        zzhdk zza2 = zzhdl.zza(zzbjnVar);
        this.zzf = zza2;
        zzdrm zzdrmVar = new zzdrm(zza2);
        this.zzg = zzdrmVar;
        this.zzh = zzhdj.zzc(new zzdro(zza, zzdrmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final zzdrh zzb() {
        return new zzchn(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdrq
    public final zzdrn zzd() {
        return (zzdrn) this.zzh.zzb();
    }
}
