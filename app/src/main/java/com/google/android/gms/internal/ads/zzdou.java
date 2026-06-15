package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbar;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdou implements zzcxc, zzcvt, zzcui, zzcuz, com.google.android.gms.ads.internal.client.zza, zzczo {
    private final zzbak zza;
    private boolean zzb = false;

    public zzdou(zzbak zzbakVar, zzexp zzexpVar) {
        this.zza = zzbakVar;
        zzbakVar.zzc(2);
        if (zzexpVar != null) {
            zzbakVar.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
            return;
        }
        this.zza.zzc(7);
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdl(zzbud zzbudVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzdm(final zzfag zzfagVar) {
        this.zza.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzbaj
            public final void zza(zzbar.zzt.zza zzaVar) {
                zzbar.zza.zzb zzbM = zzaVar.zze().zzbM();
                zzbar.zzi.zza zzbM2 = zzaVar.zze().zzad().zzbM();
                zzbM2.zzo(zzfag.this.zzb.zzb.zzb);
                zzbM.zzT(zzbM2);
                zzaVar.zzG(zzbM);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcui
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzh() {
        this.zza.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzi(final zzbar.zzb zzbVar) {
        this.zza.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzbaj
            public final void zza(zzbar.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbar.zzb.this);
            }
        });
        this.zza.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzj(final zzbar.zzb zzbVar) {
        this.zza.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // com.google.android.gms.internal.ads.zzbaj
            public final void zza(zzbar.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbar.zzb.this);
            }
        });
        this.zza.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzl(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzm(final zzbar.zzb zzbVar) {
        this.zza.zzb(new zzbaj() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzbaj
            public final void zza(zzbar.zzt.zza zzaVar) {
                zzaVar.zzJ(zzbar.zzb.this);
            }
        });
        this.zza.zzc(IronSourceConstants.RV_CHECK_PLACEMENT_CAPPED);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzn(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final synchronized void zzr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzs() {
        this.zza.zzc(3);
    }
}
