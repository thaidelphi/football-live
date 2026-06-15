package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzehh implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzddd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehh(zzehi zzehiVar, zzddd zzdddVar) {
        this.zza = zzdddVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
