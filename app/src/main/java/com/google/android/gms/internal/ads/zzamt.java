package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzamt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzee zza = new zzee(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzdx zzb = new zzdx();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamt(int i10) {
    }

    private final int zze(zzack zzackVar) {
        byte[] bArr = zzeh.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzackVar.zzj();
        return 0;
    }

    public final int zza(zzack zzackVar, zzadf zzadfVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzackVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzackVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j11 = zzd - min;
            if (zzackVar.zzf() == j11) {
                this.zzb.zzI(min);
                zzackVar.zzj();
                zzackVar.zzh(this.zzb.zzN(), 0, min);
                zzdx zzdxVar = this.zzb;
                int zzd2 = zzdxVar.zzd();
                int zze = zzdxVar.zze();
                int i11 = zze - 188;
                while (true) {
                    if (i11 < zzd2) {
                        break;
                    }
                    byte[] zzN = zzdxVar.zzN();
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < zzd2 || i14 >= zze || zzN[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long zzb = zzanc.zzb(zzdxVar, i11, i10);
                                if (zzb != -9223372036854775807L) {
                                    j10 = zzb;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                this.zzg = j10;
                this.zze = true;
                return 0;
            }
            zzadfVar.zza = j11;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzackVar);
            return 0;
        } else if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zze(zzackVar);
                return 0;
            }
            zzee zzeeVar = this.zza;
            this.zzh = zzeeVar.zzc(this.zzg) - zzeeVar.zzb(j12);
            zze(zzackVar);
            return 0;
        } else {
            int min2 = (int) Math.min(112800L, zzackVar.zzd());
            if (zzackVar.zzf() == 0) {
                this.zzb.zzI(min2);
                zzackVar.zzj();
                zzackVar.zzh(this.zzb.zzN(), 0, min2);
                zzdx zzdxVar2 = this.zzb;
                int zzd3 = zzdxVar2.zzd();
                int zze2 = zzdxVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzdxVar2.zzN()[zzd3] == 71) {
                        long zzb2 = zzanc.zzb(zzdxVar2, zzd3, i10);
                        if (zzb2 != -9223372036854775807L) {
                            j10 = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j10;
                this.zzd = true;
                return 0;
            }
            zzadfVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
