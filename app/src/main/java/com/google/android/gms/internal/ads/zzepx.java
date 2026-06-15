package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzepx implements zzerv {
    public final zzezt zza;

    public zzepx(zzezt zzeztVar) {
        this.zza = zzeztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzerv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcth zzcthVar = (zzcth) obj;
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzlQ)).booleanValue()) {
                return;
            }
            zzcthVar.zza.putBoolean("render_in_browser", this.zza.zzd());
            zzcthVar.zza.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
