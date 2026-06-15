package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class zzamh implements zzabt {
    private final zzee zza;
    private final zzdx zzb = new zzdx();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzamh(zzee zzeeVar, zzami zzamiVar) {
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzack zzackVar, long j10) throws IOException {
        int zzh;
        long j11;
        long zzf = zzackVar.zzf();
        int min = (int) Math.min(20000L, zzackVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzackVar.zzh(this.zzb.zzN(), 0, min);
        int i10 = -1;
        int i11 = -1;
        long j12 = -9223372036854775807L;
        while (true) {
            zzdx zzdxVar = this.zzb;
            if (zzdxVar.zzb() < 4) {
                return j12 != -9223372036854775807L ? zzabs.zzf(j12, zzf + i10) : zzabs.zza;
            } else if (zzamj.zzh(zzdxVar.zzN(), zzdxVar.zzd()) != 442) {
                zzdxVar.zzM(1);
            } else {
                zzdxVar.zzM(4);
                long zzc = zzamk.zzc(zzdxVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j10) {
                        if (j12 == -9223372036854775807L) {
                            return zzabs.zzd(zzb, zzf);
                        }
                        j11 = i11;
                    } else if (100000 + zzb > j10) {
                        j11 = zzdxVar.zzd();
                        break;
                    } else {
                        i11 = zzdxVar.zzd();
                        j12 = zzb;
                    }
                }
                int zze = zzdxVar.zze();
                if (zzdxVar.zzb() < 10) {
                    zzdxVar.zzL(zze);
                } else {
                    zzdxVar.zzM(9);
                    int zzm = zzdxVar.zzm() & 7;
                    if (zzdxVar.zzb() < zzm) {
                        zzdxVar.zzL(zze);
                    } else {
                        zzdxVar.zzM(zzm);
                        if (zzdxVar.zzb() < 4) {
                            zzdxVar.zzL(zze);
                        } else {
                            if (zzamj.zzh(zzdxVar.zzN(), zzdxVar.zzd()) == 443) {
                                zzdxVar.zzM(4);
                                int zzq = zzdxVar.zzq();
                                if (zzdxVar.zzb() < zzq) {
                                    zzdxVar.zzL(zze);
                                } else {
                                    zzdxVar.zzM(zzq);
                                }
                            }
                            while (true) {
                                if (zzdxVar.zzb() < 4 || (zzh = zzamj.zzh(zzdxVar.zzN(), zzdxVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzdxVar.zzM(4);
                                if (zzdxVar.zzb() < 2) {
                                    zzdxVar.zzL(zze);
                                    break;
                                }
                                zzdxVar.zzL(Math.min(zzdxVar.zze(), zzdxVar.zzd() + zzdxVar.zzq()));
                            }
                        }
                    }
                }
                i10 = zzdxVar.zzd();
            }
        }
        return zzabs.zze(zzf + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void zzb() {
        byte[] bArr = zzeh.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
