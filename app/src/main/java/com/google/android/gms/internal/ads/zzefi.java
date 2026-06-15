package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzefi implements zzebm {
    private final Context zza;
    private final Executor zzb;
    private final zzdmo zzc;

    public zzefi(Context context, Executor executor, zzdmo zzdmoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, final zzebj zzebjVar) throws zzfaw, zzeez {
        zzdmk zze = this.zzc.zze(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzdml(new zzdeo() { // from class: com.google.android.gms.internal.ads.zzefh
            @Override // com.google.android.gms.internal.ads.zzdeo
            public final void zza(boolean z10, Context context, zzcus zzcusVar) {
                zzebj zzebjVar2 = zzebj.this;
                try {
                    ((zzfbn) zzebjVar2.zzb).zzv(z10);
                    ((zzfbn) zzebjVar2.zzb).zzz(context);
                } catch (zzfaw e8) {
                    throw new zzden(e8.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcks((zzfbn) zzebjVar.zzb), this.zzb);
        ((zzecx) zzebjVar.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        try {
            zzfap zzfapVar = zzfagVar.zza.zza;
            if (zzfapVar.zzo.zza == 3) {
                ((zzfbn) zzebjVar.zzb).zzr(this.zza, zzfapVar.zzd, zzezuVar.zzv.toString(), (zzboj) zzebjVar.zzc);
            } else {
                ((zzfbn) zzebjVar.zzb).zzq(this.zza, zzfapVar.zzd, zzezuVar.zzv.toString(), (zzboj) zzebjVar.zzc);
            }
        } catch (Exception e8) {
            String str = zzebjVar.zza;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(str)), e8);
        }
    }
}
