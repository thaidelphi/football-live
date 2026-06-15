package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbar;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcrb implements zzcvt, com.google.android.gms.ads.internal.client.zza, zzcxc, zzcuz, zzcuf, zzczo {
    private final Clock zza;
    private final zzbxy zzb;

    public zzcrb(Clock clock, zzbxy zzbxyVar) {
        this.zza = clock;
        this.zzb = zzbxyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zza() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(zzfag zzfagVar) {
        this.zzb.zzk(this.zza.b());
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzdq(zzbup zzbupVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuf
    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzi(zzbar.zzb zzbVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzj(zzbar.zzb zzbVar) {
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzj(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzl(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzm(zzbar.zzb zzbVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzn(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        this.zzb.zzh(true);
    }
}
