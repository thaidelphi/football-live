package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzdlz {
    private final zzcud zza;
    private final zzcvm zzb;
    private final zzcvz zzc;
    private final zzcwl zzd;
    private final zzczb zze;
    private final zzdcc zzf;
    private final zzdqf zzg;
    private final zzfhp zzh;
    private final zzdzu zzi;
    private final zzclc zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlz(zzcud zzcudVar, zzcvm zzcvmVar, zzcvz zzcvzVar, zzcwl zzcwlVar, zzczb zzczbVar, zzdcc zzdccVar, zzdqf zzdqfVar, zzfhp zzfhpVar, zzdzu zzdzuVar, zzclc zzclcVar) {
        this.zza = zzcudVar;
        this.zzb = zzcvmVar;
        this.zzc = zzcvzVar;
        this.zzd = zzcwlVar;
        this.zze = zzczbVar;
        this.zzf = zzdccVar;
        this.zzg = zzdqfVar;
        this.zzh = zzfhpVar;
        this.zzi = zzdzuVar;
        this.zzj = zzclcVar;
    }

    public final void zza(zzdma zzdmaVar, zzcdq zzcdqVar) {
        zzdlx zzdlxVar;
        zzdlxVar = zzdmaVar.zza;
        final zzcvm zzcvmVar = this.zzb;
        Objects.requireNonNull(zzcvmVar);
        zzdlxVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzcvm.this.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzkc)).booleanValue() || zzcdqVar == null || zzcdqVar.zzN() == null) {
            return;
        }
        zzcfi zzN = zzcdqVar.zzN();
        zzN.zzK(this.zzj, this.zzi, this.zzh);
        zzN.zzM(this.zzj, this.zzi, this.zzg);
    }
}
