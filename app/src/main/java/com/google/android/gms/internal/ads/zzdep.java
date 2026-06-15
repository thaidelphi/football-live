package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdep implements zzcvt, com.google.android.gms.ads.internal.overlay.zzr, zzcuz {
    zzebb zza;
    private final Context zzb;
    private final zzcdq zzc;
    private final zzezu zzd;
    private final VersionInfoParcel zze;
    private final zzeaz zzf;

    public zzdep(Context context, zzcdq zzcdqVar, zzezu zzezuVar, VersionInfoParcel versionInfoParcel, zzeaz zzeazVar) {
        this.zzb = context;
        this.zzc = zzcdqVar;
        this.zzd = zzezuVar;
        this.zze = versionInfoParcel;
        this.zzf = zzeazVar;
    }

    private final boolean zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfm)).booleanValue() || this.zzc == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new androidx.collection.a());
            } else {
                this.zzf.zzb();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final void zzr() {
        if (zzg()) {
            this.zzf.zzb();
        } else if (this.zza == null || this.zzc == null) {
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfm)).booleanValue()) {
                this.zzc.zzd("onSdkImpression", new androidx.collection.a());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        zzeay zzeayVar;
        zzeay zzeayVar2;
        zzeax zzeaxVar;
        if (!this.zzd.zzT || this.zzc == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zzb)) {
            if (zzg()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            zzfas zzfasVar = this.zzd.zzV;
            String zza = zzfasVar.zza();
            if (zzfasVar.zzc() == 1) {
                zzeaxVar = zzeax.VIDEO;
                zzeayVar2 = zzeay.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzY == 2) {
                    zzeayVar = zzeay.UNSPECIFIED;
                } else {
                    zzeayVar = zzeay.BEGIN_TO_RENDER;
                }
                zzeayVar2 = zzeayVar;
                zzeaxVar = zzeax.HTML_DISPLAY;
            }
            this.zza = com.google.android.gms.ads.internal.zzv.zzB().zza(str, this.zzc.zzG(), "", "javascript", zza, zzeayVar2, zzeaxVar, this.zzd.zzal);
            View zzF = this.zzc.zzF();
            zzebb zzebbVar = this.zza;
            if (zzebbVar != null) {
                zzfiv zza2 = zzebbVar.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfi)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, this.zzc.zzG());
                    for (View view : this.zzc.zzV()) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzg(zza2, view);
                    }
                } else {
                    com.google.android.gms.ads.internal.zzv.zzB().zzj(zza2, zzF);
                }
                this.zzc.zzat(this.zza);
                com.google.android.gms.ads.internal.zzv.zzB().zzk(zza2);
                this.zzc.zzd("onSdkLoaded", new androidx.collection.a());
            }
        }
    }
}
