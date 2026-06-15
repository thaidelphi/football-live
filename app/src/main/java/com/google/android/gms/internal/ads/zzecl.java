package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzecl implements zzebm {
    private final Context zza;
    private final zzcoi zzb;
    private final Executor zzc;

    public zzecl(Context context, zzcoi zzcoiVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcoiVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, final zzezu zzezuVar, zzebj zzebjVar) throws zzfaw, zzeez {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhM)).booleanValue() && zzezuVar.zzag) {
            zzbom zzc = ((zzfbn) zzebjVar.zzb).zzc();
            if (zzc != null) {
                try {
                    zza = (View) ObjectWrapper.t0(zzc.zze());
                    boolean zzf = zzc.zzf();
                    if (zza == null) {
                        throw new zzfaw(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (zzf) {
                        try {
                            zza = (View) zzgap.zzn(zzgap.zzh(null), new zzfzw() { // from class: com.google.android.gms.internal.ads.zzecj
                                @Override // com.google.android.gms.internal.ads.zzfzw
                                public final b6.a zza(Object obj) {
                                    b6.a zzh;
                                    zzh = zzgap.zzh(zzcox.zza(zzecl.this.zza, zza, zzezuVar));
                                    return zzh;
                                }
                            }, zzbyp.zzf).get();
                        } catch (InterruptedException | ExecutionException e8) {
                            throw new zzfaw(e8);
                        }
                    }
                } catch (RemoteException e10) {
                    throw new zzfaw(e10);
                }
            } else {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfaw(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            zza = ((zzfbn) zzebjVar.zzb).zza();
        }
        zzcoi zzcoiVar = this.zzb;
        zzcqb zzcqbVar = new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza);
        final zzfbn zzfbnVar = (zzfbn) zzebjVar.zzb;
        Objects.requireNonNull(zzfbnVar);
        zzcnf zza2 = zzcoiVar.zza(zzcqbVar, new zzcnl(zza, null, new zzcpj() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // com.google.android.gms.internal.ads.zzcpj
            public final com.google.android.gms.ads.internal.client.zzea zza() {
                return zzfbn.this.zzb();
            }
        }, (zzezv) zzezuVar.zzu.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcks((zzfbn) zzebjVar.zzb), this.zzc);
        ((zzecx) zzebjVar.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        com.google.android.gms.ads.internal.client.zzr zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfagVar.zza.zza.zze;
        if (zzrVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzd(zzrVar.zze, zzrVar.zzb));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhM)).booleanValue() && zzezuVar.zzag) {
                zza = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zze(zzrVar.zze, zzrVar.zzb));
            } else {
                zza = zzfav.zza(this.zza, zzezuVar.zzu);
            }
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbbm.zzhM)).booleanValue() && zzezuVar.zzag) {
            Object obj = zzebjVar.zzb;
            ((zzfbn) obj).zzn(this.zza, zzrVar2, zzfagVar.zza.zza.zzd, zzezuVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzezuVar.zzs), (zzboj) zzebjVar.zzc);
            return;
        }
        Object obj2 = zzebjVar.zzb;
        ((zzfbn) obj2).zzm(this.zza, zzrVar2, zzfagVar.zza.zza.zzd, zzezuVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzezuVar.zzs), (zzboj) zzebjVar.zzc);
    }
}
