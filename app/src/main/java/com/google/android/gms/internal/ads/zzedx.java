package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzedx implements zzebm {
    private final Context zza;
    private final zzdfc zzb;
    private final Executor zzc;

    public zzedx(Context context, zzdfc zzdfcVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdfcVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfag zzfagVar, int i10) {
        return zzfagVar.zza.zza.zzg.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw, zzeez {
        zzdgr zzah;
        zzboo zzD = ((zzfbn) zzebjVar.zzb).zzD();
        zzbop zzE = ((zzfbn) zzebjVar.zzb).zzE();
        zzbos zzd = ((zzfbn) zzebjVar.zzb).zzd();
        if (zzd != null && zzc(zzfagVar, 6)) {
            zzah = zzdgr.zzt(zzd);
        } else if (zzD != null && zzc(zzfagVar, 6)) {
            zzah = zzdgr.zzai(zzD);
        } else if (zzD != null && zzc(zzfagVar, 2)) {
            zzah = zzdgr.zzag(zzD);
        } else if (zzE != null && zzc(zzfagVar, 6)) {
            zzah = zzdgr.zzaj(zzE);
        } else if (zzE != null && zzc(zzfagVar, 1)) {
            zzah = zzdgr.zzah(zzE);
        } else {
            throw new zzeez(1, "No native ad mappers");
        }
        if (zzah != null) {
            zzfap zzfapVar = zzfagVar.zza.zza;
            if (zzfapVar.zzg.contains(Integer.toString(zzah.zzc()))) {
                zzdgt zze = this.zzb.zze(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzdhd(zzah), new zzdiw(zzE, zzD, zzd));
                ((zzecx) zzebjVar.zzc).zzc(zze.zzk());
                zze.zzd().zzo(new zzcks((zzfbn) zzebjVar.zzb), this.zzc);
                return zze.zza();
            }
        }
        throw new zzeez(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        zzfbn zzfbnVar = (zzfbn) zzebjVar.zzb;
        zzfap zzfapVar = zzfagVar.zza.zza;
        zzfap zzfapVar2 = zzfagVar.zza.zza;
        Context context = this.zza;
        zzben zzbenVar = zzfapVar2.zzi;
        ArrayList arrayList = zzfapVar2.zzg;
        zzfbnVar.zzp(context, zzfapVar.zzd, zzezuVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzezuVar.zzs), (zzboj) zzebjVar.zzc, zzbenVar, arrayList);
    }
}
