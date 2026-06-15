package com.google.android.gms.internal.ads;

import com.ironsource.j3;
import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-ads@@24.0.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
final class zzane implements zzanf {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, j3.a.b.f17903h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacm zzc;
    private final zzadp zzd;
    private final zzani zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzdx zzh;
    private final int zzi;
    private final zzz zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzane(zzacm zzacmVar, zzadp zzadpVar, zzani zzaniVar) throws zzaz {
        this.zzc = zzacmVar;
        this.zzd = zzadpVar;
        this.zze = zzaniVar;
        int max = Math.max(1, zzaniVar.zzc / 10);
        this.zzi = max;
        zzdx zzdxVar = new zzdx(zzaniVar.zzf);
        zzdxVar.zzk();
        int zzk = zzdxVar.zzk();
        this.zzf = zzk;
        int i10 = zzaniVar.zzb;
        int i11 = zzaniVar.zzd;
        int i12 = (((i11 - (i10 * 4)) * 8) / (zzaniVar.zze * i10)) + 1;
        if (zzk == i12) {
            int i13 = zzeh.zza;
            int i14 = ((max + zzk) - 1) / zzk;
            this.zzg = new byte[i11 * i14];
            this.zzh = new zzdx(i14 * (zzk + zzk) * i10);
            int i15 = ((zzaniVar.zzc * zzaniVar.zzd) * 8) / zzk;
            zzx zzxVar = new zzx();
            zzxVar.zzad("audio/raw");
            zzxVar.zzA(i15);
            zzxVar.zzY(i15);
            zzxVar.zzT((max + max) * i10);
            zzxVar.zzB(zzaniVar.zzb);
            zzxVar.zzae(zzaniVar.zzc);
            zzxVar.zzX(2);
            this.zzj = zzxVar.zzaj();
            return;
        }
        throw zzaz.zza("Expected frames per block: " + i12 + "; got: " + zzk, null);
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long zzu = this.zzl + zzeh.zzu(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int zze = zze(i10);
        this.zzd.zzt(zzu, 1, zze, this.zzm - zze, null);
        this.zzn += i10;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzanf
    public final void zza(int i10, long j10) {
        zzanl zzanlVar = new zzanl(this.zze, this.zzf, i10, j10);
        this.zzc.zzP(zzanlVar);
        this.zzd.zzm(this.zzj);
        this.zzd.zzl(zzanlVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzanf
    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzanf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzack r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzane.zzc(com.google.android.gms.internal.ads.zzack, long):boolean");
    }
}
