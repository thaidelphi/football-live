package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzbno {
    private final zzbmr zza;
    private b6.a zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbno(zzbmr zzbmrVar) {
        this.zza = zzbmrVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzbyu zzbyuVar = new zzbyu();
            this.zzb = zzbyuVar;
            this.zza.zzb(null).zzj(new zzbyy() { // from class: com.google.android.gms.internal.ads.zzbnl
                @Override // com.google.android.gms.internal.ads.zzbyy
                public final void zza(Object obj) {
                    zzbyu.this.zzc((zzbms) obj);
                }
            }, new zzbyw() { // from class: com.google.android.gms.internal.ads.zzbnm
                @Override // com.google.android.gms.internal.ads.zzbyw
                public final void zza() {
                    zzbyu.this.zzd(new zzbmu("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbnr zza(String str, zzbmy zzbmyVar, zzbmx zzbmxVar) {
        zzd();
        return new zzbnr(this.zzb, "google.afma.activeView.handleUpdate", zzbmyVar, zzbmxVar);
    }

    public final void zzb(final String str, final zzbio zzbioVar) {
        zzd();
        this.zzb = zzgap.zzn(this.zzb, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzbnn
            @Override // com.google.android.gms.internal.ads.zzfzw
            public final b6.a zza(Object obj) {
                zzbms zzbmsVar = (zzbms) obj;
                zzbmsVar.zzq(str, zzbioVar);
                return zzgap.zzh(zzbmsVar);
            }
        }, zzbyp.zzg);
    }

    public final void zzc(final String str, final zzbio zzbioVar) {
        this.zzb = zzgap.zzm(this.zzb, new zzfsk() { // from class: com.google.android.gms.internal.ads.zzbnk
            @Override // com.google.android.gms.internal.ads.zzfsk
            public final Object apply(Object obj) {
                zzbms zzbmsVar = (zzbms) obj;
                zzbmsVar.zzr(str, zzbioVar);
                return zzbmsVar;
            }
        }, zzbyp.zzg);
    }
}
