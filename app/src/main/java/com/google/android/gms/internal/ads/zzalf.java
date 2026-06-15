package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalf implements zzacj {
    private final zzalg zza = new zzalg(null, 0, "audio/ac4");
    private final zzdx zzb = new zzdx(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        int zza = zzackVar.zza(this.zzb.zzN(), 0, 16384);
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
        int i10;
        zzdx zzdxVar = new zzdx(10);
        int i11 = 0;
        while (true) {
            zzaby zzabyVar = (zzaby) zzackVar;
            zzabyVar.zzm(zzdxVar.zzN(), 0, 10, false);
            zzdxVar.zzL(0);
            if (zzdxVar.zzo() != 4801587) {
                break;
            }
            zzdxVar.zzM(3);
            int zzl = zzdxVar.zzl();
            i11 += zzl + 10;
            zzabyVar.zzl(zzl, false);
        }
        zzackVar.zzj();
        zzaby zzabyVar2 = (zzaby) zzackVar;
        zzabyVar2.zzl(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzabyVar2.zzm(zzdxVar.zzN(), 0, 7, false);
            zzdxVar.zzL(0);
            int zzq = zzdxVar.zzq();
            if (zzq == 44096 || zzq == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] zzN = zzdxVar.zzN();
                int i15 = zzabm.zza;
                if (zzN.length < 7) {
                    i10 = -1;
                } else {
                    int i16 = ((zzN[2] & 255) << 8) | (zzN[3] & 255);
                    if (i16 == 65535) {
                        i16 = ((zzN[4] & 255) << 16) | ((zzN[5] & 255) << 8) | (zzN[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (zzq == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzabyVar2.zzl(i10 - 7, false);
            } else {
                zzackVar.zzj();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzabyVar2.zzl(i13, false);
                i12 = 0;
            }
        }
    }
}
