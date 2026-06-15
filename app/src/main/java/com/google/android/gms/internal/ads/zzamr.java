package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzamr implements zzabt {
    private final zzee zza;
    private final zzdx zzb = new zzdx();
    private final int zzc;

    public zzamr(int i10, zzee zzeeVar, int i11) {
        this.zzc = i10;
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzack zzackVar, long j10) throws IOException {
        int zza;
        int zza2;
        long zzf = zzackVar.zzf();
        int min = (int) Math.min(112800L, zzackVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzackVar.zzh(this.zzb.zzN(), 0, min);
        zzdx zzdxVar = this.zzb;
        int zze = zzdxVar.zze();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzdxVar.zzb() >= 188 && (zza2 = (zza = zzanc.zza(zzdxVar.zzN(), zzdxVar.zzd(), zze)) + 188) <= zze) {
            long zzb = zzanc.zzb(zzdxVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 <= j10) {
                    j13 = zza;
                    if (100000 + zzb2 <= j10) {
                        j12 = zzb2;
                    }
                } else if (j12 == -9223372036854775807L) {
                    return zzabs.zzd(zzb2, zzf);
                }
                return zzabs.zze(zzf + j13);
            }
            zzdxVar.zzL(zza2);
            j11 = zza2;
        }
        return j12 != -9223372036854775807L ? zzabs.zzf(j12, zzf + j11) : zzabs.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void zzb() {
        byte[] bArr = zzeh.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
