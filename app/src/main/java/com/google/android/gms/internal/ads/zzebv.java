package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzebv implements zzebm {
    private final Context zza;
    private final zzcms zzb;
    private final Executor zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebv(Context context, zzcms zzcmsVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcmsVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final /* bridge */ /* synthetic */ Object zza(zzfag zzfagVar, zzezu zzezuVar, final zzebj zzebjVar) throws zzfaw, zzeez {
        zzcmp zza = this.zzb.zza(new zzcqb(zzfagVar, zzezuVar, zzebjVar.zza), new zzddg(new zzdeo() { // from class: com.google.android.gms.internal.ads.zzebu
            @Override // com.google.android.gms.internal.ads.zzdeo
            public final void zza(boolean z10, Context context, zzcus zzcusVar) {
                zzebj zzebjVar2 = zzebj.this;
                try {
                    ((zzfbn) zzebjVar2.zzb).zzv(z10);
                    ((zzfbn) zzebjVar2.zzb).zzw(context);
                } catch (zzfaw e8) {
                    throw new zzden(e8.getCause());
                }
            }
        }, null), new zzcmq(zzezuVar.zzaa));
        zza.zzd().zzo(new zzcks((zzfbn) zzebjVar.zzb), this.zzc);
        ((zzecx) zzebjVar.zzc).zzc(zza.zzk());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final void zzb(zzfag zzfagVar, zzezu zzezuVar, zzebj zzebjVar) throws zzfaw {
        zzfap zzfapVar = zzfagVar.zza.zza;
        String jSONObject = zzezuVar.zzv.toString();
        ((zzfbn) zzebjVar.zzb).zzl(this.zza, zzfapVar.zzd, jSONObject, (zzboj) zzebjVar.zzc);
    }
}
