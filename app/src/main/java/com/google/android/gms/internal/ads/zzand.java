package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzand {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzadp[] zzc;

    public zzand(List list, String str) {
        this.zza = list;
        this.zzc = new zzadp[list.size()];
    }

    public final void zza(long j10, zzdx zzdxVar) {
        if (zzdxVar.zzb() < 9) {
            return;
        }
        int zzg = zzdxVar.zzg();
        int zzg2 = zzdxVar.zzg();
        int zzm = zzdxVar.zzm();
        if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
            zzabv.zzb(j10, zzdxVar, this.zzc);
        }
    }

    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        for (int i10 = 0; i10 < this.zzc.length; i10++) {
            zzanaVar.zzc();
            zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 3);
            zzz zzzVar = (zzz) this.zza.get(i10);
            String str = zzzVar.zzo;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            zzcv.zze(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzx zzxVar = new zzx();
            zzxVar.zzO(zzanaVar.zzb());
            zzxVar.zzE(this.zzb);
            zzxVar.zzad(str);
            zzxVar.zzaf(zzzVar.zze);
            zzxVar.zzS(zzzVar.zzd);
            zzxVar.zzz(zzzVar.zzJ);
            zzxVar.zzP(zzzVar.zzr);
            zzw.zzm(zzxVar.zzaj());
            this.zzc[i10] = zzw;
        }
    }
}
