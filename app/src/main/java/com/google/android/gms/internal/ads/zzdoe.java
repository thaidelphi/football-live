package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbar;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdoe implements zzhdk {
    private final zzhdt zza;
    private final zzhdt zzb;
    private final zzhdt zzc;
    private final zzhdt zzd;
    private final zzhdt zze;

    public zzdoe(zzhdt zzhdtVar, zzhdt zzhdtVar2, zzhdt zzhdtVar3, zzhdt zzhdtVar4, zzhdt zzhdtVar5) {
        this.zza = zzhdtVar;
        this.zzb = zzhdtVar2;
        this.zzc = zzhdtVar3;
        this.zzd = zzhdtVar4;
        this.zze = zzhdtVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzheb, com.google.android.gms.internal.ads.zzhea
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcfx) this.zza).zza();
        final String zzb = ((zzdvc) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcgl) this.zzc).zza();
        final zzbar.zza.EnumC0178zza enumC0178zza = (zzbar.zza.EnumC0178zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbak zzbakVar = new zzbak(new zzbaq(zza));
        zzbar.zzar.zza zzd = zzbar.zzar.zzd();
        zzd.zzg(zza2.buddyApkVersion);
        zzd.zzi(zza2.clientJarVersion);
        zzd.zzh(true != zza2.isClientJar ? 2 : 0);
        final zzbar.zzar zzbr = zzd.zzbr();
        zzbakVar.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // com.google.android.gms.internal.ads.zzbaj
            public final void zza(zzbar.zzt.zza zzaVar) {
                zzbar.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbM.zzH(zzbar.zza.EnumC0178zza.this);
                zzaVar.zzG(zzbM);
                zzbar.zzm.zza zzbM2 = zzaVar.zzg().zzbM();
                zzbM2.zzm(zzb);
                zzbM2.zzw(zzbr);
                zzaVar.zzK(zzbM2);
                zzaVar.zzO(str);
            }
        });
        return zzbakVar;
    }
}
