package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbwv extends zzbxc {
    private final Clock zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;
    private final zzhdt zzf;
    private final zzhdt zzg;
    private final zzhdt zzh;
    private final zzhdt zzi;
    private final zzhdt zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbwv(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxb zzbxbVar, zzbww zzbwwVar) {
        this.zzb = clock;
        zzhdk zza = zzhdl.zza(context);
        this.zzc = zza;
        zzhdk zza2 = zzhdl.zza(zzgVar);
        this.zzd = zza2;
        this.zze = zzhdj.zzc(new zzbwp(zza, zza2));
        zzhdk zza3 = zzhdl.zza(clock);
        this.zzf = zza3;
        zzhdk zza4 = zzhdl.zza(zzbxbVar);
        this.zzg = zza4;
        zzhdt zzc = zzhdj.zzc(new zzbwr(zza3, zza2, zza4));
        this.zzh = zzc;
        zzbwt zzbwtVar = new zzbwt(zza3, zzc);
        this.zzi = zzbwtVar;
        this.zzj = zzhdj.zzc(new zzbxh(zza, zzbwtVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    final zzbwo zza() {
        return (zzbwo) this.zze.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzbxc
    public final zzbws zzb() {
        return new zzbws(this.zzb, (zzbwq) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    final zzbxg zzc() {
        return (zzbxg) this.zzj.zzb();
    }
}
