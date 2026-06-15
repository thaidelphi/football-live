package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzbnh implements zzbyw {
    final /* synthetic */ zzbyu zza;
    final /* synthetic */ zzbml zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnh(zzbnj zzbnjVar, zzbyu zzbyuVar, zzbml zzbmlVar) {
        this.zza = zzbyuVar;
        this.zzb = zzbmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbmu("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
