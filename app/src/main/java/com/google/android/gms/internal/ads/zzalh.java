package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzalh implements zzacj {
    private final zzali zza;
    private final zzdx zzb;
    private final zzdx zzc;
    private final zzdw zzd;
    private zzacm zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzalh() {
        throw null;
    }

    public zzalh(int i10) {
        this.zza = new zzali(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzdx((int) com.ironsource.mediationsdk.metadata.a.f18931n);
        this.zzg = -1L;
        zzdx zzdxVar = new zzdx(10);
        this.zzc = zzdxVar;
        byte[] zzN = zzdxVar.zzN();
        this.zzd = new zzdw(zzN, zzN.length);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final int zzb(zzack zzackVar, zzadf zzadfVar) throws IOException {
        zzcv.zzb(this.zze);
        int zza = zzackVar.zza(this.zzb.zzN(), 0, com.ironsource.mediationsdk.metadata.a.f18931n);
        if (!this.zzi) {
            this.zze.zzP(new zzadh(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
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
        this.zze = zzacmVar;
        this.zza.zzb(zzacmVar, new zzana(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzacmVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final void zzf(long j10, long j11) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    public final boolean zzi(zzack zzackVar) throws IOException {
        int i10 = 0;
        while (true) {
            zzaby zzabyVar = (zzaby) zzackVar;
            zzabyVar.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int zzl = this.zzc.zzl();
            i10 += zzl + 10;
            zzabyVar.zzl(zzl, false);
        }
        zzackVar.zzj();
        zzaby zzabyVar2 = (zzaby) zzackVar;
        zzabyVar2.zzl(i10, false);
        if (this.zzg == -1) {
            this.zzg = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzabyVar2.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (zzali.zzf(this.zzc.zzq())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzabyVar2.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int zzd = this.zzd.zzd(13);
                if (zzd <= 6) {
                    i13++;
                    zzackVar.zzj();
                    zzabyVar2.zzl(i13, false);
                } else {
                    zzabyVar2.zzl(zzd - 6, false);
                    i12 += zzd;
                }
            } else {
                i13++;
                zzackVar.zzj();
                zzabyVar2.zzl(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }
}
