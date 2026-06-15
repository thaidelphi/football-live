package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzegd extends zzbuz {
    final /* synthetic */ zzcwl zza;
    final /* synthetic */ zzcud zzb;
    final /* synthetic */ zzcvm zzc;
    final /* synthetic */ zzdcn zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegd(zzege zzegeVar, zzcwl zzcwlVar, zzcud zzcudVar, zzcvm zzcvmVar, zzdcn zzdcnVar) {
        this.zza = zzcwlVar;
        this.zzb = zzcudVar;
        this.zzc = zzcvmVar;
        this.zzd = zzdcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzds(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzg(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzm(IObjectWrapper iObjectWrapper, zzbvb zzbvbVar) {
        this.zzd.zza(zzbvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzd.zza(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbva
    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
