package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzald implements zzacj {
    private final zzale zza = new zzale(null, 0, "audio/ac3");
    private final zzdx zzb = new zzdx(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        int zza = zzackVar.zza(this.zzb.zzN(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ zzacj zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final /* synthetic */ List zzd() {
        return zzfvv.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zze(zzacm zzacmVar) {
        this.zza.zzb(zzacmVar, new zzana(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzacmVar.zzG();
        zzacmVar.zzP(new zzadh(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        zzdx zzdxVar = new zzdx(10);
        int i10 = 0;
        while (true) {
            zzaby zzabyVar = (zzaby) zzackVar;
            zzabyVar.zzm(zzdxVar.zzN(), 0, 10, false);
            zzdxVar.zzL(0);
            if (zzdxVar.zzo() != 4801587) {
                break;
            }
            zzdxVar.zzM(3);
            int zzl = zzdxVar.zzl();
            i10 += zzl + 10;
            zzabyVar.zzl(zzl, false);
        }
        zzackVar.zzj();
        zzaby zzabyVar2 = (zzaby) zzackVar;
        zzabyVar2.zzl(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            zzabyVar2.zzm(zzdxVar.zzN(), 0, 6, false);
            zzdxVar.zzL(0);
            if (zzdxVar.zzq() != 2935) {
                zzackVar.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzabyVar2.zzl(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int zzb = zzabi.zzb(zzdxVar.zzN());
                if (zzb == -1) {
                    return false;
                }
                zzabyVar2.zzl(zzb - 6, false);
            }
        }
    }
}
