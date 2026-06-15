package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzehe implements com.google.android.gms.ads.internal.zzg {
    private com.google.android.gms.ads.internal.zzg zza;

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        com.google.android.gms.ads.internal.zzg zzgVar = this.zza;
        if (zzgVar != null) {
            zzgVar.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.zzg zzgVar = this.zza;
        if (zzgVar != null) {
            zzgVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zzc() {
        com.google.android.gms.ads.internal.zzg zzgVar = this.zza;
        if (zzgVar != null) {
            zzgVar.zzc();
        }
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.zzg zzgVar) {
        this.zza = zzgVar;
    }
}
