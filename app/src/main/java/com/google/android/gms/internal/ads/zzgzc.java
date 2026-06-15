package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzgzc extends zzgza {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgza
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzgwk zzgwkVar = (zzgwk) obj;
        zzgzb zzgzbVar = zzgwkVar.zzt;
        if (zzgzbVar == zzgzb.zzc()) {
            zzgzb zzf = zzgzb.zzf();
            zzgwkVar.zzt = zzf;
            return zzf;
        }
        return zzgzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final /* synthetic */ Object zzb() {
        return zzgzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final /* synthetic */ Object zzc(Object obj) {
        zzgzb zzgzbVar = (zzgzb) obj;
        zzgzbVar.zzh();
        return zzgzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, int i11) {
        ((zzgzb) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final /* bridge */ /* synthetic */ void zze(Object obj, int i10, long j10) {
        ((zzgzb) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, Object obj2) {
        ((zzgzb) obj).zzj((i10 << 3) | 3, (zzgzb) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    final /* bridge */ /* synthetic */ void zzg(Object obj, int i10, zzgvc zzgvcVar) {
        ((zzgzb) obj).zzj((i10 << 3) | 2, zzgvcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgza
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, long j10) {
        ((zzgzb) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgza
    public final void zzi(Object obj) {
        ((zzgwk) obj).zzt.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgza
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzgwk) obj).zzt = (zzgzb) obj2;
    }
}
