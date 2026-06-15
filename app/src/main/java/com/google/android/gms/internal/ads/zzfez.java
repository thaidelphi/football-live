package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzfez implements zzdbj, zzcuv, zzdbn {
    private final zzffn zza;
    private final zzffc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfez(Context context, zzffn zzffnVar) {
        this.zza = zzffnVar;
        this.zzb = zzffb.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbn
    public final void zzb() {
        if (((Boolean) zzbdf.zzd.zze()).booleanValue()) {
            zzffn zzffnVar = this.zza;
            zzffc zzffcVar = this.zzb;
            zzffcVar.zzg(true);
            zzffnVar.zza(zzffcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    public final void zzl() {
        if (((Boolean) zzbdf.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcuv
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdf.zzd.zze()).booleanValue()) {
            zzffn zzffnVar = this.zza;
            zzffc zzffcVar = this.zzb;
            zzffcVar.zzc(zzeVar.zza().toString());
            zzffcVar.zzg(false);
            zzffnVar.zza(zzffcVar);
        }
    }
}
