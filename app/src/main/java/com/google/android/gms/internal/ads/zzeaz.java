package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzeaz {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzezu zzc;
    private final zzcdq zzd;
    private final zzdqf zze;
    private zzfjg zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeaz(Context context, VersionInfoParcel versionInfoParcel, zzezu zzezuVar, zzcdq zzcdqVar, zzdqf zzdqfVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzezuVar;
        this.zzd = zzcdqVar;
        this.zze = zzdqfVar;
    }

    public final synchronized void zza(View view) {
        zzfjg zzfjgVar = this.zzf;
        if (zzfjgVar != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzh(zzfjgVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcdq zzcdqVar;
        if (this.zzf == null || (zzcdqVar = this.zzd) == null) {
            return;
        }
        zzcdqVar.zzd("onSdkImpression", zzfvy.zzd());
    }

    public final synchronized void zzc() {
        zzcdq zzcdqVar;
        zzfjg zzfjgVar = this.zzf;
        if (zzfjgVar == null || (zzcdqVar = this.zzd) == null) {
            return;
        }
        for (View view : zzcdqVar.zzV()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzh(zzfjgVar, view);
        }
        this.zzd.zzd("onSdkLoaded", zzfvy.zzd());
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z10) {
        if (this.zzc.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfg)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfj)).booleanValue() && this.zzd != null) {
                    if (this.zzf != null) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zza)) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to initialize omid.");
                        return false;
                    } else if (this.zzc.zzV.zzb()) {
                        zzfjg zze = com.google.android.gms.ads.internal.zzv.zzB().zze(this.zzb, this.zzd.zzG(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfk)).booleanValue()) {
                            zzdqf zzdqfVar = this.zze;
                            String str = zze != null ? "1" : "0";
                            zzdqe zza = zzdqfVar.zza();
                            zza.zzb("omid_js_session_success", str);
                            zza.zzj();
                        }
                        if (zze == null) {
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Created omid javascript session service.");
                        this.zzf = zze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzceh zzcehVar) {
        zzfjg zzfjgVar = this.zzf;
        if (zzfjgVar == null || this.zzd == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzm(zzfjgVar, zzcehVar);
        this.zzf = null;
        this.zzd.zzas(null);
    }
}
