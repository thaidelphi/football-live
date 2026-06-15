package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamq {
    private final List zza;
    private final zzadp[] zzc;
    private final String zzb = "video/mp2t";
    private final zzfh zzd = new zzfh(new zzfg() { // from class: com.google.android.gms.internal.ads.zzamp
        @Override // com.google.android.gms.internal.ads.zzfg
        public final void zza(long j10, zzdx zzdxVar) {
            zzabv.zza(j10, zzdxVar, zzamq.this.zzc);
        }
    });

    public zzamq(List list, String str) {
        this.zza = list;
        this.zzc = new zzadp[list.size()];
    }

    public final void zzb() {
        this.zzd.zzd();
    }

    public final void zzc(long j10, zzdx zzdxVar) {
        this.zzd.zzb(j10, zzdxVar);
    }

    public final void zzd(zzacm zzacmVar, zzana zzanaVar) {
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
            String str2 = zzzVar.zza;
            if (str2 == null) {
                str2 = zzanaVar.zzb();
            }
            zzx zzxVar = new zzx();
            zzxVar.zzO(str2);
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

    public final void zze() {
        this.zzd.zzd();
    }

    public final void zzf(int i10) {
        this.zzd.zze(i10);
    }
}
