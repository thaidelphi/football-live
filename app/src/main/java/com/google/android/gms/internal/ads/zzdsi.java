package com.google.android.gms.internal.ads;

import com.ironsource.xn;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdsi extends zzbkp {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzffc zzd;
    final /* synthetic */ zzbyu zze;
    final /* synthetic */ zzdsj zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsi(zzdsj zzdsjVar, Object obj, String str, long j10, zzffc zzffcVar, zzbyu zzbyuVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzffcVar;
        this.zze = zzbyuVar;
        this.zzf = zzdsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zze(String str) {
        zzdqq zzdqqVar;
        zzdbd zzdbdVar;
        zzffq zzffqVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzv.zzC().b() - this.zzc));
            zzdqqVar = this.zzf.zzl;
            zzdqqVar.zzb(this.zzb, xn.a.f21422g);
            zzdbdVar = this.zzf.zzo;
            zzdbdVar.zzb(this.zzb, xn.a.f21422g);
            zzffqVar = this.zzf.zzp;
            zzffc zzffcVar = this.zzd;
            zzffcVar.zzc(str);
            zzffcVar.zzg(false);
            zzffqVar.zzc(zzffcVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zzf() {
        zzdqq zzdqqVar;
        zzdbd zzdbdVar;
        zzffq zzffqVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzv.zzC().b() - this.zzc));
            zzdqqVar = this.zzf.zzl;
            zzdqqVar.zzd(this.zzb);
            zzdbdVar = this.zzf.zzo;
            zzdbdVar.zzd(this.zzb);
            zzffqVar = this.zzf.zzp;
            zzffc zzffcVar = this.zzd;
            zzffcVar.zzg(true);
            zzffqVar.zzc(zzffcVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }
}
