package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzall implements zzalm {
    private final List zza;
    private final zzadp[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzall(List list, String str) {
        this.zza = list;
        this.zzc = new zzadp[list.size()];
    }

    private final boolean zzf(zzdx zzdxVar, int i10) {
        if (zzdxVar.zzb() == 0) {
            return false;
        }
        if (zzdxVar.zzm() != i10) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(zzdx zzdxVar) {
        zzadp[] zzadpVarArr;
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzdxVar, 32)) {
                if (this.zze != 1 || zzf(zzdxVar, 0)) {
                    int zzd = zzdxVar.zzd();
                    int zzb = zzdxVar.zzb();
                    for (zzadp zzadpVar : this.zzc) {
                        zzdxVar.zzL(zzd);
                        zzadpVar.zzr(zzdxVar, zzb);
                    }
                    this.zzf += zzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(zzacm zzacmVar, zzana zzanaVar) {
        for (int i10 = 0; i10 < this.zzc.length; i10++) {
            zzamx zzamxVar = (zzamx) this.zza.get(i10);
            zzanaVar.zzc();
            zzadp zzw = zzacmVar.zzw(zzanaVar.zza(), 3);
            zzx zzxVar = new zzx();
            zzxVar.zzO(zzanaVar.zzb());
            zzxVar.zzE(this.zzb);
            zzxVar.zzad("application/dvbsubs");
            zzxVar.zzP(Collections.singletonList(zzamxVar.zzb));
            zzxVar.zzS(zzamxVar.zza);
            zzw.zzm(zzxVar.zzaj());
            this.zzc[i10] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzc(boolean z10) {
        if (this.zzd) {
            zzcv.zzf(this.zzg != -9223372036854775807L);
            for (zzadp zzadpVar : this.zzc) {
                zzadpVar.zzt(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j10;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zze() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }
}
