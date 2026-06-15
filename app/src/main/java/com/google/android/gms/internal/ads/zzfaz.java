package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzfaz implements zzgal {
    final /* synthetic */ zzcdq zza;
    final /* synthetic */ zzclc zzb;
    final /* synthetic */ zzfhp zzc;
    final /* synthetic */ zzdzu zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfaz(zzcdq zzcdqVar, zzclc zzclcVar, zzfhp zzfhpVar, zzdzu zzdzuVar) {
        this.zza = zzcdqVar;
        this.zzb = zzclcVar;
        this.zzc = zzfhpVar;
        this.zzd = zzdzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzezu zzD = this.zza.zzD();
        if (zzD != null && !zzD.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzD.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzjW)).booleanValue() && this.zzb != null && zzclc.zzj(str)) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zze(), zzvVar);
                return;
            } else {
                this.zzc.zzd(str, zzvVar, null);
                return;
            }
        }
        zzezx zzR = this.zza.zzR();
        if (zzR == null) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long a10 = com.google.android.gms.ads.internal.zzv.zzC().a();
        boolean zzA = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza.getContext());
        boolean z10 = false;
        boolean z11 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzge)).booleanValue() && zzD != null && zzD.zzS;
        if (zzD != null && zzD.zzad != null) {
            z10 = true;
        }
        this.zzd.zzd(new zzdzw(a10, zzR.zzb, str, (zzA || z11 || z10) ? 2 : 1));
    }
}
