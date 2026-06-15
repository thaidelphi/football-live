package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbar;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzewr implements zzexl {
    private final zzexl zza;
    private final zzexl zzb;
    private final zzfcy zzc;
    private final String zzd;
    private zzctl zze;
    private final Executor zzf;

    public zzewr(zzexl zzexlVar, zzexl zzexlVar2, zzfcy zzfcyVar, String str, Executor executor) {
        this.zza = zzexlVar;
        this.zzb = zzexlVar2;
        this.zzc = zzfcyVar;
        this.zzd = str;
        this.zzf = executor;
    }

    public static /* synthetic */ b6.a zzb(final zzewr zzewrVar, zzexm zzexmVar, zzewq zzewqVar, zzexk zzexkVar, zzctl zzctlVar, zzeww zzewwVar) {
        if (zzewwVar != null) {
            zzewq zzewqVar2 = new zzewq(zzewqVar.zza, zzewqVar.zzb, zzewqVar.zzc, zzewqVar.zzd, zzewqVar.zze, zzewqVar.zzf, zzewwVar.zza);
            if (zzewwVar.zzc != null) {
                zzewrVar.zze = null;
                zzewrVar.zzc.zzf(zzewqVar2);
                return zzewrVar.zzg(zzewwVar.zzc, zzexmVar);
            }
            b6.a zza = zzewrVar.zzc.zza(zzewqVar2);
            if (zza != null) {
                zzewrVar.zze = null;
                return zzgap.zzn(zza, new zzfzw() { // from class: com.google.android.gms.internal.ads.zzewn
                    @Override // com.google.android.gms.internal.ads.zzfzw
                    public final b6.a zza(Object obj) {
                        return zzewr.zze(zzewr.this, (zzfcv) obj);
                    }
                }, zzewrVar.zzf);
            }
            zzewrVar.zzc.zzf(zzewqVar2);
            zzexmVar = new zzexm(zzexmVar.zzb, zzewwVar.zzb);
        }
        b6.a zzb = ((zzexb) zzewrVar.zza).zzb(zzexmVar, zzexkVar, zzctlVar);
        zzewrVar.zze = zzctlVar;
        return zzb;
    }

    public static /* synthetic */ b6.a zze(zzewr zzewrVar, zzfcv zzfcvVar) {
        zzfcx zzfcxVar;
        if (zzfcvVar != null && zzfcvVar.zza != null && (zzfcxVar = zzfcvVar.zzb) != null) {
            zzbar.zzb.zzc zzd = zzbar.zzb.zzd();
            zzbar.zzb.zza.C0181zza zza = zzbar.zzb.zza.zza();
            zza.zzf(zzbar.zzb.zzd.IN_MEMORY);
            zza.zzh(zzbar.zzb.zze.zzi());
            zzd.zzd(zza);
            zzfcvVar.zza.zza.zzb().zzc().zzm(zzd.zzbr());
            return zzewrVar.zzg(zzfcvVar.zza, ((zzewq) zzfcxVar).zzb);
        }
        throw new zzduh(1, "Empty prefetch");
    }

    private final b6.a zzg(zzfcl zzfclVar, zzexm zzexmVar) {
        zzctl zzctlVar = zzfclVar.zza;
        this.zze = zzctlVar;
        if (zzfclVar.zzc != null) {
            if (zzctlVar.zzf() != null) {
                zzfclVar.zzc.zzo().zzl(zzfclVar.zza.zzf());
            }
            return zzgap.zzh(zzfclVar.zzc);
        }
        zzctlVar.zzb().zzk(zzfclVar.zzb);
        return ((zzexb) this.zza).zzb(zzexmVar, null, zzfclVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    /* renamed from: zza */
    public final synchronized zzctl zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final /* bridge */ /* synthetic */ b6.a zzc(zzexm zzexmVar, zzexk zzexkVar, Object obj) {
        return zzf(zzexmVar, zzexkVar, null);
    }

    public final synchronized b6.a zzf(final zzexm zzexmVar, final zzexk zzexkVar, zzctl zzctlVar) {
        zzctk zza = zzexkVar.zza(zzexmVar.zzb);
        zza.zza(new zzews(this.zzd));
        final zzctl zzctlVar2 = (zzctl) zza.zzh();
        zzctlVar2.zzg();
        zzctlVar2.zzg();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzctlVar2.zzg().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzfap zzg = zzctlVar2.zzg();
            final zzewq zzewqVar = new zzewq(zzexkVar, zzexmVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return (zzgag) zzgap.zzn(zzgag.zzu(((zzewx) this.zzb).zzb(zzexmVar, zzexkVar, zzctlVar2)), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzewo
                @Override // com.google.android.gms.internal.ads.zzfzw
                public final b6.a zza(Object obj) {
                    return zzewr.zzb(zzewr.this, zzexmVar, zzewqVar, zzexkVar, zzctlVar2, (zzeww) obj);
                }
            }, this.zzf);
        }
        this.zze = zzctlVar2;
        return ((zzexb) this.zza).zzb(zzexmVar, zzexkVar, zzctlVar2);
    }
}
