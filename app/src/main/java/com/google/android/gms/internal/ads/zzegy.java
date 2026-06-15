package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzegy implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzbyu zza;
    final /* synthetic */ zzfag zzb;
    final /* synthetic */ zzezu zzc;
    final /* synthetic */ zzehe zzd;
    final /* synthetic */ zzegz zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegy(zzegz zzegzVar, zzbyu zzbyuVar, zzfag zzfagVar, zzezu zzezuVar, zzehe zzeheVar) {
        this.zza = zzbyuVar;
        this.zzb = zzfagVar;
        this.zzc = zzezuVar;
        this.zzd = zzeheVar;
        this.zze = zzegzVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzehi zzehiVar;
        zzehe zzeheVar = this.zzd;
        zzehiVar = this.zze.zzd;
        this.zza.zzc(zzehiVar.zza(this.zzb, this.zzc, view, zzeheVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
