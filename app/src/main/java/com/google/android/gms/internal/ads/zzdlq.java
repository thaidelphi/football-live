package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlq {
    private final zzcud zza;
    private final zzcvm zzb;
    private final zzcvz zzc;
    private final zzcwl zzd;
    private final zzczb zze;
    private final zzezu zzf;
    private final zzezx zzg;
    private final zzclc zzh;

    public zzdlq(zzcud zzcudVar, zzcvm zzcvmVar, zzcvz zzcvzVar, zzcwl zzcwlVar, zzczb zzczbVar, zzezu zzezuVar, zzezx zzezxVar, zzclc zzclcVar) {
        this.zza = zzcudVar;
        this.zzb = zzcvmVar;
        this.zzc = zzcvzVar;
        this.zzd = zzcwlVar;
        this.zze = zzczbVar;
        this.zzf = zzezuVar;
        this.zzg = zzezxVar;
        this.zzh = zzclcVar;
    }

    public final void zza(zzdlu zzdluVar) {
        zzdlh zzdlhVar;
        final zzcvm zzcvmVar = this.zzb;
        zzdlhVar = zzdluVar.zza;
        Objects.requireNonNull(zzcvmVar);
        zzdlhVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzcvm.this.zzb();
            }
        });
        zzdluVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
