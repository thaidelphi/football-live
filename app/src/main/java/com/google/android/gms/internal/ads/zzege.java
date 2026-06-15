package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzege implements zzebm {
    private final Context zza;
    private final Executor zzb;
    private final zzdmo zzc;

    public zzege(Context context, Executor executor, zzdmo zzdmoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmoVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzege zzegeVar) {
        return zzegeVar.zzb;
    }

    public static final void zze(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) {
        try {
            ((zzfbn) zzebjVar.zzb).zzk(zzfagVar.zza.zza.zzd, zzezuVar.zzv.toString());
        } catch (Exception e8) {
            String str = zzebjVar.zza;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(str)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, final zzebj zzebjVar) throws zzfaw, zzeez {
        zzdmk zze = this.zzc.zze(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzdml(new zzdeo() { // from class: com.google.android.gms.internal.ads.zzega
            @Override // com.google.android.gms.internal.ads.zzdeo
            public final void zza(boolean z10, Context context, zzcus zzcusVar) {
                zzebj zzebjVar2 = zzebj.this;
                try {
                    ((zzfbn) zzebjVar2.zzb).zzv(z10);
                    ((zzfbn) zzebjVar2.zzb).zzA();
                } catch (zzfaw e8) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot show rewarded video.", e8);
                    throw new zzden(e8.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcks((zzfbn) zzebjVar.zzb), this.zzb);
        zzcvm zze2 = zze.zze();
        zzcud zzb = zze.zzb();
        ((zzecy) zzebjVar.zzc).zzc(new zzegd(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        if (!((zzfbn) zzebjVar.zzb).zzC()) {
            ((zzecy) zzebjVar.zzc).zzd(new zzegc(this, zzfagVar, zzezuVar, zzebjVar));
            Object obj = zzebjVar.zzb;
            Context context = this.zza;
            zzfap zzfapVar = zzfagVar.zza.zza;
            String jSONObject = zzezuVar.zzv.toString();
            ((zzfbn) obj).zzh(context, zzfapVar.zzd, null, (zzbva) zzebjVar.zzc, jSONObject);
            return;
        }
        zze(zzfagVar, zzezuVar, zzebjVar);
    }
}
