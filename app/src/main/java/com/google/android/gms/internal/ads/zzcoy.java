package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzcoy implements zzcvt, zzcuz {
    private final Context zza;
    private final zzcdq zzb;
    private final zzezu zzc;
    private final VersionInfoParcel zzd;
    private zzebb zze;
    private boolean zzf;
    private final zzeaz zzg;

    public zzcoy(Context context, zzcdq zzcdqVar, zzezu zzezuVar, VersionInfoParcel versionInfoParcel, zzeaz zzeazVar) {
        this.zza = context;
        this.zzb = zzcdqVar;
        this.zzc = zzezuVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeazVar;
    }

    private final synchronized void zza() {
        zzeay zzeayVar;
        zzeay zzeayVar2;
        zzeax zzeaxVar;
        if (this.zzc.zzT && this.zzb != null) {
            if (com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfas zzfasVar = this.zzc.zzV;
                String zza = zzfasVar.zza();
                if (zzfasVar.zzc() == 1) {
                    zzeaxVar = zzeax.VIDEO;
                    zzeayVar2 = zzeay.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzezu zzezuVar = this.zzc;
                    zzeax zzeaxVar2 = zzeax.HTML_DISPLAY;
                    if (zzezuVar.zze == 1) {
                        zzeayVar = zzeay.ONE_PIXEL;
                    } else {
                        zzeayVar = zzeay.BEGIN_TO_RENDER;
                    }
                    zzeayVar2 = zzeayVar;
                    zzeaxVar = zzeaxVar2;
                }
                this.zze = com.google.android.gms.ads.internal.zzv.zzB().zza(str, this.zzb.zzG(), "", "javascript", zza, zzeayVar2, zzeaxVar, this.zzc.zzal);
                View zzF = this.zzb.zzF();
                zzebb zzebbVar = this.zze;
                if (zzebbVar != null) {
                    zzfiv zza2 = zzebbVar.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfi)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, this.zzb.zzG());
                        for (View view : this.zzb.zzV()) {
                            com.google.android.gms.ads.internal.zzv.zzB().zzg(zza2, view);
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, zzF);
                    }
                    this.zzb.zzat(this.zze);
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zza2);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new androidx.collection.a());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final synchronized void zzr() {
        zzcdq zzcdqVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcdqVar = this.zzb) == null) {
            return;
        }
        zzcdqVar.zzd("onSdkImpression", new androidx.collection.a());
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else if (this.zzf) {
        } else {
            zza();
        }
    }
}
