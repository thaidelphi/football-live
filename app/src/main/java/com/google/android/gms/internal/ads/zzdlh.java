package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zzdlh implements com.google.android.gms.ads.internal.client.zza, zzbhe, com.google.android.gms.ads.internal.overlay.zzr, zzbhg, com.google.android.gms.ads.internal.overlay.zzac {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbhe zzb;
    private com.google.android.gms.ads.internal.overlay.zzr zzc;
    private zzbhg zzd;
    private com.google.android.gms.ads.internal.overlay.zzac zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhe
    public final synchronized void zza(String str, Bundle bundle) {
        zzbhe zzbheVar = this.zzb;
        if (zzbheVar != null) {
            zzbheVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final synchronized void zzb(String str, String str2) {
        zzbhg zzbhgVar = this.zzd;
        if (zzbhgVar != null) {
            zzbhgVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdo() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdp();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i10) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzds(i10);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzac
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zze;
        if (zzacVar != null) {
            zzacVar.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhe zzbheVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbhg zzbhgVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar) {
        this.zza = zzaVar;
        this.zzb = zzbheVar;
        this.zzc = zzrVar;
        this.zzd = zzbhgVar;
        this.zze = zzacVar;
    }
}
