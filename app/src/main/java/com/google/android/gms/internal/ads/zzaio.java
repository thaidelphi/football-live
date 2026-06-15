package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzaio {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzdx zzg = new zzdx(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzack zzackVar, boolean z10) throws IOException {
        zza();
        this.zzg.zzI(27);
        if (zzacn.zzc(zzackVar, this.zzg.zzN(), 0, 27, z10) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z10) {
                    return false;
                }
                throw zzaz.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzI(zzm);
            if (zzacn.zzc(zzackVar, this.zzg.zzN(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    this.zzf[i10] = this.zzg.zzm();
                    this.zze += this.zzf[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzack zzackVar, long j10) throws IOException {
        int i10;
        zzcv.zzd(zzackVar.zzf() == zzackVar.zze());
        this.zzg.zzI(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || zzackVar.zzf() + 4 < j10) && zzacn.zzc(zzackVar, this.zzg.zzN(), 0, 4, true)) {
                this.zzg.zzL(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzackVar.zzj();
                    return true;
                }
                zzackVar.zzk(1);
            }
        }
        do {
            if (i10 != 0 && zzackVar.zzf() >= j10) {
                break;
            }
        } while (zzackVar.zzc(1) != -1);
        return false;
    }
}
