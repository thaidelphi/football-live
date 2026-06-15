package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzegm implements zzcvo {
    boolean zza = false;
    final /* synthetic */ zzebj zzb;
    final /* synthetic */ zzbyu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegm(zzegn zzegnVar, zzebj zzebjVar, zzbyu zzbyuVar) {
        this.zzb = zzebjVar;
        this.zzc = zzbyuVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzfv)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzebk(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final synchronized void zza(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzegn.zze(this.zzb.zza, i10), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final synchronized void zzc(int i10, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzegn.zze(this.zzb.zza, i10);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
